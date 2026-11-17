package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.secure.hatchcvm.HatchCVMException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes4.dex */
public final class ADo {
    public static final Object A03 = C3cG.A0T();
    public final String A00;
    public final boolean A01;
    public final SecureRandom A02;

    public final A7M A00(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null, null);
            Key key = keyStore.getKey("hatchcvm_local_secret_key_after_first_unlock", null);
            if (key == null) {
                synchronized (A03) {
                    KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                    keyStore2.load(null, null);
                    key = keyStore2.getKey("hatchcvm_local_secret_key_after_first_unlock", null);
                    if (key == null) {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES, "AndroidKeyStore");
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("hatchcvm_local_secret_key_after_first_unlock", 3).setBlockModes("GCM").setKeySize(256).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).setUnlockedDeviceRequired(false).build();
                        C7384Etj.A0U(keyGenParameterSpecBuild);
                        keyGenerator.init(keyGenParameterSpecBuild);
                        keyGenerator.generateKey();
                        KeyStore keyStore3 = KeyStore.getInstance("AndroidKeyStore");
                        keyStore3.load(null, null);
                        key = keyStore3.getKey("hatchcvm_local_secret_key_after_first_unlock", null);
                        if (key == null) {
                            throw C3cG.A0Q("Key missing after creation");
                        }
                    }
                }
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr3 = new byte[12];
            this.A02.nextBytes(bArr3);
            cipher.init(1, key, new GCMParameterSpec(128, bArr3));
            cipher.updateAAD(bArr2);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            C7384Etj.A0X(bArrDoFinal);
            String strEncodeToString = Base64.encodeToString(AbstractC0903AHf.A07(bArr3, bArrDoFinal), 11);
            C7384Etj.A0U(strEncodeToString);
            return new A7M("hatchcvm_local_secret_key_after_first_unlock", "AES-GCM-256-AAD-V1", strEncodeToString);
        } catch (IOException e) {
            throw new HatchCVMException("Failed to encrypt secret with AndroidKeyStore", e);
        } catch (GeneralSecurityException e2) {
            throw new HatchCVMException("Failed to encrypt secret with AndroidKeyStore", e2);
        } catch (ProviderException e3) {
            throw new HatchCVMException("Failed to encrypt secret with AndroidKeyStore", e3);
        }
    }

    public final byte[] A01(A7M a7m, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        try {
            byte[] bArrDecode = Base64.decode(a7m.A02, 11);
            int length = bArrDecode.length;
            if (length < 28) {
                throw new HatchCVMException("Encrypted secret payload is too short");
            }
            byte[] bArrA06 = AbstractC0903AHf.A06(bArrDecode, 0, 12);
            byte[] bArrA062 = AbstractC0903AHf.A06(bArrDecode, 12, length);
            String str = a7m.A01;
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null, null);
            Key key = keyStore.getKey(str, null);
            if (key == null) {
                throw new HatchCVMException(FGI.A0M("No keystore key for alias ", str));
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, key, new GCMParameterSpec(128, bArrA06));
            String str2 = a7m.A00;
            if ("AES-GCM-256".equals(str2)) {
                bArr = null;
            } else {
                if (!"AES-GCM-256-AAD-V1".equals(str2)) {
                    throw new HatchCVMException(FGI.A0M("Unsupported secret algorithm ", str2));
                }
                if (bArr == null) {
                    throw new HatchCVMException("Encrypted secret requires associated data");
                }
            }
            if (bArr != null) {
                cipher.updateAAD(bArr);
            }
            byte[] bArrDoFinal = cipher.doFinal(bArrA062);
            C7384Etj.A0U(bArrDoFinal);
            return bArrDoFinal;
        } catch (IOException e) {
            throw new HatchCVMException("Failed to decrypt secret with AndroidKeyStore", e);
        } catch (IllegalArgumentException e2) {
            throw new HatchCVMException("Encrypted secret payload is not valid base64url", e2);
        } catch (GeneralSecurityException e3) {
            throw new HatchCVMException("Failed to decrypt secret with AndroidKeyStore", e3);
        } catch (ProviderException e4) {
            throw new HatchCVMException("Failed to decrypt secret with AndroidKeyStore", e4);
        }
    }

    public ADo(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
        this.A02 = new SecureRandom();
    }

    public ADo() {
        this(false, "hatchcvm_local_secret_key");
    }
}
