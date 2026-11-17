package com.facebook.aura.deeplink;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.C7LE;
import android.net.Uri;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.SecureStorageCaptureSheetKey;
import com.facebook.aura.navigation.key.SecureStorageVerificationCodeCaptureSheetKey;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class BrowserCredentialsDeeplink {
    public static final int $stable = 0;
    public static final String CAPTURE_AUTHORIZATION_FRAGMENT_NAME = "capture_authorization";
    public static final String CONNECT_HOST = "connect";
    public static final String HATCH_ROUTE_PATH = "/browser-credentials";
    public static final String HATCH_SCHEME = "hatch";
    public static final String HTTPS_SCHEME = "https";
    public static final String HTTPS_SCHEME_PREFIX = "https://";
    public static final BrowserCredentialsDeeplink INSTANCE = new BrowserCredentialsDeeplink();
    public static final int MAXIMUM_FIELD_LABEL_LENGTH = 40;
    public static final String PAGE_URL_FRAGMENT_NAME = "page_url";
    public static final String PASSWORD_LABEL_FRAGMENT_NAME = "password_label";
    public static final String ROUTE_NAME = "browser-credentials";
    public static final String ROUTE_PATH = "/connect/browser-credentials";
    public static final String USERNAME_LABEL_FRAGMENT_NAME = "username_label";
    public static final String VERIFICATION_CODE_LABEL_FRAGMENT_NAME = "verification_code_label";

    public final class Payload {
        public static final int $stable = 0;
        public final String captureAuthorization;
        public final String pageUrl;
        public final String passwordLabel;
        public final String usernameLabel;
        public final String verificationCodeLabel;

        public Payload(String str, String str2, String str3, String str4, String str5) {
            C7384Etj.A0Y(str, 0);
            this.pageUrl = str;
            this.usernameLabel = str2;
            this.passwordLabel = str3;
            this.verificationCodeLabel = str4;
            this.captureAuthorization = str5;
        }

        public final String getCaptureAuthorization() {
            return this.captureAuthorization;
        }

        public final String getPageUrl() {
            return this.pageUrl;
        }

        public final String getPasswordLabel() {
            return this.passwordLabel;
        }

        public final String getUsernameLabel() {
            return this.usernameLabel;
        }

        public final String getVerificationCodeLabel() {
            return this.verificationCodeLabel;
        }
    }

    private final String normalizedPageUrl(String str) {
        String strA0l;
        Uri uriA02;
        String scheme;
        String host;
        String host2;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0 || !AnonymousClass006.A1b("https://", strA0l) || (uriA02 = C7Je.A02(strA0l)) == null || (scheme = uriA02.getScheme()) == null || !scheme.equalsIgnoreCase("https") || (host = uriA02.getHost()) == null || C7BY.A0j(host) || uriA02.getUserInfo() != null || ((host2 = uriA02.getHost()) != null && C7BY.A0k(host2, '@'))) {
            return null;
        }
        return strA0l;
    }

    private final Map<String, String> parameters(String str) {
        String strDecode;
        if (str != null && str.length() != 0) {
            Set setA0H = BFI.A0H(new String[]{PAGE_URL_FRAGMENT_NAME, USERNAME_LABEL_FRAGMENT_NAME, PASSWORD_LABEL_FRAGMENT_NAME, VERIFICATION_CODE_LABEL_FRAGMENT_NAME, CAPTURE_AUTHORIZATION_FRAGMENT_NAME});
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            Iterator it = C7BY.A0h(str, new char[1], '&').iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                int iA08 = C7BY.A08(strA0j, '=', 0);
                if (iA08 > 0) {
                    String strDecode2 = Uri.decode(strA0j.substring(0, iA08));
                    if (setA0H.contains(strDecode2)) {
                        C7384Etj.A0X(strDecode2);
                        if (linkedHashSetA0k.add(strDecode2)) {
                            String strSubstring = strA0j.substring(iA08 + 1);
                            if (strDecode2.equals(CAPTURE_AUTHORIZATION_FRAGMENT_NAME)) {
                                strDecode = parseCaptureAuthorization(strSubstring);
                                if (strDecode != null) {
                                }
                            } else {
                                strDecode = Uri.decode(strSubstring);
                            }
                            linkedHashMapA0j.put(strDecode2, strDecode);
                        }
                    }
                }
            }
            return linkedHashMapA0j;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[PHI: r2
  0x00ab: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v8 java.lang.String) binds: [B:35:0x0081, B:42:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String sanitizedFieldLabel(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto Lbc
            java.lang.StringBuilder r3 = X.C60O.A0w()
            r4 = 0
            r2 = 0
        L9:
            int r0 = r8.length()
            if (r2 >= r0) goto L1f
            char r1 = r8.charAt(r2)
            boolean r0 = r7.isUnsafeFieldLabelCharacter(r1)
            if (r0 != 0) goto L1c
            r3.append(r1)
        L1c:
            int r2 = r2 + 1
            goto L9
        L1f:
            java.lang.String r5 = r3.toString()
            int r3 = r5.length()
            r0 = 1
            int r3 = r3 - r0
            r2 = 0
            r1 = 0
        L2b:
            if (r2 > r3) goto L47
            r0 = r3
            if (r1 != 0) goto L31
            r0 = r2
        L31:
            char r0 = r5.charAt(r0)
            boolean r0 = r7.isFieldLabelEdgeCharacter(r0)
            if (r1 != 0) goto L42
            if (r0 != 0) goto L3f
            r1 = 1
            goto L2b
        L3f:
            int r2 = r2 + 1
            goto L2b
        L42:
            if (r0 == 0) goto L47
            int r3 = r3 + (-1)
            goto L2b
        L47:
            int r0 = r3 + 1
            java.lang.CharSequence r0 = r5.subSequence(r2, r0)
            java.lang.String r3 = r0.toString()
            if (r3 == 0) goto Lbc
            int r0 = r3.length()
            int r2 = r0 + (-1)
            java.lang.String r5 = ""
            if (r2 < 0) goto Lba
        L5d:
            int r1 = r2 + (-1)
            char r0 = r3.charAt(r2)
            boolean r0 = r7.isFieldLabelTrailingCharacter(r0)
            if (r0 != 0) goto Lb6
            int r0 = r2 + 1
            java.lang.CharSequence r0 = r3.subSequence(r4, r0)
        L6f:
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto Lbc
            int r0 = r2.length()
            if (r0 <= 0) goto Lbc
            int r1 = r2.codePointCount(r4, r0)
            r0 = 40
            if (r1 <= r0) goto Lab
            if (r9 == 0) goto Lbc
            int r0 = r2.offsetByCodePoints(r4, r0)
            java.lang.String r3 = r2.substring(r4, r0)
            int r0 = r3.length()
            int r2 = r0 + (-1)
            if (r2 < 0) goto La7
        L95:
            int r1 = r2 + (-1)
            char r0 = r3.charAt(r2)
            boolean r0 = r7.isFieldLabelTrailingCharacter(r0)
            if (r0 != 0) goto Lb2
            int r0 = r2 + 1
            java.lang.CharSequence r5 = r3.subSequence(r4, r0)
        La7:
            java.lang.String r2 = r5.toString()
        Lab:
            int r0 = r2.length()
            if (r0 <= 0) goto Lbc
            return r2
        Lb2:
            if (r1 < 0) goto La7
            r2 = r1
            goto L95
        Lb6:
            if (r1 < 0) goto Lba
            r2 = r1
            goto L5d
        Lba:
            r0 = r5
            goto L6f
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.BrowserCredentialsDeeplink.sanitizedFieldLabel(java.lang.String, boolean):java.lang.String");
    }

    public final boolean hasRoute(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return parse(uri) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matches(android.net.Uri r8) {
        /*
            r7 = this;
            r3 = 0
            X.C7384Etj.A0Y(r8, r3)
            java.lang.String r0 = r8.getScheme()
            r4 = 0
            java.lang.String r7 = X.C60Q.A0i(r0)
            java.lang.String r0 = r8.getHost()
            java.lang.String r6 = X.C60Q.A0i(r0)
            java.lang.String r5 = r8.getPath()
            r2 = 1
            if (r5 == 0) goto L2c
            char[] r1 = new char[r2]
            r0 = 47
            r1[r3] = r0
            java.lang.String r0 = X.C7BY.A0Z(r5, r1)
            if (r0 == 0) goto L2c
            java.lang.String r4 = X.AnonymousClass001.A0u(r0)
        L2c:
            java.lang.String r0 = "hatch"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L45
            java.lang.String r0 = "connect"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L58
            java.lang.String r0 = "/browser-credentials"
        L3e:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L58
            return r2
        L45:
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L58
            java.lang.String r0 = "agent.meta.ai"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L58
            java.lang.String r0 = "/connect/browser-credentials"
            goto L3e
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.deeplink.BrowserCredentialsDeeplink.matches(android.net.Uri):boolean");
    }

    public final Payload parse(Uri uri) {
        Map<String, String> mapParameters;
        String strNormalizedPageUrl;
        String strSanitizedFieldLabel;
        C7384Etj.A0Y(uri, 0);
        if (matches(uri) && (mapParameters = parameters(uri.getEncodedFragment())) != null && (strNormalizedPageUrl = normalizedPageUrl(C60O.A0p(PAGE_URL_FRAGMENT_NAME, mapParameters))) != null) {
            String str = mapParameters.get(CAPTURE_AUTHORIZATION_FRAGMENT_NAME);
            if (!mapParameters.containsKey(VERIFICATION_CODE_LABEL_FRAGMENT_NAME)) {
                return new Payload(strNormalizedPageUrl, sanitizedFieldLabel(C60O.A0p(USERNAME_LABEL_FRAGMENT_NAME, mapParameters), false), sanitizedFieldLabel(C60O.A0p(PASSWORD_LABEL_FRAGMENT_NAME, mapParameters), false), null, str);
            }
            if (!mapParameters.containsKey(USERNAME_LABEL_FRAGMENT_NAME) && !mapParameters.containsKey(PASSWORD_LABEL_FRAGMENT_NAME) && (strSanitizedFieldLabel = sanitizedFieldLabel(C60O.A0p(VERIFICATION_CODE_LABEL_FRAGMENT_NAME, mapParameters), true)) != null) {
                return new Payload(strNormalizedPageUrl, null, null, strSanitizedFieldLabel, str);
            }
        }
        return null;
    }

    public final AuraDeeplinkRoute routeForUri(Uri uri) {
        AuraNavKey auraNavKey;
        AuraNavKey secureStorageCaptureSheetKey;
        C7384Etj.A0Y(uri, 0);
        Payload payload = parse(uri);
        if (payload == null) {
            return null;
        }
        String str = payload.verificationCodeLabel;
        String str2 = payload.pageUrl;
        if (str != null) {
            auraNavKey = null;
            secureStorageCaptureSheetKey = new SecureStorageVerificationCodeCaptureSheetKey(str2, str, null, payload.captureAuthorization);
        } else {
            auraNavKey = null;
            secureStorageCaptureSheetKey = new SecureStorageCaptureSheetKey(str2, payload.usernameLabel, payload.passwordLabel, null, payload.captureAuthorization, true);
        }
        return new AuraDeeplinkRoute(secureStorageCaptureSheetKey, LaunchFlag.NAVIGATE, auraNavKey);
    }

    public final String savedCredentialPageUrl(String str) {
        Payload payload;
        C7384Etj.A0Y(str, 0);
        Uri uriA02 = C7Je.A02(str);
        if (uriA02 != null && (payload = parse(uriA02)) != null) {
            String str2 = payload.pageUrl;
            if (payload.verificationCodeLabel == null) {
                return str2;
            }
        }
        return null;
    }

    private final boolean isUnsafeFieldLabelCharacter(char c) {
        return ('\u200c' > c || c >= '\u2010') && (Character.isISOControl(c) || Character.getType(c) == 16);
    }

    private final boolean isFieldLabelEdgeCharacter(char c) {
        if (C7LE.A00(c)) {
            return true;
        }
        return '\u200c' <= c && c < '\u2010';
    }

    private final boolean isFieldLabelTrailingCharacter(char c) {
        return isFieldLabelEdgeCharacter(c) || C7BY.A0k("*_:\u2020\u2021\uff1a\uff0a", c);
    }

    private final String parseCaptureAuthorization(String str) {
        if (str.length() != 0) {
            String strDecode = Uri.decode(str);
            C7384Etj.A0X(strDecode);
            if (strDecode.length() > 0 && str.equals(Uri.encode(strDecode))) {
                return strDecode;
            }
        }
        return null;
    }
}
