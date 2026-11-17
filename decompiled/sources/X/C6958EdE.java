package X;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.EdE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6958EdE implements EX9 {
    public final Provider A00;
    public final SecretKey A01;
    public final byte[] A02;
    public static final EnumC7335ElD A06 = EnumC7335ElD.A01;
    public static final byte[] A04 = EX7.A01("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] A05 = EX7.A01("070000004041424344454647");
    public static final byte[] A03 = EX7.A01("a0784d7a4716f3feb4f64e7f4b39bf04");

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext == null) {
            throw BV4.A0a("plaintext is null");
        }
        byte[] bArrA00 = EXH.A00(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA00);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.A00);
        BV8.A1T(this.A01, ivParameterSpec, cipher, associatedData, 1);
        int length = plaintext.length;
        int outputSize = cipher.getOutputSize(length);
        byte[] bArr = this.A02;
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

    public static Cipher A00() throws GeneralSecurityException {
        Cipher cipherAGa = AF2.A01.A00.AGa("ChaCha20-Poly1305");
        boolean z = false;
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(A05);
            byte[] bArr = A04;
            cipherAGa.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = A03;
            if (cipherAGa.doFinal(bArr2).length == 0) {
                cipherAGa.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipherAGa.doFinal(bArr2).length == 0) {
                    z = true;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        if (z) {
            return cipherAGa;
        }
        throw BV6.A0u("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext == null) {
            throw BV4.A0a("ciphertext is null");
        }
        int length = ciphertext.length;
        byte[] bArr = this.A02;
        int length2 = bArr.length;
        if (length < length2 + 28) {
            throw BV6.A0u("ciphertext too short");
        }
        if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr2 = new byte[12];
        System.arraycopy(ciphertext, length2, bArr2, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.A00);
        BV8.A1T(this.A01, ivParameterSpec, cipher, associatedData, 2);
        return cipher.doFinal(ciphertext, length2 + 12, (length - length2) - 12);
    }

    public C6958EdE(final Provider key, final byte[] outputPrefix, byte[] provider) throws GeneralSecurityException {
        if (!A06.A00()) {
            throw BV6.A0u("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (outputPrefix.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.A01 = new SecretKeySpec(outputPrefix, "ChaCha20");
        this.A02 = provider;
        this.A00 = key;
    }
}
