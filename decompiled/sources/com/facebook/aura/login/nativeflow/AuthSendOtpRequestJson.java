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
public final class AuthSendOtpRequestJson extends C06G {
    public final String auth_state;
    public final String contact_point;
    public final String device_id;
    public final String region;
    public final String registration_source;
    public final List<String> supported_landing_presentations;
    public final boolean supports_meta_two_factor;
    public final boolean supports_ntp_upsell_account_choice;
    public final boolean supports_xapp_two_factor_ntp_upsell;
    public final String waterfall_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, AuthSendOtpRequestJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<AuthSendOtpRequestJson> serializer() {
            return AuthSendOtpRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthSendOtpRequestJson(String str, String str2, String str3, String str4, boolean z, boolean z2, List<String> list, boolean z3, String str5, String str6) {
        AnonymousClass002.A1E(str, 0, list);
        this.contact_point = str;
        this.region = str2;
        this.auth_state = str3;
        this.registration_source = str4;
        this.supports_xapp_two_factor_ntp_upsell = z;
        this.supports_ntp_upsell_account_choice = z2;
        this.supported_landing_presentations = list;
        this.supports_meta_two_factor = z3;
        this.device_id = str5;
        this.waterfall_id = str6;
    }

    public final AuthSendOtpRequestJson copy(String str, String str2, String str3, String str4, boolean z, boolean z2, List<String> list, boolean z3, String str5, String str6) {
        AnonymousClass002.A1E(str, 0, list);
        return new AuthSendOtpRequestJson(str, str2, str3, str4, z, z2, list, z3, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSendOtpRequestJson) {
                AuthSendOtpRequestJson authSendOtpRequestJson = (AuthSendOtpRequestJson) obj;
                if (!C7384Etj.areEqual(this.contact_point, authSendOtpRequestJson.contact_point) || !C7384Etj.areEqual(this.region, authSendOtpRequestJson.region) || !C7384Etj.areEqual(this.auth_state, authSendOtpRequestJson.auth_state) || !C7384Etj.areEqual(this.registration_source, authSendOtpRequestJson.registration_source) || this.supports_xapp_two_factor_ntp_upsell != authSendOtpRequestJson.supports_xapp_two_factor_ntp_upsell || this.supports_ntp_upsell_account_choice != authSendOtpRequestJson.supports_ntp_upsell_account_choice || !C7384Etj.areEqual(this.supported_landing_presentations, authSendOtpRequestJson.supported_landing_presentations) || this.supports_meta_two_factor != authSendOtpRequestJson.supports_meta_two_factor || !C7384Etj.areEqual(this.device_id, authSendOtpRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authSendOtpRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthSendOtpRequestJson copy$default(AuthSendOtpRequestJson authSendOtpRequestJson, String str, String str2, String str3, String str4, boolean z, boolean z2, List list, boolean z3, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSendOtpRequestJson.contact_point;
        }
        if ((i & 2) != 0) {
            str2 = authSendOtpRequestJson.region;
        }
        if ((i & 4) != 0) {
            str3 = authSendOtpRequestJson.auth_state;
        }
        if ((i & 8) != 0) {
            str4 = authSendOtpRequestJson.registration_source;
        }
        if ((i & 16) != 0) {
            z = authSendOtpRequestJson.supports_xapp_two_factor_ntp_upsell;
        }
        if ((i & 32) != 0) {
            z2 = authSendOtpRequestJson.supports_ntp_upsell_account_choice;
        }
        if ((i & 64) != 0) {
            list = authSendOtpRequestJson.supported_landing_presentations;
        }
        if ((i & 128) != 0) {
            z3 = authSendOtpRequestJson.supports_meta_two_factor;
        }
        if ((i & 256) != 0) {
            str5 = authSendOtpRequestJson.device_id;
        }
        if ((i & 512) != 0) {
            str6 = authSendOtpRequestJson.waterfall_id;
        }
        return authSendOtpRequestJson.copy(str, str2, str3, str4, z, z2, list, z3, str5, str6);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthSendOtpRequestJson r8, X.C9j5 r9, X.C9iZ r10) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r6 = com.facebook.aura.login.nativeflow.AuthSendOtpRequestJson.$childSerializers
            r1 = 0
            java.lang.String r0 = r8.contact_point
            r9.AAV(r0, r10, r1)
            X.9iq r4 = X.C07779iq.A01
            java.lang.String r1 = r8.region
            r0 = 1
            r9.AAP(r1, r4, r10, r0)
            r1 = 2
            boolean r7 = r9.AfR()
            if (r7 != 0) goto L1b
            java.lang.String r0 = r8.auth_state
            if (r0 == 0) goto L20
        L1b:
            java.lang.String r0 = r8.auth_state
            r9.AAP(r0, r4, r10, r1)
        L20:
            r1 = 3
            if (r7 != 0) goto L27
            java.lang.String r0 = r8.registration_source
            if (r0 == 0) goto L2c
        L27:
            java.lang.String r0 = r8.registration_source
            r9.AAP(r0, r4, r10, r1)
        L2c:
            r1 = 4
            if (r7 != 0) goto L33
            boolean r0 = r8.supports_xapp_two_factor_ntp_upsell
            if (r0 == 0) goto L38
        L33:
            boolean r0 = r8.supports_xapp_two_factor_ntp_upsell
            r9.AA7(r10, r1, r0)
        L38:
            r1 = 5
            if (r7 != 0) goto L3f
            boolean r0 = r8.supports_ntp_upsell_account_choice
            if (r0 == 0) goto L44
        L3f:
            boolean r0 = r8.supports_ntp_upsell_account_choice
            r9.AA7(r10, r1, r0)
        L44:
            r5 = 6
            if (r7 != 0) goto L65
            java.util.List<java.lang.String> r3 = r8.supported_landing_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchLandingPresentation.access$getDRAWN$cp()
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L55:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5f
            X.C3cJ.A0s(r2, r1)
            goto L55
        L5f:
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 != 0) goto L6e
        L65:
            X.9hv r1 = X.C3cH.A15(r6, r5)
            java.util.List<java.lang.String> r0 = r8.supported_landing_presentations
            r9.AAQ(r0, r1, r10, r5)
        L6e:
            r1 = 7
            if (r7 != 0) goto L75
            boolean r0 = r8.supports_meta_two_factor
            if (r0 == 0) goto L7a
        L75:
            boolean r0 = r8.supports_meta_two_factor
            r9.AA7(r10, r1, r0)
        L7a:
            r1 = 8
            if (r7 != 0) goto L82
            java.lang.String r0 = r8.device_id
            if (r0 == 0) goto L87
        L82:
            java.lang.String r0 = r8.device_id
            r9.AAP(r0, r4, r10, r1)
        L87:
            r1 = 9
            if (r7 != 0) goto L8f
            java.lang.String r0 = r8.waterfall_id
            if (r0 == 0) goto L94
        L8f:
            java.lang.String r0 = r8.waterfall_id
            r9.AAP(r0, r4, r10, r1)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.AuthSendOtpRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthSendOtpRequestJson, X.9j5, X.9iZ):void");
    }

    public final String component1() {
        return this.contact_point;
    }

    public final String component10() {
        return this.waterfall_id;
    }

    public final String component2() {
        return this.region;
    }

    public final String component3() {
        return this.auth_state;
    }

    public final String component4() {
        return this.registration_source;
    }

    public final boolean component5() {
        return this.supports_xapp_two_factor_ntp_upsell;
    }

    public final boolean component6() {
        return this.supports_ntp_upsell_account_choice;
    }

    public final List<String> component7() {
        return this.supported_landing_presentations;
    }

    public final boolean component8() {
        return this.supports_meta_two_factor;
    }

    public final String component9() {
        return this.device_id;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final String getContact_point() {
        return this.contact_point;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getRegistration_source() {
        return this.registration_source;
    }

    public final List<String> getSupported_landing_presentations() {
        return this.supported_landing_presentations;
    }

    public final boolean getSupports_meta_two_factor() {
        return this.supports_meta_two_factor;
    }

    public final boolean getSupports_ntp_upsell_account_choice() {
        return this.supports_ntp_upsell_account_choice;
    }

    public final boolean getSupports_xapp_two_factor_ntp_upsell() {
        return this.supports_xapp_two_factor_ntp_upsell;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((C0KA.A01(AnonymousClass005.A0F(this.supported_landing_presentations, C0KA.A01(C0KA.A01((((((AnonymousClass001.A0G(this.contact_point) + AnonymousClass006.A0G(this.region)) * 31) + AnonymousClass006.A0G(this.auth_state)) * 31) + AnonymousClass006.A0G(this.registration_source)) * 31, this.supports_xapp_two_factor_ntp_upsell), this.supports_ntp_upsell_account_choice)), this.supports_meta_two_factor) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public /* synthetic */ AuthSendOtpRequestJson(String str, String str2, String str3, String str4, boolean z, boolean z2, List list, boolean z3, String str5, String str6, int i, C06H c06h) {
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        boolean zA1Q = AnonymousClass005.A1Q(i, z);
        z2 = (i & 32) != 0 ? false : z2;
        if ((i & 64) != 0) {
            Set set = HatchLandingPresentation.DRAWN;
            list = AnonymousClass003.A0i(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0s(list, it);
            }
        }
        this(str, str2, str3, str4, zA1Q, z2, list, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }

    public /* synthetic */ AuthSendOtpRequestJson(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, List list, boolean z3, String str5, String str6, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthSendOtpRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.contact_point = str;
        this.region = str2;
        if ((i & 4) == 0) {
            this.auth_state = null;
        } else {
            this.auth_state = str3;
        }
        if ((i & 8) == 0) {
            this.registration_source = null;
        } else {
            this.registration_source = str4;
        }
        if ((i & 16) == 0) {
            this.supports_xapp_two_factor_ntp_upsell = false;
        } else {
            this.supports_xapp_two_factor_ntp_upsell = z;
        }
        if ((i & 32) == 0) {
            this.supports_ntp_upsell_account_choice = false;
        } else {
            this.supports_ntp_upsell_account_choice = z2;
        }
        if ((i & 64) == 0) {
            Set set = HatchLandingPresentation.DRAWN;
            ArrayList arrayListA0i = AnonymousClass003.A0i(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0s(arrayListA0i, it);
            }
            this.supported_landing_presentations = arrayListA0i;
        } else {
            this.supported_landing_presentations = list;
        }
        if ((i & 128) == 0) {
            this.supports_meta_two_factor = false;
        } else {
            this.supports_meta_two_factor = z3;
        }
        if ((i & 256) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str5;
        }
        if ((i & 512) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str6;
        }
    }
}
