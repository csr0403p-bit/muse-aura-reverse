package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class EZ1 {
    public static final byte[] A00;

    static {
        byte[] bArr;
        byte[] bArr2 = new byte[256];
        A00 = bArr2;
        Arrays.fill(bArr2, (byte) -1);
        char c = '0';
        do {
            bArr = A00;
            bArr[c] = (byte) (c - '0');
            c = (char) (c + 1);
        } while (c <= '9');
        char c2 = 'A';
        do {
            bArr[c2] = (byte) (c2 - '7');
            c2 = (char) (c2 + 1);
        } while (c2 <= 'F');
        char c3 = 'a';
        do {
            bArr[c3] = (byte) (c3 - 'W');
            c3 = (char) (c3 + 1);
        } while (c3 <= 'f');
        bArr[46] = -4;
    }
}
