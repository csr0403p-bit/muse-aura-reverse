package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C8j4;

/* loaded from: classes6.dex */
public final class BorderColors extends C06G {
    public static final int $stable = 0;
    public final long avatarBorder;
    public final long border;
    public final long divider;
    public final long elevatedBorder;
    public final long focusedBorder;
    public final long photoBorder;
    public final long unfocusedBorder;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BorderColors) {
                BorderColors borderColors = (BorderColors) obj;
                long j = this.border;
                long j2 = borderColors.border;
                long j3 = B6A.A01;
                if (j != j2 || this.elevatedBorder != borderColors.elevatedBorder || this.divider != borderColors.divider || this.focusedBorder != borderColors.focusedBorder || this.unfocusedBorder != borderColors.unfocusedBorder || this.photoBorder != borderColors.photoBorder || this.avatarBorder != borderColors.avatarBorder) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-4JmcsL4$default, reason: not valid java name */
    public static /* synthetic */ BorderColors m2978copy4JmcsL4$default(BorderColors borderColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, Object obj) {
        long j8 = j;
        long j9 = j2;
        long j10 = j3;
        long j11 = j4;
        long j12 = j5;
        long j13 = j6;
        long j14 = j7;
        if ((i & 1) != 0) {
            j8 = borderColors.border;
        }
        if ((i & 2) != 0) {
            j9 = borderColors.elevatedBorder;
        }
        if ((i & 4) != 0) {
            j10 = borderColors.divider;
        }
        if ((i & 8) != 0) {
            j11 = borderColors.focusedBorder;
        }
        if ((i & 16) != 0) {
            j12 = borderColors.unfocusedBorder;
        }
        if ((i & 32) != 0) {
            j13 = borderColors.photoBorder;
        }
        if ((i & 64) != 0) {
            j14 = borderColors.avatarBorder;
        }
        return new BorderColors(j8, j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m2979component10d7_KjU() {
        return this.border;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2980component20d7_KjU() {
        return this.elevatedBorder;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m2981component30d7_KjU() {
        return this.divider;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m2982component40d7_KjU() {
        return this.focusedBorder;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m2983component50d7_KjU() {
        return this.unfocusedBorder;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m2984component60d7_KjU() {
        return this.photoBorder;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m2985component70d7_KjU() {
        return this.avatarBorder;
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final BorderColors m2986copy4JmcsL4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        return new BorderColors(j, j2, j3, j4, j5, j6, j7);
    }

    /* renamed from: getAvatarBorder-0d7_KjU, reason: not valid java name */
    public final long m2987getAvatarBorder0d7_KjU() {
        return this.avatarBorder;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m2988getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getDivider-0d7_KjU, reason: not valid java name */
    public final long m2989getDivider0d7_KjU() {
        return this.divider;
    }

    /* renamed from: getElevatedBorder-0d7_KjU, reason: not valid java name */
    public final long m2990getElevatedBorder0d7_KjU() {
        return this.elevatedBorder;
    }

    /* renamed from: getFocusedBorder-0d7_KjU, reason: not valid java name */
    public final long m2991getFocusedBorder0d7_KjU() {
        return this.focusedBorder;
    }

    /* renamed from: getPhotoBorder-0d7_KjU, reason: not valid java name */
    public final long m2992getPhotoBorder0d7_KjU() {
        return this.photoBorder;
    }

    /* renamed from: getUnfocusedBorder-0d7_KjU, reason: not valid java name */
    public final long m2993getUnfocusedBorder0d7_KjU() {
        return this.unfocusedBorder;
    }

    public int hashCode() {
        long j = this.border;
        long j2 = B6A.A01;
        return C8j4.A0B(this.avatarBorder, AnonymousClass006.A06(this.photoBorder, AnonymousClass006.A06(this.unfocusedBorder, AnonymousClass006.A06(this.focusedBorder, AnonymousClass006.A06(this.divider, AnonymousClass006.A06(this.elevatedBorder, AnonymousClass005.A07(j)))))));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BorderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    public BorderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.border = j;
        this.elevatedBorder = j2;
        this.divider = j3;
        this.focusedBorder = j4;
        this.unfocusedBorder = j5;
        this.photoBorder = j6;
        this.avatarBorder = j7;
    }
}
