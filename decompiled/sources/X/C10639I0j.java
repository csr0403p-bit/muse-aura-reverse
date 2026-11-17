package X;

/* renamed from: X.I0j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10639I0j implements InterfaceC10545Hqy {
    public final int $t;

    @Override // X.InterfaceC10545Hqy
    public final double ANv(double d) {
        double dPow;
        switch (this.$t) {
            case 0:
                C10376HDg c10376HDg = HDi.A0J;
                double d2 = d < 0.0d ? -d : d;
                if (d2 < 0.04045d * 0.07739938080495357d) {
                    dPow = d2 / 0.07739938080495357d;
                    break;
                } else {
                    dPow = (Math.pow(d2, 1.0d / 2.4d) - 0.05213270142180095d) / 0.9478672985781991d;
                    break;
                }
            case 1:
                C10376HDg c10376HDg2 = HDi.A0J;
                double d3 = d < 0.0d ? -d : d;
                if (d3 < 0.04045d) {
                    dPow = 0.07739938080495357d * d3;
                    break;
                } else {
                    dPow = Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d);
                    break;
                }
            case 2:
                return HDi.A01(HDi.A0K, d);
            case 3:
                return HDi.A00(HDi.A0K, d);
            case 4:
                return HDi.A03(HDi.A0L, d);
            case 5:
                return HDi.A02(HDi.A0L, d);
            case 6:
                return d;
            default:
                return 0.0d;
        }
        return Math.copySign(dPow, d);
    }

    public C10639I0j(int i) {
        this.$t = i;
    }
}
