package X;

import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class F98 implements F8K {
    public Map<String, F8J> A00;
    public Set<String> A01;

    @Override // X.F8K
    public final void A39(String str) {
        C7384Etj.A0Y(str, 0);
        Set setA13 = this.A01;
        if (setA13 == null) {
            setA13 = C60O.A13();
            this.A01 = setA13;
        }
        setA13.add(str);
    }

    @Override // X.F8K
    public final void A3N(Iterable<String> iterable) {
        C7384Etj.A0Y(iterable, 0);
        Set setA13 = this.A01;
        if (setA13 == null) {
            setA13 = C60O.A13();
            this.A01 = setA13;
        }
        AbstractC0882AGj.A0r(iterable, setA13);
    }

    @Override // X.F8K
    public final /* synthetic */ boolean AfX() {
        return true;
    }

    @Override // X.F8K
    public final void A40(F8J f8j, String str) {
        AnonymousClass003.A0u(str, f8j);
        Map mapA0u = this.A00;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            this.A00 = mapA0u;
        }
        mapA0u.put(str, f8j);
    }
}
