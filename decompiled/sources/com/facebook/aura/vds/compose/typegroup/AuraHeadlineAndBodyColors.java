package com.facebook.aura.vds.compose.typegroup;

import X.AnonymousClass005;
import X.B6A;
import X.C06G;
import X.C06H;

/* loaded from: classes.dex */
public final class AuraHeadlineAndBodyColors extends C06G {
    public static final int $stable = 0;
    public final long bodyColor;
    public final long headlineColor;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraHeadlineAndBodyColors) {
                AuraHeadlineAndBodyColors auraHeadlineAndBodyColors = (AuraHeadlineAndBodyColors) obj;
                long j = this.headlineColor;
                long j2 = auraHeadlineAndBodyColors.headlineColor;
                long j3 = B6A.A01;
                if (j != j2 || this.bodyColor != auraHeadlineAndBodyColors.bodyColor) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ AuraHeadlineAndBodyColors m3089copyOWjLjI$default(AuraHeadlineAndBodyColors auraHeadlineAndBodyColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = auraHeadlineAndBodyColors.headlineColor;
        }
        if ((i & 2) != 0) {
            j2 = auraHeadlineAndBodyColors.bodyColor;
        }
        return new AuraHeadlineAndBodyColors(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m3090component10d7_KjU() {
        return this.headlineColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m3091component20d7_KjU() {
        return this.bodyColor;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final AuraHeadlineAndBodyColors m3092copyOWjLjI(long j, long j2) {
        return new AuraHeadlineAndBodyColors(j, j2);
    }

    /* renamed from: getBodyColor-0d7_KjU, reason: not valid java name */
    public final long m3093getBodyColor0d7_KjU() {
        return this.bodyColor;
    }

    /* renamed from: getHeadlineColor-0d7_KjU, reason: not valid java name */
    public final long m3094getHeadlineColor0d7_KjU() {
        return this.headlineColor;
    }

    public int hashCode() {
        long j = this.headlineColor;
        long j2 = B6A.A01;
        int iA07 = AnonymousClass005.A07(j);
        long j3 = this.bodyColor;
        return iA07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public AuraHeadlineAndBodyColors(long j, long j2) {
        this.headlineColor = j;
        this.bodyColor = j2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraHeadlineAndBodyColors(long j, long j2, C06H c06h) {
        this(j, j2);
    }
}
