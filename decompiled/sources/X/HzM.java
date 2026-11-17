package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class HzM {
    public static final List<C5193Dd4> A00(List<? extends FDW> list) {
        Number number;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<? extends FDW> it = list.iterator();
        while (it.hasNext()) {
            FDW fdwA0y = AbstractC7607F5u.A0y(it);
            String strA0o = AbstractC7608F5v.A0o(fdwA0y);
            if (strA0o != null) {
                if (C5192Dd3.A03.contains(strA0o)) {
                    FFI.A01(null, FGI.A0U("Dropping uniform with reserved name '", strA0o, "'; the host manages this uniform"), null);
                } else {
                    List listA15 = AbstractC7608F5v.A15(fdwA0y, 36);
                    ArrayList arrayListA0i = AnonymousClass003.A0i(listA15);
                    for (Object obj : listA15) {
                        arrayListA0i.add(Float.valueOf((!(obj instanceof Number) || (number = (Number) obj) == null) ? 0.0f : number.floatValue()));
                    }
                    arrayListA0h.add(new C5193Dd4(strA0o, AbstractC0878AGe.A0m(arrayListA0i)));
                }
            }
        }
        return arrayListA0h;
    }
}
