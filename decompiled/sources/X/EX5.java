package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes5.dex */
public final class EX5 implements EX9 {
    public final SecretKey A00;

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int length = ciphertext.length;
        if (length < 28) {
            throw new BadPaddingException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, ciphertext, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.A00, gCMParameterSpec);
        cipher.updateAAD(associatedData);
        return cipher.doFinal(ciphertext, 12, length - 12);
    }

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        int length = plaintext.length;
        if (length > 2147483619) {
            throw BV6.A0u("plaintext too long");
        }
        byte[] bArr = new byte[length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.A00);
        cipher.updateAAD(associatedData);
        if (cipher.doFinal(plaintext, 0, length, bArr, 12) != length + 16) {
            throw BV6.A0u("encryption failed: bytesWritten is wrong");
        }
        byte[] iv = cipher.getIV();
        if (iv.length != 12) {
            throw BV6.A0u("IV has unexpected length");
        }
        System.arraycopy(iv, 0, bArr, 0, 12);
        return bArr;
    }

    public EX5(String alias, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(alias, null);
        this.A00 = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(FGI.A0M("Keystore cannot load the key with ID: ", alias));
        }
    }
}
