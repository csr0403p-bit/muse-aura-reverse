package org.webrtc.voiceengine;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.FGI;
import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

/* loaded from: classes5.dex */
public class WebRtcAudioRecord {
    public static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int BUFFER_SIZE_FACTOR = 2;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioRecord";
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    public static WebRtcAudioRecordErrorCallback errorCallback;
    public static volatile boolean microphoneMute;
    public AudioRecord audioRecord;
    public AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioRecord;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    public static int audioSource = 7;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public class AudioRecordThread extends Thread {
        public volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IllegalStateException, SecurityException, IllegalArgumentException {
            WebRtcAudioRecord webRtcAudioRecord;
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, BV7.A0y("AudioRecordThread"));
            WebRtcAudioRecord.assertTrue(AnonymousClass002.A1Q(WebRtcAudioRecord.this.audioRecord.getRecordingState(), 3));
            System.nanoTime();
            while (true) {
                boolean z = this.keepAlive;
                webRtcAudioRecord = WebRtcAudioRecord.this;
                if (!z) {
                    try {
                        break;
                    } catch (IllegalStateException e) {
                        Logging.e(WebRtcAudioRecord.TAG, BV5.A0n("AudioRecord.stop failed: ", e));
                        return;
                    }
                }
                AudioRecord audioRecord = webRtcAudioRecord.audioRecord;
                ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
                int i = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (i == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.byteBuffer.put(webRtcAudioRecord2.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord3 = WebRtcAudioRecord.this;
                        webRtcAudioRecord3.nativeDataIsRecorded(i, webRtcAudioRecord3.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String strA0H = FGI.A0H("AudioRecord.read failed: ", i);
                    Logging.e(WebRtcAudioRecord.TAG, strA0H);
                    if (i == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(strA0H);
                    }
                }
            }
            AudioRecord audioRecord2 = webRtcAudioRecord.audioRecord;
            if (audioRecord2 != null) {
                audioRecord2.stop();
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public class AudioSamples {
        public final int audioFormat;
        public final int channelCount;
        public final byte[] data;
        public final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i, long j);

    private native void nativeReportWebRtcAudioRecordError(String str, long j);

    private native void nativeReportWebRtcAudioRecordInitError(String str, long j);

    private native void nativeReportWebRtcAudioRecordStartError(String str, String str2, long j);

    public static void assertTrue(boolean z) {
        if (!z) {
            throw BV4.A0N("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        Logging.d(TAG, AnonymousClass006.A0z(C60O.A10("enableBuiltInAEC(", z)));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        Logging.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        Logging.d(TAG, AnonymousClass006.A0z(C60O.A10("enableBuiltInNS(", z)));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        Logging.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private int getAudioSessionId() {
        return this.audioRecord.getAudioSessionId();
    }

    public static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i, int i2) {
        String strA0H;
        Logging.d(TAG, FGI.A0Y("initRecording(sampleRate=", ", channels=", ")", i, i2));
        if (this.audioRecord != null) {
            strA0H = "InitRecording called twice without StopRecording.";
        } else {
            int i3 = i / 100;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * 2 * i3);
            this.byteBuffer = byteBufferAllocateDirect;
            Logging.d(TAG, FGI.A0H("byteBuffer.capacity: ", byteBufferAllocateDirect.capacity()));
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int i4 = i2 == 1 ? 16 : 12;
            int minBufferSize = AudioRecord.getMinBufferSize(i, i4, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                Logging.d(TAG, FGI.A0H("AudioRecord.getMinBufferSize: ", minBufferSize));
                int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                Logging.d(TAG, FGI.A0H("bufferSizeInBytes: ", iMax));
                try {
                    AudioRecord audioRecord = new AudioRecord(audioSource, i, i4, 2, iMax);
                    this.audioRecord = audioRecord;
                    if (audioRecord.getState() != 1) {
                        reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                        releaseAudioResources();
                        return -1;
                    }
                    Logging.d(TAG, "finished creating AudioRecord instance");
                    WebRtcAudioEffects webRtcAudioEffects = this.effects;
                    if (webRtcAudioEffects != null) {
                        webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId(), true);
                    }
                    Logging.d(TAG, "start logging AudioRecord parameters");
                    logMainParameters();
                    logMainParametersExtended();
                    Logging.d(TAG, "finish logging AudioRecord parameters");
                    return i3;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioRecordInitError(BV5.A0n("AudioRecord ctor error: ", e));
                    releaseAudioResources();
                    return -1;
                }
            }
            strA0H = FGI.A0H("AudioRecord.getMinBufferSize failed: ", minBufferSize);
        }
        reportWebRtcAudioRecordInitError(strA0H);
        return -1;
    }

    private void logMainParameters() {
        Logging.d(TAG, FGI.A0Z("AudioRecord: session ID: ", ", channels: ", ", sample rate: ", this.audioRecord.getAudioSessionId(), this.audioRecord.getChannelCount(), this.audioRecord.getSampleRate()));
    }

    private void logMainParametersExtended() {
        Logging.d(TAG, FGI.A0H("AudioRecord: buffer size in frames: ", this.audioRecord.getBufferSizeInFrames()));
    }

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, FGI.A0M("Run-time recording error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordError(FGI.A0M("Run-time recording error: ", str), this.nativeAudioRecord);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, FGI.A0M("Init recording error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordInitError(FGI.A0M("Init recording error: ", str), this.nativeAudioRecord);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, C60P.A1M(". ", str, C3cG.A0f(audioRecordStartErrorCode, "Start recording error: ")));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordStartError(audioRecordStartErrorCode.toString(), FGI.A0M("Start recording error: ", str), this.nativeAudioRecord);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        Logging.w(TAG, FGI.A0T("Audio source is changed from: ", " to ", audioSource, i));
        audioSource = i;
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public WebRtcAudioRecord(long j) {
        Logging.d(TAG, BV7.A0y("ctor"));
        this.nativeAudioRecord = j;
        this.effects = new WebRtcAudioEffects();
    }

    public static void setMicrophoneMute(boolean z) {
        Logging.w(TAG, FGI.A0q("setMicrophoneMute(", ")", z));
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() throws IllegalStateException {
        Logging.d(TAG, "startRecording");
        assertTrue(AnonymousClass002.A1X(this.audioRecord));
        assertTrue(AnonymousClass002.A1Y(this.audioThread));
        try {
            this.audioRecord.startRecording();
            Logging.d(TAG, "startRecording: finished calling audioRecord.startRecording");
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, FGI.A0H("AudioRecord.startRecording failed - incorrect state :", this.audioRecord.getRecordingState()));
                return false;
            }
            Logging.d(TAG, "startRecording: finished checking audioRecord.getRecordingState()");
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            Logging.d(TAG, "startRecording: finished starting audio playout thread");
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, BV5.A0n("AudioRecord.startRecording failed: ", e));
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.d(TAG, "stopRecording");
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stopThread();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
                WebRtcAudioUtils.logAudioState(TAG);
            }
            this.audioThread = null;
        }
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
