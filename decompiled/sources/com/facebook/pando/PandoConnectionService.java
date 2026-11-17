package com.facebook.pando;

import X.ETi;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class PandoConnectionService extends PandoPrimaryExecution {
    public static final PandoConnectionService $redex_init_class = null;

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager);

    static {
        ETi.loadLibrary("pando-connection-jni");
    }
}
