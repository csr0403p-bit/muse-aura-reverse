package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public final class Ed2 implements InterfaceC6968EdQ {
    public static final EnumC7335ElD A03 = EnumC7335ElD.A01;
    public static final ThreadLocal<Cipher> A04 = new C6948Ed4();
    public byte[] A00;
    public byte[] A01;
    public final SecretKey A02;

    @Override // X.InterfaceC6968EdQ
    public final byte[] A6i(final byte[] data, int outputLength) throws GeneralSecurityException {
        byte[] bArrA01;
        if (outputLength > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!A03.A00()) {
            throw BV6.A0u("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = A04.get();
        cipher.init(1, this.A02);
        int length = data.length;
        int i = length != 0 ? ((length - 1) / 16) + 1 : 1;
        int i2 = i - 1;
        int i3 = i2 * 16;
        if (i * 16 == length) {
            byte[] bArr = this.A00;
            if (length - 16 < i3 || bArr.length - 16 < 0) {
                throw C60O.A0i("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            }
            bArrA01 = new byte[16];
            int i4 = 0;
            do {
                bArrA01[i4] = (byte) (data[i4 + i3] ^ bArr[i4]);
                i4++;
            } while (i4 < 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(data, i3, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw C60O.A0i("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = Byte.MIN_VALUE;
            bArrA01 = Ed3.A01(bArrCopyOf, this.A01);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 * 16;
            int i7 = 0;
            do {
                bArr3[i7] = (byte) (bArr2[i7] ^ data[i7 + i6]);
                i7++;
            } while (i7 < 16);
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw C3cG.A0Q("Cipher didn't write full block");
            }
        }
        int i8 = 0;
        do {
            bArr3[i8] = (byte) (bArr2[i8] ^ bArrA01[i8]);
            i8++;
        } while (i8 < 16);
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == outputLength ? bArr2 : Arrays.copyOf(bArr2, outputLength);
        }
        throw C3cG.A0Q("Cipher didn't write full block");
    }

    public Ed2(final byte[] key) throws GeneralSecurityException {
        EX6.A00(key.length);
        this.A02 = BV4.A17(key);
        if (!A03.A00()) {
            throw BV6.A0u("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = A04.get();
        cipher.init(1, this.A02);
        byte[] bArrA00 = BXs.A00(cipher.doFinal(new byte[16]));
        this.A00 = bArrA00;
        this.A01 = BXs.A00(bArrA00);
    }
}
