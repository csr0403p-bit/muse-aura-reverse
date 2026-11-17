package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Fpk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ThreadFactoryC8835Fpk implements ThreadFactory {
    public static final ThreadFactoryC8835Fpk A00 = new ThreadFactoryC8835Fpk();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "BaseMapFancyPinsMeasurement");
    }
}
