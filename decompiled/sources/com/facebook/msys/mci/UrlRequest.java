package com.facebook.msys.mci;

import X.C7320Ekq;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes5.dex */
public class UrlRequest {
    public final NativeHolder mNativeHolder;

    private native String[] getHeaderKeys();

    private native String[] getHeaderValues();

    public native byte[] getHttpBody();

    public native String getHttpMethod();

    public native String getUrl();

    static {
        C7320Ekq.A00();
    }

    public UrlRequest(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
