package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$activityVideoTransparent$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<Float> $activityVideoAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$activityVideoTransparent$2$1(C1BO<Float> c1bo) {
        super(0);
        this.$activityVideoAlpha = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C1BO.A01(this.$activityVideoAlpha) <= 0.0f);
    }
}
