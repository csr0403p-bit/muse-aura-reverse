package X;

import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1hc, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1hc {
    /* JADX WARN: Incorrect types in method signature: (LX/1he;LX/BRg;LX/1hd;LX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, BRg bRg, C1he c1he, C1hd c1hd, G0U g0u, int i, int i2) {
        BBb bBbAAc;
        int i3;
        boolean z;
        ApQ apQA0X;
        BRg bRgA04;
        BRg bRg2 = bRg;
        C1hd c1hd2 = c1hd;
        G0U g0u2 = g0u;
        C7384Etj.A0Y(c1he, 0);
        bfm.AgG(1261545868);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1he) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1hd2);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                c1hd2 = new C1hd(null, null, null, 0.0f, 0.0f, 0, 31);
            }
            if (i6 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new C05433bp(24);
                    bfm.Ai0(objAaT);
                }
                g0u2 = (G0U) objAaT;
            }
            String str = c1he.A00;
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    i3 = 3;
                    bBbAAc.A06 = new C3cA(c1he, g0u2, c1hd2, bRg2, i, i2, i3);
                }
                return;
            }
            Object[] objArr = {str};
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new C05443bq(17);
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            int i7 = c1hd2.A02;
            boolean zA63 = bfm.A63(i7) | bfm.A65(str);
            Object objAaT3 = bfm.AaT();
            if (zA63 || objAaT3 == obj) {
                objAaT3 = AnonymousClass004.A11(bfm, -1);
            }
            MutableState mutableState = (MutableState) objAaT3;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e0e);
            if (MutableState.A0A(mutableStateA0N) || MutableState.A02(mutableState) < 0) {
                z = false;
                apQA0X = AnonymousClass005.A0X(str);
            } else {
                z = true;
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                c1731ApSA0W.A0E(C7BY.A0G(BQG.A17(str, MutableState.A02(mutableState))).toString());
                int iA02 = c1731ApSA0W.A02(c1hd2.A03);
                try {
                    c1731ApSA0W.A0E(strA01);
                    c1731ApSA0W.A06(iA02);
                    apQA0X = c1731ApSA0W.A04();
                } catch (Throwable th) {
                    c1731ApSA0W.A06(iA02);
                    throw th;
                }
            }
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), "place_summary_section");
            if (z) {
                bfm.AgE(1164830889);
                BS0 bs0 = BRg.A00;
                boolean zA65 = bfm.A65(mutableStateA0N);
                Object objAaT4 = bfm.AaT();
                if (zA65 || objAaT4 == obj) {
                    objAaT4 = new C05453br(mutableStateA0N, 17);
                    bfm.Ai0(objAaT4);
                }
                bRgA04 = C0v5.A04(bs0, null, null, (Function0) objAaT4, true);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 1164831988);
                bRgA04 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(bRgA00.then(bRgA04), c1hd2.A00, c1hd2.A01);
            C1822Arm c1822Arm = c1hd2.A04;
            boolean zA1P = AnonymousClass003.A1P(bfm, mutableState, strA01, bfm.A65(mutableStateA0N) | ((iA0d & 7168) == 2048));
            Object objAaT5 = bfm.AaT();
            if (zA1P || objAaT5 == obj) {
                objAaT5 = new C14c(mutableStateA0N, mutableState, strA01, g0u2);
                bfm.Ai0(objAaT5);
            }
            G0U g0u3 = (G0U) objAaT5;
            if (MutableState.A0A(mutableStateA0N)) {
                i7 = Integer.MAX_VALUE;
            }
            AbstractC1727ApL.A04(bfm, bRgA0B, null, apQA0X, c1822Arm, null, g0u3, 0, i7, 0, 0, 0, 1968, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i3 = 2;
            bBbAAc.A06 = new C3cA(c1he, g0u2, c1hd2, bRg2, i, i2, i3);
        }
    }
}
