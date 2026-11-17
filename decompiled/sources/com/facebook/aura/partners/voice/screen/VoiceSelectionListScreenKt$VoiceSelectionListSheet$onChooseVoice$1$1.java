package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.VoiceSelectionListSheetKey;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.api.VoiceSelectionIdentity;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListSheet$onChooseVoice$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmed$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ VoiceOption $pickedVoice;
    public final /* synthetic */ String $replyToMessageId;
    public final /* synthetic */ C1BO<VoiceSettingsListViewModel.UiState> $settingsState$delegate;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
    public final /* synthetic */ String $sourceHostMessageId;
    public final /* synthetic */ String $sourceWidgetId;
    public final /* synthetic */ String $switchVoiceMessage;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ VoiceControlsViewModel $viewModel;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceSelectionListScreenKt$VoiceSelectionListSheet$onChooseVoice$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof VoiceSelectionListSheetKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceSelectionListSheet$onChooseVoice$1$1(VoiceOption voiceOption, String str, VoiceSettingsListViewModel voiceSettingsListViewModel, String str2, VoiceControlsViewModel voiceControlsViewModel, String str3, String str4, String str5, AuraNavigator auraNavigator, MutableState<Boolean> mutableState, C1BO<VoiceSettingsListViewModel.UiState> c1bo) {
        super(0);
        this.$pickedVoice = voiceOption;
        this.$threadId = str;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$sourceWidgetId = str2;
        this.$viewModel = voiceControlsViewModel;
        this.$switchVoiceMessage = str3;
        this.$sourceHostMessageId = str4;
        this.$replyToMessageId = str5;
        this.$navigator = auraNavigator;
        this.$confirmed$delegate = mutableState;
        this.$settingsState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        VoiceSelectionIdentity voiceSelectionIdentity;
        if (MutableState.A0A((MutableState) this.$confirmed$delegate) || this.$pickedVoice == null || (str = this.$threadId) == null || str.length() == 0) {
            return;
        }
        MutableState.A09(true, this.$confirmed$delegate);
        this.$settingsViewModel.onSwitchVoice(this.$pickedVoice.id);
        String str2 = this.$threadId;
        VoiceOption voiceOption = this.$pickedVoice;
        String str3 = voiceOption.id;
        String str4 = voiceOption.name;
        if (this.$sourceWidgetId != null) {
            voiceSelectionIdentity = C8j3.A0q(this.$settingsState$delegate).pendingSelectedVoice;
            if (voiceSelectionIdentity == null) {
                voiceSelectionIdentity = new VoiceSelectionIdentity(this.$pickedVoice.id, null, null);
            }
        } else {
            voiceSelectionIdentity = null;
        }
        this.$viewModel.onChatVoiceChosen(str2, str3, str4, voiceSelectionIdentity, this.$switchVoiceMessage, this.$sourceHostMessageId, this.$sourceWidgetId, this.$replyToMessageId);
        this.$settingsViewModel.telemetry.endVisit("choose");
        this.$navigator.popAll(AnonymousClass1.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
