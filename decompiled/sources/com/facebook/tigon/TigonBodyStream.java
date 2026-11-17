package com.facebook.tigon;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface TigonBodyStream {
    void reportBodyLength(int i);

    void reportError(TigonError tigonError);

    int transferBytes(ByteBuffer byteBuffer, int i);

    int transferBytes(byte[] bArr, int i);

    int transferBytes(byte[] bArr, int i, int i2);

    void writeEOM();
}
