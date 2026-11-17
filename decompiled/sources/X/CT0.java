package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final /* synthetic */ class CT0 implements ThreadFactory {
    public static final ThreadFactory A00 = new CT0();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
