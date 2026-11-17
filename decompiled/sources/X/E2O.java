package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E2O extends AbstractC6411E4n {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E2O e2o = (E2O) obj;
                if (this.A02 != e2o.A02 || this.A00 != e2o.A00 || this.A01 != e2o.A01 || !Arrays.equals(this.A03, e2o.A03) || !Arrays.equals(this.A04, e2o.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public E2O(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super("MLLT");
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
        this.A04 = iArr2;
    }

    public final int hashCode() {
        return ((((((((527 + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
