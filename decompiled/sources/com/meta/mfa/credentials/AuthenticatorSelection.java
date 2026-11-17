package com.meta.mfa.credentials;

import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9Rf;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.login.nativeflow.HatchPasskeyW3cKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AuthenticatorSelection {
    public static final Companion Companion = new Companion();
    public final String authenticatorAttachment;
    public final Boolean requireResidentKey;
    public final String residentKey;
    public final String userVerification;

    public final class Companion {
        public final C9hr<AuthenticatorSelection> serializer() {
            return C9Rf.A00;
        }
    }

    public AuthenticatorSelection() {
        this("platform", "required", null, HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED);
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(AuthenticatorSelection authenticatorSelection, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"platform".equals(authenticatorSelection.authenticatorAttachment)) {
            c9j5.AAP(authenticatorSelection.authenticatorAttachment, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !"required".equals(authenticatorSelection.residentKey)) {
            c9j5.AAP(authenticatorSelection.residentKey, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || authenticatorSelection.requireResidentKey != null) {
            c9j5.AAP(authenticatorSelection.requireResidentKey, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || !HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED.equals(authenticatorSelection.userVerification)) {
            c9j5.AAV(authenticatorSelection.userVerification, c9iZ, 3);
        }
    }

    public static /* synthetic */ void getAuthenticatorAttachment$annotations() {
    }

    public static /* synthetic */ void getRequireResidentKey$annotations() {
    }

    public static /* synthetic */ void getResidentKey$annotations() {
    }

    public static /* synthetic */ void getUserVerification$annotations() {
    }

    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final Boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    public final String getResidentKey() {
        return this.residentKey;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public AuthenticatorSelection(String str, String str2, Boolean bool, String str3) {
        C7384Etj.A0Y(str3, 3);
        this.authenticatorAttachment = str;
        this.residentKey = str2;
        this.requireResidentKey = bool;
        this.userVerification = str3;
    }

    public /* synthetic */ AuthenticatorSelection(String str, String str2, Boolean bool, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "platform" : str, (i & 2) != 0 ? "required" : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED : str3);
    }

    public /* synthetic */ AuthenticatorSelection(int i, String str, String str2, Boolean bool, String str3, C2hx c2hx) {
        this.authenticatorAttachment = (i & 1) == 0 ? "platform" : str;
        if ((i & 2) == 0) {
            this.residentKey = "required";
        } else {
            this.residentKey = str2;
        }
        if ((i & 4) == 0) {
            this.requireResidentKey = null;
        } else {
            this.requireResidentKey = bool;
        }
        if ((i & 8) == 0) {
            this.userVerification = HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED;
        } else {
            this.userVerification = str3;
        }
    }
}
