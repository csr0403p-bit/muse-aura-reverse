package com.crossapp.tigonhttp;

import X.AnonymousClass003;
import X.CCP;

/* loaded from: classes5.dex */
public final class TigonEventLoopThreadHelper {
    public static final TigonEventLoopThreadHelper INSTANCE = new TigonEventLoopThreadHelper();

    public static final void startThread(Runnable runnable, String str, int i) {
        AnonymousClass003.A0u(runnable, str);
        new CCP(str, i).newThread(runnable).start();
    }
}
