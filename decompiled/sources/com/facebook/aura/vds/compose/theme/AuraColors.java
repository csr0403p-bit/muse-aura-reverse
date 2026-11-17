package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.HDi;
import X.HxS;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes.dex */
public final class AuraColors extends C06G {
    public static final int $stable = 0;
    public final long accent;
    public final long avatarBorder;
    public final long background;
    public final long border;
    public final long bubble;
    public final long card;
    public final AuraColorsDatePicker datePicker;
    public final long destructiveButtonBackground;
    public final AuraColorsIconTint destructiveIcon;
    public final long destructiveText;
    public final long elevated;
    public final long elevatedBorder;
    public final long error;
    public final long errorText;
    public final long fillDivider;
    public final long focusedBorder;
    public final long highlight;
    public final long iconSuccess;
    public final long inactive;
    public final long invertedButtonBackground;
    public final long invertedButtonContent;
    public final long invertedText;
    public final boolean isLight;
    public final long link;
    public final long modal;
    public final long negativeAccent;
    public final long notificationBadge;
    public final long onLight;
    public final long onMedia;
    public final long panelTransitionScrim;
    public final long photoBorder;
    public final long primaryButtonBackground;
    public final AuraColorsIconTint primaryIcon;
    public final long primaryText;
    public final long quaternaryText;
    public final long ratingStar;
    public final long scrim;
    public final long secondaryButtonBackground;
    public final long secondaryElevated;
    public final AuraColorsIconTint secondaryIcon;
    public final long secondaryModal;
    public final long secondaryText;
    public final long shadow;
    public final long shimmeringBase;
    public final long shimmeringHighlight;
    public final long success;
    public final long surfaceOnMedia;

    /* renamed from: switch, reason: not valid java name */
    public final AuraColorsSwitch f310switch;
    public final long tertiaryText;
    public final AuraColorsTextInput textInput;
    public final long toast;
    public final long toastShadow;
    public final long transparent;
    public final long unfocusedBorder;
    public final long warning;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraColors) {
                AuraColors auraColors = (AuraColors) obj;
                if (this.isLight == auraColors.isLight) {
                    long j = this.background;
                    long j2 = auraColors.background;
                    long j3 = B6A.A01;
                    if (j != j2 || this.highlight != auraColors.highlight || this.elevated != auraColors.elevated || this.secondaryElevated != auraColors.secondaryElevated || this.bubble != auraColors.bubble || this.card != auraColors.card || this.primaryText != auraColors.primaryText || this.secondaryText != auraColors.secondaryText || this.tertiaryText != auraColors.tertiaryText || this.quaternaryText != auraColors.quaternaryText || this.link != auraColors.link || this.invertedText != auraColors.invertedText || this.errorText != auraColors.errorText || this.destructiveText != auraColors.destructiveText || !C7384Etj.areEqual(this.primaryIcon, auraColors.primaryIcon) || !C7384Etj.areEqual(this.secondaryIcon, auraColors.secondaryIcon) || !C7384Etj.areEqual(this.destructiveIcon, auraColors.destructiveIcon) || this.iconSuccess != auraColors.iconSuccess || this.invertedButtonBackground != auraColors.invertedButtonBackground || this.invertedButtonContent != auraColors.invertedButtonContent || this.primaryButtonBackground != auraColors.primaryButtonBackground || this.destructiveButtonBackground != auraColors.destructiveButtonBackground || this.secondaryButtonBackground != auraColors.secondaryButtonBackground || !C7384Etj.areEqual(this.f310switch, auraColors.f310switch) || this.onLight != auraColors.onLight || this.onMedia != auraColors.onMedia || this.surfaceOnMedia != auraColors.surfaceOnMedia || this.scrim != auraColors.scrim || this.panelTransitionScrim != auraColors.panelTransitionScrim || this.shadow != auraColors.shadow || !C7384Etj.areEqual(this.textInput, auraColors.textInput) || !C7384Etj.areEqual(this.datePicker, auraColors.datePicker) || this.border != auraColors.border || this.elevatedBorder != auraColors.elevatedBorder || this.photoBorder != auraColors.photoBorder || this.avatarBorder != auraColors.avatarBorder || this.focusedBorder != auraColors.focusedBorder || this.unfocusedBorder != auraColors.unfocusedBorder || this.fillDivider != auraColors.fillDivider || this.shimmeringBase != auraColors.shimmeringBase || this.shimmeringHighlight != auraColors.shimmeringHighlight || this.toastShadow != auraColors.toastShadow || this.toast != auraColors.toast || this.modal != auraColors.modal || this.secondaryModal != auraColors.secondaryModal || this.error != auraColors.error || this.accent != auraColors.accent || this.success != auraColors.success || this.warning != auraColors.warning || this.inactive != auraColors.inactive || this.negativeAccent != auraColors.negativeAccent || this.transparent != auraColors.transparent || this.notificationBadge != auraColors.notificationBadge || this.ratingStar != auraColors.ratingStar) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.isLight;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name */
    public final long m2664component100d7_KjU() {
        return this.tertiaryText;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name */
    public final long m2665component110d7_KjU() {
        return this.quaternaryText;
    }

    /* renamed from: component12-0d7_KjU, reason: not valid java name */
    public final long m2666component120d7_KjU() {
        return this.link;
    }

    /* renamed from: component13-0d7_KjU, reason: not valid java name */
    public final long m2667component130d7_KjU() {
        return this.invertedText;
    }

    /* renamed from: component14-0d7_KjU, reason: not valid java name */
    public final long m2668component140d7_KjU() {
        return this.errorText;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m2669component150d7_KjU() {
        return this.destructiveText;
    }

    public final AuraColorsIconTint component16() {
        return this.primaryIcon;
    }

    public final AuraColorsIconTint component17() {
        return this.secondaryIcon;
    }

    public final AuraColorsIconTint component18() {
        return this.destructiveIcon;
    }

    /* renamed from: component19-0d7_KjU, reason: not valid java name */
    public final long m2670component190d7_KjU() {
        return this.iconSuccess;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2671component20d7_KjU() {
        return this.background;
    }

    /* renamed from: component20-0d7_KjU, reason: not valid java name */
    public final long m2672component200d7_KjU() {
        return this.invertedButtonBackground;
    }

    /* renamed from: component21-0d7_KjU, reason: not valid java name */
    public final long m2673component210d7_KjU() {
        return this.invertedButtonContent;
    }

    /* renamed from: component22-0d7_KjU, reason: not valid java name */
    public final long m2674component220d7_KjU() {
        return this.primaryButtonBackground;
    }

    /* renamed from: component23-0d7_KjU, reason: not valid java name */
    public final long m2675component230d7_KjU() {
        return this.destructiveButtonBackground;
    }

    /* renamed from: component24-0d7_KjU, reason: not valid java name */
    public final long m2676component240d7_KjU() {
        return this.secondaryButtonBackground;
    }

    public final AuraColorsSwitch component25() {
        return this.f310switch;
    }

    /* renamed from: component26-0d7_KjU, reason: not valid java name */
    public final long m2677component260d7_KjU() {
        return this.onLight;
    }

    /* renamed from: component27-0d7_KjU, reason: not valid java name */
    public final long m2678component270d7_KjU() {
        return this.onMedia;
    }

    /* renamed from: component28-0d7_KjU, reason: not valid java name */
    public final long m2679component280d7_KjU() {
        return this.surfaceOnMedia;
    }

    /* renamed from: component29-0d7_KjU, reason: not valid java name */
    public final long m2680component290d7_KjU() {
        return this.scrim;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m2681component30d7_KjU() {
        return this.highlight;
    }

    /* renamed from: component30-0d7_KjU, reason: not valid java name */
    public final long m2682component300d7_KjU() {
        return this.panelTransitionScrim;
    }

    /* renamed from: component31-0d7_KjU, reason: not valid java name */
    public final long m2683component310d7_KjU() {
        return this.shadow;
    }

    public final AuraColorsTextInput component32() {
        return this.textInput;
    }

    public final AuraColorsDatePicker component33() {
        return this.datePicker;
    }

    /* renamed from: component34-0d7_KjU, reason: not valid java name */
    public final long m2684component340d7_KjU() {
        return this.border;
    }

    /* renamed from: component35-0d7_KjU, reason: not valid java name */
    public final long m2685component350d7_KjU() {
        return this.elevatedBorder;
    }

    /* renamed from: component36-0d7_KjU, reason: not valid java name */
    public final long m2686component360d7_KjU() {
        return this.photoBorder;
    }

    /* renamed from: component37-0d7_KjU, reason: not valid java name */
    public final long m2687component370d7_KjU() {
        return this.avatarBorder;
    }

    /* renamed from: component38-0d7_KjU, reason: not valid java name */
    public final long m2688component380d7_KjU() {
        return this.focusedBorder;
    }

    /* renamed from: component39-0d7_KjU, reason: not valid java name */
    public final long m2689component390d7_KjU() {
        return this.unfocusedBorder;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m2690component40d7_KjU() {
        return this.elevated;
    }

    /* renamed from: component40-0d7_KjU, reason: not valid java name */
    public final long m2691component400d7_KjU() {
        return this.fillDivider;
    }

    /* renamed from: component41-0d7_KjU, reason: not valid java name */
    public final long m2692component410d7_KjU() {
        return this.shimmeringBase;
    }

    /* renamed from: component42-0d7_KjU, reason: not valid java name */
    public final long m2693component420d7_KjU() {
        return this.shimmeringHighlight;
    }

    /* renamed from: component43-0d7_KjU, reason: not valid java name */
    public final long m2694component430d7_KjU() {
        return this.toastShadow;
    }

    /* renamed from: component44-0d7_KjU, reason: not valid java name */
    public final long m2695component440d7_KjU() {
        return this.toast;
    }

    /* renamed from: component45-0d7_KjU, reason: not valid java name */
    public final long m2696component450d7_KjU() {
        return this.modal;
    }

    /* renamed from: component46-0d7_KjU, reason: not valid java name */
    public final long m2697component460d7_KjU() {
        return this.secondaryModal;
    }

    /* renamed from: component47-0d7_KjU, reason: not valid java name */
    public final long m2698component470d7_KjU() {
        return this.error;
    }

    /* renamed from: component48-0d7_KjU, reason: not valid java name */
    public final long m2699component480d7_KjU() {
        return this.accent;
    }

    /* renamed from: component49-0d7_KjU, reason: not valid java name */
    public final long m2700component490d7_KjU() {
        return this.success;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m2701component50d7_KjU() {
        return this.secondaryElevated;
    }

    /* renamed from: component50-0d7_KjU, reason: not valid java name */
    public final long m2702component500d7_KjU() {
        return this.warning;
    }

    /* renamed from: component51-0d7_KjU, reason: not valid java name */
    public final long m2703component510d7_KjU() {
        return this.inactive;
    }

    /* renamed from: component52-0d7_KjU, reason: not valid java name */
    public final long m2704component520d7_KjU() {
        return this.negativeAccent;
    }

    /* renamed from: component53-0d7_KjU, reason: not valid java name */
    public final long m2705component530d7_KjU() {
        return this.transparent;
    }

    /* renamed from: component54-0d7_KjU, reason: not valid java name */
    public final long m2706component540d7_KjU() {
        return this.notificationBadge;
    }

    /* renamed from: component55-0d7_KjU, reason: not valid java name */
    public final long m2707component550d7_KjU() {
        return this.ratingStar;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m2708component60d7_KjU() {
        return this.bubble;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m2709component70d7_KjU() {
        return this.card;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m2710component80d7_KjU() {
        return this.primaryText;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name */
    public final long m2711component90d7_KjU() {
        return this.secondaryText;
    }

    /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
    public final long m2713getAccent0d7_KjU() {
        return this.accent;
    }

    /* renamed from: getAvatarBorder-0d7_KjU, reason: not valid java name */
    public final long m2714getAvatarBorder0d7_KjU() {
        return this.avatarBorder;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m2715getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m2716getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getBubble-0d7_KjU, reason: not valid java name */
    public final long m2717getBubble0d7_KjU() {
        return this.bubble;
    }

    /* renamed from: getCard-0d7_KjU, reason: not valid java name */
    public final long m2718getCard0d7_KjU() {
        return this.card;
    }

    public final AuraColorsDatePicker getDatePicker() {
        return this.datePicker;
    }

    /* renamed from: getDestructiveButtonBackground-0d7_KjU, reason: not valid java name */
    public final long m2719getDestructiveButtonBackground0d7_KjU() {
        return this.destructiveButtonBackground;
    }

    public final AuraColorsIconTint getDestructiveIcon() {
        return this.destructiveIcon;
    }

    /* renamed from: getDestructiveText-0d7_KjU, reason: not valid java name */
    public final long m2720getDestructiveText0d7_KjU() {
        return this.destructiveText;
    }

    /* renamed from: getElevated-0d7_KjU, reason: not valid java name */
    public final long m2721getElevated0d7_KjU() {
        return this.elevated;
    }

    /* renamed from: getElevatedBorder-0d7_KjU, reason: not valid java name */
    public final long m2722getElevatedBorder0d7_KjU() {
        return this.elevatedBorder;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m2723getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getErrorText-0d7_KjU, reason: not valid java name */
    public final long m2724getErrorText0d7_KjU() {
        return this.errorText;
    }

    /* renamed from: getFillDivider-0d7_KjU, reason: not valid java name */
    public final long m2725getFillDivider0d7_KjU() {
        return this.fillDivider;
    }

    /* renamed from: getFocusedBorder-0d7_KjU, reason: not valid java name */
    public final long m2726getFocusedBorder0d7_KjU() {
        return this.focusedBorder;
    }

    /* renamed from: getHighlight-0d7_KjU, reason: not valid java name */
    public final long m2727getHighlight0d7_KjU() {
        return this.highlight;
    }

    /* renamed from: getIconSuccess-0d7_KjU, reason: not valid java name */
    public final long m2728getIconSuccess0d7_KjU() {
        return this.iconSuccess;
    }

    /* renamed from: getInactive-0d7_KjU, reason: not valid java name */
    public final long m2729getInactive0d7_KjU() {
        return this.inactive;
    }

    /* renamed from: getInvertedButtonBackground-0d7_KjU, reason: not valid java name */
    public final long m2730getInvertedButtonBackground0d7_KjU() {
        return this.invertedButtonBackground;
    }

    /* renamed from: getInvertedButtonContent-0d7_KjU, reason: not valid java name */
    public final long m2731getInvertedButtonContent0d7_KjU() {
        return this.invertedButtonContent;
    }

    /* renamed from: getInvertedText-0d7_KjU, reason: not valid java name */
    public final long m2732getInvertedText0d7_KjU() {
        return this.invertedText;
    }

    /* renamed from: getLink-0d7_KjU, reason: not valid java name */
    public final long m2733getLink0d7_KjU() {
        return this.link;
    }

    /* renamed from: getModal-0d7_KjU, reason: not valid java name */
    public final long m2734getModal0d7_KjU() {
        return this.modal;
    }

    /* renamed from: getNegativeAccent-0d7_KjU, reason: not valid java name */
    public final long m2735getNegativeAccent0d7_KjU() {
        return this.negativeAccent;
    }

    /* renamed from: getNotificationBadge-0d7_KjU, reason: not valid java name */
    public final long m2736getNotificationBadge0d7_KjU() {
        return this.notificationBadge;
    }

    /* renamed from: getOnLight-0d7_KjU, reason: not valid java name */
    public final long m2737getOnLight0d7_KjU() {
        return this.onLight;
    }

    /* renamed from: getOnMedia-0d7_KjU, reason: not valid java name */
    public final long m2738getOnMedia0d7_KjU() {
        return this.onMedia;
    }

    /* renamed from: getPanelTransitionScrim-0d7_KjU, reason: not valid java name */
    public final long m2739getPanelTransitionScrim0d7_KjU() {
        return this.panelTransitionScrim;
    }

    /* renamed from: getPhotoBorder-0d7_KjU, reason: not valid java name */
    public final long m2740getPhotoBorder0d7_KjU() {
        return this.photoBorder;
    }

    /* renamed from: getPinkTagFill-0d7_KjU, reason: not valid java name */
    public final long m2741getPinkTagFill0d7_KjU() {
        if (!this.isLight) {
            long jM2742getPinkTagText0d7_KjU = m2742getPinkTagText0d7_KjU();
            return HxS.A04(HDi.A0O[(int) (jM2742getPinkTagText0d7_KjU & 63)], B6A.A03(jM2742getPinkTagText0d7_KjU), B6A.A02(jM2742getPinkTagText0d7_KjU), B6A.A01(jM2742getPinkTagText0d7_KjU), 0.1f);
        }
        long j = 4294503154L << 32;
        long j2 = B6A.A01;
        return j;
    }

    /* renamed from: getPinkTagText-0d7_KjU, reason: not valid java name */
    public final long m2742getPinkTagText0d7_KjU() {
        long j = (this.isLight ? 4290852228L : 4294136256L) << 32;
        long j2 = B6A.A01;
        return j;
    }

    /* renamed from: getPrimaryButtonBackground-0d7_KjU, reason: not valid java name */
    public final long m2743getPrimaryButtonBackground0d7_KjU() {
        return this.primaryButtonBackground;
    }

    public final AuraColorsIconTint getPrimaryIcon() {
        return this.primaryIcon;
    }

    /* renamed from: getPrimaryText-0d7_KjU, reason: not valid java name */
    public final long m2744getPrimaryText0d7_KjU() {
        return this.primaryText;
    }

    /* renamed from: getQuaternaryText-0d7_KjU, reason: not valid java name */
    public final long m2745getQuaternaryText0d7_KjU() {
        return this.quaternaryText;
    }

    /* renamed from: getRatingStar-0d7_KjU, reason: not valid java name */
    public final long m2746getRatingStar0d7_KjU() {
        return this.ratingStar;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m2747getScrim0d7_KjU() {
        return this.scrim;
    }

    /* renamed from: getSecondaryButtonBackground-0d7_KjU, reason: not valid java name */
    public final long m2748getSecondaryButtonBackground0d7_KjU() {
        return this.secondaryButtonBackground;
    }

    /* renamed from: getSecondaryElevated-0d7_KjU, reason: not valid java name */
    public final long m2749getSecondaryElevated0d7_KjU() {
        return this.secondaryElevated;
    }

    public final AuraColorsIconTint getSecondaryIcon() {
        return this.secondaryIcon;
    }

    /* renamed from: getSecondaryModal-0d7_KjU, reason: not valid java name */
    public final long m2750getSecondaryModal0d7_KjU() {
        return this.secondaryModal;
    }

    /* renamed from: getSecondaryText-0d7_KjU, reason: not valid java name */
    public final long m2751getSecondaryText0d7_KjU() {
        return this.secondaryText;
    }

    /* renamed from: getShadow-0d7_KjU, reason: not valid java name */
    public final long m2752getShadow0d7_KjU() {
        return this.shadow;
    }

    /* renamed from: getShimmeringBase-0d7_KjU, reason: not valid java name */
    public final long m2753getShimmeringBase0d7_KjU() {
        return this.shimmeringBase;
    }

    /* renamed from: getShimmeringHighlight-0d7_KjU, reason: not valid java name */
    public final long m2754getShimmeringHighlight0d7_KjU() {
        return this.shimmeringHighlight;
    }

    /* renamed from: getSuccess-0d7_KjU, reason: not valid java name */
    public final long m2755getSuccess0d7_KjU() {
        return this.success;
    }

    /* renamed from: getSurfaceOnMedia-0d7_KjU, reason: not valid java name */
    public final long m2756getSurfaceOnMedia0d7_KjU() {
        return this.surfaceOnMedia;
    }

    public final AuraColorsSwitch getSwitch() {
        return this.f310switch;
    }

    /* renamed from: getTertiaryText-0d7_KjU, reason: not valid java name */
    public final long m2757getTertiaryText0d7_KjU() {
        return this.tertiaryText;
    }

    public final AuraColorsTextInput getTextInput() {
        return this.textInput;
    }

    /* renamed from: getToast-0d7_KjU, reason: not valid java name */
    public final long m2758getToast0d7_KjU() {
        return this.toast;
    }

    /* renamed from: getToastShadow-0d7_KjU, reason: not valid java name */
    public final long m2759getToastShadow0d7_KjU() {
        return this.toastShadow;
    }

    /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
    public final long m2760getTransparent0d7_KjU() {
        return this.transparent;
    }

    /* renamed from: getUnfocusedBorder-0d7_KjU, reason: not valid java name */
    public final long m2761getUnfocusedBorder0d7_KjU() {
        return this.unfocusedBorder;
    }

    /* renamed from: getWarning-0d7_KjU, reason: not valid java name */
    public final long m2762getWarning0d7_KjU() {
        return this.warning;
    }

    public int hashCode() {
        int iA02 = C0KA.A02(this.isLight);
        long j = this.background;
        long j2 = B6A.A01;
        int iA06 = AnonymousClass006.A06(this.notificationBadge, AnonymousClass006.A06(this.transparent, AnonymousClass006.A06(this.negativeAccent, AnonymousClass006.A06(this.inactive, AnonymousClass006.A06(this.warning, AnonymousClass006.A06(this.success, AnonymousClass006.A06(this.accent, AnonymousClass006.A06(this.error, AnonymousClass006.A06(this.secondaryModal, AnonymousClass006.A06(this.modal, AnonymousClass006.A06(this.toast, AnonymousClass006.A06(this.toastShadow, AnonymousClass006.A06(this.shimmeringHighlight, AnonymousClass006.A06(this.shimmeringBase, AnonymousClass006.A06(this.fillDivider, AnonymousClass006.A06(this.unfocusedBorder, AnonymousClass006.A06(this.focusedBorder, AnonymousClass006.A06(this.avatarBorder, AnonymousClass006.A06(this.photoBorder, AnonymousClass006.A06(this.elevatedBorder, AnonymousClass006.A06(this.border, AnonymousClass005.A0F(this.datePicker, AnonymousClass005.A0F(this.textInput, AnonymousClass006.A06(this.shadow, AnonymousClass006.A06(this.panelTransitionScrim, AnonymousClass006.A06(this.scrim, AnonymousClass006.A06(this.surfaceOnMedia, AnonymousClass006.A06(this.onMedia, AnonymousClass006.A06(this.onLight, AnonymousClass005.A0F(this.f310switch, AnonymousClass006.A06(this.secondaryButtonBackground, AnonymousClass006.A06(this.destructiveButtonBackground, AnonymousClass006.A06(this.primaryButtonBackground, AnonymousClass006.A06(this.invertedButtonContent, AnonymousClass006.A06(this.invertedButtonBackground, AnonymousClass006.A06(this.iconSuccess, AnonymousClass005.A0F(this.destructiveIcon, AnonymousClass005.A0F(this.secondaryIcon, AnonymousClass005.A0F(this.primaryIcon, AnonymousClass006.A06(this.destructiveText, AnonymousClass006.A06(this.errorText, AnonymousClass006.A06(this.invertedText, AnonymousClass006.A06(this.link, AnonymousClass006.A06(this.quaternaryText, AnonymousClass006.A06(this.tertiaryText, AnonymousClass006.A06(this.secondaryText, AnonymousClass006.A06(this.primaryText, AnonymousClass006.A06(this.card, AnonymousClass006.A06(this.bubble, AnonymousClass006.A06(this.secondaryElevated, AnonymousClass006.A06(this.elevated, AnonymousClass006.A06(this.highlight, AnonymousClass006.A06(j, iA02)))))))))))))))))))))))))))))))))))))))))))))))))))));
        long j3 = this.ratingStar;
        return iA06 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final boolean isLight() {
        return this.isLight;
    }

    public /* synthetic */ AuraColors(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, AuraColorsIconTint auraColorsIconTint, AuraColorsIconTint auraColorsIconTint2, AuraColorsIconTint auraColorsIconTint3, long j15, long j16, long j17, long j18, long j19, long j20, AuraColorsSwitch auraColorsSwitch, long j21, long j22, long j23, long j24, long j25, long j26, AuraColorsTextInput auraColorsTextInput, AuraColorsDatePicker auraColorsDatePicker, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, C06H c06h) {
        this(z, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, auraColorsIconTint, auraColorsIconTint2, auraColorsIconTint3, j15, j16, j17, j18, j19, j20, auraColorsSwitch, j21, j22, j23, j24, j25, j26, auraColorsTextInput, auraColorsDatePicker, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48);
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: copy-bCO8MG8, reason: not valid java name */
    public final AuraColors m2712copybCO8MG8(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, AuraColorsIconTint auraColorsIconTint, AuraColorsIconTint auraColorsIconTint2, AuraColorsIconTint auraColorsIconTint3, long j15, long j16, long j17, long j18, long j19, long j20, AuraColorsSwitch auraColorsSwitch, long j21, long j22, long j23, long j24, long j25, long j26, AuraColorsTextInput auraColorsTextInput, AuraColorsDatePicker auraColorsDatePicker, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        AnonymousClass003.A12(auraColorsIconTint, auraColorsIconTint2);
        C7384Etj.A0Y(auraColorsIconTint3, 17);
        C7384Etj.A0Y(auraColorsSwitch, 24);
        C7384Etj.A0Y(auraColorsTextInput, 31);
        C7384Etj.A0Y(auraColorsDatePicker, 32);
        return new AuraColors(z, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, auraColorsIconTint, auraColorsIconTint2, auraColorsIconTint3, j15, j16, j17, j18, j19, j20, auraColorsSwitch, j21, j22, j23, j24, j25, j26, auraColorsTextInput, auraColorsDatePicker, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48);
    }

    /* renamed from: copy-bCO8MG8$default, reason: not valid java name */
    public static /* synthetic */ AuraColors m2663copybCO8MG8$default(AuraColors auraColors, boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, AuraColorsIconTint auraColorsIconTint, AuraColorsIconTint auraColorsIconTint2, AuraColorsIconTint auraColorsIconTint3, long j15, long j16, long j17, long j18, long j19, long j20, AuraColorsSwitch auraColorsSwitch, long j21, long j22, long j23, long j24, long j25, long j26, AuraColorsTextInput auraColorsTextInput, AuraColorsDatePicker auraColorsDatePicker, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        boolean z2 = z;
        long j49 = j;
        long j50 = j2;
        long j51 = j3;
        long j52 = j4;
        long j53 = j5;
        long j54 = j6;
        long j55 = j7;
        long j56 = j11;
        long j57 = j12;
        long j58 = j13;
        long j59 = j14;
        AuraColorsIconTint auraColorsIconTint4 = auraColorsIconTint;
        AuraColorsIconTint auraColorsIconTint5 = auraColorsIconTint2;
        AuraColorsIconTint auraColorsIconTint6 = auraColorsIconTint3;
        long j60 = j16;
        long j61 = j17;
        long j62 = j18;
        long j63 = j19;
        long j64 = j20;
        AuraColorsSwitch auraColorsSwitch2 = auraColorsSwitch;
        long j65 = j23;
        long j66 = j24;
        long j67 = j25;
        long j68 = j26;
        AuraColorsTextInput auraColorsTextInput2 = auraColorsTextInput;
        AuraColorsDatePicker auraColorsDatePicker2 = auraColorsDatePicker;
        long j69 = j29;
        long j70 = j30;
        long j71 = j31;
        long j72 = j32;
        long j73 = j35;
        long j74 = j36;
        long j75 = j37;
        long j76 = j38;
        long j77 = j39;
        long j78 = j43;
        long j79 = j44;
        long j80 = j45;
        long j81 = j46;
        long j82 = j47;
        long j83 = j8;
        long j84 = j9;
        long j85 = j10;
        long j86 = j15;
        long j87 = j21;
        long j88 = j22;
        long j89 = j27;
        long j90 = j28;
        long j91 = j33;
        long j92 = j34;
        long j93 = j40;
        long j94 = j41;
        long j95 = j42;
        long j96 = j48;
        if ((i & 1) != 0) {
            z2 = auraColors.isLight;
        }
        if ((i & 2) != 0) {
            j49 = auraColors.background;
        }
        if ((i & 4) != 0) {
            j50 = auraColors.highlight;
        }
        if ((i & 8) != 0) {
            j51 = auraColors.elevated;
        }
        if ((i & 16) != 0) {
            j52 = auraColors.secondaryElevated;
        }
        if ((i & 32) != 0) {
            j53 = auraColors.bubble;
        }
        if ((i & 64) != 0) {
            j54 = auraColors.card;
        }
        if ((i & 128) != 0) {
            j55 = auraColors.primaryText;
        }
        if ((i & 256) != 0) {
            j83 = auraColors.secondaryText;
        }
        if ((i & 512) != 0) {
            j84 = auraColors.tertiaryText;
        }
        if ((i & 1024) != 0) {
            j85 = auraColors.quaternaryText;
        }
        if ((i & 2048) != 0) {
            j56 = auraColors.link;
        }
        if ((i & 4096) != 0) {
            j57 = auraColors.invertedText;
        }
        if ((i & 8192) != 0) {
            j58 = auraColors.errorText;
        }
        if ((i & 16384) != 0) {
            j59 = auraColors.destructiveText;
        }
        if ((i & 32768) != 0) {
            auraColorsIconTint4 = auraColors.primaryIcon;
        }
        if ((i & 65536) != 0) {
            auraColorsIconTint5 = auraColors.secondaryIcon;
        }
        if ((i & 131072) != 0) {
            auraColorsIconTint6 = auraColors.destructiveIcon;
        }
        if ((i & 262144) != 0) {
            j86 = auraColors.iconSuccess;
        }
        if ((i & 524288) != 0) {
            j60 = auraColors.invertedButtonBackground;
        }
        if ((i & 1048576) != 0) {
            j61 = auraColors.invertedButtonContent;
        }
        if ((i & 2097152) != 0) {
            j62 = auraColors.primaryButtonBackground;
        }
        if ((i & 4194304) != 0) {
            j63 = auraColors.destructiveButtonBackground;
        }
        if ((i & 8388608) != 0) {
            j64 = auraColors.secondaryButtonBackground;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            auraColorsSwitch2 = auraColors.f310switch;
        }
        if ((i & 33554432) != 0) {
            j87 = auraColors.onLight;
        }
        if ((i & 67108864) != 0) {
            j88 = auraColors.onMedia;
        }
        if ((i & 134217728) != 0) {
            j65 = auraColors.surfaceOnMedia;
        }
        if ((i & 268435456) != 0) {
            j66 = auraColors.scrim;
        }
        if ((i & 536870912) != 0) {
            j67 = auraColors.panelTransitionScrim;
        }
        if ((i & 1073741824) != 0) {
            j68 = auraColors.shadow;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            auraColorsTextInput2 = auraColors.textInput;
        }
        if ((i2 & 1) != 0) {
            auraColorsDatePicker2 = auraColors.datePicker;
        }
        if ((i2 & 2) != 0) {
            j89 = auraColors.border;
        }
        if ((i2 & 4) != 0) {
            j90 = auraColors.elevatedBorder;
        }
        if ((i2 & 8) != 0) {
            j69 = auraColors.photoBorder;
        }
        if ((i2 & 16) != 0) {
            j70 = auraColors.avatarBorder;
        }
        if ((i2 & 32) != 0) {
            j71 = auraColors.focusedBorder;
        }
        if ((i2 & 64) != 0) {
            j72 = auraColors.unfocusedBorder;
        }
        if ((i2 & 128) != 0) {
            j91 = auraColors.fillDivider;
        }
        if ((i2 & 256) != 0) {
            j92 = auraColors.shimmeringBase;
        }
        if ((i2 & 512) != 0) {
            j73 = auraColors.shimmeringHighlight;
        }
        if ((i2 & 1024) != 0) {
            j74 = auraColors.toastShadow;
        }
        if ((i2 & 2048) != 0) {
            j75 = auraColors.toast;
        }
        if ((i2 & 4096) != 0) {
            j76 = auraColors.modal;
        }
        if ((i2 & 8192) != 0) {
            j77 = auraColors.secondaryModal;
        }
        if ((i2 & 16384) != 0) {
            j93 = auraColors.error;
        }
        if ((i2 & 32768) != 0) {
            j94 = auraColors.accent;
        }
        if ((i2 & 65536) != 0) {
            j95 = auraColors.success;
        }
        if ((i2 & 131072) != 0) {
            j78 = auraColors.warning;
        }
        if ((i2 & 262144) != 0) {
            j79 = auraColors.inactive;
        }
        if ((i2 & 524288) != 0) {
            j80 = auraColors.negativeAccent;
        }
        if ((i2 & 1048576) != 0) {
            j81 = auraColors.transparent;
        }
        if ((i2 & 2097152) != 0) {
            j82 = auraColors.notificationBadge;
        }
        if ((i2 & 4194304) != 0) {
            j96 = auraColors.ratingStar;
        }
        return auraColors.m2712copybCO8MG8(z2, j49, j50, j51, j52, j53, j54, j55, j83, j84, j85, j56, j57, j58, j59, auraColorsIconTint4, auraColorsIconTint5, auraColorsIconTint6, j86, j60, j61, j62, j63, j64, auraColorsSwitch2, j87, j88, j65, j66, j67, j68, auraColorsTextInput2, auraColorsDatePicker2, j89, j90, j69, j70, j71, j72, j91, j92, j73, j74, j75, j76, j77, j93, j94, j95, j78, j79, j80, j81, j82, j96);
    }

    public AuraColors(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, AuraColorsIconTint auraColorsIconTint, AuraColorsIconTint auraColorsIconTint2, AuraColorsIconTint auraColorsIconTint3, long j15, long j16, long j17, long j18, long j19, long j20, AuraColorsSwitch auraColorsSwitch, long j21, long j22, long j23, long j24, long j25, long j26, AuraColorsTextInput auraColorsTextInput, AuraColorsDatePicker auraColorsDatePicker, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        AnonymousClass003.A12(auraColorsIconTint, auraColorsIconTint2);
        C7384Etj.A0Y(auraColorsIconTint3, 17);
        C7384Etj.A0Y(auraColorsSwitch, 24);
        C7384Etj.A0Y(auraColorsTextInput, 31);
        C7384Etj.A0Y(auraColorsDatePicker, 32);
        this.isLight = z;
        this.background = j;
        this.highlight = j2;
        this.elevated = j3;
        this.secondaryElevated = j4;
        this.bubble = j5;
        this.card = j6;
        this.primaryText = j7;
        this.secondaryText = j8;
        this.tertiaryText = j9;
        this.quaternaryText = j10;
        this.link = j11;
        this.invertedText = j12;
        this.errorText = j13;
        this.destructiveText = j14;
        this.primaryIcon = auraColorsIconTint;
        this.secondaryIcon = auraColorsIconTint2;
        this.destructiveIcon = auraColorsIconTint3;
        this.iconSuccess = j15;
        this.invertedButtonBackground = j16;
        this.invertedButtonContent = j17;
        this.primaryButtonBackground = j18;
        this.destructiveButtonBackground = j19;
        this.secondaryButtonBackground = j20;
        this.f310switch = auraColorsSwitch;
        this.onLight = j21;
        this.onMedia = j22;
        this.surfaceOnMedia = j23;
        this.scrim = j24;
        this.panelTransitionScrim = j25;
        this.shadow = j26;
        this.textInput = auraColorsTextInput;
        this.datePicker = auraColorsDatePicker;
        this.border = j27;
        this.elevatedBorder = j28;
        this.photoBorder = j29;
        this.avatarBorder = j30;
        this.focusedBorder = j31;
        this.unfocusedBorder = j32;
        this.fillDivider = j33;
        this.shimmeringBase = j34;
        this.shimmeringHighlight = j35;
        this.toastShadow = j36;
        this.toast = j37;
        this.modal = j38;
        this.secondaryModal = j39;
        this.error = j40;
        this.accent = j41;
        this.success = j42;
        this.warning = j43;
        this.inactive = j44;
        this.negativeAccent = j45;
        this.transparent = j46;
        this.notificationBadge = j47;
        this.ratingStar = j48;
    }

    public /* synthetic */ AuraColors(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, AuraColorsIconTint auraColorsIconTint, AuraColorsIconTint auraColorsIconTint2, AuraColorsIconTint auraColorsIconTint3, long j15, long j16, long j17, long j18, long j19, long j20, AuraColorsSwitch auraColorsSwitch, long j21, long j22, long j23, long j24, long j25, long j26, AuraColorsTextInput auraColorsTextInput, AuraColorsDatePicker auraColorsDatePicker, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, C06H c06h) {
        this(z, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, auraColorsIconTint, auraColorsIconTint2, auraColorsIconTint3, j15, j16, j17, j18, j19, j20, auraColorsSwitch, j21, j22, j23, j24, j25, j26, auraColorsTextInput, auraColorsDatePicker, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, (i2 & 4194304) != 0 ? BaseColors.YELLOW_ALPHA_300 : j48);
    }
}
