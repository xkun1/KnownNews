package com.bigdata.knownnews;

import android.app.Application;

import org.xutils.x;

/**
 * Created by kun on 16/8/1.
 */
public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
