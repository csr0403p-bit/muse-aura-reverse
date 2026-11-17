package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C1DG;
import X.C3TQ;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.icons.AuraIconSize;

/* loaded from: classes.dex */
public final class AuraDimensions extends C06G {
    public static final int $stable = 0;
    public final float bottomsheetBelowDragHandleVerticalSpacing;
    public final float bottomsheetEdgeToEdgeRoundedCorner;
    public final float bottomsheetIllustrationPaddingBottom;
    public final float bottomsheetRoundedCorner;
    public final float bubbleCornerRadius;
    public final float buttonElevation;
    public final C3TQ buttonGroupButtonBlockPadding;
    public final AuraButtonSize buttonGroupButtonLargeSize;
    public final AuraButtonSize buttonGroupButtonMediumSize;
    public final AuraButtonSize buttonGroupButtonSizeOverride;
    public final float buttonGroupButtonsSpacedBy;
    public final C3TQ buttonGroupHeaderPadding;
    public final C3TQ buttonGroupPadding;
    public final AuraButtonDimensions buttonLarge;
    public final AuraButtonDimensions buttonMedium;
    public final AuraButtonDimensions buttonSmall;
    public final AuraCardDimensions cardListBottomSheetCell;
    public final AuraCardDimensions cardListCell;
    public final AuraCardDimensions cardPrimary;
    public final AuraCardDimensions cardSecondary;
    public final AuraCardDimensions cardSettings;
    public final AuraCardDimensions cardSettingsDetails;
    public final AuraCardDimensions cardTertiary;
    public final AuraCardDimensions cardToast;
    public final C3TQ chip;
    public final float circularProgressSize;
    public final AuraIconSize deviceTabCaretSizePrimary;
    public final AuraIconSize deviceTabCaretSizeSecondary;
    public final AuraButtonSize dialogButtonGroupButtonSize;
    public final float gutterWidth;
    public final AuraDimensionsIcon icon;
    public final C3TQ insightCardPadding;
    public final float outerBoxCircularProgressSize;
    public final float sectionCornerRadius;
    public final float shimmerOffset;
    public final float speechBubbleMaxWidth;
    public final float speechBubbleRadius;
    public final float spinnerLarge;
    public final float spinnerSmall;
    public final float subNavigationHeight;

    /* renamed from: switch, reason: not valid java name */
    public final AuraDimensionsSwitch f311switch;
    public final float tabIndicatorHeight;
    public final float tabRowHeight;
    public final AuraToastDimensions toast;
    public final float toggleButtonChipMinSize;
    public final C3TQ toggleButtonChipPadding;
    public final float toggleButtonDeviceHomeMinSize;
    public final C3TQ toggleButtonDeviceHomePadding;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraDimensions) {
                AuraDimensions auraDimensions = (AuraDimensions) obj;
                if (!C7384Etj.areEqual(this.icon, auraDimensions.icon) || !C7384Etj.areEqual(this.buttonSmall, auraDimensions.buttonSmall) || !C7384Etj.areEqual(this.buttonMedium, auraDimensions.buttonMedium) || !C7384Etj.areEqual(this.buttonLarge, auraDimensions.buttonLarge) || !C1DG.A08(this.gutterWidth, auraDimensions.gutterWidth) || !C1DG.A08(this.subNavigationHeight, auraDimensions.subNavigationHeight) || !C1DG.A08(this.tabRowHeight, auraDimensions.tabRowHeight) || !C1DG.A08(this.tabIndicatorHeight, auraDimensions.tabIndicatorHeight) || !C1DG.A08(this.bottomsheetIllustrationPaddingBottom, auraDimensions.bottomsheetIllustrationPaddingBottom) || !C1DG.A08(this.bottomsheetBelowDragHandleVerticalSpacing, auraDimensions.bottomsheetBelowDragHandleVerticalSpacing) || !C1DG.A08(this.bottomsheetRoundedCorner, auraDimensions.bottomsheetRoundedCorner) || !C1DG.A08(this.bottomsheetEdgeToEdgeRoundedCorner, auraDimensions.bottomsheetEdgeToEdgeRoundedCorner) || !C7384Etj.areEqual(this.buttonGroupPadding, auraDimensions.buttonGroupPadding) || !C7384Etj.areEqual(this.buttonGroupHeaderPadding, auraDimensions.buttonGroupHeaderPadding) || !C7384Etj.areEqual(this.buttonGroupButtonBlockPadding, auraDimensions.buttonGroupButtonBlockPadding) || this.buttonGroupButtonSizeOverride != auraDimensions.buttonGroupButtonSizeOverride || this.buttonGroupButtonMediumSize != auraDimensions.buttonGroupButtonMediumSize || this.buttonGroupButtonLargeSize != auraDimensions.buttonGroupButtonLargeSize || !C1DG.A08(this.buttonGroupButtonsSpacedBy, auraDimensions.buttonGroupButtonsSpacedBy) || !C1DG.A08(this.buttonElevation, auraDimensions.buttonElevation) || !C7384Etj.areEqual(this.toggleButtonChipPadding, auraDimensions.toggleButtonChipPadding) || !C1DG.A08(this.toggleButtonChipMinSize, auraDimensions.toggleButtonChipMinSize) || !C7384Etj.areEqual(this.toggleButtonDeviceHomePadding, auraDimensions.toggleButtonDeviceHomePadding) || !C1DG.A08(this.toggleButtonDeviceHomeMinSize, auraDimensions.toggleButtonDeviceHomeMinSize) || !C7384Etj.areEqual(this.f311switch, auraDimensions.f311switch) || this.dialogButtonGroupButtonSize != auraDimensions.dialogButtonGroupButtonSize || !C7384Etj.areEqual(this.cardPrimary, auraDimensions.cardPrimary) || !C7384Etj.areEqual(this.cardSecondary, auraDimensions.cardSecondary) || !C7384Etj.areEqual(this.cardTertiary, auraDimensions.cardTertiary) || !C7384Etj.areEqual(this.cardListCell, auraDimensions.cardListCell) || !C7384Etj.areEqual(this.cardListBottomSheetCell, auraDimensions.cardListBottomSheetCell) || !C7384Etj.areEqual(this.cardToast, auraDimensions.cardToast) || !C7384Etj.areEqual(this.cardSettings, auraDimensions.cardSettings) || !C7384Etj.areEqual(this.cardSettingsDetails, auraDimensions.cardSettingsDetails) || !C1DG.A08(this.sectionCornerRadius, auraDimensions.sectionCornerRadius) || !C1DG.A08(this.spinnerSmall, auraDimensions.spinnerSmall) || !C1DG.A08(this.spinnerLarge, auraDimensions.spinnerLarge) || this.deviceTabCaretSizePrimary != auraDimensions.deviceTabCaretSizePrimary || this.deviceTabCaretSizeSecondary != auraDimensions.deviceTabCaretSizeSecondary || !C7384Etj.areEqual(this.chip, auraDimensions.chip) || !C1DG.A08(this.shimmerOffset, auraDimensions.shimmerOffset) || !C7384Etj.areEqual(this.toast, auraDimensions.toast) || !C1DG.A08(this.outerBoxCircularProgressSize, auraDimensions.outerBoxCircularProgressSize) || !C1DG.A08(this.circularProgressSize, auraDimensions.circularProgressSize) || !C1DG.A08(this.speechBubbleMaxWidth, auraDimensions.speechBubbleMaxWidth) || !C1DG.A08(this.speechBubbleRadius, auraDimensions.speechBubbleRadius) || !C7384Etj.areEqual(this.insightCardPadding, auraDimensions.insightCardPadding) || !C1DG.A08(this.bubbleCornerRadius, auraDimensions.bubbleCornerRadius)) {
                }
            }
            return false;
        }
        return true;
    }

    public final AuraDimensionsIcon component1() {
        return this.icon;
    }

    /* renamed from: component10-D9Ej5fM, reason: not valid java name */
    public final float m2860component10D9Ej5fM() {
        return this.bottomsheetBelowDragHandleVerticalSpacing;
    }

    /* renamed from: component11-D9Ej5fM, reason: not valid java name */
    public final float m2861component11D9Ej5fM() {
        return this.bottomsheetRoundedCorner;
    }

    /* renamed from: component12-D9Ej5fM, reason: not valid java name */
    public final float m2862component12D9Ej5fM() {
        return this.bottomsheetEdgeToEdgeRoundedCorner;
    }

    public final C3TQ component13() {
        return this.buttonGroupPadding;
    }

    public final C3TQ component14() {
        return this.buttonGroupHeaderPadding;
    }

    public final C3TQ component15() {
        return this.buttonGroupButtonBlockPadding;
    }

    public final AuraButtonSize component16() {
        return this.buttonGroupButtonSizeOverride;
    }

    public final AuraButtonSize component17() {
        return this.buttonGroupButtonMediumSize;
    }

    public final AuraButtonSize component18() {
        return this.buttonGroupButtonLargeSize;
    }

    /* renamed from: component19-D9Ej5fM, reason: not valid java name */
    public final float m2863component19D9Ej5fM() {
        return this.buttonGroupButtonsSpacedBy;
    }

    public final AuraButtonDimensions component2() {
        return this.buttonSmall;
    }

    /* renamed from: component20-D9Ej5fM, reason: not valid java name */
    public final float m2864component20D9Ej5fM() {
        return this.buttonElevation;
    }

    public final C3TQ component21() {
        return this.toggleButtonChipPadding;
    }

    /* renamed from: component22-D9Ej5fM, reason: not valid java name */
    public final float m2865component22D9Ej5fM() {
        return this.toggleButtonChipMinSize;
    }

    public final C3TQ component23() {
        return this.toggleButtonDeviceHomePadding;
    }

    /* renamed from: component24-D9Ej5fM, reason: not valid java name */
    public final float m2866component24D9Ej5fM() {
        return this.toggleButtonDeviceHomeMinSize;
    }

    public final AuraDimensionsSwitch component25() {
        return this.f311switch;
    }

    public final AuraButtonSize component26() {
        return this.dialogButtonGroupButtonSize;
    }

    public final AuraCardDimensions component27() {
        return this.cardPrimary;
    }

    public final AuraCardDimensions component28() {
        return this.cardSecondary;
    }

    public final AuraCardDimensions component29() {
        return this.cardTertiary;
    }

    public final AuraButtonDimensions component3() {
        return this.buttonMedium;
    }

    public final AuraCardDimensions component30() {
        return this.cardListCell;
    }

    public final AuraCardDimensions component31() {
        return this.cardListBottomSheetCell;
    }

    public final AuraCardDimensions component32() {
        return this.cardToast;
    }

    public final AuraCardDimensions component33() {
        return this.cardSettings;
    }

    public final AuraCardDimensions component34() {
        return this.cardSettingsDetails;
    }

    /* renamed from: component35-D9Ej5fM, reason: not valid java name */
    public final float m2867component35D9Ej5fM() {
        return this.sectionCornerRadius;
    }

    /* renamed from: component36-D9Ej5fM, reason: not valid java name */
    public final float m2868component36D9Ej5fM() {
        return this.spinnerSmall;
    }

    /* renamed from: component37-D9Ej5fM, reason: not valid java name */
    public final float m2869component37D9Ej5fM() {
        return this.spinnerLarge;
    }

    public final AuraIconSize component38() {
        return this.deviceTabCaretSizePrimary;
    }

    public final AuraIconSize component39() {
        return this.deviceTabCaretSizeSecondary;
    }

    public final AuraButtonDimensions component4() {
        return this.buttonLarge;
    }

    public final C3TQ component40() {
        return this.chip;
    }

    /* renamed from: component41-D9Ej5fM, reason: not valid java name */
    public final float m2870component41D9Ej5fM() {
        return this.shimmerOffset;
    }

    public final AuraToastDimensions component42() {
        return this.toast;
    }

    /* renamed from: component43-D9Ej5fM, reason: not valid java name */
    public final float m2871component43D9Ej5fM() {
        return this.outerBoxCircularProgressSize;
    }

    /* renamed from: component44-D9Ej5fM, reason: not valid java name */
    public final float m2872component44D9Ej5fM() {
        return this.circularProgressSize;
    }

    /* renamed from: component45-D9Ej5fM, reason: not valid java name */
    public final float m2873component45D9Ej5fM() {
        return this.speechBubbleMaxWidth;
    }

    /* renamed from: component46-D9Ej5fM, reason: not valid java name */
    public final float m2874component46D9Ej5fM() {
        return this.speechBubbleRadius;
    }

    public final C3TQ component47() {
        return this.insightCardPadding;
    }

    /* renamed from: component48-D9Ej5fM, reason: not valid java name */
    public final float m2875component48D9Ej5fM() {
        return this.bubbleCornerRadius;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m2876component5D9Ej5fM() {
        return this.gutterWidth;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    public final float m2877component6D9Ej5fM() {
        return this.subNavigationHeight;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name */
    public final float m2878component7D9Ej5fM() {
        return this.tabRowHeight;
    }

    /* renamed from: component8-D9Ej5fM, reason: not valid java name */
    public final float m2879component8D9Ej5fM() {
        return this.tabIndicatorHeight;
    }

    /* renamed from: component9-D9Ej5fM, reason: not valid java name */
    public final float m2880component9D9Ej5fM() {
        return this.bottomsheetIllustrationPaddingBottom;
    }

    /* renamed from: getBottomsheetBelowDragHandleVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m2882getBottomsheetBelowDragHandleVerticalSpacingD9Ej5fM() {
        return this.bottomsheetBelowDragHandleVerticalSpacing;
    }

    /* renamed from: getBottomsheetEdgeToEdgeRoundedCorner-D9Ej5fM, reason: not valid java name */
    public final float m2883getBottomsheetEdgeToEdgeRoundedCornerD9Ej5fM() {
        return this.bottomsheetEdgeToEdgeRoundedCorner;
    }

    /* renamed from: getBottomsheetIllustrationPaddingBottom-D9Ej5fM, reason: not valid java name */
    public final float m2884getBottomsheetIllustrationPaddingBottomD9Ej5fM() {
        return this.bottomsheetIllustrationPaddingBottom;
    }

    /* renamed from: getBottomsheetRoundedCorner-D9Ej5fM, reason: not valid java name */
    public final float m2885getBottomsheetRoundedCornerD9Ej5fM() {
        return this.bottomsheetRoundedCorner;
    }

    /* renamed from: getBubbleCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m2886getBubbleCornerRadiusD9Ej5fM() {
        return this.bubbleCornerRadius;
    }

    /* renamed from: getButtonElevation-D9Ej5fM, reason: not valid java name */
    public final float m2887getButtonElevationD9Ej5fM() {
        return this.buttonElevation;
    }

    public final C3TQ getButtonGroupButtonBlockPadding() {
        return this.buttonGroupButtonBlockPadding;
    }

    public final AuraButtonSize getButtonGroupButtonLargeSize() {
        return this.buttonGroupButtonLargeSize;
    }

    public final AuraButtonSize getButtonGroupButtonMediumSize() {
        return this.buttonGroupButtonMediumSize;
    }

    public final AuraButtonSize getButtonGroupButtonSizeOverride() {
        return this.buttonGroupButtonSizeOverride;
    }

    /* renamed from: getButtonGroupButtonsSpacedBy-D9Ej5fM, reason: not valid java name */
    public final float m2888getButtonGroupButtonsSpacedByD9Ej5fM() {
        return this.buttonGroupButtonsSpacedBy;
    }

    public final C3TQ getButtonGroupHeaderPadding() {
        return this.buttonGroupHeaderPadding;
    }

    public final C3TQ getButtonGroupPadding() {
        return this.buttonGroupPadding;
    }

    public final AuraButtonDimensions getButtonLarge() {
        return this.buttonLarge;
    }

    public final AuraButtonDimensions getButtonMedium() {
        return this.buttonMedium;
    }

    public final AuraButtonDimensions getButtonSmall() {
        return this.buttonSmall;
    }

    public final AuraCardDimensions getCardListBottomSheetCell() {
        return this.cardListBottomSheetCell;
    }

    public final AuraCardDimensions getCardListCell() {
        return this.cardListCell;
    }

    public final AuraCardDimensions getCardPrimary() {
        return this.cardPrimary;
    }

    public final AuraCardDimensions getCardSecondary() {
        return this.cardSecondary;
    }

    public final AuraCardDimensions getCardSettings() {
        return this.cardSettings;
    }

    public final AuraCardDimensions getCardSettingsDetails() {
        return this.cardSettingsDetails;
    }

    public final AuraCardDimensions getCardTertiary() {
        return this.cardTertiary;
    }

    public final AuraCardDimensions getCardToast() {
        return this.cardToast;
    }

    public final C3TQ getChip() {
        return this.chip;
    }

    /* renamed from: getCircularProgressSize-D9Ej5fM, reason: not valid java name */
    public final float m2889getCircularProgressSizeD9Ej5fM() {
        return this.circularProgressSize;
    }

    public final AuraIconSize getDeviceTabCaretSizePrimary() {
        return this.deviceTabCaretSizePrimary;
    }

    public final AuraIconSize getDeviceTabCaretSizeSecondary() {
        return this.deviceTabCaretSizeSecondary;
    }

    public final AuraButtonSize getDialogButtonGroupButtonSize() {
        return this.dialogButtonGroupButtonSize;
    }

    /* renamed from: getGutterWidth-D9Ej5fM, reason: not valid java name */
    public final float m2890getGutterWidthD9Ej5fM() {
        return this.gutterWidth;
    }

    public final AuraDimensionsIcon getIcon() {
        return this.icon;
    }

    public final C3TQ getInsightCardPadding() {
        return this.insightCardPadding;
    }

    /* renamed from: getOuterBoxCircularProgressSize-D9Ej5fM, reason: not valid java name */
    public final float m2891getOuterBoxCircularProgressSizeD9Ej5fM() {
        return this.outerBoxCircularProgressSize;
    }

    /* renamed from: getSectionCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m2892getSectionCornerRadiusD9Ej5fM() {
        return this.sectionCornerRadius;
    }

    /* renamed from: getShimmerOffset-D9Ej5fM, reason: not valid java name */
    public final float m2893getShimmerOffsetD9Ej5fM() {
        return this.shimmerOffset;
    }

    /* renamed from: getSpeechBubbleMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m2894getSpeechBubbleMaxWidthD9Ej5fM() {
        return this.speechBubbleMaxWidth;
    }

    /* renamed from: getSpeechBubbleRadius-D9Ej5fM, reason: not valid java name */
    public final float m2895getSpeechBubbleRadiusD9Ej5fM() {
        return this.speechBubbleRadius;
    }

    /* renamed from: getSpinnerLarge-D9Ej5fM, reason: not valid java name */
    public final float m2896getSpinnerLargeD9Ej5fM() {
        return this.spinnerLarge;
    }

    /* renamed from: getSpinnerSmall-D9Ej5fM, reason: not valid java name */
    public final float m2897getSpinnerSmallD9Ej5fM() {
        return this.spinnerSmall;
    }

    /* renamed from: getSubNavigationHeight-D9Ej5fM, reason: not valid java name */
    public final float m2898getSubNavigationHeightD9Ej5fM() {
        return this.subNavigationHeight;
    }

    public final AuraDimensionsSwitch getSwitch() {
        return this.f311switch;
    }

    /* renamed from: getTabIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2899getTabIndicatorHeightD9Ej5fM() {
        return this.tabIndicatorHeight;
    }

    /* renamed from: getTabRowHeight-D9Ej5fM, reason: not valid java name */
    public final float m2900getTabRowHeightD9Ej5fM() {
        return this.tabRowHeight;
    }

    public final AuraToastDimensions getToast() {
        return this.toast;
    }

    /* renamed from: getToggleButtonChipMinSize-D9Ej5fM, reason: not valid java name */
    public final float m2901getToggleButtonChipMinSizeD9Ej5fM() {
        return this.toggleButtonChipMinSize;
    }

    public final C3TQ getToggleButtonChipPadding() {
        return this.toggleButtonChipPadding;
    }

    /* renamed from: getToggleButtonDeviceHomeMinSize-D9Ej5fM, reason: not valid java name */
    public final float m2902getToggleButtonDeviceHomeMinSizeD9Ej5fM() {
        return this.toggleButtonDeviceHomeMinSize;
    }

    public final C3TQ getToggleButtonDeviceHomePadding() {
        return this.toggleButtonDeviceHomePadding;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.insightCardPadding, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.toast, AnonymousClass005.A02(AnonymousClass005.A0F(this.chip, AnonymousClass005.A0F(this.deviceTabCaretSizeSecondary, AnonymousClass005.A0F(this.deviceTabCaretSizePrimary, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.cardSettingsDetails, AnonymousClass005.A0F(this.cardSettings, AnonymousClass005.A0F(this.cardToast, AnonymousClass005.A0F(this.cardListBottomSheetCell, AnonymousClass005.A0F(this.cardListCell, AnonymousClass005.A0F(this.cardTertiary, AnonymousClass005.A0F(this.cardSecondary, AnonymousClass005.A0F(this.cardPrimary, AnonymousClass005.A0F(this.dialogButtonGroupButtonSize, AnonymousClass005.A0F(this.f311switch, AnonymousClass005.A02(AnonymousClass005.A0F(this.toggleButtonDeviceHomePadding, AnonymousClass005.A02(AnonymousClass005.A0F(this.toggleButtonChipPadding, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.buttonGroupButtonLargeSize, AnonymousClass005.A0F(this.buttonGroupButtonMediumSize, (AnonymousClass005.A0F(this.buttonGroupButtonBlockPadding, AnonymousClass005.A0F(this.buttonGroupHeaderPadding, AnonymousClass005.A0F(this.buttonGroupPadding, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.buttonLarge, AnonymousClass005.A0F(this.buttonMedium, AnonymousClass005.A0F(this.buttonSmall, AnonymousClass005.A0E(this.icon)))), this.gutterWidth), this.subNavigationHeight), this.tabRowHeight), this.tabIndicatorHeight), this.bottomsheetIllustrationPaddingBottom), this.bottomsheetBelowDragHandleVerticalSpacing), this.bottomsheetRoundedCorner), this.bottomsheetEdgeToEdgeRoundedCorner)))) + AnonymousClass006.A0D(this.buttonGroupButtonSizeOverride)) * 31)), this.buttonGroupButtonsSpacedBy), this.buttonElevation)), this.toggleButtonChipMinSize)), this.toggleButtonDeviceHomeMinSize))))))))))), this.sectionCornerRadius), this.spinnerSmall), this.spinnerLarge)))), this.shimmerOffset)), this.outerBoxCircularProgressSize), this.circularProgressSize), this.speechBubbleMaxWidth), this.speechBubbleRadius)) + Float.floatToIntBits(this.bubbleCornerRadius);
    }

    public String toString() {
        return super.toString();
    }

    public AuraDimensions(AuraDimensionsIcon auraDimensionsIcon, AuraButtonDimensions auraButtonDimensions, AuraButtonDimensions auraButtonDimensions2, AuraButtonDimensions auraButtonDimensions3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonSize auraButtonSize, AuraButtonSize auraButtonSize2, AuraButtonSize auraButtonSize3, float f9, float f10, C3TQ c3tq4, float f11, C3TQ c3tq5, float f12, AuraDimensionsSwitch auraDimensionsSwitch, AuraButtonSize auraButtonSize4, AuraCardDimensions auraCardDimensions, AuraCardDimensions auraCardDimensions2, AuraCardDimensions auraCardDimensions3, AuraCardDimensions auraCardDimensions4, AuraCardDimensions auraCardDimensions5, AuraCardDimensions auraCardDimensions6, AuraCardDimensions auraCardDimensions7, AuraCardDimensions auraCardDimensions8, float f13, float f14, float f15, AuraIconSize auraIconSize, AuraIconSize auraIconSize2, C3TQ c3tq6, float f16, AuraToastDimensions auraToastDimensions, float f17, float f18, float f19, float f20, C3TQ c3tq7, float f21) {
        AnonymousClass005.A14(auraDimensionsIcon, auraButtonDimensions, auraButtonDimensions2, auraButtonDimensions3);
        AnonymousClass003.A11(c3tq, c3tq2);
        C7384Etj.A0Y(c3tq3, 14);
        C7384Etj.A0Y(auraButtonSize2, 16);
        C7384Etj.A0Y(auraButtonSize3, 17);
        C7384Etj.A0Y(c3tq4, 20);
        C7384Etj.A0Y(c3tq5, 22);
        C06G.A0j(auraDimensionsSwitch, auraButtonSize4, auraCardDimensions, auraCardDimensions2, auraCardDimensions3);
        C06G.A0k(auraCardDimensions4, auraCardDimensions5, auraCardDimensions6, auraCardDimensions7, auraCardDimensions8);
        C7384Etj.A0Y(auraIconSize, 37);
        C7384Etj.A0Y(auraIconSize2, 38);
        C7384Etj.A0Y(c3tq6, 39);
        C7384Etj.A0Y(auraToastDimensions, 41);
        C7384Etj.A0Y(c3tq7, 46);
        this.icon = auraDimensionsIcon;
        this.buttonSmall = auraButtonDimensions;
        this.buttonMedium = auraButtonDimensions2;
        this.buttonLarge = auraButtonDimensions3;
        this.gutterWidth = f;
        this.subNavigationHeight = f2;
        this.tabRowHeight = f3;
        this.tabIndicatorHeight = f4;
        this.bottomsheetIllustrationPaddingBottom = f5;
        this.bottomsheetBelowDragHandleVerticalSpacing = f6;
        this.bottomsheetRoundedCorner = f7;
        this.bottomsheetEdgeToEdgeRoundedCorner = f8;
        this.buttonGroupPadding = c3tq;
        this.buttonGroupHeaderPadding = c3tq2;
        this.buttonGroupButtonBlockPadding = c3tq3;
        this.buttonGroupButtonSizeOverride = auraButtonSize;
        this.buttonGroupButtonMediumSize = auraButtonSize2;
        this.buttonGroupButtonLargeSize = auraButtonSize3;
        this.buttonGroupButtonsSpacedBy = f9;
        this.buttonElevation = f10;
        this.toggleButtonChipPadding = c3tq4;
        this.toggleButtonChipMinSize = f11;
        this.toggleButtonDeviceHomePadding = c3tq5;
        this.toggleButtonDeviceHomeMinSize = f12;
        this.f311switch = auraDimensionsSwitch;
        this.dialogButtonGroupButtonSize = auraButtonSize4;
        this.cardPrimary = auraCardDimensions;
        this.cardSecondary = auraCardDimensions2;
        this.cardTertiary = auraCardDimensions3;
        this.cardListCell = auraCardDimensions4;
        this.cardListBottomSheetCell = auraCardDimensions5;
        this.cardToast = auraCardDimensions6;
        this.cardSettings = auraCardDimensions7;
        this.cardSettingsDetails = auraCardDimensions8;
        this.sectionCornerRadius = f13;
        this.spinnerSmall = f14;
        this.spinnerLarge = f15;
        this.deviceTabCaretSizePrimary = auraIconSize;
        this.deviceTabCaretSizeSecondary = auraIconSize2;
        this.chip = c3tq6;
        this.shimmerOffset = f16;
        this.toast = auraToastDimensions;
        this.outerBoxCircularProgressSize = f17;
        this.circularProgressSize = f18;
        this.speechBubbleMaxWidth = f19;
        this.speechBubbleRadius = f20;
        this.insightCardPadding = c3tq7;
        this.bubbleCornerRadius = f21;
    }

    /* renamed from: copy-yE26SOY, reason: not valid java name */
    public final AuraDimensions m2881copyyE26SOY(AuraDimensionsIcon auraDimensionsIcon, AuraButtonDimensions auraButtonDimensions, AuraButtonDimensions auraButtonDimensions2, AuraButtonDimensions auraButtonDimensions3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonSize auraButtonSize, AuraButtonSize auraButtonSize2, AuraButtonSize auraButtonSize3, float f9, float f10, C3TQ c3tq4, float f11, C3TQ c3tq5, float f12, AuraDimensionsSwitch auraDimensionsSwitch, AuraButtonSize auraButtonSize4, AuraCardDimensions auraCardDimensions, AuraCardDimensions auraCardDimensions2, AuraCardDimensions auraCardDimensions3, AuraCardDimensions auraCardDimensions4, AuraCardDimensions auraCardDimensions5, AuraCardDimensions auraCardDimensions6, AuraCardDimensions auraCardDimensions7, AuraCardDimensions auraCardDimensions8, float f13, float f14, float f15, AuraIconSize auraIconSize, AuraIconSize auraIconSize2, C3TQ c3tq6, float f16, AuraToastDimensions auraToastDimensions, float f17, float f18, float f19, float f20, C3TQ c3tq7, float f21) {
        AnonymousClass005.A14(auraDimensionsIcon, auraButtonDimensions, auraButtonDimensions2, auraButtonDimensions3);
        AnonymousClass003.A11(c3tq, c3tq2);
        C7384Etj.A0Y(c3tq3, 14);
        C7384Etj.A0Y(auraButtonSize2, 16);
        C7384Etj.A0Y(auraButtonSize3, 17);
        C7384Etj.A0Y(c3tq4, 20);
        C7384Etj.A0Y(c3tq5, 22);
        C06G.A0j(auraDimensionsSwitch, auraButtonSize4, auraCardDimensions, auraCardDimensions2, auraCardDimensions3);
        C06G.A0k(auraCardDimensions4, auraCardDimensions5, auraCardDimensions6, auraCardDimensions7, auraCardDimensions8);
        C7384Etj.A0Y(auraIconSize, 37);
        C7384Etj.A0Y(auraIconSize2, 38);
        C7384Etj.A0Y(c3tq6, 39);
        C7384Etj.A0Y(auraToastDimensions, 41);
        C7384Etj.A0Y(c3tq7, 46);
        return new AuraDimensions(auraDimensionsIcon, auraButtonDimensions, auraButtonDimensions2, auraButtonDimensions3, f, f2, f3, f4, f5, f6, f7, f8, c3tq, c3tq2, c3tq3, auraButtonSize, auraButtonSize2, auraButtonSize3, f9, f10, c3tq4, f11, c3tq5, f12, auraDimensionsSwitch, auraButtonSize4, auraCardDimensions, auraCardDimensions2, auraCardDimensions3, auraCardDimensions4, auraCardDimensions5, auraCardDimensions6, auraCardDimensions7, auraCardDimensions8, f13, f14, f15, auraIconSize, auraIconSize2, c3tq6, f16, auraToastDimensions, f17, f18, f19, f20, c3tq7, f21);
    }

    /* renamed from: copy-yE26SOY$default, reason: not valid java name */
    public static /* synthetic */ AuraDimensions m2859copyyE26SOY$default(AuraDimensions auraDimensions, AuraDimensionsIcon auraDimensionsIcon, AuraButtonDimensions auraButtonDimensions, AuraButtonDimensions auraButtonDimensions2, AuraButtonDimensions auraButtonDimensions3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonSize auraButtonSize, AuraButtonSize auraButtonSize2, AuraButtonSize auraButtonSize3, float f9, float f10, C3TQ c3tq4, float f11, C3TQ c3tq5, float f12, AuraDimensionsSwitch auraDimensionsSwitch, AuraButtonSize auraButtonSize4, AuraCardDimensions auraCardDimensions, AuraCardDimensions auraCardDimensions2, AuraCardDimensions auraCardDimensions3, AuraCardDimensions auraCardDimensions4, AuraCardDimensions auraCardDimensions5, AuraCardDimensions auraCardDimensions6, AuraCardDimensions auraCardDimensions7, AuraCardDimensions auraCardDimensions8, float f13, float f14, float f15, AuraIconSize auraIconSize, AuraIconSize auraIconSize2, C3TQ c3tq6, float f16, AuraToastDimensions auraToastDimensions, float f17, float f18, float f19, float f20, C3TQ c3tq7, float f21, int i, int i2, Object obj) {
        AuraDimensionsIcon auraDimensionsIcon2 = auraDimensionsIcon;
        AuraButtonDimensions auraButtonDimensions4 = auraButtonDimensions;
        AuraButtonDimensions auraButtonDimensions5 = auraButtonDimensions2;
        AuraButtonDimensions auraButtonDimensions6 = auraButtonDimensions3;
        float f22 = f;
        float f23 = f2;
        float f24 = f3;
        float f25 = f4;
        float f26 = f5;
        float f27 = f6;
        float f28 = f7;
        float f29 = f8;
        C3TQ c3tq8 = c3tq;
        C3TQ c3tq9 = c3tq2;
        C3TQ c3tq10 = c3tq3;
        AuraCardDimensions auraCardDimensions9 = auraCardDimensions3;
        AuraCardDimensions auraCardDimensions10 = auraCardDimensions4;
        AuraCardDimensions auraCardDimensions11 = auraCardDimensions5;
        AuraCardDimensions auraCardDimensions12 = auraCardDimensions6;
        AuraIconSize auraIconSize3 = auraIconSize;
        AuraIconSize auraIconSize4 = auraIconSize2;
        C3TQ c3tq11 = c3tq6;
        AuraToastDimensions auraToastDimensions2 = auraToastDimensions;
        float f30 = f17;
        float f31 = f18;
        float f32 = f19;
        float f33 = f20;
        C3TQ c3tq12 = c3tq7;
        AuraButtonSize auraButtonSize5 = auraButtonSize;
        AuraButtonSize auraButtonSize6 = auraButtonSize2;
        AuraButtonSize auraButtonSize7 = auraButtonSize3;
        float f34 = f9;
        float f35 = f10;
        C3TQ c3tq13 = c3tq4;
        float f36 = f11;
        C3TQ c3tq14 = c3tq5;
        float f37 = f12;
        AuraDimensionsSwitch auraDimensionsSwitch2 = auraDimensionsSwitch;
        AuraButtonSize auraButtonSize8 = auraButtonSize4;
        AuraCardDimensions auraCardDimensions13 = auraCardDimensions;
        AuraCardDimensions auraCardDimensions14 = auraCardDimensions2;
        AuraCardDimensions auraCardDimensions15 = auraCardDimensions7;
        AuraCardDimensions auraCardDimensions16 = auraCardDimensions8;
        float f38 = f13;
        float f39 = f14;
        float f40 = f15;
        float f41 = f16;
        float f42 = f21;
        if ((i & 1) != 0) {
            auraDimensionsIcon2 = auraDimensions.icon;
        }
        if ((i & 2) != 0) {
            auraButtonDimensions4 = auraDimensions.buttonSmall;
        }
        if ((i & 4) != 0) {
            auraButtonDimensions5 = auraDimensions.buttonMedium;
        }
        if ((i & 8) != 0) {
            auraButtonDimensions6 = auraDimensions.buttonLarge;
        }
        if ((i & 16) != 0) {
            f22 = auraDimensions.gutterWidth;
        }
        if ((i & 32) != 0) {
            f23 = auraDimensions.subNavigationHeight;
        }
        if ((i & 64) != 0) {
            f24 = auraDimensions.tabRowHeight;
        }
        if ((i & 128) != 0) {
            f25 = auraDimensions.tabIndicatorHeight;
        }
        if ((i & 256) != 0) {
            f26 = auraDimensions.bottomsheetIllustrationPaddingBottom;
        }
        if ((i & 512) != 0) {
            f27 = auraDimensions.bottomsheetBelowDragHandleVerticalSpacing;
        }
        if ((i & 1024) != 0) {
            f28 = auraDimensions.bottomsheetRoundedCorner;
        }
        if ((i & 2048) != 0) {
            f29 = auraDimensions.bottomsheetEdgeToEdgeRoundedCorner;
        }
        if ((i & 4096) != 0) {
            c3tq8 = auraDimensions.buttonGroupPadding;
        }
        if ((i & 8192) != 0) {
            c3tq9 = auraDimensions.buttonGroupHeaderPadding;
        }
        if ((i & 16384) != 0) {
            c3tq10 = auraDimensions.buttonGroupButtonBlockPadding;
        }
        if ((i & 32768) != 0) {
            auraButtonSize5 = auraDimensions.buttonGroupButtonSizeOverride;
        }
        if ((i & 65536) != 0) {
            auraButtonSize6 = auraDimensions.buttonGroupButtonMediumSize;
        }
        if ((i & 131072) != 0) {
            auraButtonSize7 = auraDimensions.buttonGroupButtonLargeSize;
        }
        if ((i & 262144) != 0) {
            f34 = auraDimensions.buttonGroupButtonsSpacedBy;
        }
        if ((i & 524288) != 0) {
            f35 = auraDimensions.buttonElevation;
        }
        if ((i & 1048576) != 0) {
            c3tq13 = auraDimensions.toggleButtonChipPadding;
        }
        if ((i & 2097152) != 0) {
            f36 = auraDimensions.toggleButtonChipMinSize;
        }
        if ((i & 4194304) != 0) {
            c3tq14 = auraDimensions.toggleButtonDeviceHomePadding;
        }
        if ((i & 8388608) != 0) {
            f37 = auraDimensions.toggleButtonDeviceHomeMinSize;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            auraDimensionsSwitch2 = auraDimensions.f311switch;
        }
        if ((i & 33554432) != 0) {
            auraButtonSize8 = auraDimensions.dialogButtonGroupButtonSize;
        }
        if ((i & 67108864) != 0) {
            auraCardDimensions13 = auraDimensions.cardPrimary;
        }
        if ((i & 134217728) != 0) {
            auraCardDimensions14 = auraDimensions.cardSecondary;
        }
        if ((i & 268435456) != 0) {
            auraCardDimensions9 = auraDimensions.cardTertiary;
        }
        if ((i & 536870912) != 0) {
            auraCardDimensions10 = auraDimensions.cardListCell;
        }
        if ((i & 1073741824) != 0) {
            auraCardDimensions11 = auraDimensions.cardListBottomSheetCell;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            auraCardDimensions12 = auraDimensions.cardToast;
        }
        if ((i2 & 1) != 0) {
            auraCardDimensions15 = auraDimensions.cardSettings;
        }
        if ((i2 & 2) != 0) {
            auraCardDimensions16 = auraDimensions.cardSettingsDetails;
        }
        if ((i2 & 4) != 0) {
            f38 = auraDimensions.sectionCornerRadius;
        }
        if ((i2 & 8) != 0) {
            f39 = auraDimensions.spinnerSmall;
        }
        if ((i2 & 16) != 0) {
            f40 = auraDimensions.spinnerLarge;
        }
        if ((i2 & 32) != 0) {
            auraIconSize3 = auraDimensions.deviceTabCaretSizePrimary;
        }
        if ((i2 & 64) != 0) {
            auraIconSize4 = auraDimensions.deviceTabCaretSizeSecondary;
        }
        if ((i2 & 128) != 0) {
            c3tq11 = auraDimensions.chip;
        }
        if ((i2 & 256) != 0) {
            f41 = auraDimensions.shimmerOffset;
        }
        if ((i2 & 512) != 0) {
            auraToastDimensions2 = auraDimensions.toast;
        }
        if ((i2 & 1024) != 0) {
            f30 = auraDimensions.outerBoxCircularProgressSize;
        }
        if ((i2 & 2048) != 0) {
            f31 = auraDimensions.circularProgressSize;
        }
        if ((i2 & 4096) != 0) {
            f32 = auraDimensions.speechBubbleMaxWidth;
        }
        if ((i2 & 8192) != 0) {
            f33 = auraDimensions.speechBubbleRadius;
        }
        if ((i2 & 16384) != 0) {
            c3tq12 = auraDimensions.insightCardPadding;
        }
        if ((i2 & 32768) != 0) {
            f42 = auraDimensions.bubbleCornerRadius;
        }
        return auraDimensions.m2881copyyE26SOY(auraDimensionsIcon2, auraButtonDimensions4, auraButtonDimensions5, auraButtonDimensions6, f22, f23, f24, f25, f26, f27, f28, f29, c3tq8, c3tq9, c3tq10, auraButtonSize5, auraButtonSize6, auraButtonSize7, f34, f35, c3tq13, f36, c3tq14, f37, auraDimensionsSwitch2, auraButtonSize8, auraCardDimensions13, auraCardDimensions14, auraCardDimensions9, auraCardDimensions10, auraCardDimensions11, auraCardDimensions12, auraCardDimensions15, auraCardDimensions16, f38, f39, f40, auraIconSize3, auraIconSize4, c3tq11, f41, auraToastDimensions2, f30, f31, f32, f33, c3tq12, f42);
    }

    public /* synthetic */ AuraDimensions(AuraDimensionsIcon auraDimensionsIcon, AuraButtonDimensions auraButtonDimensions, AuraButtonDimensions auraButtonDimensions2, AuraButtonDimensions auraButtonDimensions3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonSize auraButtonSize, AuraButtonSize auraButtonSize2, AuraButtonSize auraButtonSize3, float f9, float f10, C3TQ c3tq4, float f11, C3TQ c3tq5, float f12, AuraDimensionsSwitch auraDimensionsSwitch, AuraButtonSize auraButtonSize4, AuraCardDimensions auraCardDimensions, AuraCardDimensions auraCardDimensions2, AuraCardDimensions auraCardDimensions3, AuraCardDimensions auraCardDimensions4, AuraCardDimensions auraCardDimensions5, AuraCardDimensions auraCardDimensions6, AuraCardDimensions auraCardDimensions7, AuraCardDimensions auraCardDimensions8, float f13, float f14, float f15, AuraIconSize auraIconSize, AuraIconSize auraIconSize2, C3TQ c3tq6, float f16, AuraToastDimensions auraToastDimensions, float f17, float f18, float f19, float f20, C3TQ c3tq7, float f21, int i, int i2, C06H c06h) {
        this(auraDimensionsIcon, auraButtonDimensions, auraButtonDimensions2, auraButtonDimensions3, f, f2, f3, f4, f5, f6, f7, f8, c3tq, c3tq2, c3tq3, (i & 32768) != 0 ? null : auraButtonSize, auraButtonSize2, auraButtonSize3, f9, f10, c3tq4, f11, c3tq5, f12, auraDimensionsSwitch, auraButtonSize4, auraCardDimensions, auraCardDimensions2, auraCardDimensions3, auraCardDimensions4, auraCardDimensions5, auraCardDimensions6, auraCardDimensions7, auraCardDimensions8, f13, f14, f15, auraIconSize, auraIconSize2, c3tq6, f16, auraToastDimensions, f17, f18, f19, f20, c3tq7, f21);
    }

    public /* synthetic */ AuraDimensions(AuraDimensionsIcon auraDimensionsIcon, AuraButtonDimensions auraButtonDimensions, AuraButtonDimensions auraButtonDimensions2, AuraButtonDimensions auraButtonDimensions3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonSize auraButtonSize, AuraButtonSize auraButtonSize2, AuraButtonSize auraButtonSize3, float f9, float f10, C3TQ c3tq4, float f11, C3TQ c3tq5, float f12, AuraDimensionsSwitch auraDimensionsSwitch, AuraButtonSize auraButtonSize4, AuraCardDimensions auraCardDimensions, AuraCardDimensions auraCardDimensions2, AuraCardDimensions auraCardDimensions3, AuraCardDimensions auraCardDimensions4, AuraCardDimensions auraCardDimensions5, AuraCardDimensions auraCardDimensions6, AuraCardDimensions auraCardDimensions7, AuraCardDimensions auraCardDimensions8, float f13, float f14, float f15, AuraIconSize auraIconSize, AuraIconSize auraIconSize2, C3TQ c3tq6, float f16, AuraToastDimensions auraToastDimensions, float f17, float f18, float f19, float f20, C3TQ c3tq7, float f21, C06H c06h) {
        this(auraDimensionsIcon, auraButtonDimensions, auraButtonDimensions2, auraButtonDimensions3, f, f2, f3, f4, f5, f6, f7, f8, c3tq, c3tq2, c3tq3, auraButtonSize, auraButtonSize2, auraButtonSize3, f9, f10, c3tq4, f11, c3tq5, f12, auraDimensionsSwitch, auraButtonSize4, auraCardDimensions, auraCardDimensions2, auraCardDimensions3, auraCardDimensions4, auraCardDimensions5, auraCardDimensions6, auraCardDimensions7, auraCardDimensions8, f13, f14, f15, auraIconSize, auraIconSize2, c3tq6, f16, auraToastDimensions, f17, f18, f19, f20, c3tq7, f21);
    }
}
