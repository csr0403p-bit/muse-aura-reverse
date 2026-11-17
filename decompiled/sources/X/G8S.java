package X;

/* loaded from: classes6.dex */
public abstract class G8S extends G8T {
    public int[] cachedConfig;

    public abstract long fetchMC(long j);

    public final long fetchMC(C7491Exw<?, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return -1L;
    }

    public abstract G8R getReporter();

    public abstract String getSoftErrorCategory();

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public synchronized int[] getValues() {
        int[] nonCachedValues;
        nonCachedValues = this.cachedConfig;
        if (nonCachedValues == null) {
            nonCachedValues = getNonCachedValues();
            this.cachedConfig = nonCachedValues;
        }
        return nonCachedValues;
    }

    public abstract void logMCExposure(long j);

    private final int[] getNonCachedValues() {
        int[] iArr = new int[6465];
        int i = 0;
        do {
            iArr[i] = -1;
            i++;
        } while (i < 6465);
        return iArr;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public int getLayerSource() {
        return 2;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public void logExposure(int i) {
    }

    @Override // X.G8T, com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public int[] getUpdatedValues() {
        return getNonCachedValues();
    }
}
