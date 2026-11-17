package com.facebook.tigon;

import X.AbstractC3609CXj;
import X.AbstractC3612CXn;
import X.C3610CXl;
import X.C60N;
import X.CYR;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class TigonXplatService extends TigonServiceHolder {
    public static final int DEFAULT_BUFFER_SIZE = 1024;
    public final CYR mTigonRequestCounter;

    private native TigonXplatRequestToken sendRequestBodyBufferIntegerBuffer(TigonRequest tigonRequest, byte[] bArr, int i, TigonBodyProvider tigonBodyProvider, byte[] bArr2, int i2, TigonCallbacks tigonCallbacks, Executor executor);

    private native TigonXplatRequestToken sendRequestIntegerBuffer(TigonRequest tigonRequest, byte[] bArr, int i, ByteBuffer[] byteBufferArr, int i2, TigonCallbacks tigonCallbacks, Executor executor);

    public void cancelAllRequests() {
    }

    public native boolean isObservable();

    public native void releaseBodyBuffer(ByteBuffer byteBuffer);

    @Override // com.facebook.tigon.iface.TigonServiceHolder
    public String generateBugReport() {
        return C60N.A00(55);
    }

    public boolean isAvailable() {
        HybridData hybridData = this.mHybridData;
        if (hybridData == null) {
            return false;
        }
        return hybridData.isValid();
    }

    public TigonRequestToken sendRequest(TigonRequest tigonRequest, ByteBuffer[] byteBufferArr, int i, TigonCallbacks tigonCallbacks, Executor executor) {
        C3610CXl c3610CXl = new C3610CXl();
        c3610CXl.A01 = new byte[1024];
        AbstractC3612CXn.A00(c3610CXl, tigonRequest);
        return sendRequestIntegerBuffer(tigonRequest, c3610CXl.A01, c3610CXl.A00, byteBufferArr, i, tigonCallbacks, executor);
    }

    public TigonXplatService(HybridData hybridData, TigonErrorReporter tigonErrorReporter, CYR cyr) {
        super(hybridData);
        this.mTigonRequestCounter = cyr;
        try {
            ETi.loadLibrary("tigonjni");
        } catch (Throwable th) {
            if (tigonErrorReporter != null) {
                tigonErrorReporter.softReport("Tigon: TigonXplatService", th);
            }
            throw th;
        }
    }

    public void onPreRequest(TigonRequest tigonRequest) {
    }

    @Override // com.facebook.tigon.iface.TigonServiceHolder
    public void setSystemProxyHostAndPort(String str, int i) {
    }

    @Override // com.facebook.tigon.iface.TigonServiceHolder
    public boolean setInAppProxyHostAndPort(String str, int i, String str2) {
        return false;
    }

    public TigonRequestToken sendRequest(TigonRequest tigonRequest, TigonBodyProvider tigonBodyProvider, TigonCallbacks tigonCallbacks, Executor executor) {
        C3610CXl c3610CXl = new C3610CXl();
        c3610CXl.A01 = new byte[1024];
        AbstractC3612CXn.A00(c3610CXl, tigonRequest);
        C3610CXl c3610CXl2 = new C3610CXl();
        c3610CXl2.A01 = new byte[1024];
        if (tigonBodyProvider != null) {
            AbstractC3609CXj.A00.A04(c3610CXl2, tigonBodyProvider.mProperties);
        }
        return sendRequestBodyBufferIntegerBuffer(tigonRequest, c3610CXl.A01, c3610CXl.A00, tigonBodyProvider, c3610CXl2.A01, c3610CXl2.A00, tigonCallbacks, executor);
    }
}
