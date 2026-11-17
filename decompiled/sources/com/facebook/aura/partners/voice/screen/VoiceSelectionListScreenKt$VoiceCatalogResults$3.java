package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceSelectionListScreenKt$VoiceCatalogResults$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRetryCatalog;
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
    public final /* synthetic */ VoiceCatalogRowState $rowState;
    public final /* synthetic */ VoiceSettingsListViewModel.UiState $settingsState;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceCatalogResults$3(VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceControlsViewModel voiceControlsViewModel, LazyListState lazyListState, VoiceSettingsListViewModel.UiState uiState, float f, Function0<Unit> function0, VoiceCatalogRowState voiceCatalogRowState, BRg bRg, int i, int i2) {
        super(2);
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$previewViewModel = voiceControlsViewModel;
        this.$listState = lazyListState;
        this.$settingsState = uiState;
        this.$bottomPadding = f;
        this.$onRetryCatalog = function0;
        this.$rowState = voiceCatalogRowState;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceSelectionListScreenKt.m1784VoiceCatalogResultsGHTll3U(this.$settingsViewModel, this.$previewViewModel, this.$listState, this.$settingsState, this.$bottomPadding, this.$onRetryCatalog, this.$rowState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
