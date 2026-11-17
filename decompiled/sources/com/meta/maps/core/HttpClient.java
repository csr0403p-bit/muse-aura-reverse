package com.meta.maps.core;

import X.C06H;
import com.meta.maps.NativeBase;
import java.util.Map;

/* loaded from: classes6.dex */
public interface HttpClient extends Providing {

    public interface ResponseCallback {
        void apply(HttpResponse httpResponse);
    }

    public final class ResponseCallbackImpl extends NativeBase implements ResponseCallback {
        public static final Companion Companion = new Companion();

        public static final native void disposeNativeHandle(long j);

        @Override // com.meta.maps.core.HttpClient.ResponseCallback
        public native void apply(HttpResponse httpResponse);

        public final class Companion implements NativeBase.Disposer {
            public Companion() {
            }

            private final void disposeNativeHandle(long j) {
                ResponseCallbackImpl.disposeNativeHandle(j);
            }

            @Override // com.meta.maps.NativeBase.Disposer
            public void dispose(long j) {
                ResponseCallbackImpl.disposeNativeHandle(j);
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public ResponseCallbackImpl(long j, Object obj) {
            super(j, Companion);
        }
    }

    void get(String str, Map<String, String> map, RequestScope requestScope, ResponseCallback responseCallback);

    String getAuthToken();

    String getLocale();

    String getLoggingId();

    String getSandbox();

    void post(String str, Map<String, String> map, IOBuf iOBuf, RequestScope requestScope, ResponseCallback responseCallback);

    void setAuthToken(String str);

    void setLocale(String str);

    void setLoggingId(String str);

    void setSandbox(String str);
}
