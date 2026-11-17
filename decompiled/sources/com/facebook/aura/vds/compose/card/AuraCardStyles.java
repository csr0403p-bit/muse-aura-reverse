package com.facebook.aura.vds.compose.card;

import X.AKH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.C1AC;
import X.C1DG;
import X.EnumC1820Arj;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraCardDimensions;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;

/* loaded from: classes.dex */
public final class AuraCardStyles {
    public static final int $stable = 0;
    public static final AuraCardStyles INSTANCE = new AuraCardStyles();

    private final AuraCardStyleInstance defaultCardStyle(AuraCardDimensions auraCardDimensions, boolean z, C1AC c1ac, BFM bfm, int i, int i2) {
        boolean z2 = z;
        C1AC c1ac2 = c1ac;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            c1ac2 = null;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        return m2498toAuraCardStylesW7UJKQ(AnonymousClass001.A0f(bfm, akh).isLight, AnonymousClass001.A0f(bfm, akh).card, auraCardDimensions, AuraButtonStyle.PRIMARY, false, z2, c1ac2);
    }

    /* renamed from: list-oAWOtXo, reason: not valid java name */
    public final AuraCardStyle m2500listoAWOtXo(C1AC c1ac, long j, C1DG c1dg, BFM bfm, int i, int i2) {
        AuraCardDimensions auraCardDimensionsM2497withVerticalPaddinglG28NQ4;
        C1AC c1ac2 = c1ac;
        long jA0J = j;
        if ((i2 & 1) != 0) {
            c1ac2 = null;
        }
        if ((i2 & 2) != 0) {
            jA0J = C06G.A0J(bfm, AuraColorsKt.LocalAuraColors);
        }
        C1DG c1dg2 = (i2 & 4) == 0 ? c1dg : null;
        AuraCardDimensions auraCardDimensions = AnonymousClass002.A0d(bfm).cardListCell;
        EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
        boolean z = AnonymousClass002.A0c(bfm).isLight;
        if (c1dg2 == null || (auraCardDimensionsM2497withVerticalPaddinglG28NQ4 = AuraCardStyleKt.m2497withVerticalPaddinglG28NQ4(auraCardDimensions, c1dg2.A00, enumC1820ArjA0d)) == null) {
            auraCardDimensionsM2497withVerticalPaddinglG28NQ4 = auraCardDimensions;
        }
        return m2498toAuraCardStylesW7UJKQ(z, jA0J, auraCardDimensionsM2497withVerticalPaddinglG28NQ4, AuraButtonStyle.PRIMARY, false, true, c1ac2);
    }

    public final AuraCardStyle listSettings(C1AC c1ac, BFM bfm, int i, int i2) {
        C1AC c1ac2 = c1ac;
        if ((i2 & 1) != 0) {
            c1ac2 = null;
        }
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        return m2498toAuraCardStylesW7UJKQ(AnonymousClass001.A0f(bfm, akh).isLight, C06G.A0J(bfm, akh), AnonymousClass002.A0d(bfm).cardSettings, AuraButtonStyle.PRIMARY, false, true, c1ac2);
    }

    public final AuraCardStyle primary(BFM bfm, int i) {
        return defaultCardStyle(AnonymousClass002.A0d(bfm).cardPrimary, false, null, bfm, (i << 9) & 7168, 6);
    }

    /* renamed from: toAuraCardStyle-sW7UJKQ, reason: not valid java name */
    private final AuraCardStyleInstance m2498toAuraCardStylesW7UJKQ(boolean z, long j, AuraCardDimensions auraCardDimensions, AuraButtonStyle auraButtonStyle, boolean z2, boolean z3, C1AC c1ac) {
        return new AuraCardStyleInstance(z, j, auraCardDimensions.contentPadding, auraCardDimensions.contentPaddingNoStartItem, auraCardDimensions.trailingItemPadding, auraButtonStyle, z2, z3, c1ac, auraCardDimensions.minHeight);
    }

    /* renamed from: toAuraCardStyle-sW7UJKQ$default, reason: not valid java name */
    public static /* synthetic */ AuraCardStyleInstance m2499toAuraCardStylesW7UJKQ$default(AuraCardStyles auraCardStyles, boolean z, long j, AuraCardDimensions auraCardDimensions, AuraButtonStyle auraButtonStyle, boolean z2, boolean z3, C1AC c1ac, int i, Object obj) {
        if ((i & 8) != 0) {
            auraButtonStyle = AuraButtonStyle.PRIMARY;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean zA1R = AnonymousClass002.A1R(i, z3);
        if ((i & 64) != 0) {
            c1ac = null;
        }
        return auraCardStyles.m2498toAuraCardStylesW7UJKQ(z, j, auraCardDimensions, auraButtonStyle, z2, zA1R, c1ac);
    }
}
