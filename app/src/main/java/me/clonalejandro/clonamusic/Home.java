package me.clonalejandro.clonamusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.clonalejandro.clonamusic.listeners.LoginListeners;
import me.clonalejandro.clonamusic.users.Login;
import me.clonalejandro.clonamusic.utils.Manager;

public class Home extends AppCompatActivity {


    /** SMALL CONSTRUCTORS **/

    public static Home instance;


    /** REST **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        instance = this;

        setContents();
        Events();
    }


    /** OTHERS **/

    public View getView(){
        return new View(instance);
    }

    private void Events(){
        new LoginListeners(instance);
    }

    private void setContents(){
        new Login(instance).setEditText();
    }


    /** GETTERS **/

    public Manager getManager(){
        return new Manager(instance);
    }
}
