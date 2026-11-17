package org.webrtc;

import org.webrtc.VideoEncoderWrapper;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class VideoEncoderWrapperJni implements VideoEncoderWrapper.Natives {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static JniTestInstanceHolder sOverride;

    public static native void nativeOnEncodedFrame(long j, Object obj);

    public static VideoEncoderWrapper.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoEncoderWrapperJni() : (VideoEncoderWrapper.Natives) obj;
    }

    public static void setInstanceForTesting(VideoEncoderWrapper.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.VideoEncoderWrapper.Natives
    public void onEncodedFrame(long j, EncodedImage encodedImage) {
        nativeOnEncodedFrame(j, encodedImage);
    }
}
