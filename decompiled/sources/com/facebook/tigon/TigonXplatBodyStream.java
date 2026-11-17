package com.facebook.tigon;

import X.AbstractC3609CXj;
import X.C3610CXl;
import X.C3611CXm;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonErrorCode;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class TigonXplatBodyStream implements TigonBodyStream {
    public final HybridData mHybridData;

    private native void reportBodyLengthNative(int i);

    private native void reportErrorNativeByteBuffer(byte[] bArr, int i);

    private native int transferBytesArrayNative(byte[] bArr, int i, int i2);

    private native int transferBytesNative(ByteBuffer byteBuffer, int i);

    private native void writeEOMNative();

    @Override // com.facebook.tigon.TigonBodyStream
    public int transferBytes(byte[] bArr, int i) {
        return transferBytesArrayNative(bArr, 0, i);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public void reportError(TigonError tigonError) {
        C3610CXl c3610CXl = new C3610CXl();
        C7384Etj.A0Y(tigonError, 1);
        C3611CXm c3611CXm = AbstractC3609CXj.A00;
        TigonErrorCode tigonErrorCode = tigonError.category;
        C7384Etj.A0Y(tigonErrorCode, 1);
        C3611CXm.A02(c3610CXl, tigonErrorCode.value);
        c3611CXm.A05(c3610CXl, tigonError.A02);
        C3611CXm.A02(c3610CXl, tigonError.A00);
        c3611CXm.A05(c3610CXl, tigonError.A01);
        reportErrorNativeByteBuffer(c3610CXl.A01, c3610CXl.A00);
    }

    static {
        ETi.loadLibrary("tigonjni");
    }

    public TigonXplatBodyStream(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public void reportBodyLength(int i) {
        reportBodyLengthNative(i);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public void writeEOM() {
        writeEOMNative();
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public int transferBytes(byte[] bArr, int i, int i2) {
        return transferBytesArrayNative(bArr, i, i2);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public int transferBytes(ByteBuffer byteBuffer, int i) {
        return transferBytesNative(byteBuffer, i);
    }
}
