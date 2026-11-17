package X;

import java.util.Iterator;

/* renamed from: X.AGb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0875AGb extends AbstractC0876AGc {
    public static final <T> C3b6<T> A09(Iterator<? extends T> it) {
        C7384Etj.A0Y(it, 0);
        return new C8154FWw(new C2308BTi(it, 2));
    }

    public static final <T> C3b6<T> A0B(T t, G0U<? super T, ? extends T> g0u) {
        C7384Etj.A0Y(g0u, 1);
        return t == null ? A3o.A00 : new C79x(C2293BSt.A00(t, 41), g0u);
    }

    public static final <T> C3b6<T> A0A(C3b6<? extends Iterable<? extends T>> c3b6) {
        C2276BSc c2276BSc = new C2276BSc(39);
        if (!(c3b6 instanceof C7AG)) {
            return new AGX(new C2276BSc(40), c2276BSc, c3b6);
        }
        C7AG c7ag = (C7AG) c3b6;
        return new AGX(c7ag.A00, c2276BSc, c7ag.A01);
    }
}
