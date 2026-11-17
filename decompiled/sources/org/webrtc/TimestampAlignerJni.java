package org.webrtc;

import org.webrtc.TimestampAligner;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class TimestampAlignerJni implements TimestampAligner.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native long nativeCreateTimestampAligner(long j);

    public static native void nativeReleaseTimestampAligner(long j);

    public static native long nativeTranslateTimestamp(long j, long j2);

    public static TimestampAligner.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new TimestampAlignerJni() : (TimestampAligner.Natives) obj;
    }

    public static void setInstanceForTesting(TimestampAligner.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.TimestampAligner.Natives
    public long createTimestampAligner(long j) {
        return nativeCreateTimestampAligner(j);
    }

    @Override // org.webrtc.TimestampAligner.Natives
    public void releaseTimestampAligner(long j) {
        nativeReleaseTimestampAligner(j);
    }

    @Override // org.webrtc.TimestampAligner.Natives
    public long translateTimestamp(long j, long j2) {
        return nativeTranslateTimestamp(j, j2);
    }
}
