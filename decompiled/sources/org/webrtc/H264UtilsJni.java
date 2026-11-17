package org.webrtc;

import java.util.Map;
import org.webrtc.H264Utils;
import org.webrtc.org.jni_zero.JniTestInstanceHolder;

/* loaded from: classes5.dex */
public class H264UtilsJni implements H264Utils.Natives {
    public static JniTestInstanceHolder sOverride;

    public static native boolean nativeIsSameH264Profile(Object obj, Object obj2);

    public static H264Utils.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new H264UtilsJni() : (H264Utils.Natives) obj;
    }

    public static void setInstanceForTesting(H264Utils.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolderCreate = sOverride;
        if (jniTestInstanceHolderCreate == null) {
            jniTestInstanceHolderCreate = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolderCreate;
        }
        jniTestInstanceHolderCreate.value = natives;
    }

    @Override // org.webrtc.H264Utils.Natives
    public boolean isSameH264Profile(Map map, Map map2) {
        return nativeIsSameH264Profile(map, map2);
    }
}
