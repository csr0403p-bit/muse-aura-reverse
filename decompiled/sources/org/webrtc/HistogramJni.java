package org.webrtc;

import org.webrtc.Histogram;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class HistogramJni implements Histogram.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native void nativeAddSample(long j, int i);

    public static native long nativeCreateCounts(Object obj, int i, int i2, int i3);

    public static native long nativeCreateEnumeration(Object obj, int i);

    public static Histogram.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new HistogramJni() : (Histogram.Natives) obj;
    }

    public static void setInstanceForTesting(Histogram.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.Histogram.Natives
    public long createCounts(String str, int i, int i2, int i3) {
        return nativeCreateCounts(str, i, i2, i3);
    }

    @Override // org.webrtc.Histogram.Natives
    public long createEnumeration(String str, int i) {
        return nativeCreateEnumeration(str, i);
    }

    @Override // org.webrtc.Histogram.Natives
    public void addSample(long j, int i) {
        nativeAddSample(j, i);
    }
}
