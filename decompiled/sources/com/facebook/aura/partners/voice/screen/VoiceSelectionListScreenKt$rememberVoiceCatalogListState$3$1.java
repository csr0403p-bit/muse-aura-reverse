package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1160Acs;
import X.C1161Act;
import X.C16C;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1", f = "VoiceSelectionListScreen.kt", l = {540}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ VoiceSettingsListViewModel.UiState $settingsState;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C16C c16c = (C16C) AbstractC0878AGe.A0I(AnonymousClass003.A0j(this.$listState));
            return Integer.valueOf(c16c != null ? ((C1160Acs) c16c).A07 : -1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1(LazyListState lazyListState, VoiceSettingsListViewModel.UiState uiState, VoiceSettingsListViewModel voiceSettingsListViewModel, HtJ<? super VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$settingsState = uiState;
        this.$settingsViewModel = voiceSettingsListViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1(this.$listState, this.$settingsState, this.$settingsViewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(C6v3.A01(new AnonymousClass1(this.$listState)));
            final LazyListState lazyListState = this.$listState;
            final VoiceSettingsListViewModel.UiState uiState = this.$settingsState;
            final VoiceSettingsListViewModel voiceSettingsListViewModel = this.$settingsViewModel;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1.2
                public final Object emit(int i2, HtJ<? super Unit> htJ) {
                    int i3 = ((C1161Act) lazyListState.A04()).A05 - 4;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    VoiceSettingsListViewModel.UiState uiState2 = uiState;
                    if (uiState2.canLoadMoreCatalog && !uiState2.isCatalogLoadingMore && uiState2.catalogFailure == null && i2 >= i3) {
                        voiceSettingsListViewModel.loadMoreCatalog();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A0F(obj2), (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
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
        return ((VoiceSelectionListScreenKt$rememberVoiceCatalogListState$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
