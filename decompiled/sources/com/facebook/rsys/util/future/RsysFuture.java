package com.facebook.rsys.util.future;

import X.C7384Etj;
import X.CQU;
import X.ETi;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes5.dex */
public final class RsysFuture<V, T> extends CQU<V> {
    public NativeHolder mNativeHolder = initNativeHolder();

    public final native NativeHolder initNativeHolder();

    public final native void requestStop();

    @Override // X.CQU
    public boolean setException(Throwable th) {
        C7384Etj.A0Y(th, 0);
        return super.setException(th);
    }

    static {
        ETi.loadLibrary("rsysfuture");
    }

    @Override // X.CQU
    public void interruptTask() {
        requestStop();
    }
}
