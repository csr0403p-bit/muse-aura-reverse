package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C1DG;

/* loaded from: classes.dex */
public final class AuraDimensionsSwitch extends C06G {
    public static final int $stable = 0;
    public final float thumbCornerRadius;
    public final float thumbHeight;
    public final float thumbPadding;
    public final float thumbWidth;
    public final float trackCornerRadius;
    public final float trackHeight;
    public final float trackWidth;

    /* renamed from: copy-oRJhP44$default, reason: not valid java name */
    public static /* synthetic */ AuraDimensionsSwitch m2931copyoRJhP44$default(AuraDimensionsSwitch auraDimensionsSwitch, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, Object obj) {
        float f8 = f;
        float f9 = f2;
        float f10 = f3;
        float f11 = f4;
        float f12 = f5;
        float f13 = f6;
        float f14 = f7;
        if ((i & 1) != 0) {
            f8 = auraDimensionsSwitch.trackWidth;
        }
        if ((i & 2) != 0) {
            f9 = auraDimensionsSwitch.trackHeight;
        }
        if ((i & 4) != 0) {
            f10 = auraDimensionsSwitch.thumbWidth;
        }
        if ((i & 8) != 0) {
            f11 = auraDimensionsSwitch.thumbHeight;
        }
        if ((i & 16) != 0) {
            f12 = auraDimensionsSwitch.trackCornerRadius;
        }
        if ((i & 32) != 0) {
            f13 = auraDimensionsSwitch.thumbCornerRadius;
        }
        if ((i & 64) != 0) {
            f14 = auraDimensionsSwitch.thumbPadding;
        }
        return new AuraDimensionsSwitch(f8, f9, f10, f11, f12, f13, f14);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraDimensionsSwitch) {
                AuraDimensionsSwitch auraDimensionsSwitch = (AuraDimensionsSwitch) obj;
                if (!C1DG.A08(this.trackWidth, auraDimensionsSwitch.trackWidth) || !C1DG.A08(this.trackHeight, auraDimensionsSwitch.trackHeight) || !C1DG.A08(this.thumbWidth, auraDimensionsSwitch.thumbWidth) || !C1DG.A08(this.thumbHeight, auraDimensionsSwitch.thumbHeight) || !C1DG.A08(this.trackCornerRadius, auraDimensionsSwitch.trackCornerRadius) || !C1DG.A08(this.thumbCornerRadius, auraDimensionsSwitch.thumbCornerRadius) || !C1DG.A08(this.thumbPadding, auraDimensionsSwitch.thumbPadding)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m2932component1D9Ej5fM() {
        return this.trackWidth;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m2933component2D9Ej5fM() {
        return this.trackHeight;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m2934component3D9Ej5fM() {
        return this.thumbWidth;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m2935component4D9Ej5fM() {
        return this.thumbHeight;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m2936component5D9Ej5fM() {
        return this.trackCornerRadius;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    public final float m2937component6D9Ej5fM() {
        return this.thumbCornerRadius;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name */
    public final float m2938component7D9Ej5fM() {
        return this.thumbPadding;
    }

    /* renamed from: copy-oRJhP44, reason: not valid java name */
    public final AuraDimensionsSwitch m2939copyoRJhP44(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        return new AuraDimensionsSwitch(f, f2, f3, f4, f5, f6, f7);
    }

    /* renamed from: getThumbCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m2940getThumbCornerRadiusD9Ej5fM() {
        return this.thumbCornerRadius;
    }

    /* renamed from: getThumbHeight-D9Ej5fM, reason: not valid java name */
    public final float m2941getThumbHeightD9Ej5fM() {
        return this.thumbHeight;
    }

    /* renamed from: getThumbPadding-D9Ej5fM, reason: not valid java name */
    public final float m2942getThumbPaddingD9Ej5fM() {
        return this.thumbPadding;
    }

    /* renamed from: getThumbWidth-D9Ej5fM, reason: not valid java name */
    public final float m2943getThumbWidthD9Ej5fM() {
        return this.thumbWidth;
    }

    /* renamed from: getTrackCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m2944getTrackCornerRadiusD9Ej5fM() {
        return this.trackCornerRadius;
    }

    /* renamed from: getTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m2945getTrackHeightD9Ej5fM() {
        return this.trackHeight;
    }

    /* renamed from: getTrackWidth-D9Ej5fM, reason: not valid java name */
    public final float m2946getTrackWidthD9Ej5fM() {
        return this.trackWidth;
    }

    public int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.trackWidth) * 31, this.trackHeight), this.thumbWidth), this.thumbHeight), this.trackCornerRadius), this.thumbCornerRadius) + Float.floatToIntBits(this.thumbPadding);
    }

    public AuraDimensionsSwitch(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.trackWidth = f;
        this.trackHeight = f2;
        this.thumbWidth = f3;
        this.thumbHeight = f4;
        this.trackCornerRadius = f5;
        this.thumbCornerRadius = f6;
        this.thumbPadding = f7;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraDimensionsSwitch(float f, float f2, float f3, float f4, float f5, float f6, float f7, C06H c06h) {
        this(f, f2, f3, f4, f5, f6, f7);
    }
}
