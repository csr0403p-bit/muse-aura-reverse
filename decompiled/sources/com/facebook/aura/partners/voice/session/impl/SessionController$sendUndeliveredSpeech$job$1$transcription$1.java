package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.C10543Hqv;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.composer.dictation.pcm.PcmTranscription;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$sendUndeliveredSpeech$job$1$transcription$1", f = "SessionController.kt", l = {1774, 1782}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$sendUndeliveredSpeech$job$1$transcription$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PcmTranscription>, Object> {
    public final /* synthetic */ C10543Hqv<String> $clientSessionId;
    public final /* synthetic */ PreConnectLiveCaption $live;
    public final /* synthetic */ C10543Hqv<UndeliveredSpeechSource> $source;
    public final /* synthetic */ SessionController.CapturedUndeliveredSpeech $speech;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$sendUndeliveredSpeech$job$1$transcription$1(PreConnectLiveCaption preConnectLiveCaption, C10543Hqv<UndeliveredSpeechSource> c10543Hqv, C10543Hqv<String> c10543Hqv2, SessionController sessionController, SessionController.CapturedUndeliveredSpeech capturedUndeliveredSpeech, HtJ<? super SessionController$sendUndeliveredSpeech$job$1$transcription$1> htJ) {
        super(2, htJ);
        this.$live = preConnectLiveCaption;
        this.$source = c10543Hqv;
        this.$clientSessionId = c10543Hqv2;
        this.this$0 = sessionController;
        this.$speech = capturedUndeliveredSpeech;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$sendUndeliveredSpeech$job$1$transcription$1(this.$live, this.$source, this.$clientSessionId, this.this$0, this.$speech, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.lang.String] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L38
            if (r0 != r2) goto L7b
            X.Hwg.A00(r10)
        Lf:
            X.Hqv<java.lang.String> r2 = r9.$clientSessionId
            X.Hqv<com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource> r1 = r9.$source
            com.facebook.aura.composer.dictation.pcm.PcmTranscription$Unavailable r0 = com.facebook.aura.composer.dictation.pcm.PcmTranscription.Unavailable.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r10, r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = ""
            r2.element = r0
        L1f:
            boolean r0 = r10 instanceof com.facebook.aura.composer.dictation.pcm.PcmTranscription.Text
            if (r0 == 0) goto L27
            com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource r0 = com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource.RECORDED
            r1.element = r0
        L27:
            return r10
        L28:
            X.Hwg.A00(r10)
            com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption r0 = r9.$live
            if (r0 == 0) goto L51
            r9.label = r1
            java.lang.Object r10 = r0.finish(r9)
            if (r10 != r3) goto L3b
            return r3
        L38:
            X.Hwg.A00(r10)
        L3b:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L51
            int r0 = r10.length()
            if (r0 == 0) goto L51
            X.Hqv<com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource> r1 = r9.$source
            com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource r0 = com.facebook.aura.partners.voice.session.impl.UndeliveredSpeechSource.LIVE
            r1.element = r0
            com.facebook.aura.composer.dictation.pcm.PcmTranscription$Text r3 = new com.facebook.aura.composer.dictation.pcm.PcmTranscription$Text
            r3.<init>(r10)
            return r3
        L51:
            java.util.UUID r1 = X.AbstractC7535F0i.A00()
            java.lang.String r0 = "voice-preconnect-"
            java.lang.String r8 = X.AnonymousClass007.A0a(r0, r1)
            X.Hqv<java.lang.String> r0 = r9.$clientSessionId
            r0.element = r8
            com.facebook.aura.composer.dictation.pcm.PcmDictation r4 = com.facebook.aura.composer.dictation.pcm.PcmDictation.INSTANCE
            com.facebook.aura.partners.voice.session.impl.SessionController r0 = r9.this$0
            X.CGz r5 = r0.userSession
            android.content.Context r6 = r0.context
            com.facebook.aura.partners.voice.session.impl.SessionController$CapturedUndeliveredSpeech r0 = r9.$speech
            com.facebook.aura.partners.voice.session.impl.CapturedSpeech r0 = r0.captured
            short[] r7 = r0.pcm
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.label = r2
            java.lang.Object r10 = r4.transcribe(r5, r6, r7, r8, r9)
            if (r10 != r3) goto Lf
            return r3
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController$sendUndeliveredSpeech$job$1$transcription$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PcmTranscription> htJ) {
        return ((SessionController$sendUndeliveredSpeech$job$1$transcription$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
