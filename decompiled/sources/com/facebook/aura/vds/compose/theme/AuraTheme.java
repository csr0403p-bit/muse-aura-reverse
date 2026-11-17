package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B6A;
import X.BFM;
import X.C0dx;
import X.C1822Arm;

/* loaded from: classes.dex */
public final class AuraTheme {
    public static final int $stable = 0;
    public static final AuraTheme INSTANCE = new AuraTheme();

    public final AuraBrushes getBrushes(BFM bfm, int i) {
        return (AuraBrushes) bfm.A6v(AuraBrushesKt.LocalAuraBrushes);
    }

    public final AuraColors getColors(BFM bfm, int i) {
        return (AuraColors) bfm.A6v(AuraColorsKt.LocalAuraColors);
    }

    public final AuraContainer getContainer(BFM bfm, int i) {
        return (AuraContainer) bfm.A6v(AuraContainerKt.LocalAuraContainer);
    }

    public final float getContentAlpha(BFM bfm, int i) {
        return AnonymousClass001.A02(bfm.A6v(AuraContentAlphaKt.LocalAuraContentAlpha));
    }

    public final long getContentColor(BFM bfm, int i) {
        return ((B6A) bfm.A6v(AuraContentColorKt.LocalAuraContentColor)).A00;
    }

    public final AuraDimensions getDimensions(BFM bfm, int i) {
        return (AuraDimensions) bfm.A6v(AuraDimensionsKt.LocalAuraDimensions);
    }

    public final AuraDrawables getDrawables(BFM bfm, int i) {
        return (AuraDrawables) bfm.A6v(AuraDrawablesKt.LocalAuraDrawables);
    }

    public final AuraInteractions getInteractions(BFM bfm, int i) {
        return (AuraInteractions) bfm.A6v(AuraInteractionsKt.LocalAuraInteractions);
    }

    public final C1822Arm getTextStyle(BFM bfm, int i) {
        return (C1822Arm) bfm.A6v(AuraTypographyKt.LocalAuraTextStyle);
    }

    public final C0dx getHaptics(BFM bfm, int i) {
        return AnonymousClass002.A0T(bfm);
    }

    public final AuraShapes getShapes(BFM bfm, int i) {
        return AnonymousClass002.A0e(bfm);
    }

    public final AuraTypography getTypography(BFM bfm, int i) {
        return AnonymousClass002.A0f(bfm);
    }
}
