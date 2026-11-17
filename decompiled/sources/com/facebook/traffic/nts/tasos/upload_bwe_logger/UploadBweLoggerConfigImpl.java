package com.facebook.traffic.nts.tasos.upload_bwe_logger;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class UploadBweLoggerConfigImpl implements UploadBweLoggerConfig {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public UploadBweLoggerConfigImpl(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.traffic.nts.tasos.upload_bwe_logger.UploadBweLoggerConfig
    public native double getSamplingRate();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("upload_bwe_logger");
    }
}
