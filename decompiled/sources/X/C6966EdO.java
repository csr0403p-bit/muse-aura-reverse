package X;

import java.util.Arrays;

/* renamed from: X.EdO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6966EdO {
    public final byte[] A00;

    public C6966EdO(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C6966EdO A00(final byte[] data) {
        if (data != null) {
            return new C6966EdO(data, data.length);
        }
        throw BV4.A0a("data must be non-null");
    }

    public final byte[] A01() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object o) {
        if (o instanceof C6966EdO) {
            return Arrays.equals(((C6966EdO) o).A00, this.A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return C60O.A0r("Bytes(", EX7.A00(this.A00));
    }
}
