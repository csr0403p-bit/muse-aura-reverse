package org.webrtc;

import X.C8j3;
import org.webrtc.VideoDecoder;

/* loaded from: classes5.dex */
public abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    @Override // org.webrtc.VideoDecoder
    public abstract long createNative(long j);

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final String getImplementationName() {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        throw C8j3.A18("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus release() {
        throw C8j3.A18("Not implemented.");
    }
}
