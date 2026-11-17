package X;

/* loaded from: classes4.dex */
public final class BBa extends AbstractC2227BBx {
    public static final BBa A00 = new BBa();

    public BBa() {
        super(0, 2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BCx;LX/Ahw<*>;LX/BBJ;LX/BCj;LX/BCT;)V */
    @Override // X.AbstractC2227BBx
    public final void A01(InterfaceC1370Ahw interfaceC1370Ahw, InterfaceC2238BCj interfaceC2238BCj, BBJ bbj, InterfaceC2252BCx interfaceC2252BCx, BCT bct) {
        int iA04;
        int i;
        BCQ bcq = (BCQ) interfaceC2252BCx;
        Object[] objArr = bcq.A03.A05;
        int i2 = bcq.A01;
        B8p b8p = (B8p) objArr[i2];
        BCR bcr = (BCR) objArr[i2 + 1];
        C7384Etj.A0Z(interfaceC1370Ahw, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        int iA0L = bbj.A0L(bcr);
        if (C8j3.A1T(bbj.A00, iA0L)) {
            while (true) {
                iA04 = bbj.A08;
                if ((iA0L > iA04 && iA0L < bbj.A01) || (iA04 == 0 && iA0L == 0)) {
                    break;
                }
                bbj.A0T();
                if (bbj.A0e(iA04)) {
                    interfaceC1370Ahw.Ahp();
                }
                bbj.A0R();
            }
            int i3 = bbj.A00;
            while (iA04 >= 0 && !bbj.A0e(iA04)) {
                iA04 = BBJ.A04(bbj, bbj.A0G, iA04);
            }
            int i4 = iA04 + 1;
            int iA0K = 0;
            while (i4 < i3) {
                boolean zA0f = bbj.A0f(i3, i4);
                boolean zA0e = bbj.A0e(i4);
                if (zA0f) {
                    if (zA0e) {
                        iA0K = 0;
                    }
                    i4++;
                } else {
                    iA0K += zA0e ? 1 : bbj.A0G[(BBJ.A02(bbj, i4) * 5) + 1] & 67108863;
                    i4 += bbj.A0G[(BBJ.A02(bbj, i4) * 5) + 3];
                }
            }
            while (true) {
                i = bbj.A00;
                if (i >= iA0L) {
                    break;
                }
                if (bbj.A0f(iA0L, i)) {
                    if (i < bbj.A01 && (bbj.A0G[(BBJ.A02(bbj, i) * 5) + 1] & 1073741824) != 0) {
                        interfaceC1370Ahw.A9B(bbj.A0O(i));
                        iA0K = 0;
                    }
                    bbj.A0U();
                } else {
                    iA0K += bbj.A0K();
                }
            }
            if (i == iA0L) {
                b8p.A00 = iA0K;
                return;
            }
        }
        BBL.A01("Check failed");
        throw F60.createAndThrow();
    }
}
