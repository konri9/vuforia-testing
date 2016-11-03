package com.vuforia.samples.UCRApplication.utils;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

/**
 * Class that contains methods for the app to use
 * @author konrad
 * @version 1.0
 * @since 1.0
 */
public class Utils {

    /**
     * The activity that calls the helpers
     */
    private Activity activity;
    /**
     * The context of the app
     */
    private Context context;

    /**
     *
     * @param activity
     * @param context
     */
    public Utils(Activity activity, Context context) {
        this.activity = activity;
        this.context = context;
    }
    /**
     * Generic method to create toast logs
     */
    public  void toastLog(String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    /**
     * Generic method to create snack bar logs
     */
    public void snack_log(View view, String log) {
        Snackbar.make(view, log, Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }

    /**
     *  Method used to request for the location permision
     */
    public void requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int permissionCheck = ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION);
            if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
                        Manifest.permission.ACCESS_FINE_LOCATION)) {
                    new AlertDialog.Builder(context).setTitle("Permiso de ubicación").setMessage("Necesitamos tu ubicación para que el app funcione").show();

                } else {

                    ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                }
            }
        }
    }

}
