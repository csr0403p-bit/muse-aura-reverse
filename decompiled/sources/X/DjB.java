package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DjB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DjB djB = (DjB) obj;
                if (this.A01 != djB.A01 || this.A02 != djB.A02 || this.A00 != djB.A00 || !Arrays.equals(this.A03, djB.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }

    public DjB(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }
}
