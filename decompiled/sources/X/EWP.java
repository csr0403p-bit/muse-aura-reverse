package X;

import android.util.Base64;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes5.dex */
public final class EWP {
    public static final EWP A00 = new EWP();
    public static final BigInteger A01 = new BigInteger("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551", 16);

    public static final X509Certificate A00(String str) throws CertificateException {
        C7384Etj.A0Y(str, 0);
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(BV4.A0E(Base64.decode(str, 0)));
            C7384Etj.A0Z(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return (X509Certificate) certificateGenerateCertificate;
        } catch (CertificateException e) {
            throw BV4.A0e(e);
        }
    }

    public static final byte[] A01(byte[] bArr) {
        int i;
        int length = bArr.length;
        if (length < 8 || bArr[0] != 48) {
            throw C60O.A0i("Invalid ECDSA signature format");
        }
        byte b = bArr[1];
        if (b > 0) {
            i = 2;
        } else {
            if (b != -127) {
                throw C60O.A0i("Invalid ECDSA signature format");
            }
            i = 3;
        }
        int i2 = bArr[i + 1];
        int i3 = i2;
        while (i3 > 0 && bArr[((i + 2) + i2) - i3] == 0) {
            i3--;
        }
        int i4 = i + 2 + i2;
        int i5 = bArr[i4 + 1];
        int i6 = i5;
        while (i6 > 0 && bArr[((i4 + 2) + i5) - i6] == 0) {
            i6--;
        }
        int iMax = Math.max(Math.max(i3, i6), 32);
        int i7 = bArr[i - 1] & 255;
        if (i7 != length - i || i7 != i2 + 4 + i5 || bArr[i] != 2 || bArr[i4] != 2) {
            throw C60O.A0i("Invalid ECDSA signature format");
        }
        int i8 = iMax * 2;
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i4 - i3, bArr2, iMax - i3, i3);
        System.arraycopy(bArr, ((i4 + 2) + i5) - i6, bArr2, i8 - i6, i6);
        return bArr2;
    }
}
