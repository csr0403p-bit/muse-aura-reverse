package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1$1$3$1 extends AbstractC7559F3s implements G0U<VoiceOptionData, Unit> {
    public final /* synthetic */ String $previewFallback;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ boolean $switchVoice;
    public final /* synthetic */ VoiceControlsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceOptionData voiceOptionData) {
        C7384Etj.A0Y(voiceOptionData, 0);
        this.$viewModel.onWidgetVoicePreview(voiceOptionData, this.$switchVoice, this.$previewFallback, this.$screen);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$VoiceOptionCardsLayout$1$1$3$1(VoiceControlsViewModel voiceControlsViewModel, boolean z, String str, HatchScreen hatchScreen) {
        super(1);
        this.$viewModel = voiceControlsViewModel;
        this.$switchVoice = z;
        this.$previewFallback = str;
        this.$screen = hatchScreen;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceOptionData voiceOptionData) {
        invoke2(voiceOptionData);
        return Unit.INSTANCE;
    }
}
