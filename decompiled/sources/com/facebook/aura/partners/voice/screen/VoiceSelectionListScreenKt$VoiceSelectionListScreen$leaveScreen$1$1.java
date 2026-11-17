package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListScreen$leaveScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnBackClick$delegate;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceSelectionListScreenKt$VoiceSelectionListScreen$leaveScreen$1$1(VoiceSettingsListViewModel voiceSettingsListViewModel, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$currentOnBackClick$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$settingsViewModel.commitPendingSelection(true);
        this.$settingsViewModel.telemetry.endVisit("back");
        C1BO.A0D(this.$currentOnBackClick$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
