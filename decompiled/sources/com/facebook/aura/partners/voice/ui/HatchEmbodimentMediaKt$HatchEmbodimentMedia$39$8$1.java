package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$8$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C1BO<Float> $rtcAlpha;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfaceLost$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfacePainted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$8$1(C1BO<Float> c1bo, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$rtcAlpha = c1bo;
        this.$rtcSurfacePainted$delegate = mutableState;
        this.$rtcSurfaceLost$delegate = mutableState2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf((!MutableState.A0A((MutableState) this.$rtcSurfacePainted$delegate) || MutableState.A0A((MutableState) this.$rtcSurfaceLost$delegate)) ? 0.0f : C1BO.A01(this.$rtcAlpha));
    }
}
