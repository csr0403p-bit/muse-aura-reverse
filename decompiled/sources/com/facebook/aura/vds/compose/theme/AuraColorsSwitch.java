package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;

/* loaded from: classes.dex */
public final class AuraColorsSwitch extends C06G {
    public static final int $stable = 0;
    public final long checkedThumbColor;
    public final long checkedTrackColor;
    public final long disabledCheckedThumbColor;
    public final long disabledCheckedTrackColor;
    public final long disabledUncheckedThumbColor;
    public final long disabledUncheckedTrackColor;
    public final long uncheckedThumbColor;
    public final long uncheckedTrackColor;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraColorsSwitch) {
                AuraColorsSwitch auraColorsSwitch = (AuraColorsSwitch) obj;
                long j = this.checkedThumbColor;
                long j2 = auraColorsSwitch.checkedThumbColor;
                long j3 = B6A.A01;
                if (j != j2 || this.checkedTrackColor != auraColorsSwitch.checkedTrackColor || this.uncheckedThumbColor != auraColorsSwitch.uncheckedThumbColor || this.uncheckedTrackColor != auraColorsSwitch.uncheckedTrackColor || this.disabledCheckedThumbColor != auraColorsSwitch.disabledCheckedThumbColor || this.disabledCheckedTrackColor != auraColorsSwitch.disabledCheckedTrackColor || this.disabledUncheckedThumbColor != auraColorsSwitch.disabledUncheckedThumbColor || this.disabledUncheckedTrackColor != auraColorsSwitch.disabledUncheckedTrackColor) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ AuraColorsSwitch m2822copyFD3wquc$default(AuraColorsSwitch auraColorsSwitch, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long j9 = j;
        long j10 = j2;
        long j11 = j3;
        long j12 = j4;
        long j13 = j5;
        long j14 = j6;
        long j15 = j7;
        long j16 = j8;
        if ((i & 1) != 0) {
            j9 = auraColorsSwitch.checkedThumbColor;
        }
        if ((i & 2) != 0) {
            j10 = auraColorsSwitch.checkedTrackColor;
        }
        if ((i & 4) != 0) {
            j11 = auraColorsSwitch.uncheckedThumbColor;
        }
        if ((i & 8) != 0) {
            j12 = auraColorsSwitch.uncheckedTrackColor;
        }
        if ((i & 16) != 0) {
            j13 = auraColorsSwitch.disabledCheckedThumbColor;
        }
        if ((i & 32) != 0) {
            j14 = auraColorsSwitch.disabledCheckedTrackColor;
        }
        if ((i & 64) != 0) {
            j15 = auraColorsSwitch.disabledUncheckedThumbColor;
        }
        if ((i & 128) != 0) {
            j16 = auraColorsSwitch.disabledUncheckedTrackColor;
        }
        long j17 = j11;
        return new AuraColorsSwitch(j9, j10, j17, j12, j13, j14, j15, j16);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m2823component10d7_KjU() {
        return this.checkedThumbColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2824component20d7_KjU() {
        return this.checkedTrackColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m2825component30d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m2826component40d7_KjU() {
        return this.uncheckedTrackColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m2827component50d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m2828component60d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m2829component70d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m2830component80d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final AuraColorsSwitch m2831copyFD3wquc(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return new AuraColorsSwitch(j, j2, j3, j4, j5, j6, j7, j8);
    }

    /* renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2832getCheckedThumbColor0d7_KjU() {
        return this.checkedThumbColor;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2833getCheckedTrackColor0d7_KjU() {
        return this.checkedTrackColor;
    }

    /* renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2834getDisabledCheckedThumbColor0d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2835getDisabledCheckedTrackColor0d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2836getDisabledUncheckedThumbColor0d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2837getDisabledUncheckedTrackColor0d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2838getUncheckedThumbColor0d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2839getUncheckedTrackColor0d7_KjU() {
        return this.uncheckedTrackColor;
    }

    public int hashCode() {
        long j = this.checkedThumbColor;
        long j2 = B6A.A01;
        int iA06 = AnonymousClass006.A06(this.disabledUncheckedThumbColor, AnonymousClass006.A06(this.disabledCheckedTrackColor, AnonymousClass006.A06(this.disabledCheckedThumbColor, AnonymousClass006.A06(this.uncheckedTrackColor, AnonymousClass006.A06(this.uncheckedThumbColor, AnonymousClass006.A06(this.checkedTrackColor, AnonymousClass005.A07(j)))))));
        long j3 = this.disabledUncheckedTrackColor;
        return iA06 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraColorsSwitch(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    public /* synthetic */ AuraColorsSwitch(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, C06H c06h) {
        this(j, j2, j3, j4, C06G.A05(j, j5, i & 16), C06G.A05(j2, j6, i & 32), C06G.A05(j3, j7, i & 64), C06G.A05(j4, j8, i & 128));
    }

    public AuraColorsSwitch(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.checkedThumbColor = j;
        this.checkedTrackColor = j2;
        this.uncheckedThumbColor = j3;
        this.uncheckedTrackColor = j4;
        this.disabledCheckedThumbColor = j5;
        this.disabledCheckedTrackColor = j6;
        this.disabledUncheckedThumbColor = j7;
        this.disabledUncheckedTrackColor = j8;
    }
}
