package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class HAr implements HAy {
    public List<C10466Hjw> A00;

    @Override // X.HAy
    public final boolean AQK(HB2 hb2, HB4 hb4) {
        Iterator<C10466Hjw> it = this.A00.iterator();
        while (it.hasNext()) {
            if (HAn.A03(hb2, it.next(), hb4)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("not(");
        sbA0x.append(this.A00);
        return BV7.A10(sbA0x);
    }
}
