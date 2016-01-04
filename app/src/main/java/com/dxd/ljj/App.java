package com.dxd.ljj;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * 作者 Administrator on 2016/1/4 22:32
 * 邮箱 dutay_dxd@sina.com
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
