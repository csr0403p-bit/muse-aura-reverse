package X;

import kotlin.Unit;

/* renamed from: X.0yq, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0yq {
    public static final AKH<C1822Arm> A00 = new AGN(AGF.A01(), new C05443bq(11));

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/BRg;JJLX/B0A;LX/ApY;LX/Aw5;JLX/BG3;LX/1YL;JIZIILX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/Arm;LX/BFM;III)V */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.BFM r68, X.BRg r69, X.C1822Arm r70, X.AbstractC1996Aw5 r71, X.B0A r72, X.C1736ApY r73, X.C1YL r74, X.BG3 r75, java.lang.String r76, X.G0U r77, int r78, int r79, int r80, int r81, int r82, int r83, long r84, long r86, long r88, long r90, boolean r92) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0yq.A00(X.BFM, X.BRg, X.Arm, X.Aw5, X.B0A, X.ApY, X.1YL, X.BG3, java.lang.String, X.G0U, int, int, int, int, int, int, long, long, long, long, boolean):void");
    }

    public static final void A01(C1822Arm c1822Arm, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-460300127);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1822Arm) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((iA0d & 19) == 18 && bfm.AKh()) {
            bfm.Afo();
        } else {
            AKH<C1822Arm> akh = A00;
            AnonymousClass001.A14(bfm, akh.A04(((C1822Arm) bfm.A6v(akh)).A02(c1822Arm)), g0v, iA0d);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c0(c1822Arm, g0v, i, 1);
        }
    }
}
