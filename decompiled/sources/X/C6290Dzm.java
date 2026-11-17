package X;

import java.io.Serializable;

/* renamed from: X.Dzm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6290Dzm implements Serializable {
    public final boolean isPrefetchBufferHoldEnabled;
    public final boolean isRecoveryEnvelopeEnabled;
    public final boolean isStartupBufferHoldEnabled;
    public final long maximumProjectionCheckpointsPerSegment;
    public final long minimumBufferMs;
    public final long minimumPlayableMediaDurationMs;
    public final String recoveryCurve;
    public final long startupBufferRampTimeMs;
    public final long startupTargetRampTimeMs;
    public final long targetBufferMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C6290Dzm() {
        long j = 0;
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 1023, j, j, j, j, j, j, z, z, z);
    }

    public /* synthetic */ C6290Dzm(String str, C06H c06h, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.targetBufferMs = 1000L;
        this.minimumBufferMs = 0L;
        this.minimumPlayableMediaDurationMs = 100L;
        this.maximumProjectionCheckpointsPerSegment = 16L;
        this.isRecoveryEnvelopeEnabled = false;
        this.recoveryCurve = "0,0;1,1";
        this.isStartupBufferHoldEnabled = false;
        this.startupBufferRampTimeMs = 500L;
        this.startupTargetRampTimeMs = 8000L;
        this.isPrefetchBufferHoldEnabled = false;
    }
}
