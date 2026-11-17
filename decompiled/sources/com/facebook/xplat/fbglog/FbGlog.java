package com.facebook.xplat.fbglog;

import X.C3463COl;
import X.CFK;
import X.CFO;

/* loaded from: classes5.dex */
public class FbGlog {
    public static CFO sCallback;

    public static native void setLogLevel(int i);

    public static native void setSkipSubscribe(boolean z);

    static {
        C3463COl.loadLibrary("fb");
    }

    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        if (sCallback == null) {
            CFO cfo = new CFO();
            sCallback = cfo;
            boolean z = CFK.A00;
            synchronized (CFK.class) {
                CFK.A01.add(cfo);
            }
            setLogLevel(CFK.A02.AHn());
        }
    }
}
