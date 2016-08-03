package com.bigdata.knownnews.MVP.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

import org.xutils.x;

/**
 * Created by kun on 16/8/1.
 */
public abstract class BaseActivity extends FragmentActivity {

    private static final String TAG=BaseActivity.class.getName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        setBaseCreate(savedInstanceState);
    }

    protected abstract void setBaseCreate(Bundle savedInstanceState);


    protected void showTost(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

    protected void showLog(String s){
        Log.d(TAG,"kun==="+s);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onBaseDestory();
    }

    protected abstract void onBaseDestory();


}
