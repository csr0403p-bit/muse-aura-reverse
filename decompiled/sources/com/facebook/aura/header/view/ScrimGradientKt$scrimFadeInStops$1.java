package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.G0U;

/* loaded from: classes.dex */
public final class ScrimGradientKt$scrimFadeInStops$1 extends AbstractC7559F3s implements G0U<Float, Float> {
    public final /* synthetic */ float $power;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrimGradientKt$scrimFadeInStops$1(float f) {
        super(1);
        this.$power = f;
    }

    public final Float invoke(float f) {
        return Float.valueOf(1.0f - ((float) Math.pow(ScrimGradientKt.smoothStep(1.0f - f), this.$power)));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}
