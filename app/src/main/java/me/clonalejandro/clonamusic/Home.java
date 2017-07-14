package me.clonalejandro.clonamusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {


    /** SMALL CONSTRUCTORS **/

    public static Home instance;


    /** REST **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        instance = this;

        //more...
    }


}
