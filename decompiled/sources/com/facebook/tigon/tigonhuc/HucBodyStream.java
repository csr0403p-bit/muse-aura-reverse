package com.facebook.tigon.tigonhuc;

import X.AbstractC3613CXs;
import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.tigon.TigonError;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public final class HucBodyStream {
    public long bodyLength;
    public long bytesWritten;
    public final TigonHucCallbackForwarder callbackForwarder;
    public final CountDownLatch latch;
    public final OutputStream outputStream;

    public final synchronized void reportBodyLength(long j) {
        this.bodyLength = j;
    }

    public final void reportError(byte[] bArr, int i) {
        C7384Etj.A0Y(bArr, 0);
        TigonError tigonErrorA00 = AbstractC3613CXs.A00(bArr, i);
        this.callbackForwarder.onError(tigonErrorA00.category.value, tigonErrorA00.A02, tigonErrorA00.A00, tigonErrorA00.A00());
        this.latch.countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: all -> 0x0046, TryCatch #1 {, blocks: (B:6:0x0006, B:8:0x0009, B:11:0x0020, B:15:0x0026, B:19:0x0041, B:18:0x0037), top: B:27:0x0006, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int writeBytes(byte[] r11, int r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            if (r11 == 0) goto L37
            if (r12 < 0) goto L37
            int r0 = r11.length     // Catch: java.lang.Throwable -> L46
            if (r12 > r0) goto L37
            java.io.OutputStream r0 = r10.outputStream     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            r9 = 0
            r0.write(r11, r9, r12)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            long r3 = r10.bytesWritten     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            long r0 = (long) r12     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            long r3 = r3 + r0
            r10.bytesWritten = r3     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r7 = r10.callbackForwarder     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            long r5 = r10.bodyLength     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            r5 = r3
        L20:
            r7.onUploadProgress(r3, r5)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L46
            monitor-exit(r10)
            return r9
        L25:
            r1 = move-exception
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r4 = r10.callbackForwarder     // Catch: java.lang.Throwable -> L46
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.A08     // Catch: java.lang.Throwable -> L46
            int r3 = r0.value     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "HucBodyStream"
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L41
            java.lang.String r0 = ""
            goto L41
        L37:
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r4 = r10.callbackForwarder     // Catch: java.lang.Throwable -> L46
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.A06     // Catch: java.lang.Throwable -> L46
            int r3 = r0.value     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "HucBodyStream"
            java.lang.String r0 = "Invalid buffer or size provided"
        L41:
            r4.onError(r3, r2, r8, r0)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r10)
            return r8
        L46:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L46
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tigon.tigonhuc.HucBodyStream.writeBytes(byte[], int):int");
    }

    public final void writeEOM() {
        this.latch.countDown();
    }

    public HucBodyStream(OutputStream outputStream, CountDownLatch countDownLatch, long j, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        AnonymousClass005.A0y(outputStream, countDownLatch, tigonHucCallbackForwarder);
        this.outputStream = outputStream;
        this.latch = countDownLatch;
        this.bodyLength = j;
        this.callbackForwarder = tigonHucCallbackForwarder;
    }
}
