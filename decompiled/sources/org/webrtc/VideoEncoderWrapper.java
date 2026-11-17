package org.webrtc;

import org.webrtc.VideoEncoder;

/* loaded from: classes5.dex */
public class VideoEncoderWrapper {

    public interface Natives {
        void onEncodedFrame(long j, EncodedImage encodedImage);
    }

    public static VideoEncoder.Callback createEncoderCallback(final long j) {
        return new VideoEncoder.Callback() { // from class: org.webrtc.VideoEncoderWrapper$$ExternalSyntheticLambda0
            @Override // org.webrtc.VideoEncoder.Callback
            public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                VideoEncoderWrapperJni.get().onEncodedFrame(j, encodedImage);
            }
        };
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }
}
