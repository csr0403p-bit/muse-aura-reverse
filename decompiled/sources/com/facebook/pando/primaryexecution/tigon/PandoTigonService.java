package com.facebook.pando.primaryexecution.tigon;

import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoBuildConfigFlatbufferAssetReaderJNI;
import com.facebook.pando.PandoParseConfig;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class PandoTigonService extends PandoPrimaryExecution {
    public static final PandoTigonService $redex_init_class = null;

    public static final native HybridData initHybridData(String str, TigonServiceHolder tigonServiceHolder, Executor executor, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI, PandoParseConfig pandoParseConfig, PandoTigonConfig pandoTigonConfig, boolean z);

    static {
        ETi.loadLibrary("pando-client-tigon-jni");
    }
}
