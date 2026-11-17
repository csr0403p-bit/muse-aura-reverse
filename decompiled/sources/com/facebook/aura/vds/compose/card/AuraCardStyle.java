package com.facebook.aura.vds.compose.card;

import X.B6A;
import X.BFM;
import X.C1AC;
import X.C1DG;
import X.C1DH;
import X.C1EQ;
import X.C3TQ;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;

/* loaded from: classes.dex */
public interface AuraCardStyle {
    C1EQ backgroundBrush();

    /* renamed from: backgroundColor-8tov2TA, reason: not valid java name */
    B6A mo2488backgroundColor8tov2TA(boolean z, BFM bfm, int i);

    C1DH borderStroke(boolean z, BFM bfm, int i);

    boolean buttonModeInverted();

    AuraLabelButtonStyle buttonStyle(BFM bfm, int i);

    boolean buttonStyleOverrideAllowed();

    C3TQ contentPaddingValues(boolean z);

    AuraThemeMode isLight();

    C1AC leadingAlignment();

    /* renamed from: minHeight-lTKBWiU, reason: not valid java name */
    C1DG mo2489minHeightlTKBWiU();

    C3TQ trailingItemPaddingValues();
}
