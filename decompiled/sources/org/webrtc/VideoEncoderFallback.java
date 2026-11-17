package org.webrtc;

/* loaded from: classes5.dex */
public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    public final VideoEncoder fallback;
    public final VideoEncoder primary;

    public interface Natives {
        long create(long j, VideoEncoder videoEncoder, VideoEncoder videoEncoder2);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNative(long j) {
        return VideoEncoderFallbackJni.get().create(j, this.fallback, this.primary);
    }
}
