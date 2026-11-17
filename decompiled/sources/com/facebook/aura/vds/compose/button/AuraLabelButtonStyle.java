package com.facebook.aura.vds.compose.button;

import X.B6A;
import X.BFM;
import X.C1822Arm;
import X.C1DH;
import X.C1DM;
import X.C3TQ;
import com.facebook.aura.vds.compose.icons.AuraIconSize;

/* loaded from: classes.dex */
public interface AuraLabelButtonStyle {
    /* renamed from: backgroundColor-0d7_KjU, reason: not valid java name */
    long mo2427backgroundColor0d7_KjU();

    C1DM backgroundShape(AuraButtonSize auraButtonSize);

    C1DH borderStroke(boolean z, boolean z2);

    /* renamed from: contentColor-wmQWz5c, reason: not valid java name */
    long mo2428contentColorwmQWz5c(boolean z, boolean z2, BFM bfm, int i);

    /* renamed from: elevation-D9Ej5fM, reason: not valid java name */
    float mo2429elevationD9Ej5fM();

    AuraIconSize iconSize(boolean z, boolean z2, AuraButtonSize auraButtonSize, BFM bfm, int i);

    /* renamed from: minSize-ccRj1GA, reason: not valid java name */
    float mo2430minSizeccRj1GA(AuraButtonSize auraButtonSize, BFM bfm, int i);

    C3TQ padding(boolean z, boolean z2, AuraButtonSize auraButtonSize, BFM bfm, int i);

    /* renamed from: shadowColor-6MYuD4A, reason: not valid java name */
    B6A mo2431shadowColor6MYuD4A(BFM bfm, int i);

    boolean sizeAllowed(AuraButtonSize auraButtonSize);

    /* renamed from: spacingBetweenIconAndText-ccRj1GA, reason: not valid java name */
    float mo2432spacingBetweenIconAndTextccRj1GA(AuraButtonSize auraButtonSize, BFM bfm, int i);

    boolean squareAspectRation(boolean z, BFM bfm, int i);

    C1822Arm textStyle(AuraButtonSize auraButtonSize, BFM bfm, int i);
}
