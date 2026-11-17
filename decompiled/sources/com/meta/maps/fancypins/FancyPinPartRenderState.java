package com.meta.maps.fancypins;

import X.AbstractC7610F5x;
import X.C0KA;
import X.C60O;

/* loaded from: classes6.dex */
public final class FancyPinPartRenderState {
    public final boolean isVisible;
    public final int placementIndex;
    public final int variantIndex;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinPartRenderState) {
                FancyPinPartRenderState fancyPinPartRenderState = (FancyPinPartRenderState) obj;
                if (this.isVisible != fancyPinPartRenderState.isVisible || this.placementIndex != fancyPinPartRenderState.placementIndex || this.variantIndex != fancyPinPartRenderState.variantIndex) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinPartRenderState copy$default(FancyPinPartRenderState fancyPinPartRenderState, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = fancyPinPartRenderState.isVisible;
        }
        if ((i3 & 2) != 0) {
            i = fancyPinPartRenderState.placementIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = fancyPinPartRenderState.variantIndex;
        }
        return new FancyPinPartRenderState(z, i, i2);
    }

    public final boolean component1() {
        return this.isVisible;
    }

    public final int component2() {
        return this.placementIndex;
    }

    public final int component3() {
        return this.variantIndex;
    }

    public final FancyPinPartRenderState copy(boolean z, int i, int i2) {
        return new FancyPinPartRenderState(z, i, i2);
    }

    public final int getPlacementIndex() {
        return this.placementIndex;
    }

    public final int getVariantIndex() {
        return this.variantIndex;
    }

    public int hashCode() {
        return ((C0KA.A02(this.isVisible) + this.placementIndex) * 31) + this.variantIndex;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        boolean z = this.isVisible;
        int i = this.placementIndex;
        int i2 = this.variantIndex;
        StringBuilder sbA10 = C60O.A10("FancyPinPartRenderState(isVisible=", z);
        sbA10.append(", placementIndex=");
        sbA10.append(i);
        return AbstractC7610F5x.A0x(", variantIndex=", sbA10, i2);
    }

    public FancyPinPartRenderState(boolean z, int i, int i2) {
        this.isVisible = z;
        this.placementIndex = i;
        this.variantIndex = i2;
    }
}
