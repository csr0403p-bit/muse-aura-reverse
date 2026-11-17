package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EK8 implements ELR {
    public final Map<C6630ELa, EMx> A00 = C3cG.A0j();

    @Override // X.ELR
    public final EMx AaX(C6630ELa c6630ELa) {
        C7384Etj.A0Y(c6630ELa, 0);
        return this.A00.remove(c6630ELa);
    }

    @Override // X.ELR
    public final List<EMx> AaY(String str) {
        C7384Etj.A0Y(str, 0);
        Map<C6630ELa, EMx> map = this.A00;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (str.equals(((C6630ELa) entryA0l.getKey()).A01)) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        Iterator itA0y = BV5.A0y(linkedHashMapA0j);
        while (itA0y.hasNext()) {
            map.remove(itA0y.next());
        }
        return AbstractC0878AGe.A0X(linkedHashMapA0j.values());
    }

    @Override // X.ELR
    public final EMx AhB(C6630ELa c6630ELa) {
        C7384Etj.A0Y(c6630ELa, 0);
        Map<C6630ELa, EMx> map = this.A00;
        EMx eMx = map.get(c6630ELa);
        if (eMx == null) {
            eMx = new EMx(c6630ELa);
            map.put(c6630ELa, eMx);
        }
        return eMx;
    }

    @Override // X.ELR
    public final boolean A73(C6630ELa c6630ELa) {
        return this.A00.containsKey(c6630ELa);
    }
}
