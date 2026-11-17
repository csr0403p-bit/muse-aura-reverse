package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bgu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2661Bgu<T> implements Runnable {
    public static final Object A07 = C3cG.A0T();
    public static final String __redex_internal_original_name = "StateObservable$ObserverWrapper";
    public final InterfaceC2655Bgn<? super T> A04;
    public final Executor A05;
    public final AtomicReference<Object> A06;
    public final AtomicBoolean A03 = BV4.A12(true);
    public Object A01 = A07;
    public int A00 = -1;
    public boolean A02 = false;

    public final void A00(int i) {
        synchronized (this) {
            if (this.A03.get() && i > this.A00) {
                this.A00 = i;
                if (!this.A02) {
                    this.A02 = true;
                    try {
                        this.A05.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.A02 = false;
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            AtomicBoolean atomicBoolean = this.A03;
            if (!atomicBoolean.get()) {
                this.A02 = false;
                return;
            }
            AtomicReference<Object> atomicReference = this.A06;
            Object obj = atomicReference.get();
            int i = this.A00;
            while (true) {
                if (!C6xC.A00(this.A01, obj)) {
                    this.A01 = obj;
                    boolean z = obj instanceof AbstractC2445BbY;
                    InterfaceC2655Bgn<? super T> interfaceC2655Bgn = this.A04;
                    if (z) {
                        interfaceC2655Bgn.onError(((C2444BbX) ((AbstractC2445BbY) obj)).A00);
                    } else {
                        interfaceC2655Bgn.AUJ(obj);
                    }
                }
                synchronized (this) {
                    if (i == this.A00 || !atomicBoolean.get()) {
                        break;
                    }
                    obj = atomicReference.get();
                    i = this.A00;
                }
            }
            this.A02 = false;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/Object;>;Ljava/util/concurrent/Executor;LX/Bgn<-TT;>;)V */
    public RunnableC2661Bgu(InterfaceC2655Bgn interfaceC2655Bgn, Executor executor, AtomicReference atomicReference) {
        this.A06 = atomicReference;
        this.A05 = executor;
        this.A04 = interfaceC2655Bgn;
    }
}
