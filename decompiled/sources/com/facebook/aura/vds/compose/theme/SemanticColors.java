package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C8j4;

/* loaded from: classes6.dex */
public final class SemanticColors extends C06G {
    public static final int $stable = 0;
    public final long accent;
    public final long error;
    public final long iconSuccess;
    public final long inactive;
    public final long negativeAccent;
    public final long success;
    public final long warning;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SemanticColors) {
                SemanticColors semanticColors = (SemanticColors) obj;
                long j = this.accent;
                long j2 = semanticColors.accent;
                long j3 = B6A.A01;
                if (j != j2 || this.error != semanticColors.error || this.success != semanticColors.success || this.warning != semanticColors.warning || this.iconSuccess != semanticColors.iconSuccess || this.inactive != semanticColors.inactive || this.negativeAccent != semanticColors.negativeAccent) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-4JmcsL4$default, reason: not valid java name */
    public static /* synthetic */ SemanticColors m3012copy4JmcsL4$default(SemanticColors semanticColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, Object obj) {
        long j8 = j;
        long j9 = j2;
        long j10 = j3;
        long j11 = j4;
        long j12 = j5;
        long j13 = j6;
        long j14 = j7;
        if ((i & 1) != 0) {
            j8 = semanticColors.accent;
        }
        if ((i & 2) != 0) {
            j9 = semanticColors.error;
        }
        if ((i & 4) != 0) {
            j10 = semanticColors.success;
        }
        if ((i & 8) != 0) {
            j11 = semanticColors.warning;
        }
        if ((i & 16) != 0) {
            j12 = semanticColors.iconSuccess;
        }
        if ((i & 32) != 0) {
            j13 = semanticColors.inactive;
        }
        if ((i & 64) != 0) {
            j14 = semanticColors.negativeAccent;
        }
        return new SemanticColors(j8, j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m3013component10d7_KjU() {
        return this.accent;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m3014component20d7_KjU() {
        return this.error;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m3015component30d7_KjU() {
        return this.success;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m3016component40d7_KjU() {
        return this.warning;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m3017component50d7_KjU() {
        return this.iconSuccess;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m3018component60d7_KjU() {
        return this.inactive;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m3019component70d7_KjU() {
        return this.negativeAccent;
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final SemanticColors m3020copy4JmcsL4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        return new SemanticColors(j, j2, j3, j4, j5, j6, j7);
    }

    /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
    public final long m3021getAccent0d7_KjU() {
        return this.accent;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m3022getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getIconSuccess-0d7_KjU, reason: not valid java name */
    public final long m3023getIconSuccess0d7_KjU() {
        return this.iconSuccess;
    }

    /* renamed from: getInactive-0d7_KjU, reason: not valid java name */
    public final long m3024getInactive0d7_KjU() {
        return this.inactive;
    }

    /* renamed from: getNegativeAccent-0d7_KjU, reason: not valid java name */
    public final long m3025getNegativeAccent0d7_KjU() {
        return this.negativeAccent;
    }

    /* renamed from: getSuccess-0d7_KjU, reason: not valid java name */
    public final long m3026getSuccess0d7_KjU() {
        return this.success;
    }

    /* renamed from: getWarning-0d7_KjU, reason: not valid java name */
    public final long m3027getWarning0d7_KjU() {
        return this.warning;
    }

    public int hashCode() {
        long j = this.accent;
        long j2 = B6A.A01;
        return C8j4.A0B(this.negativeAccent, AnonymousClass006.A06(this.inactive, AnonymousClass006.A06(this.iconSuccess, AnonymousClass006.A06(this.warning, AnonymousClass006.A06(this.success, AnonymousClass006.A06(this.error, AnonymousClass005.A07(j)))))));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SemanticColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    public SemanticColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.accent = j;
        this.error = j2;
        this.success = j3;
        this.warning = j4;
        this.iconSuccess = j5;
        this.inactive = j6;
        this.negativeAccent = j7;
    }
}
