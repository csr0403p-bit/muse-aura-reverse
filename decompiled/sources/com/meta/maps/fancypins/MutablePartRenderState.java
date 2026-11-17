package com.meta.maps.fancypins;

import X.BV4;

/* loaded from: classes6.dex */
public final class MutablePartRenderState {
    public boolean hasCommittedState;
    public boolean isVisible;
    public int pendingGeneration;
    public boolean pendingIsVisible;
    public int placementIndex = -1;
    public int variantIndex = 255;
    public int pendingPlacementIndex = -1;
    public int pendingVariantIndex = 255;

    public final void commit(int i) {
        if (this.pendingGeneration == i) {
            this.hasCommittedState = true;
            this.isVisible = this.pendingIsVisible;
            this.placementIndex = this.pendingPlacementIndex;
            this.variantIndex = this.pendingVariantIndex;
            this.pendingGeneration = 0;
        }
    }

    public final int committedPlacementIndexOr(int i) {
        return this.hasCommittedState ? this.placementIndex : i;
    }

    public final FancyPinPartRenderState pendingSnapshot(int i) {
        if (this.pendingGeneration == i) {
            return new FancyPinPartRenderState(this.pendingIsVisible, this.pendingPlacementIndex, this.pendingVariantIndex);
        }
        throw BV4.A0S();
    }

    public final FancyPinPartAnimationHint stage(int i, boolean z, int i2, int i3) {
        FancyPinAnimationHintResolver fancyPinAnimationHintResolver = FancyPinAnimationHintResolver.INSTANCE;
        Boolean boolValueOf = Boolean.valueOf(this.isVisible);
        if (!this.hasCommittedState) {
            boolValueOf = null;
        }
        FancyPinPartAnimationHint fancyPinPartAnimationHintCompute = fancyPinAnimationHintResolver.compute(boolValueOf, this.placementIndex, this.variantIndex, z, i2, i3, false);
        this.pendingGeneration = i;
        this.pendingIsVisible = z;
        this.pendingPlacementIndex = i2;
        this.pendingVariantIndex = i3;
        return fancyPinPartAnimationHintCompute;
    }
}
