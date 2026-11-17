package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CYB {
    public final CG5 A00;
    public final CYD A01;
    public final CYN A02 = new CYN();
    public final String A03;
    public final String A04;
    public final String A05;
    public final List<HxE<String, String>> A06;
    public final Map<String, Set<String>> A07;

    public CYB(CYD cyd) {
        this.A01 = cyd;
        Map<String, Set<String>> map = cyd.A06;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Set set = (Set) entryA0l.getValue();
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass002.A1J(key, it.next(), arrayListA0h2);
            }
            AbstractC0882AGj.A0r(arrayListA0h2, arrayListA0h);
        }
        this.A06 = arrayListA0h;
        CYD cyd2 = this.A01;
        this.A07 = cyd2.A06;
        this.A04 = cyd2.A04;
        this.A00 = cyd2.A00;
        this.A05 = cyd2.A05;
        this.A03 = cyd2.A03;
    }
}
