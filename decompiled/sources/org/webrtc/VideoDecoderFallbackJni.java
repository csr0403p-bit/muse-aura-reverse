package org.webrtc;

import org.webrtc.VideoDecoderFallback;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class VideoDecoderFallbackJni implements VideoDecoderFallback.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native long nativeCreate(long j, Object obj, Object obj2);

    public static VideoDecoderFallback.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoDecoderFallbackJni() : (VideoDecoderFallback.Natives) obj;
    }

    public static void setInstanceForTesting(VideoDecoderFallback.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.VideoDecoderFallback.Natives
    public long create(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        return nativeCreate(j, videoDecoder, videoDecoder2);
    }
}
