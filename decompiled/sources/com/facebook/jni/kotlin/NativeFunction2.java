package com.facebook.jni.kotlin;

import X.C7384Etj;
import X.ETr;
import X.G0V;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class NativeFunction2 extends ETr implements G0V<Object, Object, Object> {
    public final HybridData mHybridData;

    public NativeFunction2(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // X.G0V
    public native Object invoke(Object obj, Object obj2);
}
