package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Fwq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9013Fwq implements InterfaceC9026Fx4<C9056Fxe> {
    public final Map<C8993FwW<C9095FyM>, Hl5> A00 = C3cG.A0j();
    public final Map<C8993FwW<C9095FyM>, Double> A01 = C3cG.A0j();
    public final Set<C9012Fwp> A02 = C3cG.A0k();
    public final Set<C8993FwW<?>> A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C9013Fwq(Set<? extends C8993FwW<?>> set) {
        Map map;
        Hl5 hl5;
        this.A03 = set;
        if (!AbstractC9015Fws.A00.containsAll(set)) {
            StringBuilder sbA0x = C60O.A0x("Invalid set of blood pressure fallback aggregation metrics ");
            ArrayList arrayListA0i = AnonymousClass003.A0i(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(((C8993FwW) it.next()).A03());
            }
            throw C3cG.A0Q(C8j3.A14(arrayListA0i, sbA0x));
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C8993FwW c8993FwW = (C8993FwW) it2.next();
            if (C7384Etj.areEqual(c8993FwW, C9056Fxe.A07) || C7384Etj.areEqual(c8993FwW, C9056Fxe.A0A)) {
                map = this.A00;
                hl5 = new Hl5();
                hl5.A01 = 0;
                hl5.A00 = 0.0d;
            } else {
                if (!C7384Etj.areEqual(c8993FwW, C9056Fxe.A08) && !C7384Etj.areEqual(c8993FwW, C9056Fxe.A09) && !C7384Etj.areEqual(c8993FwW, C9056Fxe.A0B) && !C7384Etj.areEqual(c8993FwW, C9056Fxe.A0C)) {
                    throw BV5.A0U("Invalid blood pressure fallback aggregation metric ", c8993FwW.A03());
                }
                map = this.A01;
                hl5 = null;
            }
            map.put(c8993FwW, hl5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.9jH] */
    @Override // X.InterfaceC9026Fx4
    public final C8990FwS AJ8() {
        ?? A15;
        double dA00;
        Set<C9012Fwp> set = this.A02;
        if (set.isEmpty()) {
            A15 = C9jH.A00;
        } else {
            Set<C8993FwW<?>> set2 = this.A03;
            A15 = C60O.A15(AnonymousClass005.A0C(set2));
            for (C8993FwW<?> c8993FwW : set2) {
                String strA03 = c8993FwW.A03();
                if (c8993FwW.equals(C9056Fxe.A07) || c8993FwW.equals(C9056Fxe.A0A)) {
                    Hl5 hl5 = this.A00.get(c8993FwW);
                    C7384Etj.A0X(hl5);
                    dA00 = hl5.A00 / r0.A01;
                } else {
                    if (!c8993FwW.equals(C9056Fxe.A08) && !c8993FwW.equals(C9056Fxe.A09) && !c8993FwW.equals(C9056Fxe.A0B) && !c8993FwW.equals(C9056Fxe.A0C)) {
                        throw BV5.A0U("Invalid blood pressure fallback aggregation type ", c8993FwW.A03());
                    }
                    Double d = this.A01.get(c8993FwW);
                    C7384Etj.A0X(d);
                    dA00 = BV6.A00(d);
                }
                A15.put(strA03, Double.valueOf(dA00));
            }
        }
        return new C8990FwS(C9jH.A00, A15, set);
    }

    @Override // X.InterfaceC9026Fx4
    public final /* bridge */ /* synthetic */ void AYb(InterfaceC9011Fwo interfaceC9011Fwo) {
        Map map;
        double dMin;
        Hl5 hl5;
        double d;
        C9056Fxe c9056Fxe = (C9056Fxe) interfaceC9011Fwo;
        C7384Etj.A0Y(c9056Fxe, 0);
        double d2 = c9056Fxe.A03.A00;
        double d3 = c9056Fxe.A04.A00;
        for (C8993FwW<?> c8993FwW : this.A03) {
            if (C7384Etj.areEqual(c8993FwW, C9056Fxe.A07)) {
                Hl5 hl52 = this.A00.get(c8993FwW);
                C7384Etj.A0X(hl52);
                hl5 = hl52;
                hl5.A01++;
                d = hl5.A00 + d2;
            } else {
                if (C7384Etj.areEqual(c8993FwW, C9056Fxe.A08)) {
                    map = this.A01;
                    Number numberA0b = BV4.A0b(c8993FwW, map);
                    dMin = Math.max(numberA0b != null ? numberA0b.doubleValue() : d2, d2);
                } else if (C7384Etj.areEqual(c8993FwW, C9056Fxe.A09)) {
                    map = this.A01;
                    Number numberA0b2 = BV4.A0b(c8993FwW, map);
                    dMin = Math.min(numberA0b2 != null ? numberA0b2.doubleValue() : d2, d2);
                } else if (C7384Etj.areEqual(c8993FwW, C9056Fxe.A0A)) {
                    Hl5 hl53 = this.A00.get(c8993FwW);
                    C7384Etj.A0X(hl53);
                    hl5 = hl53;
                    hl5.A01++;
                    d = hl5.A00 + d3;
                } else if (C7384Etj.areEqual(c8993FwW, C9056Fxe.A0B)) {
                    map = this.A01;
                    Number numberA0b3 = BV4.A0b(c8993FwW, map);
                    dMin = Math.max(numberA0b3 != null ? numberA0b3.doubleValue() : d3, d3);
                } else if (C7384Etj.areEqual(c8993FwW, C9056Fxe.A0C)) {
                    map = this.A01;
                    Number numberA0b4 = BV4.A0b(c8993FwW, map);
                    dMin = Math.min(numberA0b4 != null ? numberA0b4.doubleValue() : d3, d3);
                } else {
                    this.A02.add(c9056Fxe.A02.A02);
                }
                map.put(c8993FwW, Double.valueOf(dMin));
                this.A02.add(c9056Fxe.A02.A02);
            }
            hl5.A00 = d;
            this.A02.add(c9056Fxe.A02.A02);
        }
    }
}
