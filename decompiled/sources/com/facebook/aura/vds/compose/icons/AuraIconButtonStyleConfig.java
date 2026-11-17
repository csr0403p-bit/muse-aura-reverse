package com.facebook.aura.vds.compose.icons;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1DG;
import X.C1EQ;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraIconButtonStyleConfig extends C06G {
    public static final int $stable = 0;
    public final long backgroundColor;
    public final float elevation;
    public final C1EQ gradientBrush;
    public final long iconColor;
    public final boolean requiresBackground;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraIconButtonStyleConfig) {
                AuraIconButtonStyleConfig auraIconButtonStyleConfig = (AuraIconButtonStyleConfig) obj;
                long j = this.iconColor;
                long j2 = auraIconButtonStyleConfig.iconColor;
                long j3 = B6A.A01;
                if (j != j2 || this.backgroundColor != auraIconButtonStyleConfig.backgroundColor || !C7384Etj.areEqual(this.gradientBrush, auraIconButtonStyleConfig.gradientBrush) || this.requiresBackground != auraIconButtonStyleConfig.requiresBackground || !C1DG.A08(this.elevation, auraIconButtonStyleConfig.elevation)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-GCAZt4c$default, reason: not valid java name */
    public static /* synthetic */ AuraIconButtonStyleConfig m2558copyGCAZt4c$default(AuraIconButtonStyleConfig auraIconButtonStyleConfig, long j, long j2, C1EQ c1eq, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = auraIconButtonStyleConfig.iconColor;
        }
        if ((i & 2) != 0) {
            j2 = auraIconButtonStyleConfig.backgroundColor;
        }
        if ((i & 4) != 0) {
            c1eq = auraIconButtonStyleConfig.gradientBrush;
        }
        if ((i & 8) != 0) {
            z = auraIconButtonStyleConfig.requiresBackground;
        }
        if ((i & 16) != 0) {
            f = auraIconButtonStyleConfig.elevation;
        }
        return auraIconButtonStyleConfig.m2562copyGCAZt4c(j, j2, c1eq, z, f);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m2559component10d7_KjU() {
        return this.iconColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m2560component20d7_KjU() {
        return this.backgroundColor;
    }

    public final C1EQ component3() {
        return this.gradientBrush;
    }

    public final boolean component4() {
        return this.requiresBackground;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m2561component5D9Ej5fM() {
        return this.elevation;
    }

    /* renamed from: copy-GCAZt4c, reason: not valid java name */
    public final AuraIconButtonStyleConfig m2562copyGCAZt4c(long j, long j2, C1EQ c1eq, boolean z, float f) {
        return new AuraIconButtonStyleConfig(j, j2, c1eq, z, f);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m2563getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2564getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final C1EQ getGradientBrush() {
        return this.gradientBrush;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m2565getIconColor0d7_KjU() {
        return this.iconColor;
    }

    public final boolean getRequiresBackground() {
        return this.requiresBackground;
    }

    public int hashCode() {
        long j = this.iconColor;
        long j2 = B6A.A01;
        return C0KA.A01((AnonymousClass006.A06(this.backgroundColor, AnonymousClass005.A07(j)) + AnonymousClass006.A0D(this.gradientBrush)) * 31, this.requiresBackground) + Float.floatToIntBits(this.elevation);
    }

    public AuraIconButtonStyleConfig(long j, long j2, C1EQ c1eq, boolean z, float f) {
        this.iconColor = j;
        this.backgroundColor = j2;
        this.gradientBrush = c1eq;
        this.requiresBackground = z;
        this.elevation = f;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraIconButtonStyleConfig(long j, long j2, C1EQ c1eq, boolean z, float f, int i, C06H c06h) {
        this(j, j2, (i & 4) != 0 ? null : c1eq, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0.0f : f);
    }

    public /* synthetic */ AuraIconButtonStyleConfig(long j, long j2, C1EQ c1eq, boolean z, float f, C06H c06h) {
        this(j, j2, c1eq, z, f);
    }
}
