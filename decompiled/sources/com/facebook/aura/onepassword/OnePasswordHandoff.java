package com.facebook.aura.onepassword;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C7Je;
import X.C9sU;
import X.FGI;
import android.net.Uri;
import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.deeplink.BrowserCredentialsDeeplink;
import com.facebook.aura.json.HatchJsonKt;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class OnePasswordHandoff {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String captureAuthorization;
    public final String key;
    public final String pageUrl;

    public final class Companion {
        public final String accessRequestReference(String str) {
            C7384Etj.A0Y(str, 0);
            String strEncodeToString = Base64.encodeToString(C3cG.A1S(str), 11);
            C7384Etj.A0U(strEncodeToString);
            return strEncodeToString;
        }

        private final String sha256Hex(byte[] bArr) {
            byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(bArr);
            C7384Etj.A0U(bArrDigest);
            return BFI.A0C("", OnePasswordHandoff$Companion$sha256Hex$1.INSTANCE, bArrDigest);
        }

        public final OnePasswordHandoff from(String str, List<String> list) {
            Uri uriA02;
            BrowserCredentialsDeeplink.Payload payload;
            String str2;
            AnonymousClass003.A0u(str, list);
            if (!list.contains(OnePasswordHandoffKt.ONEPASSWORD_AUTH_PROVIDER) || (uriA02 = C7Je.A02(str)) == null || (payload = BrowserCredentialsDeeplink.INSTANCE.parse(uriA02)) == null || payload.verificationCodeLabel != null || (str2 = payload.captureAuthorization) == null) {
                return null;
            }
            return new OnePasswordHandoff(payload.pageUrl, str2, FGI.A0M("onepassword-capture:", sha256Hex(C3cG.A1S(str2))));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final String grantFor(String str) {
        C7384Etj.A0Y(str, 0);
        C9sU c9sU = HatchJsonKt.HatchJson;
        int i = OnePasswordGrantPayloadJson.$stable;
        return c9sU.A02(new OnePasswordGrantJson(new OnePasswordGrantPayloadJson(Collections.singletonList(new OnePasswordResolvedGrantJson(new OnePasswordGrantReferenceJson(str))), null)), OnePasswordGrantJson$$serializer.INSTANCE);
    }

    public final String getCaptureAuthorization() {
        return this.captureAuthorization;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public OnePasswordHandoff(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.pageUrl = str;
        this.captureAuthorization = str2;
        this.key = str3;
    }
}
