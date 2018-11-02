package com.example.day_one;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private Toolbar tb;
    private DrawerLayout dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setSupportActionBar(tb);
        tb.setNavigationIcon(R.drawable.arrowleft);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case android.R.id.home:
                dw.openDrawer(GravityCompat.START);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
        tb = (Toolbar) findViewById(R.id.tb);
        dw = (DrawerLayout) findViewById(R.id.dw);

    }
}
