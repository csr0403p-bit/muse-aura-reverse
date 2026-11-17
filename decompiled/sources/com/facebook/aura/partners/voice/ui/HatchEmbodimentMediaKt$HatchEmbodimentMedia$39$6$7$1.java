package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$7$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C1BO<Float> $activityVideoAlpha;
    public final /* synthetic */ boolean $clipFadingToStill;
    public final /* synthetic */ C1BO<Float> $rtcAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$7$1(boolean z, C1BO<Float> c1bo, C1BO<Float> c1bo2) {
        super(0);
        this.$clipFadingToStill = z;
        this.$rtcAlpha = c1bo;
        this.$activityVideoAlpha = c1bo2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf((this.$clipFadingToStill || C1BO.A01(this.$rtcAlpha) <= 0.0f || C1BO.A01(this.$activityVideoAlpha) <= 0.0f) ? C1BO.A01(this.$activityVideoAlpha) : 1.0f);
    }
}
