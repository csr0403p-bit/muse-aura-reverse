package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class HiF {
    public List<HjE> A00 = null;

    public final void A00(HjE hjE) {
        if (this.A00 == null) {
            this.A00 = C3cG.A0h();
        }
        int i = 0;
        while (true) {
            int size = this.A00.size();
            List<HjE> list = this.A00;
            if (i >= size) {
                list.add(hjE);
                return;
            } else {
                if (list.get(i).A00.A00 > hjE.A00.A00) {
                    this.A00.add(i, hjE);
                    return;
                }
                i++;
            }
        }
    }

    public final void A01(HiF hiF) {
        List<HjE> list = hiF.A00;
        if (list != null) {
            if (this.A00 == null) {
                this.A00 = C60Q.A0t(list);
            }
            Iterator<HjE> it = hiF.A00.iterator();
            while (it.hasNext()) {
                A00(it.next());
            }
        }
    }

    public final String toString() {
        List<HjE> list = this.A00;
        if (list == null) {
            return "";
        }
        StringBuilder sbA0w = C60O.A0w();
        Iterator<HjE> it = list.iterator();
        while (it.hasNext()) {
            BV4.A1O(sbA0w, it.next());
            sbA0w.append('\n');
        }
        return sbA0w.toString();
    }
}
