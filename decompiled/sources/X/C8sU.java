package X;

import com.facebook.common.dextricks.RuntimeInternals;

/* renamed from: X.8sU, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8sU {
    public static final void A00(BFM bfm, C1822Arm c1822Arm, String str, String str2, float f, float f2, float f3, int i, int i2) {
        float f4 = f2;
        float f5 = f3;
        boolean zA1b = AnonymousClass004.A1b(str, c1822Arm);
        C7384Etj.A0Y(str2, 3);
        bfm.AgG(-956536149);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f4);
        }
        int i4 = i2 & 32;
        int iA09 = 196608;
        if (i4 != 0) {
            iA0d |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f5);
            iA0d |= iA09;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                f4 = 0.0f;
            }
            if (i4 != 0) {
                f5 = 0.0f;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A0C(C3U4.A0C(BRg.A00, f5, f4, f5, 0.0f), 0.0f, 0.0f, 0.0f, f), str2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = BUU.A00(bfm, 36);
            }
            AbstractC1727ApL.A02(null, bfm, AnonymousClass001.A0Y(bRgA00, objAaT, zA1b), null, c1822Arm, str, null, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, (iA0d & 14) | ((iA0d << 3) & 896), 1016, zA1b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8sV(c1822Arm, str, str2, f, f4, f5, i, i2);
        }
    }
}
