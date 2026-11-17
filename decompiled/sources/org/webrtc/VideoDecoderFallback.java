package org.webrtc;

/* loaded from: classes5.dex */
public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    public final VideoDecoder fallback;
    public final VideoDecoder primary;

    public interface Natives {
        long create(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2);
    }

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j) {
        return VideoDecoderFallbackJni.get().create(j, this.fallback, this.primary);
    }
}
