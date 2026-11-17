package com.facebook.pando;

import X.ETi;
import com.facebook.jni.HybridClassBase;
import java.util.List;

/* loaded from: classes5.dex */
public final class PandoConsistencyStackJNI extends HybridClassBase {
    public static final native PandoConsistencyStackJNI create(boolean z, int i, boolean z2, boolean z3, List<? extends PandoExpander> list, boolean z4);

    static {
        ETi.loadLibrary("pando-jni");
    }
}
