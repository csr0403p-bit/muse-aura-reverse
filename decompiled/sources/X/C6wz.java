package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6wz, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6wz {
    /* JADX WARN: Multi-variable type inference failed */
    public static C6x1 A00(String str, List list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7418EvO c7418EvO = (C7418EvO) it.next();
            arrayListA0h.add(new C6x0((C6x2) c7418EvO.A01, str, (String) c7418EvO.A00));
        }
        return new C6x1(arrayListA0h);
    }
}
