package com.facebook.jni;

import X.AnonymousClass002;
import X.C3463COl;
import X.EUX;

/* loaded from: classes5.dex */
public class HybridData {
    public final Destructor mDestructor;

    public class Destructor extends EUX {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        @Override // X.EUX
        public final void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j);
                this.mNativePointer = 0L;
            }
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    static {
        C3463COl.loadLibrary("fbjni");
    }

    public boolean isValid() {
        return AnonymousClass002.A1L((this.mDestructor.mNativePointer > 0L ? 1 : (this.mDestructor.mNativePointer == 0L ? 0 : -1)));
    }

    public HybridData(long j) {
        Destructor destructor = new Destructor(this);
        this.mDestructor = destructor;
        destructor.mNativePointer = j;
    }

    public HybridData() {
        this.mDestructor = new Destructor(this);
    }
}
