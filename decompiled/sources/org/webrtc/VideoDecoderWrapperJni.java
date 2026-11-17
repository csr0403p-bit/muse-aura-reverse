package org.webrtc;

import org.webrtc.VideoDecoderWrapper;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class VideoDecoderWrapperJni implements VideoDecoderWrapper.Natives {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static JniTestInstanceHolder sOverride;

    public static native void nativeOnDecodedFrame(long j, Object obj, Object obj2, Object obj3);

    public static VideoDecoderWrapper.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoDecoderWrapperJni() : (VideoDecoderWrapper.Natives) obj;
    }

    public static void setInstanceForTesting(VideoDecoderWrapper.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.VideoDecoderWrapper.Natives
    public void onDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2) {
        nativeOnDecodedFrame(j, videoFrame, num, num2);
    }
}
