package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.json.ClockCardWireActionsKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListSheet$onDismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchOrigin $origin;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceSelectionListSheet$onDismiss$1$1(HatchOrigin hatchOrigin, VoiceSettingsListViewModel voiceSettingsListViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$origin = hatchOrigin;
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$origin == HatchOrigin.CHAT) {
            this.$settingsViewModel.logDiscardedPick();
        }
        this.$settingsViewModel.telemetry.endVisit(ClockCardWireActionsKt.CLOCK_ACTION_DISMISS);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
