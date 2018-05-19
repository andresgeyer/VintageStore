package com.example.andre.vintagestore;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    android.support.v4.app.Fragment fragment;
    public boolean pantalla = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicializo las variables para el carrito de compra y precio de la venta
        LinearLayout contenedor = (LinearLayout) findViewById(R.id.layoutcarrito);
        TextView precio = (TextView) findViewById(R.id.textView15);
        // Restauro los datos almacenados.
        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            // si isVisible es verdadero restauro los datos
            //Si isVisible es falso se usa entonces el default layout
            // false or missing from the bundle, use the default layout.
            if (isVisible) {
                contenedor.setVisibility(View.VISIBLE);
                precio.setVisibility(View.VISIBLE);
                String[] compras = savedInstanceState.getString("carrito").split(":");
                for (int i = 0; i < compras.length; i++) {
                    TextView producto = new TextView(getApplicationContext());
                    producto.setText(compras[i]);
                    producto.setTextColor(WHITE);
                    producto.setTextSize(26);
                    contenedor.addView(producto);
                }
                precio.setText(savedInstanceState.getString("precio"));
            }
        }
    }


    /**
     * El método me permite guardar los elementos que hay en el carrito y el precio de la compra
     * para no perderlos al momento de cambiar la orientación de la pantalla
     *
     * @param outState
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LinearLayout contenedor = (LinearLayout) findViewById(R.id.layoutcarrito);
        String datos = "";
        for(int i=0;i<contenedor.getChildCount();i++)
            datos = datos+((TextView) contenedor.getChildAt(i)).getText().toString()+":";
        outState.putBoolean("reply_visible", true);
        outState.putString("carrito", datos);
        outState.putString("precio", ((TextView) findViewById(R.id.textView15)).getText().toString());
    }

    /**
     * Este método se encarga de permitirle al usuario enviar desde su cuenta de correo a mi
     * correo andresgeyer90@gmail.com sus sugerencias.
     *
     * @param view
     */
    public void enviarCorreo(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","andresgeyer90@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "-Sugerencia- Vintage Store");
        startActivity(Intent.createChooser(emailIntent,  "Redacte su sugerencia: "));
    }

    /**
     * Permite iniciar la actividad Main2Activity
     * @param view
     */
    public void launchSecondActivity(View view) {
        //Método usado para iniciar la segunda actividad al pulsar el boton de comprar
        Intent intent = new Intent (this, Main2Activity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    /**
     * Permite obtener los datos que ha enviado la activity Main2Activity y usarlos de forma
     * lógica según el contexto del programa
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    public void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(Main2Activity.EXTRA_REPLY);
                float precio = Float.parseFloat(reply.split("-")[1]);
                precio = precio + Float.parseFloat(((TextView) findViewById(R.id.textView15)).getText().toString().split(":")[1]);
                ((TextView) findViewById(R.id.textView15)).setText("A pagar $: "+String.valueOf(precio));
                LinearLayout contenedor = (LinearLayout) findViewById(R.id.layoutcarrito);
                TextView producto = new TextView(getApplicationContext());
                producto.setText("° "+reply+"$");
                producto.setTextColor(WHITE);
                producto.setTextSize(26);
                contenedor.addView(producto);
                hacerToast("Producto agregado al carrito");
            }
        }
    }

    /**
     * El String mensaje contiene las cadenas de caracteres deseadas a desplegar en un toast
     * que el método crea.
     *
     * @param mensaje
     */
    public void hacerToast(String mensaje){
        Toast toast1 = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.CENTER, 0, 0);
        toast1.show();
    }

    /**
     * Este método se encarga de enviar un SMS a mi celular 04242762568 para informarme que se
     * ha realizado una compra.
     *
     * @param view
     */
    public void comprar(View view){
        int permissionCheck = ContextCompat.checkSelfPermission(
                this, Manifest.permission.SEND_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            hacerToast("La APP no tiene permiso para enviar SMS");
            vaciarCarrito(view);
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 225);
        } else {
            String precio = (((TextView) findViewById(R.id.textView15)).getText().toString().split(":")[1]);
            if (Float.parseFloat(precio)>0) {
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage("04242762568", null, "Compra de " + precio + " $ pagada via SMS", null, null);
                hacerToast("El SMS de pago ha sido enviado. Gracias por su compra :)");
                vaciarCarrito(view);
            }else{
                hacerToast("No hay nada para pagar en el carrito");
                vaciarCarrito(view);
            }
        }
    }

    /**
     * Este metodo se encarga de vaciar el carrito de compra y retornar a 0 el TextView con el
     * precio de la compra
     *
     * @param view
     */
    public void vaciarCarrito(View view){
        LinearLayout carrito = (LinearLayout) findViewById(R.id.layoutcarrito);
        carrito.removeAllViews();
        ((TextView) findViewById(R.id.textView15)).setText("A pagar $: 0");
        hacerToast("El carrito se ha vaciado");
    }
}
