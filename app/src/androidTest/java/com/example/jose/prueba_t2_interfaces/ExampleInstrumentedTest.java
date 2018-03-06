package com.example.jose.prueba_t2_interfaces;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    EditText et_login_correo,et_login_contrasena;
    Button btn_login_entrar;
    private LoginActivity actividad;

    public ExampleInstrumentedTest() {
        super(LoginActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        et_login_correo = (EditText) actividad.findViewById(R.id.et_login_correo);
        et_login_contrasena = (EditText) actividad.findViewById(R.id.et_login_contrasena);
        btn_login_entrar = (Button) actividad.findViewById(R.id.btn_login_entrar);


    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }




    public void testLoginSignup() {

        TouchUtils.clickView(this, btn_login_entrar);


        // get result
//        String mathResult1 = etiqueta.getText().toString();
        // check the result
//        assertTrue("Add result should be 5", mathResult1.equals(ADD_RESULT));
    }

}
