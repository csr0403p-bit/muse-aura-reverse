package com.facebook.aura.vds.compose.ext;

import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C8j4;
import X.HDi;
import X.HxS;

/* loaded from: classes4.dex */
public final class BlurConfig extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final float DEFAULT_BLUR_ALPHA = 0.3f;
    public static final float DEFAULT_BLUR_RADIUS = 25.0f;
    public final long color;
    public final float radius;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BlurConfig) {
                BlurConfig blurConfig = (BlurConfig) obj;
                if (Float.compare(this.radius, blurConfig.radius) == 0) {
                    long j = this.color;
                    long j2 = blurConfig.color;
                    long j3 = B6A.A01;
                    if (j == j2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-4WTKRHQ$default, reason: not valid java name */
    public static /* synthetic */ BlurConfig m2540copy4WTKRHQ$default(BlurConfig blurConfig, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = blurConfig.radius;
        }
        if ((i & 2) != 0) {
            j = blurConfig.color;
        }
        return new BlurConfig(f, j);
    }

    public final float component1() {
        return this.radius;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2541component20d7_KjU() {
        return this.color;
    }

    /* renamed from: copy-4WTKRHQ, reason: not valid java name */
    public final BlurConfig m2542copy4WTKRHQ(float f, long j) {
        return new BlurConfig(f, j);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2543getColor0d7_KjU() {
        return this.color;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        int iA04 = C8j4.A04(this.radius);
        long j = this.color;
        long j2 = B6A.A01;
        return AnonymousClass006.A05(j, iA04);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BlurConfig(float f, long j, C06H c06h) {
        this(f, j);
    }

    public BlurConfig(float f, long j) {
        this.radius = f;
        this.color = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BlurConfig(float f) {
        long j = B6A.A01;
        this(25.0f * f, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), f * 0.3f));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BlurConfig(float f, long j, int i, C06H c06h) {
        f = (i & 1) != 0 ? 25.0f : f;
        if ((i & 2) != 0) {
            long j2 = B6A.A01;
            j = HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.3f);
        }
        this(f, j);
    }

    public BlurConfig() {
        this(0.0f, 0L, 3, null);
    }
}
