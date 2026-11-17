package org.webrtc.voiceengine;

import X.BV4;
import X.BV7;
import X.C60O;
import X.FGI;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* loaded from: classes5.dex */
public final class WebRtcAudioUtils {
    public static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    public static final String TAG = "WebRtcAudioUtils";
    public static int defaultSampleRateHz = 16000;
    public static boolean isDefaultSampleRateOverridden;
    public static boolean useWebRtcBasedAcousticEchoCanceler;
    public static boolean useWebRtcBasedNoiseSuppressor;
    public static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    public static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    public static final String[] BLACKLISTED_NS_MODELS = new String[0];

    public static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        int length = devices.length;
        if (length != 0) {
            Logging.d(str, "Audio Devices: ");
            int i = 0;
            do {
                AudioDeviceInfo audioDeviceInfo = devices[i];
                StringBuilder sbA0x = C60O.A0x("  ");
                sbA0x.append(deviceTypeToString(audioDeviceInfo.getType()));
                sbA0x.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sbA0x.append("channels=");
                    sbA0x.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sbA0x.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sbA0x.append("encodings=");
                    sbA0x.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sbA0x.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sbA0x.append("sample rates=");
                    sbA0x.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sbA0x.append(", ");
                }
                sbA0x.append("id=");
                Logging.d(str, BV4.A0l(sbA0x, audioDeviceInfo.getId()));
                i++;
            } while (i < length);
        }
    }

    public static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        boolean zIsVolumeFixed = audioManager.isVolumeFixed();
        Logging.d(str, FGI.A0r("  fixed volume=", zIsVolumeFixed));
        if (zIsVolumeFixed) {
            return;
        }
        int i = 0;
        do {
            int i2 = iArr[i];
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(FGI.A0U("  ", streamTypeToString(i2), ": "));
            sbA0w.append("volume=");
            sbA0w.append(audioManager.getStreamVolume(i2));
            sbA0w.append(", max=");
            sbA0w.append(audioManager.getStreamMaxVolume(i2));
            logIsStreamMute(str, audioManager, i2, sbA0w);
            Logging.d(str, sbA0w.toString());
            i++;
        } while (i < 6);
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        return defaultSampleRateHz;
    }

    public static String getThreadInfo() {
        Thread threadCurrentThread = Thread.currentThread();
        return FGI.A0g("@[name=", threadCurrentThread.getName(), ", id=", "]", threadCurrentThread.getId());
    }

    public static boolean hasMicrophone() {
        return WebRtcAudioManager.hasSystemFeature(ContextUtils.applicationContext.getPackageManager(), "android.hardware.microphone");
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        return isDefaultSampleRateOverridden;
    }

    public static void logAudioStateBasic(String str, AudioManager audioManager) {
        StringBuilder sbA0x = C60O.A0x("Audio State: audio mode: ");
        sbA0x.append(modeToString(audioManager.getMode()));
        sbA0x.append(", has mic: ");
        sbA0x.append(hasMicrophone());
        sbA0x.append(", mic muted: ");
        sbA0x.append(audioManager.isMicrophoneMute());
        sbA0x.append(", music active: ");
        sbA0x.append(audioManager.isMusicActive());
        sbA0x.append(", speakerphone: ");
        sbA0x.append(audioManager.isSpeakerphoneOn());
        sbA0x.append(", BT SCO: ");
        sbA0x.append(audioManager.isBluetoothScoOn());
        Logging.d(str, sbA0x.toString());
    }

    public static void logDeviceInfo(String str) {
        StringBuilder sbA0x = C60O.A0x("Android SDK: ");
        sbA0x.append(Build.VERSION.SDK_INT);
        sbA0x.append(", Release: ");
        sbA0x.append(Build.VERSION.RELEASE);
        sbA0x.append(", Brand: ");
        sbA0x.append(Build.BRAND);
        sbA0x.append(", Device: ");
        sbA0x.append(Build.DEVICE);
        sbA0x.append(", Id: ");
        sbA0x.append(Build.ID);
        sbA0x.append(", Hardware: ");
        sbA0x.append(Build.HARDWARE);
        sbA0x.append(", Manufacturer: ");
        sbA0x.append(Build.MANUFACTURER);
        sbA0x.append(", Model: ");
        sbA0x.append(Build.MODEL);
        sbA0x.append(", Product: ");
        BV7.A1F(Build.PRODUCT, str, sbA0x);
    }

    public static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        sb.append(", muted=");
        sb.append(audioManager.isStreamMute(i));
    }

    public static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        isDefaultSampleRateOverridden = true;
        defaultSampleRateHz = i;
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        useWebRtcBasedAcousticEchoCanceler = z;
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        Logging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        useWebRtcBasedNoiseSuppressor = z;
    }

    public static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        if (useWebRtcBasedAcousticEchoCanceler) {
            Logging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
        }
        return useWebRtcBasedAcousticEchoCanceler;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        if (useWebRtcBasedNoiseSuppressor) {
            Logging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
        }
        return useWebRtcBasedNoiseSuppressor;
    }

    public static String deviceTypeToString(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isDynamicsProcessingSupported() {
        return WebRtcAudioEffects.canUseDynamicsProcessing();
    }

    public static boolean isLoudnessEnhancerSupported() {
        return WebRtcAudioEffects.canUseLoudnessEnhancer();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.applicationContext.getSystemService("audio");
        if (audioManager == null) {
            Logging.w(str, "AudioManager is null, skip logging for audio state");
            return;
        }
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }
}
