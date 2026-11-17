package X;

import X.B8s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class B8q<A extends B8s> {
    public Throwable A01;
    public final Object A04 = C3cG.A0T();
    public final C1726ApH A03 = new C1726ApH(0);
    public C0912AHo<A> A00 = new C0912AHo<>(16);
    public C0912AHo<A> A02 = new C0912AHo<>(16);

    public final InterfaceC1799ArI A00(A a, Function0<Unit> function0) {
        int i;
        int i2;
        int i3;
        F1E f1e = new F1E();
        f1e.element = -1;
        Object obj = this.A04;
        synchronized (obj) {
            Throwable th = this.A01;
            if (th != null) {
                if (a instanceof C2240BCl) {
                    throw th;
                }
                HtJ htJ = ((C2270BQi) a).A01;
                if (htJ != null) {
                    htJ.resumeWith(C3cG.A0s(th));
                }
                return C1800ArJ.A00;
            }
            C1726ApH c1726ApH = this.A03;
            do {
                i = c1726ApH.get();
                i2 = i + 1;
            } while (!c1726ApH.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            f1e.element = (i2 >>> 27) & 15;
            this.A00.A09(a);
            if (z && function0 != null) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (obj) {
                        if (this.A01 == null) {
                            this.A01 = th2;
                            C0912AHo<A> c0912AHo = this.A00;
                            Object[] objArr = c0912AHo.A01;
                            int i4 = ((AbstractC0913AHp) c0912AHo).A00;
                            for (int i5 = 0; i5 < i4; i5++) {
                                B8s b8s = (B8s) objArr[i5];
                                if (b8s instanceof C2240BCl) {
                                    throw th2;
                                }
                                HtJ htJ2 = ((C2270BQi) b8s).A01;
                                if (htJ2 != null) {
                                    htJ2.resumeWith(C3cG.A0s(th2));
                                }
                            }
                            this.A00.A06();
                            do {
                                i3 = c1726ApH.get();
                            } while (!c1726ApH.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                        }
                    }
                }
            }
            return new B8r(new BTN(f1e, a, this, 10));
        }
    }

    public final void A01(G0U<? super A, Unit> g0u) {
        int i;
        int i2;
        synchronized (this.A04) {
            C0912AHo<A> c0912AHo = this.A00;
            this.A00 = this.A02;
            this.A02 = c0912AHo;
            C1726ApH c1726ApH = this.A03;
            do {
                i = c1726ApH.get();
            } while (!c1726ApH.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            int i3 = ((AbstractC0913AHp) c0912AHo).A00;
            for (i2 = 0; i2 < i3; i2++) {
                g0u.invoke(c0912AHo.A03(i2));
            }
            c0912AHo.A06();
        }
    }
}
