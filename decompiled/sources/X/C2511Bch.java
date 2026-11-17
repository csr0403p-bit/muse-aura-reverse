package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bch, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2511Bch {
    public final List<BX1> A00;

    public final <T extends BX1> T A01(Class<T> cls) {
        Iterator<BX1> it = this.A00.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    public final boolean A03(Class<? extends BX1> cls) {
        Iterator<BX1> it = this.A00.iterator();
        while (it.hasNext()) {
            if (BV6.A1Y(cls, it.next())) {
                return true;
            }
        }
        return false;
    }

    public C2511Bch(List<BX1> list) {
        this.A00 = BV4.A0t(list);
    }

    public static String A00(C2511Bch c2511Bch) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<BX1> it = c2511Bch.A00.iterator();
        while (it.hasNext()) {
            arrayListA0h.add(C3cI.A0Y(it.next()));
        }
        StringBuilder sbA0w = C60O.A0w();
        Iterator it2 = arrayListA0h.iterator();
        if (it2.hasNext()) {
            while (true) {
                sbA0w.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sbA0w.append((CharSequence) " | ");
            }
        }
        return sbA0w.toString();
    }

    public final <T extends BX1> List<T> A02(Class<T> cls) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (BX1 bx1 : this.A00) {
            if (BV6.A1Y(cls, bx1)) {
                arrayListA0h.add(bx1);
            }
        }
        return arrayListA0h;
    }
}
