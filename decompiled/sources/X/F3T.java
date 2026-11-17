package X;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class F3T extends BNt {
    public int A00;
    public final int[] A01;

    @Override // X.BNt
    public final int A00() {
        try {
            int[] iArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01.length);
    }

    public F3T(int[] iArr) {
        this.A01 = iArr;
    }
}
