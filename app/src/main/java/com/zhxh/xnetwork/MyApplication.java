package com.zhxh.xnetwork;

import android.app.Application;

import com.zhxh.xnetworklib.downloader.XNetDownloader;
import com.zhxh.xnetworklib.downloader.XNetDownloaderConfig;

/**
 * Created by zhxh on 2018/7/16
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        XNetDownloaderConfig config = XNetDownloaderConfig.newBuilder()
                .setDatabaseEnabled(true)
                .build();
        XNetDownloader.initialize(this, config);
    }

}
