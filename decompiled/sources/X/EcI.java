package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final /* synthetic */ class EcI implements ThreadFactory {
    public final /* synthetic */ String A00;
    public final /* synthetic */ boolean A01;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.A00;
        boolean z = this.A01;
        byte[] bArr = AbstractC6843Eav.A06;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public /* synthetic */ EcI(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
