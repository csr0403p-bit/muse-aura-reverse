package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSettingsCatalogList$rowState$1$2 extends AbstractC7559F3s implements G0U<VoiceOption, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceOption voiceOption) {
        C7384Etj.A0Y(voiceOption, 0);
        this.$focusManager.A6G(false);
        this.$settingsViewModel.selectVoice(voiceOption);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceSettingsCatalogList$rowState$1$2(C0Hi c0Hi, VoiceSettingsListViewModel voiceSettingsListViewModel) {
        super(1);
        this.$focusManager = c0Hi;
        this.$settingsViewModel = voiceSettingsListViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceOption voiceOption) {
        invoke2(voiceOption);
        return Unit.INSTANCE;
    }
}
