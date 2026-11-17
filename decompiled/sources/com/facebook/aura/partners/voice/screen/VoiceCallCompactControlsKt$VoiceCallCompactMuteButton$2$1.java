package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.partners.voice.intf.VoiceCallControlLoggingKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCompactControlsKt$VoiceCallCompactMuteButton$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<VoiceCallUiState> $state$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCompactControlsKt$VoiceCallCompactMuteButton$2$1(VoiceCallStateHolder voiceCallStateHolder, VoiceCallViewModel voiceCallViewModel, C1BO<VoiceCallUiState> c1bo) {
        super(0);
        this.$stateHolder = voiceCallStateHolder;
        this.$viewModel = voiceCallViewModel;
        this.$state$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceCallControlLoggingKt.logCallControlToggle(this.$stateHolder, !this.$state$delegate.getValue().isMuted, HatchComponent.MUTE_BUTTON);
        this.$viewModel.toggleMute();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
