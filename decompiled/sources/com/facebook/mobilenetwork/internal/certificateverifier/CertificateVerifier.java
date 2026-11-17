package com.facebook.mobilenetwork.internal.certificateverifier;

import X.BV4;
import X.BV5;
import X.C3293CCc;
import X.C60O;
import X.C6558EEu;
import X.EWR;
import X.EWS;
import X.EWY;
import X.EWZ;
import X.FGI;
import com.facebook.acra.util.UrlEncodingWriter;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class CertificateVerifier {
    public static final byte[] CRL_PUBLIC_KEY_BYTES = {48, -126, 1, 34, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -126, 1, 15, 0, 48, -126, 1, 10, 2, -126, 1, 1, 0, -69, 110, 57, -95, 80, -27, 35, 65, -65, -55, 5, 75, -31, 6, 19, 113, -119, -19, -80, 120, 45, 54, 79, -46, -86, -93, 50, UrlEncodingWriter.UTF16_REPLACEMENT_BYTE, 47, 53, 105, -28, 35, -69, -120, 103, -72, -17, -9, -106, 2, 117, 126, -15, -115, 86, 3, -109, -11, -4, 76, -104, -92, -31, -7, 44, 49, 101, -79, -13, 64, -22, -59, -90, 20, 20, -90, -126, 38, 12, 53, -108, -113, 39, -80, Byte.MAX_VALUE, 125, 42, 70, -70, -108, -90, 121, 3, 78, -103, -82, 75, 6, 111, -106, 124, 68, -23, -69, 62, -114, 14, 100, -95, 84, 36, -109, -68, 43, 105, -95, 44, -126, 60, -76, 26, -50, 39, 54, 70, 27, -109, 89, 111, 126, 111, 94, -68, 126, -61, 101, -27, 105, 85, 46, -2, -59, 55, 64, 70, 5, 22, -54, 114, -110, -97, 87, 83, 5, -103, -60, -84, 77, 113, 120, 25, -88, -88, 102, -110, -69, -66, -89, 125, -40, -125, -122, 8, 84, -80, -65, 64, -98, 31, -48, 27, -8, 28, -42, -62, 122, 45, 111, -69, 47, -56, -12, -20, 19, -13, Byte.MAX_VALUE, -104, 85, 71, -14, 28, -63, 31, 86, -70, -99, -116, 74, Byte.MAX_VALUE, 72, -65, 66, -3, -19, -20, 99, -60, 111, -56, 24, 76, 87, -25, -81, 100, 8, 16, 41, -20, -19, -91, -1, 72, -96, -99, -58, -92, -64, -56, 87, 116, -20, -104, 96, 9, 88, -34, -113, 5, -75, -52, 1, 13, 3, 100, -120, -81, -36, 95, -93, -55, -100, 110, -110, -67, 2, 3, 1, 0, 1};
    public static volatile X509TrustManager sUserCaTrustManager;
    public final C6558EEu mFbHostnameVerifier;
    public final C3293CCc mFbPinningSSLContextFactory;
    public Set<BigInteger> revokedCertificateSerials;

    public class ChainVerificationException extends CertificateException {
        public static final long serialVersionUID = 1;
    }

    public CertificateVerifier(boolean z) {
        C3293CCc c3293CCc = new C3293CCc(false);
        if (z) {
            X509TrustManager[] x509TrustManagerArr = c3293CCc.A00;
            x509TrustManagerArr[0] = new EWS((EWY) x509TrustManagerArr[0]);
        }
        this.revokedCertificateSerials = C60O.A13();
        this.mFbPinningSSLContextFactory = c3293CCc;
        this.mFbHostnameVerifier = new C6558EEu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private X509Certificate[] parseCertificates(byte[][] bArr) throws CertificateException {
        int length = bArr.length;
        if (length == 0) {
            throw new CertificateException("No certificates provided.");
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
        int i = 0;
        do {
            x509CertificateArr[i] = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr[i]));
            i++;
        } while (i < length);
        return x509CertificateArr;
    }

    public void verify(byte[][] bArr, String str) throws CertificateException {
        verify(bArr, str, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r5 = (javax.net.ssl.X509TrustManager) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setTrustUserCertificates() throws java.security.NoSuchAlgorithmException, java.io.IOException, java.security.KeyStoreException, java.security.cert.CertificateException {
        /*
            javax.net.ssl.X509TrustManager r0 = com.facebook.mobilenetwork.internal.certificateverifier.CertificateVerifier.sUserCaTrustManager
            if (r0 != 0) goto L30
            r5 = 0
            java.lang.String r0 = "AndroidCAStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)     // Catch: java.lang.Exception -> L2e
            r1.load(r5)     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Exception -> L2e
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)     // Catch: java.lang.Exception -> L2e
            r0.init(r1)     // Catch: java.lang.Exception -> L2e
            javax.net.ssl.TrustManager[] r4 = r0.getTrustManagers()     // Catch: java.lang.Exception -> L2e
            int r3 = r4.length     // Catch: java.lang.Exception -> L2e
            r2 = 0
        L1f:
            if (r2 >= r3) goto L2e
            r1 = r4[r2]     // Catch: java.lang.Exception -> L2e
            boolean r0 = r1 instanceof javax.net.ssl.X509TrustManager     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L2a
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1     // Catch: java.lang.Exception -> L2e
            goto L2d
        L2a:
            int r2 = r2 + 1
            goto L1f
        L2d:
            r5 = r1
        L2e:
            com.facebook.mobilenetwork.internal.certificateverifier.CertificateVerifier.sUserCaTrustManager = r5
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mobilenetwork.internal.certificateverifier.CertificateVerifier.setTrustUserCertificates():void");
    }

    public void setCertificateRevocationList(String str) throws Exception {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObjectA19 = BV4.A19(str);
            String string = jSONObjectA19.getString("signature");
            boolean zEqualsIgnoreCase = jSONObjectA19.getJSONObject("signature_algorithm").getString("algorithm").equalsIgnoreCase("sha256_rsa");
            if (zEqualsIgnoreCase && string.length() != 512) {
                throw new Exception("Invalid CRL signature length.");
            }
            char[] charArray = string.toCharArray();
            int length = charArray.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                char c = charArray[i];
                if (c < '0' || (c > '9' && (c < 'A' || (c > 'F' && (c < 'a' || c > 'f'))))) {
                    break;
                } else {
                    i++;
                }
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                throw new Exception("Invalid CRL signature format.");
            }
            String string2 = jSONObjectA19.getString("tbs_cert_list");
            if (zEqualsIgnoreCase) {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(CRL_PUBLIC_KEY_BYTES));
                Signature signature = Signature.getInstance("SHA256withRSA");
                signature.initVerify(publicKeyGeneratePublic);
                signature.update(string2.getBytes(StandardCharsets.UTF_8));
                int length2 = string.length();
                byte[] bArr = new byte[length2 / 2];
                for (int i2 = 0; i2 < length2; i2 += 2) {
                    bArr[i2 / 2] = (byte) ((Character.digit(string.charAt(i2), 16) << 4) + Character.digit(string.charAt(i2 + 1), 16));
                }
                if (signature.verify(bArr)) {
                    JSONArray jSONArray = BV4.A19(string2).getJSONArray("revoked_certificates");
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        String string3 = jSONArray.getJSONObject(i3).getString("user_certificate");
                        if (!string3.substring(0, 2).equalsIgnoreCase("0x")) {
                            throw new Exception("Invalid CRL serial number format.");
                        }
                        if (string3.substring(2).length() > 40) {
                            throw new Exception("Invalid CRL serial number length.");
                        }
                        this.revokedCertificateSerials.add(new BigInteger(string3.substring(2), 16));
                    }
                }
            }
        } catch (Exception e) {
            throw new CertificateException(BV5.A0n("Invalid CRL: ", e));
        }
    }

    public void verifyWithProofOfPossession(byte[][] bArr, String str, boolean z, int i, byte[] bArr2, byte[] bArr3) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        Signature signature;
        X509Certificate[] certificates = parseCertificates(bArr);
        X509Certificate x509Certificate = certificates[0];
        try {
            if (i == 1027) {
                signature = Signature.getInstance("SHA256withECDSA");
            } else if (i == 1283) {
                signature = Signature.getInstance("SHA384withECDSA");
            } else if (i == 1539) {
                signature = Signature.getInstance("SHA512withECDSA");
            } else {
                if (i != 2052) {
                    throw new CertificateException(FGI.A0H("Unrecognized signature scheme = ", i));
                }
                signature = Signature.getInstance("SHA256withRSA/PSS");
            }
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr2);
            if (!signature.verify(bArr3)) {
                throw new CertificateException("Leaf signature verification failed.");
            }
            verify(certificates, str, z);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new CertificateException(BV5.A0n("Leaf signature verification failed ", e));
        }
    }

    private void verify(X509Certificate[] x509CertificateArr, String str, boolean z) throws CertificateException {
        BigInteger serialNumber = x509CertificateArr[0].getSerialNumber();
        if (serialNumber != null && this.revokedCertificateSerials.contains(serialNumber)) {
            throw new CertificateException(BV4.A0k("Certificate is revoked. Serial=", serialNumber));
        }
        try {
            X509TrustManager x509TrustManager = this.mFbPinningSSLContextFactory.A00[0];
            try {
                if (x509TrustManager instanceof EWZ) {
                    ((EWZ) x509TrustManager).A6C("ECDHE_ECDSA", str, x509CertificateArr, z);
                } else if (x509TrustManager instanceof EWR) {
                    EWR ewr = (EWR) x509TrustManager;
                    ewr.A03.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA");
                    if (z) {
                        ewr.A02(x509CertificateArr);
                    }
                } else if (x509TrustManager instanceof EWY) {
                    ((EWY) x509TrustManager).A6B("ECDHE_ECDSA", str, x509CertificateArr);
                } else {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA");
                }
            } catch (CertificateException e) {
                if (sUserCaTrustManager != null) {
                    sUserCaTrustManager.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA");
                } else {
                    throw e;
                }
            }
            if (this.mFbHostnameVerifier.A01(str, x509CertificateArr[0])) {
            } else {
                throw new ChainVerificationException("Hostname verification failed.");
            }
        } catch (CertificateException e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Chain verification failed.";
            }
            throw new ChainVerificationException(message, e2);
        }
    }

    public void verify(byte[][] bArr, String str, boolean z) throws CertificateException {
        verify(parseCertificates(bArr), str, z);
    }
}
