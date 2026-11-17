package org.webrtc.voiceengine;

import X.BV7;
import X.BV8;
import X.C3cG;
import X.C60O;
import android.media.audiofx.LoudnessEnhancer;
import org.webrtc.Logging;

/* loaded from: classes5.dex */
public class MetaAudioLoudnessEnhancerEffect {
    public static final String TAG = "MetaAudioLoudnessEnhancerEffect";
    public LoudnessEnhancer le;

    public class LoudnessEnhancerEffectConfig {
        public int targetGainDb;
    }

    public synchronized void release() {
        LoudnessEnhancer loudnessEnhancer = this.le;
        if (loudnessEnhancer != null) {
            loudnessEnhancer.release();
            this.le = null;
        }
    }

    public MetaAudioLoudnessEnhancerEffect(int i, LoudnessEnhancerEffectConfig loudnessEnhancerEffectConfig) throws IllegalStateException, UnsupportedOperationException, IllegalArgumentException {
        String str;
        if (WebRtcAudioEffects.canUseLoudnessEnhancer()) {
            try {
                this.le = new LoudnessEnhancer(i);
            } catch (Exception e) {
                Logging.e(TAG, "MetaAudioLoudnessEnhancerEffect failed to create LoudnessEnhancer object", e);
                this.le = null;
            } catch (NoClassDefFoundError e2) {
                Logging.e(TAG, "MetaAudioLoudnessEnhancerEffect creation encountered NoClassDefFoundError", e2);
            }
            LoudnessEnhancer loudnessEnhancer = this.le;
            if (loudnessEnhancer != null) {
                float targetGain = loudnessEnhancer.getTargetGain() / 100.0f;
                StringBuilder sbA0g = C3cG.A0g("LoudnessEnhancer: Prior target gain(dB): ");
                sbA0g.append(targetGain);
                Logging.d(TAG, sbA0g.toString());
                if (loudnessEnhancerEffectConfig != null) {
                    this.le.setTargetGain(loudnessEnhancerEffectConfig.targetGainDb * 100);
                    float targetGain2 = this.le.getTargetGain() / 100.0f;
                    StringBuilder sbA0g2 = C3cG.A0g("LoudnessEnhancer: Current target gain(dB): ");
                    sbA0g2.append(targetGain2);
                    Logging.d(TAG, sbA0g2.toString());
                    return;
                }
                str = "LoudnessEnhancer config is null!";
            } else {
                str = "Failed to create LoudnessEnhancer effect!";
            }
            Logging.e(TAG, str);
        }
    }

    public synchronized void enable(boolean z) {
        LoudnessEnhancer loudnessEnhancer = this.le;
        if (loudnessEnhancer != null) {
            boolean enabled = loudnessEnhancer.getEnabled();
            if (this.le.setEnabled(z) != 0) {
                Logging.e(TAG, "Failed to set the LoudnessEnhancer state");
            }
            StringBuilder sbA0x = C60O.A0x("LoudnessEnhancer: was ");
            BV8.A1N(enabled ? "enabled" : "disabled", sbA0x, z);
            BV7.A1F(this.le.getEnabled() ? "enabled" : "disabled", TAG, sbA0x);
        }
    }
}
