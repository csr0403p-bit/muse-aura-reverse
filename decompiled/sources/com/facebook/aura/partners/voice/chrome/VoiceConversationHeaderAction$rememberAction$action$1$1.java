package com.facebook.aura.partners.voice.chrome;

import X.AGH;
import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.api.ConversationHeaderContext;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceConversationHeaderAction$rememberAction$action$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<G0U<VoiceCallStart, Unit>> $currentCallStarter$delegate;
    public final /* synthetic */ C1BO<ConversationHeaderContext> $currentContext$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ C1BO<VoiceAvatarTakeoverState> $takeoverState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceConversationHeaderAction$rememberAction$action$1$1(VoiceCallStateHolder voiceCallStateHolder, C1BO<ConversationHeaderContext> c1bo, C1BO<? extends G0U<? super VoiceCallStart, Unit>> c1bo2, C1BO<VoiceAvatarTakeoverState> c1bo3) {
        super(0);
        this.$stateHolder = voiceCallStateHolder;
        this.$currentContext$delegate = c1bo;
        this.$currentCallStarter$delegate = c1bo2;
        this.$takeoverState$delegate = c1bo3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$currentContext$delegate.getValue().analyticsScreen, HatchComponent.VOICE_BUTTON, null, this.$currentContext$delegate.getValue().analyticsMetadata, null);
        C1BO.A0B(this.$currentCallStarter$delegate).invoke(new VoiceCallStart(VoiceCallEntryPoint.CALL_BUTTON, AGH.A0E()));
        Long value = this.$stateHolder.pendingCallStart.getValue();
        VoiceAvatarTakeoverState value2 = this.$takeoverState$delegate.getValue();
        if (value != null) {
            value2.focusStatus();
        } else {
            value2.focusStatusWhenCallStarts();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
