package X;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Bhe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2681Bhe {
    public InterfaceC2794BlU A00;
    public final Object A01 = C3cG.A0T();
    public final Map<AbstractC2466Bbt, C2682Bhf> A02 = BV4.A0u();
    public final Map<C2683Bhg, Set<AbstractC2466Bbt>> A03 = BV4.A0u();
    public final ArrayDeque<C1HY> A04 = BV4.A0s();

    public static C2683Bhg A00(C2681Bhe c2681Bhe, C1HY c1hy) {
        synchronized (c2681Bhe.A01) {
            Iterator itA11 = BV5.A11(c2681Bhe.A03);
            while (itA11.hasNext()) {
                C2683Bhg c2683Bhg = (C2683Bhg) itA11.next();
                if (c1hy.equals(c2683Bhg.A00)) {
                    return c2683Bhg;
                }
            }
            return null;
        }
    }

    private void A01(C1HY c1hy) {
        synchronized (this.A01) {
            C2683Bhg c2683BhgA00 = A00(this, c1hy);
            if (c2683BhgA00 != null) {
                Iterator it = BV4.A10(c2683BhgA00, this.A03).iterator();
                while (it.hasNext()) {
                    C2682Bhf c2682Bhf = this.A02.get((AbstractC2466Bbt) it.next());
                    c2682Bhf.getClass();
                    c2682Bhf.A01();
                }
            }
        }
    }

    private void A02(C1HY c1hy) {
        synchronized (this.A01) {
            Iterator it = BV4.A10(A00(this, c1hy), this.A03).iterator();
            while (it.hasNext()) {
                C2682Bhf c2682Bhf = this.A02.get((AbstractC2466Bbt) it.next());
                c2682Bhf.getClass();
                if (!c2682Bhf.A00().isEmpty()) {
                    synchronized (c2682Bhf.A03) {
                        if (c2682Bhf.A00) {
                            c2682Bhf.A00 = false;
                            C1HY c1hy2 = c2682Bhf.A02;
                            if (C8j3.A0m(c1hy2).A00(EnumC10573Huf.A06)) {
                                c2682Bhf.onStart(c1hy2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A03(C1HY c1hy) {
        synchronized (this.A01) {
            C2683Bhg c2683BhgA00 = A00(this, c1hy);
            if (c2683BhgA00 != null) {
                Iterator it = BV4.A10(c2683BhgA00, this.A03).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2682Bhf c2682Bhf = this.A02.get((AbstractC2466Bbt) it.next());
                    c2682Bhf.getClass();
                    if (!c2682Bhf.A00().isEmpty()) {
                        ArrayDeque<C1HY> arrayDeque = this.A04;
                        if (arrayDeque.isEmpty()) {
                            arrayDeque.push(c1hy);
                            A02(c1hy);
                        } else {
                            C1HY c1hyPeek = arrayDeque.peek();
                            if (!c1hy.equals(c1hyPeek)) {
                                A01(c1hyPeek);
                                arrayDeque.remove(c1hy);
                                arrayDeque.push(c1hy);
                            }
                            A02(c1hy);
                        }
                    }
                }
            }
        }
    }

    public final void A04(C1HY c1hy) {
        synchronized (this.A01) {
            ArrayDeque<C1HY> arrayDeque = this.A04;
            arrayDeque.remove(c1hy);
            A01(c1hy);
            if (!arrayDeque.isEmpty()) {
                A02(arrayDeque.peek());
            }
        }
    }
}
