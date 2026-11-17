package com.facebook.aura.composer.dictation.audio;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV7;
import X.C06H;
import X.C0924AIa;
import X.C10533Hqc;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.Ey9;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzS;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.SystemClock;
import com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder;
import com.facebook.aura.executors.AuraExecutors;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchDictationMicRecorder {
    public static final int AUDIO_FORMAT = 2;
    public static final int CHANNEL_CONFIG = 16;
    public static final int CHUNK_DURATION_MS = 20;
    public static final Companion Companion = new Companion();
    public static final float MAX_INT16_AMPLITUDE = 32768.0f;
    public static final int MIC_BUFFER_DURATION_MS = 500;
    public static final int MIC_START_MAX_ATTEMPTS = 3;
    public static final long MIC_START_RETRY_DELAY_MS = 250;
    public static final int MIN_CONSECUTIVE_SPEECH_CHUNKS = 5;
    public static final long NANOS_PER_MS = 1000000;
    public static final int PCM_BYTES_PER_SAMPLE = 2;
    public static final float SPEECH_RMS_THRESHOLD_DB = -40.0f;
    public static final long STOP_COMPLETION_TIMEOUT_MS = 1000;
    public static final String TAG = "HatchDictationMicRecorder";
    public static final Executor micLane;
    public final AtomicBoolean active;
    public boolean audioFocusGranted;
    public final AudioFocusRequest audioFocusRequest;
    public final AudioManager audioManager;
    public final AtomicBoolean captureStarted;
    public int consecutiveSpeechChunks;
    public volatile long lastAudibleAtMs;
    public volatile float lastRmsDb;
    public Function0<Unit> onAudioFocusLost;
    public volatile Function0<Unit> onCaptureStarted;
    public Function0<Unit> onError;
    public final G0U<byte[], Unit> onPcmChunk;
    public HoC readJob;
    public final HatchDictationMicRecorder$recordingCallback$1 recordingCallback;
    public final int sampleRateHz;
    public C3UX scope;
    public volatile RecorderSession session;
    public final AtomicBoolean speechDetected;
    public volatile CaptureStats stats;
    public final List<Function0<Unit>> stopCallbacks;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AudioFocusState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AudioFocusState[] $VALUES;
        public static final AudioFocusState DENIED;
        public static final AudioFocusState GRANTED;
        public static final AudioFocusState NOT_REQUESTED;
        public static final AudioFocusState PERMANENT_LOSS;
        public static final AudioFocusState TRANSIENT_LOSS;

        static {
            AudioFocusState audioFocusState = new AudioFocusState("NOT_REQUESTED", 0);
            NOT_REQUESTED = audioFocusState;
            AudioFocusState audioFocusState2 = new AudioFocusState("GRANTED", 1);
            GRANTED = audioFocusState2;
            AudioFocusState audioFocusState3 = new AudioFocusState("DENIED", 2);
            DENIED = audioFocusState3;
            AudioFocusState audioFocusState4 = new AudioFocusState("TRANSIENT_LOSS", 3);
            TRANSIENT_LOSS = audioFocusState4;
            AudioFocusState audioFocusState5 = new AudioFocusState("PERMANENT_LOSS", 4);
            PERMANENT_LOSS = audioFocusState5;
            AudioFocusState[] audioFocusStateArr = {audioFocusState, audioFocusState2, audioFocusState3, audioFocusState4, audioFocusState5};
            $VALUES = audioFocusStateArr;
            $ENTRIES = C3cG.A0w(audioFocusStateArr);
        }

        public static Ey9<AudioFocusState> getEntries() {
            return $ENTRIES;
        }

        public static AudioFocusState valueOf(String str) {
            return (AudioFocusState) Enum.valueOf(AudioFocusState.class, str);
        }

        public static AudioFocusState[] values() {
            return (AudioFocusState[]) $VALUES.clone();
        }

        public AudioFocusState(String str, int i) {
        }
    }

    public final class CaptureStats {
        public volatile AudioFocusState audioFocus = AudioFocusState.NOT_REQUESTED;
        public volatile int audioSessionId;
        public volatile int bufferMs;
        public volatile long bytesAfterFirstRead;
        public volatile long captureEndedAtNanos;
        public volatile long firstReadAtNanos;
        public volatile long lastReadAtNanos;
        public volatile long maxReadGapNanos;
        public volatile boolean silenced;
        public volatile int startAttempts;
        public final long startedAtNanos;

        public final synchronized long audioDeficitMs(int i) {
            long j;
            long j2;
            j = this.captureEndedAtNanos;
            if (j <= 0) {
                j = this.lastReadAtNanos;
            }
            j2 = (this.bytesAfterFirstRead * 1000) / (i * 2);
            int i2 = HatchDictationMicRecorder.AUDIO_FORMAT;
            return BV4.A05(j - this.firstReadAtNanos) - j2;
        }

        public final synchronized void raiseAudioFocus(AudioFocusState audioFocusState) {
            C7384Etj.A0Y(audioFocusState, 0);
            if (audioFocusState.compareTo(this.audioFocus) > 0) {
                this.audioFocus = audioFocusState;
            }
        }

        public final synchronized void recordRead(int i, boolean z) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (this.firstReadAtNanos == 0) {
                this.firstReadAtNanos = jElapsedRealtimeNanos;
            } else {
                this.bytesAfterFirstRead += i;
                long j = jElapsedRealtimeNanos - this.lastReadAtNanos;
                if (!z && j > this.maxReadGapNanos) {
                    if (j > this.bufferMs * 1000000 && this.maxReadGapNanos <= this.bufferMs * 1000000) {
                        int i2 = HatchDictationMicRecorder.AUDIO_FORMAT;
                        CFK.A0H(HatchDictationMicRecorder.TAG, "read gap %d ms exceeded the %d ms buffer; audio may have been dropped", Long.valueOf(j / 1000000), Integer.valueOf(this.bufferMs));
                    }
                    this.maxReadGapNanos = j;
                }
            }
            this.lastReadAtNanos = jElapsedRealtimeNanos;
        }

        public final void setAudioFocus(AudioFocusState audioFocusState) {
            C7384Etj.A0Y(audioFocusState, 0);
            this.audioFocus = audioFocusState;
        }

        public final AudioFocusState getAudioFocus() {
            return this.audioFocus;
        }

        public final int getAudioSessionId() {
            return this.audioSessionId;
        }

        public final int getBufferMs() {
            return this.bufferMs;
        }

        public final long getBytesAfterFirstRead() {
            return this.bytesAfterFirstRead;
        }

        public final long getCaptureEndedAtNanos() {
            return this.captureEndedAtNanos;
        }

        public final long getFirstReadAtNanos() {
            return this.firstReadAtNanos;
        }

        public final long getLastReadAtNanos() {
            return this.lastReadAtNanos;
        }

        public final long getMaxReadGapNanos() {
            return this.maxReadGapNanos;
        }

        public final boolean getSilenced() {
            return this.silenced;
        }

        public final int getStartAttempts() {
            return this.startAttempts;
        }

        public final long getStartedAtNanos() {
            return this.startedAtNanos;
        }

        public CaptureStats(long j) {
            this.startedAtNanos = j;
        }

        public final void setAudioSessionId(int i) {
            this.audioSessionId = i;
        }

        public final void setBufferMs(int i) {
            this.bufferMs = i;
        }

        public final void setBytesAfterFirstRead(long j) {
            this.bytesAfterFirstRead = j;
        }

        public final void setCaptureEndedAtNanos(long j) {
            this.captureEndedAtNanos = j;
        }

        public final void setFirstReadAtNanos(long j) {
            this.firstReadAtNanos = j;
        }

        public final void setLastReadAtNanos(long j) {
            this.lastReadAtNanos = j;
        }

        public final void setMaxReadGapNanos(long j) {
            this.maxReadGapNanos = j;
        }

        public final void setSilenced(boolean z) {
            this.silenced = z;
        }

        public final void setStartAttempts(int i) {
            this.startAttempts = i;
        }
    }

    public final class Companion {
        public static final /* synthetic */ int access$bytesForDuration(Companion companion, int i, int i2) {
            return ((i * 2) * i2) / 1000;
        }

        private final int bytesForDuration(int i, int i2) {
            return ((i * 2) * i2) / 1000;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final long nanosToMs(long j) {
            return BV4.A05(j);
        }

        public Companion() {
        }
    }

    public final class RecorderSession {
        public final AudioRecord recorder;
        public final AtomicBoolean released;
        public final CaptureStats stats;
        public final CountDownLatch stopCompleted;
        public final AtomicBoolean stopped;

        public RecorderSession(AudioRecord audioRecord, CaptureStats captureStats) {
            boolean zA1a = AnonymousClass002.A1a(audioRecord, captureStats);
            this.recorder = audioRecord;
            this.stats = captureStats;
            this.released = BV4.A12(false);
            this.stopped = BV4.A12(false);
            this.stopCompleted = new CountDownLatch(zA1a ? 1 : 0);
        }

        public final boolean awaitStopCompletion() {
            return this.stopCompleted.await(1000L, TimeUnit.MILLISECONDS);
        }

        public final void release() {
            if (C3cI.A1W(this.released)) {
                this.recorder.release();
            }
        }

        public final void stop() {
            if (C3cI.A1W(this.stopped)) {
                try {
                    try {
                        if (this.recorder.getRecordingState() == 3) {
                            this.recorder.stop();
                        }
                        this.stats.captureEndedAtNanos = SystemClock.elapsedRealtimeNanos();
                    } catch (IllegalStateException e) {
                        CFK.A08(HatchDictationMicRecorder.TAG, "failed to stop recording", e);
                    }
                } finally {
                    this.stopCompleted.countDown();
                }
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder$attemptStart$1", f = "HatchDictationMicRecorder.kt", l = {187}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder$attemptStart$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ CaptureStats $captureStats;
        public final /* synthetic */ int $chunkBytes;
        public final /* synthetic */ AudioRecord $recorder;
        public final /* synthetic */ RecorderSession $recorderSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AudioRecord audioRecord, RecorderSession recorderSession, int i, CaptureStats captureStats, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$recorder = audioRecord;
            this.$recorderSession = recorderSession;
            this.$chunkBytes = i;
            this.$captureStats = captureStats;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDictationMicRecorder.this.new AnonymousClass1(this.$recorder, this.$recorderSession, this.$chunkBytes, this.$captureStats, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                try {
                    try {
                        if (i == 0) {
                            Hwg.A00(obj);
                            HatchDictationMicRecorder hatchDictationMicRecorder = HatchDictationMicRecorder.this;
                            AudioRecord audioRecord = this.$recorder;
                            RecorderSession recorderSession = this.$recorderSession;
                            int i2 = this.$chunkBytes;
                            CaptureStats captureStats = this.$captureStats;
                            this.label = 1;
                            hatchDictationMicRecorder.readLoop(audioRecord, recorderSession, i2, captureStats, this);
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                        }
                    } catch (Exception e) {
                        CFK.A08(HatchDictationMicRecorder.TAG, "read loop failed", e);
                    }
                    HatchDictationMicRecorder.this.onReadLoopEnded(this.$recorderSession);
                    return Unit.INSTANCE;
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                HatchDictationMicRecorder.this.onReadLoopEnded(this.$recorderSession);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder$scheduleStartRetry$1", f = "HatchDictationMicRecorder.kt", l = {157}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder$scheduleStartRetry$1, reason: invalid class name and case insensitive filesystem */
    public final class C111551 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $attempt;
        public final /* synthetic */ int $bufferSize;
        public final /* synthetic */ CaptureStats $captureStats;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111551(int i, int i2, CaptureStats captureStats, HtJ<? super C111551> htJ) {
            super(2, htJ);
            this.$attempt = i;
            this.$bufferSize = i2;
            this.$captureStats = captureStats;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDictationMicRecorder.this.new C111551(this.$attempt, this.$bufferSize, this.$captureStats, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(250L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDictationMicRecorder hatchDictationMicRecorder = HatchDictationMicRecorder.this;
            int i2 = this.$bufferSize;
            CaptureStats captureStats = this.$captureStats;
            int i3 = this.$attempt;
            synchronized (hatchDictationMicRecorder) {
                int i4 = HatchDictationMicRecorder.AUDIO_FORMAT;
                if (!hatchDictationMicRecorder.active.get() || hatchDictationMicRecorder.attemptStart(i2, captureStats, i3)) {
                    unit = Unit.INSTANCE;
                } else {
                    if (i3 >= 3) {
                        hatchDictationMicRecorder.active.set(false);
                        hatchDictationMicRecorder.audioManager.unregisterAudioRecordingCallback(hatchDictationMicRecorder.recordingCallback);
                        hatchDictationMicRecorder.abandonAudioFocus();
                        CFK.A0F(HatchDictationMicRecorder.TAG, "start: giving up after %d attempts", C3cG.A0R(this.$attempt));
                        Function0<Unit> function0 = HatchDictationMicRecorder.this.onError;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    hatchDictationMicRecorder.scheduleStartRetry(i2, captureStats, i3 + 1);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111551) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder$recordingCallback$1] */
    public HatchDictationMicRecorder(Context context, int i, G0U<? super byte[], Unit> g0u) {
        int iA0C = AnonymousClass002.A0C(context, g0u, 0);
        this.sampleRateHz = i;
        this.onPcmChunk = g0u;
        this.scope = C78W.A03();
        this.stopCallbacks = C3cG.A0h();
        this.active = BV4.A12(false);
        this.speechDetected = BV4.A12(false);
        this.captureStarted = BV4.A12(false);
        this.lastRmsDb = -160.0f;
        this.stats = new CaptureStats(0L);
        Object systemService = context.getSystemService("audio");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(iA0C).setContentType(1).build()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder$audioFocusRequest$1
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i2) {
                this.this$0.onAudioFocusChange(i2);
            }
        }).build();
        C7384Etj.A0U(audioFocusRequestBuild);
        this.audioFocusRequest = audioFocusRequestBuild;
        this.recordingCallback = new AudioManager.AudioRecordingCallback() { // from class: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder$recordingCallback$1
            @Override // android.media.AudioManager.AudioRecordingCallback
            public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
                C7384Etj.A0Y(list, 0);
                HatchDictationMicRecorder hatchDictationMicRecorder = this.this$0;
                int i2 = HatchDictationMicRecorder.AUDIO_FORMAT;
                HatchDictationMicRecorder.CaptureStats captureStats = hatchDictationMicRecorder.stats;
                if (captureStats.silenced || captureStats.audioSessionId == 0) {
                    return;
                }
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                    if (audioRecordingConfiguration.getClientAudioSessionId() == captureStats.audioSessionId && audioRecordingConfiguration.isClientSilenced()) {
                        captureStats.silenced = true;
                        CFK.A06(HatchDictationMicRecorder.TAG, "capture silenced by the system");
                        return;
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void abandonAudioFocus() {
        if (this.audioFocusGranted) {
            this.audioManager.abandonAudioFocusRequest(this.audioFocusRequest);
            this.audioFocusGranted = false;
        }
    }

    private final void completeStop() {
        List listA0X;
        C3UX c3ux;
        synchronized (this) {
            this.session = null;
            this.readJob = null;
            this.lastRmsDb = -160.0f;
            this.active.set(false);
            listA0X = AbstractC0878AGe.A0X(this.stopCallbacks);
            this.stopCallbacks.clear();
            c3ux = this.scope;
        }
        this.audioManager.unregisterAudioRecordingCallback(this.recordingCallback);
        abandonAudioFocus();
        try {
            Iterator it = listA0X.iterator();
            while (it.hasNext()) {
                BV7.A1M(it);
            }
        } finally {
            Hxb.A03(null, c3ux);
        }
    }

    private final float computeRmsDb(byte[] bArr) {
        int length = bArr.length / 2;
        if (length == 0) {
            return -160.0f;
        }
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        double d = 0.0d;
        for (int i = 0; i < length; i++) {
            double d2 = shortBufferAsShortBuffer.get(i);
            d += d2 * d2;
        }
        double dSqrt = Math.sqrt(d / length);
        if (dSqrt > 0.0d) {
            return (float) (Math.log10(dSqrt / 32768.0d) * 20.0d);
        }
        return -160.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void markAudioFocusRevoked() {
        this.audioFocusGranted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioFocusChange(int i) {
        if (i == -3 || i == -2) {
            this.stats.raiseAudioFocus(AudioFocusState.TRANSIENT_LOSS);
        } else if (i == -1) {
            this.stats.raiseAudioFocus(AudioFocusState.PERMANENT_LOSS);
            micLane.execute(new Runnable() { // from class: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder.onAudioFocusChange.1
                @Override // java.lang.Runnable
                public final void run() {
                    HatchDictationMicRecorder.this.markAudioFocusRevoked();
                }
            });
            F0C.A00().post(new Runnable() { // from class: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder.onAudioFocusChange.2
                @Override // java.lang.Runnable
                public final void run() {
                    HatchDictationMicRecorder hatchDictationMicRecorder = HatchDictationMicRecorder.this;
                    int i2 = HatchDictationMicRecorder.AUDIO_FORMAT;
                    if (hatchDictationMicRecorder.active.get()) {
                        CFK.A06(HatchDictationMicRecorder.TAG, "onAudioFocusChange: permanent focus loss, stopping dictation");
                        Function0<Unit> function0 = HatchDictationMicRecorder.this.onAudioFocusLost;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }
            });
        }
    }

    private final synchronized void requestAudioFocus() {
        if (!this.audioFocusGranted) {
            boolean zA1Q = BV7.A1Q(this.audioManager.requestAudioFocus(this.audioFocusRequest));
            this.audioFocusGranted = zA1Q;
            if (!zA1Q) {
                CFK.A06(TAG, "requestAudioFocus: denied, playback will not pause for this dictation");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleStartRetry(int i, CaptureStats captureStats, int i2) {
        AnonymousClass001.A1J(new C111551(i2, i, captureStats, null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCapture(Function0<Unit> function0) {
        boolean z;
        boolean z2;
        RecorderSession recorderSession;
        synchronized (this) {
            z = false;
            z2 = true;
            if (this.active.getAndSet(false)) {
                if (function0 != null) {
                    this.stopCallbacks.add(function0);
                }
                recorderSession = this.session;
            } else {
                if (this.session != null) {
                    z2 = false;
                    if (function0 != null) {
                        this.stopCallbacks.add(function0);
                    }
                }
                recorderSession = null;
                z = z2;
                z2 = false;
            }
        }
        if (z) {
            if (function0 != null) {
                function0.invoke();
            }
        } else if (z2) {
            if (recorderSession == null) {
                completeStop();
            } else {
                recorderSession.stop();
            }
        }
    }

    static {
        int i = AuraExecutors.CORE_POOL_SIZE;
        micLane = new AuraExecutors.SerialExecutor(F0C.A05());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptStart(int i, CaptureStats captureStats, int i2) throws IllegalStateException {
        captureStats.startAttempts = i2;
        AudioRecord audioRecordCreateStartedRecorder = createStartedRecorder(i, captureStats, i2);
        if (audioRecordCreateStartedRecorder == null) {
            return false;
        }
        captureStats.bufferMs = (audioRecordCreateStartedRecorder.getBufferSizeInFrames() * 1000) / this.sampleRateHz;
        RecorderSession recorderSession = new RecorderSession(audioRecordCreateStartedRecorder, captureStats);
        this.session = recorderSession;
        int i3 = ((this.sampleRateHz * 2) * 20) / 1000;
        C3UX c3ux = this.scope;
        C10533Hqc c10533HqcA02 = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass1(audioRecordCreateStartedRecorder, recorderSession, i3, captureStats, null), c3ux);
        c10533HqcA02.AO5(new HatchDictationMicRecorder$attemptStart$2$1(recorderSession));
        this.readJob = c10533HqcA02;
        return true;
    }

    private final AudioRecord createStartedRecorder(int i, CaptureStats captureStats, int i2) throws IllegalStateException {
        String strA00;
        try {
            AudioRecord audioRecord = new AudioRecord(6, this.sampleRateHz, 16, 2, i);
            if (audioRecord.getState() != 1) {
                strA00 = "uninitialized";
            } else {
                captureStats.audioSessionId = audioRecord.getAudioSessionId();
                try {
                    audioRecord.startRecording();
                    if (audioRecord.getRecordingState() == 3) {
                        return audioRecord;
                    }
                    strA00 = "not_recording";
                } catch (IllegalStateException e) {
                    CFK.A0A(TAG, "start: startRecording failed", e);
                    strA00 = C3cF.A00(56);
                }
            }
            CFK.A0H(TAG, "start: attempt %d/%d failed (%s)", Integer.valueOf(i2), 3, strA00);
            captureStats.audioSessionId = 0;
            captureStats.silenced = false;
            audioRecord.release();
            return null;
        } catch (RuntimeException e2) {
            CFK.A0A(TAG, FGI.A0I("start: attempt ", i2, "/3 failed (constructor)"), e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readLoop(AudioRecord audioRecord, RecorderSession recorderSession, int i, CaptureStats captureStats, HtJ<? super Unit> htJ) {
        int i2;
        Function0<Unit> function0;
        byte[] bArr = new byte[i];
        while (true) {
            if (!HzS.A06(htJ.getContext())) {
                break;
            }
            boolean z = this.active.get();
            boolean z2 = !z;
            if (!z && !recorderSession.awaitStopCompletion()) {
                CFK.A06(TAG, "Timed out waiting for AudioRecord.stop()");
                break;
            }
            try {
                i2 = audioRecord.read(bArr, 0, i, z2 ? 1 : 0);
            } catch (IllegalStateException e) {
                if (this.active.get()) {
                    CFK.A08(TAG, "read failed on AudioRecord", e);
                    Function0<Unit> function02 = this.onError;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i2 < 0) {
                if (this.active.get()) {
                    CFK.A04(TAG, FGI.A0H("read error: ", i2));
                    break;
                }
            } else if (i2 != 0) {
                captureStats.recordRead(i2, z2);
                if (z && BV4.A1V(this.captureStarted) && (function0 = this.onCaptureStarted) != null) {
                    function0.invoke();
                }
                byte[] bArrCopyOf = i2 == i ? Arrays.copyOf(bArr, i) : Arrays.copyOf(bArr, i2);
                C7384Etj.A0U(bArrCopyOf);
                this.lastRmsDb = computeRmsDb(bArrCopyOf);
                updateSpeechDetection(this.lastRmsDb);
                this.onPcmChunk.invoke(bArrCopyOf);
            }
            if (!z) {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void stop$default(HatchDictationMicRecorder hatchDictationMicRecorder, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        hatchDictationMicRecorder.stop(function0);
    }

    private final void updateSpeechDetection(float f) {
        if (f > -40.0f) {
            this.lastAudibleAtMs = SystemClock.elapsedRealtime();
        }
        if (this.speechDetected.get()) {
            return;
        }
        if (f <= -40.0f) {
            this.consecutiveSpeechChunks = 0;
            return;
        }
        int i = this.consecutiveSpeechChunks + 1;
        this.consecutiveSpeechChunks = i;
        if (i >= 5) {
            this.speechDetected.set(true);
        }
    }

    public final Map<String, String> captureMetadata() {
        CaptureStats captureStats = this.stats;
        if (captureStats.startedAtNanos == 0) {
            return AGH.A0E();
        }
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("mic_start_attempts", String.valueOf(captureStats.startAttempts));
        c0924AIa.put("mic_buffer_ms", String.valueOf(captureStats.bufferMs));
        c0924AIa.put("mic_audio_focus", AnonymousClass006.A0x(captureStats.audioFocus));
        c0924AIa.put("mic_silenced", String.valueOf(captureStats.silenced));
        long j = captureStats.firstReadAtNanos;
        if (j != 0) {
            c0924AIa.put("mic_start_ms", String.valueOf((j - captureStats.startedAtNanos) / 1000000));
            c0924AIa.put("mic_max_read_gap_ms", String.valueOf(captureStats.maxReadGapNanos / 1000000));
            c0924AIa.put("mic_audio_deficit_ms", String.valueOf(captureStats.audioDeficitMs(this.sampleRateHz)));
        }
        return AIW.A0K(c0924AIa);
    }

    public final long getLastAudibleAtMs() {
        return this.lastAudibleAtMs;
    }

    public final Function0<Unit> getOnAudioFocusLost() {
        return this.onAudioFocusLost;
    }

    public final Function0<Unit> getOnCaptureStarted() {
        return this.onCaptureStarted;
    }

    public final Function0<Unit> getOnError() {
        return this.onError;
    }

    public final float getVolume() {
        return this.lastRmsDb;
    }

    public final boolean hasDetectedSpeech() {
        return this.speechDetected.get();
    }

    public final boolean isAudible() {
        return AnonymousClass002.A1N((this.lastRmsDb > (-40.0f) ? 1 : (this.lastRmsDb == (-40.0f) ? 0 : -1)));
    }

    public final void stop(final Function0<Unit> function0) {
        micLane.execute(new Runnable() { // from class: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder.stop.1
            @Override // java.lang.Runnable
            public final void run() {
                HatchDictationMicRecorder.this.stopCapture(function0);
            }
        });
    }

    public final boolean wasSilenced() {
        return this.stats.silenced;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReadLoopEnded(RecorderSession recorderSession) {
        RecorderSession recorderSession2;
        recorderSession.stop();
        synchronized (this) {
            recorderSession2 = this.session;
        }
        if (recorderSession2 == recorderSession) {
            completeStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void startCapture(long j) {
        if (this.active.compareAndSet(false, true)) {
            CaptureStats captureStats = new CaptureStats(j);
            this.stats = captureStats;
            int minBufferSize = AudioRecord.getMinBufferSize(this.sampleRateHz, 16, 2);
            if (minBufferSize <= 0) {
                CFK.A04(TAG, FGI.A0H("start: invalid min buffer size ", minBufferSize));
                this.active.set(false);
                Function0<Unit> function0 = this.onError;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                int iMax = Math.max(minBufferSize, ((this.sampleRateHz * 2) * 500) / 1000);
                this.scope = C78W.A03();
                this.lastRmsDb = -160.0f;
                this.lastAudibleAtMs = 0L;
                this.speechDetected.set(false);
                this.consecutiveSpeechChunks = 0;
                requestAudioFocus();
                captureStats.raiseAudioFocus(this.audioFocusGranted ? AudioFocusState.GRANTED : AudioFocusState.DENIED);
                this.audioManager.registerAudioRecordingCallback(this.recordingCallback, F0C.A00());
                if (!attemptStart(iMax, captureStats, 1)) {
                    scheduleStartRetry(iMax, captureStats, 2);
                }
            }
        }
    }

    public final void setOnAudioFocusLost(Function0<Unit> function0) {
        this.onAudioFocusLost = function0;
    }

    public final void setOnCaptureStarted(Function0<Unit> function0) {
        this.onCaptureStarted = function0;
    }

    public final void setOnError(Function0<Unit> function0) {
        this.onError = function0;
    }

    public final void start() {
        final long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        micLane.execute(new Runnable() { // from class: com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder.start.1
            @Override // java.lang.Runnable
            public final void run() {
                HatchDictationMicRecorder.this.startCapture(jElapsedRealtimeNanos);
            }
        });
    }
}
