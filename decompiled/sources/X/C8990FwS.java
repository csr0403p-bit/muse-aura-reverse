package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.FwS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8990FwS {
    public final Map<String, Double> A00;
    public final Map<String, Long> A01;
    public final Set<C9012Fwp> A02;

    public final C8990FwS A00(C8990FwS c8990FwS) {
        C7384Etj.A0Y(c8990FwS, 0);
        return new C8990FwS(AGH.A02(this.A01, c8990FwS.A01), AGH.A02(this.A00, c8990FwS.A00), BGK.A01(c8990FwS.A02, this.A02));
    }

    public final <T> T A01(C8993FwW<? extends T> c8993FwW) {
        Map map;
        C7384Etj.A0Y(c8993FwW, 0);
        InterfaceC9033FxE<?, ? extends T> interfaceC9033FxE = c8993FwW.A00;
        if (interfaceC9033FxE instanceof InterfaceC8991FwU) {
            map = this.A01;
        } else {
            if (!(interfaceC9033FxE instanceof FwT)) {
                throw C3cG.A0q();
            }
            map = this.A00;
        }
        Object obj = map.get(c8993FwW.A03());
        if (obj != null) {
            return interfaceC9033FxE.invoke(obj);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.aggregate.AggregationResult");
                C8990FwS c8990FwS = (C8990FwS) obj;
                if (!this.A01.equals(c8990FwS.A01) || !this.A00.equals(c8990FwS.A00) || !this.A02.equals(c8990FwS.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AggregationResult(longValues=");
        sbA0x.append(this.A01);
        sbA0x.append(", doubleValues=");
        sbA0x.append(this.A00);
        sbA0x.append(", dataOrigins=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    public C8990FwS(Map<String, Long> map, Map<String, Double> map2, Set<C9012Fwp> set) {
        AnonymousClass005.A0x(map, map2, set);
        this.A01 = map;
        this.A00 = map2;
        this.A02 = set;
    }
}
