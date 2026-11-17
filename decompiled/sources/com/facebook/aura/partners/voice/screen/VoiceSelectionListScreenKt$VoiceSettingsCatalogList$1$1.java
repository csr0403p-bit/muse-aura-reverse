package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSettingsCatalogList$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $localeTags;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceSettingsCatalogList$1$1(VoiceSettingsListViewModel voiceSettingsListViewModel, String str) {
        super(1);
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$localeTags = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$settingsViewModel.refreshCatalogForLocale(this.$localeTags);
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSettingsCatalogList$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
