package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Hi;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ SavedVoiceOption $savedVoice;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$2$1(C0Hi c0Hi, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption) {
        super(0);
        this.$focusManager = c0Hi;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$savedVoice = savedVoiceOption;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusManager.A6G(false);
        this.$settingsViewModel.selectVoice(this.$savedVoice);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
