package com.zhxh.xnetworklib.downloader.internal;

import com.zhxh.xnetworklib.downloader.Response;
import com.zhxh.xnetworklib.downloader.request.DownloadRequest;

public class SynchronousCall {

    public final DownloadRequest request;

    public SynchronousCall(DownloadRequest request) {
        this.request = request;
    }

    public Response execute() {
        DownloadTask downloadTask = DownloadTask.create(request);
        return downloadTask.run();
    }

}
