package org.webrtc;

import X.AnonymousClass002;
import X.BV5;
import X.C3cG;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes5.dex */
public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    public static final List<String> H264_HW_EXCEPTION_MODELS = BV5.A12("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    public static final int PERIODIC_KEY_FRAME_INTERVAL_S = 3600;
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    public static final String TAG = "HardwareVideoEncoderFactory";
    public final Predicate<MediaCodecInfo> codecAllowedPredicate;
    public final boolean enableH264HighProfile;
    public final boolean enableIntelVp8Encoder;
    public boolean enableMTKH264Encoder;
    public boolean enableYuvRender;
    public boolean ignoreChipsetGatingForH264HighProfile;
    public final EglBase14.Context sharedContext;

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this(null, z, z2);
    }

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1, reason: invalid class name */
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
                AnonymousClass002.A15(VideoCodecMimeType.H264, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(VideoCodecMimeType.H265, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(VideoCodecMimeType.AV1, iArr);
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        return str.startsWith(MediaCodecUtils.EXYNOS_PREFIX) ? videoCodecMimeType == VideoCodecMimeType.VP8 ? new DynamicBitrateAdjuster() : new FramerateBitrateAdjuster() : new BaseBitrateAdjuster();
    }

    private int getForcedKeyFrameIntervalMs(VideoCodecMimeType videoCodecMimeType, String str) {
        return (videoCodecMimeType == VideoCodecMimeType.VP8 && str.startsWith(MediaCodecUtils.QCOM_PREFIX)) ? 15000 : 0;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        if (this.enableH264HighProfile) {
            return mediaCodecInfo.getName().startsWith(MediaCodecUtils.EXYNOS_PREFIX) || this.ignoreChipsetGatingForH264HighProfile;
        }
        return false;
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        return name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) || ((name.startsWith(MediaCodecUtils.MTK_PREFIX) || name.startsWith(MediaCodecUtils.MS_PREFIX)) && this.enableMTKH264Encoder);
    }

    private boolean isMediaCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate<MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        if (r0 == false) goto L10;
     */
    @Override // org.webrtc.VideoEncoderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r18) {
        /*
            r17 = this;
            r5 = r18
            java.lang.String r0 = r5.name
            org.webrtc.VideoCodecMimeType r10 = org.webrtc.VideoCodecMimeType.valueOf(r0)
            r3 = r17
            android.media.MediaCodecInfo r6 = r3.findCodecForType(r10)
            r7 = 0
            if (r6 == 0) goto L57
            java.lang.String r9 = r6.getName()
            java.lang.String r2 = r10.mimeType()
            int[] r1 = org.webrtc.MediaCodecUtils.TEXTURE_COLOR_FORMATS
            android.media.MediaCodecInfo$CodecCapabilities r0 = r6.getCapabilitiesForType(r2)
            java.lang.Integer r11 = org.webrtc.MediaCodecUtils.selectColorFormat(r1, r0)
            int[] r1 = org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS
            android.media.MediaCodecInfo$CodecCapabilities r0 = r6.getCapabilitiesForType(r2)
            java.lang.Integer r12 = org.webrtc.MediaCodecUtils.selectColorFormat(r1, r0)
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264
            if (r10 != r0) goto L58
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.params
            r0 = 1
            java.util.Map r1 = org.webrtc.MediaCodecUtils.getCodecProperties(r10, r0)
            org.webrtc.H264Utils$Natives r0 = org.webrtc.H264UtilsJni.get()
            boolean r4 = r0.isSameH264Profile(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.params
            r0 = 0
            java.util.Map r1 = org.webrtc.MediaCodecUtils.getCodecProperties(r10, r0)
            org.webrtc.H264Utils$Natives r0 = org.webrtc.H264UtilsJni.get()
            boolean r0 = r0.isSameH264Profile(r2, r1)
            if (r4 == 0) goto L55
            boolean r0 = r3.isH264HighProfileSupported(r6)
        L55:
            if (r0 != 0) goto L58
        L57:
            return r7
        L58:
            org.webrtc.MediaCodecWrapperFactoryImpl r8 = new org.webrtc.MediaCodecWrapperFactoryImpl
            r8.<init>()
            java.util.Map<java.lang.String, java.lang.String> r13 = r5.params
            int r15 = r3.getForcedKeyFrameIntervalMs(r10, r9)
            org.webrtc.BitrateAdjuster r16 = r3.createBitrateAdjuster(r10, r9)
            org.webrtc.EglBase14$Context r1 = r3.sharedContext
            boolean r0 = r3.enableYuvRender
            r14 = 3600(0xe10, float:5.045E-42)
            org.webrtc.HardwareVideoEncoder r7 = new org.webrtc.HardwareVideoEncoder
            r18 = r0
            r17 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.createEncoder(org.webrtc.VideoCodecInfo):org.webrtc.VideoEncoder");
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            return true;
        }
        return name.startsWith(MediaCodecUtils.INTEL_PREFIX) && this.enableIntelVp8Encoder;
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        return MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) != null && mediaCodecInfo.isHardwareAccelerated() && isMediaCodecAllowed(mediaCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    /* renamed from: getSupportedCodecs, reason: merged with bridge method [inline-methods] */
    public VideoCodecInfo[] getImplementations() {
        ArrayList arrayListA0h = C3cG.A0h();
        VideoCodecMimeType videoCodecMimeType = VideoCodecMimeType.VP8;
        VideoCodecMimeType videoCodecMimeType2 = VideoCodecMimeType.VP9;
        VideoCodecMimeType videoCodecMimeType3 = VideoCodecMimeType.H264;
        VideoCodecMimeType[] videoCodecMimeTypeArr = {videoCodecMimeType, videoCodecMimeType2, videoCodecMimeType3, VideoCodecMimeType.AV1, VideoCodecMimeType.H265};
        int i = 0;
        do {
            VideoCodecMimeType videoCodecMimeType4 = videoCodecMimeTypeArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecMimeType4);
            if (mediaCodecInfoFindCodecForType != null) {
                String strName = videoCodecMimeType4.name();
                if (videoCodecMimeType4 == videoCodecMimeType3 && isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                    arrayListA0h.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, true)));
                }
                arrayListA0h.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, false)));
            }
            i++;
        } while (i < 5);
        return (VideoCodecInfo[]) arrayListA0h.toArray(new VideoCodecInfo[arrayListA0h.size()]);
    }

    public void setYuvRenderEnabled(boolean z) {
        this.enableYuvRender = z;
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this(context, z, z2, false, false, null);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        this(context, z, z2, z3, z4, null);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, Predicate<MediaCodecInfo> predicate) {
        EglBase14.Context context2;
        this.enableYuvRender = false;
        this.enableMTKH264Encoder = false;
        this.ignoreChipsetGatingForH264HighProfile = false;
        if (context instanceof EglBase14.Context) {
            context2 = (EglBase14.Context) context;
        } else {
            Logging.w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
            context2 = null;
        }
        this.sharedContext = context2;
        this.enableIntelVp8Encoder = z;
        this.enableH264HighProfile = z2;
        this.codecAllowedPredicate = predicate;
        this.enableMTKH264Encoder = z4;
        this.ignoreChipsetGatingForH264HighProfile = z3;
    }
}
