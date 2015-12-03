package org.gandal.android.showmethebio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private ImageView imgBio;
    private TextView bioText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imgBio = (ImageView)findViewById(R.id.imgBio);
        bioText =(TextView)findViewById(R.id.bioText);

        Bundle extract = getIntent().getExtras();

        if(extract == null){
            Toast.makeText(this, "Error Nothing was sent!.." ,Toast.LENGTH_LONG).show();
            finish();
        }

        String name = extract.getString("name");
        String bio = extract.getString("bio");
        if(name.equals("food")){
            imgBio.setImageDrawable(getResources().getDrawable(R.drawable.food));
            bioText.setText(bio);
        } else if(name.equals("logo")){
            imgBio.setImageDrawable(getResources().getDrawable(R.drawable.logonaffa));
            bioText.setText(bio);
        }
    }
}
