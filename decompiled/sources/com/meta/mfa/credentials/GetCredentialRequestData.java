package com.meta.mfa.credentials;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.C06H;
import X.C07348in;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C8MS;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9jL;
import X.F0C;
import X.F60;
import com.facebook.aura.login.nativeflow.HatchPasskeyW3cKt;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class GetCredentialRequestData {
    public final List<AllowCredential> allowCredentials;
    public final byte[] challenge;
    public final String mediation;
    public final String rpId;
    public final String userId;
    public final String userVerification;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, new C07348in(5)), null};

    public final class Companion {
        public final C9hr<GetCredentialRequestData> serializer() {
            return C8MS.A00;
        }
    }

    public GetCredentialRequestData(String str, String str2, String str3, byte[] bArr, List<AllowCredential> list, String str4) {
        AnonymousClass005.A11(str, str3, bArr, 0);
        C7384Etj.A0Y(list, 4);
        this.rpId = str;
        this.userId = str2;
        this.userVerification = str3;
        this.challenge = bArr;
        this.allowCredentials = list;
        this.mediation = str4;
    }

    public static /* synthetic */ void getAllowCredentials$annotations() {
    }

    public static /* synthetic */ void getChallenge$annotations() {
    }

    public static /* synthetic */ void getMediation$annotations() {
    }

    public static /* synthetic */ void getRpId$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public static /* synthetic */ void getUserVerification$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(GetCredentialRequestData getCredentialRequestData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(getCredentialRequestData.rpId, c9iZ, 0);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(getCredentialRequestData.userId, c07779iq, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED.equals(getCredentialRequestData.userVerification)) {
            c9j5.AAV(getCredentialRequestData.userVerification, c9iZ, 2);
        }
        c9j5.AAQ(getCredentialRequestData.challenge, C9jL.A00, c9iZ, 3);
        if (zAfR || !C3cG.A1L(getCredentialRequestData.allowCredentials)) {
            c9j5.AAQ(getCredentialRequestData.allowCredentials, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || getCredentialRequestData.mediation != null) {
            c9j5.AAP(getCredentialRequestData.mediation, c07779iq, c9iZ, 5);
        }
    }

    public final List<AllowCredential> getAllowCredentials() {
        return this.allowCredentials;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final String getMediation() {
        return this.mediation;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public /* synthetic */ GetCredentialRequestData(String str, String str2, String str3, byte[] bArr, List list, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED : str3, bArr, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? null : str4);
    }

    public /* synthetic */ GetCredentialRequestData(int i, String str, String str2, String str3, byte[] bArr, List list, String str4, C2hx c2hx) {
        if (11 != (i & 11)) {
            C9iI.A00(C8MS.A01, i, 11);
            throw F60.createAndThrow();
        }
        this.rpId = str;
        this.userId = str2;
        if ((i & 4) == 0) {
            this.userVerification = HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED;
        } else {
            this.userVerification = str3;
        }
        this.challenge = bArr;
        if ((i & 16) == 0) {
            this.allowCredentials = C0881AGi.A00;
        } else {
            this.allowCredentials = list;
        }
        if ((i & 32) == 0) {
            this.mediation = null;
        } else {
            this.mediation = str4;
        }
    }
}
