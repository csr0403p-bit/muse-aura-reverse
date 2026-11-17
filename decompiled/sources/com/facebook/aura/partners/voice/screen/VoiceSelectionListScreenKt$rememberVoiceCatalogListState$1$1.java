package com.facebook.aura.partners.voice.screen;

import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$rememberVoiceCatalogListState$1$1", f = "VoiceSelectionListScreen.kt", l = {515}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$rememberVoiceCatalogListState$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $didInitialSavedScroll$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ VoiceSettingsListViewModel.UiState $settingsState;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$rememberVoiceCatalogListState$1$1(VoiceSettingsListViewModel.UiState uiState, VoiceSettingsListViewModel voiceSettingsListViewModel, LazyListState lazyListState, MutableState<Boolean> mutableState, HtJ<? super VoiceSelectionListScreenKt$rememberVoiceCatalogListState$1$1> htJ) {
        super(2, htJ);
        this.$settingsState = uiState;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$listState = lazyListState;
        this.$didInitialSavedScroll$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceSelectionListScreenKt$rememberVoiceCatalogListState$1$1(this.$settingsState, this.$settingsViewModel, this.$listState, this.$didInitialSavedScroll$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$settingsState.isLoaded && !MutableState.A0A((MutableState) this.$didInitialSavedScroll$delegate)) {
                MutableState.A09(true, this.$didInitialSavedScroll$delegate);
                if (this.$settingsState.catalogCriteria.isEmpty() && (this.$settingsViewModel.getCanManageSavedVoices() || (this.$settingsState.visibleCatalogCurrentVoice != null && this.$listState.A02() <= 1 && this.$listState.A03() == 0))) {
                    LazyListState lazyListState = this.$listState;
                    this.label = 1;
                    AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                    if (lazyListState.A06(0, 0, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceSelectionListScreenKt$rememberVoiceCatalogListState$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
