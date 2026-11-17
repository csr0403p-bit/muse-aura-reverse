package X;

import java.util.ArrayList;

/* renamed from: X.Fyg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9115Fyg {
    public final ArrayList<Object> A00 = C3cG.A0h();

    public static C9115Fyg A02(Object obj) {
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(obj, 0);
        return c9115Fyg;
    }

    public static Hj6 A04(Object obj) {
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(obj, 0);
        return c9115Fyg.A05();
    }

    public static C9115Fyg A00() {
        return new C9115Fyg();
    }

    public static C9115Fyg A01(Object obj) {
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(obj, 0);
        return c9115Fyg;
    }

    public final Hj6 A05() {
        ArrayList<Object> arrayList = this.A00;
        Hj6 hj6 = new Hj6();
        Object[] array = arrayList.toArray();
        hj6.A01 = array;
        hj6.A00 = array.length;
        return hj6;
    }

    public final void A06(Object obj, int i) {
        ArrayList<Object> arrayList = this.A00;
        if (arrayList.size() > i) {
            throw C60O.A0i("Arguments must be continuous");
        }
        arrayList.add(i, obj);
    }

    public static Hj6 A03(C9115Fyg c9115Fyg, Object obj, int i) {
        c9115Fyg.A06(obj, i);
        return c9115Fyg.A05();
    }
}
