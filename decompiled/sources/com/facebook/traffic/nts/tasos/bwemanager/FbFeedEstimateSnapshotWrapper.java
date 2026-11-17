package com.facebook.traffic.nts.tasos.bwemanager;

import X.C06H;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class FbFeedEstimateSnapshotWrapper implements FbFeedEstimateSnapshot {
    public static final Companion Companion = new Companion();
    public final HybridData hybridData;
    public final HybridData mHybridData;

    @Override // com.facebook.traffic.nts.tasos.bwemanager.FbFeedEstimateSnapshot
    public native Long getBandwidthEstimate();

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("bwemanager");
    }

    public FbFeedEstimateSnapshotWrapper(HybridData hybridData) {
        this.hybridData = hybridData;
        this.mHybridData = hybridData;
    }
}
