package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class NdaAgreementResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String agreement_status;
    public final String company_name;
    public final String email;
    public final String mode;
    public final String name;
    public final String recipient_view_id;
    public final NdaTermJson term;

    public final class Companion {
        public final C9hr<NdaAgreementResponseJson> serializer() {
            return NdaAgreementResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NdaAgreementResponseJson() {
        this("", "", "", null, null, null, null);
    }

    public static /* synthetic */ NdaAgreementResponseJson copy$default(NdaAgreementResponseJson ndaAgreementResponseJson, String str, String str2, String str3, NdaTermJson ndaTermJson, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        NdaTermJson ndaTermJson2 = ndaTermJson;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = ndaAgreementResponseJson.recipient_view_id;
        }
        if ((i & 2) != 0) {
            str8 = ndaAgreementResponseJson.agreement_status;
        }
        if ((i & 4) != 0) {
            str9 = ndaAgreementResponseJson.mode;
        }
        if ((i & 8) != 0) {
            ndaTermJson2 = ndaAgreementResponseJson.term;
        }
        if ((i & 16) != 0) {
            str10 = ndaAgreementResponseJson.company_name;
        }
        if ((i & 32) != 0) {
            str11 = ndaAgreementResponseJson.name;
        }
        if ((i & 64) != 0) {
            str12 = ndaAgreementResponseJson.email;
        }
        AnonymousClass005.A0x(str7, str8, str9);
        return new NdaAgreementResponseJson(str7, str8, str9, ndaTermJson2, str10, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(NdaAgreementResponseJson ndaAgreementResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ndaAgreementResponseJson.recipient_view_id)) {
            c9j5.AAV(ndaAgreementResponseJson.recipient_view_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(ndaAgreementResponseJson.agreement_status)) {
            c9j5.AAV(ndaAgreementResponseJson.agreement_status, c9iZ, 1);
        }
        if (zAfR || !"".equals(ndaAgreementResponseJson.mode)) {
            c9j5.AAV(ndaAgreementResponseJson.mode, c9iZ, 2);
        }
        if (zAfR || ndaAgreementResponseJson.term != null) {
            c9j5.AAP(ndaAgreementResponseJson.term, NdaTermJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || ndaAgreementResponseJson.company_name != null) {
            c9j5.AAP(ndaAgreementResponseJson.company_name, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || ndaAgreementResponseJson.name != null) {
            c9j5.AAP(ndaAgreementResponseJson.name, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || ndaAgreementResponseJson.email != null) {
            c9j5.AAP(ndaAgreementResponseJson.email, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NdaAgreementResponseJson) {
                NdaAgreementResponseJson ndaAgreementResponseJson = (NdaAgreementResponseJson) obj;
                if (!C7384Etj.areEqual(this.recipient_view_id, ndaAgreementResponseJson.recipient_view_id) || !C7384Etj.areEqual(this.agreement_status, ndaAgreementResponseJson.agreement_status) || !C7384Etj.areEqual(this.mode, ndaAgreementResponseJson.mode) || !C7384Etj.areEqual(this.term, ndaAgreementResponseJson.term) || !C7384Etj.areEqual(this.company_name, ndaAgreementResponseJson.company_name) || !C7384Etj.areEqual(this.name, ndaAgreementResponseJson.name) || !C7384Etj.areEqual(this.email, ndaAgreementResponseJson.email)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.recipient_view_id;
    }

    public final String component2() {
        return this.agreement_status;
    }

    public final String component3() {
        return this.mode;
    }

    public final NdaTermJson component4() {
        return this.term;
    }

    public final String component5() {
        return this.company_name;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.email;
    }

    public final String getAgreement_status() {
        return this.agreement_status;
    }

    public final String getCompany_name() {
        return this.company_name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRecipient_view_id() {
        return this.recipient_view_id;
    }

    public final NdaTermJson getTerm() {
        return this.term;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.mode, AnonymousClass005.A0I(this.agreement_status, AnonymousClass001.A0G(this.recipient_view_id))) + AnonymousClass006.A0D(this.term)) * 31) + AnonymousClass006.A0G(this.company_name)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass005.A0H(this.email);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[PHI: r4
  0x0016: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:7:0x0010, B:9:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[PHI: r4
  0x0012: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:7:0x0010, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.activation.data.HatchNdaAgreement toDomain() {
        /*
            r8 = this;
            java.lang.String r1 = r8.recipient_view_id
            java.lang.String r2 = r8.agreement_status
            java.lang.String r3 = r8.mode
            com.facebook.aura.activation.repo.NdaTermJson r0 = r8.term
            if (r0 == 0) goto Le
            java.lang.String r4 = r0.text
            if (r4 != 0) goto L12
        Le:
            java.lang.String r4 = ""
            if (r0 == 0) goto L16
        L12:
            java.util.List<java.lang.String> r5 = r0.required_fields
            if (r5 != 0) goto L18
        L16:
            X.AGi r5 = X.C0881AGi.A00
        L18:
            java.lang.String r6 = r8.name
            java.lang.String r7 = r8.email
            java.lang.String r8 = r8.company_name
            com.facebook.aura.activation.data.HatchNdaAgreement r0 = new com.facebook.aura.activation.data.HatchNdaAgreement
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.NdaAgreementResponseJson.toDomain():com.facebook.aura.activation.data.HatchNdaAgreement");
    }

    public final NdaAgreementResponseJson copy(String str, String str2, String str3, NdaTermJson ndaTermJson, String str4, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, str3);
        return new NdaAgreementResponseJson(str, str2, str3, ndaTermJson, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NdaAgreementResponseJson(int i, String str, String str2, String str3, NdaTermJson ndaTermJson, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.recipient_view_id = "";
        } else {
            this.recipient_view_id = str;
        }
        if ((i & 2) == 0) {
            this.agreement_status = "";
        } else {
            this.agreement_status = str2;
        }
        if ((i & 4) == 0) {
            this.mode = "";
        } else {
            this.mode = str3;
        }
        if ((i & 8) == 0) {
            this.term = null;
        } else {
            this.term = ndaTermJson;
        }
        if ((i & 16) == 0) {
            this.company_name = null;
        } else {
            this.company_name = str4;
        }
        if ((i & 32) == 0) {
            this.name = null;
        } else {
            this.name = str5;
        }
        if ((i & 64) == 0) {
            this.email = null;
        } else {
            this.email = str6;
        }
    }

    public NdaAgreementResponseJson(String str, String str2, String str3, NdaTermJson ndaTermJson, String str4, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, str3);
        this.recipient_view_id = str;
        this.agreement_status = str2;
        this.mode = str3;
        this.term = ndaTermJson;
        this.company_name = str4;
        this.name = str5;
        this.email = str6;
    }

    public /* synthetic */ NdaAgreementResponseJson(String str, String str2, String str3, NdaTermJson ndaTermJson, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : ndaTermJson, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
