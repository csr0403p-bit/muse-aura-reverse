package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraColorsTextInput extends C06G {
    public static final int $stable = 0;
    public final B6A backgroundColor;
    public final long cursorColor;
    public final long errorBorderColor;
    public final long focusedBorderColor;
    public final long placeholderColor;
    public final long textColor;
    public final long unfocusedBorderColor;

    /* renamed from: copy-3ggCceo$default, reason: not valid java name */
    public static /* synthetic */ AuraColorsTextInput m2840copy3ggCceo$default(AuraColorsTextInput auraColorsTextInput, long j, long j2, long j3, long j4, long j5, long j6, B6A b6a, int i, Object obj) {
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        B6A b6a2 = b6a;
        if ((i & 1) != 0) {
            j7 = auraColorsTextInput.textColor;
        }
        if ((i & 2) != 0) {
            j8 = auraColorsTextInput.cursorColor;
        }
        if ((i & 4) != 0) {
            j9 = auraColorsTextInput.placeholderColor;
        }
        if ((i & 8) != 0) {
            j10 = auraColorsTextInput.focusedBorderColor;
        }
        if ((i & 16) != 0) {
            j11 = auraColorsTextInput.unfocusedBorderColor;
        }
        if ((i & 32) != 0) {
            j12 = auraColorsTextInput.errorBorderColor;
        }
        if ((i & 64) != 0) {
            b6a2 = auraColorsTextInput.backgroundColor;
        }
        return new AuraColorsTextInput(j7, j8, j9, j10, j11, j12, b6a2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraColorsTextInput) {
                AuraColorsTextInput auraColorsTextInput = (AuraColorsTextInput) obj;
                long j = this.textColor;
                long j2 = auraColorsTextInput.textColor;
                long j3 = B6A.A01;
                if (j != j2 || this.cursorColor != auraColorsTextInput.cursorColor || this.placeholderColor != auraColorsTextInput.placeholderColor || this.focusedBorderColor != auraColorsTextInput.focusedBorderColor || this.unfocusedBorderColor != auraColorsTextInput.unfocusedBorderColor || this.errorBorderColor != auraColorsTextInput.errorBorderColor || !C7384Etj.areEqual(this.backgroundColor, auraColorsTextInput.backgroundColor)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m2841component10d7_KjU() {
        return this.textColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2842component20d7_KjU() {
        return this.cursorColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m2843component30d7_KjU() {
        return this.placeholderColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m2844component40d7_KjU() {
        return this.focusedBorderColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m2845component50d7_KjU() {
        return this.unfocusedBorderColor;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m2846component60d7_KjU() {
        return this.errorBorderColor;
    }

    /* renamed from: component7-QN2ZGVo, reason: not valid java name */
    public final B6A m2847component7QN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: copy-3ggCceo, reason: not valid java name */
    public final AuraColorsTextInput m2848copy3ggCceo(long j, long j2, long j3, long j4, long j5, long j6, B6A b6a) {
        return new AuraColorsTextInput(j, j2, j3, j4, j5, j6, b6a);
    }

    /* renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final B6A m2849getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2850getCursorColor0d7_KjU() {
        return this.cursorColor;
    }

    /* renamed from: getErrorBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2851getErrorBorderColor0d7_KjU() {
        return this.errorBorderColor;
    }

    /* renamed from: getFocusedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2852getFocusedBorderColor0d7_KjU() {
        return this.focusedBorderColor;
    }

    /* renamed from: getPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2853getPlaceholderColor0d7_KjU() {
        return this.placeholderColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m2854getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getUnfocusedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2855getUnfocusedBorderColor0d7_KjU() {
        return this.unfocusedBorderColor;
    }

    public int hashCode() {
        int i;
        long j = this.textColor;
        long j2 = B6A.A01;
        int iA06 = AnonymousClass006.A06(this.errorBorderColor, AnonymousClass006.A06(this.unfocusedBorderColor, AnonymousClass006.A06(this.focusedBorderColor, AnonymousClass006.A06(this.placeholderColor, AnonymousClass006.A06(this.cursorColor, AnonymousClass005.A07(j))))));
        B6A b6a = this.backgroundColor;
        if (b6a == null) {
            i = 0;
        } else {
            long j3 = b6a.A00;
            i = (int) (j3 ^ (j3 >>> 32));
        }
        return iA06 + i;
    }

    public AuraColorsTextInput(long j, long j2, long j3, long j4, long j5, long j6, B6A b6a) {
        this.textColor = j;
        this.cursorColor = j2;
        this.placeholderColor = j3;
        this.focusedBorderColor = j4;
        this.unfocusedBorderColor = j5;
        this.errorBorderColor = j6;
        this.backgroundColor = b6a;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraColorsTextInput(long j, long j2, long j3, long j4, long j5, long j6, B6A b6a, int i, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, (i & 64) != 0 ? null : b6a);
    }

    public /* synthetic */ AuraColorsTextInput(long j, long j2, long j3, long j4, long j5, long j6, B6A b6a, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, b6a);
    }
}
