package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;

/* loaded from: classes2.dex */
public final class VoiceCallSurfacesKt$VoiceCallLifecycleEffect$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Long> $pendingStart$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallSurfacesKt$VoiceCallLifecycleEffect$2$1(C1BO<Long> c1bo, VoiceCallStateHolder voiceCallStateHolder, VoiceCallViewModel voiceCallViewModel) {
        super(1);
        this.$pendingStart$delegate = c1bo;
        this.$stateHolder = voiceCallStateHolder;
        this.$viewModel = voiceCallViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Long value = this.$pendingStart$delegate.getValue();
        if (value != null) {
            VoiceCallStateHolder voiceCallStateHolder = this.$stateHolder;
            VoiceCallViewModel voiceCallViewModel = this.$viewModel;
            VoiceCallStart voiceCallStartConsumeCallStart = voiceCallStateHolder.consumeCallStart(value.longValue());
            if (voiceCallStartConsumeCallStart != null) {
                voiceCallViewModel.startCall(voiceCallStartConsumeCallStart);
            }
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceCallSurfacesKt$VoiceCallLifecycleEffect$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
