package com.facebook.aura.partners.voice.screen;

import X.AHD;
import X.AbstractC7559F3s;
import X.C0CD;
import X.G0U;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceSelectionListScreenKt$VoiceCatalogResults$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AHD<VoiceOption> $displayedVoices;
    public final /* synthetic */ boolean $hasCatalogVoiceSection;
    public final /* synthetic */ boolean $hasSavedVoiceSection;
    public final /* synthetic */ Function0<Unit> $onRetryCatalog;
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
    public final /* synthetic */ VoiceCatalogRowState $rowState;
    public final /* synthetic */ AHD<SavedVoiceOption> $savedVoices;
    public final /* synthetic */ VoiceSettingsListViewModel.UiState $settingsState;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
    public final /* synthetic */ boolean $showCreateVoice;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(X.C0CD r5) {
        /*
            r4 = this;
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            X.AHD<com.facebook.aura.partners.voice.api.SavedVoiceOption> r3 = r4.$savedVoices
            com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r2 = r4.$settingsViewModel
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r1 = r4.$previewViewModel
            boolean r0 = r4.$showCreateVoice
            com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt.savedVoiceSection(r5, r3, r2, r1, r0)
            boolean r0 = r4.$hasCatalogVoiceSection
            if (r0 == 0) goto L33
            boolean r0 = r4.$hasSavedVoiceSection
            if (r0 == 0) goto L20
            X.G0W<X.037, X.BFM, java.lang.Integer, kotlin.Unit> r2 = com.facebook.aura.partners.voice.screen.ComposableSingletons$VoiceSelectionListScreenKt.lambda$873357942
            java.lang.String r1 = "app_voices_header"
            java.lang.String r0 = "voice_section_header"
            r5.APJ(r1, r0, r2)
        L20:
            X.AHD<com.facebook.aura.partners.voice.api.VoiceOption> r3 = r4.$displayedVoices
            com.facebook.aura.partners.voice.screen.VoiceCatalogRowState r2 = r4.$rowState
            com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState r1 = r4.$settingsState
            boolean r0 = r1.isCatalogReloadPending
            if (r0 != 0) goto L2f
            boolean r1 = r1.isCatalogLoading
            r0 = 1
            if (r1 == 0) goto L30
        L2f:
            r0 = 0
        L30:
            com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.appVoiceSection(r5, r3, r2, r0)
        L33:
            com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r3 = r4.$settingsViewModel
            com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState r2 = r4.$settingsState
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r4.$onRetryCatalog
            boolean r0 = r4.$hasSavedVoiceSection
            com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt.catalogStatusRows(r5, r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceCatalogResults$2$1$1.invoke2(X.0CD):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceCatalogResults$2$1$1(AHD<SavedVoiceOption> ahd, VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, boolean z, boolean z2, boolean z3, AHD<VoiceOption> ahd2, VoiceCatalogRowState voiceCatalogRowState, VoiceSettingsListViewModel.UiState uiState, Function0<Unit> function0) {
        super(1);
        this.$savedVoices = ahd;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$previewViewModel = voiceControlsViewModel;
        this.$showCreateVoice = z;
        this.$hasCatalogVoiceSection = z2;
        this.$hasSavedVoiceSection = z3;
        this.$displayedVoices = ahd2;
        this.$rowState = voiceCatalogRowState;
        this.$settingsState = uiState;
        this.$onRetryCatalog = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
