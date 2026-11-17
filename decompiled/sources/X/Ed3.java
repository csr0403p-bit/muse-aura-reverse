package X;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public abstract class Ed3 {
    public static final byte[] A01(final byte[] x, final byte[] y) {
        int length = x.length;
        int length2 = y.length;
        if (length != length2) {
            throw C60O.A0i("The lengths of x and y should match.");
        }
        if (length - length < 0 || length2 - length < 0) {
            throw C60O.A0i("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (x[i] ^ y[i]);
        }
        return bArr;
    }

    public static byte[] A02(byte[]... chunks) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr : chunks) {
            if (length > Integer.MAX_VALUE - bArr.length) {
                throw BV6.A0u("exceeded size limit");
            }
            length += bArr.length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (byte[] bArr3 : chunks) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        return bArr2;
    }

    public static byte[] A00(Object obj, Object obj2) {
        return A02((byte[]) obj, (byte[]) obj2);
    }
}
