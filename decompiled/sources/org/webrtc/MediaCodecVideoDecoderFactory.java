package org.webrtc;

import X.BV4;
import X.C3cG;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;

/* loaded from: classes5.dex */
public class MediaCodecVideoDecoderFactory implements VideoDecoderFactory {
    public static final String TAG = "MediaCodecVideoDecoderFactory";
    public final Predicate<MediaCodecInfo> codecAllowedPredicate;
    public final boolean enableMTKH264Decoder;
    public final Map<String, Integer> extendedSettings;
    public final Predicate<MediaCodecInfo.CodecCapabilities> preferredCodecAllowedPredicate;
    public final EglBase.Context sharedContext;

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        this(context, predicate, null);
    }

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        return findCodecForType(videoCodecMimeType, false);
    }

    public static boolean isAdaptivePlaybackEnabled(Map<String, Integer> map, boolean z) {
        Number numberA0b;
        return map != null && (numberA0b = BV4.A0b(MediaCodecUtils.ADAPTIVE_PLAYBACK_ENABLED, map)) != null && z && numberA0b.intValue() == 1;
    }

    private MediaCodecInfo findPreferredCodecForType(VideoCodecMimeType videoCodecMimeType) {
        if (this.preferredCodecAllowedPredicate == null) {
            return null;
        }
        return findCodecForType(videoCodecMimeType, true);
    }

    private boolean isCodecAllowed(MediaCodecInfo mediaCodecInfo, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        Predicate<MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate != null) {
            boolean zTest = predicate.test(mediaCodecInfo);
            if (!z) {
                return zTest;
            }
            if (!zTest || !this.preferredCodecAllowedPredicate.test(codecCapabilities)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // org.webrtc.VideoDecoderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.name
            org.webrtc.VideoCodecMimeType r6 = org.webrtc.VideoCodecMimeType.valueOf(r0)
            android.media.MediaCodecInfo r3 = r10.findPreferredCodecForType(r6)
            java.lang.String r2 = "MediaCodecVideoDecoderFactory"
            if (r3 != 0) goto L5c
            r0 = 0
            android.media.MediaCodecInfo r3 = r10.findCodecForType(r6, r0)
            if (r3 == 0) goto L6b
            java.lang.String r1 = "Found codec: "
            java.lang.String r0 = r3.getName()
            java.lang.String r0 = X.FGI.A0M(r1, r0)
            org.webrtc.Logging.d(r2, r0)
            r1 = 0
        L23:
            java.lang.String r0 = r6.mimeType()
            android.media.MediaCodecInfo$CodecCapabilities r2 = r3.getCapabilitiesForType(r0)
            if (r1 == 0) goto L34
            boolean r0 = org.webrtc.MediaCodecUtils.codecSupportsLowLatencyDecode(r2)
            r9 = 1
            if (r0 != 0) goto L35
        L34:
            r9 = 0
        L35:
            org.webrtc.MediaCodecWrapperFactoryImpl r4 = new org.webrtc.MediaCodecWrapperFactoryImpl
            r4.<init>()
            java.lang.String r5 = r3.getName()
            int[] r0 = org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS
            java.lang.Integer r0 = org.webrtc.MediaCodecUtils.selectColorFormat(r0, r2)
            int r7 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r10.extendedSettings
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r2.isFeatureSupported(r0)
            boolean r8 = isAdaptivePlaybackEnabled(r1, r0)
            org.webrtc.EglBase$Context r10 = r10.sharedContext
            org.webrtc.AndroidVideoDecoder r3 = new org.webrtc.AndroidVideoDecoder
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L5c:
            java.lang.String r1 = "Found preferred codec: "
            java.lang.String r0 = r3.getName()
            java.lang.String r0 = X.FGI.A0M(r1, r0)
            org.webrtc.Logging.d(r2, r0)
            r1 = 1
            goto L23
        L6b:
            java.lang.String r0 = "No codec found for: "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r11)
            org.webrtc.Logging.d(r2, r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoDecoderFactory.createDecoder(org.webrtc.VideoCodecInfo):org.webrtc.VideoDecoder");
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) || ((name.startsWith(MediaCodecUtils.MS_PREFIX) || name.startsWith(MediaCodecUtils.MTK_PREFIX)) && this.enableMTKH264Decoder);
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType, boolean z) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType)) {
            return false;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType());
        if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, capabilitiesForType) != null) {
            return isCodecAllowed(mediaCodecInfo, capabilitiesForType, z);
        }
        return false;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayListA0h = C3cG.A0h();
        VideoCodecMimeType videoCodecMimeType = VideoCodecMimeType.VP8;
        VideoCodecMimeType videoCodecMimeType2 = VideoCodecMimeType.VP9;
        VideoCodecMimeType videoCodecMimeType3 = VideoCodecMimeType.H264;
        VideoCodecMimeType[] videoCodecMimeTypeArr = {videoCodecMimeType, videoCodecMimeType2, videoCodecMimeType3, VideoCodecMimeType.AV1, VideoCodecMimeType.H265};
        int i = 0;
        do {
            VideoCodecMimeType videoCodecMimeType4 = videoCodecMimeTypeArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecMimeType4, false);
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

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate, Map<String, Integer> map) {
        this(context, false, predicate, map);
    }

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType, boolean z) {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType, z)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    public MediaCodecVideoDecoderFactory(EglBase.Context context, boolean z, Predicate<MediaCodecInfo> predicate, Map<String, Integer> map) {
        this(context, z, predicate, map, null);
    }

    public MediaCodecVideoDecoderFactory(EglBase.Context context, boolean z, Predicate<MediaCodecInfo> predicate, Map<String, Integer> map, Predicate<MediaCodecInfo.CodecCapabilities> predicate2) {
        this.sharedContext = context;
        this.codecAllowedPredicate = predicate;
        this.extendedSettings = map;
        this.enableMTKH264Decoder = z;
        this.preferredCodecAllowedPredicate = predicate2;
    }
}
