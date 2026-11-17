package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: X.7AW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AW {
    public X509Certificate A00;
    public final byte[] A01;

    public final String toString() throws CertificateException {
        try {
            X509Certificate x509Certificate = this.A00;
            if (x509Certificate == null) {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(this.A01));
                C7384Etj.A0Z(certificateGenerateCertificate, BV3.A00(74));
                x509Certificate = (X509Certificate) certificateGenerateCertificate;
                this.A00 = x509Certificate;
            }
            StringBuilder sbA0f = C3cG.A0f(x509Certificate, "SigningCertificateNode{certificate=");
            sbA0f.append(", issuer=");
            sbA0f.append(HatchCcvLoggingKt.NO_POSTAL_FIELD);
            return AnonymousClass001.A0v("}", sbA0f);
        } catch (CertificateException unused) {
            return "SigningCertificateNode{certificate=parsing_error}";
        }
    }

    public C7AW(byte[] bArr) {
        this.A01 = bArr;
    }
}
