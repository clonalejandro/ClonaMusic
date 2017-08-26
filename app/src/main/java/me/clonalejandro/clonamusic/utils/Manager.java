package me.clonalejandro.clonamusic.utils;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import me.clonalejandro.clonamusic.Home;
import me.clonalejandro.clonamusic.R;

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


public class Manager {


    /** SMALL CONSTRUCTORS **/

    private final Home program;
    private static Home pinstance;

    public Manager(Home instance){
        program = instance;
        pinstance = instance;
    }


    /** REST **/

    /**
     * @param msg
     * @param colorText
     * @param colorBackground
     * @param TextSize
     * @param debug
     * @param duration
     * @return
     */
    public Snackbar snackbarCreator(String msg, int colorText, int colorBackground, int TextSize, boolean debug, ToastDuration duration){
        View view = program.findViewById(R.id.activity_home);

        int Id = android.support.design.R.id.snackbar_text;
        int d = 0, low = 0, high = 0;

        switch (duration){
            default:
                low = Toast.LENGTH_SHORT;
                d = low;
                break;
            case MEDIUM:
                d = low * 2;
                break;

            case LONG:
                high = Toast.LENGTH_LONG;
                d = high;
                break;
            case CLONA_PENIS:
                d = high * 2;
                break;
        }

        Snackbar snackbar = Snackbar.make(view, msg, d);


        if (!debug) {
            View snackbarView = snackbar.getView();
            snackbarView.setBackgroundColor(colorBackground);

            TextView text = (TextView) snackbarView.findViewById(Id);
            text.setTextColor(colorText);
            if (TextSize != 0) text.setTextSize(TextSize);
        }

        return snackbar;
    }


    /** OTHERS **/

    public enum ToastDuration { SHORT, MEDIUM, LONG, CLONA_PENIS }

    public static Home getInstance(){
        return pinstance;
    }

}
