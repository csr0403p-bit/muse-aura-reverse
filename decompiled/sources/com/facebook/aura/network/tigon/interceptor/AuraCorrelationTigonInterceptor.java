package com.facebook.aura.network.tigon.interceptor;

import X.C06H;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;

/* loaded from: classes5.dex */
public final class AuraCorrelationTigonInterceptor extends RequestInterceptor {
    public static final Companion Companion = new Companion();

    public static final native HybridData initHybrid(String str, String str2);

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final HybridData initHybrid(String str, String str2) {
            return AuraCorrelationTigonInterceptor.initHybrid(str, str2);
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("auracorrelationinterceptor");
    }

    public AuraCorrelationTigonInterceptor() {
        this.mHybridData = initHybrid("4331325740476680", "16.0.0.11.159");
    }
}
