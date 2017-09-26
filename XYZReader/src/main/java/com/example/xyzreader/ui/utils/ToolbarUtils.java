package com.example.xyzreader.ui.utils;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by alexandre on 10/09/17.
 */

public class ToolbarUtils {

    public static void setupToolbarWithLogo(AppCompatActivity activity, @NonNull Toolbar toolbar, @DrawableRes int
            resLogo) {
        setupToolbar(activity, toolbar, false, false);
        activity.getSupportActionBar().setDisplayUseLogoEnabled(true);
        activity.getSupportActionBar().setLogo(resLogo);
    }

    public static void setupToolbar(AppCompatActivity activity, Toolbar toolbar) {
        setupToolbar(activity, toolbar, true, true);
    }

    public static void setupToolbar(AppCompatActivity activity, Toolbar toolbar, boolean homeButtonEnabled, boolean
            displayHomeAsUp) {
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setHomeButtonEnabled(homeButtonEnabled);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(displayHomeAsUp);
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

}
