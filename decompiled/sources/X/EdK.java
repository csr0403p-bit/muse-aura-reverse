package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class EdK implements EX9 {
    public static final EnumC7335ElD A04 = EnumC7335ElD.A01;
    public static final ThreadLocal<Cipher> A05 = new C6950Ed6();
    public final int A00;
    public final InterfaceC6968EdQ A01;
    public final SecretKeySpec A02;
    public final byte[] A03;

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        int length = ciphertext.length;
        byte[] bArr = this.A03;
        int length2 = bArr.length;
        int i = this.A00;
        int i2 = ((length - length2) - i) - 16;
        if (i2 < 0) {
            throw BV6.A0u("ciphertext too short");
        }
        if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        int i3 = 0;
        byte[] bArrA00 = A00(ciphertext, 0, length2, i);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        byte[] bArrA002 = A00(associatedData, 1, 0, associatedData.length);
        int i4 = length2 + i;
        byte[] bArrA003 = A00(ciphertext, 2, i4, i2);
        int i5 = length - 16;
        byte b = 0;
        do {
            b = (byte) (b | (((ciphertext[i5 + i3] ^ bArrA002[i3]) ^ bArrA00[i3]) ^ bArrA003[i3]));
            i3++;
        } while (i3 < 16);
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = A05.get();
        cipher.init(1, this.A02, new IvParameterSpec(bArrA00));
        return cipher.doFinal(ciphertext, i4, i2);
    }

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        byte[] bArr = associatedData;
        int length = plaintext.length;
        byte[] bArr2 = this.A03;
        int length2 = bArr2.length;
        int i = this.A00;
        if (length > ((Integer.MAX_VALUE - length2) - i) - 16) {
            throw BV6.A0u("plaintext too long");
        }
        int i2 = length2 + i;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i2 + length + 16);
        byte[] bArrA00 = EXH.A00(i);
        int i3 = 0;
        System.arraycopy(bArrA00, 0, bArrCopyOf, length2, i);
        byte[] bArrA002 = A00(bArrA00, 0, 0, bArrA00.length);
        if (associatedData == null) {
            bArr = new byte[0];
        }
        byte[] bArrA003 = A00(bArr, 1, 0, bArr.length);
        Cipher cipher = A05.get();
        cipher.init(1, this.A02, new IvParameterSpec(bArrA002));
        cipher.doFinal(plaintext, 0, length, bArrCopyOf, i2);
        byte[] bArrA004 = A00(bArrCopyOf, 2, i2, length);
        int i4 = length2 + length + i;
        do {
            bArrCopyOf[i4 + i3] = (byte) ((bArrA003[i3] ^ bArrA002[i3]) ^ bArrA004[i3]);
            i3++;
        } while (i3 < 16);
        return bArrCopyOf;
    }

    private byte[] A00(byte[] tag, final int data, int offset, int length) {
        byte[] bArr = new byte[length + 16];
        bArr[15] = (byte) data;
        System.arraycopy(tag, offset, bArr, 16, length);
        return this.A01.A6i(bArr, 16);
    }

    public EdK(final byte[] key, byte[] ivSizeInBytes, int outputPrefix) throws GeneralSecurityException {
        Provider providerA00;
        if (!A04.A00()) {
            throw BV6.A0u("Can not use AES-EAX in FIPS-mode.");
        }
        if (outputPrefix != 12 && outputPrefix != 16) {
            throw C60O.A0i("IV size should be either 12 or 16 bytes");
        }
        this.A00 = outputPrefix;
        int length = key.length;
        EX6.A00(length);
        this.A02 = BV4.A17(key);
        if (length != 16 && length != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", BV5.A1Y(length * 8)));
        }
        Hp7 hp7A01 = Hp7.A01(key);
        C6966EdO c6966EdO = hp7A01.A00;
        if (length != c6966EdO.A00.length) {
            throw BV6.A0u("Key size mismatch");
        }
        EnumC7335ElD enumC7335ElD = Ed2.A03;
        InterfaceC6968EdQ ed2 = new Ed2(c6966EdO.A01());
        try {
            EnumC7335ElD enumC7335ElD2 = EdN.A02;
            providerA00 = AF8.A00();
        } catch (GeneralSecurityException unused) {
        }
        if (providerA00 == null) {
            throw BV6.A0u("Conscrypt not available");
        }
        ed2 = C6967EdP.A00(ed2, hp7A01, providerA00);
        this.A01 = ed2;
        this.A03 = ivSizeInBytes;
    }
}
