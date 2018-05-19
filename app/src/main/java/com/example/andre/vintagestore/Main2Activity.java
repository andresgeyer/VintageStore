package com.example.andre.vintagestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.andre.Main2Activity.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton1 = (Button)findViewById(R.id.button32);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Dauphin Tablet - 300");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton2 = (Button)findViewById(R.id.button33);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Poqet PC - 800");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton3 = (Button)findViewById(R.id.button31);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Spectrum ZX Computer - 680");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton4 = (Button)findViewById(R.id.button30);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Wrist Phone by NTT - 299");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton5 = (Button)findViewById(R.id.button28);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Psion Computer - 1256");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton6 = (Button)findViewById(R.id.button29);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "HP Omnibook - 789");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton7 = (Button)findViewById(R.id.button26);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Macintosh Classic - 999");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton8 = (Button)findViewById(R.id.button27);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Macintosh Portable - 1259");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton10 = (Button)findViewById(R.id.button25);
        boton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Atari800 XL - 399");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton11 = (Button)findViewById(R.id.button24);
        boton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Atari Touch Tablet - 199");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton12 = (Button)findViewById(R.id.button23);
        boton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Atari Portfolio - 725");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton13 = (Button)findViewById(R.id.button22);
        boton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Atari Mindlink - 199");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton14 = (Button)findViewById(R.id.button14);
        boton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Next Computer - 2999");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton15 = (Button)findViewById(R.id.button15);
        boton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Sketch Animator - 55");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton16 = (Button)findViewById(R.id.button16);
        boton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Apple T. Phone Concept - 789");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton17 = (Button)findViewById(R.id.button17);
        boton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Amiga 500 Computer - 499");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton18 = (Button)findViewById(R.id.button18);
        boton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Puma Computer Shoes - 199");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton19 = (Button)findViewById(R.id.button19);
        boton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Beatles 12 inch Vinyl - 99");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton20 = (Button)findViewById(R.id.button20);
        boton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "3x3 rubik cube - 40");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        /**
         * Este método contiene un OnClickListener para el boton seleccionado. Permite devolver a la
         * actividad padre los datos del producto asociado a dicho boton.
         */
        final Button boton21 = (Button)findViewById(R.id.button21);
        boton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, "Guns & Roses Tape - 99");
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

    }
}
