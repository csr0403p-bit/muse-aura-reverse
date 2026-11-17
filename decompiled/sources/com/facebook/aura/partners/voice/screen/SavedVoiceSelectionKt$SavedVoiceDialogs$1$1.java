package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$SavedVoiceDialogs$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
    public final /* synthetic */ SavedVoiceOption $savedVoice;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$previewViewModel.stopPreview();
        this.$settingsViewModel.renameSavedVoice(this.$savedVoice, str);
        this.$onDismiss.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$SavedVoiceDialogs$1$1(VoiceControlsViewModel voiceControlsViewModel, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption, Function0<Unit> function0) {
        super(1);
        this.$previewViewModel = voiceControlsViewModel;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$savedVoice = savedVoiceOption;
        this.$onDismiss = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
