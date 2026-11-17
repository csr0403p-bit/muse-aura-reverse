package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class CachedAccessibilityLabel {
    public final String label;
    public final FancyPinPresentation presentation;

    public CachedAccessibilityLabel(FancyPinPresentation fancyPinPresentation, String str) {
        C7384Etj.A0Y(fancyPinPresentation, 0);
        this.presentation = fancyPinPresentation;
        this.label = str;
    }

    public final CachedAccessibilityLabel copy(FancyPinPresentation fancyPinPresentation, String str) {
        C7384Etj.A0Y(fancyPinPresentation, 0);
        return new CachedAccessibilityLabel(fancyPinPresentation, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CachedAccessibilityLabel) {
                CachedAccessibilityLabel cachedAccessibilityLabel = (CachedAccessibilityLabel) obj;
                if (!C7384Etj.areEqual(this.presentation, cachedAccessibilityLabel.presentation) || !C7384Etj.areEqual(this.label, cachedAccessibilityLabel.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CachedAccessibilityLabel copy$default(CachedAccessibilityLabel cachedAccessibilityLabel, FancyPinPresentation fancyPinPresentation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            fancyPinPresentation = cachedAccessibilityLabel.presentation;
        }
        if ((i & 2) != 0) {
            str = cachedAccessibilityLabel.label;
        }
        C7384Etj.A0Y(fancyPinPresentation, 0);
        return new CachedAccessibilityLabel(fancyPinPresentation, str);
    }

    public final FancyPinPresentation component1() {
        return this.presentation;
    }

    public final String component2() {
        return this.label;
    }

    public final String getLabel() {
        return this.label;
    }

    public final FancyPinPresentation getPresentation() {
        return this.presentation;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.presentation) + AnonymousClass006.A0G(this.label);
    }

    public String toString() {
        return C3cJ.A0N(", label=", this.label, C3cG.A0f(this.presentation, "CachedAccessibilityLabel(presentation="));
    }
}
