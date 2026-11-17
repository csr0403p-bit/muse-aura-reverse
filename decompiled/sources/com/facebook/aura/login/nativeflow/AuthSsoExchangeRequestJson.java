package com.facebook.aura.login.nativeflow;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
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
public final class AuthSsoExchangeRequestJson extends C06G {
    public final String access_token;
    public final String device_id;
    public final String first_name;
    public final String last_name;
    public final String linking_disclosure_version;
    public final String source_app;
    public final List<String> supported_disclosure_presentations;
    public final Boolean supports_direct_ntp_upsell;
    public final boolean supports_login_name_completion;
    public final boolean supports_name_completion;
    public final String tos_content_version;
    public final String waterfall_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, AuthSsoExchangeRequestJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<AuthSsoExchangeRequestJson> serializer() {
            return AuthSsoExchangeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSsoExchangeRequestJson) {
                AuthSsoExchangeRequestJson authSsoExchangeRequestJson = (AuthSsoExchangeRequestJson) obj;
                if (!C7384Etj.areEqual(this.source_app, authSsoExchangeRequestJson.source_app) || !C7384Etj.areEqual(this.access_token, authSsoExchangeRequestJson.access_token) || !C7384Etj.areEqual(this.device_id, authSsoExchangeRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authSsoExchangeRequestJson.waterfall_id) || this.supports_name_completion != authSsoExchangeRequestJson.supports_name_completion || this.supports_login_name_completion != authSsoExchangeRequestJson.supports_login_name_completion || !C7384Etj.areEqual(this.first_name, authSsoExchangeRequestJson.first_name) || !C7384Etj.areEqual(this.last_name, authSsoExchangeRequestJson.last_name) || !C7384Etj.areEqual(this.tos_content_version, authSsoExchangeRequestJson.tos_content_version) || !C7384Etj.areEqual(this.supported_disclosure_presentations, authSsoExchangeRequestJson.supported_disclosure_presentations) || !C7384Etj.areEqual(this.linking_disclosure_version, authSsoExchangeRequestJson.linking_disclosure_version) || !C7384Etj.areEqual(this.supports_direct_ntp_upsell, authSsoExchangeRequestJson.supports_direct_ntp_upsell)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthSsoExchangeRequestJson copy$default(AuthSsoExchangeRequestJson authSsoExchangeRequestJson, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, List list, String str8, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSsoExchangeRequestJson.source_app;
        }
        if ((i & 2) != 0) {
            str2 = authSsoExchangeRequestJson.access_token;
        }
        if ((i & 4) != 0) {
            str3 = authSsoExchangeRequestJson.device_id;
        }
        if ((i & 8) != 0) {
            str4 = authSsoExchangeRequestJson.waterfall_id;
        }
        if ((i & 16) != 0) {
            z = authSsoExchangeRequestJson.supports_name_completion;
        }
        if ((i & 32) != 0) {
            z2 = authSsoExchangeRequestJson.supports_login_name_completion;
        }
        if ((i & 64) != 0) {
            str5 = authSsoExchangeRequestJson.first_name;
        }
        if ((i & 128) != 0) {
            str6 = authSsoExchangeRequestJson.last_name;
        }
        if ((i & 256) != 0) {
            str7 = authSsoExchangeRequestJson.tos_content_version;
        }
        if ((i & 512) != 0) {
            list = authSsoExchangeRequestJson.supported_disclosure_presentations;
        }
        if ((i & 1024) != 0) {
            str8 = authSsoExchangeRequestJson.linking_disclosure_version;
        }
        if ((i & 2048) != 0) {
            bool = authSsoExchangeRequestJson.supports_direct_ntp_upsell;
        }
        return authSsoExchangeRequestJson.copy(str, str2, str3, str4, z, z2, str5, str6, str7, list, str8, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthSsoExchangeRequestJson r8, X.C9j5 r9, X.C9iZ r10) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r2 = com.facebook.aura.login.nativeflow.AuthSsoExchangeRequestJson.$childSerializers
            r1 = 0
            java.lang.String r0 = r8.source_app
            r9.AAV(r0, r10, r1)
            java.lang.String r0 = r8.access_token
            r4 = 1
            r9.AAV(r0, r10, r4)
            r3 = 2
            boolean r7 = r9.AfR()
            if (r7 != 0) goto L19
            java.lang.String r0 = r8.device_id
            if (r0 == 0) goto L20
        L19:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r8.device_id
            r9.AAP(r0, r1, r10, r3)
        L20:
            r3 = 3
            if (r7 != 0) goto L27
            java.lang.String r0 = r8.waterfall_id
            if (r0 == 0) goto L2e
        L27:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r8.waterfall_id
            r9.AAP(r0, r1, r10, r3)
        L2e:
            r1 = 4
            if (r7 != 0) goto L35
            boolean r0 = r8.supports_name_completion
            if (r0 == r4) goto L3a
        L35:
            boolean r0 = r8.supports_name_completion
            r9.AA7(r10, r1, r0)
        L3a:
            r1 = 5
            if (r7 != 0) goto L41
            boolean r0 = r8.supports_login_name_completion
            if (r0 == r4) goto L46
        L41:
            boolean r0 = r8.supports_login_name_completion
            r9.AA7(r10, r1, r0)
        L46:
            r3 = 6
            if (r7 != 0) goto L4d
            java.lang.String r0 = r8.first_name
            if (r0 == 0) goto L54
        L4d:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r8.first_name
            r9.AAP(r0, r1, r10, r3)
        L54:
            r3 = 7
            if (r7 != 0) goto L5b
            java.lang.String r0 = r8.last_name
            if (r0 == 0) goto L62
        L5b:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r8.last_name
            r9.AAP(r0, r1, r10, r3)
        L62:
            r3 = 8
            if (r7 != 0) goto L6a
            java.lang.String r0 = r8.tos_content_version
            if (r0 == 0) goto L71
        L6a:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r8.tos_content_version
            r9.AAP(r0, r1, r10, r3)
        L71:
            r6 = 9
            r5 = 10
            if (r7 != 0) goto L9b
            java.util.List<java.lang.String> r4 = r8.supported_disclosure_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchDisclosurePresentation.access$getDRAWN$cp()
            java.util.ArrayList r3 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L85:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8f
            X.C3cJ.A0r(r3, r1)
            goto L85
        L8f:
            java.lang.String r0 = "birthday_itemized_consent_screen"
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0Q(r0, r3)
            boolean r0 = X.C7384Etj.areEqual(r4, r0)
            if (r0 != 0) goto Lbd
        L9b:
            X.9hv r1 = X.C3cH.A15(r2, r6)
            java.util.List<java.lang.String> r0 = r8.supported_disclosure_presentations
            r9.AAQ(r0, r1, r10, r6)
            if (r7 == 0) goto Lbd
        La6:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r8.linking_disclosure_version
            r9.AAP(r0, r1, r10, r5)
        Lad:
            r2 = 11
            if (r7 != 0) goto Lb5
            java.lang.Boolean r0 = r8.supports_direct_ntp_upsell
            if (r0 == 0) goto Lbc
        Lb5:
            X.9ix r1 = X.C07839ix.A00
            java.lang.Boolean r0 = r8.supports_direct_ntp_upsell
            r9.AAP(r0, r1, r10, r2)
        Lbc:
            return
        Lbd:
            java.lang.String r0 = r8.linking_disclosure_version
            if (r0 == 0) goto Lad
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.AuthSsoExchangeRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthSsoExchangeRequestJson, X.9j5, X.9iZ):void");
    }

    public final String component1() {
        return this.source_app;
    }

    public final List<String> component10() {
        return this.supported_disclosure_presentations;
    }

    public final String component11() {
        return this.linking_disclosure_version;
    }

    public final Boolean component12() {
        return this.supports_direct_ntp_upsell;
    }

    public final String component2() {
        return this.access_token;
    }

    public final String component3() {
        return this.device_id;
    }

    public final String component4() {
        return this.waterfall_id;
    }

    public final boolean component5() {
        return this.supports_name_completion;
    }

    public final boolean component6() {
        return this.supports_login_name_completion;
    }

    public final String component7() {
        return this.first_name;
    }

    public final String component8() {
        return this.last_name;
    }

    public final String component9() {
        return this.tos_content_version;
    }

    public final String getAccess_token() {
        return this.access_token;
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

    public final String getLinking_disclosure_version() {
        return this.linking_disclosure_version;
    }

    public final String getSource_app() {
        return this.source_app;
    }

    public final List<String> getSupported_disclosure_presentations() {
        return this.supported_disclosure_presentations;
    }

    public final Boolean getSupports_direct_ntp_upsell() {
        return this.supports_direct_ntp_upsell;
    }

    public final boolean getSupports_login_name_completion() {
        return this.supports_login_name_completion;
    }

    public final boolean getSupports_name_completion() {
        return this.supports_name_completion;
    }

    public final String getTos_content_version() {
        return this.tos_content_version;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.supported_disclosure_presentations, (((((C0KA.A01(C0KA.A01((((AnonymousClass005.A0I(this.access_token, AnonymousClass001.A0G(this.source_app)) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass006.A0G(this.waterfall_id)) * 31, this.supports_name_completion), this.supports_login_name_completion) + AnonymousClass006.A0G(this.first_name)) * 31) + AnonymousClass006.A0G(this.last_name)) * 31) + AnonymousClass006.A0G(this.tos_content_version)) * 31) + AnonymousClass006.A0G(this.linking_disclosure_version)) * 31) + C3cH.A02(this.supports_direct_ntp_upsell);
    }

    public AuthSsoExchangeRequestJson(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, List<String> list, String str8, Boolean bool) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 9);
        this.source_app = str;
        this.access_token = str2;
        this.device_id = str3;
        this.waterfall_id = str4;
        this.supports_name_completion = z;
        this.supports_login_name_completion = z2;
        this.first_name = str5;
        this.last_name = str6;
        this.tos_content_version = str7;
        this.supported_disclosure_presentations = list;
        this.linking_disclosure_version = str8;
        this.supports_direct_ntp_upsell = bool;
    }

    public final AuthSsoExchangeRequestJson copy(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, List<String> list, String str8, Boolean bool) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 9);
        return new AuthSsoExchangeRequestJson(str, str2, str3, str4, z, z2, str5, str6, str7, list, str8, bool);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AuthSsoExchangeRequestJson(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, List list, String str8, Boolean bool, int i, C06H c06h) {
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        z = (i & 16) != 0 ? true : z;
        z2 = (i & 32) != 0 ? true : z2;
        str5 = (i & 64) != 0 ? null : str5;
        str6 = (i & 128) != 0 ? null : str6;
        str7 = (i & 256) != 0 ? null : str7;
        if ((i & 512) != 0) {
            Set set = HatchDisclosurePresentation.DRAWN;
            ArrayList arrayListA0i = AnonymousClass003.A0i(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0r(arrayListA0i, it);
            }
            list = AbstractC0878AGe.A0Q(HatchDisclosurePresentation.BIRTHDAY_ITEMIZED_CONSENT_SCREEN, arrayListA0i);
        }
        this(str, str2, str3, str4, z, z2, str5, str6, str7, list, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool);
    }

    public /* synthetic */ AuthSsoExchangeRequestJson(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, List list, String str8, Boolean bool, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthSsoExchangeRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.source_app = str;
        this.access_token = str2;
        if ((i & 4) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str3;
        }
        if ((i & 8) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str4;
        }
        if ((i & 16) == 0) {
            this.supports_name_completion = true;
        } else {
            this.supports_name_completion = z;
        }
        if ((i & 32) == 0) {
            this.supports_login_name_completion = true;
        } else {
            this.supports_login_name_completion = z2;
        }
        if ((i & 64) == 0) {
            this.first_name = null;
        } else {
            this.first_name = str5;
        }
        if ((i & 128) == 0) {
            this.last_name = null;
        } else {
            this.last_name = str6;
        }
        if ((i & 256) == 0) {
            this.tos_content_version = null;
        } else {
            this.tos_content_version = str7;
        }
        if ((i & 512) == 0) {
            Set set = HatchDisclosurePresentation.DRAWN;
            ArrayList arrayListA0i = AnonymousClass003.A0i(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0r(arrayListA0i, it);
            }
            this.supported_disclosure_presentations = AbstractC0878AGe.A0Q(HatchDisclosurePresentation.BIRTHDAY_ITEMIZED_CONSENT_SCREEN, arrayListA0i);
        } else {
            this.supported_disclosure_presentations = list;
        }
        if ((i & 1024) == 0) {
            this.linking_disclosure_version = null;
        } else {
            this.linking_disclosure_version = str8;
        }
        if ((i & 2048) == 0) {
            this.supports_direct_ntp_upsell = null;
        } else {
            this.supports_direct_ntp_upsell = bool;
        }
    }
}
