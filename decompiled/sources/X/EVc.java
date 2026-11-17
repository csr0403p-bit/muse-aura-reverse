package X;

import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class EVc {
    public final F3H A00;
    public final String A01;
    public final EVe A02;

    public static final EWA A01(EVc eVc, Integer num, String str, String str2, String str3, String str4, List list, boolean z) throws Exception {
        PublicKey publicKey;
        String str5 = str4;
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("sec_type", "get_device_key");
        mapA0u.put("view_name", "get_device_key");
        if (str4 == null) {
            str5 = "UNKNOWN";
        }
        mapA0u.put("flow_name", str5);
        mapA0u.put("session_id", str3);
        EVe eVe = eVc.A02;
        eVe.APv("client_load_paysec_init", mapA0u);
        try {
            String str6 = eVc.A01;
            String strA0M = str;
            if (z) {
                strA0M = FGI.A0M(str6, str);
            }
            synchronized (eVc) {
                try {
                    Certificate certificate = eVc.A00.A01.getCertificate(strA0M);
                    publicKey = certificate != null ? certificate.getPublicKey() : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (publicKey == null) {
                CFK.A0F("DefaultAuthTicketManager", "No public key found for alias %s", str);
                throw new KeyStoreException(FGI.A0M("No public key found for alias ", str));
            }
            eVe.APv("client_load_paysec_success", mapA0u);
            String strA10 = BV8.A10(MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256), publicKey.getEncoded());
            C7384Etj.A0U(strA10);
            String strEncodeToString = Base64.encodeToString(publicKey.getEncoded(), 2);
            C7384Etj.A0U(strEncodeToString);
            String strA0q = BV6.A0q(publicKey.getEncoded());
            C7384Etj.A0U(strA0q);
            return EWA.A00(num, str2, strA10, strEncodeToString, strA0q, str, list);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            mapA0u.put(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, message);
            mapA0u.put("error_code", "1");
            mapA0u.put("error_stacktrace", CU7.A00(e));
            eVe.APv("client_load_paysec_fail", mapA0u);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[Catch: all -> 0x00c5, TryCatch #1 {all -> 0x00c5, blocks: (B:18:0x0096, B:20:0x00a0), top: B:39:0x0096 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EWA A00(X.EVc r13, java.lang.Integer r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20, boolean r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVc.A00(X.EVc, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):X.EWA");
    }

    public EVc(EVe eVe, F3H f3h, String str) {
        this.A01 = str;
        this.A00 = f3h;
        this.A02 = eVe;
    }
}
