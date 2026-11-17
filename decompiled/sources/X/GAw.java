package X;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class GAw<T> extends GAq<T> {
    public final GB7 A00;
    public final Thread A01;

    public GAw(Thread thread, C78T c78t, GB7 gb7) {
        super(c78t, true);
        this.A01 = thread;
        this.A00 = gb7;
    }

    @Override // X.GBM
    public final boolean A0P() {
        return true;
    }

    @Override // X.GBM
    public final void A0J(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.A01;
        if (threadCurrentThread.equals(thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
