package org.webrtc.voiceengine;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV7;
import X.BV8;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.FGI;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

/* loaded from: classes5.dex */
public class WebRtcAudioTrack {
    public static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioTrack";
    public static ErrorCallback errorCallback;
    public static WebRtcAudioTrackErrorCallback errorCallbackOld;
    public static volatile boolean speakerMute;
    public final AudioManager audioManager;
    public AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final WebRtcAudioLatencyUtils latencyUtils;
    public final long nativeAudioTrack;
    public final ThreadUtils.ThreadChecker threadChecker;
    public static final int DEFAULT_USAGE = 2;
    public static int usageAttribute = 2;

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public class AudioTrackThread extends Thread {
        public volatile boolean keepAlive;

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IllegalStateException, SecurityException, IllegalArgumentException {
            WebRtcAudioTrack webRtcAudioTrack;
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, BV7.A0y("AudioTrackThread"));
            AudioTrack audioTrack = WebRtcAudioTrack.this.audioTrack;
            if (audioTrack == null || audioTrack.getPlayState() != 3) {
                Logging.w(WebRtcAudioTrack.TAG, "AudioTrack not in PLAYING state at thread start, aborting playback thread");
                return;
            }
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (true) {
                boolean z = this.keepAlive;
                webRtcAudioTrack = WebRtcAudioTrack.this;
                if (!z) {
                    try {
                        break;
                    } catch (IllegalStateException e) {
                        Logging.e(WebRtcAudioTrack.TAG, BV5.A0n("AudioTrack.stop failed: ", e));
                        return;
                    }
                }
                webRtcAudioTrack.nativeGetPlayoutData(iCapacity, webRtcAudioTrack.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(BV7.A1S(iCapacity, WebRtcAudioTrack.this.byteBuffer.remaining()));
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                    webRtcAudioTrack2.byteBuffer.put(webRtcAudioTrack2.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                int iWrite = webRtcAudioTrack3.audioTrack.write(webRtcAudioTrack3.byteBuffer, iCapacity, 0);
                if (iWrite != iCapacity) {
                    Logging.e(WebRtcAudioTrack.TAG, FGI.A0H("AudioTrack.write played invalid number of bytes: ", iWrite));
                    if (iWrite < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError(FGI.A0H("AudioTrack.write failed: ", iWrite));
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
                WebRtcAudioTrack webRtcAudioTrack4 = WebRtcAudioTrack.this;
                int iCalculateTrackLatencyInMs = webRtcAudioTrack4.latencyUtils.calculateTrackLatencyInMs(webRtcAudioTrack4.audioTrack, iWrite);
                if (iCalculateTrackLatencyInMs > 0) {
                    WebRtcAudioTrack webRtcAudioTrack5 = WebRtcAudioTrack.this;
                    webRtcAudioTrack5.nativeReportWebRtcTrackLatencyInMs(iCalculateTrackLatencyInMs, webRtcAudioTrack5.nativeAudioTrack);
                }
            }
            AudioTrack audioTrack2 = webRtcAudioTrack.audioTrack;
            if (audioTrack2 != null) {
                Logging.d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                audioTrack2.stop();
                Logging.d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, long j);

    private native void nativeReportWebRtcAudioTrackError(String str, long j);

    private native void nativeReportWebRtcAudioTrackInitError(String str, long j);

    private native void nativeReportWebRtcAudioTrackStartError(String str, String str2, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeReportWebRtcTrackLatencyInMs(int i, long j);

    public static void assertTrue(boolean z) {
        if (!z) {
            throw BV4.A0N("Expected condition to be true");
        }
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, FGI.A0H("nativeOutputSampleRate: ", nativeOutputSampleRate));
        if (i != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        int i4 = usageAttribute;
        if (i4 != DEFAULT_USAGE) {
            Logging.w(TAG, FGI.A0H("A non default usage attribute is used: ", i4));
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), BV8.A0S(new AudioFormat.Builder(), i, i2), i3, 1, 0);
    }

    private boolean enableBuiltInDP(boolean z) {
        Logging.d(TAG, AnonymousClass006.A0z(C60O.A10("enableBuiltInDP(", z)));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setDP(z);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    private boolean enableBuiltInLE(boolean z) {
        Logging.d(TAG, AnonymousClass006.A0z(C60O.A10("enableBuiltInLE(", z)));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setLE(z);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        assertTrue(AnonymousClass002.A1X(this.audioManager));
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        assertTrue(AnonymousClass002.A1X(this.audioManager));
        return this.audioManager.getStreamVolume(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int initPlayout(int r12, int r13, double r14, boolean r16, int r17) {
        /*
            r11 = this;
            r10 = r17
            org.webrtc.ThreadUtils$ThreadChecker r0 = r11.threadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "initPlayout(sampleRate="
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r12)
            java.lang.String r0 = ", channels="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", bufferSizeFactor="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = X.BV7.A10(r1)
            java.lang.String r5 = "WebRtcAudioTrack"
            org.webrtc.Logging.d(r5, r0)
            int r1 = r13 * 2
            org.webrtc.voiceengine.WebRtcAudioLatencyUtils r0 = r11.latencyUtils
            r0.initTrackLatencyEstimator(r1, r12)
            int r0 = r12 / 100
            int r1 = r1 * r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r1)
            r11.byteBuffer = r0
            java.lang.String r1 = "byteBuffer.capacity: "
            int r0 = r0.capacity()
            java.lang.String r0 = X.FGI.A0H(r1, r0)
            org.webrtc.Logging.d(r5, r0)
            java.nio.ByteBuffer r0 = r11.byteBuffer
            int r0 = r0.capacity()
            byte[] r0 = new byte[r0]
            r11.emptyBytes = r0
            java.nio.ByteBuffer r2 = r11.byteBuffer
            long r0 = r11.nativeAudioTrack
            r11.nativeCacheDirectBufferAddress(r2, r0)
            r3 = 1
            r2 = 12
            if (r13 != r3) goto L5a
            r2 = 4
        L5a:
            r0 = 2
            int r1 = android.media.AudioTrack.getMinBufferSize(r12, r2, r0)
            r0 = -2
            r4 = -1
            if (r1 == r0) goto Lae
            if (r1 == r4) goto Lab
            java.lang.String r0 = "AudioTrack.getMinBufferSize = "
            java.lang.String r0 = X.FGI.A0H(r0, r1)
            org.webrtc.Logging.d(r5, r0)
        L6e:
            double r0 = (double) r1
            double r0 = r0 * r14
            int r8 = (int) r0
            java.nio.ByteBuffer r0 = r11.byteBuffer
            java.lang.String r6 = " whereas the configured frame size is = "
            int r0 = r0.capacity()
            if (r16 == 0) goto L98
            if (r8 >= r0) goto La9
            java.lang.String r5 = "AudioTrack.getMinBufferSize returned a size that is too small.  bufferSizeInBytes = "
            java.nio.ByteBuffer r0 = r11.byteBuffer
            int r9 = r0.capacity()
            java.lang.String r7 = " bytes. Falling back to buffer size = "
            java.lang.String r0 = X.FGI.A0Z(r5, r6, r7, r8, r9, r10)
            r11.reportWebRtcAudioTrackInitError(r0)
        L8e:
            android.media.AudioTrack r0 = r11.audioTrack
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "Conflict with existing AudioTrack."
        L94:
            r11.reportWebRtcAudioTrackInitError(r0)
            return r4
        L98:
            if (r8 >= r0) goto La9
            java.lang.String r2 = "AudioTrack.getMinBufferSize returns an invalid value. bufferSizeInBytes = "
            java.nio.ByteBuffer r0 = r11.byteBuffer
            int r1 = r0.capacity()
            java.lang.String r0 = " bytes."
            java.lang.String r0 = X.FGI.A0Y(r2, r6, r0, r8, r1)
            goto L94
        La9:
            r10 = r8
            goto L8e
        Lab:
            java.lang.String r0 = "Error while finding AudioTrack min buffer size: ERROR"
            goto Lb0
        Lae:
            java.lang.String r0 = "Error while finding AudioTrack min buffer size: ERROR_BAD_VALUE"
        Lb0:
            r11.reportWebRtcAudioTrackInitError(r0)
            goto L6e
        Lb4:
            android.media.AudioTrack r0 = createAudioTrackOnLollipopOrHigher(r12, r2, r10)     // Catch: java.lang.IllegalArgumentException -> Lde
            r11.audioTrack = r0     // Catch: java.lang.IllegalArgumentException -> Lde
            int r0 = r0.getState()
            if (r0 == r3) goto Lc9
            java.lang.String r0 = "Initialization of audio track failed."
            r11.reportWebRtcAudioTrackInitError(r0)
            r11.releaseAudioResources()
            return r4
        Lc9:
            org.webrtc.voiceengine.WebRtcAudioEffects r2 = r11.effects
            if (r2 == 0) goto Ld7
            android.media.AudioTrack r0 = r11.audioTrack
            int r1 = r0.getAudioSessionId()
            r0 = 0
            r2.enable(r1, r0)
        Ld7:
            r11.logMainParameters()
            r11.logMainParametersExtended()
            return r10
        Lde:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r11.reportWebRtcAudioTrackInitError(r0)
            r11.releaseAudioResources()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioTrack.initPlayout(int, int, double, boolean, int):int");
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        Logging.d(TAG, FGI.A0H("AudioTrack: buffer capacity in frames: ", this.audioTrack.getBufferCapacityInFrames()));
    }

    private void logBufferSizeInFrames() {
        Logging.d(TAG, FGI.A0H("AudioTrack: buffer size in frames: ", this.audioTrack.getBufferSizeInFrames()));
    }

    private void logMainParameters() {
        StringBuilder sbA0x = C60O.A0x("AudioTrack: session ID: ");
        sbA0x.append(this.audioTrack.getAudioSessionId());
        sbA0x.append(", channels: ");
        sbA0x.append(this.audioTrack.getChannelCount());
        sbA0x.append(", sample rate: ");
        sbA0x.append(this.audioTrack.getSampleRate());
        sbA0x.append(", max gain: ");
        sbA0x.append(AudioTrack.getMaxVolume());
        Logging.d(TAG, sbA0x.toString());
    }

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, FGI.A0M("Run-time playback error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackError(FGI.A0M("Run-time playback error: ", str), this.nativeAudioTrack);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, FGI.A0M("Init playout error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackInitError(FGI.A0M("Init playout error: ", str), this.nativeAudioTrack);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, C60P.A1M(". ", str, C3cG.A0f(audioTrackStartErrorCode, "Start playout error: ")));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackStartError(audioTrackStartErrorCode.toString(), FGI.A0M("Start playout error: ", str), this.nativeAudioTrack);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        Logging.w(TAG, FGI.A0T("Default usage attribute is changed from: ", " to ", DEFAULT_USAGE, i));
        usageAttribute = i;
    }

    private boolean setBuiltInEQPreset(int i) {
        Logging.d(TAG, FGI.A0G("setBuiltInEQPreset(", ')', i));
        if (this.effects == null) {
            Logging.e(TAG, "Built-in audio effects are not supported on this platform");
            return false;
        }
        Logging.w(WebRtcAudioEffects.TAG, "Platform EQ is not supported");
        return false;
    }

    private boolean setBuiltInLEGainDb(int i) {
        Logging.d(TAG, FGI.A0G("setBuiltInLEGainDb(", ')', i));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setBuiltInLEGainDb(i);
        }
        Logging.e(TAG, "Built-in audio effects are not supported on this platform");
        return false;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, FGI.A0I("setStreamVolume(", i, ")"));
        assertTrue(AnonymousClass002.A1X(this.audioManager));
        if (this.audioManager.isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() throws IllegalStateException {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "startPlayout");
        assertTrue(AnonymousClass002.A1X(this.audioTrack));
        assertTrue(AnonymousClass002.A1Y(this.audioThread));
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, FGI.A0H("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, BV5.A0n("AudioTrack.play failed: ", e));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "stopPlayout");
        assertTrue(AnonymousClass002.A1X(this.audioThread));
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.latencyUtils = new WebRtcAudioLatencyUtils();
        threadChecker.checkIsOnValidThread();
        Logging.d(TAG, BV7.A0y("ctor"));
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.applicationContext.getSystemService("audio");
        this.effects = new WebRtcAudioEffects();
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        Logging.d(TAG, FGI.A0H("underrun count: ", this.audioTrack.getUnderrunCount()));
    }

    public static void setSpeakerMute(boolean z) {
        Logging.w(TAG, FGI.A0q("setSpeakerMute(", ")", z));
        speakerMute = z;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }
}
