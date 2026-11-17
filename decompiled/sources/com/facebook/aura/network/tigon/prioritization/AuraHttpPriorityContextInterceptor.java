package com.facebook.aura.network.tigon.prioritization;

import X.C06H;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;

/* loaded from: classes5.dex */
public final class AuraHttpPriorityContextInterceptor extends RequestInterceptor {
    public static final Companion Companion = new Companion();

    public static final native HybridData initHybrid();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final HybridData initHybrid() {
            return AuraHttpPriorityContextInterceptor.initHybrid();
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("aurahttpprioritization");
    }

    public AuraHttpPriorityContextInterceptor() {
        this.mHybridData = initHybrid();
    }
}
