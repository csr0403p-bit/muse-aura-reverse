package com.facebook.aura.handoff.impl;

import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C07087ng;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.EnumC07097nh;
import android.net.Uri;
import android.util.Base64;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HandoffLinkVerifier {
    public static final String EXPIRES_PARAM = "__fbs_expires";
    public static final String HATCH_APP_ID = "hatch";
    public static final String HEX_DIGITS = "0123456789ABCDEF";
    public static final String UNRESERVED_SYMBOLS = "-_.~";
    public static final HandoffLinkVerifier INSTANCE = new HandoffLinkVerifier();
    public static final String SIGNATURE_PARAM = "__fbs_v2_s";
    public static final String KEY_ID_PARAM = "__fbs_v2_k";
    public static final String ALGORITHM_PARAM = "__fbs_v2_sa";
    public static final Set<String> UNSIGNED_PARAMS = C60O.A1A(SIGNATURE_PARAM, KEY_ID_PARAM, ALGORITHM_PARAM);

    public final boolean isValid(Uri uri, long j) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        List<String> listRawQueryParameterNames;
        String strPemFor;
        Long lA0s;
        String queryParameter;
        boolean zVerify = false;
        C7384Etj.A0Y(uri, 0);
        if (uri.getFragment() == null && (listRawQueryParameterNames = rawQueryParameterNames(uri)) != null && listRawQueryParameterNames.size() == AbstractC0878AGe.A0g(listRawQueryParameterNames).size()) {
            String queryParameter2 = uri.getQueryParameter(KEY_ID_PARAM);
            if (queryParameter2 != null) {
                try {
                    C07087ng c07087ngA00 = C07087ng.A00(queryParameter2);
                    if ("hatch".equals(c07087ngA00.A02)) {
                        EnumC07097nh enumC07097nh = c07087ngA00.A01;
                        C7384Etj.A0U(enumC07097nh);
                        String queryParameter3 = uri.getQueryParameter(ALGORITHM_PARAM);
                        if (queryParameter3 != null && parseAlgorithm(queryParameter3) == enumC07097nh && (strPemFor = HandoffPublicKeys.INSTANCE.pemFor(c07087ngA00)) != null) {
                            String queryParameter4 = uri.getQueryParameter(EXPIRES_PARAM);
                            if (queryParameter4 != null && (lA0s = C9tI.A0s(queryParameter4)) != null) {
                                if (lA0s.longValue() > j && (queryParameter = uri.getQueryParameter(SIGNATURE_PARAM)) != null) {
                                    Signature signature = Signature.getInstance(enumC07097nh.mJavaSignatureString);
                                    C7384Etj.A0U(signature);
                                    signature.initVerify(KeyFactory.getInstance(enumC07097nh.mJavaKeyFactoryKeyString).generatePublic(new X509EncodedKeySpec(Base64.decode(strPemFor.replace("-----BEGIN PUBLIC KEY-----", "").replaceAll("\\n", "").replace("-----END PUBLIC KEY-----", ""), 0))));
                                    signature.update(C3cG.A1S(signedString(uri, listRawQueryParameterNames)));
                                    zVerify = signature.verify(Base64.decode(queryParameter, 8));
                                    return zVerify;
                                }
                            }
                        }
                    }
                } catch (IllegalArgumentException | GeneralSecurityException unused) {
                }
            }
            return zVerify;
        }
        return false;
    }

    private final EnumC07097nh parseAlgorithm(String str) {
        try {
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            return EnumC07097nh.valueOf(str.toUpperCase(locale));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private final C07087ng parseDescriptor(String str) {
        try {
            return C07087ng.A00(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private final List<String> rawQueryParameterNames(Uri uri) {
        List listA0d;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || (listA0d = C7BY.A0d(encodedQuery)) == null) {
            return null;
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0d);
        Iterator it = listA0d.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            arrayListA0i.add(Uri.decode(C7BY.A0S(strA0j, strA0j, '=')));
        }
        return arrayListA0i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String rfc3986Encode(String str) {
        StringBuilder sbA0w = C60O.A0w();
        for (byte b : C3cG.A1S(str)) {
            char cCharAt = (char) (b & 255);
            if ((!Character.isLetterOrDigit(cCharAt) || cCharAt >= '\u0080') && !C7BY.A0k(UNRESERVED_SYMBOLS, cCharAt)) {
                sbA0w.append('%');
                sbA0w.append(HEX_DIGITS.charAt((b >> 4) & 15));
                cCharAt = HEX_DIGITS.charAt(b & 15);
            }
            sbA0w.append(cCharAt);
        }
        return sbA0w.toString();
    }

    private final String signedString(Uri uri, List<String> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            if (!UNSIGNED_PARAMS.contains(str)) {
                arrayListA0h.add(str);
            }
        }
        String strA01 = AbstractC06907md.A01("&", AbstractC0878AGe.A0W(arrayListA0h), new HandoffLinkVerifier$signedString$sortedQuery$2(uri));
        Uri uriBuild = uri.buildUpon().clearQuery().build();
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(uriBuild);
        return C60P.A1M(HatchOpenGraphRepository.UNKNOWN_HOST, strA01, sbA0w);
    }
}
