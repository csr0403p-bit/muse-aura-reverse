package org.webrtc;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.Map;

/* loaded from: classes5.dex */
public class MediaCodecUtils {
    public static final String ADAPTIVE_PLAYBACK_ENABLED = "fb-adaptive-playback-enabled";
    public static final String DISABLE_AV1_HW_DECODER = "fb-disable-av1-hw-decoder";
    public static final String ENABLE_LOW_LATENCY_DECODER = "fb-enable-low-latency-decoder";
    public static final String ENABLE_QUALCOMM_SOC_TARGETING = "fb-enable-qcom-soc-targeting";
    public static final String EXYNOS_PREFIX = "OMX.Exynos.";
    public static final String INTEL_PREFIX = "OMX.Intel.";
    public static final String MS_PREFIX = "OMX.MS.";
    public static final String MTK_PREFIX = "OMX.MTK.";
    public static final String NVIDIA_PREFIX = "OMX.Nvidia.";
    public static final String QCOM_HEXAGON_DSP_PREFIX = "c2.qti.";
    public static final String QCOM_PREFIX = "OMX.qcom.";
    public static final String TAG = "MediaCodecUtils";
    public static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    public static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    public static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final int[] TEXTURE_COLOR_FORMATS = {2130708361};

    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    /* renamed from: org.webrtc.MediaCodecUtils$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType;

        static {
            int[] iArr = new int[VideoCodecMimeType.values().length];
            $SwitchMap$org$webrtc$VideoCodecMimeType = iArr;
            try {
                AnonymousClass002.A13(VideoCodecMimeType.VP8, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VideoCodecMimeType.VP9, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VideoCodecMimeType.AV1, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(VideoCodecMimeType.H265, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(VideoCodecMimeType.H264, iArr);
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean codecSupportsAdaptivePlayback(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean codecSupportsLowLatencyDecode(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (codecCapabilities == null || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return codecCapabilities.isFeatureSupported("low-latency");
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (videoCodecMimeType.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> getCodecProperties(VideoCodecMimeType videoCodecMimeType, boolean z) {
        int iOrdinal = videoCodecMimeType.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 3 || iOrdinal == 4) {
            return BV4.A0u();
        }
        if (iOrdinal == 2) {
            return H264Utils.getDefaultH264Params(z);
        }
        throw BV5.A0O(videoCodecMimeType, "Unsupported codec: ");
    }

    public static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean isHardwareAcceleratedQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean isSoftwareOnlyQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}
