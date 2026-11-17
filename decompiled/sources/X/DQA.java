package X;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DQA implements Serializable {
    public static final DQA A00 = new DQA(new int[0]);
    public final int[] array;
    public final int end;

    public DQA(int[] array) {
        int length = array.length;
        this.array = array;
        this.end = length;
    }

    public final boolean equals(Object object) {
        if (object != this) {
            if (object instanceof DQA) {
                DQA dqa = (DQA) object;
                if (this.end == dqa.end) {
                    int i = 0;
                    while (true) {
                        int i2 = this.end;
                        if (i >= i2) {
                            break;
                        }
                        Preconditions.checkElementIndex(i, i2);
                        int i3 = this.array[i];
                        Preconditions.checkElementIndex(i, dqa.end);
                        if (i3 != dqa.array[i]) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    public Object writeReplace() {
        int i = this.end;
        int[] iArr = this.array;
        return i < iArr.length ? new DQA(Arrays.copyOfRange(iArr, 0, i)) : this;
    }

    public Object readResolve() {
        return this.end == 0 ? A00 : this;
    }

    public final String toString() {
        int i = this.end;
        int i2 = 0;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sbA0p = BV4.A0p(i * 5);
        sbA0p.append('[');
        int[] iArr = this.array;
        while (true) {
            sbA0p.append(iArr[i2]);
            i2++;
            if (i2 >= i) {
                return BV5.A0o(sbA0p);
            }
            C8j3.A1K(sbA0p);
        }
    }
}
