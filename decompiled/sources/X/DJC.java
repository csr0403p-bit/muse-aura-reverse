package X;

/* loaded from: classes5.dex */
public final class DJC extends AbstractC4980DJx {
    public final int A00;

    @Override // X.DIF
    public final long getSamplingSpecForMarker(int i) {
        return DJP.A00(1, this.A00, 1);
    }

    public DJC(int i) {
        this.A00 = i;
    }

    @Override // X.DIF
    public final long getMetadataConfigForMarker(int i) {
        return 0L;
    }

    @Override // X.DIF
    public final int randomlySample(int i) {
        return i;
    }

    public DJC() {
        this(3);
    }
}
