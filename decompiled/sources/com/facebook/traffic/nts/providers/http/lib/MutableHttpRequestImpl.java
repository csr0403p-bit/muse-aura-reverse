package com.facebook.traffic.nts.providers.http.lib;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class MutableHttpRequestImpl implements MutableHttpRequest {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public MutableHttpRequestImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.providers.http.lib.MutableHttpRequest
    public native String getHostNameOrThrow();

    @Override // com.facebook.traffic.nts.providers.http.lib.MutableHttpRequest
    public native String getUrlOrThrow();

    @Override // com.facebook.traffic.nts.providers.http.lib.MutableHttpRequest
    public native void setHeader(String str, String str2);

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("http_provider");
    }
}
