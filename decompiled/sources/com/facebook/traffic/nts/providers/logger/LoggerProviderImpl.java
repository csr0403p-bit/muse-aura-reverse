package com.facebook.traffic.nts.providers.logger;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes6.dex */
public final class LoggerProviderImpl {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid0();

    public final native void updateLogger(XAnalyticsHolder xAnalyticsHolder);

    public final class Companion {
        public Companion() {
        }

        private final HybridData initHybrid0() {
            return LoggerProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("logger_provider");
    }

    public LoggerProviderImpl() {
        this(initHybrid0());
    }

    public LoggerProviderImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }
}
