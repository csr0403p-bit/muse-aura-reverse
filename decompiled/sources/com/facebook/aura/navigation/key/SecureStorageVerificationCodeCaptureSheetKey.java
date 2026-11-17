package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SecureStorageVerificationCodeCaptureSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String captureAuthorization;
    public final String codeFieldLabel;
    public final String pageUrl;
    public final String sessionId;

    public final class Companion {
        public final C9hr<SecureStorageVerificationCodeCaptureSheetKey> serializer() {
            return SecureStorageVerificationCodeCaptureSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SecureStorageVerificationCodeCaptureSheetKey secureStorageVerificationCodeCaptureSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(secureStorageVerificationCodeCaptureSheetKey.pageUrl, c9iZ, 0);
        c9j5.AAV(secureStorageVerificationCodeCaptureSheetKey.codeFieldLabel, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || secureStorageVerificationCodeCaptureSheetKey.sessionId != null) {
            c9j5.AAP(secureStorageVerificationCodeCaptureSheetKey.sessionId, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || secureStorageVerificationCodeCaptureSheetKey.captureAuthorization != null) {
            c9j5.AAP(secureStorageVerificationCodeCaptureSheetKey.captureAuthorization, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageVerificationCodeCaptureSheetKey) {
                SecureStorageVerificationCodeCaptureSheetKey secureStorageVerificationCodeCaptureSheetKey = (SecureStorageVerificationCodeCaptureSheetKey) obj;
                if (!C7384Etj.areEqual(this.pageUrl, secureStorageVerificationCodeCaptureSheetKey.pageUrl) || !C7384Etj.areEqual(this.codeFieldLabel, secureStorageVerificationCodeCaptureSheetKey.codeFieldLabel) || !C7384Etj.areEqual(this.sessionId, secureStorageVerificationCodeCaptureSheetKey.sessionId) || !C7384Etj.areEqual(this.captureAuthorization, secureStorageVerificationCodeCaptureSheetKey.captureAuthorization)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SecureStorageVerificationCodeCaptureSheetKey copy$default(SecureStorageVerificationCodeCaptureSheetKey secureStorageVerificationCodeCaptureSheetKey, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secureStorageVerificationCodeCaptureSheetKey.pageUrl;
        }
        if ((i & 2) != 0) {
            str2 = secureStorageVerificationCodeCaptureSheetKey.codeFieldLabel;
        }
        if ((i & 4) != 0) {
            str3 = secureStorageVerificationCodeCaptureSheetKey.sessionId;
        }
        if ((i & 8) != 0) {
            str4 = secureStorageVerificationCodeCaptureSheetKey.captureAuthorization;
        }
        AnonymousClass003.A0u(str, str2);
        return new SecureStorageVerificationCodeCaptureSheetKey(str, str2, str3, str4);
    }

    public final String component1() {
        return this.pageUrl;
    }

    public final String component2() {
        return this.codeFieldLabel;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component4() {
        return this.captureAuthorization;
    }

    public final String getCaptureAuthorization() {
        return this.captureAuthorization;
    }

    public final String getCodeFieldLabel() {
        return this.codeFieldLabel;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.codeFieldLabel, AnonymousClass001.A0G(this.pageUrl)) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass005.A0H(this.captureAuthorization);
    }

    public SecureStorageVerificationCodeCaptureSheetKey(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.pageUrl = str;
        this.codeFieldLabel = str2;
        this.sessionId = str3;
        this.captureAuthorization = str4;
    }

    public final SecureStorageVerificationCodeCaptureSheetKey copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new SecureStorageVerificationCodeCaptureSheetKey(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SecureStorageVerificationCodeCaptureSheetKey(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public /* synthetic */ SecureStorageVerificationCodeCaptureSheetKey(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SecureStorageVerificationCodeCaptureSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.pageUrl = str;
        this.codeFieldLabel = str2;
        if ((i & 4) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str3;
        }
        if ((i & 8) == 0) {
            this.captureAuthorization = null;
        } else {
            this.captureAuthorization = str4;
        }
    }
}
