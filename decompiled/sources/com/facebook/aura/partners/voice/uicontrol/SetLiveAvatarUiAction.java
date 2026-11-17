package com.facebook.aura.partners.voice.uicontrol;

import X.C06G;
import X.HtJ;
import X.HzP;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class SetLiveAvatarUiAction extends C06G implements ContributedUiAction {
    public final boolean enabled;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction", f = "VoiceUiCommands.kt", l = {359}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction$perform$1, reason: invalid class name */
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
            return SetLiveAvatarUiAction.this.perform(null, this);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetLiveAvatarUiAction) && this.enabled == ((SetLiveAvatarUiAction) obj).enabled);
    }

    public static /* synthetic */ SetLiveAvatarUiAction copy$default(SetLiveAvatarUiAction setLiveAvatarUiAction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setLiveAvatarUiAction.enabled;
        }
        return new SetLiveAvatarUiAction(z);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final SetLiveAvatarUiAction copy(boolean z) {
        return new SetLiveAvatarUiAction(z);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    public int hashCode() {
        return this.enabled ? 1231 : 1237;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(X.AbstractC3358CGz r7, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction.AnonymousClass1
            if (r0 == 0) goto L50
            r5 = r8
            com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction$perform$1 r5 = (com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L56
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r1 = (com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result) r1
            java.lang.String r0 = "No active voice call is available to change the Live avatar."
            com.facebook.aura.uicontrol.UiActionExecutor$Result r4 = com.facebook.aura.partners.voice.uicontrol.VoiceUiCommandsKt.toExecutionResult(r1, r0, r2)
            return r4
        L2a:
            X.Hwg.A00(r1)
            com.facebook.aura.partners.voice.session.intf.VoiceCallSupport r0 = com.facebook.aura.partners.voice.session.intf.VoiceCallSupport.INSTANCE
            boolean r0 = r0.isEmbodimentSupported()
            if (r0 != 0) goto L3d
            java.lang.String r0 = "Live avatar is not available on this client."
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported r4 = new com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported
            r4.<init>(r0, r2)
            return r4
        L3d:
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$Companion r0 = com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.Companion
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink r1 = r0.getInstance(r7)
            boolean r0 = r6.enabled
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r1 = r1.publishSetLiveAvatar(r0, r5)
            if (r1 != r4) goto L21
            return r4
        L50:
            com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction$perform$1 r5 = new com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction$perform$1
            r5.<init>(r8)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.uicontrol.SetLiveAvatarUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    public SetLiveAvatarUiAction(boolean z) {
        this.enabled = z;
    }

    public String toString() {
        return super.toString();
    }
}
