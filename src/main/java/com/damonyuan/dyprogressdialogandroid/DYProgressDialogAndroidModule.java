package com.damonyuan.dyprogressdialogandroid;

import android.app.ProgressDialog;
import android.content.Context;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.MapBuilder;

public class DYProgressDialogAndroidModule extends ReactContextBaseJavaModule {
    
    private static final String TAG = DYProgressDialogAndroidModule.class.getSimpleName();
    
    private Context context;
    private ProgressDialog progressDialog;

    public DYProgressDialogAndroidModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.context = reactContext;
        Log.d(TAG, "Context " + context);
        Log.d(TAG, "reactContext " + reactContext);
    }

    @Override
    public String getName() { return "ProgressDialogAndroid"; }

    @ReactMethod
    public void createDialog() {
        this.progressDialog = new ProgressDialog(this.context);
    }

    @ReactMethod
    public void setCancelable(boolean cancelable) {
        this.progressDialog.setCancelable(cancelable);
    }
    
    @ReactMethod
    public void setMessage(String message) {
        this.progressDialog.setMessage(message);
    }

    @ReactMethod
    public void setProgressStyle(int progressStyle) {
        this.progressDialog.setProgressStyle(progressStyle);
    }

    @ReactMethod
    public void setProgress(int progress) {
        this.progressDialog.setProgress(progress);
    }

    @ReactMethod
    public void setMax(int max) {
        this.progressDialog.setMax(max);
    }

    @ReactMethod
    public void show() {
        this.progressDialog.show();
    }

    @ReactMethod
    public void dismiss() {
        this.progressDialog.dismiss();
    }
}
