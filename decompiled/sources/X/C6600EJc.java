package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.EJc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6600EJc extends GBP {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C6600EJc.class, "_state$volatile");
    public HsS A00;
    public final Thread A01 = Thread.currentThread();
    public volatile /* synthetic */ int _state$volatile;

    @Override // X.GBP
    public final void A06(Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    throw BV7.A0l("Illegal state ", i);
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.A01.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    @Override // X.GBP
    public final boolean A07() {
        return true;
    }

    public final void A08() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        throw BV7.A0l("Illegal state ", i);
                    }
                    Thread.interrupted();
                    return;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                HsS hsS = this.A00;
                if (hsS != null) {
                    hsS.dispose();
                    return;
                }
                return;
            }
        }
    }
}
