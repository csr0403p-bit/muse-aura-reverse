package org.webrtc.voiceengine;

import X.BV7;
import X.BV8;
import X.C60O;
import X.FGI;
import android.media.audiofx.DynamicsProcessing;
import org.webrtc.Logging;

/* loaded from: classes5.dex */
public class MetaAudioDynamicsProcessingEffect {
    public static final String TAG = "MetaAudioDynamicsProcessingEffect";
    public int audioSessionId;
    public DynamicsProcessing dp;

    public class MetaDynamicsProcessingEffectConfig {
        public DynamicsProcessing.Config metaConfig;
    }

    public synchronized void release() {
        DynamicsProcessing dynamicsProcessing = this.dp;
        if (dynamicsProcessing != null) {
            dynamicsProcessing.release();
            this.dp = null;
        }
    }

    public MetaAudioDynamicsProcessingEffect(int i, DynamicsProcessing.Config config) {
        String str;
        this.audioSessionId = i;
        if (WebRtcAudioEffects.canUseDynamicsProcessing()) {
            try {
                this.dp = new DynamicsProcessing(0, this.audioSessionId, config);
                Logging.d(TAG, "Succeeded in creating DynamicsProcessing effect");
                DynamicsProcessing.Eq preEq = config.getChannelByChannelIndex(0).getPreEq();
                Logging.d(TAG, FGI.A0r("PreEQ enabled: ", preEq.isEnabled()));
                for (int i2 = 0; i2 < preEq.getBandCount(); i2++) {
                    DynamicsProcessing.EqBand band = preEq.getBand(i2);
                    StringBuilder sbA0w = C60O.A0w();
                    BV7.A1G("PreEQ band ", " cutoff freq: ", sbA0w, i2);
                    sbA0w.append(band.getCutoffFrequency());
                    sbA0w.append("Hz, gain: ");
                    sbA0w.append(band.getGain());
                    BV7.A1F("dB", TAG, sbA0w);
                }
                DynamicsProcessing.Mbc mbcA0a = BV7.A0a(config);
                Logging.d(TAG, FGI.A0r("MBC enabled: ", mbcA0a.isEnabled()));
                for (int i3 = 0; i3 < mbcA0a.getBandCount(); i3++) {
                    DynamicsProcessing.MbcBand band2 = mbcA0a.getBand(i3);
                    StringBuilder sbA0w2 = C60O.A0w();
                    BV7.A1G("MBC band ", " cutoff freq: ", sbA0w2, i3);
                    sbA0w2.append(band2.getCutoffFrequency());
                    sbA0w2.append("Hz, attack time: ");
                    sbA0w2.append(band2.getAttackTime());
                    sbA0w2.append("ms, release time: ");
                    sbA0w2.append(band2.getReleaseTime());
                    sbA0w2.append("ms, threshold: ");
                    sbA0w2.append(band2.getThreshold());
                    sbA0w2.append("dBFS, ratio: ");
                    sbA0w2.append(band2.getRatio());
                    sbA0w2.append(":1, kneewidth: ");
                    sbA0w2.append(band2.getKneeWidth());
                    sbA0w2.append("dB, noise gate threshold:");
                    sbA0w2.append(band2.getNoiseGateThreshold());
                    sbA0w2.append("dBFS, expander ratio: ");
                    sbA0w2.append(band2.getExpanderRatio());
                    sbA0w2.append(":1, pre gain: ");
                    sbA0w2.append(band2.getPreGain());
                    sbA0w2.append("dB, post gain: ");
                    sbA0w2.append(band2.getPostGain());
                    BV7.A1F("dB", TAG, sbA0w2);
                }
                DynamicsProcessing.Eq postEq = config.getChannelByChannelIndex(0).getPostEq();
                Logging.d(TAG, FGI.A0r("PostEQ enabled: ", postEq.isEnabled()));
                for (int i4 = 0; i4 < postEq.getBandCount(); i4++) {
                    DynamicsProcessing.EqBand band3 = postEq.getBand(i4);
                    StringBuilder sbA0w3 = C60O.A0w();
                    BV7.A1G("PostEQ band ", " cutoff freq: ", sbA0w3, i4);
                    sbA0w3.append(band3.getCutoffFrequency());
                    sbA0w3.append("Hz, gain: ");
                    sbA0w3.append(band3.getGain());
                    BV7.A1F("dB", TAG, sbA0w3);
                }
                DynamicsProcessing.Limiter limiter = config.getChannelByChannelIndex(0).getLimiter();
                Logging.d(TAG, FGI.A0r("Limiter enabled: ", limiter.isEnabled()));
                StringBuilder sbA0w4 = C60O.A0w();
                sbA0w4.append("Limiter attack time: ");
                sbA0w4.append(limiter.getAttackTime());
                sbA0w4.append("ms, release time: ");
                sbA0w4.append(limiter.getReleaseTime());
                sbA0w4.append("ms, threshold: ");
                sbA0w4.append(limiter.getThreshold());
                sbA0w4.append("dBFS, post gain: ");
                sbA0w4.append(limiter.getPostGain());
                sbA0w4.append("dB, ratio: ");
                sbA0w4.append(limiter.getRatio());
                sbA0w4.append(":1, link group: ");
                sbA0w4.append(limiter.getLinkGroup());
                BV7.A1F("", TAG, sbA0w4);
            } catch (Exception e) {
                e = e;
                str = "MetaAudioDynamicsProcessingEffect failed to create";
                Logging.e(TAG, str, e);
            } catch (NoClassDefFoundError e2) {
                e = e2;
                str = "MetaAudioDynamicsProcessingEffect creation encountered NoClassDefFoundError";
                Logging.e(TAG, str, e);
            }
        }
    }

    public synchronized void enable(boolean z) {
        DynamicsProcessing dynamicsProcessing = this.dp;
        if (dynamicsProcessing != null) {
            boolean enabled = dynamicsProcessing.getEnabled();
            if (this.dp.setEnabled(z) != 0) {
                Logging.e(TAG, "Failed to set the DynamicsProcessing state");
            }
            StringBuilder sbA0x = C60O.A0x("DynamicsProcessing: was ");
            BV8.A1N(enabled ? "enabled" : "disabled", sbA0x, z);
            BV7.A1F(this.dp.getEnabled() ? "enabled" : "disabled", TAG, sbA0x);
        }
    }
}
