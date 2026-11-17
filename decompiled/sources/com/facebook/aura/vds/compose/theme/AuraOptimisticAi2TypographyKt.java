package com.facebook.aura.vds.compose.theme;

import X.C1736ApY;
import X.C1822Arm;
import com.facebook.aura.vds.compose.font.FontFamilyExtKt;

/* loaded from: classes6.dex */
public abstract class AuraOptimisticAi2TypographyKt {
    public static final AuraTypography auraOptimisticAi2Typography = new AuraTypography(AuraOptimisticAi2TypographyImpl.largeTitle1Regular, AuraOptimisticAi2TypographyImpl.largeTitle1Emphasized, AuraOptimisticAi2TypographyImpl.largeTitle2Regular, AuraOptimisticAi2TypographyImpl.largeTitle2Emphasized, AuraOptimisticAi2TypographyImpl.largeTitle3Regular, AuraOptimisticAi2TypographyImpl.largeTitle3Emphasized, AuraOptimisticAi2TypographyImpl.title1Regular, AuraOptimisticAi2TypographyImpl.title1Medium, AuraOptimisticAi2TypographyImpl.title1Emphasized, AuraOptimisticAi2TypographyImpl.title2Regular, AuraOptimisticAi2TypographyImpl.title2Medium, AuraOptimisticAi2TypographyImpl.title2Emphasized, AuraOptimisticAi2TypographyImpl.title3Regular, AuraOptimisticAi2TypographyImpl.title3Medium, AuraOptimisticAi2TypographyImpl.title3Emphasized, AuraOptimisticAi2TypographyImpl.caption, AuraOptimisticAi2TypographyImpl.bodyRegular, AuraOptimisticAi2TypographyImpl.bodyMedium, AuraOptimisticAi2TypographyImpl.bodyEmphasized, AuraOptimisticAi2TypographyImpl.subheadlineRegular, AuraOptimisticAi2TypographyImpl.subheadlineMedium, AuraOptimisticAi2TypographyImpl.subheadlineEmphasized, AuraOptimisticAi2TypographyImpl.footnoteRegular, AuraOptimisticAi2TypographyImpl.footnoteMedium, AuraOptimisticAi2TypographyImpl.footnoteEmphasized, AuraOptimisticAi2TypographyImpl.caption1Regular, AuraOptimisticAi2TypographyImpl.caption1Emphasized, AuraOptimisticAi2TypographyImpl.caption2Regular, AuraOptimisticAi2TypographyImpl.citationMedium, AuraOptimisticAi2TypographyImpl.linkCommon, AuraOptimisticAi2TypographyImpl.link1, AuraOptimisticAi2TypographyImpl.link2, AuraOptimisticAi2TypographyImpl.body1Mono, AuraOptimisticAi2TypographyImpl.monoRegular, AuraOptimisticAi2TypographyImpl.monoEmphasized, AuraOptimisticAi2TypographyImpl.monoMedium);

    public static final AuraTypography getAuraOptimisticAi2Typography() {
        return auraOptimisticAi2Typography;
    }

    /* renamed from: withOptimisticAiFontStyle-Rk4xWKU, reason: not valid java name */
    public static final C1822Arm m2952withOptimisticAiFontStyleRk4xWKU(C1822Arm c1822Arm, long j, C1736ApY c1736ApY) {
        return C1822Arm.A00(null, c1822Arm, FontFamilyExtKt.m2549getOptimisticAieAf_CNQ(j, c1736ApY), null, c1736ApY, null, null, null, null, null, 0, 0, 0, 16777177, 0L, j, 0L, 0L);
    }

    /* renamed from: withOptimisticAiFontStyle-Rk4xWKU$default, reason: not valid java name */
    public static /* synthetic */ C1822Arm m2953withOptimisticAiFontStyleRk4xWKU$default(C1822Arm c1822Arm, long j, C1736ApY c1736ApY, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c1822Arm.A02.A01;
        }
        if ((i & 2) != 0 && (c1736ApY = c1822Arm.A02.A09) == null) {
            c1736ApY = C1736ApY.A04;
        }
        return m2952withOptimisticAiFontStyleRk4xWKU(c1822Arm, j, c1736ApY);
    }
}
