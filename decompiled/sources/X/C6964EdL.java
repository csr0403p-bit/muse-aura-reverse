package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.EdL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6964EdL implements EX9 {
    public final int A00;
    public final InterfaceC6968EdQ A01;
    public final byte[] A02;

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext == null) {
            throw BV4.A0a("plaintext is null");
        }
        int i = this.A00;
        int i2 = i + 12;
        byte[] bArrA00 = EXH.A00(i2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA00, i);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA00, i, i2);
        EnumC7335ElD enumC7335ElD = AbstractC6969EdR.A00;
        byte[] bArrA002 = A00(bArrCopyOf);
        if (!enumC7335ElD.A00()) {
            throw BV6.A0u("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKeySpec secretKeySpecA17 = BV4.A17(bArrA002);
        byte[] bArr = this.A02;
        int length = bArr.length;
        int length2 = bArrCopyOfRange.length;
        int i3 = length + i + length2;
        if (length2 != 12) {
            throw BV6.A0u("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA00 = AbstractC6951Ed7.A00(bArrCopyOfRange, 0, length2);
        Cipher cipher = AbstractC6951Ed7.A00.get();
        BV8.A1T(secretKeySpecA17, algorithmParameterSpecA00, cipher, associatedData, 1);
        int length3 = plaintext.length;
        int outputSize = cipher.getOutputSize(length3);
        if (outputSize > Integer.MAX_VALUE - i3) {
            throw BV6.A0u("plaintext too long");
        }
        byte[] bArr2 = new byte[i3 + outputSize];
        if (cipher.doFinal(plaintext, 0, length3, bArr2, i3) != outputSize) {
            throw BV6.A0u("not enough data written");
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArrA00, 0, bArr2, length, bArrA00.length);
        return bArr2;
    }

    private byte[] A00(byte[] salt) throws GeneralSecurityException {
        byte[] bArr = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr2 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length = salt.length;
        if (length > 12 || length < 8) {
            throw BV6.A0u("invalid salt size");
        }
        System.arraycopy(salt, 0, bArr, 4, length);
        System.arraycopy(salt, 0, bArr2, 4, length);
        byte[] bArr3 = new byte[32];
        InterfaceC6968EdQ interfaceC6968EdQ = this.A01;
        System.arraycopy(interfaceC6968EdQ.A6i(bArr, 16), 0, bArr3, 0, 16);
        System.arraycopy(interfaceC6968EdQ.A6i(bArr2, 16), 0, bArr3, 16, 16);
        return bArr3;
    }

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext == null) {
            throw BV4.A0a("ciphertext is null");
        }
        int length = ciphertext.length;
        byte[] bArr = this.A02;
        int length2 = bArr.length;
        int i = length2 + this.A00;
        if (length < i + 28) {
            throw BV6.A0u("ciphertext too short");
        }
        if (!AbstractC10509Hny.A02(bArr, ciphertext)) {
            throw BV6.A0u("Decryption failed (OutputPrefix mismatch).");
        }
        EnumC7335ElD enumC7335ElD = AbstractC6969EdR.A00;
        byte[] bArrA00 = A00(Arrays.copyOfRange(ciphertext, length2, i));
        if (!AbstractC6969EdR.A00.A00()) {
            throw BV6.A0u("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKeySpec secretKeySpecA17 = BV4.A17(bArrA00);
        int i2 = i + 12;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(ciphertext, i, i2);
        int length3 = bArrCopyOfRange.length;
        if (length3 != 12) {
            throw BV6.A0u("iv is wrong size");
        }
        if (length < i2 + 16) {
            throw BV6.A0u("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA00 = AbstractC6951Ed7.A00(bArrCopyOfRange, 0, length3);
        Cipher cipher = AbstractC6951Ed7.A00.get();
        BV8.A1T(secretKeySpecA17, algorithmParameterSpecA00, cipher, associatedData, 2);
        return cipher.doFinal(ciphertext, i2, length - i2);
    }

    public C6964EdL(final C6966EdO key, byte[] outputPrefix, int saltSize) throws GeneralSecurityException {
        Provider providerA00;
        int length = outputPrefix.length;
        if (length != 16 && length != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", BV5.A1Y(length * 8)));
        }
        Hp7 hp7A01 = Hp7.A01(outputPrefix);
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
        this.A02 = key.A01();
        this.A00 = saltSize;
    }
}
