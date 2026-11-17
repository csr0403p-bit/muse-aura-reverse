package com.facebook.aura.composer.dictation.ondevice;

import X.AGH;
import X.ATD;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.BV4;
import X.C06H;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.FGI;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.ModelDownloadListener;
import android.speech.RecognitionListener;
import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.speech.SpeechRecognizer;
import com.facebook.aura.composer.dictation.engine.DictationEngine;
import com.facebook.aura.composer.dictation.engine.DictationEngineListener;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.dictation.engine.DictationRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class OnDeviceDictationEngine implements DictationEngine {
    public static final float MAX_ANDROID_RMS_DB = 10.0f;
    public static final float MAX_WAVEFORM_LEVEL = 0.5f;
    public static final float MIN_ANDROID_RMS_DB = -2.0f;
    public static final long MODEL_DOWNLOAD_TIMEOUT_MS = 45000;
    public static final String TAG = "OnDeviceDictationEngine";
    public static final float WAVEFORM_SMOOTHING_MS = 250.0f;
    public final AtomicBoolean captureStarted;
    public volatile String clientSessionId;
    public final Context context;
    public final AtomicBoolean endpointFired;
    public final AtomicBoolean finished;
    public final AtomicBoolean hasPendingPartial;
    public final AtomicBoolean hasSpeechBegun;
    public final AtomicBoolean hasStartedListening;
    public final AtomicBoolean isActive;
    public final AtomicBoolean isCheckingSupport;
    public final AtomicBoolean isStopping;
    public volatile float lastRmsDb;
    public long lastWaveformUpdateMs;
    public volatile DictationEngineListener listener;
    public final Handler mainHandler;
    public volatile DictationMode mode;
    public final Runnable modelDownloadTimeout;
    public volatile SpeechRecognizer speechRecognizer;
    public final AtomicBoolean started;
    public float waveformLevel;
    public static final Companion Companion = new Companion();
    public static final boolean canDestroyDuringSupportCheck = AnonymousClass002.A1P(Build.VERSION.SDK_INT, 33);

    public final class Companion {
        public final boolean isSupported(Context context) {
            C7384Etj.A0Y(context, 0);
            return Build.VERSION.SDK_INT >= 31 && SpeechRecognizer.isOnDeviceRecognitionAvailable(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean matchesLanguage(List<String> list, String str) {
            C7384Etj.A0Y(str, 0);
            String strReplace = str.replace('_', '-');
            String strA0S = C7BY.A0S(strReplace, strReplace, '-');
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str2 : list) {
                    C7384Etj.A0Y(str2, 0);
                    String strReplace2 = str2.replace('_', '-');
                    if (strReplace2.equalsIgnoreCase(strReplace) || strReplace2.equalsIgnoreCase(strA0S) || strReplace.equalsIgnoreCase(C7BY.A0S(strReplace2, strReplace2, '-'))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String currentLocale() {
            String languageTag = Locale.getDefault().stripExtensions().toLanguageTag();
            C7384Etj.A0U(languageTag);
            return languageTag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String errorCodeToString(int i) {
            switch (i) {
                case 1:
                    return "NETWORK_TIMEOUT";
                case 2:
                    return "NETWORK";
                case 3:
                    return "AUDIO";
                case 4:
                    return "SERVER";
                case 5:
                    return "CLIENT";
                case 6:
                    return "SPEECH_TIMEOUT";
                case 7:
                    return "NO_MATCH";
                case 8:
                    return "RECOGNIZER_BUSY";
                case 9:
                    return "INSUFFICIENT_PERMISSIONS";
                case 10:
                    return "TOO_MANY_REQUESTS";
                case 11:
                    return "SERVER_DISCONNECTED";
                case 12:
                    return "LANGUAGE_NOT_SUPPORTED";
                case 13:
                    return "LANGUAGE_UNAVAILABLE";
                case 14:
                    return "CANNOT_CHECK_SUPPORT";
                case 15:
                    return "CANNOT_LISTEN_TO_DOWNLOAD_EVENTS";
                default:
                    return FGI.A0I("UNKNOWN(", i, ")");
            }
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine$newRecognitionListener$1, reason: invalid class name and case insensitive filesystem */
    public final class C111591 implements RecognitionListener {
        public final /* synthetic */ Intent $intent;
        public final /* synthetic */ SpeechRecognizer $recognizer;

        public C111591(SpeechRecognizer speechRecognizer, Intent intent) {
            this.$recognizer = speechRecognizer;
            this.$intent = intent;
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
            if (OnDeviceDictationEngine.this.speechRecognizer == this.$recognizer) {
                OnDeviceDictationEngine.this.hasSpeechBegun.set(true);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() {
            DictationEngineListener dictationEngineListener;
            if (OnDeviceDictationEngine.this.speechRecognizer == this.$recognizer && OnDeviceDictationEngine.this.isAutoSubmit() && OnDeviceDictationEngine.this.hasSpeechBegun.get() && !OnDeviceDictationEngine.this.isStopping.get() && C3cI.A1W(OnDeviceDictationEngine.this.endpointFired) && (dictationEngineListener = OnDeviceDictationEngine.this.listener) != null) {
                dictationEngineListener.onEndpoint();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
        @Override // android.speech.RecognitionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onError(int r7) {
            /*
                r6 = this;
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                android.speech.SpeechRecognizer r1 = r0.speechRecognizer
                android.speech.SpeechRecognizer r0 = r6.$recognizer
                if (r1 != r0) goto L5e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine$Companion r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.Companion
                java.lang.String r1 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.Companion.access$errorCodeToString(r0, r7)
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.isStopping
                boolean r0 = r0.get()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r4 = 3
                r3 = 0
                r5 = 1
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r1, r0}
                java.lang.String r1 = "OnDeviceDictationEngine"
                java.lang.String r0 = "onError: %d (%s) isStopping=%s"
                X.CFK.A0F(r1, r0, r2)
                r0 = 7
                if (r7 == r0) goto L33
                r0 = 6
                r2 = 0
                if (r7 != r0) goto L34
            L33:
                r2 = 1
            L34:
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.isStopping
                boolean r0 = r0.get()
                r1 = 0
                if (r0 != 0) goto L65
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.endpointFired
                boolean r0 = r0.get()
                if (r0 != 0) goto L65
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.isActive
                boolean r0 = r0.get()
                if (r0 == 0) goto L5f
                if (r2 == 0) goto L5f
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r2 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                android.speech.SpeechRecognizer r1 = r6.$recognizer
                android.content.Intent r0 = r6.$intent
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.access$startListening(r2, r1, r0)
            L5e:
                return
            L5f:
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.finish$default(r0, r1, r3, r4, r1)
                return
            L65:
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine r0 = com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.this
                com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.finish$default(r0, r1, r2, r5, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.C111591.onError(int):void");
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) {
            String str;
            ArrayList<String> stringArrayList;
            if (OnDeviceDictationEngine.this.speechRecognizer == this.$recognizer) {
                if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = (String) AbstractC0878AGe.A0G(stringArrayList)) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    OnDeviceDictationEngine.this.hasPendingPartial.set(true);
                    DictationEngineListener dictationEngineListener = OnDeviceDictationEngine.this.listener;
                    if (dictationEngineListener != null) {
                        dictationEngineListener.onTranscript(str, false);
                    }
                }
            }
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) {
            DictationEngineListener dictationEngineListener;
            if (OnDeviceDictationEngine.this.speechRecognizer == this.$recognizer && C3cI.A1W(OnDeviceDictationEngine.this.captureStarted) && (dictationEngineListener = OnDeviceDictationEngine.this.listener) != null) {
                dictationEngineListener.onCaptureStarted();
            }
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) {
            String str;
            DictationEngineListener dictationEngineListener;
            ArrayList<String> stringArrayList;
            if (OnDeviceDictationEngine.this.speechRecognizer == this.$recognizer) {
                OnDeviceDictationEngine.this.hasPendingPartial.set(false);
                if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = (String) AbstractC0878AGe.A0G(stringArrayList)) == null) {
                    str = "";
                }
                if (str.length() > 0 && (dictationEngineListener = OnDeviceDictationEngine.this.listener) != null) {
                    dictationEngineListener.onTranscript(str, true);
                }
                if (OnDeviceDictationEngine.this.isStopping.get() || OnDeviceDictationEngine.this.endpointFired.get()) {
                    OnDeviceDictationEngine.finish$default(OnDeviceDictationEngine.this, DictationOutcome.COMPLETED, false, 2, null);
                } else if (OnDeviceDictationEngine.this.isActive.get()) {
                    OnDeviceDictationEngine.this.startListening(this.$recognizer, this.$intent);
                }
            }
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f) {
            OnDeviceDictationEngine.this.lastRmsDb = (ATD.A03((f - (-2.0f)) / 12.0f, 0.0f, 1.0f) * 50.0f) - 50.0f;
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i, Bundle bundle) {
        }
    }

    public OnDeviceDictationEngine(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context.getApplicationContext();
        this.mode = DictationMode.MANUAL;
        this.clientSessionId = "";
        this.started = BV4.A12(false);
        this.isActive = BV4.A12(false);
        this.isStopping = BV4.A12(false);
        this.hasSpeechBegun = BV4.A12(false);
        this.captureStarted = BV4.A12(false);
        this.endpointFired = BV4.A12(false);
        this.finished = BV4.A12(false);
        this.hasPendingPartial = BV4.A12(false);
        this.hasStartedListening = BV4.A12(false);
        this.isCheckingSupport = BV4.A12(false);
        this.mainHandler = C60O.A02();
        this.lastRmsDb = -160.0f;
        this.modelDownloadTimeout = new Runnable() { // from class: com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine$modelDownloadTimeout$1
            @Override // java.lang.Runnable
            public final void run() {
                if (!this.this$0.isActive.get() || this.this$0.speechRecognizer == null) {
                    return;
                }
                CFK.A04(OnDeviceDictationEngine.TAG, "Timed out waiting for on-device speech model download");
                OnDeviceDictationEngine.finish$default(this.this$0, null, false, 3, null);
            }
        };
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public void start(DictationRequest dictationRequest, DictationEngineListener dictationEngineListener) {
        boolean zA1a = AnonymousClass002.A1a(dictationRequest, dictationEngineListener);
        if (!this.started.compareAndSet(false, zA1a)) {
            CFK.A06(TAG, "start: engine instances are single-use, skipping");
            return;
        }
        this.listener = dictationEngineListener;
        this.mode = dictationRequest.mode;
        this.clientSessionId = dictationRequest.clientSessionId;
        this.isActive.set(zA1a);
        this.lastWaveformUpdateMs = SystemClock.uptimeMillis();
        SpeechRecognizer speechRecognizerCreateRecognizer = createRecognizer();
        if (speechRecognizerCreateRecognizer == null) {
            finish(DictationOutcome.FAILED, false);
            return;
        }
        Intent intentCreateRecognizerIntent = createRecognizerIntent(Companion.currentLocale());
        this.speechRecognizer = speechRecognizerCreateRecognizer;
        speechRecognizerCreateRecognizer.setRecognitionListener(new C111591(speechRecognizerCreateRecognizer, intentCreateRecognizerIntent));
        startWhenModelReady(speechRecognizerCreateRecognizer, intentCreateRecognizerIntent);
    }

    private final SpeechRecognizer createRecognizer() {
        if (Build.VERSION.SDK_INT < 31) {
            CFK.A04(TAG, "On-device speech recognition requires Android 12 or newer");
            return null;
        }
        try {
            if (SpeechRecognizer.isOnDeviceRecognitionAvailable(this.context)) {
                return SpeechRecognizer.createOnDeviceSpeechRecognizer(this.context);
            }
            CFK.A04(TAG, "On-device speech recognition is unavailable");
            return null;
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Failed to create Android on-device speech recognizer", e);
            return null;
        }
    }

    private final Intent createRecognizerIntent(String str) {
        Intent intentA03 = C60P.A03("android.speech.action.RECOGNIZE_SPEECH");
        intentA03.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intentA03.putExtra("android.speech.extra.LANGUAGE", str);
        intentA03.putExtra("android.speech.extra.PREFER_OFFLINE", true);
        intentA03.putExtra("calling_package", this.context.getPackageName());
        intentA03.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        intentA03.putExtra("android.speech.extra.MAX_RESULTS", 1);
        return intentA03;
    }

    private final void destroyRecognizer() {
        final SpeechRecognizer speechRecognizer;
        if ((canDestroyDuringSupportCheck || !this.isCheckingSupport.get()) && (speechRecognizer = this.speechRecognizer) != null) {
            this.speechRecognizer = null;
            this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.destroyRecognizer.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        speechRecognizer.destroy();
                    } catch (RuntimeException e) {
                        CFK.A08(OnDeviceDictationEngine.TAG, "Failed to destroy Android speech recognizer", e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadModelThenStart(final SpeechRecognizer speechRecognizer, final Intent intent, final String str) {
        CFK.A03(str, TAG, "On-device model for %s is not installed; triggering download");
        if (Build.VERSION.SDK_INT < 34) {
            try {
                speechRecognizer.triggerModelDownload(intent);
            } catch (RuntimeException e) {
                C3cH.A1B("Failed to trigger model download for ", str, TAG, e);
            }
            finish(DictationOutcome.FAILED, false);
            return;
        }
        try {
            speechRecognizer.triggerModelDownload(intent, this.context.getMainExecutor(), new ModelDownloadListener() { // from class: com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.downloadModelThenStart.1
                @Override // android.speech.ModelDownloadListener
                public void onError(int i) {
                    if (OnDeviceDictationEngine.this.isCurrent(speechRecognizer)) {
                        OnDeviceDictationEngine onDeviceDictationEngine = OnDeviceDictationEngine.this;
                        onDeviceDictationEngine.mainHandler.removeCallbacks(onDeviceDictationEngine.modelDownloadTimeout);
                        CFK.A0F(OnDeviceDictationEngine.TAG, "Model download for %s failed: %d (%s)", str, Integer.valueOf(i), OnDeviceDictationEngine.Companion.errorCodeToString(i));
                        OnDeviceDictationEngine.finish$default(OnDeviceDictationEngine.this, null, false, 3, null);
                    }
                }

                @Override // android.speech.ModelDownloadListener
                public void onProgress(int i) {
                    if (OnDeviceDictationEngine.this.isCurrent(speechRecognizer)) {
                        OnDeviceDictationEngine.this.scheduleModelDownloadTimeout();
                    }
                }

                @Override // android.speech.ModelDownloadListener
                public void onScheduled() {
                    if (OnDeviceDictationEngine.this.isCurrent(speechRecognizer)) {
                        CFK.A03(str, OnDeviceDictationEngine.TAG, "Model download for %s was scheduled");
                        OnDeviceDictationEngine.this.scheduleModelDownloadTimeout();
                    }
                }

                @Override // android.speech.ModelDownloadListener
                public void onSuccess() {
                    if (OnDeviceDictationEngine.this.isCurrent(speechRecognizer)) {
                        OnDeviceDictationEngine onDeviceDictationEngine = OnDeviceDictationEngine.this;
                        onDeviceDictationEngine.mainHandler.removeCallbacks(onDeviceDictationEngine.modelDownloadTimeout);
                        CFK.A03(str, OnDeviceDictationEngine.TAG, "Model download for %s completed");
                        OnDeviceDictationEngine.this.startListening(speechRecognizer, intent);
                    }
                }
            });
            scheduleModelDownloadTimeout();
        } catch (RuntimeException e2) {
            C3cH.A1B("Failed to trigger model download for ", str, TAG, e2);
            finish(DictationOutcome.FAILED, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endSupportCheck() {
        this.isCheckingSupport.set(false);
        if (canDestroyDuringSupportCheck || !this.finished.get()) {
            return;
        }
        destroyRecognizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void finish(com.facebook.aura.composer.dictation.engine.DictationOutcome r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.finished
            r4 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r4, r3)
            if (r0 == 0) goto L54
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isStopping
            boolean r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.endpointFired
            boolean r0 = r0.get()
            r2 = 0
            if (r0 == 0) goto L1c
        L1b:
            r2 = 1
        L1c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.hasPendingPartial
            boolean r1 = r0.get()
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.hasSpeechBegun
            boolean r0 = r0.get()
            if (r0 == 0) goto L55
            if (r7 != 0) goto L55
        L2c:
            com.facebook.aura.composer.dictation.engine.DictationOutcome r3 = com.facebook.aura.composer.dictation.engine.DictationOutcomeKt.resolveStopOutcome(r6, r2, r1, r4, r3)
            java.lang.String r2 = "finish: session=%s outcome=%s resolved=%s"
            java.lang.String r1 = r5.clientSessionId
            java.lang.String r0 = "OnDeviceDictationEngine"
            X.CFK.A01(r1, r6, r3, r0, r2)
            android.os.Handler r1 = r5.mainHandler
            java.lang.Runnable r0 = r5.modelDownloadTimeout
            r1.removeCallbacks(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isActive
            r0.set(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isStopping
            r0.set(r4)
            r5.destroyRecognizer()
            com.facebook.aura.composer.dictation.engine.DictationEngineListener r0 = r5.listener
            if (r0 == 0) goto L54
            r0.onStopped(r3)
        L54:
            return
        L55:
            r3 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.finish(com.facebook.aura.composer.dictation.engine.DictationOutcome, boolean):void");
    }

    public static /* synthetic */ void finish$default(OnDeviceDictationEngine onDeviceDictationEngine, DictationOutcome dictationOutcome, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dictationOutcome = DictationOutcome.FAILED;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        onDeviceDictationEngine.finish(dictationOutcome, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAutoSubmit() {
        return AnonymousClass002.A1Z(this.mode, DictationMode.AUTO_SUBMIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrent(SpeechRecognizer speechRecognizer) {
        return this.speechRecognizer == speechRecognizer && this.isActive.get() && !this.finished.get();
    }

    private final RecognitionListener newRecognitionListener(SpeechRecognizer speechRecognizer, Intent intent) {
        return new C111591(speechRecognizer, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleModelDownloadTimeout() {
        this.mainHandler.removeCallbacks(this.modelDownloadTimeout);
        this.mainHandler.postDelayed(this.modelDownloadTimeout, 45000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListening(SpeechRecognizer speechRecognizer, Intent intent) {
        try {
            CFK.A03(intent.getStringExtra("android.speech.extra.LANGUAGE"), TAG, "Starting Android on-device speech recognition for %s");
            this.hasStartedListening.set(true);
            speechRecognizer.startListening(intent);
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Failed to start Android on-device speech recognition", e);
            finish(DictationOutcome.FAILED, false);
        }
    }

    private final void startWhenModelReady(final SpeechRecognizer speechRecognizer, final Intent intent) {
        final String stringExtra = intent.getStringExtra("android.speech.extra.LANGUAGE");
        if (stringExtra == null) {
            stringExtra = Companion.currentLocale();
        }
        if (Build.VERSION.SDK_INT < 33) {
            startListening(speechRecognizer, intent);
            return;
        }
        try {
            this.isCheckingSupport.set(true);
            speechRecognizer.checkRecognitionSupport(intent, this.context.getMainExecutor(), new RecognitionSupportCallback() { // from class: com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine.startWhenModelReady.1
                @Override // android.speech.RecognitionSupportCallback
                public void onSupportResult(RecognitionSupport recognitionSupport) {
                    C7384Etj.A0Y(recognitionSupport, 0);
                    OnDeviceDictationEngine.this.endSupportCheck();
                    if (OnDeviceDictationEngine.this.isCurrent(speechRecognizer)) {
                        List<String> installedOnDeviceLanguages = recognitionSupport.getInstalledOnDeviceLanguages();
                        C7384Etj.A0U(installedOnDeviceLanguages);
                        List<String> supportedOnDeviceLanguages = recognitionSupport.getSupportedOnDeviceLanguages();
                        C7384Etj.A0U(supportedOnDeviceLanguages);
                        List<String> pendingOnDeviceLanguages = recognitionSupport.getPendingOnDeviceLanguages();
                        C7384Etj.A0U(pendingOnDeviceLanguages);
                        CFK.A00(stringExtra, installedOnDeviceLanguages, supportedOnDeviceLanguages, pendingOnDeviceLanguages, OnDeviceDictationEngine.TAG, "Recognition support for %s: installed=%s supported=%s pending=%s");
                        Companion companion = OnDeviceDictationEngine.Companion;
                        if (companion.matchesLanguage(installedOnDeviceLanguages, stringExtra)) {
                            OnDeviceDictationEngine.this.startListening(speechRecognizer, intent);
                        } else if (companion.matchesLanguage(supportedOnDeviceLanguages, stringExtra) || companion.matchesLanguage(pendingOnDeviceLanguages, stringExtra)) {
                            OnDeviceDictationEngine.this.downloadModelThenStart(speechRecognizer, intent, stringExtra);
                        } else {
                            CFK.A0F(OnDeviceDictationEngine.TAG, "On-device model for %s is unsupported", stringExtra);
                            OnDeviceDictationEngine.finish$default(OnDeviceDictationEngine.this, null, false, 3, null);
                        }
                    }
                }

                @Override // android.speech.RecognitionSupportCallback
                public void onError(int i) {
                    OnDeviceDictationEngine.this.endSupportCheck();
                    if (OnDeviceDictationEngine.this.isCurrent(speechRecognizer)) {
                        CFK.A0H(OnDeviceDictationEngine.TAG, "checkRecognitionSupport failed: %d (%s); attempting recognition", Integer.valueOf(i), OnDeviceDictationEngine.Companion.errorCodeToString(i));
                        OnDeviceDictationEngine.this.startListening(speechRecognizer, intent);
                    }
                }
            });
        } catch (RuntimeException e) {
            endSupportCheck();
            CFK.A0A(TAG, "checkRecognitionSupport threw; attempting recognition", e);
            startListening(speechRecognizer, intent);
        }
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public void cancel() {
        try {
            SpeechRecognizer speechRecognizer = this.speechRecognizer;
            if (speechRecognizer != null) {
                speechRecognizer.cancel();
            }
        } catch (RuntimeException e) {
            CFK.A08(TAG, "cancel: failed to cancel recognizer", e);
        }
        finish(DictationOutcome.CANCELLED, false);
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public boolean isFinalizing() {
        return this.isStopping.get();
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public void stop() {
        if (this.isActive.compareAndSet(true, false)) {
            this.isStopping.set(true);
            if (!this.hasStartedListening.get()) {
                finish(DictationOutcome.FAILED, false);
                return;
            }
            try {
                SpeechRecognizer speechRecognizer = this.speechRecognizer;
                if (speechRecognizer != null) {
                    speechRecognizer.stopListening();
                }
            } catch (RuntimeException e) {
                CFK.A08(TAG, "stop: failed to stop listening", e);
                finish(DictationOutcome.FAILED, false);
            }
        }
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public float volumeDb() {
        return this.lastRmsDb;
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public /* bridge */ boolean wasMicSilenced() {
        return false;
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public /* bridge */ boolean wasUnreachable() {
        return false;
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public float waveformVolumeDb() {
        if (!this.isActive.get()) {
            return -160.0f;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.lastWaveformUpdateMs;
        if (j < 0) {
            j = 0;
        }
        this.lastWaveformUpdateMs = jUptimeMillis;
        float fA03 = ATD.A03((this.lastRmsDb - (-50.0f)) / 50.0f, 0.0f, 1.0f) * 0.5f;
        float fA032 = ATD.A03(j / 250.0f, 0.0f, 1.0f);
        float f = this.waveformLevel;
        this.waveformLevel = f + ((fA03 - f) * fA032);
        return (r0 * 50.0f) - 50.0f;
    }

    @Override // com.facebook.aura.composer.dictation.engine.DictationEngine
    public /* bridge */ Map<String, String> captureMetadata() {
        return AGH.A0E();
    }
}
