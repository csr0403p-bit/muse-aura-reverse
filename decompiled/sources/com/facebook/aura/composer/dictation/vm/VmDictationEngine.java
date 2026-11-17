package com.facebook.aura.composer.dictation.vm;

import X.AGH;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C7438Evz;
import X.C7BY;
import X.CFK;
import X.F0C;
import android.content.Context;
import com.facebook.aura.composer.dictation.audio.HatchDictationMicRecorder;
import com.facebook.aura.composer.dictation.engine.DictationEngine;
import com.facebook.aura.composer.dictation.engine.DictationEngineListener;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.dictation.engine.DictationOutcomeKt;
import com.facebook.aura.composer.dictation.engine.DictationRequest;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class VmDictationEngine implements DictationEngine {
    public static final long BASE_FINALIZATION_TIMEOUT_MS = 10000;
    public static final long BYTES_PER_AUDIO_SECOND = 48000;
    public static final Companion Companion = new Companion();
    public static final long MAX_FINALIZATION_TIMEOUT_MS = 120000;
    public static final String TAG = "VmDictationEngine";
    public final AtomicLong audioBytes;
    public VmDictationClient client;
    public volatile String clientSessionId;
    public final Context context;
    public final AtomicBoolean finalReceived;
    public final AtomicBoolean finished;
    public final AtomicBoolean hasPendingPartial;
    public final AtomicBoolean isActive;
    public final AtomicBoolean isStopping;
    public volatile DictationEngineListener listener;
    public volatile HatchDictationMicRecorder recorder;
    public final AtomicBoolean started;
    public Runnable stopTimeout;
    public final AbstractC3358CGz userSession;

    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationEngine$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C111631 extends AbstractC7559F3s implements Function0<Unit> {
        public C111631() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VmDictationEngine.this.stop();
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationEngine$start$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VmDictationEngine.this.finish(DictationOutcome.FAILED, "audio_capture_failure");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationEngine$start$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ DictationEngineListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DictationEngineListener dictationEngineListener) {
            super(0);
            this.$listener = dictationEngineListener;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (VmDictationEngine.this.finished.get()) {
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

    /* renamed from: com.facebook.aura.composer.dictation.vm.VmDictationEngine$stop$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C111641 extends C7438Evz implements Function0<Unit> {
        public C111641(Object obj) {
            super(0, obj, VmDictationEngine.class, "endAudio", "endAudio()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((VmDictationEngine) this.receiver).endAudio();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void endAudio() {
        VmDictationClient vmDictationClient = this.client;
        if (vmDictationClient != null) {
            vmDictationClient.endAudio();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finish(DictationOutcome dictationOutcome, String str) {
        synchronized (this) {
            boolean z = false;
            if (this.finished.compareAndSet(false, true)) {
                boolean z2 = this.isStopping.get();
                this.isActive.set(false);
                this.isStopping.set(false);
                Runnable runnable = this.stopTimeout;
                if (runnable != null) {
                    F0C.A00().removeCallbacks(runnable);
                }
                this.stopTimeout = null;
                VmDictationClient vmDictationClient = this.client;
                if (vmDictationClient != null) {
                    vmDictationClient.cancel();
                }
                this.client = null;
                CFK.A01(this.clientSessionId, dictationOutcome, str, TAG, "finish: session=%s outcome=%s terminal_reason=%s");
                boolean z3 = this.hasPendingPartial.get();
                boolean z4 = this.finalReceived.get();
                HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
                if (hatchDictationMicRecorder != null && hatchDictationMicRecorder.speechDetected.get()) {
                    z = true;
                }
                final DictationOutcome dictationOutcomeResolveStopOutcome = DictationOutcomeKt.resolveStopOutcome(dictationOutcome, z2, z3, z4, z);
                HatchDictationMicRecorder hatchDictationMicRecorder2 = this.recorder;
                if (hatchDictationMicRecorder2 != null) {
                    int i = HatchDictationMicRecorder.AUDIO_FORMAT;
                    hatchDictationMicRecorder2.stop(null);
                }
                F0C.A00().post(new Runnable() { // from class: com.facebook.aura.composer.dictation.vm.VmDictationEngine.finish.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DictationEngineListener dictationEngineListener = VmDictationEngine.this.listener;
                        if (dictationEngineListener != null) {
                            dictationEngineListener.onStopped(dictationOutcomeResolveStopOutcome);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTranscript(String str, boolean z) {
        synchronized (this) {
            if (this.finished.get()) {
                return;
            }
            if (z) {
                this.finalReceived.set(true);
                this.hasPendingPartial.set(false);
            } else if (!C7BY.A0j(str)) {
                this.hasPendingPartial.set(true);
            }
            DictationEngineListener dictationEngineListener = this.listener;
            if (dictationEngineListener != null) {
                dictationEngineListener.onTranscript(str, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void routePcm(byte[] bArr) {
        VmDictationClient vmDictationClient;
        synchronized (this) {
            this.audioBytes.addAndGet(bArr.length);
            vmDictationClient = this.client;
        }
        if (vmDictationClient != null) {
            vmDictationClient.appendPcm(bArr);
        }
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public synchronized void start(DictationRequest dictationRequest, DictationEngineListener dictationEngineListener) {
        boolean zA1a = AnonymousClass002.A1a(dictationRequest, dictationEngineListener);
        if (this.started.compareAndSet(false, zA1a)) {
            this.listener = dictationEngineListener;
            this.clientSessionId = dictationRequest.clientSessionId;
            this.isActive.set(zA1a);
            int i = HatchDictationMicRecorder.AUDIO_FORMAT;
            HatchDictationMicRecorder hatchDictationMicRecorder = new HatchDictationMicRecorder(this.context, 24000, new VmDictationEngine$start$micRecorder$1(this));
            hatchDictationMicRecorder.onAudioFocusLost = new C111631();
            hatchDictationMicRecorder.onError = new AnonymousClass2();
            hatchDictationMicRecorder.onCaptureStarted = new AnonymousClass3(dictationEngineListener);
            this.recorder = hatchDictationMicRecorder;
            VmDictationClient vmDictationClient = new VmDictationClient(this.userSession);
            vmDictationClient.onPartial = new VmDictationEngine$start$vmClient$1$1(this);
            vmDictationClient.onFinal = new VmDictationEngine$start$vmClient$1$2(this);
            vmDictationClient.onClosed = new VmDictationEngine$start$vmClient$1$3(this);
            this.client = vmDictationClient;
            vmDictationClient.start();
            hatchDictationMicRecorder.start();
        } else {
            CFK.A06(TAG, "start: engine instances are single-use, skipping");
        }
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public synchronized void stop() {
        if (this.isActive.compareAndSet(true, false)) {
            this.isStopping.set(true);
            Runnable runnable = new Runnable() { // from class: com.facebook.aura.composer.dictation.vm.VmDictationEngine$stop$timeout$1
                @Override // java.lang.Runnable
                public final void run() {
                    CFK.A06(VmDictationEngine.TAG, "stop: no final transcript within timeout");
                    this.this$0.finish(DictationOutcome.FAILED, "finalization_timeout");
                }
            };
            this.stopTimeout = runnable;
            F0C.A00().postDelayed(runnable, stopResultTimeoutMs());
            HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
            if (hatchDictationMicRecorder != null) {
                hatchDictationMicRecorder.stop(new C111641(this));
            } else {
                endAudio();
            }
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final long stopResultTimeoutMs() {
        return Math.min(120000L, (((this.audioBytes.get() * 1000) / 48000) / 10) + 10000);
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public void cancel() {
        finish(DictationOutcome.CANCELLED, "cancelled");
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public Map<String, String> captureMetadata() {
        Map<String, String> mapCaptureMetadata;
        HatchDictationMicRecorder hatchDictationMicRecorder = this.recorder;
        return (hatchDictationMicRecorder == null || (mapCaptureMetadata = hatchDictationMicRecorder.captureMetadata()) == null) ? AGH.A0E() : mapCaptureMetadata;
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
    public /* bridge */ boolean wasUnreachable() {
        return false;
    }

    public VmDictationEngine(AbstractC3358CGz abstractC3358CGz, Context context) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, context);
        this.userSession = abstractC3358CGz;
        this.context = context;
        this.clientSessionId = "";
        this.started = BV4.A12(zA1b);
        this.isActive = BV4.A12(zA1b);
        this.isStopping = BV4.A12(zA1b);
        this.finished = BV4.A12(zA1b);
        this.hasPendingPartial = BV4.A12(zA1b);
        this.finalReceived = BV4.A12(zA1b);
        this.audioBytes = BV5.A19();
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public /* bridge */ float waveformVolumeDb() {
        return volumeDb();
    }
}
