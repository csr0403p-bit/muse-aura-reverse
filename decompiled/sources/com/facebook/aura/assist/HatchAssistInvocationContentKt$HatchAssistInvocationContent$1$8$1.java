package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceCallStateHolder $callHolder;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$8$1(VoiceCallStateHolder voiceCallStateHolder, Context context, String str, HatchAssistOverlayViewModel hatchAssistOverlayViewModel) {
        super(0);
        this.$callHolder = voiceCallStateHolder;
        this.$context = context;
        this.$threadId = str;
        this.$overlayViewModel = hatchAssistOverlayViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r5 = this;
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r5.$callHolder
            boolean r0 = X.C3cH.A1P(r0)
            r4 = 0
            if (r0 != 0) goto L14
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r5.$callHolder
            X.1BN<java.lang.Long> r0 = r0.pendingCallStart
            java.lang.Object r1 = r0.getValue()
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            com.facebook.aura.assist.HatchVoiceInteractionSession$Companion r3 = com.facebook.aura.assist.HatchVoiceInteractionSession.Companion
            android.content.Context r2 = r5.$context
            if (r0 == 0) goto L25
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r5.$callHolder
            java.lang.String r1 = X.C3cG.A0c(r0)
        L21:
            r3.launchFullApp(r2, r1, r4)
            return
        L25:
            java.lang.String r1 = r5.$threadId
            com.facebook.aura.assist.HatchAssistOverlayViewModel r0 = r5.$overlayViewModel
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r0.conversationViewModel
            boolean r0 = r0.isUnsentNewThread()
            if (r0 == 0) goto L21
            r4 = 1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$8$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
