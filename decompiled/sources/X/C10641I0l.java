package X;

/* renamed from: X.I0l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10641I0l implements InterfaceC10545Hqy {
    public final int $t;
    public final Object A00;

    @Override // X.InterfaceC10545Hqy
    public final double ANv(double d) {
        switch (this.$t) {
            case 0:
                return ATD.A00(((C10376HDg) this.A00).A05.ANv(d), r1.A01, r1.A00);
            case 1:
                return ((C10376HDg) this.A00).A03.ANv(ATD.A00(d, r1.A01, r1.A00));
            case 2:
                return HDi.A00((HAi) this.A00, d);
            case 3:
                return HDi.A02((HAi) this.A00, d);
            case 4:
                HAi hAi = (HAi) this.A00;
                return d >= hAi.A03 ? Math.pow((hAi.A00 * d) + hAi.A01, hAi.A06) : hAi.A02 * d;
            case 5:
                return HDi.A01((HAi) this.A00, d);
            case 6:
                return HDi.A03((HAi) this.A00, d);
            default:
                HAi hAi2 = (HAi) this.A00;
                double d2 = hAi2.A00;
                double d3 = hAi2.A01;
                double d4 = hAi2.A02;
                return d >= hAi2.A03 * d4 ? (Math.pow(d, 1.0d / hAi2.A06) - d3) / d2 : d / d4;
        }
    }

    public C10641I0l(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }
}
