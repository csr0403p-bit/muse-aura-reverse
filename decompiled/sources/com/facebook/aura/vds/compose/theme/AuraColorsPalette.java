package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class AuraColorsPalette extends C06G {
    public static final int $stable = 0;
    public final BorderColors border;
    public final ButtonColors button;
    public final FeatureColors feature;
    public final SemanticColors semantic;
    public final SurfaceColors surface;
    public final TextAndIconColors textAndIcon;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraColorsPalette) {
                AuraColorsPalette auraColorsPalette = (AuraColorsPalette) obj;
                if (!C7384Etj.areEqual(this.surface, auraColorsPalette.surface) || !C7384Etj.areEqual(this.border, auraColorsPalette.border) || !C7384Etj.areEqual(this.button, auraColorsPalette.button) || !C7384Etj.areEqual(this.textAndIcon, auraColorsPalette.textAndIcon) || !C7384Etj.areEqual(this.feature, auraColorsPalette.feature) || !C7384Etj.areEqual(this.semantic, auraColorsPalette.semantic)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraColorsPalette copy$default(AuraColorsPalette auraColorsPalette, SurfaceColors surfaceColors, BorderColors borderColors, ButtonColors buttonColors, TextAndIconColors textAndIconColors, FeatureColors featureColors, SemanticColors semanticColors, int i, Object obj) {
        if ((i & 1) != 0) {
            surfaceColors = auraColorsPalette.surface;
        }
        if ((i & 2) != 0) {
            borderColors = auraColorsPalette.border;
        }
        if ((i & 4) != 0) {
            buttonColors = auraColorsPalette.button;
        }
        if ((i & 8) != 0) {
            textAndIconColors = auraColorsPalette.textAndIcon;
        }
        if ((i & 16) != 0) {
            featureColors = auraColorsPalette.feature;
        }
        if ((i & 32) != 0) {
            semanticColors = auraColorsPalette.semantic;
        }
        return auraColorsPalette.copy(surfaceColors, borderColors, buttonColors, textAndIconColors, featureColors, semanticColors);
    }

    public final SurfaceColors component1() {
        return this.surface;
    }

    public final BorderColors component2() {
        return this.border;
    }

    public final ButtonColors component3() {
        return this.button;
    }

    public final TextAndIconColors component4() {
        return this.textAndIcon;
    }

    public final FeatureColors component5() {
        return this.feature;
    }

    public final SemanticColors component6() {
        return this.semantic;
    }

    public final BorderColors getBorder() {
        return this.border;
    }

    public final ButtonColors getButton() {
        return this.button;
    }

    public final FeatureColors getFeature() {
        return this.feature;
    }

    public final SemanticColors getSemantic() {
        return this.semantic;
    }

    public final SurfaceColors getSurface() {
        return this.surface;
    }

    public final TextAndIconColors getTextAndIcon() {
        return this.textAndIcon;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.semantic, AnonymousClass005.A0F(this.feature, AnonymousClass005.A0F(this.textAndIcon, AnonymousClass005.A0F(this.button, AnonymousClass005.A0F(this.border, AnonymousClass005.A0E(this.surface))))));
    }

    public AuraColorsPalette(SurfaceColors surfaceColors, BorderColors borderColors, ButtonColors buttonColors, TextAndIconColors textAndIconColors, FeatureColors featureColors, SemanticColors semanticColors) {
        AnonymousClass005.A17(surfaceColors, borderColors, buttonColors, textAndIconColors, featureColors);
        C7384Etj.A0Y(semanticColors, 5);
        this.surface = surfaceColors;
        this.border = borderColors;
        this.button = buttonColors;
        this.textAndIcon = textAndIconColors;
        this.feature = featureColors;
        this.semantic = semanticColors;
    }

    public final AuraColorsPalette copy(SurfaceColors surfaceColors, BorderColors borderColors, ButtonColors buttonColors, TextAndIconColors textAndIconColors, FeatureColors featureColors, SemanticColors semanticColors) {
        AnonymousClass005.A17(surfaceColors, borderColors, buttonColors, textAndIconColors, featureColors);
        C7384Etj.A0Y(semanticColors, 5);
        return new AuraColorsPalette(surfaceColors, borderColors, buttonColors, textAndIconColors, featureColors, semanticColors);
    }

    public String toString() {
        return super.toString();
    }
}
