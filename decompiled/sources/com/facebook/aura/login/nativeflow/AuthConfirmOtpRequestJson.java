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
public final class AuthConfirmOtpRequestJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String auth_state;
    public final String device_id;
    public final String otp_code;
    public final List<String> supported_disclosure_presentations;
    public final List<String> supported_ntp_upsell_disclosure_presentations;
    public final boolean supports_account_selection;
    public final boolean supports_inactive_account_labels;
    public final boolean supports_muse_link_transparency;
    public final boolean supports_reactivation;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthConfirmOtpRequestJson> serializer() {
            return AuthConfirmOtpRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, AbstractC5321DgF.A02(num, AuthConfirmOtpRequestJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, AuthConfirmOtpRequestJson$Companion$$childSerializers$2.INSTANCE), null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthConfirmOtpRequestJson) {
                AuthConfirmOtpRequestJson authConfirmOtpRequestJson = (AuthConfirmOtpRequestJson) obj;
                if (!C7384Etj.areEqual(this.auth_state, authConfirmOtpRequestJson.auth_state) || !C7384Etj.areEqual(this.otp_code, authConfirmOtpRequestJson.otp_code) || this.supports_account_selection != authConfirmOtpRequestJson.supports_account_selection || this.supports_muse_link_transparency != authConfirmOtpRequestJson.supports_muse_link_transparency || this.supports_reactivation != authConfirmOtpRequestJson.supports_reactivation || this.supports_inactive_account_labels != authConfirmOtpRequestJson.supports_inactive_account_labels || !C7384Etj.areEqual(this.supported_disclosure_presentations, authConfirmOtpRequestJson.supported_disclosure_presentations) || !C7384Etj.areEqual(this.supported_ntp_upsell_disclosure_presentations, authConfirmOtpRequestJson.supported_ntp_upsell_disclosure_presentations) || !C7384Etj.areEqual(this.device_id, authConfirmOtpRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authConfirmOtpRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthConfirmOtpRequestJson copy$default(AuthConfirmOtpRequestJson authConfirmOtpRequestJson, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authConfirmOtpRequestJson.auth_state;
        }
        if ((i & 2) != 0) {
            str2 = authConfirmOtpRequestJson.otp_code;
        }
        if ((i & 4) != 0) {
            z = authConfirmOtpRequestJson.supports_account_selection;
        }
        if ((i & 8) != 0) {
            z2 = authConfirmOtpRequestJson.supports_muse_link_transparency;
        }
        if ((i & 16) != 0) {
            z3 = authConfirmOtpRequestJson.supports_reactivation;
        }
        if ((i & 32) != 0) {
            z4 = authConfirmOtpRequestJson.supports_inactive_account_labels;
        }
        if ((i & 64) != 0) {
            list = authConfirmOtpRequestJson.supported_disclosure_presentations;
        }
        if ((i & 128) != 0) {
            list2 = authConfirmOtpRequestJson.supported_ntp_upsell_disclosure_presentations;
        }
        if ((i & 256) != 0) {
            str3 = authConfirmOtpRequestJson.device_id;
        }
        if ((i & 512) != 0) {
            str4 = authConfirmOtpRequestJson.waterfall_id;
        }
        return authConfirmOtpRequestJson.copy(str, str2, z, z2, z3, z4, list, list2, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthConfirmOtpRequestJson r7, X.C9j5 r8, X.C9iZ r9) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r4 = com.facebook.aura.login.nativeflow.AuthConfirmOtpRequestJson.$childSerializers
            r1 = 0
            java.lang.String r0 = r7.auth_state
            r8.AAV(r0, r9, r1)
            java.lang.String r0 = r7.otp_code
            r2 = 1
            r8.AAV(r0, r9, r2)
            r1 = 2
            boolean r6 = r8.AfR()
            if (r6 != 0) goto L19
            boolean r0 = r7.supports_account_selection
            if (r0 == r2) goto L1e
        L19:
            boolean r0 = r7.supports_account_selection
            r8.AA7(r9, r1, r0)
        L1e:
            r1 = 3
            if (r6 != 0) goto L25
            boolean r0 = r7.supports_muse_link_transparency
            if (r0 == r2) goto L2a
        L25:
            boolean r0 = r7.supports_muse_link_transparency
            r8.AA7(r9, r1, r0)
        L2a:
            r1 = 4
            if (r6 != 0) goto L31
            boolean r0 = r7.supports_reactivation
            if (r0 == r2) goto L36
        L31:
            boolean r0 = r7.supports_reactivation
            r8.AA7(r9, r1, r0)
        L36:
            r1 = 5
            if (r6 != 0) goto L3d
            boolean r0 = r7.supports_inactive_account_labels
            if (r0 == r2) goto L42
        L3d:
            boolean r0 = r7.supports_inactive_account_labels
            r8.AA7(r9, r1, r0)
        L42:
            r5 = 6
            if (r6 != 0) goto L63
            java.util.List<java.lang.String> r3 = r7.supported_disclosure_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchDisclosurePresentation.access$getDRAWN$cp()
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L53:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5d
            X.C3cJ.A0r(r2, r1)
            goto L53
        L5d:
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 != 0) goto L6c
        L63:
            X.9hv r1 = X.C3cH.A15(r4, r5)
            java.util.List<java.lang.String> r0 = r7.supported_disclosure_presentations
            r8.AAQ(r0, r1, r9, r5)
        L6c:
            r5 = 7
            if (r6 != 0) goto L8d
            java.util.List<java.lang.String> r3 = r7.supported_ntp_upsell_disclosure_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchDisclosurePresentation.access$getDRAWN$cp()
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L7d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L87
            X.C3cJ.A0r(r2, r1)
            goto L7d
        L87:
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 != 0) goto L96
        L8d:
            X.9hv r1 = X.C3cH.A15(r4, r5)
            java.util.List<java.lang.String> r0 = r7.supported_ntp_upsell_disclosure_presentations
            r8.AAQ(r0, r1, r9, r5)
        L96:
            r2 = 8
            if (r6 != 0) goto L9e
            java.lang.String r0 = r7.device_id
            if (r0 == 0) goto La5
        L9e:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.device_id
            r8.AAP(r0, r1, r9, r2)
        La5:
            r2 = 9
            if (r6 != 0) goto Lad
            java.lang.String r0 = r7.waterfall_id
            if (r0 == 0) goto Lb4
        Lad:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.waterfall_id
            r8.AAP(r0, r1, r9, r2)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.AuthConfirmOtpRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthConfirmOtpRequestJson, X.9j5, X.9iZ):void");
    }

    public final String component1() {
        return this.auth_state;
    }

    public final String component10() {
        return this.waterfall_id;
    }

    public final String component2() {
        return this.otp_code;
    }

    public final boolean component3() {
        return this.supports_account_selection;
    }

    public final boolean component4() {
        return this.supports_muse_link_transparency;
    }

    public final boolean component5() {
        return this.supports_reactivation;
    }

    public final boolean component6() {
        return this.supports_inactive_account_labels;
    }

    public final List<String> component7() {
        return this.supported_disclosure_presentations;
    }

    public final List<String> component8() {
        return this.supported_ntp_upsell_disclosure_presentations;
    }

    public final String component9() {
        return this.device_id;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getOtp_code() {
        return this.otp_code;
    }

    public final List<String> getSupported_disclosure_presentations() {
        return this.supported_disclosure_presentations;
    }

    public final List<String> getSupported_ntp_upsell_disclosure_presentations() {
        return this.supported_ntp_upsell_disclosure_presentations;
    }

    public final boolean getSupports_account_selection() {
        return this.supports_account_selection;
    }

    public final boolean getSupports_inactive_account_labels() {
        return this.supports_inactive_account_labels;
    }

    public final boolean getSupports_muse_link_transparency() {
        return this.supports_muse_link_transparency;
    }

    public final boolean getSupports_reactivation() {
        return this.supports_reactivation;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.supported_ntp_upsell_disclosure_presentations, AnonymousClass005.A0F(this.supported_disclosure_presentations, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.otp_code, AnonymousClass001.A0G(this.auth_state)), this.supports_account_selection), this.supports_muse_link_transparency), this.supports_reactivation), this.supports_inactive_account_labels))) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public AuthConfirmOtpRequestJson(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, List<String> list, List<String> list2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A10(list, list2);
        this.auth_state = str;
        this.otp_code = str2;
        this.supports_account_selection = z;
        this.supports_muse_link_transparency = z2;
        this.supports_reactivation = z3;
        this.supports_inactive_account_labels = z4;
        this.supported_disclosure_presentations = list;
        this.supported_ntp_upsell_disclosure_presentations = list2;
        this.device_id = str3;
        this.waterfall_id = str4;
    }

    public final AuthConfirmOtpRequestJson copy(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, List<String> list, List<String> list2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A10(list, list2);
        return new AuthConfirmOtpRequestJson(str, str2, z, z2, z3, z4, list, list2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public /* synthetic */ AuthConfirmOtpRequestJson(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, String str3, String str4, int i, C06H c06h) {
        z = (i & 4) != 0 ? true : z;
        z2 = (i & 8) != 0 ? true : z2;
        z3 = (i & 16) != 0 ? true : z3;
        z4 = (i & 32) != 0 ? true : z4;
        if ((i & 64) != 0) {
            Set set = HatchDisclosurePresentation.DRAWN;
            list = AnonymousClass002.A0m(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0r(list, it);
            }
        }
        if ((i & 128) != 0) {
            Set set2 = HatchDisclosurePresentation.DRAWN;
            list2 = AnonymousClass002.A0m(set2);
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                C3cJ.A0r(list2, it2);
            }
        }
        this(str, str2, z, z2, z3, z4, list, list2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4);
    }

    public /* synthetic */ AuthConfirmOtpRequestJson(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthConfirmOtpRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.auth_state = str;
        this.otp_code = str2;
        if ((i & 4) == 0) {
            this.supports_account_selection = true;
        } else {
            this.supports_account_selection = z;
        }
        if ((i & 8) == 0) {
            this.supports_muse_link_transparency = true;
        } else {
            this.supports_muse_link_transparency = z2;
        }
        if ((i & 16) == 0) {
            this.supports_reactivation = true;
        } else {
            this.supports_reactivation = z3;
        }
        if ((i & 32) == 0) {
            this.supports_inactive_account_labels = true;
        } else {
            this.supports_inactive_account_labels = z4;
        }
        if ((i & 64) == 0) {
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
        if ((i & 128) == 0) {
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
        if ((i & 256) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str3;
        }
        if ((i & 512) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str4;
        }
    }
}
