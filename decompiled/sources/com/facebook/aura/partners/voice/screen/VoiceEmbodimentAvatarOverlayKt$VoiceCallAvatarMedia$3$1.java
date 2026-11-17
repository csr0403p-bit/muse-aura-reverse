package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C06797bC;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06817bE;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;

/* loaded from: classes3.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$3$1 extends AbstractC7559F3s implements G0U<C06797bC, InterfaceC06817bE> {
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06817bE invoke(final C06797bC c06797bC) {
        C7384Etj.A0Y(c06797bC, 0);
        this.$viewModel.onStillHostStarted();
        final VoiceCallViewModel voiceCallViewModel = this.$viewModel;
        return new InterfaceC06817bE() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$3$1$invoke$$inlined$onStopOrDispose$1
            @Override // X.InterfaceC06817bE
            public void runStopOrDisposeEffect() {
                voiceCallViewModel.onStillHostStopped();
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$3$1(VoiceCallViewModel voiceCallViewModel) {
        super(1);
        this.$viewModel = voiceCallViewModel;
    }
}
