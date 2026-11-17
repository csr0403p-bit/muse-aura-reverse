package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C8j4;

/* loaded from: classes6.dex */
public final class ButtonColors extends C06G {
    public static final int $stable = 0;
    public final long buttonSecondaryBackground;
    public final long destructiveButtonBackground;
    public final long invertedButtonBackground;
    public final long invertedButtonContent;
    public final long primaryButtonBackground;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ButtonColors) {
                ButtonColors buttonColors = (ButtonColors) obj;
                long j = this.invertedButtonBackground;
                long j2 = buttonColors.invertedButtonBackground;
                long j3 = B6A.A01;
                if (j != j2 || this.invertedButtonContent != buttonColors.invertedButtonContent || this.primaryButtonBackground != buttonColors.primaryButtonBackground || this.destructiveButtonBackground != buttonColors.destructiveButtonBackground || this.buttonSecondaryBackground != buttonColors.buttonSecondaryBackground) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ ButtonColors m2994copyt635Npw$default(ButtonColors buttonColors, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = buttonColors.invertedButtonBackground;
        }
        if ((i & 2) != 0) {
            j2 = buttonColors.invertedButtonContent;
        }
        if ((i & 4) != 0) {
            j3 = buttonColors.primaryButtonBackground;
        }
        if ((i & 8) != 0) {
            j4 = buttonColors.destructiveButtonBackground;
        }
        if ((i & 16) != 0) {
            j5 = buttonColors.buttonSecondaryBackground;
        }
        return buttonColors.m3000copyt635Npw(j, j2, j3, j4, j5);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m2995component10d7_KjU() {
        return this.invertedButtonBackground;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2996component20d7_KjU() {
        return this.invertedButtonContent;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m2997component30d7_KjU() {
        return this.primaryButtonBackground;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m2998component40d7_KjU() {
        return this.destructiveButtonBackground;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m2999component50d7_KjU() {
        return this.buttonSecondaryBackground;
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final ButtonColors m3000copyt635Npw(long j, long j2, long j3, long j4, long j5) {
        return new ButtonColors(j, j2, j3, j4, j5);
    }

    /* renamed from: getButtonSecondaryBackground-0d7_KjU, reason: not valid java name */
    public final long m3001getButtonSecondaryBackground0d7_KjU() {
        return this.buttonSecondaryBackground;
    }

    /* renamed from: getDestructiveButtonBackground-0d7_KjU, reason: not valid java name */
    public final long m3002getDestructiveButtonBackground0d7_KjU() {
        return this.destructiveButtonBackground;
    }

    /* renamed from: getInvertedButtonBackground-0d7_KjU, reason: not valid java name */
    public final long m3003getInvertedButtonBackground0d7_KjU() {
        return this.invertedButtonBackground;
    }

    /* renamed from: getInvertedButtonContent-0d7_KjU, reason: not valid java name */
    public final long m3004getInvertedButtonContent0d7_KjU() {
        return this.invertedButtonContent;
    }

    /* renamed from: getPrimaryButtonBackground-0d7_KjU, reason: not valid java name */
    public final long m3005getPrimaryButtonBackground0d7_KjU() {
        return this.primaryButtonBackground;
    }

    public int hashCode() {
        long j = this.invertedButtonBackground;
        long j2 = B6A.A01;
        return C8j4.A0B(this.buttonSecondaryBackground, AnonymousClass006.A06(this.destructiveButtonBackground, AnonymousClass006.A06(this.primaryButtonBackground, AnonymousClass006.A06(this.invertedButtonContent, AnonymousClass005.A07(j)))));
    }

    public ButtonColors(long j, long j2, long j3, long j4, long j5) {
        this.invertedButtonBackground = j;
        this.invertedButtonContent = j2;
        this.primaryButtonBackground = j3;
        this.destructiveButtonBackground = j4;
        this.buttonSecondaryBackground = j5;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ButtonColors(long j, long j2, long j3, long j4, long j5, C06H c06h) {
        this(j, j2, j3, j4, j5);
    }
}
