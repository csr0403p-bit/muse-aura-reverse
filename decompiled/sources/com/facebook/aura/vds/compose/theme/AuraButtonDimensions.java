package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C1DG;
import X.C3TQ;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraButtonDimensions extends C06G {
    public static final int $stable = 0;
    public final C3TQ defaultPadding;
    public final C3TQ iconAndTextPadding;
    public final float iconAndTextSize;
    public final C3TQ iconPadding;
    public final float iconSize;
    public final float minSize;
    public final float spacingBetweenIconAndText;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraButtonDimensions) {
                AuraButtonDimensions auraButtonDimensions = (AuraButtonDimensions) obj;
                if (!C1DG.A08(this.minSize, auraButtonDimensions.minSize) || !C1DG.A08(this.spacingBetweenIconAndText, auraButtonDimensions.spacingBetweenIconAndText) || !C1DG.A08(this.iconSize, auraButtonDimensions.iconSize) || !C1DG.A08(this.iconAndTextSize, auraButtonDimensions.iconAndTextSize) || !C7384Etj.areEqual(this.iconPadding, auraButtonDimensions.iconPadding) || !C7384Etj.areEqual(this.iconAndTextPadding, auraButtonDimensions.iconAndTextPadding) || !C7384Etj.areEqual(this.defaultPadding, auraButtonDimensions.defaultPadding)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-xZ9-QkE$default, reason: not valid java name */
    public static /* synthetic */ AuraButtonDimensions m2647copyxZ9QkE$default(AuraButtonDimensions auraButtonDimensions, float f, float f2, float f3, float f4, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = auraButtonDimensions.minSize;
        }
        if ((i & 2) != 0) {
            f2 = auraButtonDimensions.spacingBetweenIconAndText;
        }
        if ((i & 4) != 0) {
            f3 = auraButtonDimensions.iconSize;
        }
        if ((i & 8) != 0) {
            f4 = auraButtonDimensions.iconAndTextSize;
        }
        if ((i & 16) != 0) {
            c3tq = auraButtonDimensions.iconPadding;
        }
        if ((i & 32) != 0) {
            c3tq2 = auraButtonDimensions.iconAndTextPadding;
        }
        if ((i & 64) != 0) {
            c3tq3 = auraButtonDimensions.defaultPadding;
        }
        return auraButtonDimensions.m2652copyxZ9QkE(f, f2, f3, f4, c3tq, c3tq2, c3tq3);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m2648component1D9Ej5fM() {
        return this.minSize;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m2649component2D9Ej5fM() {
        return this.spacingBetweenIconAndText;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m2650component3D9Ej5fM() {
        return this.iconSize;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m2651component4D9Ej5fM() {
        return this.iconAndTextSize;
    }

    public final C3TQ component5() {
        return this.iconPadding;
    }

    public final C3TQ component6() {
        return this.iconAndTextPadding;
    }

    public final C3TQ component7() {
        return this.defaultPadding;
    }

    public final C3TQ getDefaultPadding() {
        return this.defaultPadding;
    }

    public final C3TQ getIconAndTextPadding() {
        return this.iconAndTextPadding;
    }

    /* renamed from: getIconAndTextSize-D9Ej5fM, reason: not valid java name */
    public final float m2653getIconAndTextSizeD9Ej5fM() {
        return this.iconAndTextSize;
    }

    public final C3TQ getIconPadding() {
        return this.iconPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2654getIconSizeD9Ej5fM() {
        return this.iconSize;
    }

    /* renamed from: getMinSize-D9Ej5fM, reason: not valid java name */
    public final float m2655getMinSizeD9Ej5fM() {
        return this.minSize;
    }

    /* renamed from: getSpacingBetweenIconAndText-D9Ej5fM, reason: not valid java name */
    public final float m2656getSpacingBetweenIconAndTextD9Ej5fM() {
        return this.spacingBetweenIconAndText;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.defaultPadding, AnonymousClass005.A0F(this.iconAndTextPadding, AnonymousClass005.A0F(this.iconPadding, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.minSize) * 31, this.spacingBetweenIconAndText), this.iconSize), this.iconAndTextSize))));
    }

    public AuraButtonDimensions(float f, float f2, float f3, float f4, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3) {
        AnonymousClass003.A0y(c3tq, c3tq2);
        C7384Etj.A0Y(c3tq3, 6);
        this.minSize = f;
        this.spacingBetweenIconAndText = f2;
        this.iconSize = f3;
        this.iconAndTextSize = f4;
        this.iconPadding = c3tq;
        this.iconAndTextPadding = c3tq2;
        this.defaultPadding = c3tq3;
    }

    /* renamed from: copy-xZ9-QkE, reason: not valid java name */
    public final AuraButtonDimensions m2652copyxZ9QkE(float f, float f2, float f3, float f4, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3) {
        AnonymousClass003.A0y(c3tq, c3tq2);
        C7384Etj.A0Y(c3tq3, 6);
        return new AuraButtonDimensions(f, f2, f3, f4, c3tq, c3tq2, c3tq3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraButtonDimensions(float f, float f2, float f3, float f4, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, C06H c06h) {
        this(f, f2, f3, f4, c3tq, c3tq2, c3tq3);
    }
}
