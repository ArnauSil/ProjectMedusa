package com.example.arnausilberman.projectmedusa;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Arnau Silberman on 30/11/2017.
 */

public class LoginView extends LinearLayout {


    public LoginView(Context context) {
        super(context);

        setOrientation(VERTICAL);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));



    }
}
