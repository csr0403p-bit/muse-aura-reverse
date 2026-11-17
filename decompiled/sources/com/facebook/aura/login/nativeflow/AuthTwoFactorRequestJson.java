package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthTwoFactorRequestJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final AuthRegistrationAttestationJson attestation;
    public final String code;
    public final String device_id;
    public final String method_id;
    public final List<String> supported_disclosure_presentations;
    public final List<String> supported_ntp_upsell_disclosure_presentations;
    public final boolean supports_reactivation;
    public final String tos_content_version;
    public final String two_factor_state;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthTwoFactorRequestJson> serializer() {
            return AuthTwoFactorRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, AbstractC5321DgF.A02(num, AuthTwoFactorRequestJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, AuthTwoFactorRequestJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTwoFactorRequestJson) {
                AuthTwoFactorRequestJson authTwoFactorRequestJson = (AuthTwoFactorRequestJson) obj;
                if (!C7384Etj.areEqual(this.two_factor_state, authTwoFactorRequestJson.two_factor_state) || !C7384Etj.areEqual(this.method_id, authTwoFactorRequestJson.method_id) || !C7384Etj.areEqual(this.code, authTwoFactorRequestJson.code) || this.supports_reactivation != authTwoFactorRequestJson.supports_reactivation || !C7384Etj.areEqual(this.supported_disclosure_presentations, authTwoFactorRequestJson.supported_disclosure_presentations) || !C7384Etj.areEqual(this.supported_ntp_upsell_disclosure_presentations, authTwoFactorRequestJson.supported_ntp_upsell_disclosure_presentations) || !C7384Etj.areEqual(this.tos_content_version, authTwoFactorRequestJson.tos_content_version) || !C7384Etj.areEqual(this.device_id, authTwoFactorRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authTwoFactorRequestJson.waterfall_id) || !C7384Etj.areEqual(this.attestation, authTwoFactorRequestJson.attestation)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthTwoFactorRequestJson copy$default(AuthTwoFactorRequestJson authTwoFactorRequestJson, String str, String str2, String str3, boolean z, List list, List list2, String str4, String str5, String str6, AuthRegistrationAttestationJson authRegistrationAttestationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTwoFactorRequestJson.two_factor_state;
        }
        if ((i & 2) != 0) {
            str2 = authTwoFactorRequestJson.method_id;
        }
        if ((i & 4) != 0) {
            str3 = authTwoFactorRequestJson.code;
        }
        if ((i & 8) != 0) {
            z = authTwoFactorRequestJson.supports_reactivation;
        }
        if ((i & 16) != 0) {
            list = authTwoFactorRequestJson.supported_disclosure_presentations;
        }
        if ((i & 32) != 0) {
            list2 = authTwoFactorRequestJson.supported_ntp_upsell_disclosure_presentations;
        }
        if ((i & 64) != 0) {
            str4 = authTwoFactorRequestJson.tos_content_version;
        }
        if ((i & 128) != 0) {
            str5 = authTwoFactorRequestJson.device_id;
        }
        if ((i & 256) != 0) {
            str6 = authTwoFactorRequestJson.waterfall_id;
        }
        if ((i & 512) != 0) {
            authRegistrationAttestationJson = authTwoFactorRequestJson.attestation;
        }
        return authTwoFactorRequestJson.copy(str, str2, str3, z, list, list2, str4, str5, str6, authRegistrationAttestationJson);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthTwoFactorRequestJson r7, X.C9j5 r8, X.C9iZ r9) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r4 = com.facebook.aura.login.nativeflow.AuthTwoFactorRequestJson.$childSerializers
            r1 = 0
            java.lang.String r0 = r7.two_factor_state
            r8.AAV(r0, r9, r1)
            java.lang.String r0 = r7.method_id
            r2 = 1
            r8.AAV(r0, r9, r2)
            r1 = 2
            java.lang.String r0 = r7.code
            r8.AAV(r0, r9, r1)
            r1 = 3
            boolean r6 = r8.AfR()
            if (r6 != 0) goto L1f
            boolean r0 = r7.supports_reactivation
            if (r0 == r2) goto L24
        L1f:
            boolean r0 = r7.supports_reactivation
            r8.AA7(r9, r1, r0)
        L24:
            r5 = 4
            if (r6 != 0) goto L45
            java.util.List<java.lang.String> r3 = r7.supported_disclosure_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchDisclosurePresentation.access$getDRAWN$cp()
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3f
            X.C3cJ.A0r(r2, r1)
            goto L35
        L3f:
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 != 0) goto L4e
        L45:
            X.9hv r1 = X.C3cH.A15(r4, r5)
            java.util.List<java.lang.String> r0 = r7.supported_disclosure_presentations
            r8.AAQ(r0, r1, r9, r5)
        L4e:
            r5 = 5
            if (r6 != 0) goto L6f
            java.util.List<java.lang.String> r3 = r7.supported_ntp_upsell_disclosure_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchDisclosurePresentation.access$getDRAWN$cp()
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L5f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L69
            X.C3cJ.A0r(r2, r1)
            goto L5f
        L69:
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 != 0) goto L78
        L6f:
            X.9hv r1 = X.C3cH.A15(r4, r5)
            java.util.List<java.lang.String> r0 = r7.supported_ntp_upsell_disclosure_presentations
            r8.AAQ(r0, r1, r9, r5)
        L78:
            r2 = 6
            if (r6 != 0) goto L7f
            java.lang.String r0 = r7.tos_content_version
            if (r0 == 0) goto L86
        L7f:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.tos_content_version
            r8.AAP(r0, r1, r9, r2)
        L86:
            r2 = 7
            if (r6 != 0) goto L8d
            java.lang.String r0 = r7.device_id
            if (r0 == 0) goto L94
        L8d:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.device_id
            r8.AAP(r0, r1, r9, r2)
        L94:
            r2 = 8
            if (r6 != 0) goto L9c
            java.lang.String r0 = r7.waterfall_id
            if (r0 == 0) goto La3
        L9c:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.waterfall_id
            r8.AAP(r0, r1, r9, r2)
        La3:
            r2 = 9
            if (r6 != 0) goto Lab
            com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson r0 = r7.attestation
            if (r0 == 0) goto Lb2
        Lab:
            com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson$$serializer r1 = com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson$$serializer.INSTANCE
            com.facebook.aura.login.nativeflow.AuthRegistrationAttestationJson r0 = r7.attestation
            r8.AAP(r0, r1, r9, r2)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.AuthTwoFactorRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthTwoFactorRequestJson, X.9j5, X.9iZ):void");
    }

    public final String component1() {
        return this.two_factor_state;
    }

    public final AuthRegistrationAttestationJson component10() {
        return this.attestation;
    }

    public final String component2() {
        return this.method_id;
    }

    public final String component3() {
        return this.code;
    }

    public final boolean component4() {
        return this.supports_reactivation;
    }

    public final List<String> component5() {
        return this.supported_disclosure_presentations;
    }

    public final List<String> component6() {
        return this.supported_ntp_upsell_disclosure_presentations;
    }

    public final String component7() {
        return this.tos_content_version;
    }

    public final String component8() {
        return this.device_id;
    }

    public final String component9() {
        return this.waterfall_id;
    }

    public final AuthRegistrationAttestationJson getAttestation() {
        return this.attestation;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getMethod_id() {
        return this.method_id;
    }

    public final List<String> getSupported_disclosure_presentations() {
        return this.supported_disclosure_presentations;
    }

    public final List<String> getSupported_ntp_upsell_disclosure_presentations() {
        return this.supported_ntp_upsell_disclosure_presentations;
    }

    public final boolean getSupports_reactivation() {
        return this.supports_reactivation;
    }

    public final String getTos_content_version() {
        return this.tos_content_version;
    }

    public final String getTwo_factor_state() {
        return this.two_factor_state;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.supported_ntp_upsell_disclosure_presentations, AnonymousClass005.A0F(this.supported_disclosure_presentations, C0KA.A01(AnonymousClass005.A0I(this.code, AnonymousClass005.A0I(this.method_id, AnonymousClass001.A0G(this.two_factor_state))), this.supports_reactivation))) + AnonymousClass006.A0G(this.tos_content_version)) * 31) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass006.A0G(this.waterfall_id)) * 31) + C3cH.A02(this.attestation);
    }

    public AuthTwoFactorRequestJson(String str, String str2, String str3, boolean z, List<String> list, List<String> list2, String str4, String str5, String str6, AuthRegistrationAttestationJson authRegistrationAttestationJson) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A0y(list, list2);
        this.two_factor_state = str;
        this.method_id = str2;
        this.code = str3;
        this.supports_reactivation = z;
        this.supported_disclosure_presentations = list;
        this.supported_ntp_upsell_disclosure_presentations = list2;
        this.tos_content_version = str4;
        this.device_id = str5;
        this.waterfall_id = str6;
        this.attestation = authRegistrationAttestationJson;
    }

    public final AuthTwoFactorRequestJson copy(String str, String str2, String str3, boolean z, List<String> list, List<String> list2, String str4, String str5, String str6, AuthRegistrationAttestationJson authRegistrationAttestationJson) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A0y(list, list2);
        return new AuthTwoFactorRequestJson(str, str2, str3, z, list, list2, str4, str5, str6, authRegistrationAttestationJson);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public /* synthetic */ AuthTwoFactorRequestJson(String str, String str2, String str3, boolean z, List list, List list2, String str4, String str5, String str6, AuthRegistrationAttestationJson authRegistrationAttestationJson, int i, C06H c06h) {
        z = (i & 8) != 0 ? true : z;
        if ((i & 16) != 0) {
            Set set = HatchDisclosurePresentation.DRAWN;
            list = AnonymousClass002.A0m(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0r(list, it);
            }
        }
        if ((i & 32) != 0) {
            Set set2 = HatchDisclosurePresentation.DRAWN;
            list2 = AnonymousClass002.A0m(set2);
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                C3cJ.A0r(list2, it2);
            }
        }
        this(str, str2, str3, z, list, list2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : authRegistrationAttestationJson);
    }

    public /* synthetic */ AuthTwoFactorRequestJson(int i, String str, String str2, String str3, boolean z, List list, List list2, String str4, String str5, String str6, AuthRegistrationAttestationJson authRegistrationAttestationJson, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(AuthTwoFactorRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.two_factor_state = str;
        this.method_id = str2;
        this.code = str3;
        this.supports_reactivation = (i & 8) == 0 ? true : z;
        if ((i & 16) == 0) {
            Set set = HatchDisclosurePresentation.DRAWN;
            ArrayList arrayListA0m = AnonymousClass002.A0m(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0r(arrayListA0m, it);
            }
            this.supported_disclosure_presentations = arrayListA0m;
        } else {
            this.supported_disclosure_presentations = list;
        }
        if ((i & 32) == 0) {
            Set set2 = HatchDisclosurePresentation.DRAWN;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(set2);
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                C3cJ.A0r(arrayListA0m2, it2);
            }
            this.supported_ntp_upsell_disclosure_presentations = arrayListA0m2;
        } else {
            this.supported_ntp_upsell_disclosure_presentations = list2;
        }
        if ((i & 64) == 0) {
            this.tos_content_version = null;
        } else {
            this.tos_content_version = str4;
        }
        if ((i & 128) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str5;
        }
        if ((i & 256) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str6;
        }
        if ((i & 512) == 0) {
            this.attestation = null;
        } else {
            this.attestation = authRegistrationAttestationJson;
        }
    }
}
