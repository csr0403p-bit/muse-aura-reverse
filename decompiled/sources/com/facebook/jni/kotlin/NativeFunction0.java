package com.facebook.jni.kotlin;

import X.C7384Etj;
import X.ETr;
import com.facebook.jni.HybridData;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NativeFunction0 extends ETr implements Function0<Object> {
    public final HybridData mHybridData;

    public NativeFunction0(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // kotlin.jvm.functions.Function0
    public native Object invoke();
}
