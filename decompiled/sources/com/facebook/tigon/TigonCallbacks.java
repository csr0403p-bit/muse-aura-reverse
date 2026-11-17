package com.facebook.tigon;

import X.C7384Etj;
import X.CY1;
import X.CYF;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class TigonCallbacks {
    public final void onBodyExperimental(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        C7384Etj.A0X(byteBufferWrap);
        onBody(byteBufferWrap);
    }

    public void onBody(ByteBuffer byteBuffer) {
    }

    public void onEOM(CY1 cy1) {
    }

    public void onFirstByteFlushed(long j) {
    }

    public void onResponse(CYF cyf) {
    }

    public void onStarted(TigonRequest tigonRequest) {
    }

    public void onError(TigonError tigonError, CY1 cy1) {
    }

    public void onHeaderBytesReceived(long j, long j2) {
    }

    public void onLastByteAcked(long j, long j2) {
    }

    public void onUploadProgress(long j, long j2) {
    }

    public void onWillRetry(TigonError tigonError, CY1 cy1) {
    }
}
