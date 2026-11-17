package com.facebook.aura.partners.voice.impl;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C7384Etj;
import X.F0C;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.livesession.api.LiveConversation;
import com.facebook.aura.livesession.api.LiveSession;
import com.facebook.aura.livesession.api.LiveSessionAttachmentLimit;
import com.facebook.aura.livesession.api.LiveTranscript;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.ActiveAppAudioCall;
import com.facebook.aura.partners.voice.intf.VoiceAgentActivityCancelToken;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolderKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStatusLine;
import com.facebook.aura.partners.voice.intf.VoiceLiveAvatarUpdateStatus;
import com.facebook.aura.partners.voice.intf.VoiceLiveAvatarUpdateStatusKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceLiveSession implements LiveSession {
    public final F0C stateHolder$delegate;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveSession", f = "HatchVoiceLiveSessionProvider.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "endForAudioPlayback", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveSession$endForAudioPlayback$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceLiveSession.this.endForAudioPlayback(this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveSession$prepareStopGeneration$1, reason: invalid class name and case insensitive filesystem */
    public final class C130991 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ VoiceAgentActivityCancelToken $cancelToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130991(VoiceAgentActivityCancelToken voiceAgentActivityCancelToken) {
            super(0);
            this.$cancelToken = voiceAgentActivityCancelToken;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoiceLiveSession.this.getStateHolder().clearBusyAgentActivity(this.$cancelToken);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveSession$statusOverride$1", f = "HatchVoiceLiveSessionProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceLiveSession$statusOverride$1, reason: invalid class name and case insensitive filesystem */
    public final class C131001 extends AbstractC07127nr implements G2j<Boolean, VoiceLiveAvatarUpdateStatus, Boolean, HtJ<? super Integer>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        public C131001(HtJ<? super C131001> htJ) {
            super(4, htJ);
        }

        public final Object invoke(boolean z, VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, boolean z2, HtJ<? super Integer> htJ) {
            C131001 c131001 = new C131001(htJ);
            c131001.Z$0 = z;
            c131001.L$0 = voiceLiveAvatarUpdateStatus;
            c131001.Z$1 = z2;
            return c131001.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus = (VoiceLiveAvatarUpdateStatus) this.L$0;
            boolean z2 = this.Z$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            VoiceCallStatusLine voiceCallStatusLine = VoiceLiveAvatarUpdateStatusKt.voiceCallStatusLine(z, voiceLiveAvatarUpdateStatus, z2);
            if (voiceCallStatusLine != null) {
                return C3cG.A0R(HatchVoiceLiveSessionProviderKt.getStringRes(voiceCallStatusLine));
            }
            return null;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, Boolean bool2, HtJ<? super Integer> htJ) {
            return invoke(AnonymousClass001.A1X(bool), voiceLiveAvatarUpdateStatus, AnonymousClass001.A1X(bool2), htJ);
        }
    }

    public VoiceLiveSession(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.stateHolder$delegate = AbstractC5321DgF.A03(new VoiceLiveSession$stateHolder$2(this));
    }

    @Override // com.facebook.aura.livesession.api.LiveSession
    public Map<String, Object> routeOutgoing(Map<String, ? extends Object> map, String str) {
        C7384Etj.A0Y(map, 0);
        return VoiceCallStateHolderKt.withActiveVoiceCallRouting(map, getStateHolder().activeAppAudioCall.getValue(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceCallStateHolder getStateHolder() {
        return (VoiceCallStateHolder) this.stateHolder$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    @Override // com.facebook.aura.livesession.api.LiveSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object endForAudioPlayback(X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.impl.VoiceLiveSession.AnonymousClass1
            if (r0 == 0) goto L5f
            r7 = r9
            com.facebook.aura.partners.voice.impl.VoiceLiveSession$endForAudioPlayback$1 r7 = (com.facebook.aura.partners.voice.impl.VoiceLiveSession.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r2 = 10000(0x2710, double:4.9407E-320)
            r5 = 1
            if (r0 == 0) goto L44
            if (r0 != r5) goto L65
            X.Hwg.A00(r1)
        L22:
            r4 = 1
            if (r1 != 0) goto L3f
            r4 = 0
            java.lang.Long r1 = X.C3cG.A0S(r2)
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r8.getStateHolder()
            X.1BN<java.lang.Boolean> r0 = r0.isCallActive
            java.lang.Object r0 = r0.getValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "HatchVoiceLiveSession"
            java.lang.String r0 = "Audio takeover timed out after %d ms: callActive=%s"
            X.CFK.A0H(r1, r0, r2)
        L3f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L44:
            X.Hwg.A00(r1)
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r4 = r8.getStateHolder()
            r1 = 0
            java.lang.String r0 = "audio_takeover"
            r4.requestEndCall(r1, r1, r0)
            com.facebook.aura.partners.voice.impl.VoiceLiveSession$endForAudioPlayback$ended$1 r0 = new com.facebook.aura.partners.voice.impl.VoiceLiveSession$endForAudioPlayback$ended$1
            r0.<init>(r8, r1)
            r7.label = r5
            java.lang.Object r1 = X.GAX.A01(r7, r0, r2)
            if (r1 != r6) goto L22
            return r6
        L5f:
            com.facebook.aura.partners.voice.impl.VoiceLiveSession$endForAudioPlayback$1 r7 = new com.facebook.aura.partners.voice.impl.VoiceLiveSession$endForAudioPlayback$1
            r7.<init>(r9)
            goto L12
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.impl.VoiceLiveSession.endForAudioPlayback(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.livesession.api.LiveSession
    public LiveTranscript attachTranscript(LiveConversation liveConversation, C3UX c3ux) {
        AnonymousClass003.A0u(liveConversation, c3ux);
        return new VoiceLiveTranscript(this.userSession, liveConversation, c3ux);
    }

    @Override // com.facebook.aura.livesession.api.LiveSession
    public LiveSessionAttachmentLimit attachmentLimit(String str) {
        ActiveAppAudioCall value = getStateHolder().activeAppAudioCall.getValue();
        if (value == null || !C7384Etj.areEqual(value.threadId, str)) {
            return null;
        }
        return new LiveSessionAttachmentLimit(VoiceGating.INSTANCE.getMaxAttachmentsDuringCall(), R.string._name_removed__res_0x7f120641, R.string._name_removed__res_0x7f120642, R.string._name_removed__res_0x7f120649, VoiceLiveSession$attachmentLimit$2$1.INSTANCE);
    }

    @Override // com.facebook.aura.livesession.api.LiveSession
    public C1BN<Boolean> isActive() {
        return getStateHolder().isCallActive;
    }

    @Override // com.facebook.aura.livesession.api.LiveSession
    public boolean isActiveIn(String str) {
        ActiveAppAudioCall value = getStateHolder().activeAppAudioCall.getValue();
        return value != null && C7384Etj.areEqual(value.threadId, str);
    }

    @Override // com.facebook.aura.livesession.api.LiveSession
    public Function0<Unit> prepareStopGeneration(String str) {
        return new C130991(getStateHolder().agentActivityCancelToken(str));
    }

    @Override // com.facebook.aura.livesession.api.LiveSession
    public C20Q<Integer> statusOverride(String str) {
        return C3rb.A00(new C131001(null), getStateHolder().isReconnectingStatusShown(str), getStateHolder().liveAvatarUpdateStatusShown(str), getStateHolder().isVoiceSwitchShown);
    }
}
