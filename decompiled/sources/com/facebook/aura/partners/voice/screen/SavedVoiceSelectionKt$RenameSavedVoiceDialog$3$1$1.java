package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$RenameSavedVoiceDialog$3$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelLabel;
    public final /* synthetic */ MutableState<C1805ArO> $name$delegate;
    public final /* synthetic */ G0U<String, Unit> $onConfirm;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ String $saveLabel;
    public final /* synthetic */ SavedVoiceOption $savedVoice;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* renamed from: com.facebook.aura.partners.voice.screen.SavedVoiceSelectionKt$RenameSavedVoiceDialog$3$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<C1805ArO> $name$delegate;
        public final /* synthetic */ G0U<String, Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super String, Unit> g0u, MutableState<C1805ArO> mutableState) {
            super(0);
            this.$onConfirm = g0u;
            this.$name$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onConfirm.invoke(MutableState.A04((MutableState) this.$name$delegate));
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
        String str = this.$saveLabel;
        boolean zCanRenameSavedVoice = this.$settingsViewModel.canRenameSavedVoice(this.$savedVoice, MutableState.A04((MutableState) this.$name$delegate));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onConfirm, this.$name$delegate);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(str, (Drawable) null, zCanRenameSavedVoice, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, (Function0<Unit>) anonymousClass1, (String) null, Integer.MAX_VALUE, (BRg) bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelLabel, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onDismiss, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SavedVoiceSelectionKt$RenameSavedVoiceDialog$3$1$1(String str, VoiceSettingsListViewModel voiceSettingsListViewModel, SavedVoiceOption savedVoiceOption, String str2, Function0<Unit> function0, MutableState<C1805ArO> mutableState, G0U<? super String, Unit> g0u) {
        super(1);
        this.$saveLabel = str;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$savedVoice = savedVoiceOption;
        this.$cancelLabel = str2;
        this.$onDismiss = function0;
        this.$name$delegate = mutableState;
        this.$onConfirm = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
