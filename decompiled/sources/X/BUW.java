package X;

/* loaded from: classes4.dex */
public final class BUW extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUW(int i, int i2) {
        super(1);
        this.$t = i2;
        this.A00 = i;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AQI aqiA00;
        APt aPtA0I;
        APt aPtA0E;
        boolean zA01;
        switch (this.$t) {
            case 0:
            case 1:
                AnonymousClass005.A0w(obj);
                return Integer.valueOf(this.A00);
            case 2:
                if (((C04811Xk) ((AOB) obj).ALW()).A00 == 1) {
                    APu aPuA09 = AbstractC1011APs.A09(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), BUT.A00(13));
                    C28s c28s = C2HU.A01;
                    aqiA00 = aPuA09.A00(AbstractC1011APs.A04(new ASj(c28s, 100, 100), 0.0f));
                    aPtA0I = ASj.A00(c28s, 100, 0);
                    aPtA0E = AbstractC1011APs.A0I(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), new BUW(this.A00, 0));
                } else {
                    C28s c28s2 = C2HU.A01;
                    aqiA00 = AbstractC1011APs.A09(new ASj(c28s2, 300, 50), new BUW(this.A00, 1)).A00(AbstractC1011APs.A04(new ASj(c28s2, 100, 100), 0.0f));
                    aPtA0I = AbstractC1011APs.A0I(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), BUT.A00(14));
                    aPtA0E = AbstractC1011APs.A0E(AnonymousClass002.A0J(c28s2, 100));
                }
                ANU anuA00 = ANR.A00(aqiA00, aPtA0I.A00(aPtA0E));
                anuA00.A00 = new ANS(BUR.A00(1), true);
                return anuA00;
            case 3:
            case 4:
            default:
                zA01 = ((C1506AkD) obj).Ab9(this.A00);
                break;
            case 5:
                C1506AkD c1506AkD = (C1506AkD) obj;
                int iIntValue = C1506AkD.A01(c1506AkD, this.A00).intValue();
                if (iIntValue == 0) {
                    zA01 = AbstractC1507AkE.A01(c1506AkD);
                    break;
                } else if (iIntValue == 2) {
                    zA01 = true;
                    break;
                } else {
                    if (iIntValue != 1 && iIntValue != 3) {
                        throw C3cG.A0q();
                    }
                    zA01 = false;
                    break;
                }
        }
        return Boolean.valueOf(zA01);
    }
}
