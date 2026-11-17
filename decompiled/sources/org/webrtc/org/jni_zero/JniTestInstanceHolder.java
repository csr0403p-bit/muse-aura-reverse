package org.webrtc.org.jni_zero;

import X.C3cG;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class JniTestInstanceHolder {
    public static ArrayList<JniTestInstanceHolder> sAllOverrides;
    public Object value;

    public static synchronized JniTestInstanceHolder create() {
        JniTestInstanceHolder jniTestInstanceHolder;
        ArrayList<JniTestInstanceHolder> arrayListA0h = sAllOverrides;
        if (arrayListA0h == null) {
            arrayListA0h = C3cG.A0h();
            sAllOverrides = arrayListA0h;
        }
        jniTestInstanceHolder = new JniTestInstanceHolder();
        arrayListA0h.add(jniTestInstanceHolder);
        return jniTestInstanceHolder;
    }
}
