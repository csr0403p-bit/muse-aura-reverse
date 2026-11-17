package com.facebook.aura.vds.compose.theme;

import X.AGO;
import X.AKH;
import X.B6A;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class AuraColorsKt {
    public static final AKH<AuraColors> LocalAuraColors = new AGO(AuraColorsKt$LocalAuraColors$1.INSTANCE);
    public static final AuraColors auraColorsDark;
    public static final AuraColors auraColorsDarkOnBlack;
    public static final AuraColors auraColorsLight;

    /* renamed from: withBackgroundColor-4WTKRHQ, reason: not valid java name */
    public static final AuraColorsTextInput m2821withBackgroundColor4WTKRHQ(AuraColorsTextInput auraColorsTextInput, long j) {
        C7384Etj.A0Y(auraColorsTextInput, 0);
        return new AuraColorsTextInput(auraColorsTextInput.textColor, auraColorsTextInput.cursorColor, auraColorsTextInput.placeholderColor, auraColorsTextInput.focusedBorderColor, auraColorsTextInput.unfocusedBorderColor, auraColorsTextInput.errorBorderColor, new B6A(j));
    }

    static {
        AuraColorsPalette auraColorsPalette = AuraColorsPaletteKt.auraColorsPaletteLight;
        auraColorsLight = m2819buildColorsmxwnekA(true, auraColorsPalette, auraColorsPalette.surface.background);
        AuraColorsPalette auraColorsPalette2 = AuraColorsPaletteKt.auraColorsPaletteDark;
        auraColorsDark = m2819buildColorsmxwnekA(false, auraColorsPalette2, auraColorsPalette2.surface.background);
        auraColorsDarkOnBlack = m2819buildColorsmxwnekA(false, auraColorsPalette2, BaseColors.BLACK);
    }

    /* renamed from: buildColors-mxwnekA, reason: not valid java name */
    public static final AuraColors m2819buildColorsmxwnekA(boolean z, AuraColorsPalette auraColorsPalette, long j) {
        SurfaceColors surfaceColors = auraColorsPalette.surface;
        long j2 = surfaceColors.highlight;
        long j3 = surfaceColors.elevated;
        long j4 = surfaceColors.secondaryElevated;
        long j5 = surfaceColors.bubble;
        long j6 = surfaceColors.card;
        TextAndIconColors textAndIconColors = auraColorsPalette.textAndIcon;
        long j7 = textAndIconColors.textPrimary;
        long j8 = textAndIconColors.textSecondary;
        long j9 = textAndIconColors.textTertiary;
        long j10 = textAndIconColors.textQuaternary;
        SemanticColors semanticColors = auraColorsPalette.semantic;
        long j11 = semanticColors.accent;
        long j12 = textAndIconColors.textIconInverted;
        long j13 = semanticColors.error;
        long j14 = textAndIconColors.textDestructive;
        long j15 = textAndIconColors.iconDisabled;
        C06H c06h = null;
        AuraColorsIconTint auraColorsIconTint = new AuraColorsIconTint(j7, j15);
        AuraColorsIconTint auraColorsIconTint2 = new AuraColorsIconTint(j8, j15);
        AuraColorsIconTint auraColorsIconTint3 = new AuraColorsIconTint(textAndIconColors.iconDestructive, j15);
        ButtonColors buttonColors = auraColorsPalette.button;
        long j16 = buttonColors.invertedButtonBackground;
        long j17 = buttonColors.invertedButtonContent;
        long j18 = buttonColors.primaryButtonBackground;
        long j19 = buttonColors.destructiveButtonBackground;
        long j20 = buttonColors.buttonSecondaryBackground;
        long j21 = textAndIconColors.onMedia;
        long j22 = 0;
        AuraColorsSwitch auraColorsSwitch = new AuraColorsSwitch(j21, j11, j12, j8, j22, j22, j22, j22, 240, c06h);
        long j23 = textAndIconColors.onLight;
        long j24 = surfaceColors.onMedia;
        long j25 = surfaceColors.scrim;
        long j26 = surfaceColors.panelTransitionScrim;
        long j27 = surfaceColors.shadow;
        FeatureColors featureColors = auraColorsPalette.feature;
        AuraColorsTextInput auraColorsTextInput = new AuraColorsTextInput(j7, featureColors.cursor, j8, j11, j2, j13, null);
        BorderColors borderColors = auraColorsPalette.border;
        long j28 = borderColors.divider;
        long j29 = borderColors.border;
        return new AuraColors(z, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, auraColorsIconTint, auraColorsIconTint2, auraColorsIconTint3, semanticColors.iconSuccess, j16, j17, j18, j19, j20, auraColorsSwitch, j23, j21, j24, j25, j26, j27, auraColorsTextInput, new AuraColorsDatePicker(j3, j8, j7, j17, j16, j2, j28, j29, j22, j22, j22, j22, j22, j22, j22, j22, j22, j22, j22, j22, j22, j22, j22, j22, 16776960, c06h), j29, borderColors.elevatedBorder, borderColors.photoBorder, borderColors.avatarBorder, borderColors.focusedBorder, borderColors.unfocusedBorder, j28, surfaceColors.shimmeringBase, surfaceColors.shimmeringHighlight, j27, surfaceColors.toast, surfaceColors.modal, surfaceColors.secondaryModal, j13, j11, semanticColors.success, semanticColors.warning, semanticColors.inactive, semanticColors.negativeAccent, surfaceColors.transparent, featureColors.notificationBadge, BaseColors.YELLOW_ALPHA_300);
    }

    /* renamed from: buildColors-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ AuraColors m2820buildColorsmxwnekA$default(boolean z, AuraColorsPalette auraColorsPalette, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = auraColorsPalette.surface.background;
        }
        return m2819buildColorsmxwnekA(z, auraColorsPalette, j);
    }

    public static final AuraColors getAuraColorsDark() {
        return auraColorsDark;
    }

    public static final AuraColors getAuraColorsDarkOnBlack() {
        return auraColorsDarkOnBlack;
    }

    public static final AuraColors getAuraColorsLight() {
        return auraColorsLight;
    }

    public static final AKH<AuraColors> getLocalAuraColors() {
        return LocalAuraColors;
    }
}
