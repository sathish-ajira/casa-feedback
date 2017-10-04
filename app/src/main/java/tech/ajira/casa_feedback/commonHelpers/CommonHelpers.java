package tech.ajira.casa_feedback.commonHelpers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CommonHelpers {

    public static TextView actionBarTitle(Context context){
        String ExternalFontPath;
        Typeface FontLoaderTypeface;
        TextView TextViewNewFont = new TextView(context);

        RelativeLayout.LayoutParams layoutparams = new RelativeLayout.LayoutParams(android.support.v7.app.ActionBar.LayoutParams.MATCH_PARENT, android.support.v7.app.ActionBar.LayoutParams.WRAP_CONTENT);

        TextViewNewFont.setLayoutParams(layoutparams);

        TextViewNewFont.setText("Dashboard");

        TextViewNewFont.setTextSize(20);

        TextViewNewFont.setTextColor(Color.WHITE);

        // Assests folder font folder path
        ExternalFontPath = "fonts/Lato-Medium.ttf";

        // Load Typeface font url String ExternalFontPath
        FontLoaderTypeface = Typeface.createFromAsset(context.getAssets(), ExternalFontPath);

        TextViewNewFont.setTypeface(FontLoaderTypeface);
        return TextViewNewFont;
    }
}
