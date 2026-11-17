package X;

/* renamed from: X.Agm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1301Agm {
    public long A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HistoricalChange(uptimeMillis=");
        sbA0x.append(this.A04);
        sbA0x.append(", position=");
        AWx.A0E(this.A03, sbA0x);
        sbA0x.append(", scaleFactor=");
        sbA0x.append(this.A01);
        sbA0x.append(", panOffset=");
        return AnonymousClass007.A0Z(AWx.A0D(this.A02), sbA0x);
    }

    public C1301Agm(float f, long j, long j2, long j3, long j4) {
        this.A04 = j;
        this.A03 = j2;
        this.A01 = f;
        this.A02 = j3;
        this.A00 = 0L;
        this.A00 = j4;
    }
}
