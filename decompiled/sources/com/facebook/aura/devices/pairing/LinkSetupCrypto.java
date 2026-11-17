package com.facebook.aura.devices.pairing;

import X.AbstractC0878AGe;
import X.AbstractC0903AHf;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFI;
import X.C06G;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.C9tI;
import X.FGI;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public final class LinkSetupCrypto {
    public static final int $stable = 0;
    public static final LinkSetupCrypto INSTANCE = new LinkSetupCrypto();
    public static final SecureRandom secureRandom = new SecureRandom();

    public final class SealedAesGcm extends C06G {
        public static final int $stable = 8;
        public final byte[] ciphertext;
        public final byte[] tag;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SealedAesGcm) {
                    SealedAesGcm sealedAesGcm = (SealedAesGcm) obj;
                    if (!C7384Etj.areEqual(this.ciphertext, sealedAesGcm.ciphertext) || !C7384Etj.areEqual(this.tag, sealedAesGcm.tag)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SealedAesGcm copy$default(SealedAesGcm sealedAesGcm, byte[] bArr, byte[] bArr2, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = sealedAesGcm.ciphertext;
            }
            if ((i & 2) != 0) {
                bArr2 = sealedAesGcm.tag;
            }
            AnonymousClass003.A0u(bArr, bArr2);
            return new SealedAesGcm(bArr, bArr2);
        }

        public final byte[] component1() {
            return this.ciphertext;
        }

        public final byte[] component2() {
            return this.tag;
        }

        public final byte[] getCiphertext() {
            return this.ciphertext;
        }

        public final byte[] getTag() {
            return this.tag;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.ciphertext) * 31) + Arrays.hashCode(this.tag);
        }

        public SealedAesGcm(byte[] bArr, byte[] bArr2) {
            AnonymousClass003.A0u(bArr, bArr2);
            this.ciphertext = bArr;
            this.tag = bArr2;
        }

        public final SealedAesGcm copy(byte[] bArr, byte[] bArr2) {
            AnonymousClass003.A0u(bArr, bArr2);
            return new SealedAesGcm(bArr, bArr2);
        }

        public String toString() {
            return super.toString();
        }
    }

    private final byte[] derInteger(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (bArr[i] != 0) {
                break;
            }
            i++;
        }
        byte[] bArrA06 = i == -1 ? new byte[]{0} : AbstractC0903AHf.A06(bArr, i, length);
        if ((bArrA06[0] & 128) != 0) {
            bArrA06 = AbstractC0903AHf.A07(new byte[]{0}, bArrA06);
        }
        return AbstractC0903AHf.A07(new byte[]{2, (byte) bArrA06.length}, bArrA06);
    }

    private final byte[] rawP256SignatureToDer(byte[] bArr) {
        int length = bArr.length;
        if (length != 64) {
            return null;
        }
        byte[] bArrA07 = AbstractC0903AHf.A07(derInteger(AbstractC0903AHf.A06(bArr, 0, 32)), derInteger(AbstractC0903AHf.A06(bArr, 32, length)));
        return AbstractC0903AHf.A07(new byte[]{48, (byte) bArrA07.length}, bArrA07);
    }

    public final byte[] base64UrlDecode(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            return Base64.getUrlDecoder().decode(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String base64UrlEncode(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        String strEncodeToString = Base64.getUrlEncoder().withoutPadding().encodeToString(bArr);
        C7384Etj.A0U(strEncodeToString);
        return strEncodeToString;
    }

    public final LinkEncryptedPairingSession completePairing(LinkDeviceInfo linkDeviceInfo, LinkPairingStart linkPairingStart, LinkPairingReady linkPairingReady) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrBase64UrlDecode;
        ECPublicKey eCPublicKeyP256PublicKeyFromUncompressed;
        byte[] bArrBase64UrlDecode2;
        AnonymousClass005.A10(linkDeviceInfo, linkPairingStart, linkPairingReady);
        LinkPairingMode pairingMode = linkDeviceInfo.getPairingMode();
        if (pairingMode == null || pairingMode != linkPairingStart.pairingMode || linkPairingReady.version != pairingMode.getHelloVersion() || !C7384Etj.areEqual(linkPairingReady.deviceId, linkDeviceInfo.deviceId) || !C7384Etj.areEqual(linkPairingReady.nodeId, linkDeviceInfo.nodeId) || !C7384Etj.areEqual(linkPairingReady.mac, linkDeviceInfo.mac) || !LinkEncryptedPairingKt.LINK_PAIRING_MODEL.equals(linkPairingReady.model) || !LinkEncryptedPairingKt.LINK_PAIRING_CIPHER_SUITE.equals(linkPairingReady.selectedCipherSuite) || !C7384Etj.areEqual(linkPairingReady.pairingAuth, linkDeviceInfo.pairingAuth) || linkPairingReady.pairingAuthEpoch != linkDeviceInfo.pairingAuthEpoch) {
            return null;
        }
        if ((pairingMode.getHelloVersion() == 5 && (!C7384Etj.areEqual(linkPairingReady.pairingAuth, linkPairingStart.clientHello.pairing_auth) || !C7384Etj.areEqual(linkPairingReady.pairingPolicy, linkDeviceInfo.pairingPolicy) || !C7384Etj.areEqual(linkPairingReady.pairingPolicy, linkPairingStart.clientHello.pairing_policy))) || !LinkEncryptedPairingKt.matchesPairingMode(linkPairingReady, pairingMode)) {
            return null;
        }
        LinkPairingClientHello linkPairingClientHello = linkPairingStart.clientHello;
        byte[] bArrTranscript = transcript(linkPairingReady, linkPairingClientHello.mobile_pub, linkPairingClientHello.mobile_nonce, pairingMode);
        byte[] bArrSha256 = sha256(bArrTranscript);
        if (!C7384Etj.areEqual(base64UrlEncode(bArrSha256), linkPairingReady.transcriptHash) || !verifyDeviceProof(linkPairingStart, linkPairingReady, bArrTranscript) || (bArrBase64UrlDecode = base64UrlDecode(linkPairingReady.devicePub)) == null || (eCPublicKeyP256PublicKeyFromUncompressed = p256PublicKeyFromUncompressed(bArrBase64UrlDecode)) == null || (bArrBase64UrlDecode2 = base64UrlDecode(linkPairingReady.deviceNonce)) == null || bArrBase64UrlDecode2.length != 16) {
            return null;
        }
        byte[] bArrEcdhSecret = ecdhSecret(linkPairingStart.mobilePrivateKey, eCPublicKeyP256PublicKeyFromUncompressed);
        byte[] bArrSha2562 = sha256(AbstractC0903AHf.A07(AbstractC0903AHf.A07(linkPairingStart.mobileNonce, bArrBase64UrlDecode2), bArrSha256));
        Charset charset = StandardCharsets.UTF_8;
        C7384Etj.A0V(charset);
        byte[] bArrHkdfSha256 = hkdfSha256(bArrEcdhSecret, bArrSha2562, LinkPairingProtocolStrings.BLE_SETUP_CONTEXT.getBytes(charset), 32);
        byte[] bArrA06 = AbstractC0903AHf.A06(sha256(AbstractC0903AHf.A07(AbstractC0903AHf.A07(LinkPairingProtocolStrings.SESSION_ID_CONTEXT.getBytes(charset), bArrSha256), bArrEcdhSecret)), 0, 16);
        if (C7384Etj.areEqual(base64UrlEncode(bArrA06), linkPairingReady.sessionId)) {
            return new LinkEncryptedPairingSession(bArrA06, hkdfExpand(bArrHkdfSha256, LinkPairingProtocolStrings.HKDF_INFO_MOBILE_TO_DEVICE.getBytes(charset), 32), hkdfExpand(bArrHkdfSha256, LinkPairingProtocolStrings.HKDF_INFO_DEVICE_TO_MOBILE.getBytes(charset), 32), pairingMode, linkPairingReady.confirmTimeoutSeconds, linkPairingReady.pairingPolicy, linkDeviceInfo.isCommunity());
        }
        return null;
    }

    public final SealedAesGcm encryptAesGcm(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C7384Etj.A0Y(bArr, 0);
        AnonymousClass005.A11(bArr2, bArr3, bArr4, 1);
        Cipher cipherA0e = C8j5.A0e(bArr, bArr2, 1);
        cipherA0e.updateAAD(bArr3);
        byte[] bArrDoFinal = cipherA0e.doFinal(bArr4);
        C7384Etj.A0X(bArrDoFinal);
        int length = bArrDoFinal.length;
        int i = length - 16;
        return new SealedAesGcm(AbstractC0903AHf.A06(bArrDoFinal, 0, i), AbstractC0903AHf.A06(bArrDoFinal, i, length));
    }

    public final byte[] hkdfExpand(byte[] bArr, byte[] bArr2, int i) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        int iA1a = AnonymousClass002.A1a(bArr, bArr2);
        byte[] bArr3 = new byte[i];
        byte[] bArrHmacSha256 = new byte[0];
        int i2 = 0;
        int i3 = 1;
        while (i2 < i) {
            byte[] bArrA07 = AbstractC0903AHf.A07(bArrHmacSha256, bArr2);
            byte[] bArr4 = new byte[iA1a];
            bArr4[0] = (byte) i3;
            bArrHmacSha256 = hmacSha256(bArr, AbstractC0903AHf.A07(bArrA07, bArr4));
            int iA0F = C8j3.A0F(i, i2, bArrHmacSha256.length);
            System.arraycopy(bArrHmacSha256, 0, bArr3, i2, iA0F);
            i2 += iA0F;
            i3++;
        }
        return bArr3;
    }

    public final ECPublicKey p256PublicKeyFromSpkiDer(byte[] bArr) {
        PublicKey publicKeyGeneratePublic;
        C7384Etj.A0Y(bArr, 0);
        try {
            publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Exception unused) {
        }
        ECPublicKey eCPublicKey = publicKeyGeneratePublic instanceof ECPublicKey ? (ECPublicKey) publicKeyGeneratePublic : null;
        if (eCPublicKey == null) {
            return null;
        }
        ECParameterSpec eCParameterSpecP256Params = p256Params();
        ECParameterSpec params = eCPublicKey.getParams();
        C7384Etj.A0U(params);
        if (hasSameParameters(params, eCParameterSpecP256Params)) {
            ECPoint w = eCPublicKey.getW();
            C7384Etj.A0U(w);
            if (isP256PointOnCurve(w, eCParameterSpecP256Params)) {
                return eCPublicKey;
            }
        }
        return null;
    }

    public final ECPublicKey p256PublicKeyFromUncompressed(byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidParameterSpecException {
        C7384Etj.A0Y(bArr, 0);
        if (bArr.length == 65 && bArr[0] == 4) {
            ECPoint eCPoint = new ECPoint(new BigInteger(1, AbstractC0903AHf.A06(bArr, 1, 33)), new BigInteger(1, AbstractC0903AHf.A06(bArr, 33, 65)));
            ECParameterSpec eCParameterSpecP256Params = p256Params();
            if (!isP256PointOnCurve(eCPoint, eCParameterSpecP256Params)) {
                return null;
            }
            try {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecP256Params));
                C7384Etj.A0Z(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
                return (ECPublicKey) publicKeyGeneratePublic;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final byte[] p256PublicKeyUncompressed(ECPublicKey eCPublicKey) {
        C7384Etj.A0Y(eCPublicKey, 0);
        BigInteger affineX = eCPublicKey.getW().getAffineX();
        C7384Etj.A0U(affineX);
        byte[] bArrA07 = AbstractC0903AHf.A07(new byte[]{4}, unsignedFixed32(affineX));
        BigInteger affineY = eCPublicKey.getW().getAffineY();
        C7384Etj.A0U(affineY);
        return AbstractC0903AHf.A07(bArrA07, unsignedFixed32(affineY));
    }

    public final Long parseCounter(String str) {
        Long lA0s;
        C7384Etj.A0Y(str, 0);
        if ((str.equals(HatchPriceImpressionEventDataKt.NO_DISCOUNT) || LinkEncryptedPairingKt.LINK_COUNTER_REGEX.A08(str)) && (lA0s = C9tI.A0s(str)) != null) {
            long jLongValue = lA0s.longValue();
            if (0 <= jLongValue && jLongValue < LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                return lA0s;
            }
        }
        return null;
    }

    public final byte[] sha256(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(bArr);
        C7384Etj.A0U(bArrDigest);
        return bArrDigest;
    }

    public static /* synthetic */ LinkPairingStart beginPairing$default(LinkSetupCrypto linkSetupCrypto, LinkDeviceInfo linkDeviceInfo, LinkFleetPublicKeyProvider linkFleetPublicKeyProvider, KeyPair keyPair, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            linkFleetPublicKeyProvider = LinkFleetPublicKeys.INSTANCE;
        }
        if ((i & 4) != 0) {
            keyPair = linkSetupCrypto.generateP256KeyPair();
        }
        if ((i & 8) != 0) {
            bArr = new byte[16];
            secureRandom.nextBytes(bArr);
        }
        return linkSetupCrypto.beginPairing(linkDeviceInfo, linkFleetPublicKeyProvider, keyPair, bArr);
    }

    private final ECParameterSpec p256Params() throws NoSuchAlgorithmException, InvalidParameterSpecException {
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
        AlgorithmParameterSpec parameterSpec = algorithmParameters.getParameterSpec(ECParameterSpec.class);
        C7384Etj.A0U(parameterSpec);
        return (ECParameterSpec) parameterSpec;
    }

    private final boolean verifyDeviceProof(LinkPairingStart linkPairingStart, LinkPairingReady linkPairingReady, byte[] bArr) {
        String str;
        byte[] bArrBase64UrlDecode;
        if (linkPairingStart.pairingMode == LinkPairingMode.V5 && "none".equals(linkPairingStart.clientHello.pairing_auth)) {
            return "none".equals(linkPairingReady.pairingAuth) && linkPairingReady.deviceProof == null;
        }
        ECPublicKey eCPublicKey = linkPairingStart.fleetPublicKey;
        if (eCPublicKey == null || (str = linkPairingReady.deviceProof) == null || (bArrBase64UrlDecode = base64UrlDecode(str)) == null) {
            return false;
        }
        return verifyP256EcdsaSignature(eCPublicKey, bArr, bArrBase64UrlDecode);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v1 java.security.interfaces.ECPublicKey, still in use, count: 2, list:
          (r14v1 java.security.interfaces.ECPublicKey) from 0x006e: IF  (r14v1 java.security.interfaces.ECPublicKey) == (null java.security.interfaces.ECPublicKey)  -> B:21:0x0070 A[HIDDEN] (LINE:110)
          (r14v1 java.security.interfaces.ECPublicKey) from 0x001b: PHI (r14v2 java.security.interfaces.ECPublicKey) = (r14v1 java.security.interfaces.ECPublicKey) binds: [B:20:0x006e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final com.facebook.aura.devices.pairing.LinkPairingStart beginPairing(com.facebook.aura.devices.pairing.LinkDeviceInfo r14, com.facebook.aura.devices.pairing.LinkFleetPublicKeyProvider r15, java.security.KeyPair r16, byte[] r17) {
        /*
            r13 = this;
            r12 = r16
            r2 = r17
            r3 = r14
            X.AnonymousClass005.A14(r14, r15, r12, r2)
            com.facebook.aura.devices.pairing.LinkPairingMode r11 = r14.getPairingMode()
            r10 = 0
            if (r11 == 0) goto L70
            int r1 = r2.length
            r0 = 16
            if (r1 != r0) goto L70
            boolean r0 = r14.isCommunity()
            if (r0 == 0) goto L68
            r14 = r10
        L1b:
            java.security.PublicKey r4 = r12.getPublic()
            java.lang.String r0 = "null cannot be cast to non-null type java.security.interfaces.ECPublicKey"
            X.C7384Etj.A0Z(r4, r0)
            java.security.interfaces.ECPublicKey r4 = (java.security.interfaces.ECPublicKey) r4
            byte[] r4 = r13.p256PublicKeyUncompressed(r4)
            int r0 = com.facebook.aura.devices.pairing.LinkPairingClientHello.$stable
            int r5 = r11.getHelloVersion()
            java.lang.String r6 = r13.base64UrlEncode(r4)
            java.lang.String r7 = r13.base64UrlEncode(r2)
            int r0 = r11.getHelloVersion()
            r4 = 5
            if (r0 != r4) goto L61
            r8 = r10
        L40:
            int r0 = r11.getHelloVersion()
            if (r0 != r4) goto L5f
            java.lang.String r9 = r3.pairingAuth
            java.lang.String r10 = r3.pairingPolicy
        L4a:
            java.lang.String r4 = "pairing_client_hello"
            com.facebook.aura.devices.pairing.LinkPairingClientHello r3 = new com.facebook.aura.devices.pairing.LinkPairingClientHello
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            byte[] r13 = java.util.Arrays.copyOf(r2, r1)
            X.C7384Etj.A0U(r13)
            com.facebook.aura.devices.pairing.LinkPairingStart r9 = new com.facebook.aura.devices.pairing.LinkPairingStart
            r10 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L5f:
            r9 = r10
            goto L4a
        L61:
            java.lang.String r0 = "p256-hkdf-sha256-aes-gcm-v1"
            java.util.List r8 = java.util.Collections.singletonList(r0)
            goto L40
        L68:
            int r0 = r14.pairingAuthEpoch
            java.security.interfaces.ECPublicKey r14 = r15.publicKeyForEpoch(r0)
            if (r14 != 0) goto L1b
        L70:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkSetupCrypto.beginPairing(com.facebook.aura.devices.pairing.LinkDeviceInfo, com.facebook.aura.devices.pairing.LinkFleetPublicKeyProvider, java.security.KeyPair, byte[]):com.facebook.aura.devices.pairing.LinkPairingStart");
    }

    public final KeyPair generateP256KeyPair() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        C7384Etj.A0U(keyPairGenerateKeyPair);
        return keyPairGenerateKeyPair;
    }

    public final byte[] randomBytes(int i) {
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public final byte[] recordNonce(byte b, long j) {
        byte[] bArr = new byte[12];
        bArr[0] = b;
        ByteBuffer.wrap(bArr, 4, 8).order(ByteOrder.BIG_ENDIAN).putLong(j);
        return bArr;
    }

    public final byte[] transcript(LinkPairingReady linkPairingReady, String str, String str2, LinkPairingMode linkPairingMode) {
        AnonymousClass005.A14(linkPairingReady, str, str2, linkPairingMode);
        int helloVersion = linkPairingMode.getHelloVersion();
        String str3 = helloVersion == 5 ? LinkPairingProtocolStrings.TRANSCRIPT_V5_HEADER : LinkPairingProtocolStrings.TRANSCRIPT_V2_HEADER;
        String strA0H = FGI.A0H("version=", helloVersion);
        String str4 = helloVersion == 5 ? null : "transcript_version=2";
        String str5 = linkPairingReady.deviceId;
        Locale locale = Locale.ROOT;
        String strA0e = C3cH.A0e(PairsDiscretionDocument.TERMINATOR, BFI.A0F(new String[]{str3, strA0H, str4, "initiator_role=mobile", "responder_role=link", FGI.A0M("device_id=", str5.toLowerCase(locale)), FGI.A0M("node_id=", linkPairingReady.nodeId.toLowerCase(locale)), FGI.A0M("mac=", linkPairingReady.mac.toLowerCase(locale)), FGI.A0M("model=", linkPairingReady.model.toLowerCase(locale)), FGI.A0M("firmware_version=", linkPairingReady.firmwareVersion), "selected_cipher_suite=p256-hkdf-sha256-aes-gcm-v1", FGI.A0M("pairing_auth=", linkPairingReady.pairingAuth), FGI.A0H("pairing_auth_epoch=", linkPairingReady.pairingAuthEpoch), FGI.A0M("pairing_policy=", helloVersion == 5 ? linkPairingReady.pairingPolicy : LinkEncryptedPairingKt.LINK_PAIRING_POLICY_CONFIRM_PRESS), AnonymousClass007.A0a("confirm_timeout_seconds=", helloVersion == 5 ? linkPairingReady.confirmTimeoutSeconds : 60), FGI.A0M("mobile_pub=", str), FGI.A0M("device_pub=", linkPairingReady.devicePub), FGI.A0M("mobile_nonce=", str2), FGI.A0M("device_nonce=", linkPairingReady.deviceNonce)}));
        Charset charset = StandardCharsets.UTF_8;
        C7384Etj.A0V(charset);
        return strA0e.getBytes(charset);
    }

    private final boolean hasSameParameters(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return C7384Etj.areEqual(eCParameterSpec.getCurve(), eCParameterSpec2.getCurve()) && C7384Etj.areEqual(eCParameterSpec.getGenerator(), eCParameterSpec2.getGenerator()) && C7384Etj.areEqual(eCParameterSpec.getOrder(), eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    private final boolean isP256PointOnCurve(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        BigInteger p;
        ECField field = eCParameterSpec.getCurve().getField();
        ECFieldFp eCFieldFp = field instanceof ECFieldFp ? (ECFieldFp) field : null;
        if (eCFieldFp != null && (p = eCFieldFp.getP()) != null) {
            BigInteger affineX = eCPoint.getAffineX();
            BigInteger affineY = eCPoint.getAffineY();
            if (affineX.signum() >= 0 && affineX.compareTo(p) < 0 && affineY.signum() >= 0 && affineY.compareTo(p) < 0) {
                return C7384Etj.areEqual(affineY.modPow(BigInteger.valueOf(2L), p), affineX.modPow(BigInteger.valueOf(3L), p).add(eCParameterSpec.getCurve().getA().multiply(affineX)).add(eCParameterSpec.getCurve().getB()).mod(p));
            }
        }
        return false;
    }

    private final byte[] unsignedFixed32(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        C7384Etj.A0U(byteArray);
        ArrayList arrayListA0h = C3cG.A0h();
        boolean z = false;
        for (byte b : byteArray) {
            if (z) {
                arrayListA0h.add(Byte.valueOf(b));
            } else if (b != 0) {
                arrayListA0h.add(Byte.valueOf(b));
                z = true;
            }
        }
        byte[] bArrA0l = AbstractC0878AGe.A0l(arrayListA0h);
        int length = bArrA0l.length;
        if (length <= 32) {
            return AbstractC0903AHf.A07(new byte[32 - length], bArrA0l);
        }
        throw C60O.A0i("P-256 coordinate too large");
    }

    private final boolean verifyP256EcdsaSignature(ECPublicKey eCPublicKey, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte[] bArrRawP256SignatureToDer = rawP256SignatureToDer(bArr2);
        boolean zVerify = false;
        if (bArrRawP256SignatureToDer == null) {
            return false;
        }
        try {
            Signature signature = Signature.getInstance(C60N.A00(53));
            signature.initVerify(eCPublicKey);
            signature.update(bArr);
            zVerify = signature.verify(bArrRawP256SignatureToDer);
            return zVerify;
        } catch (Exception unused) {
            return zVerify;
        }
    }

    public final byte[] decryptAesGcm(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws BadPaddingException, IllegalBlockSizeException {
        AnonymousClass003.A0u(bArr, bArr2);
        AnonymousClass005.A12(bArr3, bArr4, bArr5, 2);
        byte[] bArrDoFinal = null;
        if (bArr5.length != 16) {
            return null;
        }
        try {
            Cipher cipherA0e = C8j5.A0e(bArr, bArr2, 2);
            cipherA0e.updateAAD(bArr3);
            bArrDoFinal = cipherA0e.doFinal(AbstractC0903AHf.A07(bArr4, bArr5));
            return bArrDoFinal;
        } catch (Exception unused) {
            return bArrDoFinal;
        }
    }

    public final byte[] ecdhSecret(KeyPair keyPair, ECPublicKey eCPublicKey) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        boolean zA1Y = C60P.A1Y(keyPair, eCPublicKey);
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(keyPair.getPrivate());
        keyAgreement.doPhase(eCPublicKey, zA1Y);
        return unsignedFixed32(new BigInteger(zA1Y ? 1 : 0, keyAgreement.generateSecret()));
    }

    public final byte[] hkdfSha256(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        AnonymousClass005.A0x(bArr, bArr2, bArr3);
        return hkdfExpand(hmacSha256(bArr2, bArr), bArr3, i);
    }

    public final byte[] hmacSha256(byte[] bArr, byte[] bArr2) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        AnonymousClass003.A0u(bArr, bArr2);
        Mac mac = Mac.getInstance(ConfidentialVmPinVerifierCrypto.HMAC_SHA256);
        C8j4.A1P(ConfidentialVmPinVerifierCrypto.HMAC_SHA256, mac, bArr);
        byte[] bArrDoFinal = mac.doFinal(bArr2);
        C7384Etj.A0U(bArrDoFinal);
        return bArrDoFinal;
    }
}
