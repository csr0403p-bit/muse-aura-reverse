package X;

/* renamed from: X.DJx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4980DJx implements DIF {
    @Override // X.DIF
    public DJL getCrashResiliencyConfig() {
        return DKC.A00;
    }

    @Override // X.DIF
    public boolean isMarkerBlocked(int i) {
        return false;
    }

    @Override // X.DIF
    public boolean notifyFallbackSamplingUsed(int i) {
        return true;
    }

    @Override // X.DIF
    public int resolvePivotMarker(int i, String str) {
        return i;
    }
}
