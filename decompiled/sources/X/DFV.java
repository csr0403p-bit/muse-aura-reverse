package X;

/* loaded from: classes5.dex */
public interface DFV {
    long getEventLatencyOverride(String str);

    long getHighPriEventLatencyOverride(String str);

    InterfaceC4083Clb getHighPriUploadSchedulerParamsProvider();

    long getInMemoryUploadDelay();

    long getLatencyWindowMultiplier();

    long getNormalPriEventLatencyOverride(String str);

    InterfaceC4083Clb getNormalPriUploadSchedulerParamsProvider();

    long getRealTimeExemptLatency();

    long getRegularExemptLatency();

    boolean isMicroBatchingEnabled();

    int multiBatchPayloadSize();

    boolean shouldNotifyOnBatchReady();
}
