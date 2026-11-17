package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class Eu2 {
    public static void A00(int array, Object[] length) {
        for (int i = 0; i < array; i++) {
            if (length[i] == null) {
                throw new NullPointerException(FGI.A0H("at index ", i));
            }
        }
    }

    public static <T> T[] A01(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        int length = tArr.length;
        if (length < size) {
            if (length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        }
        Iterator<?> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            tArr[i] = it.next();
            i++;
        }
        BV7.A1P(tArr, tArr.length, size);
        return tArr;
    }
}
