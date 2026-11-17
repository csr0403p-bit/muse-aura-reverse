package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthRegisterCompletionLinkedRequestJson extends C06G {
    public final AuthRegistrationAttestationJson attestation;
    public final String contact_point;
    public final String device_id;
    public final String link_handle;
    public final String linking_disclosure_version;
    public final String region;
    public final List<String> supported_disclosure_presentations;
    public final boolean supports_registration_recovery;
    public final String tos_content_version;
    public final String waterfall_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, AuthRegisterCompletionLinkedRequestJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<AuthRegisterCompletionLinkedRequestJson> serializer() {
            return AuthRegisterCompletionLinkedRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthRegisterCompletionLinkedRequestJson(String str, boolean z, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, AuthRegistrationAttestationJson authRegistrationAttestationJson) {
        C7384Etj.A0Y(str, 0);
        this.link_handle = str;
        this.supports_registration_recovery = z;
        this.contact_point = str2;
        this.region = str3;
        this.tos_content_version = str4;
        this.device_id = str5;
        this.waterfall_id = str6;
        this.supported_disclosure_presentations = list;
        this.linking_disclosure_version = str7;
        this.attestation = authRegistrationAttestationJson;
    }

    public final AuthRegisterCompletionLinkedRequestJson copy(String str, boolean z, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, AuthRegistrationAttestationJson authRegistrationAttestationJson) {
        C7384Etj.A0Y(str, 0);
        return new AuthRegisterCompletionLinkedRequestJson(str, z, str2, str3, str4, str5, str6, list, str7, authRegistrationAttestationJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthRegisterCompletionLinkedRequestJson) {
                AuthRegisterCompletionLinkedRequestJson authRegisterCompletionLinkedRequestJson = (AuthRegisterCompletionLinkedRequestJson) obj;
                if (!C7384Etj.areEqual(this.link_handle, authRegisterCompletionLinkedRequestJson.link_handle) || this.supports_registration_recovery != authRegisterCompletionLinkedRequestJson.supports_registration_recovery || !C7384Etj.areEqual(this.contact_point, authRegisterCompletionLinkedRequestJson.contact_point) || !C7384Etj.areEqual(this.region, authRegisterCompletionLinkedRequestJson.region) || !C7384Etj.areEqual(this.tos_content_version, authRegisterCompletionLinkedRequestJson.tos_content_version) || !C7384Etj.areEqual(this.device_id, authRegisterCompletionLinkedRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authRegisterCompletionLinkedRequestJson.waterfall_id) || !C7384Etj.areEqual(this.supported_disclosure_presentations, authRegisterCompletionLinkedRequestJson.supported_disclosure_presentations) || !C7384Etj.areEqual(this.linking_disclosure_version, authRegisterCompletionLinkedRequestJson.linking_disclosure_version) || !C7384Etj.areEqual(this.attestation, authRegisterCompletionLinkedRequestJson.attestation)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthRegisterCompletionLinkedRequestJson copy$default(AuthRegisterCompletionLinkedRequestJson authRegisterCompletionLinkedRequestJson, String str, boolean z, String str2, String str3, String str4, String str5, String str6, List list, String str7, AuthRegistrationAttestationJson authRegistrationAttestationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authRegisterCompletionLinkedRequestJson.link_handle;
        }
        if ((i & 2) != 0) {
            z = authRegisterCompletionLinkedRequestJson.supports_registration_recovery;
        }
        if ((i & 4) != 0) {
            str2 = authRegisterCompletionLinkedRequestJson.contact_point;
        }
        if ((i & 8) != 0) {
            str3 = authRegisterCompletionLinkedRequestJson.region;
        }
        if ((i & 16) != 0) {
            str4 = authRegisterCompletionLinkedRequestJson.tos_content_version;
        }
        if ((i & 32) != 0) {
            str5 = authRegisterCompletionLinkedRequestJson.device_id;
        }
        if ((i & 64) != 0) {
            str6 = authRegisterCompletionLinkedRequestJson.waterfall_id;
        }
        if ((i & 128) != 0) {
            list = authRegisterCompletionLinkedRequestJson.supported_disclosure_presentations;
        }
        if ((i & 256) != 0) {
            str7 = authRegisterCompletionLinkedRequestJson.linking_disclosure_version;
        }
        if ((i & 512) != 0) {
            authRegistrationAttestationJson = authRegisterCompletionLinkedRequestJson.attestation;
        }
        return authRegisterCompletionLinkedRequestJson.copy(str, z, str2, str3, str4, str5, str6, list, str7, authRegistrationAttestationJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthRegisterCompletionLinkedRequestJson authRegisterCompletionLinkedRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(authRegisterCompletionLinkedRequestJson.link_handle, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || authRegisterCompletionLinkedRequestJson.supports_registration_recovery) {
            c9j5.AA7(c9iZ, 1, authRegisterCompletionLinkedRequestJson.supports_registration_recovery);
        }
        if (zAfR || authRegisterCompletionLinkedRequestJson.contact_point != null) {
            c9j5.AAP(authRegisterCompletionLinkedRequestJson.contact_point, C07779iq.A01, c9iZ, 2);
        }
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(authRegisterCompletionLinkedRequestJson.region, c07779iq, c9iZ, 3);
        if (zAfR || authRegisterCompletionLinkedRequestJson.tos_content_version != null) {
            c9j5.AAP(authRegisterCompletionLinkedRequestJson.tos_content_version, c07779iq, c9iZ, 4);
        }
        if (zAfR || authRegisterCompletionLinkedRequestJson.device_id != null) {
            c9j5.AAP(authRegisterCompletionLinkedRequestJson.device_id, c07779iq, c9iZ, 5);
        }
        if (zAfR || authRegisterCompletionLinkedRequestJson.waterfall_id != null) {
            c9j5.AAP(authRegisterCompletionLinkedRequestJson.waterfall_id, c07779iq, c9iZ, 6);
        }
        if (zAfR || authRegisterCompletionLinkedRequestJson.supported_disclosure_presentations != null) {
            c9j5.AAP(authRegisterCompletionLinkedRequestJson.supported_disclosure_presentations, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || authRegisterCompletionLinkedRequestJson.linking_disclosure_version != null) {
            c9j5.AAP(authRegisterCompletionLinkedRequestJson.linking_disclosure_version, c07779iq, c9iZ, 8);
        }
        if (zAfR || authRegisterCompletionLinkedRequestJson.attestation != null) {
            c9j5.AAP(authRegisterCompletionLinkedRequestJson.attestation, AuthRegistrationAttestationJson$$serializer.INSTANCE, c9iZ, 9);
        }
    }

    public final String component1() {
        return this.link_handle;
    }

    public final AuthRegistrationAttestationJson component10() {
        return this.attestation;
    }

    public final boolean component2() {
        return this.supports_registration_recovery;
    }

    public final String component3() {
        return this.contact_point;
    }

    public final String component4() {
        return this.region;
    }

    public final String component5() {
        return this.tos_content_version;
    }

    public final String component6() {
        return this.device_id;
    }

    public final String component7() {
        return this.waterfall_id;
    }

    public final List<String> component8() {
        return this.supported_disclosure_presentations;
    }

    public final String component9() {
        return this.linking_disclosure_version;
    }

    public final AuthRegistrationAttestationJson getAttestation() {
        return this.attestation;
    }

    public final String getContact_point() {
        return this.contact_point;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getLink_handle() {
        return this.link_handle;
    }

    public final String getLinking_disclosure_version() {
        return this.linking_disclosure_version;
    }

    public final String getRegion() {
        return this.region;
    }

    public final List<String> getSupported_disclosure_presentations() {
        return this.supported_disclosure_presentations;
    }

    public final boolean getSupports_registration_recovery() {
        return this.supports_registration_recovery;
    }

    public final String getTos_content_version() {
        return this.tos_content_version;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((((((((((((((C0KA.A01(AnonymousClass001.A0G(this.link_handle), this.supports_registration_recovery) + AnonymousClass006.A0G(this.contact_point)) * 31) + AnonymousClass006.A0G(this.region)) * 31) + AnonymousClass006.A0G(this.tos_content_version)) * 31) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass006.A0G(this.waterfall_id)) * 31) + AnonymousClass006.A0D(this.supported_disclosure_presentations)) * 31) + AnonymousClass006.A0G(this.linking_disclosure_version)) * 31) + C3cH.A02(this.attestation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthRegisterCompletionLinkedRequestJson(String str, boolean z, String str2, String str3, String str4, String str5, String str6, List list, String str7, AuthRegistrationAttestationJson authRegistrationAttestationJson, int i, C06H c06h) {
        this(str, C3cG.A1K(i & 2, z), (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : authRegistrationAttestationJson);
    }

    public /* synthetic */ AuthRegisterCompletionLinkedRequestJson(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, List list, String str7, AuthRegistrationAttestationJson authRegistrationAttestationJson, C2hx c2hx) {
        if (9 != (i & 9)) {
            C9iI.A00(AuthRegisterCompletionLinkedRequestJson$$serializer.descriptor, i, 9);
            throw F60.createAndThrow();
        }
        this.link_handle = str;
        this.supports_registration_recovery = (i & 2) == 0 ? false : z;
        if ((i & 4) == 0) {
            this.contact_point = null;
        } else {
            this.contact_point = str2;
        }
        this.region = str3;
        if ((i & 16) == 0) {
            this.tos_content_version = null;
        } else {
            this.tos_content_version = str4;
        }
        if ((i & 32) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str5;
        }
        if ((i & 64) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str6;
        }
        if ((i & 128) == 0) {
            this.supported_disclosure_presentations = null;
        } else {
            this.supported_disclosure_presentations = list;
        }
        if ((i & 256) == 0) {
            this.linking_disclosure_version = null;
        } else {
            this.linking_disclosure_version = str7;
        }
        if ((i & 512) == 0) {
            this.attestation = null;
        } else {
            this.attestation = authRegistrationAttestationJson;
        }
    }
}
