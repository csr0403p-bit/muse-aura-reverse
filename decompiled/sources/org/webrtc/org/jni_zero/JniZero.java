package org.webrtc.org.jni_zero;

import X.BV4;
import X.BV7;
import X.C60O;
import java.util.Collections;

/* loaded from: classes5.dex */
public class JniZero {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static boolean sInitialized;
    public static ClassLoader sPendingJniClassLoader;

    public interface Natives {
        void setJniClassLoader(ClassLoader classLoader);
    }

    public static Object[] init() {
        sInitialized = true;
        ClassLoader classLoader = sPendingJniClassLoader;
        if (classLoader != null) {
            sPendingJniClassLoader = null;
        } else {
            classLoader = JniZero.class.getClassLoader();
        }
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP, classLoader};
    }

    public static void crashIfMultiplexingMisaligned(long j, long j2) throws IllegalAccessException, IllegalArgumentException {
        try {
            long j3 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j4 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j3 == j || j3 == j2 || j4 == j) {
                return;
            }
            StringBuilder sbA0z = C60O.A0z("JNI Zero multiplexing hashes do not align. Native: ", j);
            sbA0z.append(" or ");
            sbA0z.append(j2);
            sbA0z.append(" Java: ");
            sbA0z.append(j3);
            throw BV4.A0c(BV7.A0z(" or ", sbA0z, j4));
        } catch (ReflectiveOperationException unused) {
        }
    }

    public static void setJniClassLoader(ClassLoader classLoader) {
        if (sInitialized) {
            JniZeroJni.get().setJniClassLoader(classLoader);
        } else {
            sPendingJniClassLoader = classLoader;
        }
    }
}
