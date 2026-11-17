package com.facebook.aura.maps.theme;

import X.AnonymousClass003;
import X.AnonymousClass962;
import X.B6A;
import X.BFM;
import X.C1736ApY;
import X.C1822Arm;
import X.C19U;
import X.C78N;
import X.C8sK;
import X.C8sL;
import X.C8sM;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;

/* loaded from: classes4.dex */
public abstract class HatchMapCardStyleKt {
    /* renamed from: buildHatchMapCardStyle-d8LSEHM, reason: not valid java name */
    public static final C8sK m1356buildHatchMapCardStyled8LSEHM(AuraColors auraColors, AuraTypography auraTypography, float f, boolean z) {
        long j = auraColors.highlight;
        boolean z2 = !auraColors.isLight;
        long j2 = auraColors.background;
        long j3 = auraColors.primaryText;
        return new C8sK(new C8sL(224, j, j2, j3, j2, auraColors.secondaryButtonBackground, auraColors.secondaryText, z2), new AnonymousClass962(C1822Arm.A00(null, auraTypography.subheadlineEmphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16777087, 0L, 0L, C19U.A03(0), 0L).A02, C1822Arm.A00(null, auraTypography.bodyMedium, null, null, C1736ApY.A03, null, null, null, null, null, 0, 0, 0, 16646008, j3, C19U.A03(17), C19U.A03(0), C19U.A03(22)), C1822Arm.A00(null, auraTypography.subheadlineRegular, null, null, C1736ApY.A04, null, null, null, null, null, 0, 0, 0, 16646008, auraColors.secondaryText, C19U.A03(15), C19U.A03(0), C19U.A03(20)), !z ? null : C1822Arm.A00(null, auraTypography.subheadlineMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16646014, auraColors.primaryText, 0L, C19U.A03(0), C19U.A03(20)), auraTypography.bodyEmphasized, 12.0f, z ? 90 : 78, 20.0f, z ? 106 : 94, 50.0f, 10.0f, 12900451, auraColors.card, auraColors.secondaryButtonBackground, auraColors.secondaryText, B6A.A06, auraColors.iconSuccess, auraColors.destructiveIcon.enabled), new C8sM(124, auraColors.background, auraColors.primaryText), f);
    }

    public static final C8sK rememberHatchFullscreenMapCardStyle(BFM bfm, int i) {
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        AuraColors colors = auraTheme.getColors(bfm, 6);
        AuraTypography typography = auraTheme.getTypography(bfm, 6);
        float f = auraTheme.getDimensions(bfm, 6).sectionCornerRadius;
        boolean zA1K = AnonymousClass003.A1K(bfm, colors, typography) | bfm.A62(f);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = m1356buildHatchMapCardStyled8LSEHM(colors, typography, f, true);
            bfm.Ai0(objAaT);
        }
        return (C8sK) objAaT;
    }

    public static final C8sK rememberHatchMapCardStyle(BFM bfm, int i) {
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        AuraColors colors = auraTheme.getColors(bfm, 6);
        AuraTypography typography = auraTheme.getTypography(bfm, 6);
        float f = auraTheme.getDimensions(bfm, 6).sectionCornerRadius;
        boolean zA1K = AnonymousClass003.A1K(bfm, colors, typography) | bfm.A62(f);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = m1356buildHatchMapCardStyled8LSEHM(colors, typography, f, false);
            bfm.Ai0(objAaT);
        }
        return (C8sK) objAaT;
    }
}
