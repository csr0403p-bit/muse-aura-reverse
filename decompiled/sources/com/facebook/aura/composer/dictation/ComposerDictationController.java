package com.facebook.aura.composer.dictation;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.BV4;
import X.C06H;
import X.C10543Hqv;
import X.C1BN;
import X.C3Es;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.F0C;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.composer.dictation.HatchVoiceDictationService;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.microphone.api.Microphone;
import com.facebook.aura.microphone.api.MicrophoneClaim;
import com.facebook.aura.microphone.api.MicrophonePriority;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ComposerDictationController {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long MIN_DICTATION_CAPTURE_MS = 750;
    public static final long SILENCE_FALLBACK_EXTRA_MS = 1000;
    public static final float SPEECH_RMS_THRESHOLD_DB = -40.0f;
    public final BLG<Boolean> _isActive;
    public final String analyticsSurface;
    public final AtomicBoolean autoSubmitFired;
    public final ConfidentialSessionGate cvmGate;
    public final DictationHost host;
    public final C1BN<Boolean> isActive;
    public final C1BN<Boolean> isConfidentialVm;
    public final boolean isOnDeviceSupported;
    public MicrophoneClaim microphoneClaim;
    public String preDictationComposerText;
    public final C3UX scope;
    public final VoiceDictationSessionLog sessionLog;
    public final AbstractC3358CGz userSession;
    public VoiceDictationKeyboardMerger voiceDictationKeyboardMerger;
    public final VoiceDictationSendRequest voiceDictationSendRequest;
    public HatchVoiceDictationService voiceDictationService;
    public final WaveformBuffer waveformBuffer;
    public HoC waveformGenerationJob;

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$claimMicrophone$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ C10543Hqv<MicrophoneClaim> $claim;
        public final /* synthetic */ G0U<DictationOutcome, Unit> $onStopped;

        @DebugMetadata(c = "com.facebook.aura.composer.dictation.ComposerDictationController$claimMicrophone$1$1", f = "ComposerDictationController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$claimMicrophone$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C10543Hqv<MicrophoneClaim> $claim;
            public final /* synthetic */ G0U<DictationOutcome, Unit> $onStopped;
            public int label;
            public final /* synthetic */ ComposerDictationController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00711(ComposerDictationController composerDictationController, C10543Hqv<MicrophoneClaim> c10543Hqv, G0U<? super DictationOutcome, Unit> g0u, HtJ<? super C00711> htJ) {
                super(2, htJ);
                this.this$0 = composerDictationController;
                this.$claim = c10543Hqv;
                this.$onStopped = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00711(this.this$0, this.$claim, this.$onStopped, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                ComposerDictationController composerDictationController = this.this$0;
                if (composerDictationController.microphoneClaim == this.$claim.element) {
                    composerDictationController.onMicrophonePreempted(this.$onStopped);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C00711) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C10543Hqv<MicrophoneClaim> c10543Hqv, G0U<? super DictationOutcome, Unit> g0u) {
            super(0);
            this.$claim = c10543Hqv;
            this.$onStopped = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComposerDictationController composerDictationController = ComposerDictationController.this;
            C3UX c3ux = composerDictationController.scope;
            GAo.A02(C79.A00, AuraDispatchers.main, new C00711(composerDictationController, this.$claim, this.$onStopped, null), c3ux);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$release$1, reason: invalid class name and case insensitive filesystem */
    public final class C111501 extends AbstractC7559F3s implements G0V<String, Boolean, Unit> {
        public final /* synthetic */ VoiceDictationKeyboardMerger $merger;
        public final /* synthetic */ G0U<String, Unit> $onLateTranscript;
        public final /* synthetic */ C10543Hqv<String> $text;

        public final void invoke(final String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            if (z) {
                Handler handlerA00 = F0C.A00();
                final C10543Hqv<String> c10543Hqv = this.$text;
                final VoiceDictationKeyboardMerger voiceDictationKeyboardMerger = this.$merger;
                final G0U<String, Unit> g0u = this.$onLateTranscript;
                handlerA00.post(new Runnable() { // from class: com.facebook.aura.composer.dictation.ComposerDictationController.release.1.1
                    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10543Hqv<String> c10543Hqv2 = c10543Hqv;
                        c10543Hqv2.element = voiceDictationKeyboardMerger.updateText(c10543Hqv2.element, str, true);
                        g0u.invoke(c10543Hqv.element);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C111501(C10543Hqv<String> c10543Hqv, VoiceDictationKeyboardMerger voiceDictationKeyboardMerger, G0U<? super String, Unit> g0u) {
            super(2);
            this.$text = c10543Hqv;
            this.$merger = voiceDictationKeyboardMerger;
            this.$onLateTranscript = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
            invoke(str, AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$release$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<DictationOutcome, Unit> {
        public final /* synthetic */ HatchVoiceDictationService $activeService;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final DictationOutcome dictationOutcome) {
            C7384Etj.A0Y(dictationOutcome, 0);
            Handler handlerA00 = F0C.A00();
            final ComposerDictationController composerDictationController = ComposerDictationController.this;
            final HatchVoiceDictationService hatchVoiceDictationService = this.$activeService;
            handlerA00.post(new Runnable() { // from class: com.facebook.aura.composer.dictation.ComposerDictationController.release.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    composerDictationController.sessionLog.logFinished(hatchVoiceDictationService, dictationOutcome, VoiceDictationFinishTrigger.STOPPED, new VoiceDictationSendResult(false, false), AGH.A0E());
                }
            });
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchVoiceDictationService hatchVoiceDictationService) {
            super(1);
            this.$activeService = hatchVoiceDictationService;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(DictationOutcome dictationOutcome) {
            invoke2(dictationOutcome);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$2, reason: invalid class name and case insensitive filesystem */
    public final class C111512 extends AbstractC7559F3s implements G0V<String, Boolean, Unit> {
        public final /* synthetic */ HatchVoiceDictationService $activeService;
        public final /* synthetic */ G0U<DictationOutcome, Unit> $onStopped;

        @DebugMetadata(c = "com.facebook.aura.composer.dictation.ComposerDictationController$start$2$1", f = "ComposerDictationController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchVoiceDictationService $activeService;
            public final /* synthetic */ boolean $isFinal;
            public final /* synthetic */ boolean $isFinalAfterSend;
            public final /* synthetic */ G0U<DictationOutcome, Unit> $onStopped;
            public final /* synthetic */ long $receivedAtMs;
            public final /* synthetic */ String $transcription;
            public int label;
            public final /* synthetic */ ComposerDictationController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(ComposerDictationController composerDictationController, HatchVoiceDictationService hatchVoiceDictationService, String str, long j, boolean z, boolean z2, G0U<? super DictationOutcome, Unit> g0u, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = composerDictationController;
                this.$activeService = hatchVoiceDictationService;
                this.$transcription = str;
                this.$receivedAtMs = j;
                this.$isFinal = z;
                this.$isFinalAfterSend = z2;
                this.$onStopped = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$activeService, this.$transcription, this.$receivedAtMs, this.$isFinal, this.$isFinalAfterSend, this.$onStopped, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                VoiceDictationKeyboardMerger voiceDictationKeyboardMerger;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                ComposerDictationController composerDictationController = this.this$0;
                if (composerDictationController.voiceDictationService == this.$activeService && (voiceDictationKeyboardMerger = composerDictationController.voiceDictationKeyboardMerger) != null) {
                    if (!C7BY.A0j(this.$transcription)) {
                        this.this$0.sessionLog.markTranscript(this.$receivedAtMs);
                    }
                    this.this$0.host.setComposerText(voiceDictationKeyboardMerger.updateText(this.this$0.host.getComposerText(), this.$transcription, this.$isFinal));
                    if (this.$isFinalAfterSend && this.this$0.voiceDictationSendRequest.isPending) {
                        this.this$0.completeVoiceDictation(this.$activeService, DictationOutcome.COMPLETED, this.$onStopped, VoiceDictationFinishTrigger.FINAL_AFTER_SEND);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(java.lang.String r12, boolean r13) {
            /*
                r11 = this;
                r0 = 0
                r6 = r12
                X.C7384Etj.A0Y(r12, r0)
                r9 = r13
                if (r13 == 0) goto L11
                com.facebook.aura.composer.dictation.ComposerDictationController r0 = com.facebook.aura.composer.dictation.ComposerDictationController.this
                com.facebook.aura.composer.dictation.VoiceDictationSendRequest r0 = r0.voiceDictationSendRequest
                boolean r0 = r0.isPending
                r10 = 1
                if (r0 != 0) goto L12
            L11:
                r10 = 0
            L12:
                long r7 = android.os.SystemClock.elapsedRealtime()
                com.facebook.aura.composer.dictation.ComposerDictationController r4 = com.facebook.aura.composer.dictation.ComposerDictationController.this
                X.3UX r2 = r4.scope
                X.GB9 r1 = com.facebook.aura.executors.AuraDispatchers.main
                com.facebook.aura.composer.dictation.HatchVoiceDictationService r5 = r11.$activeService
                X.G0U<com.facebook.aura.composer.dictation.engine.DictationOutcome, kotlin.Unit> r11 = r11.$onStopped
                r12 = 0
                com.facebook.aura.composer.dictation.ComposerDictationController$start$2$1 r3 = new com.facebook.aura.composer.dictation.ComposerDictationController$start$2$1
                r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12)
                java.lang.Integer r0 = X.C79.A00
                X.GAo.A02(r0, r1, r3, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.ComposerDictationController.C111512.invoke(java.lang.String, boolean):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C111512(HatchVoiceDictationService hatchVoiceDictationService, G0U<? super DictationOutcome, Unit> g0u) {
            super(2);
            this.$activeService = hatchVoiceDictationService;
            this.$onStopped = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
            invoke(str, AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<DictationOutcome, Unit> {
        public final /* synthetic */ HatchVoiceDictationService $activeService;
        public final /* synthetic */ G0U<DictationOutcome, Unit> $onStopped;

        @DebugMetadata(c = "com.facebook.aura.composer.dictation.ComposerDictationController$start$3$1", f = "ComposerDictationController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchVoiceDictationService $activeService;
            public final /* synthetic */ G0U<DictationOutcome, Unit> $onStopped;
            public final /* synthetic */ DictationOutcome $outcome;
            public int label;
            public final /* synthetic */ ComposerDictationController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(ComposerDictationController composerDictationController, HatchVoiceDictationService hatchVoiceDictationService, DictationOutcome dictationOutcome, G0U<? super DictationOutcome, Unit> g0u, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = composerDictationController;
                this.$activeService = hatchVoiceDictationService;
                this.$outcome = dictationOutcome;
                this.$onStopped = g0u;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$activeService, this.$outcome, this.$onStopped, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.this$0.completeVoiceDictation(this.$activeService, this.$outcome, this.$onStopped, VoiceDictationFinishTrigger.STOPPED);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DictationOutcome dictationOutcome) {
            C7384Etj.A0Y(dictationOutcome, 0);
            ComposerDictationController composerDictationController = ComposerDictationController.this;
            C3UX c3ux = composerDictationController.scope;
            GAo.A02(C79.A00, AuraDispatchers.main, new AnonymousClass1(composerDictationController, this.$activeService, dictationOutcome, this.$onStopped, null), c3ux);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchVoiceDictationService hatchVoiceDictationService, G0U<? super DictationOutcome, Unit> g0u) {
            super(1);
            this.$activeService = hatchVoiceDictationService;
            this.$onStopped = g0u;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(DictationOutcome dictationOutcome) {
            invoke2(dictationOutcome);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchVoiceDictationService $activeService;

        @DebugMetadata(c = "com.facebook.aura.composer.dictation.ComposerDictationController$start$4$1", f = "ComposerDictationController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchVoiceDictationService $activeService;
            public int label;
            public final /* synthetic */ ComposerDictationController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ComposerDictationController composerDictationController, HatchVoiceDictationService hatchVoiceDictationService, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = composerDictationController;
                this.$activeService = hatchVoiceDictationService;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$activeService, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                ComposerDictationController composerDictationController = this.this$0;
                if (composerDictationController.voiceDictationService == this.$activeService) {
                    composerDictationController.host.onCaptureStarted();
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchVoiceDictationService hatchVoiceDictationService) {
            super(0);
            this.$activeService = hatchVoiceDictationService;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComposerDictationController composerDictationController = ComposerDictationController.this;
            C3UX c3ux = composerDictationController.scope;
            GAo.A02(C79.A00, AuraDispatchers.main, new AnonymousClass1(composerDictationController, this.$activeService, null), c3ux);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public final /* synthetic */ HatchVoiceDictationService $activeService;

        @DebugMetadata(c = "com.facebook.aura.composer.dictation.ComposerDictationController$start$5$1", f = "ComposerDictationController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$5$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchVoiceDictationService $activeService;
            public final /* synthetic */ long $stoppedAtMs;
            public int label;
            public final /* synthetic */ ComposerDictationController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ComposerDictationController composerDictationController, HatchVoiceDictationService hatchVoiceDictationService, long j, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = composerDictationController;
                this.$activeService = hatchVoiceDictationService;
                this.$stoppedAtMs = j;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$activeService, this.$stoppedAtMs, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                ComposerDictationController composerDictationController = this.this$0;
                if (composerDictationController.voiceDictationService == this.$activeService) {
                    composerDictationController.sessionLog.markStopRequested(this.$stoppedAtMs);
                    composerDictationController.showProcessing();
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchVoiceDictationService hatchVoiceDictationService) {
            super(1);
            this.$activeService = hatchVoiceDictationService;
        }

        public final void invoke(long j) {
            ComposerDictationController composerDictationController = ComposerDictationController.this;
            C3UX c3ux = composerDictationController.scope;
            GAo.A02(C79.A00, AuraDispatchers.main, new AnonymousClass1(composerDictationController, this.$activeService, j, null), c3ux);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(C3cG.A05(l));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $fireAutoSubmit;

        @DebugMetadata(c = "com.facebook.aura.composer.dictation.ComposerDictationController$start$6$1", f = "ComposerDictationController.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$6$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ Function0<Unit> $fireAutoSubmit;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Function0<Unit> function0, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$fireAutoSubmit = function0;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$fireAutoSubmit, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.$fireAutoSubmit, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.$fireAutoSubmit.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0) {
            super(0);
            this.$fireAutoSubmit = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C3UX c3ux = ComposerDictationController.this.scope;
            GAo.A02(C79.A00, AuraDispatchers.mainImmediate, new AnonymousClass1(this.$fireAutoSubmit, null), c3ux);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.ComposerDictationController$start$7", f = "ComposerDictationController.kt", l = {207}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.ComposerDictationController$start$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $autoSubmitOnSilence;
        public final /* synthetic */ Function0<Unit> $fireAutoSubmit;
        public int I$0;
        public long J$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(boolean z, Function0<Unit> function0, HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
            this.$autoSubmitOnSilence = z;
            this.$fireAutoSubmit = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ComposerDictationController.this.new AnonymousClass7(this.$autoSubmitOnSilence, this.$fireAutoSubmit, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        
            if (r6 != 0) goto L17;
         */
        /* JADX WARN: Path cross not found for [B:14:0x0041, B:30:0x0079], limit reached: 36 */
        /* JADX WARN: Path cross not found for [B:17:0x004d, B:30:0x0079], limit reached: 36 */
        /* JADX WARN: Path cross not found for [B:30:0x0079, B:14:0x0041], limit reached: 36 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0093 -> B:6:0x0010). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r4 = 1
                if (r0 == 0) goto L71
                if (r0 != r4) goto L96
                long r2 = r12.J$0
                int r6 = r12.I$0
                X.Hwg.A00(r13)
            L10:
                com.facebook.aura.composer.dictation.ComposerDictationController r0 = com.facebook.aura.composer.dictation.ComposerDictationController.this
                com.facebook.aura.composer.dictation.HatchVoiceDictationService r0 = r0.voiceDictationService
                if (r0 == 0) goto L6f
                float r11 = r0.getVolume()
            L1a:
                com.facebook.aura.composer.dictation.ComposerDictationController r0 = com.facebook.aura.composer.dictation.ComposerDictationController.this
                com.facebook.aura.composer.dictation.WaveformBuffer r1 = r0.waveformBuffer
                com.facebook.aura.composer.dictation.HatchVoiceDictationService r0 = r0.voiceDictationService
                if (r0 == 0) goto L6d
                float r0 = r0.getWaveformVolume()
            L26:
                r1.push(r0)
                com.facebook.aura.composer.dictation.ComposerDictationController r0 = com.facebook.aura.composer.dictation.ComposerDictationController.this
                com.facebook.aura.composer.dictation.WaveformBuffer r9 = r0.waveformBuffer
                long r7 = android.os.SystemClock.elapsedRealtime()
                com.facebook.aura.composer.dictation.VoiceDictationSessionLog r0 = r0.sessionLog
                long r0 = r0.startedAtMs
                long r7 = r7 - r0
                long r0 = X.BV4.A04(r7)
                r9.setElapsedSeconds(r0)
                boolean r0 = r12.$autoSubmitOnSilence
                if (r0 == 0) goto L79
                long r9 = android.os.SystemClock.elapsedRealtime()
                r0 = -1038090240(0xffffffffc2200000, float:-40.0)
                int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r0 <= 0) goto L6a
                r2 = r9
                r6 = 1
            L4d:
                long r9 = r9 - r2
                r7 = 2500(0x9c4, double:1.235E-320)
                int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r0 < 0) goto L79
                com.facebook.aura.composer.dictation.ComposerDictationController r0 = com.facebook.aura.composer.dictation.ComposerDictationController.this
                com.facebook.aura.composer.dictation.DictationHost r0 = r0.host
                java.lang.String r0 = r0.getPendingMessageText()
                boolean r0 = X.C7BY.A0j(r0)
                if (r0 != 0) goto L78
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r12.$fireAutoSubmit
                r0.invoke()
            L67:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L6a:
                if (r6 == 0) goto L79
                goto L4d
            L6d:
                r0 = r11
                goto L26
            L6f:
                r11 = 0
                goto L1a
            L71:
                X.Hwg.A00(r13)
                long r2 = android.os.SystemClock.elapsedRealtime()
            L78:
                r6 = 0
            L79:
                com.facebook.aura.composer.dictation.ComposerDictationController r0 = com.facebook.aura.composer.dictation.ComposerDictationController.this
                X.BLG<java.lang.Boolean> r0 = r0._isActive
                java.lang.Object r0 = r0.getValue()
                boolean r0 = X.AnonymousClass001.A1X(r0)
                if (r0 == 0) goto L67
                r12.I$0 = r6
                r12.J$0 = r2
                r12.label = r4
                r0 = 100
                java.lang.Object r0 = X.C7Bq.A01(r0, r12)
                if (r0 != r5) goto L10
                return r5
            L96:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.ComposerDictationController.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass7) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ComposerDictationController(AbstractC3358CGz abstractC3358CGz, Context context, C3UX c3ux, String str, DictationHost dictationHost) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AnonymousClass005.A11(context, c3ux, str, 1);
        C7384Etj.A0Y(dictationHost, 4);
        this.userSession = abstractC3358CGz;
        this.scope = c3ux;
        this.analyticsSurface = str;
        this.host = dictationHost;
        C9286GCn c9286GCn = new C9286GCn(false);
        this._isActive = c9286GCn;
        this.isActive = C3Pi.A00(c9286GCn);
        ConfidentialSessionGate companion = ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz);
        this.cvmGate = companion;
        this.isOnDeviceSupported = OnDeviceDictationEngine.Companion.isSupported(context);
        this.isConfidentialVm = AnonymousClass441.A00(Boolean.valueOf(companion.isConfidentialVm()), c3ux, companion.isConfidentialVmFlow, new C3Es(0L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
        this.preDictationComposerText = "";
        VoiceDictationSendRequest voiceDictationSendRequest = new VoiceDictationSendRequest();
        this.voiceDictationSendRequest = voiceDictationSendRequest;
        this.waveformBuffer = new WaveformBuffer(voiceDictationSendRequest);
        this.sessionLog = new VoiceDictationSessionLog(str, HatchSubsurface.COMPOSER.getValue());
        this.autoSubmitFired = BV4.A12(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean finishVoiceDictation(com.facebook.aura.composer.dictation.HatchVoiceDictationService r10, com.facebook.aura.composer.dictation.engine.DictationOutcome r11, boolean r12) {
        /*
            r9 = this;
            r3 = 0
            r10.transcriptionListener = r3
            r10.onStoppedListener = r3
            r10.onCaptureLimitReached = r3
            r9.voiceDictationService = r3
            r9.voiceDictationKeyboardMerger = r3
            com.facebook.aura.composer.dictation.DictationHost r0 = r9.host
            java.lang.String r0 = r0.getComposerText()
            boolean r8 = X.C7BY.A0j(r0)
            com.facebook.aura.composer.dictation.VoiceDictationSessionLog r4 = r9.sessionLog
            com.facebook.aura.composer.dictation.DictationStartTrigger r2 = r4.startTrigger
            com.facebook.aura.composer.dictation.DictationStartTrigger r1 = com.facebook.aura.composer.dictation.DictationStartTrigger.MIC_HOLD
            r6 = 0
            r0 = 0
            if (r2 != r1) goto L6d
            long r1 = r4.firstTranscriptAtMs
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L3c
            com.facebook.aura.composer.dictation.DictationHost r1 = r9.host
            java.lang.String r1 = r1.getComposerText()
            java.lang.String r2 = X.AnonymousClass002.A0l(r1)
            java.lang.String r1 = r9.preDictationComposerText
            java.lang.String r1 = X.AnonymousClass002.A0l(r1)
            boolean r1 = X.C7384Etj.areEqual(r2, r1)
            if (r1 == 0) goto L6d
        L3c:
            r4 = 1
        L3d:
            if (r12 == 0) goto L4e
            com.facebook.aura.composer.dictation.engine.DictationOutcome r1 = com.facebook.aura.composer.dictation.engine.DictationOutcome.FAILED
            if (r11 == r1) goto L4e
            if (r4 != 0) goto L4e
            com.facebook.aura.composer.dictation.DictationHost r1 = r9.host
            boolean r1 = r1.send()
            r5 = 1
            if (r1 != 0) goto L4f
        L4e:
            r5 = 0
        L4f:
            com.facebook.aura.composer.dictation.engine.DictationOutcome r1 = com.facebook.aura.composer.dictation.engine.DictationOutcome.FAILED
            if (r11 != r1) goto L7b
            com.facebook.aura.composer.dictation.DictationHost r4 = r9.host
            com.facebook.aura.composer.dictation.DictationEngineType r2 = r10.transport
            r1 = -1
            if (r2 == 0) goto L77
            int r2 = r2.ordinal()
            if (r2 == r1) goto L77
            if (r2 == r0) goto L6f
            r1 = 2
            if (r2 == r1) goto L6f
            r1 = 1
            if (r2 == r1) goto L77
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L6d:
            r4 = 0
            goto L3d
        L6f:
            X.BLG<com.facebook.aura.network.state.AuraNetworkState> r0 = com.facebook.aura.network.state.AuraNetworkMonitor._state
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof com.facebook.aura.network.state.AuraNetworkState.Offline
        L77:
            r4.onDictationFailed(r0)
            goto L94
        L7b:
            com.facebook.aura.composer.dictation.engine.DictationOutcome r0 = com.facebook.aura.composer.dictation.engine.DictationOutcome.COMPLETED
            if (r11 != r0) goto L94
            if (r5 != 0) goto La4
            com.facebook.aura.composer.dictation.VoiceDictationSessionLog r0 = r9.sessionLog
            long r1 = r0.firstTranscriptAtMs
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto La4
            boolean r0 = r10.wasMicSilenced()
            if (r0 == 0) goto La4
            com.facebook.aura.composer.dictation.DictationHost r0 = r9.host
            r0.onMicSilenced()
        L94:
            X.HoC r0 = r9.waveformGenerationJob
            if (r0 == 0) goto L9b
            r0.A5w(r3)
        L9b:
            r9.waveformGenerationJob = r3
            r9.markInactive()
            r10.forceStopInteraction()
            return r5
        La4:
            if (r12 == 0) goto L94
            if (r5 != 0) goto L94
            if (r8 != 0) goto Lac
            if (r4 == 0) goto L94
        Lac:
            com.facebook.aura.composer.dictation.DictationHost r0 = r9.host
            r0.onNoSpeech()
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.ComposerDictationController.finishVoiceDictation(com.facebook.aura.composer.dictation.HatchVoiceDictationService, com.facebook.aura.composer.dictation.engine.DictationOutcome, boolean):boolean");
    }

    public final boolean isAvailable(DictationMode dictationMode) {
        C7384Etj.A0Y(dictationMode, 0);
        return isAvailable$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(dictationMode, this.cvmGate.isConfidentialVm());
    }

    public final boolean isAvailable$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(DictationMode dictationMode, boolean z) {
        C7384Etj.A0Y(dictationMode, 0);
        return DictationGating.INSTANCE.isAvailable$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation(dictationMode, z, this.cvmGate.getShouldHideUnsupportedCvmFeatures(), this.isOnDeviceSupported);
    }

    public final void start(Context context, DictationStartTrigger dictationStartTrigger, DictationMode dictationMode, Function0<Unit> function0, G0U<? super DictationOutcome, Unit> g0u) {
        boolean zA1Z = AnonymousClass005.A1Z(context, dictationStartTrigger, dictationMode);
        if (!AnonymousClass001.A1X(this._isActive.getValue()) || this.voiceDictationSendRequest.isPending) {
            if (dictationMode != DictationMode.MANUAL || C7BY.A0j(this.host.getComposerText()) || DictationGating.INSTANCE.isAppendEnabled()) {
                abandonVoiceDictation(VoiceDictationFinishTrigger.SUPERSEDED);
                MicrophoneClaim microphoneClaimClaimMicrophone = claimMicrophone(g0u);
                if (microphoneClaimClaimMicrophone == null) {
                    if (g0u != null) {
                        g0u.invoke(DictationOutcome.CANCELLED);
                        return;
                    }
                    return;
                }
                this.microphoneClaim = microphoneClaimClaimMicrophone;
                boolean zA1Z2 = AnonymousClass002.A1Z(dictationMode, DictationMode.AUTO_SUBMIT);
                if (this.voiceDictationKeyboardMerger == null) {
                    this.voiceDictationKeyboardMerger = new VoiceDictationKeyboardMerger();
                }
                this._isActive.Af8(Boolean.valueOf(zA1Z));
                this.autoSubmitFired.set(false);
                HatchVoiceDictationService hatchVoiceDictationService = new HatchVoiceDictationService(this.userSession, AnonymousClass001.A0I(context), HatchVoiceDictationService.AnonymousClass1.INSTANCE, false, null, HatchVoiceDictationService.AnonymousClass2.INSTANCE);
                this.voiceDictationService = hatchVoiceDictationService;
                ComposerDictationController$start$fireAutoSubmit$1 composerDictationController$start$fireAutoSubmit$1 = new ComposerDictationController$start$fireAutoSubmit$1(this, hatchVoiceDictationService, function0);
                hatchVoiceDictationService.transcriptionListener = new C111512(hatchVoiceDictationService, g0u);
                hatchVoiceDictationService.onStoppedListener = new AnonymousClass3(hatchVoiceDictationService, g0u);
                hatchVoiceDictationService.onCaptureStarted = new AnonymousClass4(hatchVoiceDictationService);
                hatchVoiceDictationService.onCaptureLimitReached = new AnonymousClass5(hatchVoiceDictationService);
                hatchVoiceDictationService.mode = dictationMode;
                hatchVoiceDictationService.onEndpointReached = zA1Z2 ? new AnonymousClass6(composerDictationController$start$fireAutoSubmit$1) : null;
                this.preDictationComposerText = this.host.getComposerText();
                this.sessionLog.start(dictationStartTrigger);
                hatchVoiceDictationService.startInteraction(false);
                this.sessionLog.logStarted(hatchVoiceDictationService, AnonymousClass006.A10("has_existing_text", String.valueOf(!C7BY.A0j(this.preDictationComposerText))));
                HoC hoC = this.waveformGenerationJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                this.waveformBuffer.reset();
                this.waveformGenerationJob = AnonymousClass001.A11(new AnonymousClass7(zA1Z2, composerDictationController$start$fireAutoSubmit$1, null), this.scope);
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
            int[] iArr = new int[DictationEngineType.values().length];
            try {
                AnonymousClass002.A13(DictationEngineType.VOYAGER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DictationEngineType.VM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DictationEngineType.ON_DEVICE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void abandonVoiceDictation(VoiceDictationFinishTrigger voiceDictationFinishTrigger) {
        HatchVoiceDictationService hatchVoiceDictationService = this.voiceDictationService;
        this.voiceDictationService = null;
        this.voiceDictationKeyboardMerger = null;
        markInactive();
        if (hatchVoiceDictationService != null) {
            hatchVoiceDictationService.transcriptionListener = null;
            hatchVoiceDictationService.onStoppedListener = null;
            hatchVoiceDictationService.onCaptureLimitReached = null;
            hatchVoiceDictationService.forceStopInteraction();
            this.sessionLog.logFinished(hatchVoiceDictationService, DictationOutcome.CANCELLED, voiceDictationFinishTrigger, new VoiceDictationSendResult(this.voiceDictationSendRequest.isPending, false), AGH.A0E());
        }
        this.voiceDictationSendRequest.resolve(DictationOutcome.CANCELLED, false);
    }

    public static /* synthetic */ void cancel$default(ComposerDictationController composerDictationController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        composerDictationController.cancel(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeVoiceDictation(HatchVoiceDictationService hatchVoiceDictationService, DictationOutcome dictationOutcome, G0U<? super DictationOutcome, Unit> g0u, VoiceDictationFinishTrigger voiceDictationFinishTrigger) {
        if (this.voiceDictationService == hatchVoiceDictationService) {
            boolean z = this.voiceDictationSendRequest.isPending;
            boolean zFinishVoiceDictation = finishVoiceDictation(hatchVoiceDictationService, dictationOutcome, z);
            if (!zFinishVoiceDictation && dictationOutcome != DictationOutcome.CANCELLED && this.sessionLog.firstTranscriptAtMs > 0 && !C7BY.A0j(this.host.getComposerText()) && !C7384Etj.areEqual(this.host.getComposerText(), this.preDictationComposerText)) {
                this.host.onDictatedTextKept();
                if (dictationOutcome == DictationOutcome.COMPLETED) {
                    this.host.onDictatedTextLanded();
                }
            }
            this.sessionLog.logFinished(hatchVoiceDictationService, dictationOutcome, voiceDictationFinishTrigger, new VoiceDictationSendResult(z, zFinishVoiceDictation), AGH.A0E());
            if (z) {
                this.voiceDictationSendRequest.resolve(dictationOutcome, zFinishVoiceDictation);
            } else if (g0u != null) {
                g0u.invoke(dictationOutcome);
            }
        }
    }

    private final boolean discardShortVoiceDictation() {
        VoiceDictationSessionLog voiceDictationSessionLog = this.sessionLog;
        if (voiceDictationSessionLog.stopRequestedAtMs - voiceDictationSessionLog.startedAtMs >= 750) {
            return false;
        }
        boolean z = this.voiceDictationSendRequest.isPending;
        this.host.setComposerText(this.preDictationComposerText);
        cancel(false, VoiceDictationFinishTrigger.CAPTURE_TOO_SHORT);
        if (!z || !C7BY.A0j(this.host.getComposerText())) {
            return true;
        }
        this.host.onNoSpeech();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void endAndSend$default(ComposerDictationController composerDictationController, G0V g0v, int i, Object obj) {
        if ((i & 1) != 0) {
            g0v = null;
        }
        composerDictationController.endAndSend(g0v);
    }

    private final void markInactive() {
        this._isActive.Af8(AnonymousClass001.A0h());
        MicrophoneClaim microphoneClaim = this.microphoneClaim;
        if (microphoneClaim != null) {
            microphoneClaim.release();
        }
        this.microphoneClaim = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMicrophonePreempted(G0U<? super DictationOutcome, Unit> g0u) {
        boolean z = this.voiceDictationSendRequest.isPending;
        cancel(false, VoiceDictationFinishTrigger.PREEMPTED);
        if (z || g0u == null) {
            return;
        }
        g0u.invoke(DictationOutcome.CANCELLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProcessing() {
        HoC hoC = this.waveformGenerationJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.waveformGenerationJob = null;
        this.waveformBuffer.setProcessing(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void start$default(ComposerDictationController composerDictationController, Context context, DictationStartTrigger dictationStartTrigger, DictationMode dictationMode, Function0 function0, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            dictationMode = DictationMode.MANUAL;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            g0u = null;
        }
        composerDictationController.start(context, dictationStartTrigger, dictationMode, function0, g0u);
    }

    private final void stopAndAwaitTranscript(HatchVoiceDictationService hatchVoiceDictationService) {
        this.sessionLog.markStopRequested(SystemClock.elapsedRealtime());
        if (discardShortVoiceDictation()) {
            return;
        }
        showProcessing();
        hatchVoiceDictationService.stopInteraction();
    }

    public final void cancel(boolean z) {
        cancel(z, VoiceDictationFinishTrigger.CANCELLED);
    }

    public final void endAndSend(G0V<? super DictationOutcome, ? super Boolean, Unit> g0v) {
        HatchVoiceDictationService hatchVoiceDictationService = this.voiceDictationService;
        if (hatchVoiceDictationService == null) {
            if (g0v != null) {
                g0v.invoke(DictationOutcome.CANCELLED, AnonymousClass001.A0h());
            }
        } else if (this.voiceDictationSendRequest.request(g0v)) {
            stopAndAwaitTranscript(hatchVoiceDictationService);
        }
    }

    public final WaveformBuffer getWaveformBuffer() {
        return this.waveformBuffer;
    }

    public final C1BN<Boolean> isActive() {
        return this.isActive;
    }

    public final C1BN<Boolean> isConfidentialVm$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation() {
        return this.isConfidentialVm;
    }

    public final boolean isFinalizing() {
        HatchVoiceDictationService hatchVoiceDictationService = this.voiceDictationService;
        return hatchVoiceDictationService != null && hatchVoiceDictationService.isAwaitingStopResult();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public final void release(G0U<? super String, Unit> g0u) {
        HatchVoiceDictationService hatchVoiceDictationService = this.voiceDictationService;
        VoiceDictationKeyboardMerger voiceDictationKeyboardMerger = this.voiceDictationKeyboardMerger;
        if (g0u == null || hatchVoiceDictationService == null || voiceDictationKeyboardMerger == null || !isFinalizing()) {
            abandonVoiceDictation(VoiceDictationFinishTrigger.CLEARED);
            return;
        }
        hatchVoiceDictationService.onCaptureLimitReached = null;
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = this.host.getComposerText();
        this.voiceDictationService = null;
        this.voiceDictationKeyboardMerger = null;
        markInactive();
        this.voiceDictationSendRequest.resolve(DictationOutcome.CANCELLED, false);
        hatchVoiceDictationService.transcriptionListener = new C111501(c10543HqvA0z, voiceDictationKeyboardMerger, g0u);
        hatchVoiceDictationService.onStoppedListener = new AnonymousClass2(hatchVoiceDictationService);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.facebook.aura.microphone.api.MicrophoneClaim] */
    private final MicrophoneClaim claimMicrophone(G0U<? super DictationOutcome, Unit> g0u) {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        ?? Claim = Microphone.INSTANCE.claim(this.userSession, MicrophonePriority.TRANSIENT, new AnonymousClass1(c10543HqvA0z, g0u));
        c10543HqvA0z.element = Claim;
        return Claim;
    }

    public final void end() {
        HatchVoiceDictationService hatchVoiceDictationService;
        if (isFinalizing() || (hatchVoiceDictationService = this.voiceDictationService) == null) {
            return;
        }
        stopAndAwaitTranscript(hatchVoiceDictationService);
    }

    private final void cancel(boolean z, VoiceDictationFinishTrigger voiceDictationFinishTrigger) {
        DictationMode dictationMode;
        String str = this.preDictationComposerText;
        HatchVoiceDictationService hatchVoiceDictationService = this.voiceDictationService;
        if (hatchVoiceDictationService != null) {
            dictationMode = hatchVoiceDictationService.mode;
        } else {
            dictationMode = null;
        }
        if (dictationMode != DictationMode.MANUAL || str.length() <= 0) {
            str = null;
        }
        abandonVoiceDictation(voiceDictationFinishTrigger);
        HoC hoC = this.waveformGenerationJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.waveformGenerationJob = null;
        markInactive();
        if (z) {
            DictationHost dictationHost = this.host;
            if (str != null) {
                dictationHost.setComposerText(str);
            } else {
                dictationHost.clearDraft();
            }
        }
    }
}
