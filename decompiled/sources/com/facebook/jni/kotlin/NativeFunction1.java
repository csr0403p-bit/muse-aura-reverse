package com.facebook.jni.kotlin;

import X.C7384Etj;
import X.ETr;
import X.G0U;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class NativeFunction1 extends ETr implements G0U<Object, Object> {
    public final HybridData mHybridData;

    public NativeFunction1(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // X.G0U
    public native Object invoke(Object obj);
}
