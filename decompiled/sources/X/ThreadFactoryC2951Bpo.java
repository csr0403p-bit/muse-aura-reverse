package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Bpo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC2951Bpo implements ThreadFactory {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;

    public ThreadFactoryC2951Bpo(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C2941BpV(runnable, this.A01, this.A00);
    }
}
