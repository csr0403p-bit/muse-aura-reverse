package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cH;
import X.C3cJ;
import X.C57m;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$job$1", f = "SessionController.kt", l = {1387, 1425, 1508}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startCallInternal$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $callAttemptGeneration;
    public final /* synthetic */ String $callId;
    public final /* synthetic */ String $callThreadId;
    public final /* synthetic */ int $connectGeneration;
    public final /* synthetic */ VoiceCallEntryPoint $entryPoint;
    public final /* synthetic */ int $markerKey;
    public final /* synthetic */ boolean $playStartSound;
    public final /* synthetic */ SessionController.CallMarkerState $resumedCall;
    public final /* synthetic */ Long $uiTriggeredTimeMs;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public final /* synthetic */ SessionController this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$job$1$2", f = "SessionController.kt", l = {1496}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$job$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callAttemptGeneration;
        public final /* synthetic */ C57m $session;
        public int label;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SessionController sessionController, C57m c57m, long j, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.this$0 = sessionController;
            this.$session = c57m;
            this.$callAttemptGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.this$0, this.$session, this.$callAttemptGeneration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        SessionController sessionController = this.this$0;
                        C57m c57m = this.$session;
                        long j = this.$callAttemptGeneration;
                        this.label = 1;
                        if (sessionController.collectCaptions(c57m, j, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A0A(SessionControllerKt.TAG, "ASR voice-state collection failed", e2);
                }
                this.this$0.voiceCallStateHolder.setBotSpeakingIfCurrent(this.$callAttemptGeneration, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.voiceCallStateHolder.setBotSpeakingIfCurrent(this.$callAttemptGeneration, false);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startCallInternal$job$1(SessionController sessionController, int i, String str, String str2, int i2, boolean z, Long l, SessionController.CallMarkerState callMarkerState, VoiceCallEntryPoint voiceCallEntryPoint, long j, HtJ<? super SessionController$startCallInternal$job$1> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
        this.$markerKey = i;
        this.$callThreadId = str;
        this.$callId = str2;
        this.$connectGeneration = i2;
        this.$playStartSound = z;
        this.$uiTriggeredTimeMs = l;
        this.$resumedCall = callMarkerState;
        this.$entryPoint = voiceCallEntryPoint;
        this.$callAttemptGeneration = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SessionController$startCallInternal$job$1 sessionController$startCallInternal$job$1 = new SessionController$startCallInternal$job$1(this.this$0, this.$markerKey, this.$callThreadId, this.$callId, this.$connectGeneration, this.$playStartSound, this.$uiTriggeredTimeMs, this.$resumedCall, this.$entryPoint, this.$callAttemptGeneration, htJ);
        sessionController$startCallInternal$job$1.L$0 = obj;
        return sessionController$startCallInternal$job$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0292 A[Catch: Exception -> 0x02d1, all -> 0x02ef, TryCatch #4 {Exception -> 0x02d1, blocks: (B:7:0x001b, B:48:0x012e, B:49:0x0131, B:51:0x0137, B:53:0x013c, B:55:0x0140, B:65:0x017f, B:68:0x0186, B:70:0x018c, B:72:0x0190, B:73:0x0193, B:75:0x0197, B:78:0x01a9, B:80:0x01bd, B:92:0x0207, B:95:0x020e, B:97:0x0214, B:99:0x0218, B:100:0x021b, B:101:0x0230, B:123:0x02cd, B:124:0x02d0, B:107:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029b, B:113:0x029d, B:115:0x02a5, B:117:0x02ad, B:118:0x02c2, B:20:0x007f, B:21:0x0082, B:22:0x00a1, B:24:0x00b0, B:45:0x0100, B:122:0x02c9, B:13:0x0048, B:16:0x0052, B:19:0x0074), top: B:141:0x0013, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137 A[Catch: Exception -> 0x02d1, all -> 0x02ef, TryCatch #4 {Exception -> 0x02d1, blocks: (B:7:0x001b, B:48:0x012e, B:49:0x0131, B:51:0x0137, B:53:0x013c, B:55:0x0140, B:65:0x017f, B:68:0x0186, B:70:0x018c, B:72:0x0190, B:73:0x0193, B:75:0x0197, B:78:0x01a9, B:80:0x01bd, B:92:0x0207, B:95:0x020e, B:97:0x0214, B:99:0x0218, B:100:0x021b, B:101:0x0230, B:123:0x02cd, B:124:0x02d0, B:107:0x028e, B:108:0x0292, B:110:0x0296, B:112:0x029b, B:113:0x029d, B:115:0x02a5, B:117:0x02ad, B:118:0x02c2, B:20:0x007f, B:21:0x0082, B:22:0x00a1, B:24:0x00b0, B:45:0x0100, B:122:0x02c9, B:13:0x0048, B:16:0x0052, B:19:0x0074), top: B:141:0x0013, outer: #3 }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController$startCallInternal$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final boolean invokeSuspend$ownsAttempt(C3UX c3ux, SessionController sessionController, String str) {
        HoC hoC = (HoC) C3cH.A0t(c3ux);
        return hoC != null && hoC.isActive() && C3cJ.A0z(sessionController, str);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SessionController$startCallInternal$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
