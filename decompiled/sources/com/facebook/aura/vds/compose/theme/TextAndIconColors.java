package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C8j4;

/* loaded from: classes6.dex */
public final class TextAndIconColors extends C06G {
    public static final int $stable = 0;
    public final long iconDestructive;
    public final long iconDisabled;
    public final long onLight;
    public final long onMedia;
    public final long textDestructive;
    public final long textIconInverted;
    public final long textPrimary;
    public final long textQuaternary;
    public final long textSecondary;
    public final long textTertiary;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAndIconColors) {
                TextAndIconColors textAndIconColors = (TextAndIconColors) obj;
                long j = this.textPrimary;
                long j2 = textAndIconColors.textPrimary;
                long j3 = B6A.A01;
                if (j != j2 || this.textSecondary != textAndIconColors.textSecondary || this.textTertiary != textAndIconColors.textTertiary || this.textQuaternary != textAndIconColors.textQuaternary || this.textDestructive != textAndIconColors.textDestructive || this.textIconInverted != textAndIconColors.textIconInverted || this.iconDisabled != textAndIconColors.iconDisabled || this.iconDestructive != textAndIconColors.iconDestructive || this.onLight != textAndIconColors.onLight || this.onMedia != textAndIconColors.onMedia) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m3063component10d7_KjU() {
        return this.textPrimary;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name */
    public final long m3064component100d7_KjU() {
        return this.onMedia;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m3065component20d7_KjU() {
        return this.textSecondary;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m3066component30d7_KjU() {
        return this.textTertiary;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m3067component40d7_KjU() {
        return this.textQuaternary;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m3068component50d7_KjU() {
        return this.textDestructive;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m3069component60d7_KjU() {
        return this.textIconInverted;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m3070component70d7_KjU() {
        return this.iconDisabled;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m3071component80d7_KjU() {
        return this.iconDestructive;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name */
    public final long m3072component90d7_KjU() {
        return this.onLight;
    }

    /* renamed from: copy--K518z4, reason: not valid java name */
    public final TextAndIconColors m3073copyK518z4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        return new TextAndIconColors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    /* renamed from: getIconDestructive-0d7_KjU, reason: not valid java name */
    public final long m3074getIconDestructive0d7_KjU() {
        return this.iconDestructive;
    }

    /* renamed from: getIconDisabled-0d7_KjU, reason: not valid java name */
    public final long m3075getIconDisabled0d7_KjU() {
        return this.iconDisabled;
    }

    /* renamed from: getOnLight-0d7_KjU, reason: not valid java name */
    public final long m3076getOnLight0d7_KjU() {
        return this.onLight;
    }

    /* renamed from: getOnMedia-0d7_KjU, reason: not valid java name */
    public final long m3077getOnMedia0d7_KjU() {
        return this.onMedia;
    }

    /* renamed from: getTextDestructive-0d7_KjU, reason: not valid java name */
    public final long m3078getTextDestructive0d7_KjU() {
        return this.textDestructive;
    }

    /* renamed from: getTextIconInverted-0d7_KjU, reason: not valid java name */
    public final long m3079getTextIconInverted0d7_KjU() {
        return this.textIconInverted;
    }

    /* renamed from: getTextPrimary-0d7_KjU, reason: not valid java name */
    public final long m3080getTextPrimary0d7_KjU() {
        return this.textPrimary;
    }

    /* renamed from: getTextQuaternary-0d7_KjU, reason: not valid java name */
    public final long m3081getTextQuaternary0d7_KjU() {
        return this.textQuaternary;
    }

    /* renamed from: getTextSecondary-0d7_KjU, reason: not valid java name */
    public final long m3082getTextSecondary0d7_KjU() {
        return this.textSecondary;
    }

    /* renamed from: getTextTertiary-0d7_KjU, reason: not valid java name */
    public final long m3083getTextTertiary0d7_KjU() {
        return this.textTertiary;
    }

    public int hashCode() {
        long j = this.textPrimary;
        long j2 = B6A.A01;
        return C8j4.A0B(this.onMedia, AnonymousClass006.A06(this.onLight, AnonymousClass006.A06(this.iconDestructive, AnonymousClass006.A06(this.iconDisabled, AnonymousClass006.A06(this.textIconInverted, AnonymousClass006.A06(this.textDestructive, AnonymousClass006.A06(this.textQuaternary, AnonymousClass006.A06(this.textTertiary, AnonymousClass006.A06(this.textSecondary, AnonymousClass005.A07(j))))))))));
    }

    public TextAndIconColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.textPrimary = j;
        this.textSecondary = j2;
        this.textTertiary = j3;
        this.textQuaternary = j4;
        this.textDestructive = j5;
        this.textIconInverted = j6;
        this.iconDisabled = j7;
        this.iconDestructive = j8;
        this.onLight = j9;
        this.onMedia = j10;
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ TextAndIconColors m3062copyK518z4$default(TextAndIconColors textAndIconColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, Object obj) {
        long j11 = j;
        long j12 = j2;
        long j13 = j3;
        long j14 = j4;
        long j15 = j5;
        long j16 = j6;
        long j17 = j7;
        long j18 = j8;
        long j19 = j9;
        long j20 = j10;
        if ((i & 1) != 0) {
            j11 = textAndIconColors.textPrimary;
        }
        if ((i & 2) != 0) {
            j12 = textAndIconColors.textSecondary;
        }
        if ((i & 4) != 0) {
            j13 = textAndIconColors.textTertiary;
        }
        if ((i & 8) != 0) {
            j14 = textAndIconColors.textQuaternary;
        }
        if ((i & 16) != 0) {
            j15 = textAndIconColors.textDestructive;
        }
        if ((i & 32) != 0) {
            j16 = textAndIconColors.textIconInverted;
        }
        if ((i & 64) != 0) {
            j17 = textAndIconColors.iconDisabled;
        }
        if ((i & 128) != 0) {
            j18 = textAndIconColors.iconDestructive;
        }
        if ((i & 256) != 0) {
            j19 = textAndIconColors.onLight;
        }
        if ((i & 512) != 0) {
            j20 = textAndIconColors.onMedia;
        }
        return new TextAndIconColors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    public /* synthetic */ TextAndIconColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }
}
