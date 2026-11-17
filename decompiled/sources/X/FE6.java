package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FE6 {
    public final FI4 A00;
    public final int[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FE6) {
                FE6 fe6 = (FE6) obj;
                if (!this.A00.equals(fe6.A00) || !Arrays.equals(this.A01, fe6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + Arrays.hashCode(this.A01);
    }

    public FE6(FI4 fi4, int i, int i2, int i3, int i4) {
        this.A00 = fi4;
        this.A01 = new int[]{i, i2, i3, i4};
    }
}
