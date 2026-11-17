package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Bdt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2565Bdt {
    public static final C2565Bdt A01;
    public static final C2565Bdt A02;
    public final LinkedHashSet<InterfaceC2455Bbi> A00;

    public final Integer A01() {
        Iterator<InterfaceC2455Bbi> it = this.A00.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC2455Bbi next = it.next();
            if (next instanceof C2566Bdu) {
                Integer numValueOf = Integer.valueOf(((C2566Bdu) next).A00);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw C3cG.A0Q("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    static {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        linkedHashSetA0k.add(new C2566Bdu(0));
        A02 = new C2565Bdt(linkedHashSetA0k);
        LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
        linkedHashSetA0k2.add(new C2566Bdu(1));
        A01 = new C2565Bdt(linkedHashSetA0k2);
    }

    public C2565Bdt(LinkedHashSet linkedHashSet) {
        this.A00 = linkedHashSet;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final InterfaceC2610Bfb A00(LinkedHashSet<InterfaceC2610Bfb> linkedHashSet) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<InterfaceC2610Bfb> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayListA0h.add(it.next().ADJ());
        }
        ?? A022 = A02(arrayListA0h);
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<InterfaceC2610Bfb> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC2610Bfb next = it2.next();
            if (A022.contains(next.ADJ())) {
                linkedHashSetA0k.add(next);
            }
        }
        Iterator it3 = linkedHashSetA0k.iterator();
        if (it3.hasNext()) {
            return (InterfaceC2610Bfb) it3.next();
        }
        throw C60O.A0i("No available camera can be found");
    }

    public final List<InterfaceC2546BdX> A02(List<InterfaceC2546BdX> list) {
        ArrayList arrayListA0t = BV4.A0t(list);
        Iterator<InterfaceC2455Bbi> it = this.A00.iterator();
        while (it.hasNext()) {
            InterfaceC2455Bbi next = it.next();
            List<InterfaceC2546BdX> listUnmodifiableList = Collections.unmodifiableList(arrayListA0t);
            C2566Bdu c2566Bdu = (C2566Bdu) next;
            arrayListA0t = C3cG.A0h();
            for (InterfaceC2546BdX interfaceC2546BdX : listUnmodifiableList) {
                BeS.A06(interfaceC2546BdX instanceof InterfaceC2544BdV, "The camera info doesn't contain internal implementation.");
                if (interfaceC2546BdX.AH3() == c2566Bdu.A00) {
                    arrayListA0t.add(interfaceC2546BdX);
                }
            }
        }
        arrayListA0t.retainAll(list);
        return arrayListA0t;
    }
}
