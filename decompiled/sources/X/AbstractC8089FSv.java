package X;

import android.util.SparseIntArray;
import java.util.List;

/* renamed from: X.FSv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8089FSv {
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A00 = new SparseIntArray();

    public final int A00(int i) {
        List<Integer> list;
        if (this instanceof FFW) {
            list = ((FFW) this).A00;
        } else {
            if (!(this instanceof FFX)) {
                return 1;
            }
            list = ((FFX) this).A00;
        }
        Number number = (Number) AbstractC0878AGe.A0A(i, list);
        if (number != null) {
            return number.intValue();
        }
        return 1;
    }

    public final int A01(int i, int i2) {
        if (this instanceof C7945FMa) {
            return i % i2;
        }
        int iA00 = A00(i);
        if (iA00 != i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int iA002 = A00(i4);
                i3 += iA002;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = iA002;
                }
            }
            if (iA00 + i3 <= i2) {
                return i3;
            }
        }
        return 0;
    }
}
