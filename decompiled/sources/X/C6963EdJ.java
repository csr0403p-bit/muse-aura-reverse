package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.EdJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6963EdJ implements EXA {
    public final byte[] A00;
    public final byte[] A01;
    public final InterfaceC6968EdQ A02;
    public static final EnumC7335ElD A03 = EnumC7335ElD.A01;
    public static final byte[] A06 = new byte[16];
    public static final byte[] A05 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final ThreadLocal<Cipher> A04 = new C6953Ed9();

    private byte[] A00(final byte[]... s) {
        int i;
        byte[] bArrA01;
        int length = s.length;
        InterfaceC6968EdQ interfaceC6968EdQ = this.A02;
        if (length == 0) {
            bArrA01 = A05;
        } else {
            byte[] bArrA6i = interfaceC6968EdQ.A6i(A06, 16);
            int i2 = 0;
            while (true) {
                i = length - 1;
                if (i2 >= i) {
                    break;
                }
                byte[] bArr = s[i2];
                if (bArr == null) {
                    bArr = new byte[0];
                }
                bArrA6i = Ed3.A01(BXs.A00(bArrA6i), interfaceC6968EdQ.A6i(bArr, 16));
                i2++;
            }
            byte[] bArr2 = s[i];
            int length2 = bArr2.length;
            if (length2 >= 16) {
                int length3 = bArrA6i.length;
                if (length2 < length3) {
                    throw C60O.A0i("xorEnd requires a.length >= b.length");
                }
                int i3 = length2 - length3;
                bArrA01 = Arrays.copyOf(bArr2, length2);
                for (int i4 = 0; i4 < length3; i4++) {
                    int i5 = i3 + i4;
                    bArrA01[i5] = (byte) (bArrA01[i5] ^ bArrA6i[i4]);
                }
            } else {
                byte[] bArrCopyOf = Arrays.copyOf(bArr2, 16);
                bArrCopyOf[length2] = Byte.MIN_VALUE;
                bArrA01 = Ed3.A01(bArrCopyOf, BXs.A00(bArrA6i));
            }
        }
        return interfaceC6968EdQ.A6i(bArrA01, 16);
    }

    @Override // X.EXA
    public final byte[] A8j(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        byte[][] bArr = {associatedData};
        int length = ciphertext.length;
        byte[] bArr2 = this.A01;
        int length2 = bArr2.length;
        int i = length2 + 16;
        if (length < i) {
            throw BV6.A0u("Ciphertext too short.");
        }
        if (!AbstractC10509Hny.A02(bArr2, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = A04.get();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(ciphertext, length2, i);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, BV4.A17(this.A00), new IvParameterSpec(bArr3));
        int i2 = length - i;
        byte[] bArrDoFinal = cipher.doFinal(ciphertext, i, i2);
        if (i2 == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr4 = (byte[][]) Arrays.copyOf(bArr, 2);
        bArr4[1] = bArrDoFinal;
        if (MessageDigest.isEqual(bArrCopyOfRange, A00(bArr4))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // X.EXA
    public final byte[] AAX(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        byte[][] bArr = {associatedData};
        int length = plaintext.length;
        byte[] bArr2 = this.A01;
        int length2 = bArr2.length;
        if (length > 2147483631 - length2) {
            throw BV6.A0u("plaintext too long");
        }
        Cipher cipher = A04.get();
        byte[][] bArr3 = (byte[][]) Arrays.copyOf(bArr, 2);
        bArr3[1] = plaintext;
        byte[] bArrA00 = A00(bArr3);
        byte[] bArr4 = (byte[]) bArrA00.clone();
        bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
        bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
        cipher.init(1, BV4.A17(this.A00), new IvParameterSpec(bArr4));
        int length3 = bArrA00.length;
        int i = length2 + length3;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i + length);
        System.arraycopy(bArrA00, 0, bArrCopyOf, length2, length3);
        if (cipher.doFinal(plaintext, 0, length, bArrCopyOf, i) == length) {
            return bArrCopyOf;
        }
        throw BV6.A0u("not enough data written");
    }

    public C6963EdJ(final C6966EdO key, byte[] outputPrefix) throws GeneralSecurityException {
        Provider providerA00;
        if (!A03.A00()) {
            throw BV6.A0u("Can not use AES-SIV in FIPS-mode.");
        }
        int length = outputPrefix.length;
        if (length != 32 && length != 64) {
            throw new InvalidKeyException(FGI.A0I(AbstractC7606F5t.A00(43), length, " bytes; key must have 32 or 64 bytes"));
        }
        int i = length / 2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(outputPrefix, 0, i);
        this.A00 = Arrays.copyOfRange(outputPrefix, i, length);
        int length2 = bArrCopyOfRange.length;
        if (length2 != 16 && length2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", BV5.A1Y(length2 * 8)));
        }
        Hp7 hp7A01 = Hp7.A01(bArrCopyOfRange);
        C6966EdO c6966EdO = hp7A01.A00;
        if (length2 != c6966EdO.A00.length) {
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
        this.A02 = ed2;
        this.A01 = key.A01();
    }
}
