package com.facebook.jni.kotlin;

import X.C7384Etj;
import X.ETr;
import X.G2j;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class NativeFunction4 extends ETr implements G2j<Object, Object, Object, Object, Object> {
    public final HybridData mHybridData;

    public NativeFunction4(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    @Override // X.G2j
    public native Object invoke(Object obj, Object obj2, Object obj3, Object obj4);
}
