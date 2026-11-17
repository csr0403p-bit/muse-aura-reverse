package org.webrtc;

import X.BV4;
import X.FGI;
import android.media.MediaCodecInfo;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.Predicate;

/* loaded from: classes5.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    public static final String TAG = "HardwareVideoDecoderFactory";
    public static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: org.webrtc.HardwareVideoDecoderFactory.1
        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate<MediaCodecInfo> and(Predicate<? super MediaCodecInfo> predicate) {
            return new Predicate.AnonymousClass2(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate<MediaCodecInfo> negate() {
            return new Predicate.AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate<MediaCodecInfo> or(Predicate<? super MediaCodecInfo> predicate) {
            return new Predicate.AnonymousClass1(this, predicate);
        }

        @Override // org.webrtc.Predicate
        public /* bridge */ /* synthetic */ boolean test(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isHardwareAccelerated();
        }

        /* renamed from: test, reason: avoid collision after fix types in other method */
        public boolean test2(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
    };

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null, null);
    }

    public static Predicate<MediaCodecInfo> av1AllowedPredicate(Map<String, Integer> map) {
        if (map == null || !BV4.A0W().equals(map.get(MediaCodecUtils.DISABLE_AV1_HW_DECODER))) {
            return null;
        }
        return new Predicate<MediaCodecInfo>() { // from class: org.webrtc.HardwareVideoDecoderFactory.2
            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo> and(Predicate<? super MediaCodecInfo> predicate) {
                return new Predicate.AnonymousClass2(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo> negate() {
                return new Predicate.AnonymousClass3();
            }

            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo> or(Predicate<? super MediaCodecInfo> predicate) {
                return new Predicate.AnonymousClass1(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public boolean test(MediaCodecInfo mediaCodecInfo) {
                String name = mediaCodecInfo.getName();
                if (!name.toLowerCase().contains("av1")) {
                    return true;
                }
                Logging.d(HardwareVideoDecoderFactory.TAG, FGI.A0M(name, " dropped due to av1 hw decoder disabled"));
                return false;
            }
        };
    }

    public static Predicate<MediaCodecInfo.CodecCapabilities> getPreferredCodecAllowedPredicate(Map<String, Integer> map) {
        if (map == null || !BV4.A0W().equals(map.get(MediaCodecUtils.ENABLE_LOW_LATENCY_DECODER))) {
            return null;
        }
        return new Predicate<MediaCodecInfo.CodecCapabilities>() { // from class: org.webrtc.HardwareVideoDecoderFactory.4
            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo.CodecCapabilities> and(Predicate<? super MediaCodecInfo.CodecCapabilities> predicate) {
                return new Predicate.AnonymousClass2(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo.CodecCapabilities> negate() {
                return new Predicate.AnonymousClass3();
            }

            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo.CodecCapabilities> or(Predicate<? super MediaCodecInfo.CodecCapabilities> predicate) {
                return new Predicate.AnonymousClass1(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public /* bridge */ /* synthetic */ boolean test(MediaCodecInfo.CodecCapabilities codecCapabilities) {
                return MediaCodecUtils.codecSupportsLowLatencyDecode(codecCapabilities);
            }

            /* renamed from: test, reason: avoid collision after fix types in other method */
            public boolean test2(MediaCodecInfo.CodecCapabilities codecCapabilities) {
                return MediaCodecUtils.codecSupportsLowLatencyDecode(codecCapabilities);
            }
        };
    }

    public static Predicate<MediaCodecInfo> socAllowedPredicate(Map<String, Integer> map) {
        if (map == null || !BV4.A0W().equals(map.get(MediaCodecUtils.ENABLE_QUALCOMM_SOC_TARGETING))) {
            return null;
        }
        return new Predicate<MediaCodecInfo>() { // from class: org.webrtc.HardwareVideoDecoderFactory.3
            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo> and(Predicate<? super MediaCodecInfo> predicate) {
                return new Predicate.AnonymousClass2(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo> negate() {
                return new Predicate.AnonymousClass3();
            }

            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate<MediaCodecInfo> or(Predicate<? super MediaCodecInfo> predicate) {
                return new Predicate.AnonymousClass1(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public boolean test(MediaCodecInfo mediaCodecInfo) {
                String name = mediaCodecInfo.getName();
                if (name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.QCOM_HEXAGON_DSP_PREFIX)) {
                    return true;
                }
                Logging.d(HardwareVideoDecoderFactory.TAG, FGI.A0M(name, " dropped due to qcom soc targeting"));
                return false;
            }
        };
    }

    public static Predicate<MediaCodecInfo> getCombinedCodecAllowedPredicate(Map<String, Integer> map, Predicate<MediaCodecInfo> predicate) {
        Predicate<MediaCodecInfo> predicateAnd = defaultAllowedPredicate;
        Predicate<MediaCodecInfo> predicateSocAllowedPredicate = socAllowedPredicate(map);
        Predicate<MediaCodecInfo> predicateAv1AllowedPredicate = av1AllowedPredicate(map);
        if (predicateSocAllowedPredicate != null) {
            predicateAnd = predicateSocAllowedPredicate.and(predicateAnd);
        }
        if (predicateAv1AllowedPredicate != null) {
            predicateAnd = predicateAv1AllowedPredicate.and(predicateAnd);
        }
        return predicate != null ? predicate.and(predicateAnd) : predicateAnd;
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate, Map<String, Integer> map) {
        super(context, false, getCombinedCodecAllowedPredicate(map, predicate), map, getPreferredCodecAllowedPredicate(map));
    }

    public HardwareVideoDecoderFactory(EglBase.Context context, boolean z, Predicate<MediaCodecInfo> predicate, Map<String, Integer> map) {
        super(context, z, getCombinedCodecAllowedPredicate(map, predicate), map, getPreferredCodecAllowedPredicate(map));
    }

    public HardwareVideoDecoderFactory(EglBase.Context context, boolean z) {
        this(context, z, null, null);
    }

    public HardwareVideoDecoderFactory(EglBase.Context context, Map<String, Integer> map) {
        this(context, null, map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        Predicate<MediaCodecInfo> predicate2 = defaultAllowedPredicate;
        super(context, predicate != null ? predicate.and(predicate2) : predicate2);
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }
}
