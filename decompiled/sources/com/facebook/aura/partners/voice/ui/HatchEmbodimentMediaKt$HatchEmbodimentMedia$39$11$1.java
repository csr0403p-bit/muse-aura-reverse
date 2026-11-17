package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<AWA> $canvasSize$delegate;
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnRtcFramePainted$delegate;
    public final /* synthetic */ C1BO<Boolean> $currentRtcEverPaintedInCall$delegate;
    public final /* synthetic */ boolean $liveRtcReady;
    public final /* synthetic */ MutableState<AWA> $rtcFrameSize$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfaceLost$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcSurfacePainted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$11$1(boolean z, VoiceEmbodimentMediaController voiceEmbodimentMediaController, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<AWA> mutableState3, MutableState<AWA> mutableState4, C1BO<Boolean> c1bo, C1BO<? extends Function0<Unit>> c1bo2) {
        super(0);
        this.$liveRtcReady = z;
        this.$controller = voiceEmbodimentMediaController;
        this.$rtcSurfacePainted$delegate = mutableState;
        this.$rtcSurfaceLost$delegate = mutableState2;
        this.$canvasSize$delegate = mutableState3;
        this.$rtcFrameSize$delegate = mutableState4;
        this.$currentRtcEverPaintedInCall$delegate = c1bo;
        this.$currentOnRtcFramePainted$delegate = c1bo2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$rtcSurfacePainted$delegate);
        MutableState.A09(false, this.$rtcSurfaceLost$delegate);
        if (this.$liveRtcReady) {
            AWA.A05(this.$rtcFrameSize$delegate, AWA.A03(this.$canvasSize$delegate));
            if (!C1BO.A0F(this.$currentRtcEverPaintedInCall$delegate)) {
                C1BO.A0D(this.$currentOnRtcFramePainted$delegate);
            }
        }
        this.$controller.onRtcFramePainted();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
