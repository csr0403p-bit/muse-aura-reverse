package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public final class ApQ implements CharSequence {
    public static final AFs<ApQ, ?> A04 = AbstractC1803ArM.A00;
    public final String A00;
    public final List<C1733ApU<? extends C1OS>> A01;
    public final List<C1733ApU<C1818Arh>> A02;
    public final List<C1733ApU<C1824Aro>> A03;

    public final List A02(int i) {
        List<C1733ApU<? extends C1OS>> list = this.A01;
        if (list == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1733ApU<? extends C1OS> c1733ApU = list.get(i2);
            C1733ApU<? extends C1OS> c1733ApU2 = c1733ApU;
            if ((c1733ApU2.A02 instanceof AbstractC1699Aoe) && AbstractC1730ApR.A00(0, i, c1733ApU2.A01, c1733ApU2.A00)) {
                arrayListA0t.add(c1733ApU);
            }
        }
        return arrayListA0t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApQ) {
                ApQ apQ = (ApQ) obj;
                if (!C7384Etj.areEqual(this.A00, apQ.A00) || !C7384Etj.areEqual(this.A01, apQ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ApQ(String str, List<C1733ApU<C1824Aro>> list, List<C1733ApU<C1818Arh>> list2) {
        ApQ apQ = AbstractC1730ApR.A00;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayListA11 = C60O.A11(C8j3.A0L(list2, list.size()));
                int size = list.size();
                int iA0G = 0;
                int iA0G2 = 0;
                while (iA0G2 < size) {
                    iA0G2 = C8j4.A0G(arrayListA11, list, iA0G2);
                }
                int size2 = list2.size();
                while (iA0G < size2) {
                    iA0G = C8j4.A0G(arrayListA11, list2, iA0G);
                }
                list = arrayListA11;
            }
        }
        this(list, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(C1733ApU c1733ApU, AbstractCollection abstractCollection, int i, int i2, int i3) {
        if (i != 0) {
            int i4 = c1733ApU.A01;
            int i5 = c1733ApU.A00;
            if (AbstractC1730ApR.A00(i2, i3, i4, i5)) {
                T t = c1733ApU.A02;
                C7384Etj.A0Z(t, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                abstractCollection.add(new C1733ApU(((C1734ApV) t).A00, c1733ApU.A03, i4, i5));
            }
        }
    }

    @Override // java.lang.CharSequence
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ApQ subSequence(int i, int i2) {
        if (i > i2) {
            throw C60O.A0i(C8j4.A0y("start (", ") should be less or equal to end (", i, i2));
        }
        if (i == 0 && i2 == C8j3.A0I(this)) {
            return this;
        }
        String strSubstring = this.A00.substring(i, i2);
        List<C1733ApU<? extends C1OS>> list = this.A01;
        ApQ apQ = AbstractC1730ApR.A00;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayListA0t = C60Q.A0t(list);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1733ApU c1733ApUA0c = C8j4.A0c(list, i3);
                if (AbstractC1730ApR.A00(i, i2, c1733ApUA0c.A01, c1733ApUA0c.A00)) {
                    arrayListA0t.add(new C1733ApU(c1733ApUA0c.A02, c1733ApUA0c.A03, Math.max(i, c1733ApUA0c.A01) - i, Math.min(i2, c1733ApUA0c.A00) - i));
                }
            }
            if (!arrayListA0t.isEmpty()) {
                arrayList = arrayListA0t;
            }
        }
        return new ApQ(arrayList, strSubstring);
    }

    public final List<C1733ApU<String>> A03(int i, int i2) {
        List<C1733ApU<? extends C1OS>> list = this.A01;
        if (list == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1733ApU c1733ApUA0c = C8j4.A0c(list, i3);
            A00(c1733ApUA0c, arrayListA0t, c1733ApUA0c.A02 instanceof C1734ApV ? 1 : 0, i, i2);
        }
        return arrayListA0t;
    }

    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    public final List<C1733ApU<C1OR>> A04(int i, int i2) {
        List<C1733ApU<? extends C1OS>> list = this.A01;
        if (list == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1733ApU<? extends C1OS> c1733ApU = list.get(i3);
            C1733ApU<? extends C1OS> c1733ApU2 = c1733ApU;
            if ((c1733ApU2.A02 instanceof C1OR) && AbstractC1730ApR.A00(i, i2, c1733ApU2.A01, c1733ApU2.A00)) {
                arrayListA0t.add(c1733ApU);
            }
        }
        return arrayListA0t;
    }

    public final List<C1733ApU<String>> A05(String str, int i, int i2) {
        List<C1733ApU<? extends C1OS>> list = this.A01;
        if (list == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1733ApU c1733ApUA0c = C8j4.A0c(list, i3);
            if (c1733ApUA0c.A02 instanceof C1734ApV) {
                A00(c1733ApUA0c, arrayListA0t, str.equals(c1733ApUA0c.A03) ? 1 : 0, i, i2);
            }
        }
        return arrayListA0t;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.A00.charAt(i);
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A00) + C60R.A01(this.A01);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A00;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return C8j3.A0I(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApQ(List<? extends C1733ApU<? extends C1OS>> list, String str) {
        ArrayList arrayList;
        List listA0c;
        this.A01 = list;
        this.A00 = str;
        ArrayList arrayList2 = null;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            for (int i = 0; i < size; i++) {
                C1733ApU c1733ApU = (C1733ApU) list.get(i);
                if (c1733ApU.A02 instanceof C1824Aro) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c1733ApU);
                } else if (c1733ApU.A02 instanceof C1818Arh) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c1733ApU);
                }
            }
        } else {
            arrayList = null;
        }
        this.A03 = arrayList2;
        this.A02 = arrayList;
        if (arrayList != null && (listA0c = AbstractC0878AGe.A0c(arrayList, new BSF(7))) != null && !listA0c.isEmpty()) {
            int i2 = ((C1733ApU) AbstractC0878AGe.A0F(listA0c)).A00;
            Ab1 ab1 = AbstractC1188Adr.A00;
            C1119Aaj c1119Aaj = new C1119Aaj(1);
            c1119Aaj.A02(i2);
            int size2 = listA0c.size();
            for (int i3 = 1; i3 < size2; i3++) {
                C1733ApU c1733ApU2 = (C1733ApU) listA0c.get(i3);
                while (true) {
                    int i4 = c1119Aaj.A00;
                    if (i4 == 0) {
                        break;
                    }
                    int i5 = c1119Aaj.A01[i4 - 1];
                    if (c1733ApU2.A01 >= i5) {
                        c1119Aaj.A03(i4 - 1);
                    } else {
                        int i6 = c1733ApU2.A00;
                        if (i6 > i5) {
                            throw C60O.A0i(FGI.A0T("Paragraph overlap not allowed, end ", " should be less than or equal to ", i6, i5));
                        }
                    }
                }
                c1119Aaj.A02(c1733ApU2.A00);
            }
        }
    }

    public ApQ(String str, List<? extends C1733ApU<? extends C1OS>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
