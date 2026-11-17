package com.facebook.aura.partners.voice.uicontrol;

import X.C06G;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ReconnectVoiceCallUiAction extends C06G implements ContributedUiAction {
    public final ReconnectVoiceCallRequest request;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction", f = "VoiceUiCommands.kt", l = {399}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction$perform$1, reason: invalid class name */
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
            return ReconnectVoiceCallUiAction.this.perform(null, this);
        }
    }

    public ReconnectVoiceCallUiAction(ReconnectVoiceCallRequest reconnectVoiceCallRequest) {
        C7384Etj.A0Y(reconnectVoiceCallRequest, 0);
        this.request = reconnectVoiceCallRequest;
    }

    public final ReconnectVoiceCallUiAction copy(ReconnectVoiceCallRequest reconnectVoiceCallRequest) {
        C7384Etj.A0Y(reconnectVoiceCallRequest, 0);
        return new ReconnectVoiceCallUiAction(reconnectVoiceCallRequest);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ReconnectVoiceCallUiAction) && C7384Etj.areEqual(this.request, ((ReconnectVoiceCallUiAction) obj).request));
    }

    public static /* synthetic */ ReconnectVoiceCallUiAction copy$default(ReconnectVoiceCallUiAction reconnectVoiceCallUiAction, ReconnectVoiceCallRequest reconnectVoiceCallRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            reconnectVoiceCallRequest = reconnectVoiceCallUiAction.request;
        }
        C7384Etj.A0Y(reconnectVoiceCallRequest, 0);
        return new ReconnectVoiceCallUiAction(reconnectVoiceCallRequest);
    }

    public final ReconnectVoiceCallRequest component1() {
        return this.request;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    public final ReconnectVoiceCallRequest getRequest() {
        return this.request;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    public int hashCode() {
        return this.request.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(X.AbstractC3358CGz r7, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction.AnonymousClass1
            if (r0 == 0) goto L42
            r5 = r8
            com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction$perform$1 r5 = (com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L48
            X.Hwg.A00(r2)
        L20:
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r2 = (com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result) r2
            java.lang.String r1 = "This device has no active voice call with that id to reconnect."
            java.lang.String r0 = "stale_call"
            com.facebook.aura.uicontrol.UiActionExecutor$Result r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiCommandsKt.toExecutionResult(r2, r1, r0)
            return r0
        L2b:
            X.Hwg.A00(r2)
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$Companion r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.Companion
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink r2 = r0.getInstance(r7)
            com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallRequest r1 = r6.request
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r2 = r2.publishReconnectVoiceCall(r1, r5)
            if (r2 != r4) goto L20
            return r4
        L42:
            com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction$perform$1 r5 = new com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction$perform$1
            r5.<init>(r8)
            goto L12
        L48:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.uicontrol.ReconnectVoiceCallUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    public String toString() {
        return super.toString();
    }
}
