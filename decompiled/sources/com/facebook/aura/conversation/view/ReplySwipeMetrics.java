package com.facebook.aura.conversation.view;

import X.BLU;

/* loaded from: classes.dex */
public final class ReplySwipeMetrics {
    public final float affordanceSlotPx;
    public final boolean isRtl;
    public final float maxTranslatePx;
    public final float thresholdPx;

    public final float bubbleStartGap(BLU blu, BLU blu2) {
        int i;
        int i2;
        if (blu == null || blu2 == null) {
            return 0.0f;
        }
        if (this.isRtl) {
            i = blu.A02;
            i2 = blu2.A02;
        } else {
            i = blu2.A01;
            i2 = blu.A01;
        }
        return i - i2;
    }

    public final float getAffordanceSlotPx() {
        return this.affordanceSlotPx;
    }

    public final float getMaxTranslatePx() {
        return this.maxTranslatePx;
    }

    public final float getThresholdPx() {
        return this.thresholdPx;
    }

    public final boolean isRtl() {
        return this.isRtl;
    }

    public final float resistTranslation(float f) {
        float f2 = this.thresholdPx;
        if (f > f2) {
            f = ((f - f2) * 0.35f) + f2;
        }
        return Math.min(f, this.maxTranslatePx);
    }

    public ReplySwipeMetrics(float f, float f2, float f3, boolean z) {
        this.thresholdPx = f;
        this.maxTranslatePx = f2;
        this.affordanceSlotPx = f3;
        this.isRtl = z;
    }
}
