package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Bx1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC3073Bx1 implements ThreadFactory {
    public int A00;
    public String A01;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Bx0(runnable, this.A01, this.A00);
    }
}
