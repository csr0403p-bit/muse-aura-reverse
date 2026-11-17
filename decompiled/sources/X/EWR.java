package X;

import android.content.res.AssetManager;
import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public abstract class EWR implements X509TrustManager {
    public EW0 A00;
    public final long A01;
    public final Set<ByteBuffer> A02 = C60O.A13();
    public final X509TrustManager A03;

    public static X509TrustManager A00() throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new CertificateException("Unable to create system TrustManger");
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            throw new IllegalStateException("Failure initializing TrustManager", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.security.cert.X509Certificate[] r10) {
        /*
            r9 = this;
            X.EW0 r1 = r9.A00
            if (r1 == 0) goto Lae
            java.util.LinkedList r4 = X.BV4.A0y()
            r0 = 0
            r2 = r10[r0]
            java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> r6 = r1.A01
            javax.security.auth.x500.X500Principal r0 = r2.getSubjectX500Principal()
            java.lang.Object r0 = r6.get(r0)
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            if (r0 == 0) goto L28
            java.security.PublicKey r1 = r0.getPublicKey()
            java.security.PublicKey r0 = r2.getPublicKey()
            boolean r0 = r1.equals(r0)
            r5 = 1
            if (r0 != 0) goto L29
        L28:
            r5 = 0
        L29:
            r4.add(r2)
            r8 = 1
            r7 = 1
        L2e:
            int r0 = r10.length
            if (r7 >= r0) goto L6a
            r3 = r10[r7]
            int r0 = r7 + (-1)
            r2 = r10[r0]
            javax.security.auth.x500.X500Principal r0 = r3.getSubjectX500Principal()
            java.lang.Object r0 = r6.get(r0)
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            if (r0 == 0) goto L4f
            java.security.PublicKey r1 = r0.getPublicKey()
            java.security.PublicKey r0 = r3.getPublicKey()
            boolean r5 = X.BV7.A1X(r1, r0, r5)
        L4f:
            javax.security.auth.x500.X500Principal r1 = r3.getSubjectX500Principal()
            javax.security.auth.x500.X500Principal r0 = r2.getIssuerX500Principal()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6a
            java.security.PublicKey r0 = r3.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L6a
            r2.verify(r0)     // Catch: java.security.GeneralSecurityException -> L6a
            r4.add(r3)
            int r7 = r7 + 1
            goto L2e
        L6a:
            int r7 = r7 - r8
            r3 = r10[r7]
            javax.security.auth.x500.X500Principal r0 = r3.getIssuerX500Principal()
            java.lang.Object r2 = r6.get(r0)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            if (r2 == 0) goto L8f
            javax.security.auth.x500.X500Principal r1 = r2.getSubjectX500Principal()
            javax.security.auth.x500.X500Principal r0 = r3.getSubjectX500Principal()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8f
            java.security.PublicKey r0 = r2.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L8f
            r3.verify(r0)     // Catch: java.security.GeneralSecurityException -> L8f
            goto L99
        L8f:
            if (r5 != 0) goto L9c
            java.lang.String r1 = "Didn't find a trust anchor in chain cleanup!"
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L99:
            r4.add(r2)
        L9c:
            int r0 = r4.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r9.A01(r0)
            return
        Lae:
            java.lang.String r1 = "SystemKeystore is not initialized."
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EWR.A02(java.security.cert.X509Certificate[]):void");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.A03.checkServerTrusted(x509CertificateArr, str);
        A02(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.A03.getAcceptedIssuers();
    }

    public EWR(EW0 ew0) throws IllegalAccessException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IllegalArgumentException, InvocationTargetException {
        X509TrustManager x509TrustManagerA00;
        this.A00 = ew0;
        try {
            try {
                x509TrustManagerA00 = A00();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new IllegalStateException("Failure reinitializing TrustManager", e);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (RuntimeException unused) {
            AssetManager.class.getMethod("getSystem", null).invoke(null, null);
            x509TrustManagerA00 = A00();
        }
        this.A03 = x509TrustManagerA00;
        this.A01 = 1825992053000L;
        String[] strArr = AbstractC6700EWb.A00;
        int i = 0;
        do {
            this.A02.add(ByteBuffer.wrap(Base64.decode(strArr[i], 0)));
            i++;
        } while (i < 18);
    }

    public final void A01(List<X509Certificate> list) throws CertificateException {
        if (System.currentTimeMillis() <= this.A01) {
            if (list.isEmpty()) {
                throw new CertificateException("pinning error: certificate chain empty");
            }
            Iterator<X509Certificate> it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (this.A02.contains(ByteBuffer.wrap(MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(it.next().getPublicKey().getEncoded())))) {
                        return;
                    }
                } catch (NoSuchAlgorithmException e) {
                    throw new CertificateException(e);
                }
            }
            StringBuilder sbA0x = C60O.A0x("pinning error, trusted chain: ");
            Iterator<X509Certificate> it2 = list.iterator();
            while (it2.hasNext()) {
                sbA0x.append(Base64.encodeToString(it2.next().getEncoded(), 0));
                sbA0x.append(PairsDiscretionDocument.TERMINATOR);
            }
            throw new CertificateException(sbA0x.toString());
        }
    }
}
