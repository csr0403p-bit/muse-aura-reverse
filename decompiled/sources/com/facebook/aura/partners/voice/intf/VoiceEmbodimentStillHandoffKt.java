package com.facebook.aura.partners.voice.intf;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3pU;
import X.C3rb;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentStillHandoffKt {
    public static final long STILL_ATTEMPT_TIMEOUT_MS = 30000;
    public static final long STILL_RETRY_BASE_DELAY_MS = 2000;
    public static final long STILL_RETRY_MAX_DELAY_MS = 30000;
    public static final int STILL_RETRY_MAX_FAILURES = 10;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoffKt$launchStillHandoffTimers$1", f = "VoiceEmbodimentStillHandoff.kt", l = {113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoffKt$launchStillHandoffTimers$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<Boolean> $canLoad;
        public final /* synthetic */ C1BN<VoiceEmbodimentStillHandoff> $handoff;
        public final /* synthetic */ G0U<VoiceStillHandoffEvent.Retry, Unit> $onRetry;
        public final /* synthetic */ G0U<VoiceStillHandoffEvent.Failed, Unit> $onWatchdog;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoffKt$launchStillHandoffTimers$1$1", f = "VoiceEmbodimentStillHandoff.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoffKt$launchStillHandoffTimers$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02931 extends AbstractC07127nr implements G0W<VoiceEmbodimentStillHandoff, Boolean, HtJ<? super StillHandoffTimer>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public C02931(HtJ<? super C02931> htJ) {
                super(3, htJ);
            }

            public final Object invoke(VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff, boolean z, HtJ<? super StillHandoffTimer> htJ) {
                C02931 c02931 = new C02931(htJ);
                c02931.L$0 = voiceEmbodimentStillHandoff;
                c02931.Z$0 = z;
                return c02931.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff = (VoiceEmbodimentStillHandoff) this.L$0;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                StillHandoffTimer stillHandoffTimerTimer = VoiceEmbodimentStillHandoffKt.timer(voiceEmbodimentStillHandoff);
                if (z) {
                    return stillHandoffTimerTimer;
                }
                return null;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff, Boolean bool, HtJ<? super StillHandoffTimer> htJ) {
                return invoke(voiceEmbodimentStillHandoff, AnonymousClass001.A1X(bool), htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoffKt$launchStillHandoffTimers$1$2", f = "VoiceEmbodimentStillHandoff.kt", l = {116, 119}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoffKt$launchStillHandoffTimers$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<StillHandoffTimer, HtJ<? super Unit>, Object> {
            public final /* synthetic */ G0U<VoiceStillHandoffEvent.Retry, Unit> $onRetry;
            public final /* synthetic */ G0U<VoiceStillHandoffEvent.Failed, Unit> $onWatchdog;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(G0U<? super VoiceStillHandoffEvent.Failed, Unit> g0u, G0U<? super VoiceStillHandoffEvent.Retry, Unit> g0u2, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$onWatchdog = g0u;
                this.$onRetry = g0u2;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onWatchdog, this.$onRetry, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                G0U g0u;
                C06G failed;
                StillHandoffTimer stillHandoffTimer = (StillHandoffTimer) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (stillHandoffTimer != null) {
                        if (stillHandoffTimer.inFlight) {
                            this.L$0 = stillHandoffTimer;
                            this.label = 1;
                            if (C7Bq.A01(30000L, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                            g0u = this.$onWatchdog;
                            failed = new VoiceStillHandoffEvent.Failed(stillHandoffTimer.callGeneration, stillHandoffTimer.key, stillHandoffTimer.attempt);
                        } else {
                            long jStillRetryDelayMs = VoiceEmbodimentStillHandoffKt.stillRetryDelayMs(stillHandoffTimer.failures);
                            this.L$0 = stillHandoffTimer;
                            this.label = 2;
                            if (C7Bq.A01(jStillRetryDelayMs, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                            g0u = this.$onRetry;
                            failed = new VoiceStillHandoffEvent.Retry(stillHandoffTimer.callGeneration, stillHandoffTimer.key);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    Hwg.A00(obj);
                    g0u = this.$onWatchdog;
                    failed = new VoiceStillHandoffEvent.Failed(stillHandoffTimer.callGeneration, stillHandoffTimer.key, stillHandoffTimer.attempt);
                } else {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    g0u = this.$onRetry;
                    failed = new VoiceStillHandoffEvent.Retry(stillHandoffTimer.callGeneration, stillHandoffTimer.key);
                }
                g0u.invoke(failed);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(StillHandoffTimer stillHandoffTimer, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(stillHandoffTimer, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BN<VoiceEmbodimentStillHandoff> c1bn, C20Q<Boolean> c20q, G0U<? super VoiceStillHandoffEvent.Failed, Unit> g0u, G0U<? super VoiceStillHandoffEvent.Retry, Unit> g0u2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$handoff = c1bn;
            this.$canLoad = c20q;
            this.$onWatchdog = g0u;
            this.$onRetry = g0u2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$handoff, this.$canLoad, this.$onWatchdog, this.$onRetry, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA04 = C3rb.A04(new C02931(null), this.$handoff, this.$canLoad);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onWatchdog, this.$onRetry, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c20qA04) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final HoC launchStillHandoffTimers(C3UX c3ux, C1BN<VoiceEmbodimentStillHandoff> c1bn, C20Q<Boolean> c20q, G0U<? super VoiceStillHandoffEvent.Failed, Unit> g0u, G0U<? super VoiceStillHandoffEvent.Retry, Unit> g0u2) {
        AnonymousClass005.A17(c3ux, c1bn, c20q, g0u, g0u2);
        return AnonymousClass001.A11(new AnonymousClass1(c1bn, c20q, g0u, g0u2, null), c3ux);
    }

    public static final long stillRetryDelayMs(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 4) {
            i2 = 4;
        }
        long j = 2000 << i2;
        if (j > 30000) {
            return 30000L;
        }
        return j;
    }

    public static final StillHandoffTimer timer(VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff) {
        String str = voiceEmbodimentStillHandoff.incomingKey;
        if (str == null || voiceEmbodimentStillHandoff.incoming == null) {
            return null;
        }
        return new StillHandoffTimer(voiceEmbodimentStillHandoff.callGeneration, str, voiceEmbodimentStillHandoff.incomingAttempt, voiceEmbodimentStillHandoff.incomingFailures, voiceEmbodimentStillHandoff.getIncomingInFlight());
    }
}
