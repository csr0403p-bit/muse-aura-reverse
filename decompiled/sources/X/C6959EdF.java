package X;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: X.EdF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6959EdF implements EX9 {
    public static final EnumC7335ElD A02 = EnumC7335ElD.A02;
    public final SecretKey A00;
    public final byte[] A01;

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext == null) {
            throw BV4.A0a("plaintext is null");
        }
        byte[] bArrA00 = EXH.A00(12);
        AlgorithmParameterSpec algorithmParameterSpecA00 = AbstractC6951Ed7.A00(bArrA00, 0, bArrA00.length);
        Cipher cipher = AbstractC6951Ed7.A00.get();
        BV8.A1T(this.A00, algorithmParameterSpecA00, cipher, associatedData, 1);
        int length = plaintext.length;
        int outputSize = cipher.getOutputSize(length);
        byte[] bArr = this.A01;
        int length2 = bArr.length;
        if (outputSize > 2147483635 - length2) {
            throw BV6.A0u("plaintext too long");
        }
        int i = length2 + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i + outputSize);
        System.arraycopy(bArrA00, 0, bArrCopyOf, length2, 12);
        if (cipher.doFinal(plaintext, 0, length, bArrCopyOf, i) == outputSize) {
            return bArrCopyOf;
        }
        throw BV6.A0u("not enough data written");
    }

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext == null) {
            throw BV4.A0a("ciphertext is null");
        }
        int length = ciphertext.length;
        byte[] bArr = this.A01;
        int length2 = bArr.length;
        if (length < length2 + 28) {
            throw BV6.A0u("ciphertext too short");
        }
        if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecA00 = AbstractC6951Ed7.A00(ciphertext, length2, 12);
        Cipher cipher = AbstractC6951Ed7.A00.get();
        BV8.A1T(this.A00, algorithmParameterSpecA00, cipher, associatedData, 2);
        return cipher.doFinal(ciphertext, length2 + 12, (length - length2) - 12);
    }

    public C6959EdF(final C6966EdO key, byte[] outputPrefix) throws GeneralSecurityException {
        if (!A02.A00()) {
            throw BV6.A0u("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        EX6.A00(outputPrefix.length);
        this.A00 = BV4.A17(outputPrefix);
        this.A01 = key.A01();
    }
}
