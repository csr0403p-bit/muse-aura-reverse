package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceControlsViewModel.UiState.PreviewState $playback;
    public final /* synthetic */ String $previewFallback;
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
    public final /* synthetic */ SavedVoiceOption $savedVoice;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
    public final /* synthetic */ C1BO<VoiceSettingsListViewModel.UiState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$1$1(VoiceControlsViewModel.UiState.PreviewState previewState, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption, VoiceControlsViewModel voiceControlsViewModel, String str, C1BO<VoiceSettingsListViewModel.UiState> c1bo) {
        super(0);
        this.$playback = previewState;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$savedVoice = savedVoiceOption;
        this.$previewViewModel = voiceControlsViewModel;
        this.$previewFallback = str;
        this.$state$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$playback == null || this.$state$delegate.getValue().isLibraryMutating() || !this.$settingsViewModel.getCanManageSavedVoices()) {
            return;
        }
        this.$settingsViewModel.onPreviewVoice(this.$savedVoice, this.$playback);
        VoiceControlsViewModel voiceControlsViewModel = this.$previewViewModel;
        SavedVoiceOption savedVoiceOption = this.$savedVoice;
        voiceControlsViewModel.togglePreview(savedVoiceOption.voice, this.$previewFallback, savedVoiceOption.previewText, savedVoiceOption.getRowId(), true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
