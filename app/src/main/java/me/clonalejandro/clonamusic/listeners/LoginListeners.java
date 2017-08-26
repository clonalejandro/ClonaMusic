package me.clonalejandro.clonamusic.listeners;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import me.clonalejandro.clonamusic.Home;
import me.clonalejandro.clonamusic.users.Login;
import me.clonalejandro.clonamusic.utils.Colors;
import me.clonalejandro.clonamusic.utils.Manager;

/**
 * Created by alejandrorioscalera
 * On 25/8/17
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©ClonaMusic 2017 / 2018
 */


public class LoginListeners {


    /** SMALL CONSTRUCTORS **/

    private final Home program;

    public LoginListeners(Home instance){
        program = instance;
    }


    /** REST **/

    public static class EmailField implements TextWatcher {


        /** SMALL CONSTRUCTORS **/

        private final EditText elementEmail;
        private final Manager manager;

        public EmailField(EditText elementEmail, Manager manager){
            this.manager = manager;
            this.elementEmail = elementEmail;
        }


        /** REST **/

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}
        @Override
        public void afterTextChanged(Editable s) {
            final String elementEmailstr = elementEmail.getText().toString();

            if (!elementEmailstr.isEmpty() && !elementEmailstr.contains("@") || !elementEmailstr.isEmpty() && !elementEmailstr.contains(".")){
                elementEmail.setError("Email field have an error...");
                elementEmail.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                Login.sendToaster(manager, "Email field have an error...", Colors.WHITE, Colors.RED, Manager.ToastDuration.MEDIUM, false);
            }
            else if(!elementEmailstr.isEmpty()) elementEmail.getBackground().setColorFilter(Colors.GREEN, PorterDuff.Mode.SRC_ATOP);
        }


    }


    public static class PwdField implements TextWatcher {


        /** SMALL CONSTRUCTORS **/

        private final EditText elementPwd;
        private final Manager manager;

        public PwdField(EditText elementPwd, Manager manager){
            this.manager = manager;
            this.elementPwd = elementPwd;
        }


        /** REST **/

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after){}
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count){}
        @Override
        public void afterTextChanged(Editable s){
            final String elementPwdstr = elementPwd.getText().toString();

            if (!elementPwdstr.isEmpty() && elementPwdstr.length() < 8){
                elementPwd.setError("Password need be more long");
                elementPwd.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                Login.sendToaster(manager, "Password need be more long", Colors.WHITE, Colors.RED, Manager.ToastDuration.MEDIUM, false);
            }
            else if(!elementPwdstr.isEmpty()) elementPwd.getBackground().setColorFilter(Colors.GREEN, PorterDuff.Mode.SRC_ATOP);
        }


    }


    /** OTHERS **/

    //none...


}
