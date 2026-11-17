package com.facebook.pando.primaryexecution.cache;

import X.AnonymousClass003;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class PandoResponseCache {
    public static final PandoResponseCache $redex_init_class = null;
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(Executor executor, FileStash fileStash);

    static {
        ETi.loadLibrary("pando-client-cache-jni");
    }

    public PandoResponseCache(Executor executor, FileStash fileStash) {
        AnonymousClass003.A0u(executor, fileStash);
        this.mHybridData = initHybridData(executor, fileStash);
    }
}
