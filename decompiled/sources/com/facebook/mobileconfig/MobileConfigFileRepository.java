package com.facebook.mobileconfig;

import X.AbstractC2977Bqe;
import X.BV4;
import X.C3148Bzh;
import X.C3cG;
import X.CFK;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Map;

/* loaded from: classes5.dex */
public class MobileConfigFileRepository {
    public static final String TAG = "MobileConfigFileRepository";
    public static final Object mFileCacheLock = C3cG.A0T();
    public static final Map<String, C3148Bzh> mFileCache = BV4.A0u();

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0012, B:10:0x001c, B:12:0x0031, B:13:0x0038, B:15:0x003a, B:27:0x0081, B:16:0x0046, B:19:0x004d, B:21:0x004f, B:23:0x006d, B:24:0x0074, B:26:0x0076, B:7:0x000b), top: B:31:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer getJavaByteBuffer(java.lang.String r6) {
        /*
            java.lang.Object r5 = com.facebook.mobileconfig.MobileConfigFileRepository.mFileCacheLock
            monitor-enter(r5)
            if (r6 == 0) goto Lb
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L12
        Lb:
            java.lang.String r1 = "MobileConfigFileRepository"
            java.lang.String r0 = "Filename should not be null or empty."
            X.CFK.A06(r1, r0)     // Catch: java.lang.Throwable -> L82
        L12:
            java.util.Map<java.lang.String, X.Bzh> r4 = com.facebook.mobileconfig.MobileConfigFileRepository.mFileCache     // Catch: java.lang.Throwable -> L82
            java.lang.Object r3 = r4.get(r6)     // Catch: java.lang.Throwable -> L82
            X.Bzh r3 = (X.C3148Bzh) r3     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L46
            java.lang.String r2 = "MobileConfigFileRepository"
            java.lang.String r1 = "Returning existing buffer with count: %d for filename: %s"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A01     // Catch: java.lang.Throwable -> L82
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L82
            X.CFK.A02(r0, r6, r2, r1)     // Catch: java.lang.Throwable -> L82
            java.nio.ByteBuffer r0 = r3.A00     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L3a
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A01     // Catch: java.lang.Throwable -> L82
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L82
            java.nio.ByteBuffer r0 = r3.A00     // Catch: java.lang.Throwable -> L82
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            return r0
        L3a:
            java.lang.String r0 = "Cannot create new reference for null buffer."
            X.CFK.A04(r2, r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "ByteBuffer has already been released."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L82
            goto L81
        L46:
            java.nio.ByteBuffer r1 = readBuffer(r6)     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L4f
            r0 = 0
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            return r0
        L4f:
            java.lang.String r3 = "MobileConfigFileRepository"
            java.lang.String r0 = "Created new buffer handle for filename: %s"
            X.CFK.A03(r6, r3, r0)     // Catch: java.lang.Throwable -> L82
            X.Bzh r2 = new X.Bzh     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            r2.A00 = r1     // Catch: java.lang.Throwable -> L82
            r1 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = X.BV4.A13(r1)     // Catch: java.lang.Throwable -> L82
            r2.A01 = r0     // Catch: java.lang.Throwable -> L82
            r2.A02 = r1     // Catch: java.lang.Throwable -> L82
            r4.put(r6, r2)     // Catch: java.lang.Throwable -> L82
            java.nio.ByteBuffer r0 = r2.A00     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L76
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A01     // Catch: java.lang.Throwable -> L82
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L82
            java.nio.ByteBuffer r0 = r2.A00     // Catch: java.lang.Throwable -> L82
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            return r0
        L76:
            java.lang.String r0 = "Cannot create new reference for null buffer."
            X.CFK.A04(r3, r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "ByteBuffer has already been released."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L82
        L81:
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mobileconfig.MobileConfigFileRepository.getJavaByteBuffer(java.lang.String):java.nio.ByteBuffer");
    }

    public static ByteBuffer readBuffer(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File fileA0G = BV4.A0G(str);
        try {
            FileInputStream fileInputStreamA0H = BV4.A0H(fileA0G);
            try {
                FileChannel channel = fileInputStreamA0H.getChannel();
                try {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) channel.size());
                    byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                    channel.read(byteBufferAllocateDirect);
                    byteBufferAllocateDirect.flip();
                    String strA00 = AbstractC2977Bqe.A00(byteBufferAllocateDirect, (int) fileA0G.length());
                    if (strA00.isEmpty()) {
                        channel.close();
                        fileInputStreamA0H.close();
                        return byteBufferAllocateDirect;
                    }
                    CFK.A0H(TAG, "Cannot validate (from direct read) \"%s\", err:%s", str, strA00);
                    channel.close();
                    fileInputStreamA0H.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            CFK.A0D(TAG, "Cannot open \"%s\"", e, str);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0012, B:10:0x001c, B:12:0x0024, B:13:0x002a, B:15:0x002e, B:16:0x0038, B:7:0x000b), top: B:21:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void releaseBuffer(java.lang.String r4) {
        /*
            java.lang.Object r3 = com.facebook.mobileconfig.MobileConfigFileRepository.mFileCacheLock
            monitor-enter(r3)
            if (r4 == 0) goto Lb
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L12
        Lb:
            java.lang.String r1 = "MobileConfigFileRepository"
            java.lang.String r0 = "Filename should not be null or empty."
            X.CFK.A06(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L12:
            java.util.Map<java.lang.String, X.Bzh> r2 = com.facebook.mobileconfig.MobileConfigFileRepository.mFileCache     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r2.get(r4)     // Catch: java.lang.Throwable -> L3a
            X.Bzh r1 = (X.C3148Bzh) r1     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L38
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A01     // Catch: java.lang.Throwable -> L3a
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L3a
            if (r0 > 0) goto L2a
            r0 = 0
            r1.A00 = r0     // Catch: java.lang.Throwable -> L3a
            r0 = 1
            r1.A02 = r0     // Catch: java.lang.Throwable -> L3a
        L2a:
            boolean r0 = r1.A02     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L38
            java.lang.String r1 = "MobileConfigFileRepository"
            java.lang.String r0 = "All buffer references cleared  for filename: %s"
            X.CFK.A03(r4, r1, r0)     // Catch: java.lang.Throwable -> L3a
            r2.remove(r4)     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mobileconfig.MobileConfigFileRepository.releaseBuffer(java.lang.String):void");
    }

    public MobileConfigFileRepository() {
        throw BV4.A0N("Cannot instantiate MobileConfigFileRepository.");
    }
}
