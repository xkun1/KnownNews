package com.bigdata.knownnews.MVP.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.xutils.x;

/**
 * Created by kun on 16/8/1.
 */
public abstract class BaseFragment extends Fragment {

    private static final String TAG=BaseFragment.class.getName();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        onBaseCreatView(inflater,container,savedInstanceState);
        return null;
    }

    protected abstract View onBaseCreatView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        x.view().inject(this,this.getView());
        onBaseViewCreated(view,savedInstanceState);
    }

    protected abstract void onBaseViewCreated(View view, Bundle savedInstanceState);

    @Override
    public void onDestroy() {
        super.onDestroy();
        onBaseDestory();
    }

    protected abstract void onBaseDestory();
}
