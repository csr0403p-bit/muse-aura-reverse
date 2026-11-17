package com.meta.mfa.credentials;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.BUV;
import X.C06H;
import X.C07348in;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9Rf;
import X.C9gl;
import X.C9gp;
import X.C9gs;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9jH;
import X.C9jL;
import X.F0C;
import X.F60;
import com.facebook.aura.login.nativeflow.HatchPasskeyW3cKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CreatePublicKeyCredentialRequestData {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String attestation;
    public final List<String> attestationFormats;
    public final AuthenticatorSelection authenticatorSelection;
    public final byte[] challenge;
    public final List<ExcludeCredentialParams> excludeCredentials;
    public final Map<String, String> extensions;
    public final List<PubKeyCredParams> pubKeyCredParams;
    public final RelyingParty rp;
    public final User user;

    public final class Companion {
        public final C9hr<CreatePublicKeyCredentialRequestData> serializer() {
            return C9gp.A00;
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, new BUV(14)), null, AbstractC5321DgF.A02(num, new BUV(15)), null, null, AbstractC5321DgF.A02(num, new C07348in(3)), AbstractC5321DgF.A02(num, new BUV(16))};
    }

    public /* synthetic */ CreatePublicKeyCredentialRequestData(int i, AuthenticatorSelection authenticatorSelection, String str, List list, byte[] bArr, List list2, RelyingParty relyingParty, User user, List list3, Map map, C2hx c2hx) {
        if (120 != (i & 120)) {
            C9iI.A00(C9gp.A01, i, 120);
            throw F60.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.authenticatorSelection = new AuthenticatorSelection("platform", "required", null, HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED);
        } else {
            this.authenticatorSelection = authenticatorSelection;
        }
        if ((i & 2) == 0) {
            this.attestation = "indirect";
        } else {
            this.attestation = str;
        }
        if ((i & 4) == 0) {
            this.attestationFormats = null;
        } else {
            this.attestationFormats = list;
        }
        this.challenge = bArr;
        this.pubKeyCredParams = list2;
        this.rp = relyingParty;
        this.user = user;
        if ((i & 128) == 0) {
            this.excludeCredentials = null;
        } else {
            this.excludeCredentials = list3;
        }
        this.extensions = (i & 256) == 0 ? C9jH.A00 : map;
    }

    public static /* synthetic */ void getAttestation$annotations() {
    }

    public static /* synthetic */ void getAttestationFormats$annotations() {
    }

    public static /* synthetic */ void getAuthenticatorSelection$annotations() {
    }

    public static /* synthetic */ void getChallenge$annotations() {
    }

    public static /* synthetic */ void getExcludeCredentials$annotations() {
    }

    public static /* synthetic */ void getExtensions$annotations() {
    }

    public static /* synthetic */ void getPubKeyCredParams$annotations() {
    }

    public static /* synthetic */ void getRp$annotations() {
    }

    public static /* synthetic */ void getUser$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(CreatePublicKeyCredentialRequestData createPublicKeyCredentialRequestData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(createPublicKeyCredentialRequestData.authenticatorSelection, new AuthenticatorSelection("platform", "required", null, HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED))) {
            c9j5.AAQ(createPublicKeyCredentialRequestData.authenticatorSelection, C9Rf.A00, c9iZ, 0);
        }
        if (zAfR || !"indirect".equals(createPublicKeyCredentialRequestData.attestation)) {
            c9j5.AAP(createPublicKeyCredentialRequestData.attestation, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || createPublicKeyCredentialRequestData.attestationFormats != null) {
            c9j5.AAP(createPublicKeyCredentialRequestData.attestationFormats, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        c9j5.AAQ(createPublicKeyCredentialRequestData.challenge, C9jL.A00, c9iZ, 3);
        c9j5.AAQ(createPublicKeyCredentialRequestData.pubKeyCredParams, C3cH.A15(f0cArr, 4), c9iZ, 4);
        c9j5.AAQ(createPublicKeyCredentialRequestData.rp, C9gl.A00, c9iZ, 5);
        c9j5.AAQ(createPublicKeyCredentialRequestData.user, C9gs.A00, c9iZ, 6);
        if (zAfR || createPublicKeyCredentialRequestData.excludeCredentials != null) {
            c9j5.AAP(createPublicKeyCredentialRequestData.excludeCredentials, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || !C7384Etj.areEqual(createPublicKeyCredentialRequestData.extensions, C9jH.A00)) {
            c9j5.AAQ(createPublicKeyCredentialRequestData.extensions, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
    }

    public final String getAttestation() {
        return this.attestation;
    }

    public final List<String> getAttestationFormats() {
        return this.attestationFormats;
    }

    public final AuthenticatorSelection getAuthenticatorSelection() {
        return this.authenticatorSelection;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final List<ExcludeCredentialParams> getExcludeCredentials() {
        return this.excludeCredentials;
    }

    public final Map<String, String> getExtensions() {
        return this.extensions;
    }

    public final List<PubKeyCredParams> getPubKeyCredParams() {
        return this.pubKeyCredParams;
    }

    public final RelyingParty getRp() {
        return this.rp;
    }

    public final User getUser() {
        return this.user;
    }

    public CreatePublicKeyCredentialRequestData(AuthenticatorSelection authenticatorSelection, String str, List<String> list, byte[] bArr, List<PubKeyCredParams> list2, RelyingParty relyingParty, User user, List<ExcludeCredentialParams> list3, Map<String, String> map) {
        AnonymousClass005.A16(authenticatorSelection, bArr, list2, relyingParty, 0);
        C60O.A1N(user, 6, map);
        this.authenticatorSelection = authenticatorSelection;
        this.attestation = str;
        this.attestationFormats = list;
        this.challenge = bArr;
        this.pubKeyCredParams = list2;
        this.rp = relyingParty;
        this.user = user;
        this.excludeCredentials = list3;
        this.extensions = map;
    }

    public /* synthetic */ CreatePublicKeyCredentialRequestData(AuthenticatorSelection authenticatorSelection, String str, List list, byte[] bArr, List list2, RelyingParty relyingParty, User user, List list3, Map map, int i, C06H c06h) {
        this((i & 1) != 0 ? new AuthenticatorSelection("platform", "required", null, HatchPasskeyW3cKt.USER_VERIFICATION_PREFERRED) : authenticatorSelection, (i & 2) != 0 ? "indirect" : str, (i & 4) != 0 ? null : list, bArr, list2, relyingParty, user, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? C9jH.A00 : map);
    }
}
