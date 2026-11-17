package org.webrtc.voiceengine;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV7;
import X.C60O;
import X.FGI;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* loaded from: classes5.dex */
public class WebRtcAudioManager {
    public static final int BITS_PER_SAMPLE = 16;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_FRAME_PER_BUFFER = 256;
    public static final String TAG = "WebRtcAudioManager";
    public static final boolean blacklistDeviceForAAudioUsage = true;
    public static boolean blacklistDeviceForOpenSLESUsage;
    public static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    public static boolean useStereoInput;
    public static boolean useStereoOutput;
    public boolean aAudio;
    public final AudioManager audioManager;
    public boolean hardwareAEC;
    public boolean hardwareAGC;
    public boolean hardwareDP;
    public boolean hardwareEQ;
    public boolean hardwareLE;
    public boolean hardwareNS;
    public boolean initialized;
    public int inputBufferSize;
    public int inputChannels;
    public boolean lowLatencyInput;
    public boolean lowLatencyOutput;
    public final long nativeAudioManager;
    public int nativeChannels;
    public int nativeSampleRate;
    public int outputBufferSize;
    public int outputChannels;
    public boolean proAudio;
    public int sampleRate;
    public final VolumeLogger volumeLogger;

    public class VolumeLogger {
        public static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        public static final int TIMER_PERIOD_IN_SECONDS = 30;
        public final AudioManager audioManager;
        public Timer timer;

        public class LogVolumeTask extends TimerTask {
            public final int maxRingVolume;
            public final int maxVoiceCallVolume;

            public LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                StringBuilder sbA0x;
                int i;
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    sbA0x = C60O.A0x("STREAM_RING stream volume: ");
                    sbA0x.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                    sbA0x.append(" (max=");
                    i = this.maxRingVolume;
                } else {
                    if (mode != 3) {
                        return;
                    }
                    sbA0x = C60O.A0x("VOICE_CALL stream volume: ");
                    sbA0x.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                    sbA0x.append(" (max=");
                    i = this.maxVoiceCallVolume;
                }
                sbA0x.append(i);
                BV7.A1F(")", WebRtcAudioManager.TAG, sbA0x);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }
    }

    public WebRtcAudioManager(long j) {
        this(j, false);
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i4, int i5, long j);

    public static void assertTrue(boolean z) {
        if (!z) {
            throw BV4.A0N("Expected condition to be true");
        }
    }

    private void dispose() {
        Logging.d(TAG, BV7.A0y("dispose"));
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private void enableCommunicationMode() {
        this.audioManager.setMode(3);
    }

    public static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }

    public static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        return useStereoInput;
    }

    public static synchronized boolean getStereoOutput() {
        return useStereoOutput;
    }

    private boolean hasEarpiece() {
        return hasSystemFeature(ContextUtils.applicationContext.getPackageManager(), "android.hardware.telephony");
    }

    private boolean init() {
        Logging.d(TAG, BV7.A0y("init"));
        if (!this.initialized) {
            Logging.d(TAG, FGI.A0M("audio mode is: ", WebRtcAudioUtils.modeToString(this.audioManager.getMode())));
            this.initialized = true;
            this.volumeLogger.start();
            Logging.d(TAG, "init finished");
        }
        return true;
    }

    private boolean initWithoutLogging() {
        Logging.d(TAG, BV7.A0y("initWithoutLogging"));
        if (!this.initialized) {
            this.initialized = true;
            Logging.d(TAG, "initWithoutLogging finished");
        }
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private boolean isCommunicationModeEnabled() {
        return AnonymousClass002.A1Q(this.audioManager.getMode(), 3);
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean zDeviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (zDeviceIsBlacklistedForOpenSLESUsage) {
            Logging.d(TAG, FGI.A0M(Build.MODEL, " is blacklisted for OpenSL ES usage!"));
        }
        return zDeviceIsBlacklistedForOpenSLESUsage;
    }

    public static boolean isDynamicsProcessingSupported() {
        Logging.w(TAG, FGI.A0r("isDynamicsProcessingSupported() ", WebRtcAudioEffects.canUseDynamicsProcessing()));
        return WebRtcAudioEffects.canUseDynamicsProcessing();
    }

    public static boolean isLoudnessEnhancerSupported() {
        Logging.w(TAG, FGI.A0r("isLoudnessEnhancerSupported() ", WebRtcAudioEffects.canUseLoudnessEnhancer()));
        return WebRtcAudioEffects.canUseLoudnessEnhancer();
    }

    private boolean isLowLatencyOutputSupported() {
        return hasSystemFeature(ContextUtils.applicationContext.getPackageManager(), "android.hardware.audio.low_latency");
    }

    private boolean isProAudioSupported() {
        return AnonymousClass002.A1L(hasSystemFeature(ContextUtils.applicationContext.getPackageManager(), "android.hardware.audio.pro") ? 1 : 0);
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        blacklistDeviceForOpenSLESUsageIsOverridden = true;
        blacklistDeviceForOpenSLESUsage = z;
    }

    public static synchronized void setStereoInput(boolean z) {
        Logging.w(TAG, AnonymousClass006.A0z(C60O.A10("Overriding default input behavior: setStereoInput(", z)));
        useStereoInput = z;
    }

    public static synchronized void setStereoOutput(boolean z) {
        Logging.w(TAG, AnonymousClass006.A0z(C60O.A10("Overriding default output behavior: setStereoOutput(", z)));
        useStereoOutput = z;
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(AnonymousClass002.A1L(isLowLatencyOutputSupported() ? 1 : 0));
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.d(TAG, FGI.A0I("Default sample rate is overridden to ", WebRtcAudioUtils.getDefaultSampleRateHz(), " Hz"));
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel();
        Logging.d(TAG, FGI.A0I("Sample rate is set to ", sampleRateForApiLevel, " Hz"));
        return sampleRateForApiLevel;
    }

    public static boolean hasSystemFeature(PackageManager packageManager, String str) {
        try {
            return packageManager.hasSystemFeature(str);
        } catch (RuntimeException e) {
            Logging.w(TAG, FGI.A0M("PackageManager.hasSystemFeature failed for ", str), e);
            return false;
        }
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private void storeAudioParameters() {
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = WebRtcAudioEffects.canUseAcousticEchoCanceler();
        this.hardwareAGC = false;
        this.hardwareNS = WebRtcAudioEffects.canUseNoiseSuppressor();
        this.hardwareLE = isLoudnessEnhancerSupported();
        this.hardwareDP = isDynamicsProcessingSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = AnonymousClass002.A1L(isLowLatencyOutputSupported() ? 1 : 0);
        this.proAudio = isProAudioSupported();
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        this.aAudio = false;
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return AnonymousClass002.A1L(isLowLatencyOutputSupported() ? 1 : 0);
    }

    public WebRtcAudioManager(long j, boolean z) {
        Logging.d(TAG, BV7.A0y("ctor"));
        this.nativeAudioManager = j;
        AudioManager audioManager = (AudioManager) ContextUtils.applicationContext.getSystemService("audio");
        this.audioManager = audioManager;
        this.volumeLogger = new VolumeLogger(audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.hardwareLE, this.hardwareDP, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j);
        if (!z) {
            Logging.d(TAG, "ctor logAudioState begin");
            WebRtcAudioUtils.logAudioState(TAG);
            Logging.d(TAG, "ctor logAudioState finished");
        }
    }
}
