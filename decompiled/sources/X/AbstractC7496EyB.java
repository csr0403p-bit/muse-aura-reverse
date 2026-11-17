package X;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.EyB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7496EyB {
    public static final int[] A00(List<Integer> list) {
        int[] iArr;
        if (list instanceof RandomAccess) {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = list.get(i).intValue();
            }
        } else {
            iArr = new int[list.size()];
            Iterator<Integer> it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().intValue();
                i2++;
            }
        }
        return iArr;
    }
}
