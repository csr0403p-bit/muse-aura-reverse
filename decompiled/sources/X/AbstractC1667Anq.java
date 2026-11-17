package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Anq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1667Anq {
    public static final String A02(int i) {
        if (i == 0) {
            return AbstractC7606F5t.A00(34);
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return AbstractC7606F5t.A00(35);
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final C1634An9 A01(C1635AnA c1635AnA, int i) {
        Object next;
        Iterator itA0i = C3cG.A0i(c1635AnA.A01);
        while (true) {
            if (!itA0i.hasNext()) {
                next = null;
                break;
            }
            next = itA0i.next();
            if (((C1453AjM) ((Map.Entry) next).getKey()).A02 == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (C1634An9) entry.getValue();
        }
        return null;
    }

    public static final C1958Aux A00(C0919AHv c0919AHv) {
        G0U g0u;
        ArrayList arrayListA0h = C3cG.A0h();
        C0864A6l c0864A6lA00 = AlP.A00(c0919AHv, AbstractC1578Alt.A08);
        if (c0864A6lA00 == null || (g0u = (G0U) c0864A6lA00.A01) == null || !AnonymousClass003.A1X(arrayListA0h, g0u)) {
            return null;
        }
        return (C1958Aux) arrayListA0h.get(0);
    }
}
