package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AtY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1913AtY {
    public static final void A01(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1949207773);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A07(null, bfm);
            }
            MutableState mutableState = (MutableState) objAaT;
            C1940Aud c1940Aud = (C1940Aud) mutableState.getValue();
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = C2297BSx.A00(mutableState, 4);
                bfm.Ai0(objAaT2);
            }
            A00(c1940Aud, bfm, bRg2, (G0U) objAaT2, g0v, (iA0d & 14) | 384 | ((iA0d << 6) & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3ba(bRg2, g0v, i, i2, 0);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/Aud;LX/G0U<-LX/Aud;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(C1940Aud c1940Aud, BFM bfm, BRg bRg, G0U g0u, G0V g0v, int i, int i2) {
        C1940Aud value;
        BRg bRg2 = bRg;
        bfm.AgG(-917932944);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1940Aud);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            AFs<C1949Aun, Long> aFs = C1949Aun.A0C;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C2283BSj.A00(bfm, 11);
            }
            C1949Aun c1949Aun = (C1949Aun) AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new C1943Aug(c1949Aun);
                BBI.A0T(bfm, objAaT2);
            }
            C1943Aug c1943Aug = (C1943Aug) objAaT2;
            BBI bbi = (BBI) bfm;
            Object objA07 = AKO.A07(Am0.A01, bbi);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            c1943Aug.A05 = (C0dx) AKO.A07(Am0.A08, bbi);
            boolean zA1K = AnonymousClass003.A1K(bfm, c3ux, objA07);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == obj) {
                objAaT3 = new BT9(5, objA07, c3ux);
                bfm.Ai0(objAaT3);
            }
            c1943Aug.A08 = (G0U) objAaT3;
            c1943Aug.A07 = (C1JY) AKO.A07(Am0.A0F, bbi);
            c1943Aug.A09 = new BT9(6, g0u, c1943Aug);
            MutableState<C1940Aud> mutableState = c1943Aug.A0F;
            mutableState.Af8(c1940Aud);
            if (c1940Aud != null) {
                C1943Aug.A04(c1943Aug);
            }
            bfm.AgE(-82280708);
            c1943Aug.A01 = C7Vd.A00(BI3.A03, bfm, null, 54);
            c1943Aug.A0A = c3ux;
            BBI.A0R(bbi, false);
            c1943Aug.A0C();
            BRg bRgA02 = BRg.A00;
            BRg bRgA00 = AXZ.A00(AaM.A00(C1O5.A00(null, C9xg.A00(BHJ.A00(ASZ.A00(AaM.A00(bRgA02, new BSK(4, C2293BSt.A00(c1943Aug, 10), c1943Aug), Unit.INSTANCE), new C2297BSx(c1943Aug, 11)), c1943Aug.A03), new C2297BSx(c1943Aug, 12)), true), new BSJ(new C2297BSx(c1943Aug, 13), 10), 8675309), new C2297BSx(c1943Aug, 17));
            if (c1943Aug.A0J.getValue() != null && MutableState.A0A((MutableState) c1943Aug.A0E) && (value = mutableState.getValue()) != null && !C7384Etj.areEqual(value.A01, value.A00)) {
                bRgA02 = AxM.A02(bRgA02, AbstractC2139Az7.A00, new BT0(c1943Aug, 4));
            }
            C07w.A00(bRg2.then(bRgA00.then(bRgA02).then(new C1879Ast(new C2296BSw(c1943Aug, 10)))), B1V.A00(bfm, new BTM(c1943Aug, c1949Aun, g0v, 2), -1799563674), bfm, 48, 0);
            boolean zA67 = bfm.A67(c1943Aug);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new C2297BSx(c1943Aug, 3);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, c1943Aug);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2300BTa(g0v, g0u, c1940Aud, bRg2, i, i2, 1);
        }
    }
}
