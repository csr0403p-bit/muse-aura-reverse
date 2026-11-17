package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GO3 {
    public final /* synthetic */ G0U<Hkf, Unit> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public GO3(G0U<? super Hkf, Unit> g0u) {
        this.A00 = g0u;
    }

    public static void A00(GNM gnm, GO3 go3, List list, List list2) {
        G0U<Hkf, Unit> g0u = go3.A00;
        C7384Etj.A0X(gnm);
        GOD god = new GOD(gnm);
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9537GNt c9537GNt = (C9537GNt) it.next();
            C7384Etj.A0Y(c9537GNt, 0);
            arrayListA0m.add("inapp".equals(c9537GNt.A01) ? new GOM(c9537GNt) : new GOQ(c9537GNt));
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            GO2 go2 = (GO2) it2.next();
            C7384Etj.A0X(go2);
            String str = go2.A01;
            C7384Etj.A0U(str);
            String str2 = go2.A02;
            C7384Etj.A0U(str2);
            int i = go2.A00;
            arrayListA0m2.add(new G4X(str, str2, i, i != 2 ? i != 3 ? i != 4 ? C79.A00 : C79.A0K : C79.A0C : C79.A01));
        }
        g0u.invoke(new Hkf(god, arrayListA0m, arrayListA0m2));
    }
}
