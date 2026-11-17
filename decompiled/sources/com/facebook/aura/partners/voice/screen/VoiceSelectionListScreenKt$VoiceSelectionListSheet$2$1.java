package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchOrigin $origin;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1(AuraNavigator auraNavigator, HatchOrigin hatchOrigin, VoiceSettingsListViewModel voiceSettingsListViewModel) {
        super(1);
        this.$navigator = auraNavigator;
        this.$origin = hatchOrigin;
        this.$settingsViewModel = voiceSettingsListViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AuraNavigator auraNavigator = this.$navigator;
        final HatchOrigin hatchOrigin = this.$origin;
        final VoiceSettingsListViewModel voiceSettingsListViewModel = this.$settingsViewModel;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (auraNavigator.isInBackStack(VoiceSelectionListScreenKt$VoiceSelectionListSheet$2$1$1$1.INSTANCE)) {
                    return;
                }
                if (hatchOrigin == HatchOrigin.CHAT) {
                    voiceSettingsListViewModel.logDiscardedPick();
                }
                voiceSettingsListViewModel.discardPendingSelection();
            }
        };
    }
}
