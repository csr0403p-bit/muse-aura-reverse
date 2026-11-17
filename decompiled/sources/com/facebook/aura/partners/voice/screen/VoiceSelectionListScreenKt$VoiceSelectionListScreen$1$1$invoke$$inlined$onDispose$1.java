package com.facebook.aura.partners.voice.screen;

import X.C78g;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListScreen$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel$inlined;

    public VoiceSelectionListScreenKt$VoiceSelectionListScreen$1$1$invoke$$inlined$onDispose$1(VoiceSettingsListViewModel voiceSettingsListViewModel) {
        this.$settingsViewModel$inlined = voiceSettingsListViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$settingsViewModel$inlined.commitPendingSelection(true);
    }
}
