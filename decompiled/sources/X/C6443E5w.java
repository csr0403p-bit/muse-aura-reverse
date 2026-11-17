package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.E5w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6443E5w<T> {
    public boolean A00;
    public boolean A01;
    public final E7C A02;
    public final InterfaceC6459E6s A03;
    public final InterfaceC6255Dyy<T> A04;
    public final CopyOnWriteArraySet<E6X<T>> A05;
    public final Object A06 = C3cG.A0T();
    public final ArrayDeque<Runnable> A07 = BV4.A0s();
    public final ArrayDeque<Runnable> A08 = BV4.A0s();

    public static void A00(C6443E5w c6443E5w) {
        if (c6443E5w.A00) {
            C1G.A08(AnonymousClass002.A1Z(Thread.currentThread(), BV7.A13(((E6I) c6443E5w.A03).A00)));
        }
    }

    public final void A04(T t) {
        synchronized (this.A06) {
            if (!this.A01) {
                this.A05.add(new E6X<>(t));
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/CopyOnWriteArraySet<LX/E6X<TT;>;>;Landroid/os/Looper;LX/E7C;LX/Dyy<TT;>;Z)V */
    public C6443E5w(Looper looper, E7C e7c, InterfaceC6255Dyy interfaceC6255Dyy, CopyOnWriteArraySet copyOnWriteArraySet, boolean z) {
        this.A02 = e7c;
        this.A05 = copyOnWriteArraySet;
        this.A04 = interfaceC6255Dyy;
        this.A03 = e7c.A7o(new C7571F4k(this, 0), looper);
        this.A00 = z;
    }

    public final void A01() {
        A00(this);
        ArrayDeque<Runnable> arrayDeque = this.A08;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC6459E6s interfaceC6459E6s = this.A03;
        Handler handler = ((E6I) interfaceC6459E6s).A00;
        if (!handler.hasMessages(1)) {
            C6447E6a c6447E6aARb = interfaceC6459E6s.ARb(1);
            Message message = c6447E6aARb.A00;
            message.getClass();
            handler.sendMessageAtFrontOfQueue(message);
            C6447E6a.A01(c6447E6aARb);
        }
        ArrayDeque<Runnable> arrayDeque2 = this.A07;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void A02() {
        A00(this);
        synchronized (this.A06) {
            this.A01 = true;
        }
        CopyOnWriteArraySet<E6X<T>> copyOnWriteArraySet = this.A05;
        Iterator<E6X<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            E6X<T> next = it.next();
            InterfaceC6255Dyy<T> interfaceC6255Dyy = this.A04;
            next.A02 = true;
            if (next.A01) {
                next.A01 = false;
                interfaceC6255Dyy.ANy(next.A00.A00(), next.A03);
            }
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/E7R<TT;>;)V */
    public final void A03(final E7R e7r, final int i) {
        A00(this);
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A05);
        this.A08.add(new Runnable() { // from class: X.E6U
            public static final String __redex_internal_original_name = "ListenerSet$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                E7R e7r2 = e7r;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    E6X e6x = (E6X) it.next();
                    if (!e6x.A02) {
                        if (i2 != -1) {
                            e6x.A00.A01(i2);
                        }
                        e6x.A01 = true;
                        e7r2.ANx(e6x.A03);
                    }
                }
            }
        });
    }
}
