package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Etm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7385Etm {
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(android.net.Uri r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7385Etm.A02(android.net.Uri):boolean");
    }

    public static String A00(Uri uri, boolean z) {
        String strDecode;
        if (uri == null) {
            return HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        String scheme = uri.getScheme();
        String encodedQuery = uri.getEncodedQuery();
        if (scheme != null) {
            Locale locale = Locale.US;
            if ("moqt".equals(scheme.toLowerCase(locale)) && encodedQuery != null && uri.isHierarchical()) {
                StringBuilder sbA0w = C60O.A0w();
                for (String string : TextUtils.split(encodedQuery, "&")) {
                    if (sbA0w.length() > 0) {
                        sbA0w.append('&');
                    }
                    int iIndexOf = string.indexOf(61);
                    String strSubstring = iIndexOf >= 0 ? string.substring(0, iIndexOf) : string;
                    String strDecode2 = Uri.decode(strSubstring);
                    C1H.A00(strDecode2);
                    if ("tok".equals(strDecode2)) {
                        if (iIndexOf >= 0) {
                            strDecode = Uri.decode(BV4.A0g(iIndexOf, string));
                            C1H.A00(strDecode);
                        } else {
                            strDecode = "";
                        }
                        sbA0w.append(strSubstring);
                        sbA0w.append('=');
                        if (z) {
                            try {
                                byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(strDecode.getBytes(StandardCharsets.UTF_8));
                                StringBuilder sbA0x = C60O.A0x("sha256-");
                                for (byte b : bArrDigest) {
                                    sbA0x.append(String.format(locale, "%02x", Byte.valueOf(b)));
                                }
                                string = sbA0x.toString();
                            } catch (NoSuchAlgorithmException e) {
                                throw new IllegalStateException("SHA-256 unavailable", e);
                            }
                        } else {
                            string = "redacted";
                        }
                    }
                    sbA0w.append(string);
                }
                uri = uri.buildUpon().encodedQuery(sbA0w.toString()).build();
            }
        }
        return uri.toString();
    }

    public static List<String> A01(String str, int i) {
        ArrayList arrayListA0h = C3cG.A0h();
        if (str == null || str.length() <= i) {
            return arrayListA0h;
        }
        for (String str2 : TextUtils.split(str.substring(i), CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
            String strDecode = Uri.decode(str2);
            C1H.A00(strDecode);
            if (strDecode.isEmpty()) {
                return null;
            }
            arrayListA0h.add(strDecode);
        }
        return arrayListA0h;
    }
}
