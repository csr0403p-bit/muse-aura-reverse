package org.webrtc;

import X.BV4;

/* loaded from: classes6.dex */
public class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw BV4.A0c("Failed to get WebRTC class loader.");
    }
}
