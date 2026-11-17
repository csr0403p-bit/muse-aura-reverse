package org.webrtc;

import android.media.MediaCodecInfo;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.Predicate;

/* loaded from: classes5.dex */
public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    public static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: org.webrtc.PlatformSoftwareVideoDecoderFactory.1
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
            return mediaCodecInfo.isSoftwareOnly();
        }

        /* renamed from: test, reason: avoid collision after fix types in other method */
        public boolean test2(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isSoftwareOnly();
        }
    };

    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    @Deprecated
    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context, Map<String, Integer> map) {
        this(context);
    }
}
