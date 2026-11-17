package org.webrtc;

import X.C8j3;
import org.webrtc.VideoEncoder;

/* loaded from: classes5.dex */
public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // org.webrtc.VideoEncoder
    public abstract long createNative(long j);

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(1, false);
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    @Override // org.webrtc.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final String getImplementationName() {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public /* synthetic */ VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        return setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }
}
