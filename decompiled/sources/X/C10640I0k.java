package X;

/* renamed from: X.I0k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10640I0k implements InterfaceC10545Hqy {
    public final int $t;
    public final double A00;

    public C10640I0k(double d, int i) {
        this.$t = i;
        this.A00 = d;
    }

    @Override // X.InterfaceC10545Hqy
    public final double ANv(double d) {
        if (this.$t != 0) {
            double d2 = this.A00;
            if (d < 0.0d) {
                d = 0.0d;
            }
            return Math.pow(d, d2);
        }
        double d3 = this.A00;
        if (d < 0.0d) {
            d = 0.0d;
        }
        return Math.pow(d, 1.0d / d3);
    }
}
