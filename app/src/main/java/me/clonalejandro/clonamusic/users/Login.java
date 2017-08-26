package me.clonalejandro.clonamusic.users;

import android.support.design.widget.Snackbar;
import android.widget.EditText;

import me.clonalejandro.clonamusic.Home;
import me.clonalejandro.clonamusic.R;
import me.clonalejandro.clonamusic.listeners.LoginListeners;
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

public class Login {


    /** SMALL CONSTRUCTORS **/

    private final Home program;

    public Login(Home instance){
        program = instance;
    }


    /** REST **/

    public void setEditText(){
        final Manager manager = new Manager(program);

        EditText elementEmail = (EditText) program.findViewById(R.id.field_email),
                 elementPwd = (EditText) program.findViewById(R.id.field_password);

        elementEmail.addTextChangedListener(
                new LoginListeners.EmailField(
                        elementEmail, manager
                ));

        elementPwd.addTextChangedListener(
                new LoginListeners.PwdField(
                        elementPwd, manager
                ));
    }


    /** OTHERS **/

    /**
     * @param manager
     * @param msg
     * @param colorText
     * @param colorBackground
     * @param duration
     * @param debug
     */
    public static void sendToaster(Manager manager, String msg, int colorText, int colorBackground, Manager.ToastDuration duration, boolean debug){
        Snackbar snackbar = manager.snackbarCreator(msg, colorText, colorBackground, 0, debug, duration);
        snackbar.show();
    }


}
