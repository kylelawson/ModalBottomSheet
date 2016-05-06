package com.lawdogstudio.kyle.modalbottomsheet;

import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Example and template for a modal bottom sheet fragment
 * Remember to include compile 'com.android.support:design:23.3.0' to build.gradle(Module:app)
 * or none of this works
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initiate bottom sheet view, these two lines can be placed inside an onclicklistener if
        //the bottom sheet needs to be called using a widget
        BottomSheetDialogFragment bottomSheetDialogFragment = new BottomsheetFragmentActivity();
        bottomSheetDialogFragment.show(getSupportFragmentManager(), bottomSheetDialogFragment.getTag());
    }
}
