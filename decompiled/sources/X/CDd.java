package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CDd {
    public static int A04;
    public static final CES A05 = new CES();
    public final List<C3309CDi> A00;
    public final Set<String> A01;
    public final Set<String> A02;
    public final Set<String> A03;

    public CDd(List list, Set set, Set set2) {
        AnonymousClass003.A0x(set, set2);
        this.A03 = set;
        this.A02 = set2;
        this.A00 = list;
        synchronized (A05) {
            A04++;
        }
        this.A01 = C60O.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3309CDi c3309CDi = (C3309CDi) it.next();
            Integer num = c3309CDi.A00;
            if (num == C79.A00 || num == C79.A0C) {
                this.A01.addAll(c3309CDi.A01);
            }
        }
    }
}
