package com.facebook.aura.vds.compose.toast;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.B6A;
import X.BFM;
import X.C1DP;
import X.C1EQ;
import X.C3TQ;
import X.C7384Etj;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.theme.AuraToastDimensions;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;

/* loaded from: classes.dex */
public final class AuraToastStyle {
    public static final int $stable = 0;
    public static final AuraToastStyle INSTANCE = new AuraToastStyle();

    public final C3TQ trailingItemPaddingValues(AuraToastOption auraToastOption, BFM bfm, int i) {
        C7384Etj.A0Y(auraToastOption, 0);
        if (!(auraToastOption instanceof AuraToastOption.ChevronNavigation)) {
            AnonymousClass003.A0l(bfm, 73738773);
            return new C1DP(0.0f, 0.0f, 0.0f, 0.0f);
        }
        bfm.AgE(73737661);
        C3TQ c3tq = AnonymousClass002.A0d(bfm).toast.trailingIconItemPadding;
        AnonymousClass001.A1D(bfm);
        return c3tq;
    }

    public final AuraLabelButtonStyle buttonStyle(BFM bfm, int i) {
        return AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
    }

    public final C3TQ contentPaddingValues(boolean z, BFM bfm, int i) {
        C3TQ c3tq;
        if (z) {
            bfm.AgE(-2034557835);
            c3tq = AnonymousClass002.A0d(bfm).toast.contentPadding;
        } else {
            bfm.AgE(-2034556896);
            c3tq = AnonymousClass002.A0d(bfm).toast.contentPaddingNoStartItem;
        }
        AnonymousClass002.A19(bfm);
        return c3tq;
    }

    public final C1EQ backgroundBrush(BFM bfm, int i) {
        return null;
    }

    /* renamed from: backgroundColor-6MYuD4A, reason: not valid java name */
    public final B6A m3086backgroundColor6MYuD4A(BFM bfm, int i) {
        long j = AnonymousClass002.A0c(bfm).toast;
        return new B6A(ColorExtKt.m2545applyStateM3jwhU8(j, true, j, bfm, 48));
    }

    public final boolean buttonModeInverted(BFM bfm, int i) {
        return true;
    }

    public final AuraToastDimensions dimens(BFM bfm, int i) {
        return AnonymousClass002.A0d(bfm).toast;
    }

    public final AuraThemeMode isLight(BFM bfm, int i) {
        return !AnonymousClass002.A0c(bfm).isLight ? AuraThemeMode.LIGHT : AuraThemeMode.DARK;
    }

    /* renamed from: minHeight-chRvn1I, reason: not valid java name */
    public final float m3087minHeightchRvn1I(BFM bfm, int i) {
        return AnonymousClass002.A0d(bfm).toast.minHeight;
    }
}
