package X;

import X.InterfaceC9010Fwn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Fwm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9009Fwm<T extends InterfaceC9010Fwn<?>> implements InterfaceC9026Fx4<T> {
    public Double A00;
    public Double A01;
    public final Hl5 A02;
    public final Fx6<?> A03;
    public final Set<C9012Fwp> A04;
    public final C8881Fru<? extends Comparable<?>> A05;
    public final Set<C8993FwW<?>> A06;

    /* JADX WARN: Incorrect types in method signature: (LX/9uG<TT;>;Ljava/util/Set<+LX/FwW<*>;>;LX/Fx6<*>;)V */
    public C9009Fwm(Fx6 fx6, Set set, C9uG c9uG) {
        C7384Etj.A0Y(fx6, 2);
        this.A06 = set;
        this.A03 = fx6;
        Hl5 hl5 = new Hl5();
        hl5.A01 = 0;
        hl5.A00 = 0.0d;
        this.A02 = hl5;
        this.A04 = C3cG.A0k();
        C8881Fru<? extends Comparable<?>> c8881Fru = (C8881Fru) AbstractC9008Fwl.A00.get(c9uG);
        if (c8881Fru == null) {
            throw BV5.A0O(c9uG, "Non supported fallback series record ");
        }
        this.A05 = c8881Fru;
        if (BFI.A0H(new C8993FwW[]{c8881Fru.A00, c8881Fru.A02, c8881Fru.A01}).containsAll(set)) {
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Invalid set of metrics ");
        ArrayList arrayListA0i = AnonymousClass003.A0i(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((C8993FwW) it.next()).A03());
        }
        throw C3cG.A0Q(C8j3.A14(arrayListA0i, sbA0x));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.9jH] */
    @Override // X.InterfaceC9026Fx4
    public final C8990FwS AJ8() {
        ?? A15;
        Double d;
        double dDoubleValue;
        Set<C9012Fwp> set = this.A04;
        if (set.isEmpty()) {
            A15 = C9jH.A00;
        } else {
            Set<C8993FwW<?>> set2 = this.A06;
            A15 = C60O.A15(AnonymousClass005.A0C(set2));
            for (C8993FwW<?> c8993FwW : set2) {
                String strA03 = c8993FwW.A03();
                C8881Fru<? extends Comparable<?>> c8881Fru = this.A05;
                if (c8993FwW.equals(c8881Fru.A00)) {
                    dDoubleValue = this.A02.A00 / r0.A01;
                } else {
                    if (c8993FwW.equals(c8881Fru.A01)) {
                        d = this.A00;
                    } else {
                        if (!c8993FwW.equals(c8881Fru.A02)) {
                            throw BV5.A0U("Invalid fallback aggregation metric ", c8993FwW.A03());
                        }
                        d = this.A01;
                    }
                    C7384Etj.A0X(d);
                    dDoubleValue = d.doubleValue();
                }
                A15.put(strA03, Double.valueOf(dDoubleValue));
            }
        }
        return new C8990FwS(C9jH.A00, A15, set);
    }

    @Override // X.InterfaceC9026Fx4
    public final /* bridge */ /* synthetic */ void AYb(InterfaceC9011Fwo interfaceC9011Fwo) {
        InterfaceC9010Fwn interfaceC9010Fwn = (InterfaceC9010Fwn) interfaceC9011Fwo;
        C7384Etj.A0Y(interfaceC9010Fwn, 0);
        List listAJw = interfaceC9010Fwn.AJw();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listAJw) {
            if (AbstractC9016Fwt.A00(this.A03, C9019Fww.A02(obj), interfaceC9010Fwn.AKz())) {
                arrayListA0h.add(obj);
            }
        }
        for (Object obj2 : arrayListA0h) {
            Hl5 hl5 = this.A02;
            double dA01 = C9019Fww.A01(obj2);
            hl5.A01++;
            hl5.A00 += dA01;
            Double d = this.A01;
            this.A01 = Double.valueOf(Math.min(d != null ? d.doubleValue() : C9019Fww.A01(obj2), C9019Fww.A01(obj2)));
            Double d2 = this.A00;
            this.A00 = Double.valueOf(Math.max(d2 != null ? d2.doubleValue() : C9019Fww.A01(obj2), C9019Fww.A01(obj2)));
        }
        this.A04.add(interfaceC9010Fwn.AHf().A02);
    }
}
