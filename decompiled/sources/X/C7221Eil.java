package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Eil, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7221Eil<T> extends AbstractC7206EiO<T> {
    public int A00 = 0;
    public InterfaceC7236Ej0<T> A01 = null;
    public InterfaceC7236Ej0<T> A02 = null;
    public final /* synthetic */ C7231Eiv A03;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r1v0 X.Eil) */
    public static synchronized InterfaceC7236Ej0 A00(C7221Eil c7221Eil) {
        InterfaceC7236Ej0<T> interfaceC7236Ej0;
        synchronized (c7221Eil) {
            interfaceC7236Ej0 = c7221Eil.A02;
        }
        return interfaceC7236Ej0;
    }

    public static void A01(InterfaceC7236Ej0 interfaceC7236Ej0, C7221Eil c7221Eil) {
        synchronized (c7221Eil) {
            if (c7221Eil.A05() || interfaceC7236Ej0 != c7221Eil.A01) {
                return;
            }
            c7221Eil.A01 = null;
            if (interfaceC7236Ej0 != A00(c7221Eil) && interfaceC7236Ej0 != null) {
                interfaceC7236Ej0.A6Q();
            }
            if (c7221Eil.A02()) {
                return;
            }
            c7221Eil.A07(interfaceC7236Ej0.AFW(), ((AbstractC7206EiO) interfaceC7236Ej0).A04);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A02() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A05()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L21
            int r1 = r3.A00     // Catch: java.lang.Throwable -> L50
            X.Eiv r0 = r3.A03     // Catch: java.lang.Throwable -> L50
            java.util.List<X.EeA<X.Ej0<T>>> r2 = r0.A00     // Catch: java.lang.Throwable -> L50
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L50
            if (r1 >= r0) goto L21
            int r1 = r3.A00     // Catch: java.lang.Throwable -> L50
            int r0 = r1 + 1
            r3.A00 = r0     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> L50
            X.EeA r0 = (X.InterfaceC7005EeA) r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r3)
            goto L23
        L21:
            monitor-exit(r3)
            r0 = 0
        L23:
            r2 = 0
            if (r0 == 0) goto L2c
            java.lang.Object r2 = r0.get()
            X.Ej0 r2 = (X.InterfaceC7236Ej0) r2
        L2c:
            monitor-enter(r3)
            boolean r0 = r3.A05()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L34
            goto L45
        L34:
            r3.A01 = r2     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            if (r2 == 0) goto L4b
            X.Eir r1 = new X.Eir
            r1.<init>(r3)
            X.Bpp r0 = X.C2952Bpp.A00
            r2.Agc(r1, r0)
            r0 = 1
            return r0
        L45:
            monitor-exit(r3)
            if (r2 == 0) goto L4b
            r2.A6Q()
        L4b:
            r0 = 0
            return r0
        L4d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            throw r0
        L50:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7221Eil.A02():boolean");
    }

    @Override // X.AbstractC7206EiO, X.InterfaceC7236Ej0
    public final boolean A6Q() {
        synchronized (this) {
            if (!super.A6Q()) {
                return false;
            }
            InterfaceC7236Ej0<T> interfaceC7236Ej0 = this.A01;
            this.A01 = null;
            InterfaceC7236Ej0<T> interfaceC7236Ej02 = this.A02;
            this.A02 = null;
            if (interfaceC7236Ej02 != null) {
                interfaceC7236Ej02.A6Q();
            }
            if (interfaceC7236Ej0 == null) {
                return true;
            }
            interfaceC7236Ej0.A6Q();
            return true;
        }
    }

    @Override // X.AbstractC7206EiO, X.InterfaceC7236Ej0
    public final synchronized T AJm() {
        InterfaceC7236Ej0 interfaceC7236Ej0A00;
        interfaceC7236Ej0A00 = A00(this);
        return interfaceC7236Ej0A00 != null ? (T) interfaceC7236Ej0A00.AJm() : null;
    }

    public C7221Eil(C7231Eiv c7231Eiv) {
        this.A03 = c7231Eiv;
        if (A02()) {
            return;
        }
        A07(BV4.A0c("No data source supplier or supplier returned null."), null);
    }
}
