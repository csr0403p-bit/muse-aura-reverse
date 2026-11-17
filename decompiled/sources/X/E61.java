package X;

import android.os.Looper;

/* loaded from: classes5.dex */
public final class E61<T> {
    public int A00;
    public T A01;
    public T A02;
    public final InterfaceC6459E6s A03;
    public final InterfaceC6459E6s A04;
    public final InterfaceC6462E7b<T> A05;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(E61 e61, Object obj) {
        T t = e61.A02;
        e61.A02 = obj;
        if (t.equals(obj)) {
            return;
        }
        C6438E5q c6438E5q = ((E7O) e61.A05).A00;
        Number number = (Number) obj;
        int iIntValue = number.intValue();
        C6438E5q.A0J(c6438E5q);
        C6438E5q.A0O(c6438E5q, number, 1, 10);
        C6438E5q.A0O(c6438E5q, number, 2, 10);
        C6443E5w<E76> c6443E5w = c6438E5q.A0j;
        c6443E5w.A03(new C7584F4x(iIntValue, 1), 21);
        c6443E5w.A01();
    }

    /* JADX WARN: Incorrect types in method signature: (TT;Landroid/os/Looper;Landroid/os/Looper;LX/E7C;LX/E7b<TT;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public E61(Looper looper, Looper looper2, InterfaceC6462E7b interfaceC6462E7b, E7C e7c, Object obj) {
        this.A03 = e7c.A7o(null, looper);
        this.A04 = e7c.A7o(null, looper2);
        this.A02 = obj;
        this.A01 = obj;
        this.A05 = interfaceC6462E7b;
    }

    public final T A01() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == ((E6I) this.A04).A00.getLooper()) {
            return this.A02;
        }
        C1G.A08(AnonymousClass002.A1Z(looperMyLooper, ((E6I) this.A03).A00.getLooper()));
        return this.A01;
    }
}
