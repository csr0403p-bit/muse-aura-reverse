package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ScrimScrollConnectionKt$rememberScrimScrollState$1$1 extends AbstractC7559F3s implements Function0<ScrimScrollState> {
    public final /* synthetic */ float $thresholdPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrimScrollConnectionKt$rememberScrimScrollState$1$1(float f) {
        super(0);
        this.$thresholdPx = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ScrimScrollState invoke() {
        return new ScrimScrollState(this.$thresholdPx);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ScrimScrollState invoke() {
        return new ScrimScrollState(this.$thresholdPx);
    }
}
