package com.facebook.aura.composer.dictation.engine;

/* loaded from: classes5.dex */
public interface DictationEngineListener {
    void onCaptureStarted();

    void onConnected();

    void onEndOfTurnCountdown(EndOfTurnCountdown endOfTurnCountdown);

    void onEndpoint();

    void onStopped(DictationOutcome dictationOutcome);

    void onTranscript(String str, boolean z);

    /* renamed from: com.facebook.aura.composer.dictation.engine.DictationEngineListener$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$onCaptureStarted(DictationEngineListener dictationEngineListener) {
        }

        public static void $default$onConnected(DictationEngineListener dictationEngineListener) {
        }

        public static /* synthetic */ void access$onCaptureStarted$jd(DictationEngineListener dictationEngineListener) {
        }

        public static /* synthetic */ void access$onConnected$jd(DictationEngineListener dictationEngineListener) {
        }

        public static void $default$onEndOfTurnCountdown(DictationEngineListener dictationEngineListener, EndOfTurnCountdown endOfTurnCountdown) {
        }

        public static /* synthetic */ void access$onEndOfTurnCountdown$jd(DictationEngineListener dictationEngineListener, EndOfTurnCountdown endOfTurnCountdown) {
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static void onCaptureStarted(DictationEngineListener dictationEngineListener) {
        }

        @Deprecated
        public static void onConnected(DictationEngineListener dictationEngineListener) {
        }

        @Deprecated
        public static void onEndOfTurnCountdown(DictationEngineListener dictationEngineListener, EndOfTurnCountdown endOfTurnCountdown) {
        }
    }
}
