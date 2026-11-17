package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Dkt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5575Dkt extends Dl4 {
    public final String A01 = "av01";
    public final int A00 = 10000;

    @Override // X.DlN
    public final C5585DlC ABN(C5585DlC c5585DlC) {
        int i;
        int i2;
        if (c5585DlC != null) {
            String str = this.A01;
            if (!TextUtils.isEmpty(str)) {
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<Dl9> it = c5585DlC.A03.iterator();
                while (it.hasNext()) {
                    Dl9 dl9A0b = BV6.A0b(it);
                    if (dl9A0b == null || dl9A0b.A06 != 2) {
                        arrayListA0h.add(dl9A0b);
                    } else {
                        ArrayList arrayListA0h2 = C3cG.A0h();
                        Iterator itA02 = Dl9.A02(dl9A0b);
                        while (itA02.hasNext()) {
                            AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                            C6154Dwx c6154Dwx = abstractC5553DkWA0d.A03;
                            if (c6154Dwx.A0b.contains(str) && (((i = c6154Dwx.A0Q) >= 0 && i <= this.A00) || ((i2 = c6154Dwx.A0D) >= 0 && i2 <= this.A00))) {
                                arrayListA0h2.add(abstractC5553DkWA0d);
                            }
                        }
                        Dl4.A02(dl9A0b, arrayListA0h, arrayListA0h2, arrayListA0h2.isEmpty() ? 1 : 0);
                    }
                }
                return Dl4.A00(c5585DlC, arrayListA0h);
            }
        }
        return c5585DlC;
    }
}
