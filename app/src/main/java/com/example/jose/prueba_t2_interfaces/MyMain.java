package com.example.jose.prueba_t2_interfaces;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.support.design.widget.Snackbar;

import android.widget.Toast;

public class MyMain extends AppCompatActivity {

    private SwipeRefreshLayout swipeRefreshLayout_mymain_refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);

        swipeRefreshLayout_mymain_refresh = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout_mymain_refresh);
        swipeRefreshLayout_mymain_refresh.setOnRefreshListener(OnRefreshListener);


    }

    protected SwipeRefreshLayout.OnRefreshListener OnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {

            final LinearLayout lv_mymain = (LinearLayout) findViewById(R.id.lv_mymain);
            //al refrescar saltara un toast
            Toast toast0 = Toast.makeText(MyMain.this, "TOAST REFRESH", Toast.LENGTH_LONG);
            toast0.show();

            Snackbar snackbar = Snackbar
                    .make(lv_mymain, "Snack while you refresh", Snackbar.LENGTH_LONG)
                    //puedes insertarle una accion
                    .setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar snackbar1 = Snackbar.make(lv_mymain, "Mensaje al clicar dentro del boton!", Snackbar.LENGTH_SHORT);
                            snackbar1.show();
                        }


                    });

            snackbar.show();
            swipeRefreshLayout_mymain_refresh.setRefreshing(false);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.camera) {
            Toast toast = Toast.makeText(this, "going APPBAR CAMERA", Toast.LENGTH_LONG);
            toast.show();
        }
        return super.onOptionsItemSelected(item);
    }

}

