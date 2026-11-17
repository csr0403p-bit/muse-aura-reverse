package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EZN {
    public int A00;
    public byte[] A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof EZN)) {
            return false;
        }
        EZN ezn = (EZN) obj;
        if (ezn.A00 == this.A00) {
            return Arrays.equals(this.A01, ezn.A01);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.A00;
        byte[] bArr = this.A01;
        if (bArr != null) {
            int length = bArr.length;
            i = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[length];
            }
        } else {
            i = 0;
        }
        return i2 ^ i;
    }
}
