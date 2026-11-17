package com.facebook.aura.partners.voice.uicontrol;

import X.HtJ;
import X.HzP;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class MuteVoiceUiAction implements ContributedUiAction {
    public static final MuteVoiceUiAction INSTANCE = new MuteVoiceUiAction();

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction", f = "VoiceUiCommands.kt", l = {339}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction$perform$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MuteVoiceUiAction.this.perform(null, this);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof MuteVoiceUiAction);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(X.AbstractC3358CGz r7, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction$perform$1 r5 = (com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L45
            X.Hwg.A00(r4)
        L20:
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r4 = (com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result) r4
            java.lang.String r1 = "No active voice call is available to mute the microphone."
            r0 = 0
            com.facebook.aura.uicontrol.UiActionExecutor$Result r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiCommandsKt.toExecutionResult(r4, r1, r0)
            return r0
        L2a:
            X.Hwg.A00(r4)
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$Companion r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.Companion
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink r1 = r0.getInstance(r7)
            r0 = 0
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r4 = r1.publishMuteVoice(r5)
            if (r4 != r3) goto L20
            return r3
        L3f:
            com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction$perform$1 r5 = new com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction$perform$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.uicontrol.MuteVoiceUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    public String toString() {
        return "MuteVoiceUiAction";
    }

    public int hashCode() {
        return 1270023151;
    }
}
