package X;

/* renamed from: X.DEd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4910DEd implements InterfaceC5903Drm {
    public final double A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;

    @Override // X.InterfaceC5903Drm
    public final /* synthetic */ C5480DjH ADi() {
        return null;
    }

    @Override // X.InterfaceC5903Drm
    public final long AFJ(String str, int i, long j) {
        return (long) (this.A00 * (i < this.A02 ? this.A04 : i < this.A01 ? this.A05 : this.A03));
    }

    @Override // X.InterfaceC5903Drm
    public final long AFM(String str, int i) {
        return AFJ(str, i, 0L);
    }

    public final String toString() {
        return FGI.A0U(FGI.A0B(this.A03 / 1000, "sbw_h="), FGI.A0B(this.A05 / 1000, ", sbw_m="), FGI.A0B(this.A04 / 1000, ", sbw_l="));
    }

    public C4910DEd(double d, int i, int i2, long j, long j2, long j3) {
        this.A03 = j;
        this.A05 = j2;
        this.A04 = j3;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = d;
    }

    @Override // X.InterfaceC5903Drm
    public final long AFL(int i) {
        return -1L;
    }
}
