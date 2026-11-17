package com.facebook.aura.composer.dictation.voyager;

import X.AGH;
import X.AIG;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BV4;
import X.BV6;
import X.C06H;
import X.C07739il;
import X.C0924AIa;
import X.C3357CGy;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7438Evz;
import X.C78W;
import X.C7BY;
import X.C7Bq;
import X.C8eO;
import X.C8j2;
import X.C8j4;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzS;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder;
import com.facebook.aura.composer.dictation.engine.DictationEngine;
import com.facebook.aura.composer.dictation.engine.DictationEngineListener;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.dictation.engine.DictationRequest;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchGatewayConnectionKt;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.partners.voice.session.impl.VoiceCallConnectionTracker;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import com.facebook.aura.utils.MC;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class VoyagerDictationEngine implements DictationEngine {
    public static final long BASE_FINALIZATION_TIMEOUT_MS = 10000;
    public static final long BYTES_PER_AUDIO_SECOND = 48000;
    public static final String DEFAULT_MODEL = "prod_hatch_android";
    public static final long MAX_FINALIZATION_TIMEOUT_MS = 120000;
    public static final int MAX_RETRIES = 2;
    public static final long NOISY_MIC_EXTRA_WAIT_MS = 1000;
    public static final long PARTIAL_IDLE_TIMEOUT_MS = 60000;
    public static final long REPLAY_BURST_MS = 500;
    public static final long REPLAY_SILENCE_MARGIN_MS = 500;
    public static final int REPLAY_SPEED = 2;
    public static final long RETRY_BACKOFF_MS = 3000;
    public static final long SECOND_RETRY_STOP_DEADLINE_MS = 20000;
    public static final String SOCKET_CLOSED_REASON_PREFIX = "socket_closed:";
    public static final String TAG = "VoyagerDictationEngine";
    public VoyagerAsrClient acknowledgedClient;
    public long audibleThroughBytes;
    public final AtomicLong audioBytes;
    public volatile VoyagerAsrAudioEncoding audioEncoding;
    public volatile String audioEncodingFallback;
    public final C3UX callbackScope;
    public final AtomicLong captureEndedAtMs;
    public volatile VoyagerAsrClient client;
    public volatile String clientSessionId;
    public final Long connectDeadlineMs;
    public boolean connected;
    public final Context context;
    public final AtomicLong droppedAudioBytes;
    public final AtomicLong encodedAudioBytesSent;
    public volatile HoC endOfTurnJob;
    public final Function0<Long> endOfTurnSilenceMs;
    public volatile boolean endedUnreachable;
    public final AtomicBoolean endpointFired;
    public final AtomicBoolean finished;
    public final AtomicLong firstPartialAtMs;
    public final AtomicBoolean hasPendingPartial;
    public final VoyagerAsrAudioEncoding initialAudioEncoding;
    public final AtomicBoolean isActive;
    public boolean isCaptureDrained;
    public final Function0<Boolean> isLowBandwidthLink;
    public boolean isReplaying;
    public final AtomicBoolean isStopping;
    public final Function0<List<String>> languageBias;
    public volatile DictationEngineListener listener;
    public final AtomicInteger maxNonemptyPartialCharacters;
    public volatile DictationMode mode;
    public final Function0<String> modelName;
    public AuraNetworkState networkAtStart;
    public final AtomicInteger partialCount;
    public volatile HoC partialIdleJob;
    public final AtomicLong preAckDroppedAudioBytes;
    public int reconnects;
    public volatile HatchDictationMicRecorder recorder;
    public AIG<byte[]> replayQueue;
    public VoyagerDictationResume resume;
    public int retries;
    public final boolean retriesAutoSubmit;
    public int retryHoldCharacters;
    public String retryReason;
    public final C3UX scope;
    public boolean sessionHasText;
    public Long shownThroughBytes;
    public final AtomicBoolean started;
    public final AtomicLong startedAtMs;
    public volatile HoC stopTimeoutJob;
    public String transcript;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Set<String> RETRYABLE_FAILURES = BFI.A0H(new String[]{"audio_queue_overflow", VoiceCallConnectionTracker.END_REASON_CONNECT_TIMEOUT, HatchGatewayConnectionKt.ERROR_TYPE_HANDSHAKE_TIMEOUT, "socket_failure", "handshake_send_failure", "audio_send_failure", "end_stream_send_failure"});
    public static final String INGRESS_SLOWER_THAN_REAL_TIME = "Ingress audio slower than real-time";
    public static final Set<String> RETRYABLE_SERVER_ERRORS = BFI.A0H(new String[]{INGRESS_SLOWER_THAN_REAL_TIME, "Audio processing backlog too large", "Handshake timeout", "No ingress activity", "request timed out"});

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$armConnectDeadline$1", f = "VoyagerDictationEngine.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$armConnectDeadline$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $deadlineMs;
        public int label;
        public final /* synthetic */ VoyagerDictationEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, VoyagerDictationEngine voyagerDictationEngine, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$deadlineMs = j;
            this.this$0 = voyagerDictationEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$deadlineMs, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    long j = this.$deadlineMs;
                    this.label = 1;
                    if (C7Bq.A01(j, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                this.this$0.onConnectDeadline();
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(VoyagerDictationEngine.TAG, "connect deadline handler failed", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$armStopTimeout$1", f = "VoyagerDictationEngine.kt", l = {MC.hatch_android_subscription.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$armStopTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C111701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $timeoutMs;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ VoyagerDictationEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111701(long j, VoyagerDictationEngine voyagerDictationEngine, HtJ<? super C111701> htJ) {
            super(2, htJ);
            this.$timeoutMs = j;
            this.this$0 = voyagerDictationEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C111701 c111701 = new C111701(this.$timeoutMs, this.this$0, htJ);
            c111701.L$0 = obj;
            return c111701;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    long j = this.$timeoutMs;
                    this.L$0 = c3ux;
                    this.label = 1;
                    if (C7Bq.A01(j, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                this.this$0.onStopTimeout(HzS.A02(c3ux.AEA()));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(VoyagerDictationEngine.TAG, "stop timeout handler failed", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111701) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$finish$3", f = "VoyagerDictationEngine.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$finish$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DictationOutcome $resolvedOutcome;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DictationOutcome dictationOutcome, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$resolvedOutcome = dictationOutcome;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoyagerDictationEngine.this.new AnonymousClass3(this.$resolvedOutcome, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            DictationEngineListener dictationEngineListener = VoyagerDictationEngine.this.listener;
            if (dictationEngineListener != null) {
                dictationEngineListener.onStopped(this.$resolvedOutcome);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$handleSpeechEnd$1", f = "VoyagerDictationEngine.kt", l = {256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$handleSpeechEnd$1, reason: invalid class name and case insensitive filesystem */
    public final class C111711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $speechEndedAtMs;
        public long J$0;
        public long J$1;
        public long J$2;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111711(long j, HtJ<? super C111711> htJ) {
            super(2, htJ);
            this.$speechEndedAtMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C111711 c111711 = VoyagerDictationEngine.this.new C111711(this.$speechEndedAtMs, htJ);
            c111711.L$0 = obj;
            return c111711;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:6:0x0016). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r9 = r12.L$0
                X.3UX r9 = (X.C3UX) r9
                X.Hji r8 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r10 = 0
                r7 = 1
                if (r0 == 0) goto L2a
                if (r0 != r7) goto L67
                long r1 = r12.J$2
                long r5 = r12.J$0
                X.Hwg.A00(r13)
            L16:
                int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r0 > 0) goto L2f
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r1 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this
                X.78T r0 = r9.AEA()
                X.HoC r0 = X.HzS.A02(r0)
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.access$handleEndpoint(r1, r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L2a:
                X.Hwg.A00(r13)
                r5 = 0
            L2f:
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r2 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this
                long r0 = r12.$speechEndedAtMs
                long r3 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.access$endOfTurnAtMs(r2, r0)
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L52
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r0 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this
                com.facebook.aura.composer.dictation.engine.DictationEngineListener r5 = r0.listener
                if (r5 == 0) goto L51
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r0 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this
                kotlin.jvm.functions.Function0<java.lang.Long> r0 = r0.endOfTurnSilenceMs
                long r1 = X.C8j4.A0Q(r0)
                com.facebook.aura.composer.dictation.engine.EndOfTurnCountdown r0 = new com.facebook.aura.composer.dictation.engine.EndOfTurnCountdown
                r0.<init>(r3, r1)
                r5.onEndOfTurnCountdown(r0)
            L51:
                r5 = r3
            L52:
                long r1 = X.C3cH.A04(r3)
                r12.L$0 = r9
                r12.J$0 = r5
                r12.J$1 = r3
                r12.J$2 = r1
                r12.label = r7
                java.lang.Object r0 = X.C7Bq.A01(r1, r12)
                if (r0 != r8) goto L16
                return r8
            L67:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.C111711.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111711) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$reconnectWithKeptAudio$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C111731 extends C7438Evz implements G0U<VoyagerAsrClient, Unit> {
        public C111731(Object obj) {
            super(1, obj, VoyagerDictationEngine.class, "replayKeptAudio", "replayKeptAudio(Lcom/facebook/aura/composer/dictation/voyager/VoyagerAsrClient;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoyagerAsrClient voyagerAsrClient) {
            ((VoyagerDictationEngine) AnonymousClass006.A0o(voyagerAsrClient, this)).replayKeptAudio(voyagerAsrClient);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoyagerAsrClient voyagerAsrClient) {
            invoke2(voyagerAsrClient);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$replayKeptAudio$1", f = "VoyagerDictationEngine.kt", l = {425}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$replayKeptAudio$1, reason: invalid class name and case insensitive filesystem */
    public final class C111741 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoyagerAsrClient $target;
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public long J$4;
        public long J$5;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111741(VoyagerAsrClient voyagerAsrClient, HtJ<? super C111741> htJ) {
            super(2, htJ);
            this.$target = voyagerAsrClient;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoyagerDictationEngine.this.new C111741(this.$target, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[Catch: Exception -> 0x008c, CancellationException -> 0x00a6, TryCatch #2 {CancellationException -> 0x00a6, Exception -> 0x008c, blocks: (B:6:0x0015, B:11:0x0033, B:13:0x003d, B:15:0x0040, B:18:0x004d, B:10:0x0021), top: B:30:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[Catch: Exception -> 0x008c, CancellationException -> 0x00a6, TryCatch #2 {CancellationException -> 0x00a6, Exception -> 0x008c, blocks: (B:6:0x0015, B:11:0x0033, B:13:0x003d, B:15:0x0040, B:18:0x004d, B:10:0x0021), top: B:30:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0082 -> B:23:0x0089). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0087 -> B:23:0x0089). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                X.Hji r18 = X.EnumC10460Hji.A02
                r13 = r19
                int r1 = r13.label
                r0 = 1
                if (r1 == 0) goto L1e
                if (r1 != r0) goto L19
                long r10 = r13.J$2
                long r8 = r13.J$1
                long r6 = r13.J$0
                java.lang.Object r12 = r13.L$0
                X.AOk r12 = (X.AOk) r12
                X.Hwg.A00(r20)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                goto L89
            L19:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1e:
                X.Hwg.A00(r20)
                long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r0 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                X.9il r12 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.access$silentTailBytes(r0)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r0 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                long r4 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.access$sessionStart(r0)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r10 = 0
            L33:
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r1 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient r0 = r13.$target     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                byte[] r14 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.access$takeReplayChunk(r1, r0)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                if (r14 != 0) goto L40
                kotlin.Unit r18 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                return r18
            L40:
                int r0 = r14.length     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                long r0 = (long) r0     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                long r8 = r0 + r4
                long r15 = r12.A00     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                long r2 = r12.A01     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                int r17 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r17 > 0) goto L4d
                goto L85
            L4d:
                com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient r2 = r13.$target     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r2.appendPcm(r14)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                long r10 = r10 + r0
                r2 = 1000(0x3e8, double:4.94E-321)
                long r2 = r2 * r10
                r0 = 48000(0xbb80, double:2.3715E-319)
                long r2 = r2 / r0
                r14 = 500(0x1f4, double:2.47E-321)
                long r0 = r2 - r14
                long r0 = X.BV6.A0I(r0)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                long r15 = r6 + r0
                long r0 = X.C3cH.A04(r15)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r13.L$0 = r12     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r14 = 0
                r13.L$1 = r14     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r13.J$0 = r6     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r13.J$1 = r8     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r13.J$2 = r10     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r13.J$3 = r4     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r13.J$4 = r2     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r13.J$5 = r15     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r2 = 1
                r13.label = r2     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                java.lang.Object r1 = X.C7Bq.A01(r0, r13)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> La6
                r0 = r18
                if (r1 != r0) goto L89
                goto L8b
            L85:
                int r2 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
                if (r2 > 0) goto L4d
            L89:
                r4 = r8
                goto L33
            L8b:
                return r18
            L8c:
                r2 = move-exception
                java.lang.String r1 = "replay failed"
                java.lang.String r0 = "VoyagerDictationEngine"
                X.CFK.A08(r0, r1, r2)
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine r0 = com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.this
                r7 = 62
                r2 = 0
                java.lang.String r1 = "replay_failure"
                r3 = 0
                r4 = r2
                r5 = r2
                r6 = r3
                r8 = r2
                com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.finish$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            La6:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.C111741.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111741) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$resetPartialIdleTimeout$1", f = "VoyagerDictationEngine.kt", l = {544}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$resetPartialIdleTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C111751 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C111751(HtJ<? super C111751> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoyagerDictationEngine.this.new C111751(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoyagerDictationEngine.this.new C111751(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(60000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (VoyagerDictationEngine.this.isActive.get() && !VoyagerDictationEngine.this.isStopping.get()) {
                CFK.A06(VoyagerDictationEngine.TAG, "No new partial transcript within idle timeout");
                VoyagerDictationEngine.this.stop();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$retry$1", f = "VoyagerDictationEngine.kt", l = {370}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$retry$1, reason: invalid class name and case insensitive filesystem */
    public final class C111761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $accessToken;
        public final /* synthetic */ String $failure;
        public final /* synthetic */ VoyagerAsrClient $next;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111761(VoyagerAsrClient voyagerAsrClient, String str, String str2, HtJ<? super C111761> htJ) {
            super(2, htJ);
            this.$next = voyagerAsrClient;
            this.$accessToken = str;
            this.$failure = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoyagerDictationEngine.this.new C111761(this.$next, this.$accessToken, this.$failure, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    this.label = 1;
                    if (C7Bq.A01(3000L, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                VoyagerDictationEngine.this.startRetryClient(this.$next, this.$accessToken, this.$failure);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(VoyagerDictationEngine.TAG, "second reconnect failed to start", e2);
                VoyagerDictationEngine.finish$default(VoyagerDictationEngine.this, "connect_failure", null, false, null, null, false, 62, null);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111761) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C111771 extends AbstractC7559F3s implements Function0<Unit> {
        public C111771() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerDictationEngine.this.stop();
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$start$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoyagerDictationEngine.finish$default(VoyagerDictationEngine.this, "audio_capture_failure", null, false, null, null, false, 62, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$start$3, reason: invalid class name and case insensitive filesystem */
    public final class C111783 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ DictationEngineListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111783(DictationEngineListener dictationEngineListener) {
            super(0);
            this.$listener = dictationEngineListener;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (VoyagerDictationEngine.this.finished.get()) {
                return;
            }
            this.$listener.onCaptureStarted();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$stop$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C111791 extends C7438Evz implements Function0<Unit> {
        public C111791(Object obj) {
            super(0, obj, VoyagerDictationEngine.class, "onCaptureDrained", "onCaptureDrained()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((VoyagerDictationEngine) this.receiver).onCaptureDrained();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    private final synchronized void armStopTimeout() {
        HoC hoC = this.stopTimeoutJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        long jStopResultTimeoutMs = stopResultTimeoutMs();
        this.stopTimeoutJob = AnonymousClass001.A11(new C111701(jStopResultTimeoutMs, this, null), this.scope);
    }

    private final synchronized boolean fallBackToPcm(String str) {
        VoyagerDictationResume voyagerDictationResume = this.resume;
        String strA0z = C3357CGy.A0z(this.userSession);
        if (this.finished.get() || voyagerDictationResume == null || strA0z == null || strA0z.length() == 0) {
            return false;
        }
        CFK.A0H(TAG, "fallBackToPcm: Ogg Opus failed (%s), reconnecting with PCM", str);
        this.audioEncodingFallback = str;
        this.audioEncoding = pcmAudioEncoding();
        VoyagerAsrClient voyagerAsrClientReconnectWithKeptAudio = reconnectWithKeptAudio(voyagerDictationResume, voyagerDictationResume.replayStart(this.shownThroughBytes, this.sessionHasText));
        if (!mayReplayAgain()) {
            voyagerDictationResume.forgetAudio();
        }
        if (this.isStopping.get()) {
            armStopTimeout();
        }
        if (!voyagerAsrClientReconnectWithKeptAudio.start(strA0z)) {
            finish("connect_failure", null, false, DictationOutcome.FAILED, null, false);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: all -> 0x00a0, PHI: r12
  0x003a: PHI (r12v2 boolean) = (r12v0 boolean), (r12v3 boolean) binds: [B:13:0x0038, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x0002, B:8:0x000e, B:10:0x0030, B:14:0x003a, B:15:0x003d, B:17:0x0047, B:20:0x0051, B:22:0x0059, B:25:0x005e, B:27:0x006c), top: B:40:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void finish(java.lang.String r14, java.lang.String r15, boolean r16, com.facebook.aura.composer.dictation.engine.DictationOutcome r17, com.facebook.aura.composer.dictation.voyager.VoyagerAsrServerError r18, boolean r19) {
        /*
            r13 = this;
            r7 = r13
            monitor-enter(r7)
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.finished     // Catch: java.lang.Throwable -> La0
            r6 = 1
            r3 = 0
            boolean r0 = r0.compareAndSet(r3, r6)     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto Le
            monitor-exit(r7)
            return
        Le:
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.isStopping     // Catch: java.lang.Throwable -> La0
            boolean r5 = r0.get()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.isActive     // Catch: java.lang.Throwable -> La0
            r0.set(r3)     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.isStopping     // Catch: java.lang.Throwable -> La0
            r0.set(r3)     // Catch: java.lang.Throwable -> La0
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient r13 = r13.client     // Catch: java.lang.Throwable -> La0
            r4 = 0
            r7.client = r4     // Catch: java.lang.Throwable -> La0
            r7.resume = r4     // Catch: java.lang.Throwable -> La0
            X.AIG r0 = new X.AIG     // Catch: java.lang.Throwable -> La0
            r0.<init>()     // Catch: java.lang.Throwable -> La0
            r7.replayQueue = r0     // Catch: java.lang.Throwable -> La0
            r7.isReplaying = r3     // Catch: java.lang.Throwable -> La0
            if (r13 == 0) goto L37
            boolean r0 = r13.hasReceivedFinal()     // Catch: java.lang.Throwable -> La0
            r12 = 1
            if (r0 == r6) goto L3a
        L37:
            r12 = 0
            if (r13 == 0) goto L3d
        L3a:
            r13.close()     // Catch: java.lang.Throwable -> La0
        L3d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.hasPendingPartial     // Catch: java.lang.Throwable -> La0
            boolean r2 = r0.get()     // Catch: java.lang.Throwable -> La0
            com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder r0 = r7.recorder     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L50
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.speechDetected     // Catch: java.lang.Throwable -> La0
            boolean r1 = r0.get()     // Catch: java.lang.Throwable -> La0
            r0 = 1
            if (r1 == r6) goto L51
        L50:
            r0 = 0
        L51:
            r1 = r17
            com.facebook.aura.composer.dictation.engine.DictationOutcome r11 = com.facebook.aura.composer.dictation.engine.DictationOutcomeKt.resolveStopOutcome(r1, r5, r2, r12, r0)     // Catch: java.lang.Throwable -> La0
            if (r19 == 0) goto L5e
            com.facebook.aura.composer.dictation.engine.DictationOutcome r0 = com.facebook.aura.composer.dictation.engine.DictationOutcome.FAILED     // Catch: java.lang.Throwable -> La0
            if (r11 != r0) goto L5e
            r3 = 1
        L5e:
            r7.endedUnreachable = r3     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.atomic.AtomicLong r0 = r7.startedAtMs     // Catch: java.lang.Throwable -> La0
            long r5 = r0.get()     // Catch: java.lang.Throwable -> La0
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            java.util.concurrent.atomic.AtomicLong r5 = r7.captureEndedAtMs     // Catch: java.lang.Throwable -> La0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La0
            r5.compareAndSet(r0, r2)     // Catch: java.lang.Throwable -> La0
            r8 = r14
            r9 = r15
            r10 = r16
            r14 = r18
            java.util.Map r2 = r7.completedMetadata(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> La0
            goto L81
        L80:
            r2 = r4
        L81:
            monitor-exit(r7)
            com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder r1 = r7.recorder
            if (r1 == 0) goto L8b
            int r0 = com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder.AUDIO_FORMAT
            r1.stop(r4)
        L8b:
            if (r2 == 0) goto L90
            r7.logCompleted(r2)
        L90:
            X.3UX r0 = r7.scope
            X.Hxb.A03(r4, r0)
            X.3UX r1 = r7.callbackScope
            com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$finish$3 r0 = new com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$finish$3
            r0.<init>(r11, r4)
            X.AnonymousClass001.A1J(r0, r1)
            return
        La0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.finish(java.lang.String, java.lang.String, boolean, com.facebook.aura.composer.dictation.engine.DictationOutcome, com.facebook.aura.composer.dictation.voyager.VoyagerAsrServerError, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEndpoint(HoC hoC) {
        DictationEngineListener dictationEngineListener;
        synchronized (this) {
            dictationEngineListener = (hoC.isActive() && !this.isStopping.get() && isAutoSubmit() && C3cI.A1W(this.endpointFired)) ? this.listener : null;
        }
        if (dictationEngineListener != null) {
            dictationEngineListener.onEndpoint();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFinal(VoyagerAsrClient voyagerAsrClient, String str) {
        String strJoined;
        synchronized (this) {
            if (this.client != voyagerAsrClient) {
                return;
            }
            this.hasPendingPartial.set(false);
            VoyagerDictationResume voyagerDictationResume = this.resume;
            if (voyagerDictationResume != null && (strJoined = voyagerDictationResume.joined(str)) != null) {
                str = strJoined;
            }
            this.transcript = str;
            DictationEngineListener dictationEngineListener = this.listener;
            if (dictationEngineListener != null) {
                dictationEngineListener.onTranscript(str, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePartial(VoyagerAsrClient voyagerAsrClient, String str) {
        String strJoined;
        synchronized (this) {
            if (this.client == voyagerAsrClient) {
                this.partialCount.incrementAndGet();
                VoyagerDictationResume voyagerDictationResume = this.resume;
                if (voyagerDictationResume == null || (strJoined = voyagerDictationResume.joined(str)) == null) {
                    strJoined = str;
                }
                if (!C7BY.A0j(str)) {
                    this.sessionHasText = true;
                    this.hasPendingPartial.set(true);
                    AtomicInteger atomicInteger = this.maxNonemptyPartialCharacters;
                    atomicInteger.set(Math.max(atomicInteger.get(), strJoined.length()));
                }
                this.firstPartialAtMs.compareAndSet(0L, SystemClock.elapsedRealtime());
                resetPartialIdleTimeout();
                if (strJoined.length() >= this.retryHoldCharacters) {
                    this.retryHoldCharacters = 0;
                    if (!C7BY.A0j(str)) {
                        Long l = voyagerAsrClient.transcribedMs;
                        this.shownThroughBytes = l != null ? Long.valueOf(sessionStart() + BV4.A04(l.longValue() * 48000)) : null;
                    }
                    this.transcript = strJoined;
                    DictationEngineListener dictationEngineListener = this.listener;
                    if (dictationEngineListener != null) {
                        dictationEngineListener.onTranscript(strJoined, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void handleSpeechEnd() {
        if (isAutoSubmit()) {
            HoC hoC = this.endOfTurnJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.endOfTurnJob = AnonymousClass001.A11(new C111711(jElapsedRealtime, null), this.scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void handleSpeechStart() {
        DictationEngineListener dictationEngineListener;
        HoC hoC = this.endOfTurnJob;
        if (hoC != null && hoC.isActive() && (dictationEngineListener = this.listener) != null) {
            dictationEngineListener.onEndOfTurnCountdown(null);
        }
        HoC hoC2 = this.endOfTurnJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyConnected(VoyagerAsrClient voyagerAsrClient) {
        synchronized (this) {
            if (this.client == voyagerAsrClient) {
                this.acknowledgedClient = voyagerAsrClient;
                if (!this.connected) {
                    this.connected = true;
                    DictationEngineListener dictationEngineListener = this.listener;
                    if (dictationEngineListener != null) {
                        dictationEngineListener.onConnected();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onCaptureDrained() {
        VoyagerAsrClient voyagerAsrClient;
        this.isCaptureDrained = true;
        if (!this.isReplaying && (voyagerAsrClient = this.client) != null) {
            voyagerAsrClient.endAudio();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onClientClosed(VoyagerAsrClient voyagerAsrClient, VoyagerAsrResult voyagerAsrResult) {
        String strOggOpusFallbackReason;
        boolean z;
        if (this.client == voyagerAsrClient && ((strOggOpusFallbackReason = oggOpusFallbackReason(voyagerAsrClient, voyagerAsrResult)) == null || !fallBackToPcm(strOggOpusFallbackReason))) {
            VoyagerAsrServerError voyagerAsrServerError = voyagerAsrResult.serverError;
            boolean zEquals = INGRESS_SLOWER_THAN_REAL_TIME.equals(voyagerAsrServerError != null ? voyagerAsrServerError.message : null);
            if (!isRetryable(voyagerAsrResult) || !retry(voyagerAsrResult.terminalReason, zEquals)) {
                String str = voyagerAsrResult.terminalReason;
                String str2 = voyagerAsrResult.sessionId;
                boolean z2 = voyagerAsrResult.usedPreRewriteText;
                DictationOutcome dictationOutcome = voyagerAsrResult.outcome;
                VoyagerAsrServerError voyagerAsrServerError2 = voyagerAsrResult.serverError;
                if (!this.connected && !voyagerAsrResult.serverAnswered) {
                    boolean zIsTransportFailure = isTransportFailure(voyagerAsrResult);
                    z = true;
                    if (!zIsTransportFailure) {
                    }
                    finish(str, str2, z2, dictationOutcome, voyagerAsrServerError2, z);
                }
                z = false;
                finish(str, str2, z2, dictationOutcome, voyagerAsrServerError2, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onConnectDeadline() {
        if (!this.connected) {
            finish("connect_deadline", null, false, DictationOutcome.FAILED, null, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onStopTimeout(HoC hoC) {
        if (this.stopTimeoutJob == hoC && !this.finished.get() && !retry("finalization_timeout", false)) {
            CFK.A06(TAG, "stop: no terminal frame within timeout, forcing stop");
            finish("finalization_timeout", null, false, DictationOutcome.FAILED, null, false);
        }
    }

    private final synchronized void resetPartialIdleTimeout() {
        if (isAutoSubmit()) {
            HoC hoC = this.partialIdleJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.partialIdleJob = AnonymousClass001.A11(new C111751(null), this.scope);
        }
    }

    private final synchronized boolean retry(String str, boolean z) {
        boolean z2;
        int i;
        String strA0z;
        VoyagerDictationResume voyagerDictationResume = this.resume;
        z2 = false;
        if (!this.finished.get() && (i = this.retries) != 2 && voyagerDictationResume != null) {
            long jReplayStart = voyagerDictationResume.replayStart(this.shownThroughBytes, this.sessionHasText);
            if ((i <= 0 || !this.isStopping.get() || replayFitsStopDeadline(3000L, jReplayStart)) && (strA0z = C3357CGy.A0z(this.userSession)) != null && strA0z.length() != 0) {
                z2 = true;
                CFK.A0H(TAG, "retry: reconnecting after %s, replaying %d ms", str, Long.valueOf(audioMsSince(jReplayStart)));
                String str2 = this.retryReason;
                if (str2 == null) {
                    str2 = str;
                }
                this.retryReason = str2;
                this.retries++;
                if (this.audioEncoding == VoyagerAsrAudioEncoding.PCM_24KHZ && (z || AnonymousClass003.A1Y(this.isLowBandwidthLink))) {
                    this.audioEncoding = VoyagerAsrAudioEncoding.PCM_16KHZ;
                }
                VoyagerAsrClient voyagerAsrClientReconnectWithKeptAudio = reconnectWithKeptAudio(voyagerDictationResume, jReplayStart);
                if (!mayReplayAgain()) {
                    voyagerDictationResume.forgetAudio();
                }
                if (this.retries == 1) {
                    startRetryClient(voyagerAsrClientReconnectWithKeptAudio, strA0z, str);
                } else {
                    if (this.isStopping.get()) {
                        armStopTimeout();
                    }
                    AnonymousClass001.A1J(new C111761(voyagerAsrClientReconnectWithKeptAudio, strA0z, str, null), this.scope);
                }
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void routePcm(byte[] bArr) {
        VoyagerDictationResume voyagerDictationResume;
        synchronized (this) {
            AtomicLong atomicLong = this.audioBytes;
            long length = bArr.length;
            long jAddAndGet = atomicLong.addAndGet(length);
            HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
            if (hatchDictationMicRecorder != null && hatchDictationMicRecorder.isAudible()) {
                this.audibleThroughBytes = jAddAndGet;
            }
            if (mayReplayAgain() && (voyagerDictationResume = this.resume) != null) {
                voyagerDictationResume.remember(bArr);
            }
            if (this.isReplaying) {
                this.replayQueue.addLast(bArr);
            } else {
                VoyagerAsrClient voyagerAsrClient = this.client;
                if (voyagerAsrClient != null) {
                    voyagerAsrClient.appendPcm(bArr);
                    return;
                }
                this.droppedAudioBytes.addAndGet(length);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized long sessionStart() {
        VoyagerDictationResume voyagerDictationResume;
        voyagerDictationResume = this.resume;
        return voyagerDictationResume != null ? voyagerDictationResume.sessionStart : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized C07739il silentTailBytes() {
        C07739il c07739il;
        if (!isAutoSubmit() || this.audibleThroughBytes == 0) {
            c07739il = C07739il.A00;
        } else {
            long jA04 = this.audibleThroughBytes + BV4.A04((C8j4.A0Q(this.endOfTurnSilenceMs) + 500) * 48000);
            long j = this.audioBytes.get();
            c07739il = j <= Long.MIN_VALUE ? C07739il.A00 : new C07739il(jA04, j - 1);
        }
        return c07739il;
    }

    private final synchronized boolean startClient(String str) {
        if (this.finished.get() || this.isStopping.get() || !this.isActive.get()) {
            return false;
        }
        VoyagerAsrClient voyagerAsrClientNewDictationClient = newDictationClient(C111721.INSTANCE);
        this.client = voyagerAsrClientNewDictationClient;
        return voyagerAsrClientNewDictationClient.start(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void startRetryClient(VoyagerAsrClient voyagerAsrClient, String str, String str2) {
        String str3;
        String str4;
        boolean z;
        DictationOutcome dictationOutcome;
        if (this.client == voyagerAsrClient) {
            if (!this.isStopping.get() || this.retries <= 1 || replayFitsStopDeadline(0L, sessionStart())) {
                if (this.isStopping.get()) {
                    armStopTimeout();
                }
                this.reconnects++;
                if (!voyagerAsrClient.start(str)) {
                    str3 = "connect_failure";
                    str4 = null;
                    z = false;
                    dictationOutcome = DictationOutcome.FAILED;
                }
            } else {
                str4 = null;
                z = false;
                dictationOutcome = DictationOutcome.FAILED;
                str3 = str2;
            }
            finish(str3, str4, z, dictationOutcome, str4, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized byte[] takeReplayChunk(VoyagerAsrClient voyagerAsrClient) {
        if (this.client != voyagerAsrClient) {
            return null;
        }
        AIG<byte[]> aig = this.replayQueue;
        byte[] bArrRemoveFirst = aig.isEmpty() ? null : aig.removeFirst();
        if (bArrRemoveFirst == null) {
            this.isReplaying = false;
            if (this.isCaptureDrained) {
                voyagerAsrClient.endAudio();
            }
        }
        return bArrRemoveFirst;
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public synchronized void start(DictationRequest dictationRequest, DictationEngineListener dictationEngineListener) {
        boolean zA1a = AnonymousClass002.A1a(dictationRequest, dictationEngineListener);
        if (this.started.compareAndSet(false, zA1a)) {
            this.listener = dictationEngineListener;
            this.mode = dictationRequest.mode;
            this.clientSessionId = dictationRequest.clientSessionId;
            this.resume = (!isAutoSubmit() || this.retriesAutoSubmit) ? new VoyagerDictationResume(48000L) : null;
            this.isActive.set(zA1a);
            String strA0z = C3357CGy.A0z(this.userSession);
            if (strA0z == null || strA0z.length() == 0) {
                CFK.A04(TAG, "start: missing access token, aborting");
                finish("missing_access_token", null, false, DictationOutcome.FAILED, null, false);
            } else {
                this.startedAtMs.set(SystemClock.elapsedRealtime());
                this.networkAtStart = AuraNetworkMonitor.state.getValue();
                int i = HatchDictationMicRecorder.AUDIO_FORMAT;
                HatchDictationMicRecorder hatchDictationMicRecorder = new HatchDictationMicRecorder(this.context, 24000, new VoyagerDictationEngine$start$micRecorder$1(this));
                hatchDictationMicRecorder.onAudioFocusLost = new C111771();
                hatchDictationMicRecorder.onError = new AnonymousClass2();
                hatchDictationMicRecorder.onCaptureStarted = new C111783(dictationEngineListener);
                this.recorder = hatchDictationMicRecorder;
                if (startClient(strA0z)) {
                    hatchDictationMicRecorder.start();
                    if (!this.finished.get() && this.isActive.get()) {
                        resetPartialIdleTimeout();
                        Long l = this.connectDeadlineMs;
                        if (l != null) {
                            armConnectDeadline(l.longValue());
                        }
                    }
                } else {
                    CFK.A06(TAG, "start: session ended before the client could start");
                    finish("connect_failure", null, false, DictationOutcome.FAILED, null, false);
                }
            }
        } else {
            CFK.A06(TAG, "start: engine instances are single-use, skipping");
        }
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public synchronized void stop() {
        if (this.isActive.compareAndSet(true, false)) {
            this.isStopping.set(true);
            this.captureEndedAtMs.compareAndSet(0L, SystemClock.elapsedRealtime());
            HoC hoC = this.partialIdleJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            armStopTimeout();
            HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
            if (hatchDictationMicRecorder != null) {
                hatchDictationMicRecorder.stop(new C111791(this));
            } else {
                onCaptureDrained();
            }
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DictationMode.values().length];
            try {
                AnonymousClass002.A13(DictationMode.AUTO_SUBMIT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DictationMode.MANUAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine$newDictationClient$1, reason: invalid class name and case insensitive filesystem */
    public final class C111721 extends AbstractC7559F3s implements G0U<VoyagerAsrClient, Unit> {
        public static final C111721 INSTANCE = new C111721();

        public C111721() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoyagerAsrClient voyagerAsrClient) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoyagerAsrClient voyagerAsrClient) {
        }
    }

    private final void armConnectDeadline(long j) {
        AnonymousClass001.A1J(new AnonymousClass1(j, this, null), this.scope);
    }

    private final long audioMsSince(long j) {
        return ((this.audioBytes.get() - j) * 1000) / 48000;
    }

    public static /* synthetic */ long audioMsSince$default(VoyagerDictationEngine voyagerDictationEngine, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return voyagerDictationEngine.audioMsSince(j);
    }

    private final Map<String, String> audioUploadMetadata() {
        if (this.startedAtMs.get() == 0) {
            return AGH.A0E();
        }
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("audio_encoding", AnonymousClass001.A0u(this.audioEncoding.getWireValue()));
        c0924AIa.put("encoded_audio_bytes_sent", String.valueOf(this.encodedAudioBytesSent.get()));
        String str = this.audioEncodingFallback;
        if (str != null) {
            c0924AIa.put("audio_encoding_fallback", str);
        }
        return AIW.A0K(c0924AIa);
    }

    private final Map<String, String> completedMetadata(String str, String str2, boolean z, DictationOutcome dictationOutcome, boolean z2, VoyagerAsrClient voyagerAsrClient, VoyagerAsrServerError voyagerAsrServerError) {
        Map<String, String> mapCaptureMetadata;
        String str3;
        AuraNetworkState.Online online;
        long jLongValue = Long.valueOf(this.captureEndedAtMs.get()).longValue();
        if (jLongValue <= 0) {
            jLongValue = SystemClock.elapsedRealtime();
        }
        LinkedHashMap linkedHashMapA05 = AGH.A05(C3cG.A0r(HatchDataExportRepositoryKt.FAILURE_TRANSPORT, "voyager"), C3cG.A0r("client_session_id", this.clientSessionId), C3cG.A0r(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, this.mode.name()), C3cG.A0r(C3cF.A00(57), str), C3cG.A0r("outcome", dictationOutcome.name()), C3cG.A0r("capture_duration_ms", String.valueOf(jLongValue - this.startedAtMs.get())), C3cG.A0r("partial_count", String.valueOf(this.partialCount.get())), C3cG.A0r("max_nonempty_partial_chars", String.valueOf(this.maxNonemptyPartialCharacters.get())), C3cG.A0r("final_received", String.valueOf(z2)), C3cG.A0r("audio_bytes", String.valueOf(this.audioBytes.get())), C3cG.A0r("dropped_audio_bytes", String.valueOf(this.droppedAudioBytes.get())), C3cG.A0r("pre_ack_dropped_audio_bytes", String.valueOf(this.preAckDroppedAudioBytes.get())), C3cG.A0r(C3cF.A00(60), String.valueOf(this.transcript.length())), C3cG.A0r("used_pre_rewrite_text", String.valueOf(z)));
        long jLongValue2 = Long.valueOf(this.startedAtMs.get()).longValue();
        if (jLongValue2 > 0) {
            linkedHashMapA05.put("network_transport", logName(this.networkAtStart));
            linkedHashMapA05.put("process_age_ms", String.valueOf(jLongValue2 - Process.getStartElapsedRealtime()));
            AuraNetworkState auraNetworkState = this.networkAtStart;
            if ((auraNetworkState instanceof AuraNetworkState.Online) && (online = (AuraNetworkState.Online) auraNetworkState) != null) {
                linkedHashMapA05.put("network_validated", String.valueOf(online.isValidated));
            }
        }
        HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
        if (hatchDictationMicRecorder != null && (mapCaptureMetadata = hatchDictationMicRecorder.captureMetadata()) != null && (str3 = mapCaptureMetadata.get("mic_start_ms")) != null) {
            linkedHashMapA05.put("mic_start_ms", str3);
        }
        if (str2 != null) {
            linkedHashMapA05.put("asr_session_id", str2);
        }
        String str4 = this.retryReason;
        if (str4 != null) {
            linkedHashMapA05.put("retry_reason", str4);
            linkedHashMapA05.put("reconnects", String.valueOf(this.reconnects));
        }
        int sampleRateHz = this.initialAudioEncoding.getSampleRateHz();
        if (sampleRateHz != 24000) {
            linkedHashMapA05.put(C3cF.A00(54), String.valueOf(sampleRateHz));
        }
        if (this.audioEncoding.getSampleRateHz() != this.initialAudioEncoding.getSampleRateHz()) {
            linkedHashMapA05.put("retry_sample_rate_hz", String.valueOf(this.audioEncoding.getSampleRateHz()));
        }
        linkedHashMapA05.putAll(audioUploadMetadata());
        long jLongValue3 = Long.valueOf(this.firstPartialAtMs.get()).longValue();
        if (jLongValue3 > 0) {
            linkedHashMapA05.put("first_partial_ms", String.valueOf(jLongValue3 - this.startedAtMs.get()));
        }
        if (voyagerAsrClient != null) {
            Long l = voyagerAsrClient.connectToOpenMs;
            if (l != null) {
                linkedHashMapA05.put("connect_to_open_ms", String.valueOf(l.longValue()));
            }
            Long l2 = voyagerAsrClient.openToAckMs;
            if (l2 != null) {
                linkedHashMapA05.put("open_to_ack_ms", String.valueOf(l2.longValue()));
            }
        }
        if (voyagerAsrServerError != null) {
            String str5 = voyagerAsrServerError.errorType;
            if (str5 != null) {
                linkedHashMapA05.put("server_error_type", str5);
            }
            String str6 = voyagerAsrServerError.errorCode;
            if (str6 != null) {
                linkedHashMapA05.put("server_error_code", str6);
            }
            String str7 = voyagerAsrServerError.serverSessionId;
            if (str7 != null) {
                linkedHashMapA05.put("server_session_id", str7);
            }
            String str8 = voyagerAsrServerError.message;
            if (!C7BY.A0j(str8) && str8 != null) {
                linkedHashMapA05.put("server_error_message", str8);
            }
        }
        return linkedHashMapA05;
    }

    public static /* synthetic */ Map completedMetadata$default(VoyagerDictationEngine voyagerDictationEngine, String str, String str2, boolean z, DictationOutcome dictationOutcome, boolean z2, VoyagerAsrClient voyagerAsrClient, VoyagerAsrServerError voyagerAsrServerError, int i, Object obj) {
        if ((i & 64) != 0) {
            voyagerAsrServerError = null;
        }
        return voyagerDictationEngine.completedMetadata(str, str2, z, dictationOutcome, z2, voyagerAsrClient, voyagerAsrServerError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long endOfTurnAtMs(long j) {
        long jA0Q = C8j4.A0Q(this.endOfTurnSilenceMs);
        HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
        return Math.min(Math.max(j, hatchDictationMicRecorder != null ? hatchDictationMicRecorder.lastAudibleAtMs : 0L) + jA0Q, j + jA0Q + 1000);
    }

    public static /* synthetic */ void finish$default(VoyagerDictationEngine voyagerDictationEngine, String str, String str2, boolean z, DictationOutcome dictationOutcome, VoyagerAsrServerError voyagerAsrServerError, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            dictationOutcome = DictationOutcome.FAILED;
        }
        if ((i & 16) != 0) {
            voyagerAsrServerError = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        voyagerDictationEngine.finish(str, str2, z, dictationOutcome, voyagerAsrServerError, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAudioDropped(long j, boolean z) {
        this.droppedAudioBytes.addAndGet(j);
        if (z) {
            this.preAckDroppedAudioBytes.addAndGet(j);
        }
    }

    private final boolean isAutoSubmit() {
        return AnonymousClass002.A1Z(this.mode, DictationMode.AUTO_SUBMIT);
    }

    private final boolean isTransportFailure(VoyagerAsrResult voyagerAsrResult) {
        if (voyagerAsrResult.outcome == DictationOutcome.FAILED) {
            return RETRYABLE_FAILURES.contains(voyagerAsrResult.terminalReason) || AnonymousClass005.A1a(voyagerAsrResult.terminalReason, SOCKET_CLOSED_REASON_PREFIX);
        }
        return false;
    }

    private final void logCompleted(Map<String, String> map) {
        HatchAppEventLogger.INSTANCE.logEvent("dictation_completed", "chat", HatchStartupPoints.COMPOSER, "outcome", "voice_dictation", map, null);
    }

    private final String logName(AuraNetworkState auraNetworkState) {
        if (C7384Etj.areEqual(auraNetworkState, AuraNetworkState.Unknown.INSTANCE)) {
            return "unknown";
        }
        if (C7384Etj.areEqual(auraNetworkState, AuraNetworkState.Offline.INSTANCE)) {
            return "offline";
        }
        if (auraNetworkState instanceof AuraNetworkState.Online) {
            return AnonymousClass006.A0x(((AuraNetworkState.Online) auraNetworkState).transport);
        }
        throw C3cG.A0q();
    }

    private final boolean mayReplayAgain() {
        return this.retries < 2 || this.audioEncoding == VoyagerAsrAudioEncoding.OGG_OPUS;
    }

    private final VoyagerAsrClient newDictationClient(G0U<? super VoyagerAsrClient, Unit> g0u) {
        VoyagerAsrMode voyagerAsrMode;
        String str = this.clientSessionId;
        String strInvoke = this.modelName.invoke();
        if (C7BY.A0j(strInvoke)) {
            strInvoke = DEFAULT_MODEL;
        }
        String str2 = strInvoke;
        Function0<List<String>> function0 = this.languageBias;
        int iOrdinal = this.mode.ordinal();
        if (iOrdinal == 0) {
            voyagerAsrMode = VoyagerAsrMode.ENDPOINTING;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            voyagerAsrMode = VoyagerAsrMode.PUSH_TO_TALK;
        }
        VoyagerAsrClient voyagerAsrClient = new VoyagerAsrClient(voyagerAsrMode, str, str2, function0, this.audioEncoding);
        voyagerAsrClient.onPartial = new VoyagerDictationEngine$newDictationClient$3$1(this, voyagerAsrClient);
        voyagerAsrClient.onFinal = new VoyagerDictationEngine$newDictationClient$3$2(this, voyagerAsrClient);
        voyagerAsrClient.onAudioDropped = new VoyagerDictationEngine$newDictationClient$3$3(this);
        voyagerAsrClient.onAudioSent = new VoyagerDictationEngine$newDictationClient$3$4(this);
        voyagerAsrClient.onSpeechStart = new VoyagerDictationEngine$newDictationClient$3$5(this);
        voyagerAsrClient.onSpeechEnd = new VoyagerDictationEngine$newDictationClient$3$6(this);
        voyagerAsrClient.onClosed = new VoyagerDictationEngine$newDictationClient$3$7(this, voyagerAsrClient);
        voyagerAsrClient.onAcknowledged = new VoyagerDictationEngine$newDictationClient$3$8(this, voyagerAsrClient, g0u);
        return voyagerAsrClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoyagerAsrClient newDictationClient$default(VoyagerDictationEngine voyagerDictationEngine, G0U g0u, int i, Object obj) {
        if ((i & 1) != 0) {
            g0u = C111721.INSTANCE;
        }
        return voyagerDictationEngine.newDictationClient(g0u);
    }

    private final String oggOpusFallbackReason(VoyagerAsrClient voyagerAsrClient, VoyagerAsrResult voyagerAsrResult) {
        if (this.audioEncoding != VoyagerAsrAudioEncoding.OGG_OPUS) {
            return null;
        }
        String str = voyagerAsrResult.terminalReason;
        if (VoyagerAsrSession.AUDIO_ENCODER_UNAVAILABLE.equals(str)) {
            return "encoder_unavailable";
        }
        if (VoyagerAsrSession.AUDIO_ENCODER_FAILURE.equals(str)) {
            return "encoder_failure";
        }
        if (voyagerAsrResult.serverError == null || isRetryable(voyagerAsrResult)) {
            return null;
        }
        return voyagerAsrClient != this.acknowledgedClient ? C8j2.A00(75) : "server_error";
    }

    private final VoyagerAsrAudioEncoding pcmAudioEncoding() {
        return AnonymousClass003.A1Y(this.isLowBandwidthLink) ? VoyagerAsrAudioEncoding.PCM_16KHZ : VoyagerAsrAudioEncoding.PCM_24KHZ;
    }

    private final VoyagerAsrClient reconnectWithKeptAudio(VoyagerDictationResume voyagerDictationResume, long j) {
        VoyagerAsrClient voyagerAsrClient = this.client;
        if (voyagerAsrClient != null) {
            voyagerAsrClient.close();
        }
        this.droppedAudioBytes.set(0L);
        this.preAckDroppedAudioBytes.set(0L);
        String str = this.transcript;
        this.retryHoldCharacters = str.length();
        this.replayQueue = voyagerDictationResume.begin(str, j);
        this.sessionHasText = false;
        this.isReplaying = true;
        VoyagerAsrClient voyagerAsrClientNewDictationClient = newDictationClient(new C111731(this));
        this.client = voyagerAsrClientNewDictationClient;
        return voyagerAsrClientNewDictationClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replayKeptAudio(VoyagerAsrClient voyagerAsrClient) {
        AnonymousClass001.A1J(new C111741(voyagerAsrClient, null), this.scope);
    }

    public static /* synthetic */ boolean retry$default(VoyagerDictationEngine voyagerDictationEngine, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return voyagerDictationEngine.retry(str, z);
    }

    private final long stopDeadlineRemainingMs() {
        return C3cH.A04(this.captureEndedAtMs.get() + 20000);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long stopResultTimeoutMs() {
        /*
            r10 = this;
            r4 = 0
            r6 = 1
            long r2 = r10.audioMsSince(r4)
            int r0 = r10.retries
            if (r0 != 0) goto L32
            java.lang.String r0 = r10.audioEncodingFallback
            if (r0 != 0) goto L32
        Lf:
            r8 = 0
        L11:
            int r0 = r10.retries
            if (r0 <= r6) goto L2e
            long r6 = r10.stopDeadlineRemainingMs()
        L19:
            r0 = 10
            long r2 = r2 / r0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 + r0
            long r2 = r2 + r8
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient r0 = r10.client
            if (r0 == 0) goto L28
            long r4 = r0.pendingAudioMs()
        L28:
            long r2 = r2 + r4
            long r0 = java.lang.Math.min(r6, r2)
            return r0
        L2e:
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            goto L19
        L32:
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrAudioEncoding r1 = r10.audioEncoding
            com.facebook.aura.composer.dictation.voyager.VoyagerAsrAudioEncoding r0 = com.facebook.aura.composer.dictation.voyager.VoyagerAsrAudioEncoding.PCM_16KHZ
            if (r1 != r0) goto L41
            long r0 = r10.sessionStart()
            long r8 = r10.audioMsSince(r0)
            goto L11
        L41:
            boolean r0 = r10.isReplaying
            if (r0 == 0) goto Lf
            long r0 = r10.sessionStart()
            long r0 = r10.audioMsSince(r0)
            long r8 = X.BV6.A0I(r0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.VoyagerDictationEngine.stopResultTimeoutMs():long");
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public void cancel() {
        finish("cancelled", null, false, DictationOutcome.CANCELLED, null, false);
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public Map<String, String> captureMetadata() {
        Map<String, String> mapA0E;
        HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
        if (hatchDictationMicRecorder == null || (mapA0E = hatchDictationMicRecorder.captureMetadata()) == null) {
            mapA0E = AGH.A0E();
        }
        return AGH.A02(mapA0E, audioUploadMetadata());
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public boolean isFinalizing() {
        return this.isStopping.get();
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public float volumeDb() {
        HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
        if (hatchDictationMicRecorder != null) {
            return hatchDictationMicRecorder.lastRmsDb;
        }
        return -160.0f;
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public boolean wasMicSilenced() {
        HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
        return hatchDictationMicRecorder != null && hatchDictationMicRecorder.stats.silenced;
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public boolean wasUnreachable() {
        return this.endedUnreachable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoyagerDictationEngine(AbstractC3358CGz abstractC3358CGz, Context context, Function0<String> function0, Function0<Long> function02, Function0<? extends List<String>> function03, Function0<Boolean> function04, boolean z, Long l, Function0<Boolean> function05) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, context);
        AnonymousClass005.A16(function0, function02, function03, function04, 2);
        C7384Etj.A0Y(function05, 8);
        this.userSession = abstractC3358CGz;
        this.context = context;
        this.modelName = function0;
        this.endOfTurnSilenceMs = function02;
        this.languageBias = function03;
        this.isLowBandwidthLink = function04;
        this.retriesAutoSubmit = z;
        this.connectDeadlineMs = l;
        this.scope = C78W.A05(new C8eO(null), AuraDispatchers.INSTANCE.m764default());
        this.callbackScope = C78W.A05(new C8eO(null), AuraDispatchers.main);
        this.mode = DictationMode.MANUAL;
        this.clientSessionId = "";
        VoyagerAsrAudioEncoding voyagerAsrAudioEncodingPcmAudioEncoding = AnonymousClass003.A1Y(function05) ? VoyagerAsrAudioEncoding.OGG_OPUS : pcmAudioEncoding();
        this.initialAudioEncoding = voyagerAsrAudioEncodingPcmAudioEncoding;
        this.audioEncoding = voyagerAsrAudioEncodingPcmAudioEncoding;
        this.encodedAudioBytesSent = BV4.A14(0L);
        this.replayQueue = new AIG<>();
        this.transcript = "";
        this.started = BV4.A12(zA1b);
        this.isActive = BV4.A12(zA1b);
        this.isStopping = BV4.A12(zA1b);
        this.endpointFired = BV4.A12(zA1b);
        this.finished = BV4.A12(zA1b);
        this.hasPendingPartial = BV4.A12(zA1b);
        this.startedAtMs = BV4.A14(0L);
        this.networkAtStart = AuraNetworkState.Unknown.INSTANCE;
        this.captureEndedAtMs = BV4.A14(0L);
        this.firstPartialAtMs = BV4.A14(0L);
        this.partialCount = BV4.A13(zA1b ? 1 : 0);
        this.maxNonemptyPartialCharacters = BV4.A13(zA1b ? 1 : 0);
        this.audioBytes = BV4.A14(0L);
        this.droppedAudioBytes = BV4.A14(0L);
        this.preAckDroppedAudioBytes = BV4.A14(0L);
    }

    private final boolean isRetryable(VoyagerAsrResult voyagerAsrResult) {
        if (isTransportFailure(voyagerAsrResult)) {
            return true;
        }
        if (voyagerAsrResult.outcome != DictationOutcome.FAILED) {
            return false;
        }
        Set<String> set = RETRYABLE_SERVER_ERRORS;
        VoyagerAsrServerError voyagerAsrServerError = voyagerAsrResult.serverError;
        return AbstractC0878AGe.A0k(set, voyagerAsrServerError != null ? voyagerAsrServerError.message : null);
    }

    private final boolean replayFitsStopDeadline(long j, long j2) {
        return AnonymousClass002.A1N((stopDeadlineRemainingMs() > (j + BV6.A0I(audioMsSince(j2))) ? 1 : (stopDeadlineRemainingMs() == (j + BV6.A0I(audioMsSince(j2))) ? 0 : -1)));
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public /* bridge */ float waveformVolumeDb() {
        return volumeDb();
    }
}
