package com.matech.csrcall.detectcall7;

import android.app.admin.DeviceAdminReceiver;
import android.content.Intent;
import android.content.Context;



/**
 * Created by shoaib on 5/7/2016.
 */
public class DeviceAdminDemo  extends DeviceAdminReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    public void onEnabled(Context context, Intent intent) {
    };

    public void onDisabled(Context context, Intent intent) {
    };

}
