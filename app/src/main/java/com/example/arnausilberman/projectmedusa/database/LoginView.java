package com.example.arnausilberman.projectmedusa.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Arnau Silberman on 30/11/2017.
 */

public class LoginView extends LinearLayout {

    /*

    //usuario a logeado y mas
    public static final String LOGTAG="MEDUSA",
                               USERNAME="pref_username",
                               VIEWIMAGE="pref_viewimagen";
    */

    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    //onCreate method?
    public LoginView(Context context) {
        super(context);

        setOrientation(VERTICAL);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));


    }
}
