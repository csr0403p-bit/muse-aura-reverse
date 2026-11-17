package X;

/* loaded from: classes5.dex */
public final class DGJ implements DFV {
    @Override // X.DFV
    public final InterfaceC4083Clb getHighPriUploadSchedulerParamsProvider() {
        return null;
    }

    @Override // X.DFV
    public final long getLatencyWindowMultiplier() {
        return 2L;
    }

    @Override // X.DFV
    public final InterfaceC4083Clb getNormalPriUploadSchedulerParamsProvider() {
        return null;
    }

    @Override // X.DFV
    public final long getRealTimeExemptLatency() {
        return 0L;
    }

    @Override // X.DFV
    public final boolean isMicroBatchingEnabled() {
        return false;
    }

    @Override // X.DFV
    public final int multiBatchPayloadSize() {
        return 20000;
    }

    @Override // X.DFV
    public final boolean shouldNotifyOnBatchReady() {
        return true;
    }

    @Override // X.DFV
    public final long getEventLatencyOverride(String str) {
        return -1L;
    }

    @Override // X.DFV
    public final long getHighPriEventLatencyOverride(String str) {
        return -1L;
    }

    @Override // X.DFV
    public final long getInMemoryUploadDelay() {
        return 60000L;
    }

    @Override // X.DFV
    public final long getNormalPriEventLatencyOverride(String str) {
        return -1L;
    }

    @Override // X.DFV
    public final long getRegularExemptLatency() {
        return 900000L;
    }
}
