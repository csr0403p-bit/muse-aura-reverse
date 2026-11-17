package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.pushlite.hpke.HPKEException;
import com.facebook.pushlite.hpke.KeyNotFoundException;
import com.facebook.pushlite.model.PushInfraMetaData;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.Cj9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3989Cj9 implements InterfaceC3984CiY {
    public static final C3989Cj9 A00 = new C3989Cj9();

    public static final byte[] A00(C3991CjB c3991CjB, String str, byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, HPKEException {
        AbstractC3994CjE c3997CjH;
        C7384Etj.A0Y(bArr2, 2);
        try {
            long j = (Long.parseLong(str, 16) >> 16) & 65535;
            if (j == EnumC3992CjC.A03.value) {
                c3997CjH = new C3996CjG();
            } else {
                if (j != EnumC3992CjC.A04.value) {
                    throw new HPKEException("Only AES256GCM or AES128GCM are supported.");
                }
                c3997CjH = new C3997CjH();
            }
            byte[] bArr3 = c3991CjB.A00;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            for (int i = 0; i < length; i++) {
                bArr4[i] = (byte) (bArr4[i] ^ c3991CjB.A04[i]);
            }
            byte[] bArr5 = c3991CjB.A01;
            C7384Etj.A0Y(bArr5, 0);
            int length2 = bArr5.length;
            if (length2 != c3997CjH.A00) {
                throw new InvalidAlgorithmParameterException(FGI.A0H("Key has invalid length: ", length2));
            }
            EnumC3992CjC enumC3992CjC = AbstractC3994CjE.A01;
            if (length != enumC3992CjC.nn) {
                throw new InvalidAlgorithmParameterException(FGI.A0H("Nonce has invalid length: ", length));
            }
            SecretKeySpec secretKeySpecA17 = BV4.A17(bArr5);
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(enumC3992CjC.nt * 8, bArr4);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpecA17, gCMParameterSpec);
            cipher.updateAAD(bArr);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            C7384Etj.A0U(bArrDoFinal);
            byte[] bArr6 = c3991CjB.A04;
            boolean z = false;
            for (int length3 = bArr6.length - 1; length3 >= 0 && !z; length3--) {
                byte b = bArr6[length3];
                if (b != -1) {
                    bArr6[length3] = (byte) (b + 1);
                    z = true;
                } else {
                    bArr6[length3] = 0;
                }
            }
            return bArrDoFinal;
        } catch (InvalidAlgorithmParameterException e) {
            throw new HPKEException(e);
        } catch (InvalidKeyException e2) {
            throw new HPKEException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new HPKEException(e3);
        } catch (BadPaddingException e4) {
            throw new HPKEException(e4);
        } catch (IllegalBlockSizeException e5) {
            throw new HPKEException(e5);
        } catch (NoSuchPaddingException e6) {
            throw new HPKEException(e6);
        }
    }

    @Override // X.InterfaceC3984CiY
    public final Object AYX(C3979CiT c3979CiT) throws IllegalStateException, InvalidKeySpecException, NoSuchAlgorithmException, NumberFormatException, InvalidKeyException, IOException, KeyStoreException, HPKEException {
        Context context;
        C3995CjF c3995CjF;
        KeyPair keyPair;
        int length;
        int length2;
        int length3;
        IllegalArgumentException illegalArgumentExceptionA0i;
        C7384Etj.A0Y(c3979CiT, 0);
        PushInfraMetaData pushInfraMetaData = c3979CiT.A08;
        String str = pushInfraMetaData.A07;
        if (str == null) {
            illegalArgumentExceptionA0i = C60O.A0i("Ciphersuite is null");
        } else {
            String str2 = pushInfraMetaData.A08;
            if (str2 == null) {
                illegalArgumentExceptionA0i = C60O.A0i("encappedKey is null");
            } else {
                String str3 = pushInfraMetaData.A09;
                if (str3 != null) {
                    try {
                        context = c3979CiT.A06;
                        C7384Etj.A0Y(context, 0);
                        try {
                            c3995CjF = new C3995CjF(new F03(context), str3);
                        } catch (KeyNotFoundException e) {
                            try {
                                c3995CjF = new C3995CjF(EX1.A00(context), str3);
                            } catch (Exception e2) {
                                throw new KeyStoreException(C6tn.A05(FGI.A0h("\n                    Cask Exception: ", e.getMessage(), "\n                    ECP Exception: ", e2.getMessage(), "\n                    ")));
                            }
                        } catch (KeyStoreException e3) {
                            try {
                                c3995CjF = new C3995CjF(EX1.A00(context), str3);
                            } catch (Exception e4) {
                                throw new KeyStoreException(C6tn.A05(FGI.A0h("\n                    Cask Exception: ", e3.getMessage(), "\n                    ECP Exception: ", e4.getMessage(), "\n                    ")));
                            }
                        }
                        keyPair = c3995CjF.A00;
                    } catch (Exception e5) {
                        return C3cG.A0s(new IllegalStateException(FGI.A0M("HPKE context setup failed: ", e5.getMessage()), e5));
                    }
                    if (!(keyPair.getPublic() instanceof ECPublicKey)) {
                        throw new KeyStoreException("Key retrieved from keystore is not an ECPublicKey");
                    }
                    PublicKey publicKey = keyPair.getPublic();
                    String strA00 = C8j2.A00(71);
                    C7384Etj.A0Z(publicKey, strA00);
                    ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
                    ECPoint w = eCPublicKey.getW();
                    C7384Etj.A0U(w);
                    AbstractC7474ExK.A00(w);
                    if (!(keyPair.getPrivate() instanceof ECPrivateKey)) {
                        throw new KeyStoreException("Key retrieved from keystore is not an ECPrivateKey");
                    }
                    PrivateKey privateKey = keyPair.getPrivate();
                    C7384Etj.A0Z(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
                    ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
                    try {
                        long j = Long.parseLong(str, 16);
                        long j2 = 255 & (j >> 8);
                        long j3 = (j >> 16) & 65535;
                        long j4 = (j >> 32) & 65535;
                        long j5 = (j >> 48) & 65535;
                        EnumC7468Ex4 enumC7468Ex4 = EnumC7468Ex4.A00.get(Byte.valueOf((byte) j2));
                        if (enumC7468Ex4 == null) {
                            throw new NoSuchAlgorithmException("Algorithm mode does not exist for value");
                        }
                        EnumC3992CjC enumC3992CjC = (EnumC3992CjC) BV7.A0r(EnumC3992CjC.A00, (int) j3);
                        if (enumC3992CjC == null) {
                            throw new NoSuchAlgorithmException("Algorithm aead does not exist for value");
                        }
                        Ets ets = (Ets) BV7.A0r(Ets.A00, (int) j4);
                        if (ets == null) {
                            throw new NoSuchAlgorithmException("Algorithm kdf does not exist for value");
                        }
                        EnumC3993CjD enumC3993CjD = (EnumC3993CjD) BV7.A0r(EnumC3993CjD.A00, (int) j5);
                        if (enumC3993CjD == null) {
                            throw new NoSuchAlgorithmException("Algorithm kdf does not exist for value");
                        }
                        byte[] bArrDecode = Base64.decode(C3cG.A1S(str2), 0);
                        C7384Etj.A0X(bArrDecode);
                        byte[] bArr = new byte[0];
                        try {
                            try {
                                try {
                                    try {
                                        if (ets.value != Ets.A03.value) {
                                            throw new HPKEException("Only DHKEM_P256_SHA256 is supported.");
                                        }
                                        if (enumC3993CjD.value != EnumC3993CjD.A03.value) {
                                            throw new HPKEException("Only HKDF-SHA256 is supported.");
                                        }
                                        if (bArrDecode.length != 65) {
                                            throw BV4.A0K("Point does not match P256 EC field size");
                                        }
                                        if (bArrDecode[0] != 4) {
                                            throw BV4.A0K("Only uncompressed point format accepted");
                                        }
                                        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArrDecode, 1, 33)), new BigInteger(1, Arrays.copyOfRange(bArrDecode, 33, 65)));
                                        AbstractC7474ExK.A00(eCPoint);
                                        AbstractC7474ExK.A00(eCPoint);
                                        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, AbstractC7474ExK.A00));
                                        C7384Etj.A0Z(publicKeyGeneratePublic, strA00);
                                        ECPublicKey eCPublicKey2 = (ECPublicKey) publicKeyGeneratePublic;
                                        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                                        if (keyAgreement == null) {
                                            throw new NoSuchAlgorithmException("Could not get instance of KeyAgreement for algorithm ECDH.");
                                        }
                                        keyAgreement.init(eCPrivateKey);
                                        keyAgreement.doPhase(eCPublicKey2, true);
                                        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                                        C7384Etj.A0U(bArrGenerateSecret);
                                        ECPoint w2 = eCPublicKey.getW();
                                        C7384Etj.A0U(w2);
                                        AbstractC7474ExK.A00(w2);
                                        byte[] bArr2 = new byte[65];
                                        BigInteger affineX = w2.getAffineX();
                                        BigInteger affineY = w2.getAffineY();
                                        if (affineX.signum() != 0 || affineY.signum() != 0) {
                                            byte[] byteArray = affineX.toByteArray();
                                            C7384Etj.A0U(byteArray);
                                            int i = 0;
                                            while (true) {
                                                length = byteArray.length;
                                                if (i >= length - 1 || byteArray[i] != 0) {
                                                    break;
                                                }
                                                i++;
                                            }
                                            if (i != 0) {
                                                byteArray = Arrays.copyOfRange(byteArray, i, length);
                                                C7384Etj.A0U(byteArray);
                                            }
                                            byte[] byteArray2 = affineY.toByteArray();
                                            C7384Etj.A0U(byteArray2);
                                            int i2 = 0;
                                            while (true) {
                                                length2 = byteArray2.length;
                                                if (i2 >= length2 - 1 || byteArray2[i2] != 0) {
                                                    break;
                                                }
                                                i2++;
                                            }
                                            if (i2 != 0) {
                                                byteArray2 = Arrays.copyOfRange(byteArray2, i2, length2);
                                                C7384Etj.A0U(byteArray2);
                                            }
                                            int length4 = byteArray.length;
                                            if (length4 > 32 || (length3 = byteArray2.length) > 32) {
                                                throw new InvalidParameterException("Point provided does not conform to P256 coordinate size");
                                            }
                                            bArr2[0] = 4;
                                            System.arraycopy(byteArray, 0, bArr2, 33 - length4, length4);
                                            System.arraycopy(byteArray2, 0, bArr2, 65 - length3, length3);
                                        }
                                        byte[] bArrA03 = AbstractC3990CjA.A03(bArrDecode, bArr2);
                                        byte[] bArrA032 = AbstractC3990CjA.A03(AbstractC3990CjA.A03, AbstractC3990CjA.A00(ets.value));
                                        int i3 = ets.nSecret;
                                        byte[] bArr3 = AbstractC3990CjA.A00;
                                        C7384Etj.A0Y(bArr3, 0);
                                        byte[] bArrA033 = AbstractC3990CjA.A03(AbstractC3990CjA.A02, bArrA032, bArr3, bArrGenerateSecret);
                                        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[32], ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
                                        Mac mac = Mac.getInstance(ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
                                        mac.init(secretKeySpec);
                                        byte[] bArrDoFinal = mac.doFinal(bArrA033);
                                        C7384Etj.A0U(bArrDoFinal);
                                        byte[] bArrA01 = AbstractC3990CjA.A01(new SecretKeySpec(bArrDoFinal, ConfidentialVmPinVerifierCrypto.HMAC_SHA256), AbstractC3990CjA.A04, bArrA03, bArrA032, i3);
                                        byte[] bArr4 = C3991CjB.A05;
                                        C3991CjB c3991CjB = new C3991CjB(enumC3992CjC, enumC3993CjD, ets, bArrA01, bArr, enumC7468Ex4.value);
                                        InterfaceC3985Cia c3980CiU = c3979CiT.A0A;
                                        InterfaceC3985Cia c3980CiU2 = c3979CiT.A09;
                                        if (c3980CiU instanceof C3980CiU) {
                                            try {
                                                c3980CiU = new C3980CiU(A00(c3991CjB, str, new byte[0], ((C3980CiU) c3980CiU).A00));
                                            } catch (Exception e6) {
                                                return C3cG.A0s(new IllegalStateException(FGI.A0M("HPKE payload decryption failed: ", e6.getMessage()), e6));
                                            }
                                        } else if (c3980CiU instanceof C3970CiI) {
                                            illegalArgumentExceptionA0i = C60O.A0i("HPKE decryption failed, plugin expects type \"ByteArray\" not \"String\"");
                                        }
                                        if (c3980CiU2 instanceof C3980CiU) {
                                            try {
                                                c3980CiU2 = new C3980CiU(A00(c3991CjB, str, new byte[0], ((C3980CiU) c3980CiU2).A00));
                                            } catch (Exception e7) {
                                                return C3cG.A0s(new IllegalStateException(FGI.A0M("HPKE binary payload decryption failed: ", e7.getMessage()), e7));
                                            }
                                        } else if (c3980CiU2 instanceof C3970CiI) {
                                            illegalArgumentExceptionA0i = C60O.A0i("HPKE decryption failed, plugin expects type \"ByteArray\" not \"String\"");
                                        }
                                        String str4 = c3979CiT.A0F;
                                        Integer num = c3979CiT.A00;
                                        boolean z = c3979CiT.A02;
                                        String str5 = c3979CiT.A0E;
                                        String str6 = c3979CiT.A0D;
                                        String str7 = c3979CiT.A0C;
                                        boolean z2 = c3979CiT.A01;
                                        int i4 = c3979CiT.A05;
                                        int i5 = c3979CiT.A04;
                                        C3972CiK c3972CiK = c3979CiT.A07;
                                        Integer num2 = c3979CiT.A0B;
                                        AnonymousClass002.A1H(str4, 4, c3972CiK);
                                        return new C3979CiT(context, c3972CiK, pushInfraMetaData, c3980CiU, c3980CiU2, num, num2, str4, str5, str6, str7, i4, i5, true, z, z2);
                                    } catch (IOException e8) {
                                        throw new HPKEException(e8);
                                    }
                                } catch (InvalidAlgorithmParameterException e9) {
                                    throw new HPKEException(e9);
                                }
                            } catch (InvalidParameterException e10) {
                                throw new HPKEException(e10);
                            } catch (InvalidKeySpecException e11) {
                                throw new HPKEException(e11);
                            }
                        } catch (InvalidKeyException e12) {
                            throw new HPKEException(e12);
                        } catch (NoSuchAlgorithmException e13) {
                            throw new HPKEException(e13);
                        }
                        return C3cG.A0s(new IllegalStateException(FGI.A0M("HPKE context setup failed: ", e5.getMessage()), e5));
                    } catch (Exception e14) {
                        throw new NoSuchAlgorithmException(FGI.A0M("Error parsing ciphersuite string: ", str), e14);
                    }
                }
                illegalArgumentExceptionA0i = C60O.A0i("keystoreId is null");
            }
        }
        return C3cG.A0s(illegalArgumentExceptionA0i);
    }

    @Override // X.InterfaceC3984CiY
    public final boolean AfW(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        PushInfraMetaData pushInfraMetaData = c3979CiT.A08;
        return (pushInfraMetaData.A07 == null || pushInfraMetaData.A08 == null || pushInfraMetaData.A09 == null) ? false : true;
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "hpke_notif_decryption";
    }
}
