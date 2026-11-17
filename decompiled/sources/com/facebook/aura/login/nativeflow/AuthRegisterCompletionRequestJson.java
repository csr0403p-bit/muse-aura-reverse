package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthRegisterCompletionRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final AuthRegistrationAttestationJson attestation;
    public final String completion_handle;
    public final String contact_point;
    public final String date_of_birth;
    public final String device_id;
    public final String first_name;
    public final String last_name;
    public final String password;
    public final String region;
    public final String tos_content_version;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthRegisterCompletionRequestJson> serializer() {
            return AuthRegisterCompletionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthRegisterCompletionRequestJson authRegisterCompletionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authRegisterCompletionRequestJson.completion_handle, c9iZ, 0);
        c9j5.AAV(authRegisterCompletionRequestJson.contact_point, c9iZ, 1);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(authRegisterCompletionRequestJson.region, c07779iq, c9iZ, 2);
        c9j5.AAV(authRegisterCompletionRequestJson.date_of_birth, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || authRegisterCompletionRequestJson.first_name != null) {
            c9j5.AAP(authRegisterCompletionRequestJson.first_name, c07779iq, c9iZ, 4);
        }
        if (zAfR || authRegisterCompletionRequestJson.last_name != null) {
            c9j5.AAP(authRegisterCompletionRequestJson.last_name, c07779iq, c9iZ, 5);
        }
        if (zAfR || authRegisterCompletionRequestJson.password != null) {
            c9j5.AAP(authRegisterCompletionRequestJson.password, c07779iq, c9iZ, 6);
        }
        if (zAfR || authRegisterCompletionRequestJson.tos_content_version != null) {
            c9j5.AAP(authRegisterCompletionRequestJson.tos_content_version, c07779iq, c9iZ, 7);
        }
        if (zAfR || authRegisterCompletionRequestJson.device_id != null) {
            c9j5.AAP(authRegisterCompletionRequestJson.device_id, c07779iq, c9iZ, 8);
        }
        if (zAfR || authRegisterCompletionRequestJson.waterfall_id != null) {
            c9j5.AAP(authRegisterCompletionRequestJson.waterfall_id, c07779iq, c9iZ, 9);
        }
        if (zAfR || authRegisterCompletionRequestJson.attestation != null) {
            c9j5.AAP(authRegisterCompletionRequestJson.attestation, AuthRegistrationAttestationJson$$serializer.INSTANCE, c9iZ, 10);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthRegisterCompletionRequestJson) {
                AuthRegisterCompletionRequestJson authRegisterCompletionRequestJson = (AuthRegisterCompletionRequestJson) obj;
                if (!C7384Etj.areEqual(this.completion_handle, authRegisterCompletionRequestJson.completion_handle) || !C7384Etj.areEqual(this.contact_point, authRegisterCompletionRequestJson.contact_point) || !C7384Etj.areEqual(this.region, authRegisterCompletionRequestJson.region) || !C7384Etj.areEqual(this.date_of_birth, authRegisterCompletionRequestJson.date_of_birth) || !C7384Etj.areEqual(this.first_name, authRegisterCompletionRequestJson.first_name) || !C7384Etj.areEqual(this.last_name, authRegisterCompletionRequestJson.last_name) || !C7384Etj.areEqual(this.password, authRegisterCompletionRequestJson.password) || !C7384Etj.areEqual(this.tos_content_version, authRegisterCompletionRequestJson.tos_content_version) || !C7384Etj.areEqual(this.device_id, authRegisterCompletionRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authRegisterCompletionRequestJson.waterfall_id) || !C7384Etj.areEqual(this.attestation, authRegisterCompletionRequestJson.attestation)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.completion_handle;
    }

    public final String component10() {
        return this.waterfall_id;
    }

    public final AuthRegistrationAttestationJson component11() {
        return this.attestation;
    }

    public final String component2() {
        return this.contact_point;
    }

    public final String component3() {
        return this.region;
    }

    public final String component4() {
        return this.date_of_birth;
    }

    public final String component5() {
        return this.first_name;
    }

    public final String component6() {
        return this.last_name;
    }

    public final String component7() {
        return this.password;
    }

    public final String component8() {
        return this.tos_content_version;
    }

    public final String component9() {
        return this.device_id;
    }

    public final AuthRegistrationAttestationJson getAttestation() {
        return this.attestation;
    }

    public final String getCompletion_handle() {
        return this.completion_handle;
    }

    public final String getContact_point() {
        return this.contact_point;
    }

    public final String getDate_of_birth() {
        return this.date_of_birth;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getFirst_name() {
        return this.first_name;
    }

    public final String getLast_name() {
        return this.last_name;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getTos_content_version() {
        return this.tos_content_version;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass005.A0I(this.date_of_birth, (AnonymousClass005.A0I(this.contact_point, AnonymousClass001.A0G(this.completion_handle)) + AnonymousClass006.A0G(this.region)) * 31) + AnonymousClass006.A0G(this.first_name)) * 31) + AnonymousClass006.A0G(this.last_name)) * 31) + AnonymousClass006.A0G(this.password)) * 31) + AnonymousClass006.A0G(this.tos_content_version)) * 31) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass006.A0G(this.waterfall_id)) * 31) + C3cH.A02(this.attestation);
    }

    public AuthRegisterCompletionRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AuthRegistrationAttestationJson authRegistrationAttestationJson) {
        AnonymousClass005.A0y(str, str2, str4);
        this.completion_handle = str;
        this.contact_point = str2;
        this.region = str3;
        this.date_of_birth = str4;
        this.first_name = str5;
        this.last_name = str6;
        this.password = str7;
        this.tos_content_version = str8;
        this.device_id = str9;
        this.waterfall_id = str10;
        this.attestation = authRegistrationAttestationJson;
    }

    public final AuthRegisterCompletionRequestJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AuthRegistrationAttestationJson authRegistrationAttestationJson) {
        AnonymousClass005.A0y(str, str2, str4);
        return new AuthRegisterCompletionRequestJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, authRegistrationAttestationJson);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ AuthRegisterCompletionRequestJson copy$default(AuthRegisterCompletionRequestJson authRegisterCompletionRequestJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AuthRegistrationAttestationJson authRegistrationAttestationJson, int i, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        AuthRegistrationAttestationJson authRegistrationAttestationJson2 = authRegistrationAttestationJson;
        if ((i & 1) != 0) {
            str11 = authRegisterCompletionRequestJson.completion_handle;
        }
        if ((i & 2) != 0) {
            str12 = authRegisterCompletionRequestJson.contact_point;
        }
        if ((i & 4) != 0) {
            str13 = authRegisterCompletionRequestJson.region;
        }
        if ((i & 8) != 0) {
            str14 = authRegisterCompletionRequestJson.date_of_birth;
        }
        if ((i & 16) != 0) {
            str15 = authRegisterCompletionRequestJson.first_name;
        }
        if ((i & 32) != 0) {
            str16 = authRegisterCompletionRequestJson.last_name;
        }
        if ((i & 64) != 0) {
            str17 = authRegisterCompletionRequestJson.password;
        }
        if ((i & 128) != 0) {
            str18 = authRegisterCompletionRequestJson.tos_content_version;
        }
        if ((i & 256) != 0) {
            str19 = authRegisterCompletionRequestJson.device_id;
        }
        if ((i & 512) != 0) {
            str20 = authRegisterCompletionRequestJson.waterfall_id;
        }
        if ((i & 1024) != 0) {
            authRegistrationAttestationJson2 = authRegisterCompletionRequestJson.attestation;
        }
        AnonymousClass005.A0y(str11, str12, str14);
        return new AuthRegisterCompletionRequestJson(str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, authRegistrationAttestationJson2);
    }

    public /* synthetic */ AuthRegisterCompletionRequestJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AuthRegistrationAttestationJson authRegistrationAttestationJson, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(AuthRegisterCompletionRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.completion_handle = str;
        this.contact_point = str2;
        this.region = str3;
        this.date_of_birth = str4;
        if ((i & 16) == 0) {
            this.first_name = null;
        } else {
            this.first_name = str5;
        }
        if ((i & 32) == 0) {
            this.last_name = null;
        } else {
            this.last_name = str6;
        }
        if ((i & 64) == 0) {
            this.password = null;
        } else {
            this.password = str7;
        }
        if ((i & 128) == 0) {
            this.tos_content_version = null;
        } else {
            this.tos_content_version = str8;
        }
        if ((i & 256) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str9;
        }
        if ((i & 512) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str10;
        }
        if ((i & 1024) == 0) {
            this.attestation = null;
        } else {
            this.attestation = authRegistrationAttestationJson;
        }
    }

    public /* synthetic */ AuthRegisterCompletionRequestJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AuthRegistrationAttestationJson authRegistrationAttestationJson, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : authRegistrationAttestationJson);
    }
}
