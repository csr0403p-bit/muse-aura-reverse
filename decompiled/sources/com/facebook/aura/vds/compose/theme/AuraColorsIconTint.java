package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.B6A;
import X.C06G;
import X.C06H;

/* loaded from: classes.dex */
public final class AuraColorsIconTint extends C06G {
    public static final int $stable = 0;
    public final long disabled;
    public final long enabled;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraColorsIconTint) {
                AuraColorsIconTint auraColorsIconTint = (AuraColorsIconTint) obj;
                long j = this.enabled;
                long j2 = auraColorsIconTint.enabled;
                long j3 = B6A.A01;
                if (j != j2 || this.disabled != auraColorsIconTint.disabled) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ AuraColorsIconTint m2813copyOWjLjI$default(AuraColorsIconTint auraColorsIconTint, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = auraColorsIconTint.enabled;
        }
        if ((i & 2) != 0) {
            j2 = auraColorsIconTint.disabled;
        }
        return new AuraColorsIconTint(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m2814component10d7_KjU() {
        return this.enabled;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2815component20d7_KjU() {
        return this.disabled;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final AuraColorsIconTint m2816copyOWjLjI(long j, long j2) {
        return new AuraColorsIconTint(j, j2);
    }

    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
    public final long m2817getDisabled0d7_KjU() {
        return this.disabled;
    }

    /* renamed from: getEnabled-0d7_KjU, reason: not valid java name */
    public final long m2818getEnabled0d7_KjU() {
        return this.enabled;
    }

    public int hashCode() {
        long j = this.enabled;
        long j2 = B6A.A01;
        int iA07 = AnonymousClass005.A07(j);
        long j3 = this.disabled;
        return iA07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public AuraColorsIconTint(long j, long j2) {
        this.enabled = j;
        this.disabled = j2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraColorsIconTint(long j, long j2, C06H c06h) {
        this(j, j2);
    }
}
