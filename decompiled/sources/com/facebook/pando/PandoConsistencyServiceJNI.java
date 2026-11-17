package com.facebook.pando;

import X.ETi;
import com.facebook.jni.HybridClassBase;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class PandoConsistencyServiceJNI extends HybridClassBase {
    public static final native PandoConsistencyServiceJNI create(PandoConsistencyStackJNI pandoConsistencyStackJNI, Executor executor, int i, boolean z, int i2, boolean z2, int i3, boolean z3, boolean z4, boolean z5, int i4, boolean z6, String str, boolean z7, boolean z8, boolean z9);

    public final native void maybeSchedulePrune(boolean z);

    public final native void publishTreeUpdaters(List<? extends TreeUpdaterJNI> list, boolean z);

    public final native void setPublishPostProcessor(PandoPublishPostProcessorProvider pandoPublishPostProcessorProvider);

    public final native int subscriptionsCountRacey();

    static {
        ETi.loadLibrary("pando-jni");
    }
}
