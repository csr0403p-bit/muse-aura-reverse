package X;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes6.dex */
public final class F6D extends F6L {
    public int A00;
    public String A01;
    public final FBB A02;
    public final F64 A03;
    public final F8K A04;
    public final Htq<F6D> A05;
    public final Integer A06;
    public final String A07;
    public final WeakReference<FBB> A08;
    public final Map<String, F8J> A09;
    public final boolean A0A;

    public static final F6D A00(F9H f9h, F6D f6d, C7648F8p c7648F8p) {
        F9H f9h2 = f9h;
        C7648F8p c7648F8p2 = c7648F8p;
        FBB fbb = f6d.A02;
        if (c7648F8p == null) {
            c7648F8p2 = ((F6L) f6d).A02;
        }
        F8K f8k = f6d.A04;
        Map<String, F8J> map = f6d.A09;
        Htq<F6D> htq = f6d.A05;
        String str = f6d.A07;
        if (f9h == null) {
            f9h2 = ((F6L) f6d).A00;
        }
        String str2 = f6d.A01;
        if (str2 == null) {
            throw AbstractC7608F5v.A0e();
        }
        Integer num = f6d.A06;
        WeakReference<FBB> weakReference = f6d.A08;
        return new F6D(f9h2, fbb, weakReference != null ? weakReference.get() : null, f6d.A03, f8k, htq, c7648F8p2, num, str, str2, map, f6d.A0A);
    }

    public static final F6D A01(FBB fbb, C7648F8p c7648F8p) {
        C7384Etj.A0Y(fbb, 0);
        return new F6D(null, fbb, null, null, null, FBA.A02(fbb), c7648F8p, C79.A01, FBB.A02(fbb), null, null, false);
    }

    public static final F6D A02(F6D f6d, C7648F8p c7648F8p) {
        C7384Etj.A0Y(f6d, 0);
        if (c7648F8p == ((F6L) f6d).A02) {
            return f6d;
        }
        FBB fbb = f6d.A02;
        F8K f8k = f6d.A04;
        Map<String, F8J> map = f6d.A09;
        Htq<F6D> htq = f6d.A05;
        String str = f6d.A07;
        F9H f9h = ((F6L) f6d).A00;
        String str2 = f6d.A01;
        if (str2 == null) {
            throw AbstractC7608F5v.A0e();
        }
        Integer num = f6d.A06;
        WeakReference<FBB> weakReference = f6d.A08;
        return new F6D(f9h, fbb, weakReference != null ? weakReference.get() : null, f6d.A03, f8k, htq, c7648F8p, num, str, str2, map, f6d.A0A);
    }

    public F6D(F9H f9h, FBB fbb, FBB fbb2, F64 f64, F8K f8k, Htq htq, C7648F8p c7648F8p, Integer num, String str, String str2, Map map, boolean z) {
        super(f9h, C7627F7j.A00, c7648F8p);
        if (htq instanceof Hj5) {
            this.A05 = htq;
        } else {
            this.A05 = new Hj5(htq);
        }
        this.A02 = fbb;
        this.A04 = f8k;
        this.A09 = map;
        this.A07 = str;
        this.A06 = num;
        this.A08 = fbb2 != null ? BV4.A0q(fbb2) : null;
        this.A0A = z;
        this.A03 = f64;
        if (str2 == null) {
            this.A01 = String.valueOf(ThreadLocalRandom.current().nextLong());
        } else {
            this.A01 = str2;
        }
    }

    public static Object A03(FBB fbb, FDW fdw, Hj6 hj6, HsM hsM) {
        return AbstractC7691FAk.A00(A01(fbb, fdw.A09), hj6, hsM);
    }

    public final FBB A04() {
        FBB fbb = this.A02;
        if (fbb != null) {
            return fbb;
        }
        throw C3cG.A0Q("BloksContext is required but was null");
    }
}
