package com.facebook.aura.vds.compose.surface;

import X.AnonymousClass005;
import X.B6A;
import X.C06G;
import X.C06H;

/* loaded from: classes.dex */
public final class AuraElevatedColors extends C06G {
    public static final int $stable = 0;
    public final long background;
    public final long border;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraElevatedColors) {
                AuraElevatedColors auraElevatedColors = (AuraElevatedColors) obj;
                long j = this.background;
                long j2 = auraElevatedColors.background;
                long j3 = B6A.A01;
                if (j != j2 || this.border != auraElevatedColors.border) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ AuraElevatedColors m2616copyOWjLjI$default(AuraElevatedColors auraElevatedColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = auraElevatedColors.background;
        }
        if ((i & 2) != 0) {
            j2 = auraElevatedColors.border;
        }
        return new AuraElevatedColors(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m2617component10d7_KjU() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2618component20d7_KjU() {
        return this.border;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final AuraElevatedColors m2619copyOWjLjI(long j, long j2) {
        return new AuraElevatedColors(j, j2);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m2620getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m2621getBorder0d7_KjU() {
        return this.border;
    }

    public int hashCode() {
        long j = this.background;
        long j2 = B6A.A01;
        int iA07 = AnonymousClass005.A07(j);
        long j3 = this.border;
        return iA07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public AuraElevatedColors(long j, long j2) {
        this.background = j;
        this.border = j2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraElevatedColors(long j, long j2, C06H c06h) {
        this(j, j2);
    }
}
