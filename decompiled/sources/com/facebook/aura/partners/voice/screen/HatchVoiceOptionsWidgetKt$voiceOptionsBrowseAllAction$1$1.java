package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0881AGi;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.navigation.key.VoiceSelectionListSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$voiceOptionsBrowseAllAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $conversationSessionId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ VoiceOptionsWidgetState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$voiceOptionsBrowseAllAction$1$1(AuraNavigator auraNavigator, VoiceOptionsWidgetState voiceOptionsWidgetState, HatchScreen hatchScreen, String str) {
        super(0);
        this.$navigator = auraNavigator;
        this.$state = voiceOptionsWidgetState;
        this.$screen = hatchScreen;
        this.$conversationSessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$navigator.currentKey(true) instanceof VoiceSelectionListSheetKey) {
            return;
        }
        VoiceOptionsWidgetState voiceOptionsWidgetState = this.$state;
        String str = voiceOptionsWidgetState.widget.widgetId;
        if (voiceOptionsWidgetState.viewModel.prepareWidgetVoiceSelection(voiceOptionsWidgetState.widgetStateMutationHost, voiceOptionsWidgetState.hostMessageId, str, this.$screen)) {
            AuraNavigator auraNavigator = this.$navigator;
            VoiceSelectionListSheetKey.Companion companion = VoiceSelectionListSheetKey.Companion;
            VoiceEntryPoint voiceEntryPoint = VoiceEntryPoint.VOICE_WIDGET;
            HatchOrigin hatchOrigin = HatchOrigin.CHAT;
            String str2 = this.$state.hostMessageId;
            auraNavigator.navigate((AuraNavKey) companion.invoke(C0881AGi.A00, hatchOrigin, this.$conversationSessionId, null, str, str2, voiceEntryPoint, AnonymousClass002.A0k()), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
