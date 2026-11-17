package com.facebook.common.dextricks.classtracing.logger;

import X.BV4;
import X.C8j3;
import X.CC4;
import X.COZ;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.systrace.Systrace;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public final class ClassTracingLogger {
    public static final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();
    public static volatile boolean A01;
    public static volatile boolean A02;
    public static volatile boolean A03;

    static {
        CC4 cc4 = new CC4();
        String[][] strArr = Systrace.A03;
        COZ.A00(cc4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:4:0x0005, B:14:0x002c, B:16:0x0032, B:19:0x0037, B:20:0x0041, B:22:0x0047, B:8:0x0010, B:10:0x0016, B:13:0x0028, B:12:0x001f), top: B:28:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: all -> 0x0053, LOOP:0: B:20:0x0041->B:22:0x0047, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:14:0x002c, B:16:0x0032, B:19:0x0037, B:20:0x0041, B:22:0x0047, B:8:0x0010, B:10:0x0016, B:13:0x0028, B:12:0x001f), top: B:28:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:4:0x0005, B:14:0x002c, B:16:0x0032, B:19:0x0037, B:20:0x0041, B:22:0x0047, B:8:0x0010, B:10:0x0016, B:13:0x0028, B:12:0x001f), top: B:28:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(boolean r5) {
        /*
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A03 = r5
            java.lang.Class<com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger> r5 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.class
            monitor-enter(r5)
            boolean r1 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r3 = 1
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A03     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L10
            r0 = 0
            if (r1 == 0) goto L2c
        L10:
            r0 = r1 ^ 1
            boolean r1 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A03     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L28
            java.lang.String r0 = "classtracing"
            X.ETi.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1e java.lang.Throwable -> L53
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder.sIsInitialized = r3     // Catch: java.lang.UnsatisfiedLinkError -> L1e java.lang.Throwable -> L53
            goto L28
        L1e:
            r2 = move-exception
            java.lang.String r1 = "ClassTracingLoggerNH"
            java.lang.String r0 = "Failed to load native library"
            X.CFK.A0A(r1, r0, r2)     // Catch: java.lang.Throwable -> L53
            r0 = 0
            goto L2c
        L28:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder.configureTracing(r4, r1)     // Catch: java.lang.Throwable -> L53
            r0 = 1
        L2c:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02 = r0     // Catch: java.lang.Throwable -> L53
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L37
            boolean r0 = com.facebook.common.dextricks.classid.ClassId.sInitialized     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L37
            r4 = 1
        L37:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A01 = r4     // Catch: java.lang.Throwable -> L53
            X.CCJ.A00 = r3     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.CopyOnWriteArraySet r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A00     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L53
        L41:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L51
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L53
            com.facebook.common.dextricks.ClassLoadsTracer$$ExternalSyntheticLambda0 r0 = (com.facebook.common.dextricks.ClassLoadsTracer$$ExternalSyntheticLambda0) r0     // Catch: java.lang.Throwable -> L53
            r0.onInitializationFinished(r3)     // Catch: java.lang.Throwable -> L53
            goto L41
        L51:
            monitor-exit(r5)
            return
        L53:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A00(boolean):void");
    }

    public static void beginClassLoad(String str) {
        if (A01 && ClassTracingLoggerNativeHolder.sIsInitialized) {
            ClassTracingLoggerNativeHolder.classLoadStarted(str);
        }
    }

    public static void classLoaded(Class<?> cls) {
        long j;
        if (A01 && ClassTracingLoggerNativeHolder.sIsInitialized) {
            if (ClassId.sInitialized) {
                long jA03 = BV4.A03(ClassId.getDexSignature(cls)) | (ClassId.getClassDef(cls) << 32);
                if (((-281474976710656L) & jA03) != 0) {
                    throw C8j3.A17();
                }
                long currentJavaThreadIdOrNotFound = ClassId.getCurrentJavaThreadIdOrNotFound();
                j = currentJavaThreadIdOrNotFound != -1 ? ((65535 & currentJavaThreadIdOrNotFound) << 48) | jA03 : jA03;
            } else {
                j = -1;
            }
            ClassTracingLoggerNativeHolder.classLoaded(j);
        }
    }

    public static void classNotFound() {
        if (A01 && ClassTracingLoggerNativeHolder.sIsInitialized) {
            ClassTracingLoggerNativeHolder.classLoadCancelled();
        }
    }
}
