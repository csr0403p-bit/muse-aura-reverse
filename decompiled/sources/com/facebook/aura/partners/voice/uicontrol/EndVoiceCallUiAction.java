package com.facebook.aura.partners.voice.uicontrol;

import X.C06G;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class EndVoiceCallUiAction extends C06G implements ContributedUiAction {
    public final EndVoiceCallRequest request;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction", f = "VoiceUiCommands.kt", l = {StaggeredEntranceKt.StaggeredEntranceDurationMs}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction$perform$1, reason: invalid class name */
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
            return EndVoiceCallUiAction.this.perform(null, this);
        }
    }

    public EndVoiceCallUiAction(EndVoiceCallRequest endVoiceCallRequest) {
        C7384Etj.A0Y(endVoiceCallRequest, 0);
        this.request = endVoiceCallRequest;
    }

    public final EndVoiceCallUiAction copy(EndVoiceCallRequest endVoiceCallRequest) {
        C7384Etj.A0Y(endVoiceCallRequest, 0);
        return new EndVoiceCallUiAction(endVoiceCallRequest);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EndVoiceCallUiAction) && C7384Etj.areEqual(this.request, ((EndVoiceCallUiAction) obj).request));
    }

    public static /* synthetic */ EndVoiceCallUiAction copy$default(EndVoiceCallUiAction endVoiceCallUiAction, EndVoiceCallRequest endVoiceCallRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            endVoiceCallRequest = endVoiceCallUiAction.request;
        }
        C7384Etj.A0Y(endVoiceCallRequest, 0);
        return new EndVoiceCallUiAction(endVoiceCallRequest);
    }

    public final EndVoiceCallRequest component1() {
        return this.request;
    }

    public final EndVoiceCallRequest getRequest() {
        return this.request;
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
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction.AnonymousClass1
            if (r0 == 0) goto L42
            r5 = r8
            com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction$perform$1 r5 = (com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction.AnonymousClass1) r5
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
            java.lang.String r1 = "This device has no matching active voice call to end."
            java.lang.String r0 = "stale_call"
            com.facebook.aura.uicontrol.UiActionExecutor$Result r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiCommandsKt.toExecutionResult(r2, r1, r0)
            return r0
        L2b:
            X.Hwg.A00(r2)
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$Companion r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.Companion
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink r2 = r0.getInstance(r7)
            com.facebook.aura.partners.voice.uicontrol.EndVoiceCallRequest r1 = r6.request
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r2 = r2.publishEndVoiceCall(r1, r5)
            if (r2 != r4) goto L20
            return r4
        L42:
            com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction$perform$1 r5 = new com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction$perform$1
            r5.<init>(r8)
            goto L12
        L48:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.uicontrol.EndVoiceCallUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return Integer.valueOf(R.drawable.x_wght400_outline_24);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return new UiSuggestionLabel(R.string._name_removed__res_0x7f120bd0, R.string._name_removed__res_0x7f120bed);
    }

    public String toString() {
        return super.toString();
    }
}
