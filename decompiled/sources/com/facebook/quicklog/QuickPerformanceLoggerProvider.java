package com.facebook.quicklog;

import X.AnonymousClass006;
import X.BV4;
import X.C3cG;
import X.CFK;
import X.DI4;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public class QuickPerformanceLoggerProvider {
    public static final DI4 A00 = new DI4();
    public static final ReentrantLock A01 = new ReentrantLock();
    public static volatile QuickPerformanceLogger A02;

    public interface QplFactory {
        QuickPerformanceLogger create();
    }

    public interface QplWrapper {
        QuickPerformanceLogger wrap(QuickPerformanceLogger quickPerformanceLogger);
    }

    @Deprecated
    public static void A00(QuickPerformanceLogger quickPerformanceLogger) {
        ReentrantLock reentrantLock = A01;
        reentrantLock.lock();
        try {
            if (A02 != null) {
                QuickPerformanceLogger qPLInstance = getQPLInstance();
                if (!(qPLInstance instanceof DI4)) {
                    CFK.A08("QPLProvider", AnonymousClass006.A0y(quickPerformanceLogger, ", replacing by ", C3cG.A0f(qPLInstance, "QuickPerformanceLogger instance replaced at runtime, this leads to data loss and incorrect telemetry. Initial QPL instance ")), BV4.A0c("QPL instance is replaced in runtime"));
                }
            }
            A02 = quickPerformanceLogger;
            try {
                QuickPerformanceLoggerNativeProvider.nativeUpdateQPLInstance();
            } catch (UnsatisfiedLinkError unused) {
                CFK.A06("QPLProvider", "QuickPerformanceLoggerProvider failed to update native QPL instance, native library. This is expected during early app initialization");
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static QuickPerformanceLogger getQPLInstance() {
        QuickPerformanceLogger quickPerformanceLogger = A02;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        ReentrantLock reentrantLock = A01;
        if (reentrantLock.isLocked()) {
            reentrantLock.lock();
            try {
                QuickPerformanceLogger quickPerformanceLogger2 = A02;
                if (quickPerformanceLogger2 != null) {
                    return quickPerformanceLogger2;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        CFK.A08("QPLProvider", "QuickPerformanceLogger instance wasn't installed in provider, returning noop. Please call QuickPerformanceLoggerProvider.setQuickPerformanceLogger() before getting the instance.", C3cG.A0Q("No QPL instance provided"));
        return null;
    }

    @Deprecated
    public static QuickPerformanceLogger maybeSetNoOpQplInstance() {
        return maybeSetQplInstance(A00);
    }

    public static QuickPerformanceLogger maybeSetQplInstance(QplFactory qplFactory) {
        QuickPerformanceLogger quickPerformanceLogger = A02;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        ReentrantLock reentrantLock = A01;
        if (!reentrantLock.tryLock()) {
            reentrantLock.lock();
            reentrantLock.unlock();
            return maybeSetQplInstance(qplFactory);
        }
        try {
            QuickPerformanceLogger quickPerformanceLoggerCreate = A02;
            if (quickPerformanceLoggerCreate == null) {
                quickPerformanceLoggerCreate = qplFactory.create();
                if (quickPerformanceLoggerCreate == null) {
                    throw BV4.A0a("QPL factory must not return null");
                }
                A02 = quickPerformanceLoggerCreate;
                try {
                    QuickPerformanceLoggerNativeProvider.nativeUpdateQPLInstance();
                } catch (UnsatisfiedLinkError unused) {
                    CFK.A06("QPLProvider", "QuickPerformanceLoggerProvider failed to update native QPL instance, native library. This is expected during early app initialization");
                }
            }
            return quickPerformanceLoggerCreate;
        } finally {
            reentrantLock.unlock();
        }
    }
}
