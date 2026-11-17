package org.webrtc.voiceengine;

import X.BV4;
import X.BV7;
import X.FGI;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;
import org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect;

/* loaded from: classes5.dex */
public class WebRtcAudioEffects {
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioEffects";
    public static AudioEffect.Descriptor[] cachedEffects;
    public static volatile MetaAudioDynamicsProcessingEffect dp;
    public static volatile MetaAudioLoudnessEnhancerEffect le;
    public AcousticEchoCanceler aec;
    public MetaAudioLoudnessEnhancerEffect.LoudnessEnhancerEffectConfig leConfig = new MetaAudioLoudnessEnhancerEffect.LoudnessEnhancerEffectConfig();
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableDp;
    public boolean shouldEnableLe;
    public boolean shouldEnableNs;

    private boolean effectTypeIsVoIP(UUID uuid) {
        UUID uuid2 = AudioEffect.EFFECT_TYPE_AEC;
        if (!uuid2.equals(uuid) || !isEffectTypeAvailable(uuid2)) {
            UUID uuid3 = AudioEffect.EFFECT_TYPE_NS;
            if (!uuid3.equals(uuid) || !isEffectTypeAvailable(uuid3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
        if (le != null) {
            le.release();
            le = null;
        }
        if (dp != null) {
            dp.release();
            dp = null;
        }
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw BV4.A0N("Expected condition to be true");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean canUseAcousticEchoCanceler() {
        /*
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto L1b
            boolean r0 = org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler()
            if (r0 != 0) goto L1b
            boolean r0 = isAcousticEchoCancelerBlacklisted()
            if (r0 != 0) goto L1b
            boolean r0 = isAcousticEchoCancelerExcludedByUUID()
            r2 = 1
            if (r0 == 0) goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.String r0 = "canUseAcousticEchoCanceler: "
            java.lang.String r1 = X.FGI.A0r(r0, r2)
            java.lang.String r0 = "WebRtcAudioEffects"
            org.webrtc.Logging.d(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.canUseAcousticEchoCanceler():boolean");
    }

    public static boolean canUseDynamicsProcessing() {
        boolean zIsEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
        Logging.d(TAG, FGI.A0r("canUseDynamicsProcessing: ", zIsEffectTypeAvailable));
        return zIsEffectTypeAvailable;
    }

    public static boolean canUseLoudnessEnhancer() {
        boolean zIsEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
        Logging.d(TAG, FGI.A0r("canUseLoudnessEnhancer: ", zIsEffectTypeAvailable));
        return zIsEffectTypeAvailable;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean canUseNoiseSuppressor() {
        /*
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto L1b
            boolean r0 = org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor()
            if (r0 != 0) goto L1b
            boolean r0 = isNoiseSuppressorBlacklisted()
            if (r0 != 0) goto L1b
            boolean r0 = isNoiseSuppressorExcludedByUUID()
            r2 = 1
            if (r0 == 0) goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.String r0 = "canUseNoiseSuppressor: "
            java.lang.String r1 = X.FGI.A0r(r0, r2)
            java.lang.String r0 = "WebRtcAudioEffects"
            org.webrtc.Logging.d(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.canUseNoiseSuppressor():boolean");
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    public static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        Logging.d(TAG, "Querying available audio effects begin");
        cachedEffects = AudioEffect.queryEffects();
        Logging.d(TAG, "Querying available audio effects end");
        return cachedEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List listAsList = Arrays.asList(WebRtcAudioUtils.BLACKLISTED_AEC_MODELS);
        String str = Build.MODEL;
        boolean zContains = listAsList.contains(str);
        if (zContains) {
            Logging.w(TAG, FGI.A0M(str, " is blacklisted for HW AEC usage!"));
        }
        return zContains;
    }

    public static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isDynamicsProcessingEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
    }

    public static boolean isDynamicsProcessingSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
    }

    public static boolean isLoudnessEnhancerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
    }

    public static boolean isLoudnessEnhancerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List listAsList = Arrays.asList(WebRtcAudioUtils.BLACKLISTED_NS_MODELS);
        String str = Build.MODEL;
        boolean zContains = listAsList.contains(str);
        if (zContains) {
            Logging.w(TAG, FGI.A0M(str, " is blacklisted for HW NS usage!"));
        }
        return zContains;
    }

    public static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: all -> 0x014e, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0019, B:8:0x001f, B:10:0x0028, B:12:0x0033, B:14:0x0037, B:17:0x003f, B:19:0x004e, B:21:0x005b, B:23:0x0067, B:22:0x0060, B:25:0x006f, B:27:0x0073, B:29:0x0079, B:32:0x008b, B:34:0x008f, B:36:0x009a, B:38:0x00a2, B:39:0x00a9, B:41:0x00b1, B:43:0x00b9, B:45:0x00c1, B:48:0x00c9, B:50:0x00d1, B:51:0x00d6, B:54:0x00de, B:57:0x00eb, B:60:0x00f5, B:61:0x00fa, B:63:0x0102, B:65:0x010a, B:67:0x0112, B:69:0x0118, B:71:0x0120, B:72:0x0125, B:77:0x0133, B:80:0x0140, B:82:0x0147), top: B:88:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void enable(int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.enable(int, boolean):void");
    }

    public boolean setAEC(boolean z) {
        Logging.d(TAG, FGI.A0q("setAEC(", ")", z));
        if (!canUseAcousticEchoCanceler()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        }
        Logging.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setBuiltInEQPreset(int i) {
        Logging.w(TAG, "Platform EQ is not supported");
        return false;
    }

    public boolean setDP(boolean z) {
        Logging.d(TAG, FGI.A0q("setDP(", ")", z));
        if (!canUseDynamicsProcessing()) {
            Logging.w(TAG, "Platform DP is not supported");
            this.shouldEnableDp = false;
            return false;
        }
        if (dp == null || z == this.shouldEnableDp) {
            this.shouldEnableDp = z;
            return true;
        }
        Logging.e(TAG, "Platform DP state can't be modified while playing");
        return false;
    }

    public WebRtcAudioEffects() {
        Logging.d(TAG, BV7.A0y("ctor"));
    }

    public static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static void toggleAudioPlayerEffects(boolean z) {
        Logging.d(TAG, FGI.A0r("toggleAudioPlayerEffects to ", z));
        try {
            if (dp != null) {
                dp.enable(z);
            }
            if (le != null) {
                le.enable(z);
            }
        } catch (Exception e) {
            Logging.e(TAG, "Failed to toggle audio effects for the player", e);
        }
    }

    public boolean setBuiltInLEGainDb(int i) {
        if (canUseLoudnessEnhancer()) {
            this.leConfig.targetGainDb = i;
            return true;
        }
        Logging.w(TAG, "Platform LE is not supported");
        this.shouldEnableLe = false;
        return false;
    }

    public boolean setLE(boolean z) {
        Logging.d(TAG, FGI.A0q("setLE(", ")", z));
        if (!canUseLoudnessEnhancer()) {
            Logging.w(TAG, "Platform LE is not supported");
            this.shouldEnableLe = false;
            return false;
        }
        if (le == null || z == this.shouldEnableLe) {
            this.shouldEnableLe = z;
            return true;
        }
        Logging.e(TAG, "Platform LE state can't be modified while playing");
        return false;
    }

    public boolean setNS(boolean z) {
        Logging.d(TAG, FGI.A0q("setNS(", ")", z));
        if (!canUseNoiseSuppressor()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        }
        Logging.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
