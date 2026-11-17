package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BaO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2409BaO {
    public final List<Bb3> A00 = C3cG.A0h();

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<[I>;I[II)V */
    public static void A06(List list, int[] iArr, int i, int i2) {
        int i3;
        if (i2 >= iArr.length) {
            list.add(iArr.clone());
            return;
        }
        int i4 = 0;
        while (i4 < i) {
            while (true) {
                if (i3 >= i2) {
                    iArr[i2] = i4;
                    A06(list, iArr, i, i2 + 1);
                    break;
                }
                i3 = i4 != iArr[i3] ? i3 + 1 : 0;
            }
            i4++;
        }
    }

    public static C2409BaO A00(EnumC2408BaN enumC2408BaN, Integer num) {
        C2409BaO c2409BaO = new C2409BaO();
        c2409BaO.A00.add(new C2410BaQ(enumC2408BaN, num, 0L));
        return c2409BaO;
    }

    public static void A02(C2409BaO c2409BaO, EnumC2408BaN enumC2408BaN, Bb3 bb3, Integer num, AbstractCollection abstractCollection) {
        List<Bb3> list = c2409BaO.A00;
        list.add(bb3);
        list.add(new C2410BaQ(enumC2408BaN, num, 0L));
        abstractCollection.add(c2409BaO);
    }

    public static void A03(C2409BaO c2409BaO, EnumC2408BaN enumC2408BaN, Integer num) {
        c2409BaO.A00.add(new C2410BaQ(enumC2408BaN, num, 0L));
    }

    public static void A04(C2409BaO c2409BaO, EnumC2408BaN enumC2408BaN, Integer num, AbstractCollection abstractCollection) {
        c2409BaO.A00.add(new C2410BaQ(enumC2408BaN, num, 0L));
        abstractCollection.add(c2409BaO);
    }

    public static void A05(EnumC2408BaN enumC2408BaN, EnumC2408BaN enumC2408BaN2, Integer num, Integer num2, AbstractCollection abstractCollection) {
        C2409BaO c2409BaO = new C2409BaO();
        C2410BaQ c2410BaQ = new C2410BaQ(enumC2408BaN, num, 0L);
        List<Bb3> list = c2409BaO.A00;
        list.add(c2410BaQ);
        list.add(new C2410BaQ(enumC2408BaN2, num2, 0L));
        abstractCollection.add(c2409BaO);
    }

    public static C2409BaO A01(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        return new C2409BaO();
    }

    public final List<Bb3> A07(List<Bb3> list) {
        if (list.isEmpty()) {
            return C3cG.A0h();
        }
        int size = list.size();
        List<Bb3> list2 = this.A00;
        if (size == list2.size()) {
            int size2 = list2.size();
            ArrayList arrayListA0h = C3cG.A0h();
            A06(arrayListA0h, new int[size2], size2, 0);
            Bb3[] bb3Arr = new Bb3[list.size()];
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                for (int i = 0; i < list2.size(); i++) {
                    if (iArr[i] < list.size()) {
                        Bb3 bb3 = list2.get(i);
                        C2410BaQ c2410BaQ = (C2410BaQ) list.get(iArr[i]);
                        Integer num = c2410BaQ.A02;
                        C2410BaQ c2410BaQ2 = (C2410BaQ) bb3;
                        if (c2410BaQ.A01.mId > c2410BaQ2.A01.mId || num != c2410BaQ2.A02) {
                            break;
                        }
                        bb3Arr[iArr[i]] = list2.get(i);
                    }
                }
                return Arrays.asList(bb3Arr);
            }
        }
        return null;
    }
}
