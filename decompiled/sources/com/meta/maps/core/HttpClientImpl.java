package com.meta.maps.core;

import X.C06H;
import com.meta.maps.NativeBase;
import com.meta.maps.core.HttpClient;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HttpClientImpl extends NativeBase implements HttpClient {
    public static final Companion Companion = new Companion();
    public String authToken;
    public String locale;
    public String loggingId;
    public String sandbox;

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.core.HttpClient
    public native void get(String str, Map<String, String> map, RequestScope requestScope, HttpClient.ResponseCallback responseCallback);

    @Override // com.meta.maps.core.HttpClient
    public native String getAuthToken();

    @Override // com.meta.maps.core.HttpClient
    public native String getLocale();

    @Override // com.meta.maps.core.HttpClient
    public native String getLoggingId();

    @Override // com.meta.maps.core.HttpClient
    public native String getSandbox();

    @Override // com.meta.maps.core.HttpClient
    public native void post(String str, Map<String, String> map, IOBuf iOBuf, RequestScope requestScope, HttpClient.ResponseCallback responseCallback);

    @Override // com.meta.maps.core.HttpClient
    public native void setAuthToken(String str);

    @Override // com.meta.maps.core.HttpClient
    public native void setLocale(String str);

    @Override // com.meta.maps.core.HttpClient
    public native void setLoggingId(String str);

    @Override // com.meta.maps.core.HttpClient
    public native void setSandbox(String str);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        private final void disposeNativeHandle(long j) {
            HttpClientImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            HttpClientImpl.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public HttpClientImpl(long j, Object obj) {
        super(j, Companion);
    }
}
