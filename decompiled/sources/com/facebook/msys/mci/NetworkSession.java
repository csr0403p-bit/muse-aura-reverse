package com.facebook.msys.mci;

import X.C7320Ekq;
import X.F60;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes5.dex */
public abstract class NetworkSession {
    public final NativeHolder mNativeHolder;

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th);

    private native void markDataTaskStreamingCompleted(String str, String str2, UrlResponse urlResponse, Throwable th);

    private native void nativeDispose();

    private native void onDataTaskNewStreamingData(String str, String str2, UrlResponse urlResponse, byte[] bArr);

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    public native synchronized void canHandleStreamingUploadUpdate(String str);

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public native void updateDataTaskDownloadProgress(String str, long j, long j2, long j3);

    public native void updateDataTaskUploadProgress(String str, long j, long j2, long j3);

    static {
        C7320Ekq.A00();
    }

    private void dispatchProgressUpdateToObserver(String str, long j, long j2, long j3) {
        throw F60.createAndThrow();
    }

    private void onCancelDataTask(String str) {
        throw F60.createAndThrow();
    }

    private void onNewDataTask(DataTask dataTask) {
        throw F60.createAndThrow();
    }

    private void onUpdateStreamingDataTask(byte[] bArr, String str) {
        throw F60.createAndThrow();
    }
}
