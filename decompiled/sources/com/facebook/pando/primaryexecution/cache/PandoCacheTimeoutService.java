package com.facebook.pando.primaryexecution.cache;

import X.AnonymousClass005;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class PandoCacheTimeoutService extends PandoPrimaryExecution {
    public static final PandoCacheTimeoutService $redex_init_class = null;

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService);

    static {
        ETi.loadLibrary("pando-client-cache-jni");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PandoCacheTimeoutService(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService) {
        super(initHybridData(pandoPrimaryExecution, pandoResponseCache, scheduledExecutorService));
        AnonymousClass005.A0x(pandoPrimaryExecution, pandoResponseCache, scheduledExecutorService);
    }
}
