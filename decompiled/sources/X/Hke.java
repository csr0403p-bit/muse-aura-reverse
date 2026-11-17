package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Hke extends C06G {
    public final List<Ho0> A00;
    public final List<C10482Hla> A01;
    public final List<Hs0> A02;

    public final Ho0 A00(C10482Hla c10482Hla) {
        Hs0 next;
        C7384Etj.A0Y(c10482Hla, 0);
        String strA03 = c10482Hla.A00.A03();
        if (strA03 == null) {
            return null;
        }
        Iterator<Hs0> it = this.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (strA03.equals(next.A02)) {
                break;
            }
        }
        Hs0 hs0 = next;
        if (hs0 != null) {
            return new Ho0(hs0, c10482Hla);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hke) {
                Hke hke = (Hke) obj;
                if (!C7384Etj.areEqual(this.A01, hke.A01) || !C7384Etj.areEqual(this.A02, hke.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0E(this.A01));
    }

    public Hke(List<C10482Hla> list, List<Hs0> list2) {
        AnonymousClass003.A0u(list, list2);
        this.A01 = list;
        this.A02 = list2;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<C10482Hla> it = list.iterator();
        while (it.hasNext()) {
            Ho0 ho0A00 = A00(it.next());
            if (ho0A00 != null) {
                arrayListA0h.add(ho0A00);
            }
        }
        this.A00 = arrayListA0h;
    }
}
