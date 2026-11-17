package com.facebook.common.jniexecutors;

import X.C3463COl;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class AndroidAsyncExecutorFactory {
    public static final AndroidAsyncExecutorFactory $redex_init_class = null;
    public HybridData mHybridData;

    public static final native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService);

    static {
        C3463COl.loadLibrary("jniexecutors");
    }
}
