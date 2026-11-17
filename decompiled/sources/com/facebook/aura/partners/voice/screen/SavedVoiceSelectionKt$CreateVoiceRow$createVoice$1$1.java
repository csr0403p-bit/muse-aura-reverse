package com.facebook.aura.partners.voice.screen;

import X.AGH;
import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$CreateVoiceRow$createVoice$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$CreateVoiceRow$createVoice$1$1(VoiceControlsViewModel voiceControlsViewModel, VoiceSettingsListViewModel voiceSettingsListViewModel) {
        super(0);
        this.$previewViewModel = voiceControlsViewModel;
        this.$settingsViewModel = voiceSettingsListViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$previewViewModel.stopPreview();
        this.$settingsViewModel.commitPendingSelection(false);
        VoiceTelemetry voiceTelemetry = this.$settingsViewModel.telemetry;
        VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
        HatchComponent hatchComponent = HatchComponent.VOICE_CREATE_YOUR_OWN;
        int i = VoiceTelemetry.$stable;
        voiceTelemetry.interaction(interaction, hatchComponent, AGH.A0E(), null);
        this.$settingsViewModel.telemetry.endVisit("navigation");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
