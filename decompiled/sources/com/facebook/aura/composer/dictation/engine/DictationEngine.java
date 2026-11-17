package com.facebook.aura.composer.dictation.engine;

import X.AGH;
import java.util.Map;

/* loaded from: classes5.dex */
public interface DictationEngine {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final float SILENCE_DB = -160.0f;
    public static final float WAVEFORM_FLOOR_DB = -50.0f;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final float SILENCE_DB = -160.0f;
        public static final float WAVEFORM_FLOOR_DB = -50.0f;
    }

    void cancel();

    Map<String, String> captureMetadata();

    boolean isFinalizing();

    void start(DictationRequest dictationRequest, DictationEngineListener dictationEngineListener);

    void stop();

    float volumeDb();

    boolean wasMicSilenced();

    boolean wasUnreachable();

    float waveformVolumeDb();

    /* renamed from: com.facebook.aura.composer.dictation.engine.DictationEngine$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$wasMicSilenced(DictationEngine dictationEngine) {
            return false;
        }

        public static boolean $default$wasUnreachable(DictationEngine dictationEngine) {
            return false;
        }

        public static /* synthetic */ boolean access$wasMicSilenced$jd(DictationEngine dictationEngine) {
            return false;
        }

        public static /* synthetic */ boolean access$wasUnreachable$jd(DictationEngine dictationEngine) {
            return false;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static Map<String, String> captureMetadata(DictationEngine dictationEngine) {
            return AGH.A0E();
        }

        @Deprecated
        public static boolean wasMicSilenced(DictationEngine dictationEngine) {
            return false;
        }

        @Deprecated
        public static boolean wasUnreachable(DictationEngine dictationEngine) {
            return false;
        }

        @Deprecated
        public static float waveformVolumeDb(DictationEngine dictationEngine) {
            return dictationEngine.volumeDb();
        }
    }
}
