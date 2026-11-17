package X;

import com.facebook.aura.components.reactions.AuraDoubleTakeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8Z9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8Z9 {
    public static final Set<C8Z9> A02;
    public static final Set<C8Z9> A03;
    public static final List<Integer> A04;
    public static final List<Integer> A05;
    public static final List<Integer> A06;
    public static final List<Integer> A07;
    public final int A00;
    public final int A01;

    static {
        List<Integer> listAsList = Arrays.asList(0, 600, 840);
        A06 = listAsList;
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(Arrays.asList(1200, Integer.valueOf(AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS)), listAsList);
        A07 = arrayListA0P;
        List<Integer> listAsList2 = Arrays.asList(0, 480, 900);
        A04 = listAsList2;
        A05 = listAsList2;
        A02 = A00(listAsList, listAsList2);
        A03 = A00(arrayListA0P, listAsList2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C8Z9 c8z9 = (C8Z9) obj;
                if (this.A01 != c8z9.A01 || this.A00 != c8z9.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return FGI.A0Q("WindowSizeClass(minWidthDp=", ", minHeightDp=", ')', this.A01, this.A00);
    }

    public C8Z9(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0) {
            throw new IllegalArgumentException(FGI.A0G("Expected minWidthDp to be at least 0, minWidthDp: ", '.', i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(FGI.A0G("Expected minHeightDp to be at least 0, minHeightDp: ", '.', i2));
        }
    }

    public static final Set<C8Z9> A00(List<Integer> list, List<Integer> list2) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            ArrayList arrayList = new ArrayList(Hr7.A1D(list2, 10));
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C8Z9(iIntValue, it2.next().intValue()));
            }
            AbstractC0882AGj.A0r(arrayList, arrayListA0h);
        }
        return AbstractC0878AGe.A0g(arrayListA0h);
    }
}
