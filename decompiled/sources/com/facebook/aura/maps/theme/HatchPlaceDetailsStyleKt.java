package com.facebook.aura.maps.theme;

import X.AnonymousClass005;
import X.BFM;
import X.BMk;
import X.BNN;
import X.C07429Vx;
import X.C07509Wi;
import X.C1326AhD;
import X.C1822Arm;
import X.C1824Aro;
import X.C1hd;
import X.C78N;
import X.C7cR;
import X.C8sO;
import X.C9G2;
import X.C9W7;
import X.C9WB;
import X.C9WH;
import X.C9WN;
import X.C9WY;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;

/* loaded from: classes4.dex */
public abstract class HatchPlaceDetailsStyleKt {
    public static final C9G2 buildHatchPlaceDetailsStyle(AuraColors auraColors, AuraTypography auraTypography, AuraDimensions auraDimensions) {
        long j = auraColors.primaryText;
        long j2 = auraColors.secondaryText;
        long j3 = auraColors.secondaryModal;
        C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTypography.title2Medium, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L);
        C1822Arm c1822ArmA002 = C1822Arm.A00(null, auraTypography.subheadlineRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j2, 0L, 0L, 0L);
        float f = AuraDimensKt.SpacingNone;
        float f2 = AuraDimensKt.SpacingMicro;
        C9W7 c9w7 = new C9W7(c1822ArmA00, c1822ArmA002, f, f2, 6848, auraColors.iconSuccess, auraColors.destructiveIcon.enabled, auraColors.ratingStar, j3);
        C07509Wi c07509Wi = new C07509Wi(new C1326AhD(auraColors.primaryButtonBackground), auraTypography.bodyMedium, 992, auraColors.onMedia, j3, j);
        C1822Arm c1822ArmA003 = C1822Arm.A00(null, auraTypography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L);
        C1822Arm c1822Arm = auraTypography.bodyMedium;
        C1hd c1hd = new C1hd(C1824Aro.A01(c1822Arm.A02, 65534, j, 0L), c1822ArmA003, f, f);
        C9WB c9wb = new C9WB(16319, j3);
        C1822Arm c1822ArmA004 = C1822Arm.A00(null, c1822Arm, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L);
        float f3 = AuraDimensKt.SpacingMedium;
        C07429Vx c07429Vx = new C07429Vx(c1822ArmA004, C1822Arm.A00(null, auraTypography.subheadlineMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), C1822Arm.A00(null, auraTypography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), f3 + AuraDimensKt.SpacingLarge, f3, f3, 127793032, j3, auraColors.secondaryButtonBackground, auraColors.background, j);
        C1822Arm c1822ArmA005 = C1822Arm.A00(null, auraTypography.bodyMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L);
        float f4 = AuraDimensKt.SpacingSmall;
        C9WY c9wy = new C9WY(C1822Arm.A00(null, auraTypography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), c1822ArmA005, auraDimensions.icon.medium, f4, f2, 1522, j2);
        C1822Arm c1822ArmA006 = C1822Arm.A00(null, auraTypography.bodyMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L);
        C1822Arm c1822ArmA007 = C1822Arm.A00(null, auraTypography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L);
        C1822Arm c1822ArmA008 = C1822Arm.A00(null, auraTypography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L);
        C1822Arm c1822ArmA009 = C1822Arm.A00(null, auraTypography.subheadlineRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j2, 0L, 0L, 0L);
        C1822Arm c1822ArmA0010 = C1822Arm.A00(null, auraTypography.subheadlineRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j2, 0L, 0L, 0L);
        float f5 = auraDimensions.icon.medium;
        float f6 = AuraDimensKt.SpacingXsmall;
        C9WN c9wn = new C9WN(c1822ArmA007, c1822ArmA008, c1822ArmA009, c1822ArmA0010, c1822ArmA006, f5, f6, f6, f4, f2, 23824, j2);
        C9WH c9wh = new C9WH(C1822Arm.A00(null, auraTypography.bodyRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), C1822Arm.A00(null, auraTypography.subheadlineEmphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), C1822Arm.A00(null, auraTypography.bodyMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), auraDimensions.icon.medium, f4, f2, 5618, j2);
        C7cR c7cR = new C7cR(C1822Arm.A00(null, auraTypography.bodyEmphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), C1822Arm.A00(null, auraTypography.subheadlineRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), 4);
        return new C9G2(new BMk(new BNN(55, auraColors.quaternaryText), f, 118, auraColors.modal), c07509Wi, c9wy, new C8sO(C1822Arm.A00(null, auraTypography.bodyEmphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), C1822Arm.A00(null, auraTypography.footnoteRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j2, 0L, 0L, 0L), C1822Arm.A00(null, auraTypography.subheadlineEmphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), 16376), c9wh, c9wb, c9w7, c9wn, c7cR, c07429Vx, c1hd, 3);
    }

    public static final C9G2 hatchPlaceDetailsStyle(BFM bfm, int i) {
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        AuraColors colors = auraTheme.getColors(bfm, 6);
        AuraTypography typography = auraTheme.getTypography(bfm, 6);
        AuraDimensions dimensions = auraTheme.getDimensions(bfm, 6);
        boolean zA1R = AnonymousClass005.A1R(bfm, colors, typography, dimensions);
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = buildHatchPlaceDetailsStyle(colors, typography, dimensions);
            bfm.Ai0(objAaT);
        }
        return (C9G2) objAaT;
    }
}
