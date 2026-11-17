package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cI;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentCallState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<VoiceEmbodimentCallState> $callState$delegate;
    public final /* synthetic */ MutableState<Boolean> $rtcPaintedInPresentation$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$4$1(VoiceCallStateHolder voiceCallStateHolder, MutableState<Boolean> mutableState, C1BO<VoiceEmbodimentCallState> c1bo) {
        super(0);
        this.$stateHolder = voiceCallStateHolder;
        this.$rtcPaintedInPresentation$delegate = mutableState;
        this.$callState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$rtcPaintedInPresentation$delegate);
        this.$stateHolder.markEmbodimentRtcFramePainted(C3cI.A03(this.$callState$delegate));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
