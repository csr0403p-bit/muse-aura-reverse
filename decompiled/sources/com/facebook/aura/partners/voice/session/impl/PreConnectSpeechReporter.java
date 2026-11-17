package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass005;
import X.C3UX;
import X.C79;
import X.G0V;
import X.GAo;
import X.GCX;
import X.HtJ;
import X.HwK;
import X.HzR;
import com.facebook.aura.partners.voice.infra.UserSpeechState;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class PreConnectSpeechReporter {
    public final String callId;
    public final VoiceCallActivityRepository repository;
    public final HzR<UserSpeechState> states;
    public final String threadId;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter$1", f = "PreConnectSpeechReporter.kt", l = {24, 26}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PreConnectSpeechReporter.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PreConnectSpeechReporter.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:10:0x0023). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:7:0x0017). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L67
                if (r0 == r4) goto L33
                if (r0 != r5) goto L74
                int r8 = r9.I$0
                java.lang.Object r3 = r9.L$1
                java.lang.Object r7 = r9.L$0
                X.GCW r7 = (X.GCW) r7
                X.Hwg.A00(r10)
            L17:
                boolean r0 = X.AnonymousClass001.A1X(r10)
                if (r0 == 0) goto L23
                com.facebook.aura.partners.voice.infra.UserSpeechState r0 = com.facebook.aura.partners.voice.infra.UserSpeechState.ENDED
                boolean r8 = X.AnonymousClass002.A1Z(r3, r0)
            L23:
                r9.L$0 = r7
                r0 = 0
                r9.L$1 = r0
                r9.I$0 = r8
                r9.label = r4
                java.lang.Object r10 = r7.A01(r9)
                if (r10 != r6) goto L3c
                return r6
            L33:
                int r8 = r9.I$0
                java.lang.Object r7 = r9.L$0
                X.GCW r7 = (X.GCW) r7
                X.Hwg.A00(r10)
            L3c:
                boolean r0 = X.AnonymousClass001.A1X(r10)
                if (r0 == 0) goto L79
                java.lang.Object r3 = r7.A00()
                com.facebook.aura.partners.voice.infra.UserSpeechState r3 = (com.facebook.aura.partners.voice.infra.UserSpeechState) r3
                com.facebook.aura.partners.voice.infra.UserSpeechState r0 = com.facebook.aura.partners.voice.infra.UserSpeechState.ENDED
                boolean r0 = X.AnonymousClass002.A1Z(r3, r0)
                if (r0 == r8) goto L23
                com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter r0 = com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter.this
                com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository r2 = r0.repository
                java.lang.String r1 = r0.callId
                java.lang.String r0 = r0.threadId
                r9.L$0 = r7
                r9.L$1 = r3
                r9.I$0 = r8
                r9.label = r5
                java.lang.Object r10 = r2.reportUserSpeech(r1, r0, r3, r9)
                if (r10 != r6) goto L17
                return r6
            L67:
                X.Hwg.A00(r10)
                com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter r0 = com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter.this
                X.HzR<com.facebook.aura.partners.voice.infra.UserSpeechState> r0 = r0.states
                X.GCW r7 = r0.APO()
                r8 = 0
                goto L23
            L74:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L79:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.PreConnectSpeechReporter.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final synchronized void close(boolean z) {
        if (z) {
            this.states.AhZ(UserSpeechState.CANCELLED);
            this.states.A6R(null);
        } else {
            this.states.A6R(null);
        }
    }

    public final synchronized void onSpeechEnded(boolean z) {
        this.states.AhZ(z ? UserSpeechState.ENDED : UserSpeechState.RESUMED);
    }

    public PreConnectSpeechReporter(VoiceCallActivityRepository voiceCallActivityRepository, String str, String str2, C3UX c3ux) {
        AnonymousClass005.A0y(voiceCallActivityRepository, str, c3ux);
        this.repository = voiceCallActivityRepository;
        this.callId = str;
        this.threadId = str2;
        Integer num = C79.A00;
        this.states = new GCX(1, C79.A01);
        GAo.A02(num, HwK.A00, new AnonymousClass1(null), c3ux);
    }
}
