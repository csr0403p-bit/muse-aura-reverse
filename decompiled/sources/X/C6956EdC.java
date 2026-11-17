package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: X.EdC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6956EdC implements EX9 {
    public final C6970EdS A00;
    public final SecretKey A01;
    public final byte[] A02;
    public static final byte[] A06 = EX7.A01("7a806c");
    public static final byte[] A03 = EX7.A01("46bb91c3c5");
    public static final byte[] A04 = EX7.A01("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] A05 = EX7.A01("bae8e37fc83441b16034566b");
    public static final byte[] A07 = EX7.A01("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    public static boolean A00(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = A05;
            cipher.init(2, BV4.A17(A04), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(A03);
            byte[] bArr2 = A07;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), A06);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        int length = ciphertext.length;
        byte[] bArr = this.A02;
        int length2 = bArr.length;
        if (length < length2 + 28) {
            throw BV6.A0u("ciphertext too short");
        }
        if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipherA00 = AbstractC6955EdB.A00();
        BV8.A1T(this.A01, new GCMParameterSpec(128, ciphertext, length2, 12), cipherA00, associatedData, 2);
        return cipherA00.doFinal(ciphertext, length2 + 12, (length - length2) - 12);
    }

    public C6956EdC(C6970EdS key, byte[] outputPrefix, byte[] cipherSupplier) throws InvalidAlgorithmParameterException {
        this.A02 = cipherSupplier;
        EX6.A00(outputPrefix.length);
        this.A01 = BV4.A17(outputPrefix);
        this.A00 = key;
    }

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        Cipher cipherA00 = AbstractC6955EdB.A00();
        int length = plaintext.length;
        byte[] bArr = this.A02;
        int length2 = bArr.length;
        if (length > 2147483619 - length2) {
            throw BV6.A0u("plaintext too long");
        }
        int i = length2 + 12;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i + length + 16);
        byte[] bArrA00 = EXH.A00(12);
        System.arraycopy(bArrA00, 0, bArrCopyOf, length2, 12);
        BV8.A1T(this.A01, new GCMParameterSpec(128, bArrA00, 0, bArrA00.length), cipherA00, associatedData, 1);
        int iDoFinal = cipherA00.doFinal(plaintext, 0, length, bArrCopyOf, i);
        if (iDoFinal == length + 16) {
            return bArrCopyOf;
        }
        throw BV6.A0u(String.format("encryption failed; AES-GCM-SIV tag must be %s bytes, but got only %s bytes", BV5.A1Z(16, iDoFinal - length)));
    }
}
