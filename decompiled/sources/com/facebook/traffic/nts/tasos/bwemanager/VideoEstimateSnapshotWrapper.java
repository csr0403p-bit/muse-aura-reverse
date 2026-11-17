package com.facebook.traffic.nts.tasos.bwemanager;

import X.C06H;
import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class VideoEstimateSnapshotWrapper implements VideoEstimateSnapshot {
    public static final Companion Companion = new Companion();
    public final HybridData hybridData;
    public final HybridData mHybridData;

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native void addAbrDecisionDetails(String str);

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native void addSelectedRepInfo(VideoEstimateSnapshotSelectedRepInfo videoEstimateSnapshotSelectedRepInfo);

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native void addVideoId(String str);

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native long getEstimatedBitrate(long j, Long l);

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native long getEstimatedRawBitrate();

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native long getEstimatedRawBitrateStdDev();

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native long getEstimatedTtfbMs();

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native long getEstimatedTtfbStdDev();

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native long getTimestamp();

    @Override // com.facebook.traffic.nts.tasos.bwemanager.VideoEstimateSnapshot
    public native boolean hasServerBwe();

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ETi.loadLibrary("bwemanager");
    }

    public VideoEstimateSnapshotWrapper(HybridData hybridData) {
        this.hybridData = hybridData;
        this.mHybridData = hybridData;
    }
}
