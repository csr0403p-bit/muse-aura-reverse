package com.facebook.traffic.nts.tasos.bwe_state_logger;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class BandwidthStateLoggerConfigImpl implements BandwidthStateLoggerConfig {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public BandwidthStateLoggerConfigImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.tasos.bwe_state_logger.BandwidthStateLoggerConfig
    public native long getBandwidthCheckIntervalSecs();

    @Override // com.facebook.traffic.nts.tasos.bwe_state_logger.BandwidthStateLoggerConfig
    public native boolean getEnableUploadHttpBweLogging();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("bwe_state_logger");
    }
}
