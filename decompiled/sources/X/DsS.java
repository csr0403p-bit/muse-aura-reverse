package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public final class DsS {
    public final Set A00;

    public final void A00(C5939DsZ c5939DsZ) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A00(c5939DsZ);
        }
    }

    public final void A01(C5934DsU c5934DsU) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A01(c5934DsU);
        }
    }

    public final void A02(C5942Dsc c5942Dsc) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A02(c5942Dsc);
        }
    }

    public final void A03(C5938DsY c5938DsY) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A03(c5938DsY);
        }
    }

    public final void A04(C5941Dsb c5941Dsb) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A04(c5941Dsb);
        }
    }

    public final void A05(C5940Dsa c5940Dsa) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A05(c5940Dsa);
        }
    }

    public final void A06(C6074DvE c6074DvE) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A06(c6074DvE);
        }
    }

    public final void A07(C6073DvD c6073DvD) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A07(c6073DvD);
        }
    }

    public final void A08(C5936DsW c5936DsW) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A08(c5936DsW);
        }
    }

    public final void A09(C5935DsV c5935DsV) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DsS) it.next()).A09(c5935DsV);
        }
    }

    public DsS(Set set) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A00 = copyOnWriteArraySet;
        copyOnWriteArraySet.addAll(set);
    }
}
