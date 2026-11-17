package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A6B extends A6C {
    public static final <T> List<T> A02(C3b6<? extends T> c3b6) {
        C7384Etj.A0Y(c3b6, 0);
        Iterator<? extends T> it = c3b6.iterator();
        if (!it.hasNext()) {
            return C0881AGi.A00;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        while (true) {
            arrayListA0h.add(next);
            if (!it.hasNext()) {
                return arrayListA0h;
            }
            next = it.next();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R:Ljava/lang/Object;>(LX/3b6<+TT;>;LX/G0U<-TT;+TR;>;)LX/3b6<TR;>; */
    public static final B3i A04(G0U g0u, C3b6 c3b6) {
        C7384Etj.A0Y(g0u, 1);
        return new B3i(new C2276BSc(41), new C7AG(g0u, c3b6), false);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R:Ljava/lang/Object;>(LX/3b6<+TT;>;LX/G0U<-TT;+LX/3b6<+TR;>;>;)LX/3b6<TR;>; */
    public static final AGX A05(G0U g0u, C3b6 c3b6) {
        C7384Etj.A0Y(g0u, 1);
        return new AGX(g0u, A6D.A00, c3b6);
    }

    public static final <T> C3b6<T> A07(C3b6<? extends T> c3b6, int i) {
        C7384Etj.A0Y(c3b6, 0);
        if (i >= 0) {
            return i == 0 ? A3o.A00 : c3b6 instanceof A3L ? ((A3L) c3b6).Agl(i) : new A3b(c3b6, i);
        }
        throw C60O.A0i(FGI.A0I("Requested element count ", i, " is less than zero."));
    }

    public static final String A01(CharSequence charSequence, C3b6 c3b6) {
        C7384Etj.A0Y(c3b6, 0);
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "");
        int i = 0;
        for (T t : c3b6) {
            i++;
            if (i > 1) {
                sbA0w.append(charSequence);
            }
            BMv.A13(sbA0w, t, null);
        }
        sbA0w.append((CharSequence) "");
        return sbA0w.toString();
    }

    public static final <T> T A00(C3b6<? extends T> c3b6) {
        Iterator<? extends T> it = c3b6.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/3b6<+TT;>;LX/G0U<-TT;Ljava/lang/Boolean;>;)LX/3b6<TT;>; */
    public static final B3i A03(G0U g0u, C3b6 c3b6) {
        return new B3i(g0u, c3b6, C60P.A1Y(c3b6, g0u));
    }

    public static final <T> C3b6<T> A06(C3b6<? extends T> c3b6, C3b6<? extends T> c3b62) {
        C3av c3av = new C3av(new C3b6[]{c3b6, c3b62});
        return new AGX(new C2276BSc(40), new C2276BSc(38), c3av);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R:Ljava/lang/Object;>(LX/3b6<+TT;>;LX/G0U<-TT;+TR;>;)LX/3b6<TR;>; */
    public static final C7AG A08(G0U g0u, C3b6 c3b6) {
        AnonymousClass003.A0u(c3b6, g0u);
        return new C7AG(g0u, c3b6);
    }
}
