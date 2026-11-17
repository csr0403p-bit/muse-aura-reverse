package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$SavedVoiceDialogs$2$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelLabel;
    public final /* synthetic */ boolean $deleteEnabled;
    public final /* synthetic */ String $deleteLabel;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
    public final /* synthetic */ SavedVoiceOption $savedVoice;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$SavedVoiceDialogs$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ VoiceControlsViewModel $previewViewModel;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceControlsViewModel voiceControlsViewModel, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption, Function0<Unit> function0) {
            super(0);
            this.$previewViewModel = voiceControlsViewModel;
            this.$settingsViewModel = voiceSettingsListViewModel;
            this.$savedVoice = savedVoiceOption;
            this.$onDismiss = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$previewViewModel.stopPreview();
            this.$settingsViewModel.deleteSavedVoice(this.$savedVoice);
            this.$onDismiss.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$deleteLabel;
        boolean z = this.$deleteEnabled;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$previewViewModel, this.$settingsViewModel, this.$savedVoice, this.$onDismiss);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, z, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelLabel, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onDismiss, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$SavedVoiceDialogs$2$1$1(String str, boolean z, String str2, Function0<Unit> function0, VoiceControlsViewModel voiceControlsViewModel, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption) {
        super(1);
        this.$deleteLabel = str;
        this.$deleteEnabled = z;
        this.$cancelLabel = str2;
        this.$onDismiss = function0;
        this.$previewViewModel = voiceControlsViewModel;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$savedVoice = savedVoiceOption;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
