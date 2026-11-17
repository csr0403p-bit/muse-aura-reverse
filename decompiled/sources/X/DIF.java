package X;

/* loaded from: classes5.dex */
public interface DIF {
    DJL getCrashResiliencyConfig();

    long getMetadataConfigForMarker(int i);

    long getSamplingSpecForMarker(int i);

    boolean isMarkerBlocked(int i);

    boolean notifyFallbackSamplingUsed(int i);

    int randomlySample(int i);

    int resolvePivotMarker(int i, String str);
}
