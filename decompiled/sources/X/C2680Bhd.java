package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.Bhd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2680Bhd<T> implements InterfaceC2620Bfm {
    public final AtomicReference<Object> A05;
    public final Object A02 = C3cG.A0T();
    public int A00 = 0;
    public boolean A01 = false;
    public final Map<InterfaceC2655Bgn<? super T>, RunnableC2661Bgu<T>> A03 = BV4.A0u();
    public final CopyOnWriteArraySet<RunnableC2661Bgu<T>> A04 = new CopyOnWriteArraySet<>();

    public static void A00(C2680Bhd c2680Bhd, InterfaceC2655Bgn interfaceC2655Bgn) {
        RunnableC2661Bgu<T> runnableC2661BguRemove = c2680Bhd.A03.remove(interfaceC2655Bgn);
        if (runnableC2661BguRemove != null) {
            runnableC2661BguRemove.A03.set(false);
            c2680Bhd.A04.remove(runnableC2661BguRemove);
        }
    }

    public static void A01(C2680Bhd c2680Bhd, Object obj) {
        Object obj2 = c2680Bhd.A02;
        synchronized (obj2) {
            if (!C6xC.A00(c2680Bhd.A05.getAndSet(obj), obj)) {
                int i = c2680Bhd.A00 + 1;
                c2680Bhd.A00 = i;
                if (!c2680Bhd.A01) {
                    c2680Bhd.A01 = true;
                    CopyOnWriteArraySet<RunnableC2661Bgu<T>> copyOnWriteArraySet = c2680Bhd.A04;
                    Iterator<RunnableC2661Bgu<T>> it = copyOnWriteArraySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            it.next().A00(i);
                        } else {
                            synchronized (obj2) {
                                if (c2680Bhd.A00 == i) {
                                    c2680Bhd.A01 = false;
                                    return;
                                } else {
                                    it = copyOnWriteArraySet.iterator();
                                    i = c2680Bhd.A00;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A02(C2684Bhh c2684Bhh, Executor executor, int i) {
        c2684Bhh.A00.A3j(new C2685Bhi(new C7574F4n(i)), executor);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Executor;LX/Bgn<-TT;>;)V */
    @Override // X.InterfaceC2620Bfm
    public final void A3j(InterfaceC2655Bgn interfaceC2655Bgn, Executor executor) {
        RunnableC2661Bgu<T> runnableC2661Bgu;
        synchronized (this.A02) {
            A00(this, interfaceC2655Bgn);
            runnableC2661Bgu = new RunnableC2661Bgu<>(interfaceC2655Bgn, executor, this.A05);
            this.A03.put(interfaceC2655Bgn, runnableC2661Bgu);
            this.A04.add(runnableC2661Bgu);
        }
        runnableC2661Bgu.A00(0);
    }

    @Override // X.InterfaceC2620Bfm
    public final ListenableFuture<T> ABL() {
        Object obj = this.A05.get();
        return obj instanceof AbstractC2445BbY ? new C2938BpP(((C2444BbX) ((AbstractC2445BbY) obj)).A00) : obj == null ? BpQ.A01 : new BpQ(obj);
    }

    @Override // X.InterfaceC2620Bfm
    public final void Aau(InterfaceC2655Bgn<? super T> interfaceC2655Bgn) {
        synchronized (this.A02) {
            A00(this, interfaceC2655Bgn);
        }
    }

    public C2680Bhd(Object obj) {
        this.A05 = BV4.A16(obj);
    }
}
