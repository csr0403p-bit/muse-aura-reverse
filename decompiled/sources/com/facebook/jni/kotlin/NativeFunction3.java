package com.facebook.jni.kotlin;

import X.C7384Etj;
import X.ETr;
import X.G0W;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class NativeFunction3 extends ETr implements G0W<Object, Object, Object, Object> {
    public final HybridData mHybridData;

    public NativeFunction3(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // X.G0W
    public native Object invoke(Object obj, Object obj2, Object obj3);
}
