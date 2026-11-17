package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;

/* renamed from: X.APs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1011APs {
    public static final C1003AOr<C2ae> A02;
    public static final C1003AOr<BL4> A03;
    public static final C31w<C15k, ARY> A04 = new AOl(BUT.A00(6), BUT.A00(7));
    public static final C1003AOr<Float> A00 = new C1003AOr<>(null, 1.0f, 400.0f);
    public static final C1003AOr<B6A> A01 = new C1003AOr<>(null, 1.0f, 400.0f);

    static {
        long jA0N = C8j3.A0N();
        A02 = new C1003AOr<>(C8j3.A0l(jA0N), 1.0f, 400.0f);
        A03 = new C1003AOr<>(BL4.A00(jA0N), 1.0f, 400.0f);
    }

    public static /* synthetic */ AQI A03(float f, int i) {
        C1003AOr c1003AOrA00 = C1003AOr.A00(null);
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return A04(c1003AOrA00, f);
    }

    public static final APu A08(AOe<C2ae> aOe, G0U<? super Integer, Integer> g0u) {
        C05463bs c05463bs = new C05463bs(g0u, 6);
        APu aPu = APu.A00;
        return new AQI(A0J(aOe, c05463bs));
    }

    public static final APu A09(AOe<C2ae> aOe, G0U<? super Integer, Integer> g0u) {
        C05463bs c05463bs = new C05463bs(g0u, 7);
        APu aPu = APu.A00;
        return new AQI(A0J(aOe, c05463bs));
    }

    public static final AQJ A0E(AOe aOe) {
        APt aPt = APt.A00;
        return new AQJ(new C1012APv(null, new C1013APw(aOe, 0.0f), null, null, C9jH.A00, false));
    }

    public static final APu A04(AOe<Float> aOe, float f) {
        APu aPu = APu.A00;
        return new AQI(new C1012APv(null, new C1013APw(aOe, f), null, null, C9jH.A00, false));
    }

    public static final APu A05(AOe<Float> aOe, float f, long j) {
        APu aPu = APu.A00;
        return new AQI(new C1012APv(null, null, new C1016APz(aOe, f, j), null, C9jH.A00, false));
    }

    public static final AQI A06(AOe aOe, C1AC c1ac, G0U g0u) {
        return A07(aOe, C7384Etj.areEqual(c1ac, C2VU.A05) ? C2VU.A0C : C7384Etj.areEqual(c1ac, C2VU.A03) ? C2VU.A06 : C2VU.A09, BUX.A00((Object) g0u, 3));
    }

    public static final AQI A07(AOe aOe, Alignment alignment, G0U g0u) {
        APu aPu = APu.A00;
        return new AQI(new C1012APv(new C1015APy(aOe, alignment, g0u), null, null, null, C9jH.A00, false));
    }

    public static final APt A0F(AOe<Float> aOe, float f, long j) {
        APt aPt = APt.A00;
        return new AQJ(new C1012APv(null, null, new C1016APz(aOe, f, j), null, C9jH.A00, false));
    }

    public static final AQJ A0G(AOe aOe, C1AC c1ac, G0U g0u) {
        return A0H(aOe, C7384Etj.areEqual(c1ac, C2VU.A05) ? C2VU.A0C : C7384Etj.areEqual(c1ac, C2VU.A03) ? C2VU.A06 : C2VU.A09, BUX.A00((Object) g0u, 4));
    }

    public static final AQJ A0H(AOe aOe, Alignment alignment, G0U g0u) {
        APt aPt = APt.A00;
        return new AQJ(new C1012APv(new C1015APy(aOe, alignment, g0u), null, null, null, C9jH.A00, false));
    }

    public static final APt A0I(AOe<C2ae> aOe, G0U<? super Integer, Integer> g0u) {
        C05463bs c05463bs = new C05463bs(g0u, 9);
        APt aPt = APt.A00;
        return new AQJ(A0J(aOe, c05463bs));
    }

    public static C1012APv A0J(AOe aOe, G0U g0u) {
        return new C1012APv(null, null, null, new C1014APx(aOe, g0u), C9jH.A00, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg A0K(X.APu r20, X.APt r21, X.AOP r22, X.BFM r23, java.lang.String r24, kotlin.jvm.functions.Function0 r25, int r26) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1011APs.A0K(X.APu, X.APt, X.AOP, X.BFM, java.lang.String, kotlin.jvm.functions.Function0, int):X.BRg");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.APu] */
    public static final APu A00(APu aPu, AOP aop, BFM bfm) {
        AQI aqiA00;
        boolean zA1S = C8j3.A1S(bfm.A65(aop) ? 1 : 0);
        Object objAaT = bfm.AaT();
        if (zA1S || objAaT == C78N.A00) {
            objAaT = AbstractC1798ArH.A07(aPu, bfm);
        }
        MutableState mutableState = (MutableState) objAaT;
        AOH aoh = aop.A02;
        Object objA09 = aoh.A09();
        MutableState mutableState2 = aop.A07;
        if (objA09 == mutableState2.getValue() && aoh.A09() == EnumC04711Bv.A04) {
            if (aop.A0G()) {
                mutableState.Af8(aPu);
            } else {
                aqiA00 = APu.A00;
                mutableState.Af8(aqiA00);
            }
        } else if (mutableState2.getValue() == EnumC04711Bv.A04) {
            aqiA00 = ((APu) mutableState.getValue()).A00(aPu);
            mutableState.Af8(aqiA00);
        }
        return (APu) mutableState.getValue();
    }

    public static /* synthetic */ APu A01(C1AC c1ac, int i) {
        C1003AOr c1003AOrA00 = C1003AOr.A00(BL4.A00(C8j3.A0N()));
        if ((i & 2) != 0) {
            c1ac = C2VU.A03;
        }
        return A06(c1003AOrA00, c1ac, new C05433bp(8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.APt] */
    public static final APt A0A(APt aPt, AOP aop, BFM bfm) {
        AQJ aqjA00;
        boolean zA1S = C8j3.A1S(bfm.A65(aop) ? 1 : 0);
        Object objAaT = bfm.AaT();
        if (zA1S || objAaT == C78N.A00) {
            objAaT = AbstractC1798ArH.A07(aPt, bfm);
        }
        MutableState mutableState = (MutableState) objAaT;
        AOH aoh = aop.A02;
        Object objA09 = aoh.A09();
        MutableState mutableState2 = aop.A07;
        if (objA09 == mutableState2.getValue() && aoh.A09() == EnumC04711Bv.A04) {
            if (aop.A0G()) {
                mutableState.Af8(aPt);
            } else {
                aqjA00 = APt.A00;
                mutableState.Af8(aqjA00);
            }
        } else if (mutableState2.getValue() != EnumC04711Bv.A04) {
            aqjA00 = ((APt) mutableState.getValue()).A00(aPt);
            mutableState.Af8(aqjA00);
        }
        return (APt) mutableState.getValue();
    }

    public static /* synthetic */ APt A0B(C1AC c1ac, int i) {
        C1003AOr c1003AOrA00 = C1003AOr.A00(BL4.A00(C8j3.A0N()));
        if ((i & 2) != 0) {
            c1ac = C2VU.A03;
        }
        return A0G(c1003AOrA00, c1ac, new C05433bp(11));
    }
}
