package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class Hj6 {
    public static final Hj6 A02 = C9115Fyg.A00().A05();
    public int A00;
    public Object[] A01;

    public final Hj6 A00(List<Object> list) {
        int size = list.size();
        int i = this.A00 + size;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = list.get(i2);
        }
        System.arraycopy(this.A01, 0, objArr, size, this.A00);
        Hj6 hj6 = new Hj6();
        hj6.A01 = objArr;
        hj6.A00 = i;
        return hj6;
    }
}
