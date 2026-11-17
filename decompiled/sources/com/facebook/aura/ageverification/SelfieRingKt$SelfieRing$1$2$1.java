package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SelfieRingKt$SelfieRing$1$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C1BO<Float> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieRingKt$SelfieRing$1$2$1(C1BO<Float> c1bo) {
        super(0);
        this.$progress = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return this.$progress.getValue();
    }
}
