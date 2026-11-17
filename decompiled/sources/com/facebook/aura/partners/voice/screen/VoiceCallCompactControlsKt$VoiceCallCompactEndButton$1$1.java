package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.partners.voice.intf.VoiceCallControlLoggingKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCompactControlsKt$VoiceCallCompactEndButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCompactControlsKt$VoiceCallCompactEndButton$1$1(VoiceCallStateHolder voiceCallStateHolder, VoiceCallViewModel voiceCallViewModel) {
        super(0);
        this.$stateHolder = voiceCallStateHolder;
        this.$viewModel = voiceCallViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceCallControlLoggingKt.logCallControlClick(this.$stateHolder, HatchComponent.END_VOICE_BUTTON);
        this.$viewModel.endCall();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
