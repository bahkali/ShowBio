package org.gandal.android.showmethebio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView foodImg;
    private ImageView logoImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        foodImg = (ImageView)findViewById(R.id.foodImg);
        logoImg = (ImageView)findViewById(R.id.logoImg);


        foodImg.setOnClickListener(this);
        logoImg.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.foodImg:

                 Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name", "food");
                intent.putExtra("bio", "This is Awesome if it work. I will eat all that food");
                 startActivity(intent);
            break;

            case R.id.logoImg:
                Intent intent2 = new Intent(getApplicationContext(), SecondActivity.class);
                intent2.putExtra("name", "logo");
                intent2.putExtra("bio", "This is Awesome if it work. Naffa is the organization i'm part of..");
                startActivity(intent2);
             break;
        }
    }
}
