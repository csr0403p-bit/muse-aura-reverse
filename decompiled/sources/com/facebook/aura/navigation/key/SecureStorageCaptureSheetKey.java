package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SecureStorageCaptureSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String captureAuthorization;
    public final String pageUrl;
    public final String passwordLabel;
    public final String sessionId;
    public final boolean showSaveToSecureStorageToggle;
    public final String usernameLabel;

    public final class Companion {
        public final C9hr<SecureStorageCaptureSheetKey> serializer() {
            return SecureStorageCaptureSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SecureStorageCaptureSheetKey() {
        this("", null, null, null, null, true);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SecureStorageCaptureSheetKey secureStorageCaptureSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(secureStorageCaptureSheetKey.pageUrl)) {
            c9j5.AAV(secureStorageCaptureSheetKey.pageUrl, c9iZ, 0);
        }
        if (zAfR || secureStorageCaptureSheetKey.usernameLabel != null) {
            c9j5.AAP(secureStorageCaptureSheetKey.usernameLabel, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || secureStorageCaptureSheetKey.passwordLabel != null) {
            c9j5.AAP(secureStorageCaptureSheetKey.passwordLabel, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || secureStorageCaptureSheetKey.sessionId != null) {
            c9j5.AAP(secureStorageCaptureSheetKey.sessionId, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || secureStorageCaptureSheetKey.captureAuthorization != null) {
            c9j5.AAP(secureStorageCaptureSheetKey.captureAuthorization, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !secureStorageCaptureSheetKey.showSaveToSecureStorageToggle) {
            c9j5.AA7(c9iZ, 5, secureStorageCaptureSheetKey.showSaveToSecureStorageToggle);
        }
    }

    public final SecureStorageCaptureSheetKey copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new SecureStorageCaptureSheetKey(str, str2, str3, str4, str5, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecureStorageCaptureSheetKey) {
                SecureStorageCaptureSheetKey secureStorageCaptureSheetKey = (SecureStorageCaptureSheetKey) obj;
                if (!C7384Etj.areEqual(this.pageUrl, secureStorageCaptureSheetKey.pageUrl) || !C7384Etj.areEqual(this.usernameLabel, secureStorageCaptureSheetKey.usernameLabel) || !C7384Etj.areEqual(this.passwordLabel, secureStorageCaptureSheetKey.passwordLabel) || !C7384Etj.areEqual(this.sessionId, secureStorageCaptureSheetKey.sessionId) || !C7384Etj.areEqual(this.captureAuthorization, secureStorageCaptureSheetKey.captureAuthorization) || this.showSaveToSecureStorageToggle != secureStorageCaptureSheetKey.showSaveToSecureStorageToggle) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SecureStorageCaptureSheetKey copy$default(SecureStorageCaptureSheetKey secureStorageCaptureSheetKey, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secureStorageCaptureSheetKey.pageUrl;
        }
        if ((i & 2) != 0) {
            str2 = secureStorageCaptureSheetKey.usernameLabel;
        }
        if ((i & 4) != 0) {
            str3 = secureStorageCaptureSheetKey.passwordLabel;
        }
        if ((i & 8) != 0) {
            str4 = secureStorageCaptureSheetKey.sessionId;
        }
        if ((i & 16) != 0) {
            str5 = secureStorageCaptureSheetKey.captureAuthorization;
        }
        if ((i & 32) != 0) {
            z = secureStorageCaptureSheetKey.showSaveToSecureStorageToggle;
        }
        return secureStorageCaptureSheetKey.copy(str, str2, str3, str4, str5, z);
    }

    public final String component1() {
        return this.pageUrl;
    }

    public final String component2() {
        return this.usernameLabel;
    }

    public final String component3() {
        return this.passwordLabel;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final String component5() {
        return this.captureAuthorization;
    }

    public final boolean component6() {
        return this.showSaveToSecureStorageToggle;
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

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getShowSaveToSecureStorageToggle() {
        return this.showSaveToSecureStorageToggle;
    }

    public final String getUsernameLabel() {
        return this.usernameLabel;
    }

    public int hashCode() {
        return C0KA.A00((((((((AnonymousClass001.A0G(this.pageUrl) + AnonymousClass006.A0G(this.usernameLabel)) * 31) + AnonymousClass006.A0G(this.passwordLabel)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass005.A0H(this.captureAuthorization)) * 31, this.showSaveToSecureStorageToggle);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SecureStorageCaptureSheetKey(String str, String str2, String str3, String str4, String str5, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? true : z);
    }

    public SecureStorageCaptureSheetKey(String str, String str2, String str3, String str4, String str5, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.pageUrl = str;
        this.usernameLabel = str2;
        this.passwordLabel = str3;
        this.sessionId = str4;
        this.captureAuthorization = str5;
        this.showSaveToSecureStorageToggle = z;
    }

    public /* synthetic */ SecureStorageCaptureSheetKey(int i, String str, String str2, String str3, String str4, String str5, boolean z, C2hx c2hx) {
        this.pageUrl = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.usernameLabel = null;
        } else {
            this.usernameLabel = str2;
        }
        if ((i & 4) == 0) {
            this.passwordLabel = null;
        } else {
            this.passwordLabel = str3;
        }
        if ((i & 8) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str4;
        }
        if ((i & 16) == 0) {
            this.captureAuthorization = null;
        } else {
            this.captureAuthorization = str5;
        }
        if ((i & 32) == 0) {
            this.showSaveToSecureStorageToggle = true;
        } else {
            this.showSaveToSecureStorageToggle = z;
        }
    }
}
