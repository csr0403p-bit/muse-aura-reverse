package org.webrtc.voiceengine;

import X.BV7;
import X.FGI;
import android.media.audiofx.DynamicsProcessing;
import org.webrtc.Logging;

/* loaded from: classes5.dex */
public class MetaAudioDynamicsProcessingEffectConfig {
    public static final int CONFIG_CHANNEL_COUNT = 1;
    public static final int CONFIG_DEFAULT_MBC_BANDS = 8;
    public static final int CONFIG_DEFAULT_POSTEQ_BANDS = 8;
    public static final int CONFIG_DEFAULT_PREEQ_BANDS = 8;
    public static final boolean CONFIG_DEFAULT_USE_LIMITER = true;
    public static final boolean CONFIG_DEFAULT_USE_MBC = true;
    public static final boolean CONFIG_DEFAULT_USE_POSTEQ = true;
    public static final boolean CONFIG_DEFAULT_USE_PREEQ = true;
    public static final int CONFIG_DEFAULT_VARIANT = 0;
    public static final String TAG = "MetaAudioDynamicsProcessingEffectConfig";
    public static DynamicsProcessing.Config config;
    public DynamicsProcessing.Config.Builder builder;
    public final long nativeDynamicsProcessingEffectConfig;

    private native void nativeReportDynamicProcessingEffectConfigInitError(String str, long j);

    public static DynamicsProcessing.Config getConfig() {
        return config;
    }

    private void reportDynamicProcessingEffectConfigInitError(String str) {
        Logging.e(TAG, FGI.A0M("Config creation error: ", str));
        nativeReportDynamicProcessingEffectConfigInitError(FGI.A0M("DP config creation error: ", str), this.nativeDynamicsProcessingEffectConfig);
    }

    public boolean setLimiterAttackTime(float f) {
        DynamicsProcessing.Config config2 = config;
        boolean z = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter attack time failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setAttackTime(f);
            z = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter attack time", e);
            return z;
        }
    }

    public boolean setLimiterEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        boolean z2 = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set limiter enabled state failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setEnabled(z);
            z2 = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter enabled state", e);
            return z2;
        }
    }

    public boolean setLimiterLinkGroup(int i) {
        DynamicsProcessing.Config config2 = config;
        boolean z = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter link group failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setLinkGroup(i);
            z = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter link group", e);
            return z;
        }
    }

    public boolean setLimiterPostGain(float f) {
        DynamicsProcessing.Config config2 = config;
        boolean z = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter post-gain failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setPostGain(f);
            z = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter post gain", e);
            return z;
        }
    }

    public boolean setLimiterRatio(float f) {
        DynamicsProcessing.Config config2 = config;
        boolean z = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter ratio failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setRatio(f);
            z = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter ratio", e);
            return z;
        }
    }

    public boolean setLimiterReleaseTime(float f) {
        DynamicsProcessing.Config config2 = config;
        boolean z = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter release time failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setReleaseTime(f);
            z = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter release time", e);
            return z;
        }
    }

    public boolean setLimiterThreshold(float f) {
        DynamicsProcessing.Config config2 = config;
        boolean z = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set Limiter threshold failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getLimiter().setThreshold(f);
            z = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set limiter threshold", e);
            return z;
        }
    }

    public boolean setMbcAttackTime(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC attack time failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setAttackTime(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setAttackTime(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC attack time", e);
            return false;
        }
    }

    public boolean setMbcEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        boolean z2 = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC enabled state failed due to null config");
            return false;
        }
        try {
            BV7.A0a(config2).setEnabled(z);
            z2 = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC enabled state", e);
            return z2;
        }
    }

    public boolean setMbcExpanderRatio(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC expander ratio failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setExpanderRatio(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setExpanderRatio(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC expander ratio", e);
            return false;
        }
    }

    public boolean setMbcKneeWidth(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC kneewidth failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setKneeWidth(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setKneeWidth(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC kneewidth", e);
            return false;
        }
    }

    public boolean setMbcNoiseGateThreshold(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC noise-gate threshold failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setNoiseGateThreshold(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setNoiseGateThreshold(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC noise-gate threshold", e);
            return false;
        }
    }

    public boolean setMbcPostGain(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC post-gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setPostGain(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setPostGain(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC post-gain", e);
            return false;
        }
    }

    public boolean setMbcPreGain(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC pre-gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setPreGain(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setPreGain(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC pre-gain", e);
            return false;
        }
    }

    public boolean setMbcRatio(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC ratio failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setRatio(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setRatio(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC compression ratio", e);
            return false;
        }
    }

    public boolean setMbcReleaseTime(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC release time failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setReleaseTime(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setReleaseTime(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC release time", e);
            return false;
        }
    }

    public boolean setMbcThreshold(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set MBC threshold failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config2);
            if (!z) {
                mbcA0a.getBand(i).setThreshold(f);
                return true;
            }
            for (int i2 = 0; i2 < mbcA0a.getBandCount(); i2++) {
                mbcA0a.getBand(i2).setThreshold(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set MBC compression threshold", e);
            return false;
        }
    }

    public boolean setPostEqEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        boolean z2 = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set postEq enabled state failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getPostEq().setEnabled(z);
            z2 = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set postEq enabled state", e);
            return z2;
        }
    }

    public boolean setPostEqGainDb(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set PostEq gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Eq postEq = config2.getChannelByChannelIndex(0).getPostEq();
            if (!z) {
                postEq.getBand(i).setGain(f);
                return true;
            }
            for (int i2 = 0; i2 < postEq.getBandCount(); i2++) {
                postEq.getBand(i2).setGain(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set postEq gain", e);
            return false;
        }
    }

    public boolean setPreEqEnabled(boolean z) {
        DynamicsProcessing.Config config2 = config;
        boolean z2 = false;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set preEq enabled state failed due to null config");
            return false;
        }
        try {
            config2.getChannelByChannelIndex(0).getPreEq().setEnabled(z);
            z2 = true;
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set preEq enabled state", e);
            return z2;
        }
    }

    public boolean setPreEqGainDb(int i, float f, boolean z) {
        DynamicsProcessing.Config config2 = config;
        if (config2 == null) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig set preEq gain failed due to null config");
            return false;
        }
        try {
            DynamicsProcessing.Eq preEq = config2.getChannelByChannelIndex(0).getPreEq();
            if (!z) {
                preEq.getBand(i).setGain(f);
                return true;
            }
            for (int i2 = 0; i2 < preEq.getBandCount(); i2++) {
                preEq.getBand(i2).setGain(f);
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to set preEq gain", e);
            return false;
        }
    }

    public MetaAudioDynamicsProcessingEffectConfig(long j) {
        Logging.d(TAG, BV7.A0y("ctor"));
        this.nativeDynamicsProcessingEffectConfig = j;
        if (WebRtcAudioEffects.canUseDynamicsProcessing()) {
            try {
                DynamicsProcessing.Config.Builder builder = new DynamicsProcessing.Config.Builder(0, 1, true, 8, true, 8, true, 8, true);
                this.builder = builder;
                builder.setPreferredFrameDuration(10.0f);
                config = this.builder.build();
            } catch (Exception e) {
                Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig failed to create the default config", e);
                reportDynamicProcessingEffectConfigInitError("MetaAudioDynamicsProcessingEffectConfig init failed");
            } catch (NoClassDefFoundError e2) {
                Logging.e(TAG, "MetaAudioDynamicsProcessingEffectConfig creation encountered NoClassDefFoundError", e2);
            }
        }
    }
}
