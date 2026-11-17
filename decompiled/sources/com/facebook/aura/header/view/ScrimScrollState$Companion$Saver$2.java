package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes4.dex */
public final class ScrimScrollState$Companion$Saver$2 extends AbstractC7559F3s implements G0U<Float, ScrimScrollState> {
    public final /* synthetic */ float $thresholdPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrimScrollState$Companion$Saver$2(float f) {
        super(1);
        this.$thresholdPx = f;
    }

    public final ScrimScrollState invoke(float f) {
        ScrimScrollState scrimScrollState = new ScrimScrollState(this.$thresholdPx);
        scrimScrollState.setOffset(f);
        return scrimScrollState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ ScrimScrollState invoke(Float f) {
        return invoke(AnonymousClass001.A02(f));
    }
}
