package com.facebook.aura.skills.connect.config;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.C06827l3;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.commands.photos.DeviceMediaStoreReaderKt;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyValidator {
    public static final int ASCII_MAX = 127;
    public static final CustomConnectorApiKeyValidator INSTANCE = new CustomConnectorApiKeyValidator();
    public static final C06827l3 fieldRegex = C06827l3.A02("^[A-Za-z0-9_.-]+$");
    public static final C06827l3 queryParamRegex = C06827l3.A02("^[A-Za-z0-9_.\\-~]+$");
    public static final C06827l3 ipv4Regex = C06827l3.A02("^\\d{1,3}(\\.\\d{1,3}){3}$");
    public static final C06827l3 hostLabelRegex = C06827l3.A02("^[a-z0-9-]+$");
    public static final Set<String> rebindingSuffixes = BFI.A0H(new String[]{"nip.io", "sslip.io", "xip.io"});

    public final boolean isIPLiteral(String str) {
        C7384Etj.A0Y(str, 0);
        if (!C7BY.A0k(str, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR)) {
            if (ipv4Regex.A08(str)) {
                List listA0g = C7BY.A0g(str, new char[]{'.'});
                if (!(listA0g instanceof Collection) || !listA0g.isEmpty()) {
                    Iterator it = listA0g.iterator();
                    while (it.hasNext()) {
                        if (Integer.parseInt(AnonymousClass005.A0j(it)) <= 255) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isValidHost(java.lang.String r8) {
        /*
            r7 = this;
            r4 = 0
            X.C7384Etj.A0Y(r8, r4)
            java.lang.String r0 = X.AnonymousClass001.A0u(r8)
            java.lang.String r5 = "."
            java.lang.String r3 = X.C7BY.A0L(r5, r0)
            int r6 = r3.length()
            if (r6 == 0) goto Le1
            boolean r0 = r7.isIPLiteral(r3)
            if (r0 != 0) goto Le1
            r1 = 0
        L1b:
            if (r1 >= r6) goto L2a
            char r0 = r3.charAt(r1)
            boolean r0 = X.C7LE.A00(r0)
            if (r0 != 0) goto Le1
            int r1 = r1 + 1
            goto L1b
        L2a:
            r2 = 0
        L2b:
            if (r2 >= r6) goto L38
            char r1 = r3.charAt(r2)
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 > r0) goto Le1
            int r2 = r2 + 1
            goto L2b
        L38:
            r2 = 2
            r0 = 58
            boolean r0 = X.C7BY.A0k(r3, r0)
            if (r0 != 0) goto Le1
            r0 = 47
            boolean r0 = X.C7BY.A0k(r3, r0)
            if (r0 != 0) goto Le1
            r0 = 64
            boolean r0 = X.C7BY.A0k(r3, r0)
            if (r0 != 0) goto Le1
            r0 = 92
            boolean r0 = X.C7BY.A0k(r3, r0)
            if (r0 != 0) goto Le1
            r6 = 1
            char[] r1 = new char[r6]
            r0 = 46
            r1[r4] = r0
            java.util.List r8 = X.C7BY.A0g(r3, r1)
            int r0 = r8.size()
            if (r0 < r2) goto Le1
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L90
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L90
        L74:
            java.lang.Object r7 = X.AbstractC0878AGe.A0H(r8)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2 = 0
        L7b:
            int r0 = r7.length()
            if (r2 >= r0) goto Le2
            char r1 = r7.charAt(r2)
            r0 = 97
            if (r0 > r1) goto Le1
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 >= r0) goto Le1
            int r2 = r2 + 1
            goto L7b
        L90:
            java.util.Iterator r7 = r8.iterator()
        L94:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L74
            java.lang.String r2 = X.AnonymousClass005.A0j(r7)
            int r0 = r2.length()
            if (r0 == 0) goto Le1
            java.lang.String r1 = "-"
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto Le1
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto Le1
            java.lang.String r0 = "xn--"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto Le1
            X.7l3 r0 = com.facebook.aura.skills.connect.config.CustomConnectorApiKeyValidator.hostLabelRegex
            boolean r0 = r0.A08(r2)
            if (r0 != 0) goto L94
            return r4
        Lc3:
            java.util.Iterator r2 = r1.iterator()
        Lc7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lee
            java.lang.String r1 = X.AnonymousClass005.A0j(r2)
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto Le1
            java.lang.String r0 = X.FGI.A0M(r5, r1)
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto Lc7
        Le1:
            return r4
        Le2:
            java.util.Set<java.lang.String> r1 = com.facebook.aura.skills.connect.config.CustomConnectorApiKeyValidator.rebindingSuffixes
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lc3
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc3
        Lee:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.config.CustomConnectorApiKeyValidator.isValidHost(java.lang.String):boolean");
    }

    public final CustomConnectorApiKeyValidationError validate(CustomConnectorApiKeyConfig customConnectorApiKeyConfig, String str) {
        C7384Etj.A0Y(customConnectorApiKeyConfig, 0);
        if (customConnectorApiKeyConfig.version != 2) {
            return CustomConnectorApiKeyValidationError.WRONG_VERSION;
        }
        CustomConnectorApiKeyConnector customConnectorApiKeyConnector = customConnectorApiKeyConfig.connector;
        if (!HatchConnectorQplLogger.AuthType.API_KEY.equals(customConnectorApiKeyConnector.mode)) {
            return CustomConnectorApiKeyValidationError.WRONG_MODE;
        }
        CustomConnectorName customConnectorName = CustomConnectorName.INSTANCE;
        if (!customConnectorName.isValid(customConnectorApiKeyConnector.name)) {
            return CustomConnectorApiKeyValidationError.INVALID_NAME;
        }
        int size = customConnectorApiKeyConnector.hosts.size();
        if (1 > size || size >= 11) {
            return CustomConnectorApiKeyValidationError.HOSTS_COUNT_OUT_OF_RANGE;
        }
        Iterator<String> it = customConnectorApiKeyConnector.hosts.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!INSTANCE.isValidHost(next)) {
                if (next != null) {
                    return CustomConnectorApiKeyValidationError.INVALID_HOST;
                }
            }
        }
        if (customConnectorApiKeyConnector.tokenProxy.size() != 1) {
            return CustomConnectorApiKeyValidationError.NOT_EXACTLY_ONE_TOKEN_PROXY;
        }
        CustomConnectorApiKeyTokenProxyRule customConnectorApiKeyTokenProxyRule = (CustomConnectorApiKeyTokenProxyRule) AbstractC0878AGe.A0F(customConnectorApiKeyConnector.tokenProxy);
        if (!fieldRegex.A08(customConnectorApiKeyTokenProxyRule.field)) {
            return CustomConnectorApiKeyValidationError.INVALID_FIELD;
        }
        if (!isValidPlacement(customConnectorApiKeyTokenProxyRule.placement)) {
            return CustomConnectorApiKeyValidationError.INVALID_PLACEMENT;
        }
        if (str == null || str.length() == 0 || C7384Etj.areEqual(customConnectorName.normalized(str), customConnectorName.normalized(customConnectorApiKeyConnector.name))) {
            return null;
        }
        return CustomConnectorApiKeyValidationError.SERVICE_NAME_MISMATCH;
    }

    public final CustomConnectorApiKeyValidationError validateKey(String str) {
        C7384Etj.A0Y(str, 0);
        if (AnonymousClass002.A0l(str).length() == 0) {
            return CustomConnectorApiKeyValidationError.EMPTY_KEY;
        }
        return null;
    }

    private final boolean isValidPlacement(CustomConnectorApiKeyPlacement customConnectorApiKeyPlacement) {
        if (C7384Etj.areEqual(customConnectorApiKeyPlacement, CustomConnectorApiKeyPlacement.BearerHeader.INSTANCE)) {
            return true;
        }
        if (customConnectorApiKeyPlacement instanceof CustomConnectorApiKeyPlacement.CustomHeader) {
            return isHttpToken(((CustomConnectorApiKeyPlacement.CustomHeader) customConnectorApiKeyPlacement).value);
        }
        if (customConnectorApiKeyPlacement instanceof CustomConnectorApiKeyPlacement.UrlPathSegment) {
            return isValidUrlPathSegment(((CustomConnectorApiKeyPlacement.UrlPathSegment) customConnectorApiKeyPlacement).value);
        }
        if (customConnectorApiKeyPlacement instanceof CustomConnectorApiKeyPlacement.QueryParam) {
            return queryParamRegex.A08(((CustomConnectorApiKeyPlacement.QueryParam) customConnectorApiKeyPlacement).value);
        }
        if (C7384Etj.areEqual(customConnectorApiKeyPlacement, CustomConnectorApiKeyPlacement.Invalid.INSTANCE)) {
            return false;
        }
        throw C3cG.A0q();
    }

    private final boolean isValidUrlPathSegment(String str) {
        return (!AnonymousClass005.A1a(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH) || str.startsWith("//") || !C7BY.A0q(str, "{}", false) || str.length() > 256 || C7BY.A0q(str, "..", false) || C7BY.A0q(str, "@", false) || C7BY.A0q(str, DeviceMediaStoreReaderKt.LIKE_ESCAPE_CHAR, false) || C7BY.A0q(str, "://", false)) ? false : true;
    }

    private final boolean isHttpToken(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && !C7BY.A0k("!#$%&'*+-.^_`|~", cCharAt)) {
                return false;
            }
        }
        return true;
    }
}
