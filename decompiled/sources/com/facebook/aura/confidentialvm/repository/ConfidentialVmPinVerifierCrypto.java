package com.facebook.aura.confidentialvm.repository;

import X.AbstractC0903AHf;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.DCl;
import X.FGI;
import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class ConfidentialVmPinVerifierCrypto {
    public static final String AES = "AES";
    public static final String AES_GCM = "AES/GCM/NoPadding";
    public static final int BASE64_FLAGS = 2;
    public static final String ENVELOPE_PREFIX = "hatch:pin-reminder:v1:";
    public static final int HASH_LENGTH_BYTES = 32;
    public static final String HMAC_SHA256 = "HmacSHA256";
    public static final ConfidentialVmPinVerifierCrypto INSTANCE = new ConfidentialVmPinVerifierCrypto();
    public static final String KEY_INFO = "hatch:pin-reminder:key:v1";
    public static final int KEY_LENGTH_BYTES = 32;
    public static final int NONCE_LENGTH_BYTES = 12;
    public static final String SHA_256 = "SHA-256";
    public static final int TAG_LENGTH_BITS = 128;
    public static final int TAG_LENGTH_BYTES = 16;
    public static final int VERIFIER_LENGTH_BYTES = 32;

    private final byte[] open(byte[] bArr, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDecode;
        if (bArr.length == 32 && AnonymousClass005.A1a(str, ENVELOPE_PREFIX)) {
            try {
                bArrDecode = Base64.decode(str.substring(22), 2);
            } catch (IllegalArgumentException | AEADBadTagException | GeneralSecurityException unused) {
            }
            if (bArrDecode.length == 60) {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, new SecretKeySpec(bArr, AES), new GCMParameterSpec(128, bArrDecode, 0, 12));
                byte[] bArrDoFinal = cipher.doFinal(bArrDecode, 12, 48);
                if (bArrDoFinal.length == 32) {
                    return bArrDoFinal;
                }
                return null;
            }
        }
        return null;
    }

    public final boolean authenticates(byte[] bArr, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        boolean zA1a = AnonymousClass002.A1a(bArr, str);
        byte[] bArrOpen = open(bArr, str);
        if (bArrOpen == null) {
            return false;
        }
        C8j3.A1L(bArrOpen);
        return zA1a;
    }

    public final byte[] canonicalVerifierBytes(String str) {
        C7384Etj.A0Y(str, 0);
        if (isCanonicalPin(str)) {
            return sha256(str.getBytes(DCl.A01));
        }
        return null;
    }

    public final byte[] deriveKey(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return hkdfSha256(bArr, new byte[0], KEY_INFO.getBytes(DCl.A01), 32);
    }

    private final byte[] hkdfSha256(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws Throwable {
        byte[] bArrDoFinal;
        int i2 = 1;
        if (1 > i || i >= 8161) {
            throw C60O.A0i("HKDF output length must be in 1..8160");
        }
        byte[] bArr4 = new byte[0];
        byte[] bArrDoFinal2 = null;
        try {
            try {
                Mac mac = Mac.getInstance(HMAC_SHA256);
                if (bArr2.length == 0) {
                    bArr2 = new byte[32];
                }
                C8j4.A1P(HMAC_SHA256, mac, bArr2);
                bArrDoFinal2 = mac.doFinal(bArr);
                C8j4.A1P(HMAC_SHA256, mac, bArrDoFinal2);
                byte[] bArr5 = new byte[i];
                int i3 = 0;
                while (i3 < i) {
                    mac.update(bArr4);
                    mac.update(bArr3);
                    mac.update((byte) i2);
                    bArrDoFinal = mac.doFinal();
                    C8j3.A1L(bArr4);
                    C7384Etj.A0X(bArrDoFinal);
                    try {
                        int iA0F = C8j3.A0F(i, i3, bArrDoFinal.length);
                        System.arraycopy(bArrDoFinal, 0, bArr5, i3, iA0F);
                        i3 += iA0F;
                        i2++;
                        bArr4 = bArrDoFinal;
                    } catch (GeneralSecurityException e) {
                        e = e;
                        bArr4 = bArrDoFinal;
                        throw new ConfidentialVmPinVerifierCryptoException("HKDF-SHA256 derivation failed", e);
                    } catch (Throwable th) {
                        th = th;
                        if (bArrDoFinal2 != null) {
                            C8j3.A1L(bArrDoFinal2);
                        }
                        C8j3.A1L(bArrDoFinal);
                        throw th;
                    }
                }
                if (bArrDoFinal2 != null) {
                    C8j3.A1L(bArrDoFinal2);
                }
                C8j3.A1L(bArr4);
                return bArr5;
            } catch (GeneralSecurityException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            bArrDoFinal = bArr4;
        }
    }

    private final byte[] sha256(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance(SHA_256).digest(bArr);
        C7384Etj.A0U(bArrDigest);
        return bArrDigest;
    }

    public final String seal$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(byte[] bArr, String str, byte[] bArr2) {
        boolean zA1a = AnonymousClass002.A1a(bArr, str);
        C7384Etj.A0Y(bArr2, 2);
        if (bArr.length != 32) {
            throw C60O.A0i("K_pin_reminder must be 32 bytes");
        }
        if (bArr2.length != 12) {
            throw C60O.A0i("PIN reminder nonce must be 12 bytes");
        }
        byte[] bArrCanonicalVerifierBytes = canonicalVerifierBytes(str);
        if (bArrCanonicalVerifierBytes == null) {
            throw new ConfidentialVmPinVerifierCryptoException("PIN reminder verifier requires an ASCII-digit PIN", null);
        }
        try {
            try {
                byte[] bArrDoFinal = C8j5.A0e(bArr, bArr2, zA1a ? 1 : 0).doFinal(bArrCanonicalVerifierBytes);
                C7384Etj.A0U(bArrDoFinal);
                return FGI.A0M(ENVELOPE_PREFIX, Base64.encodeToString(AbstractC0903AHf.A07(bArr2, bArrDoFinal), 2));
            } catch (GeneralSecurityException e) {
                throw new ConfidentialVmPinVerifierCryptoException("PIN reminder verifier sealing failed", e);
            }
        } finally {
            C8j3.A1L(bArrCanonicalVerifierBytes);
        }
    }

    private final boolean isCanonicalPin(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        int i = 0;
        do {
            char cCharAt = str.charAt(i);
            if ('0' > cCharAt || cCharAt >= ':') {
                return false;
            }
            i++;
        } while (i < length);
        return true;
    }

    public final String seal(byte[] bArr, String str) {
        AnonymousClass003.A0u(bArr, str);
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        return seal$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(bArr, str, bArr2);
    }

    public final ConfidentialVmPinVerifyResult verify(byte[] bArr, String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        AnonymousClass005.A10(bArr, str, str2);
        byte[] bArrOpen = open(bArr, str);
        if (bArrOpen == null) {
            return ConfidentialVmPinVerifyResult.AuthenticationFailed.INSTANCE;
        }
        try {
            byte[] bArrCanonicalVerifierBytes = canonicalVerifierBytes(str2);
            if (bArrCanonicalVerifierBytes == null) {
                return ConfidentialVmPinVerifyResult.Mismatch.INSTANCE;
            }
            try {
                return MessageDigest.isEqual(bArrOpen, bArrCanonicalVerifierBytes) ? ConfidentialVmPinVerifyResult.Match.INSTANCE : ConfidentialVmPinVerifyResult.Mismatch.INSTANCE;
            } finally {
                C8j3.A1L(bArrCanonicalVerifierBytes);
            }
        } finally {
            C8j3.A1L(bArrOpen);
        }
    }
}
