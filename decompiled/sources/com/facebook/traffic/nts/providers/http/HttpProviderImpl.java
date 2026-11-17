package com.facebook.traffic.nts.providers.http;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.traffic.nts.providers.http.lib.MutableHttpRequest;

/* loaded from: classes6.dex */
public final class HttpProviderImpl implements HttpProviderAppLayer {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid0();

    @Override // com.facebook.traffic.nts.providers.http.HttpProviderAppLayer
    public native void onMutableRequestAppLayer(MutableHttpRequest mutableHttpRequest);

    public final class Companion {
        public Companion() {
        }

        private final HybridData initHybrid0() {
            return HttpProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("http_provider");
    }

    public HttpProviderImpl() {
        this(initHybrid0());
    }

    public HttpProviderImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }
}
