package com.facebook.pando.primaryexecution.networksequencing;

import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes5.dex */
public final class PandoNetworkSequencingService extends PandoPrimaryExecution {
    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);

    static {
        ETi.loadLibrary("pando-client-networksequencing-jni");
    }
}
