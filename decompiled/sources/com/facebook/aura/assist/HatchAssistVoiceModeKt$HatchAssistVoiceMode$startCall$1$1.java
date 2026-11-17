package com.facebook.aura.assist;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Hi;
import X.C1C3;
import X.C3cH;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAssistVoiceModeKt$HatchAssistVoiceMode$startCall$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focus;
    public final /* synthetic */ VoiceCallStateHolder $holder;
    public final /* synthetic */ C1C3 $keyboard;
    public final /* synthetic */ AssistVoiceNavigator $navigator;
    public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
    public final /* synthetic */ AssistVoicePresentation $presentation;
    public final /* synthetic */ AbstractC3358CGz $session;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistVoiceModeKt$HatchAssistVoiceMode$startCall$1$1(AbstractC3358CGz abstractC3358CGz, VoiceCallStateHolder voiceCallStateHolder, AssistVoicePresentation assistVoicePresentation, HatchAssistOverlayViewModel hatchAssistOverlayViewModel, C0Hi c0Hi, C1C3 c1c3, AssistVoiceNavigator assistVoiceNavigator, String str) {
        super(0);
        this.$session = abstractC3358CGz;
        this.$holder = voiceCallStateHolder;
        this.$presentation = assistVoicePresentation;
        this.$overlayViewModel = hatchAssistOverlayViewModel;
        this.$focus = c0Hi;
        this.$keyboard = c1c3;
        this.$navigator = assistVoiceNavigator;
        this.$threadId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Voice voice = Voice.INSTANCE;
        if (voice.isCallSupported(this.$session) && !C3cH.A1P(this.$holder) && this.$holder.pendingCallStart.getValue() == null) {
            this.$presentation.captureComposer();
            this.$overlayViewModel.prepareForVoiceCall();
            this.$focus.A6G(false);
            C1C3 c1c3 = this.$keyboard;
            if (c1c3 != null) {
                c1c3.hide();
            }
            VoiceIntegration integration = voice.getIntegration();
            if (integration != null) {
                integration.startCall(this.$navigator, this.$session, this.$threadId);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
