package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C8j4;

/* loaded from: classes6.dex */
public final class FeatureColors extends C06G {
    public static final int $stable = 0;
    public final long cursor;
    public final long notificationBadge;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeatureColors) {
                FeatureColors featureColors = (FeatureColors) obj;
                long j = this.cursor;
                long j2 = featureColors.cursor;
                long j3 = B6A.A01;
                if (j != j2 || this.notificationBadge != featureColors.notificationBadge) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ FeatureColors m3006copyOWjLjI$default(FeatureColors featureColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = featureColors.cursor;
        }
        if ((i & 2) != 0) {
            j2 = featureColors.notificationBadge;
        }
        return new FeatureColors(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m3007component10d7_KjU() {
        return this.cursor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m3008component20d7_KjU() {
        return this.notificationBadge;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final FeatureColors m3009copyOWjLjI(long j, long j2) {
        return new FeatureColors(j, j2);
    }

    /* renamed from: getCursor-0d7_KjU, reason: not valid java name */
    public final long m3010getCursor0d7_KjU() {
        return this.cursor;
    }

    /* renamed from: getNotificationBadge-0d7_KjU, reason: not valid java name */
    public final long m3011getNotificationBadge0d7_KjU() {
        return this.notificationBadge;
    }

    public int hashCode() {
        long j = this.cursor;
        long j2 = B6A.A01;
        return C8j4.A0B(this.notificationBadge, AnonymousClass005.A07(j));
    }

    public FeatureColors(long j, long j2) {
        this.cursor = j;
        this.notificationBadge = j2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeatureColors(long j, long j2, C06H c06h) {
        this(j, j2);
    }
}
