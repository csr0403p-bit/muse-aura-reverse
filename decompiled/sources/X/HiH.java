package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class HiH implements Cloneable {
    public static void A03(List list, List list2) {
        Object[] objArrCopyOf;
        byte[] bArr = AbstractC9307GDj.A00;
        list.getClass();
        if (list instanceof InterfaceC10576Hum) {
            list2.addAll(list);
            return;
        }
        int size = list.size();
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list2.size() + size);
        } else if (list2 instanceof GDH) {
            GDH gdh = (GDH) list2;
            int i = gdh.A00 + size;
            Object[] objArr = gdh.A01;
            int length = objArr.length;
            if (i > length) {
                if (length == 0) {
                    objArrCopyOf = new Object[Math.max(i, 10)];
                } else {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    objArrCopyOf = Arrays.copyOf(objArr, length);
                }
                gdh.A01 = objArrCopyOf;
            }
        }
        int size2 = list2.size();
        if (!(list instanceof RandomAccess)) {
            for (Object obj : list) {
                if (obj != null) {
                    list2.add(obj);
                }
            }
            return;
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 != null) {
                list2.add(obj2);
            }
        }
        return;
        String strA0I = FGI.A0I("Element at index ", AbstractC7607F5u.A0J(list2, size2), " is null.");
        int size4 = list2.size();
        while (true) {
            size4--;
            if (size4 < size2) {
                throw BV4.A0a(strA0I);
            }
            list2.remove(size4);
        }
    }
}
