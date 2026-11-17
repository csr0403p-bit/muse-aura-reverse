package org.webrtc.org.jni_zero;

import X.C3cG;
import X.C60O;
import org.webrtc.org.jni_zero.JniTypeToken;

/* loaded from: classes5.dex */
public class JniPtrImpl<T extends JniTypeToken> implements JniPtrInner<T> {
    public long mNativePtr;

    @Override // org.webrtc.org.jni_zero.JniPtrInner
    public long getNativePtr() {
        long j = this.mNativePtr;
        if (j != 0) {
            return j;
        }
        throw C3cG.A0Q("Trying to access an already-released JniPtr");
    }

    public void release() {
        this.mNativePtr = 0L;
    }

    public JniPtrImpl(long j) {
        if (j == 0) {
            throw C60O.A0i("JNI Zero internal error: if the pointer is 0, it should be converted to null");
        }
        this.mNativePtr = j;
    }
}
