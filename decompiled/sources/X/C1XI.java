package X;

import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.picker.AuraDatePickerKt;

/* renamed from: X.1XI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XI {
    public static final C1XI A00 = new C1XI();

    static {
        new ADq(AuraDatePickerKt.AURA_DATE_PICKER_MIN_YEAR, 2100);
    }

    public static final C1Wz A00(C04921Xv c04921Xv, BFM bfm) {
        C1Wz c1Wz = c04921Xv.A02;
        bfm.AgE(-653681037);
        if (c1Wz == null) {
            long jA00 = AbstractC04931Xw.A00(c04921Xv, C1XJ.A00);
            long jA002 = AbstractC04931Xw.A00(c04921Xv, C1XJ.A0B);
            long jA003 = AbstractC04931Xw.A00(c04921Xv, C1XJ.A09);
            long jA004 = AbstractC04931Xw.A00(c04921Xv, C1XJ.A0L);
            long jA005 = AbstractC04931Xw.A00(c04921Xv, C1XJ.A0E);
            long j = c04921Xv.A0K;
            Integer num = C1XJ.A0K;
            long jA006 = AbstractC04931Xw.A00(c04921Xv, num);
            long jA007 = AbstractC04931Xw.A00(c04921Xv, num);
            long jA04 = HxS.A04(HDi.A0O[(int) (jA007 & 63)], B6A.A03(jA007), B6A.A02(jA007), B6A.A01(jA007), 0.38f);
            Integer num2 = C1XJ.A07;
            long jA008 = AbstractC04931Xw.A00(c04921Xv, num2);
            Integer num3 = C1XJ.A0I;
            long jA009 = AbstractC04931Xw.A00(c04921Xv, num3);
            long jA0H = AnonymousClass006.A0H(c04921Xv, num3);
            Integer num4 = C1XJ.A0H;
            long jA0010 = AbstractC04931Xw.A00(c04921Xv, num4);
            long jA0H2 = AnonymousClass006.A0H(c04921Xv, num4);
            Integer num5 = C1XJ.A08;
            long jA0011 = AbstractC04931Xw.A00(c04921Xv, num5);
            long jA0H3 = AnonymousClass006.A0H(c04921Xv, num5);
            Integer num6 = C1XJ.A05;
            long jA0012 = AbstractC04931Xw.A00(c04921Xv, num6);
            long jA0H4 = AnonymousClass006.A0H(c04921Xv, num6);
            Integer num7 = C1XJ.A04;
            long jA0013 = AbstractC04931Xw.A00(c04921Xv, num7);
            long jA0H5 = AnonymousClass006.A0H(c04921Xv, num7);
            long jA0014 = AbstractC04931Xw.A00(c04921Xv, num2);
            long jA0015 = AbstractC04931Xw.A00(c04921Xv, C1XJ.A06);
            long jA0016 = AbstractC04931Xw.A00(c04921Xv, C1XJ.A0F);
            c1Wz = new C1Wz(C1A9.A00(c04921Xv, bfm), jA00, jA002, jA003, jA004, jA005, j, jA006, jA04, jA008, jA009, jA0H, jA0010, jA0H2, jA0011, jA0H3, jA0012, jA0H4, jA0013, jA0H5, jA0014, jA0015, AbstractC04931Xw.A00(c04921Xv, C1XJ.A0D), jA0016, AbstractC04931Xw.A00(c04921Xv, C0xt.A00));
            c04921Xv.A02 = c1Wz;
        }
        AnonymousClass002.A19(bfm);
        return c1Wz;
    }

    public final void A01(int i, BRg bRg, BFM bfm, int i2, int i3) {
        int i4;
        BRg bRg2 = bRg;
        bfm.AgG(327413563);
        int iA0D = (i3 & 1) != 0 ? i2 | 6 : (i2 & 6) == 0 ? i2 | AnonymousClass004.A0D(bfm, i) : i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((iA0D & 19) == 18 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (i == 0) {
                bfm.AgE(406439148);
                i4 = R.string._name_removed__res_0x7f120cca;
            } else if (i == 1) {
                bfm.AgE(406443211);
                i4 = R.string._name_removed__res_0x7f120cbd;
            } else {
                bfm.AgE(-285079389);
                AnonymousClass001.A1D(bfm);
            }
            C0yq.A00(bfm, bRg2, null, null, null, null, null, null, C1EO.A00(bfm, i4), null, 0, 0, 0, iA0D & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 131068, 0L, 0L, 0L, 0L, false);
            AnonymousClass001.A1D(bfm);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C04751Xd(this, bRg2, i, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C1X9 r39, X.BFM r40, X.BRg r41, java.lang.Long r42, int r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XI.A02(X.1X9, X.BFM, X.BRg, java.lang.Long, int, int, int):void");
    }
}
