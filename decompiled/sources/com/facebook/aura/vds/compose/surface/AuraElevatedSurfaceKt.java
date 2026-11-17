package com.facebook.aura.vds.compose.surface;

import X.AKQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C0z7;
import X.C11U;
import X.C1515AkP;
import X.C1D8;
import X.C1DE;
import X.C1DI;
import X.C1DM;
import X.C1b8;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bouncy.AuraBouncyIndication;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraElevatedSurfaceKt {
    /* renamed from: AuraElevatedPillSurface-DzVHIIc, reason: not valid java name */
    public static final void m2622AuraElevatedPillSurfaceDzVHIIc(BRg bRg, float f, Function0<Unit> function0, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        Function0<Unit> function02 = function0;
        C7384Etj.A0Y(g0w, 3);
        bfm.AgG(548195632);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 24.0f;
            }
            if (i5 != 0) {
                function02 = null;
            }
            AuraElevatedColors auraElevatedColorsRememberAuraElevatedColors = rememberAuraElevatedColors(bfm, 0);
            boolean zA1N = AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = C1D8.A00(f2);
                bfm.Ai0(objAaT);
            }
            BRg bRgAuraElevatedSurface = auraElevatedSurface(bRg2, auraElevatedColorsRememberAuraElevatedColors, (C1DE) objAaT, (InterfaceC1072AWd) AnonymousClass005.A0d(bfm), function02);
            int i6 = iA0d & 7168;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgAuraElevatedSurface);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0D);
            AnonymousClass004.A1B(bbi, C0z7.A00, bfm, g0w, ((i6 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraElevatedSurfaceKt$AuraElevatedPillSurface$2(bRg2, f2, function02, g0w, i, i2);
        }
    }

    public static final BRg auraElevatedSurface(BRg bRg, AuraElevatedColors auraElevatedColors, C1DM c1dm, InterfaceC1072AWd interfaceC1072AWd, Function0<Unit> function0) {
        BRg bRgThen = bRg;
        C7384Etj.A0Y(bRgThen, 0);
        AnonymousClass005.A11(auraElevatedColors, c1dm, interfaceC1072AWd, 1);
        if (function0 != null) {
            float f = 0.0f;
            bRgThen = bRgThen.then(C0v5.A01(new AuraBouncyIndication(f, f, f, f, f, 31, null), interfaceC1072AWd, BRg.A00, null, null, new AuraElevatedSurfaceKt$auraElevatedSurface$1$1(function0), true));
        }
        return C1DI.A02(C1b8.A03(C11U.A03(bRgThen, c1dm), c1dm, auraElevatedColors.background), c1dm, 1.0f, auraElevatedColors.border);
    }

    public static final AuraElevatedColors rememberAuraElevatedColors(BFM bfm, int i) {
        AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
        boolean zA64 = bfm.A64(auraColorsA0c.elevated) | bfm.A64(auraColorsA0c.elevatedBorder);
        Object objAaT = bfm.AaT();
        if (zA64 || objAaT == C78N.A00) {
            objAaT = new AuraElevatedColors(auraColorsA0c.elevated, auraColorsA0c.elevatedBorder);
            bfm.Ai0(objAaT);
        }
        return (AuraElevatedColors) objAaT;
    }
}
