package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Eik, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7220Eik<T> extends AbstractC7206EiO<T> {
    public int A00;
    public int A01;
    public ArrayList<InterfaceC7236Ej0<T>> A02;
    public AtomicInteger A03;
    public AtomicIntegerArray A04;
    public Throwable A05;
    public Map<String, Object> A06;
    public final /* synthetic */ C7232Eiw A07;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r1v0 X.Eik) */
    public static synchronized InterfaceC7236Ej0 A00(C7220Eik c7220Eik) {
        InterfaceC7236Ej0 interfaceC7236Ej0A01;
        synchronized (c7220Eik) {
            interfaceC7236Ej0A01 = A01(c7220Eik, c7220Eik.A00);
        }
        return interfaceC7236Ej0A01;
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 X.Eik) */
    public static synchronized InterfaceC7236Ej0 A01(C7220Eik c7220Eik, int i) {
        InterfaceC7236Ej0<T> interfaceC7236Ej0;
        synchronized (c7220Eik) {
            ArrayList<InterfaceC7236Ej0<T>> arrayList = c7220Eik.A02;
            interfaceC7236Ej0 = (arrayList == null || i >= arrayList.size()) ? null : arrayList.get(i);
        }
        return interfaceC7236Ej0;
    }

    public static void A02(InterfaceC7236Ej0 interfaceC7236Ej0, C7220Eik c7220Eik, int i) {
        InterfaceC7236Ej0<T> interfaceC7236Ej02 = interfaceC7236Ej0;
        synchronized (c7220Eik) {
            if (interfaceC7236Ej0 != A00(c7220Eik)) {
                if (interfaceC7236Ej0 == A01(c7220Eik, i)) {
                    ArrayList<InterfaceC7236Ej0<T>> arrayList = c7220Eik.A02;
                    interfaceC7236Ej02 = null;
                    if (arrayList != null && i < arrayList.size()) {
                        interfaceC7236Ej02 = arrayList.set(i, null);
                    }
                }
                if (interfaceC7236Ej02 != null) {
                    interfaceC7236Ej02.A6Q();
                }
            }
        }
        if (i == 0) {
            c7220Eik.A05 = interfaceC7236Ej0.AFW();
            c7220Eik.A06 = ((AbstractC7206EiO) interfaceC7236Ej0).A04;
        }
        A03(c7220Eik, i);
    }

    @Override // X.AbstractC7206EiO, X.InterfaceC7236Ej0
    public final boolean A6Q() {
        synchronized (this) {
            if (!super.A6Q()) {
                return false;
            }
            ArrayList<InterfaceC7236Ej0<T>> arrayList = this.A02;
            this.A02 = null;
            if (arrayList == null) {
                return true;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                InterfaceC7236Ej0<T> interfaceC7236Ej0 = arrayList.get(i);
                if (interfaceC7236Ej0 != null) {
                    interfaceC7236Ej0.A6Q();
                }
            }
            return true;
        }
    }

    @Override // X.AbstractC7206EiO, X.InterfaceC7236Ej0
    public final synchronized T AJm() {
        InterfaceC7236Ej0 interfaceC7236Ej0A00;
        interfaceC7236Ej0A00 = A00(this);
        return interfaceC7236Ej0A00 != null ? (T) interfaceC7236Ej0A00.AJm() : null;
    }

    public C7220Eik(C7232Eiw c7232Eiw) {
        this.A07 = c7232Eiw;
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    int i = 0;
                    this.A03 = BV4.A13(0);
                    List<InterfaceC7005EeA<InterfaceC7236Ej0<T>>> list = this.A07.A00;
                    int size = list.size();
                    this.A04 = new AtomicIntegerArray(size);
                    this.A01 = size;
                    this.A00 = size;
                    this.A02 = C60O.A11(size);
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        InterfaceC7236Ej0<T> interfaceC7236Ej0 = list.get(i).get();
                        this.A02.add(interfaceC7236Ej0);
                        interfaceC7236Ej0.Agc(new C7223Ein(this, i), C2952Bpp.A00);
                        if (interfaceC7236Ej0.ANI()) {
                            while (true) {
                                i++;
                                if (i >= size) {
                                    break;
                                } else {
                                    A03(this, i);
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    public static void A03(C7220Eik c7220Eik, int i) {
        if (c7220Eik.A04.compareAndSet(i, 0, 1) && c7220Eik.A03.incrementAndGet() == c7220Eik.A01) {
            Throwable th = c7220Eik.A05;
            Map<String, Object> map = c7220Eik.A06;
            if (th != null) {
                c7220Eik.A07(th, map);
            } else {
                c7220Eik.A06(null, map, true);
            }
        }
    }
}
