package com.facebook.aura.shopping.view;

import X.AKQ;
import X.ATD;
import X.AWA;
import X.AbstractC1561Alb;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0zJ;
import X.C10G;
import X.C1515AkP;
import X.C1710Aot;
import X.C78N;
import X.C8j3;
import X.C8j5;
import X.F60;
import X.G0U;
import X.InterfaceC1068ATy;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.Path;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchStarRatingKt {
    public static final int RATING_STAR_COUNT = 5;
    public static final long RatingStarColor = C8j3.A0U(4294948864L);
    public static final float STAR_INNER_RADIUS_RATIO = 0.42f;
    public static final int STAR_POINTS = 5;
    public static final float StarSize = 16.0f;
    public static final float StarSpacing = 2.0f;

    /* renamed from: RatingStar-PEIptTM, reason: not valid java name */
    public static final void m2043RatingStarPEIptTM(float f, long j, long j2, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1125193640);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0O(bfm, j2);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A07(bfm, f2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA04 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA04 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 9363, 9362), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, f2);
            boolean zA1D = AnonymousClass003.A1D(iA04) | AnonymousClass004.A1F(iA04) | ((iA04 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchStarRatingKt$RatingStar$1$1(j2, f, j);
                BBI.A0T(bfm, objAaT);
            }
            C0zJ.A00(bRgA07, (G0U) objAaT, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchStarRatingKt$RatingStar$2(f, j, j2, f2, bRg2, i, i2);
        }
    }

    /* renamed from: StarRatingRow-6a0pyJM, reason: not valid java name */
    public static final void m2044StarRatingRow6a0pyJM(double d, BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        bfm.AgG(1625360657);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(bfm.A61(d) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = StarSize;
            }
            long j = AuraTheme.INSTANCE.getColors(bfm, 6).border;
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, StarSpacing, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            bfm.AgE(1000641558);
            int i5 = 0;
            do {
                m2043RatingStarPEIptTM((float) ATD.A00(d - i5, 0.0d, 1.0d), RatingStarColor, j, f2, null, bfm, ((iA05 << 3) & 7168) | 48, 16);
                i5++;
            } while (i5 < 5);
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchStarRatingKt$StarRatingRow$2(d, bRg2, f2, i, i2);
        }
    }

    public static final float getStarSize() {
        return StarSize;
    }

    /* renamed from: starPath-uvyYCjk, reason: not valid java name */
    public static final InterfaceC1068ATy m2047starPathuvyYCjk(long j) {
        Path path;
        float fA03 = AnonymousClass003.A03(j) / 2.0f;
        float fA032 = C8j5.A03(j) / 2.0f;
        float fA01 = AWA.A01(j) / 2.0f;
        float f = 0.42f * fA01;
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        int i = 0;
        do {
            float f2 = f;
            if (i % 2 == 0) {
                f2 = fA01;
            }
            double d = ((i * 3.141592653589793d) / 5.0d) - 1.5707963267948966d;
            double d2 = f2;
            float fCos = ((float) (Math.cos(d) * d2)) + fA03;
            float fSin = ((float) (d2 * Math.sin(d))) + fA032;
            path = c1710AotA00.A03;
            if (i == 0) {
                path.moveTo(fCos, fSin);
            } else {
                path.lineTo(fCos, fSin);
            }
            i++;
        } while (i < 10);
        path.close();
        return c1710AotA00;
    }
}
