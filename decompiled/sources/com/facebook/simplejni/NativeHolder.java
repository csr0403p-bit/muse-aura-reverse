package com.facebook.simplejni;

import X.Bs8;
import X.CWS;
import X.CWU;
import X.CWV;
import X.ETi;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    public class Destructor extends CWS {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        public static native void deleteNative(long j, long j2);

        public Destructor(Object obj, long j, long j2) {
            AtomicReference<CWS> atomicReference;
            CWS cws;
            super(obj, CWU.A02);
            CWV cwv = CWU.A01;
            do {
                atomicReference = cwv.A00;
                cws = atomicReference.get();
                this.A00 = cws;
            } while (!Bs8.A00(cws, this, atomicReference));
            this.mNativePointer = j;
            this.mNativeDestructorFunctionPointer = j2;
        }

        @Override // X.CWS
        public void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0L;
            }
        }

        static {
            ETi.loadLibrary("simplejni");
        }
    }

    static {
        ETi.loadLibrary("simplejni");
    }

    public NativeHolder(long j, long j2) {
        this.mNativePointer = j;
        this.mDestructor = new Destructor(this, j, j2);
    }
}
