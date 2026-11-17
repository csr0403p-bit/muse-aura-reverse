package org.webrtc;

import org.webrtc.VideoEncoderFallback;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class VideoEncoderFallbackJni implements VideoEncoderFallback.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native long nativeCreate(long j, Object obj, Object obj2);

    public static VideoEncoderFallback.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoEncoderFallbackJni() : (VideoEncoderFallback.Natives) obj;
    }

    public static void setInstanceForTesting(VideoEncoderFallback.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.VideoEncoderFallback.Natives
    public long create(long j, VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        return nativeCreate(j, videoEncoder, videoEncoder2);
    }
}
