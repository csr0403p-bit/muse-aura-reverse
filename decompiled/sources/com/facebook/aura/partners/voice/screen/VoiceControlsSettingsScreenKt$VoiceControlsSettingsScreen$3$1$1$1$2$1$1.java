package com.facebook.aura.partners.voice.screen;

import X.AGH;
import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1$2$1$1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel) {
        super(0);
        this.$viewModel = voiceControlsSettingsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceTelemetry voiceTelemetry = this.$viewModel.telemetry;
        VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
        HatchComponent hatchComponent = HatchComponent.VOICE_CREATE_YOUR_OWN;
        int i = VoiceTelemetry.$stable;
        voiceTelemetry.interaction(interaction, hatchComponent, AGH.A0E(), null);
        this.$viewModel.telemetry.endVisit("navigation");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
