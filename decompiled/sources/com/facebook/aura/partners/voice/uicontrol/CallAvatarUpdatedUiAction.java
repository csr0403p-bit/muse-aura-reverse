package com.facebook.aura.partners.voice.uicontrol;

import X.C06G;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class CallAvatarUpdatedUiAction extends C06G implements ContributedUiAction {
    public final CallAvatarUpdate update;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction", f = "VoiceUiCommands.kt", l = {507}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction$perform$1, reason: invalid class name */
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
            return CallAvatarUpdatedUiAction.this.perform(null, this);
        }
    }

    public CallAvatarUpdatedUiAction(CallAvatarUpdate callAvatarUpdate) {
        C7384Etj.A0Y(callAvatarUpdate, 0);
        this.update = callAvatarUpdate;
    }

    public final CallAvatarUpdatedUiAction copy(CallAvatarUpdate callAvatarUpdate) {
        C7384Etj.A0Y(callAvatarUpdate, 0);
        return new CallAvatarUpdatedUiAction(callAvatarUpdate);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CallAvatarUpdatedUiAction) && C7384Etj.areEqual(this.update, ((CallAvatarUpdatedUiAction) obj).update));
    }

    public static /* synthetic */ CallAvatarUpdatedUiAction copy$default(CallAvatarUpdatedUiAction callAvatarUpdatedUiAction, CallAvatarUpdate callAvatarUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            callAvatarUpdate = callAvatarUpdatedUiAction.update;
        }
        C7384Etj.A0Y(callAvatarUpdate, 0);
        return new CallAvatarUpdatedUiAction(callAvatarUpdate);
    }

    public final CallAvatarUpdate component1() {
        return this.update;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    public final CallAvatarUpdate getUpdate() {
        return this.update;
    }

    public int hashCode() {
        return this.update.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(X.AbstractC3358CGz r7, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction.AnonymousClass1
            if (r0 == 0) goto L54
            r5 = r8
            com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction$perform$1 r5 = (com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L5a
            X.Hwg.A00(r2)
        L20:
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r2 = (com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result) r2
            java.lang.String r1 = "This device has no active voice call with that id to update."
            java.lang.String r0 = "stale_call"
            com.facebook.aura.uicontrol.UiActionExecutor$Result r4 = com.facebook.aura.partners.voice.uicontrol.VoiceUiCommandsKt.toExecutionResult(r2, r1, r0)
            return r4
        L2b:
            X.Hwg.A00(r2)
            com.facebook.aura.partners.voice.session.intf.VoiceCallSupport r0 = com.facebook.aura.partners.voice.session.intf.VoiceCallSupport.INSTANCE
            boolean r0 = r0.isLiveAvatarUpdateSupported()
            if (r0 != 0) goto L40
            java.lang.String r1 = "Live avatar updates are not available on this client."
            java.lang.String r0 = "unsupported_target"
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported r4 = new com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported
            r4.<init>(r1, r0)
            return r4
        L40:
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$Companion r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.Companion
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink r2 = r0.getInstance(r7)
            com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate r1 = r6.update
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r2 = r2.publishCallAvatarUpdate(r1, r5)
            if (r2 != r4) goto L20
            return r4
        L54:
            com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction$perform$1 r5 = new com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction$perform$1
            r5.<init>(r8)
            goto L12
        L5a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdatedUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    public String toString() {
        return super.toString();
    }
}
