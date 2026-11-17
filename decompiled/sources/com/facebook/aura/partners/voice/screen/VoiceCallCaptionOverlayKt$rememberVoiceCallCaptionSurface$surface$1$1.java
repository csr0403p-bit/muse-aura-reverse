package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cG;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCaptionOverlayKt$rememberVoiceCallCaptionSurface$surface$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<String> $callThread;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$rememberVoiceCallCaptionSurface$surface$1$1(VoiceCallViewModel voiceCallViewModel, AuraNavigator auraNavigator, C1BO<String> c1bo) {
        super(0);
        this.$viewModel = voiceCallViewModel;
        this.$navigator = auraNavigator;
        this.$callThread = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$viewModel.isCaptionSurface(VoiceCallCaptionOverlayKt.toCaptionScreen(C3cG.A0H(this.$navigator)), C1BO.A08(this.$callThread)));
    }
}
