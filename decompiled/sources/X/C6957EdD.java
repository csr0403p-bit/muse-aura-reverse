package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.EdD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6957EdD implements EX9 {
    public static final EnumC7335ElD A03 = EnumC7335ElD.A01;
    public final Provider A00;
    public final byte[] A01;
    public final byte[] A02;

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext == null) {
            throw BV4.A0a("plaintext is null");
        }
        byte[] bArrA00 = EXH.A00(24);
        int[] iArrA04 = AbstractC6941Ect.A04(AbstractC6941Ect.A03(this.A01), AbstractC6941Ect.A03(bArrA00));
        ByteBuffer byteBufferA0t = BV5.A0t(iArrA04.length * 4);
        byteBufferA0t.asIntBuffer().put(iArrA04);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferA0t.array(), "ChaCha20");
        byte[] bArr = new byte[12];
        System.arraycopy(bArrA00, 16, bArr, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Provider provider = this.A00;
        byte[] bArr2 = C6958EdE.A05;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        BV8.A1T(secretKeySpec, ivParameterSpec, cipher, associatedData, 1);
        int length = plaintext.length;
        int outputSize = cipher.getOutputSize(length);
        byte[] bArr3 = this.A02;
        int length2 = bArr3.length;
        if (outputSize > 2147483623 - length2) {
            throw BV6.A0u("plaintext too long");
        }
        int i = length2 + 24;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i + outputSize);
        System.arraycopy(bArrA00, 0, bArrCopyOf, length2, 24);
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
        byte[] bArr = this.A02;
        int length2 = bArr.length;
        if (length < length2 + 40) {
            throw BV6.A0u("ciphertext too short");
        }
        if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr2 = new byte[24];
        System.arraycopy(ciphertext, length2, bArr2, 0, 24);
        int[] iArrA04 = AbstractC6941Ect.A04(AbstractC6941Ect.A03(this.A01), AbstractC6941Ect.A03(bArr2));
        ByteBuffer byteBufferA0t = BV5.A0t(iArrA04.length * 4);
        byteBufferA0t.asIntBuffer().put(iArrA04);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferA0t.array(), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArr2, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Provider provider = this.A00;
        byte[] bArr4 = C6958EdE.A05;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        BV8.A1T(secretKeySpec, ivParameterSpec, cipher, associatedData, 2);
        return cipher.doFinal(ciphertext, length2 + 24, (length - length2) - 24);
    }

    public C6957EdD(final Provider key, final byte[] outputPrefix, byte[] provider) throws GeneralSecurityException {
        if (!A03.A00()) {
            throw BV6.A0u("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (outputPrefix.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.A01 = outputPrefix;
        this.A02 = provider;
        this.A00 = key;
    }
}
