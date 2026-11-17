package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthSsoAccountInfoResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String landing_presentation;
    public final List<AuthSsoMetaAccountJson> meta_accounts;
    public final List<String> superseded_saved_account_ids;
    public final boolean suppress_tos_clause;
    public final AuthTosJson tos;
    public final String zari_candidate_ref;

    public final class Companion {
        public final C9hr<AuthSsoAccountInfoResponseJson> serializer() {
            return AuthSsoAccountInfoResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, AuthSsoAccountInfoResponseJson$Companion$$childSerializers$1.INSTANCE), null, null, AbstractC5321DgF.A02(num, AuthSsoAccountInfoResponseJson$Companion$$childSerializers$2.INSTANCE), null, null};
    }

    public AuthSsoAccountInfoResponseJson() {
        this(null, null, null, C0881AGi.A00, false, "");
    }

    public final AuthSsoAccountInfoResponseJson copy(List<AuthSsoMetaAccountJson> list, AuthTosJson authTosJson, String str, List<String> list2, boolean z, String str2) {
        AnonymousClass002.A1D(list2, 3, str2);
        return new AuthSsoAccountInfoResponseJson(list, authTosJson, str, list2, z, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSsoAccountInfoResponseJson) {
                AuthSsoAccountInfoResponseJson authSsoAccountInfoResponseJson = (AuthSsoAccountInfoResponseJson) obj;
                if (!C7384Etj.areEqual(this.meta_accounts, authSsoAccountInfoResponseJson.meta_accounts) || !C7384Etj.areEqual(this.tos, authSsoAccountInfoResponseJson.tos) || !C7384Etj.areEqual(this.zari_candidate_ref, authSsoAccountInfoResponseJson.zari_candidate_ref) || !C7384Etj.areEqual(this.superseded_saved_account_ids, authSsoAccountInfoResponseJson.superseded_saved_account_ids) || this.suppress_tos_clause != authSsoAccountInfoResponseJson.suppress_tos_clause || !C7384Etj.areEqual(this.landing_presentation, authSsoAccountInfoResponseJson.landing_presentation)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthSsoAccountInfoResponseJson copy$default(AuthSsoAccountInfoResponseJson authSsoAccountInfoResponseJson, List list, AuthTosJson authTosJson, String str, List list2, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = authSsoAccountInfoResponseJson.meta_accounts;
        }
        if ((i & 2) != 0) {
            authTosJson = authSsoAccountInfoResponseJson.tos;
        }
        if ((i & 4) != 0) {
            str = authSsoAccountInfoResponseJson.zari_candidate_ref;
        }
        if ((i & 8) != 0) {
            list2 = authSsoAccountInfoResponseJson.superseded_saved_account_ids;
        }
        if ((i & 16) != 0) {
            z = authSsoAccountInfoResponseJson.suppress_tos_clause;
        }
        if ((i & 32) != 0) {
            str2 = authSsoAccountInfoResponseJson.landing_presentation;
        }
        return authSsoAccountInfoResponseJson.copy(list, authTosJson, str, list2, z, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSsoAccountInfoResponseJson authSsoAccountInfoResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || authSsoAccountInfoResponseJson.meta_accounts != null) {
            c9j5.AAP(authSsoAccountInfoResponseJson.meta_accounts, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || authSsoAccountInfoResponseJson.tos != null) {
            c9j5.AAP(authSsoAccountInfoResponseJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || authSsoAccountInfoResponseJson.zari_candidate_ref != null) {
            c9j5.AAP(authSsoAccountInfoResponseJson.zari_candidate_ref, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(authSsoAccountInfoResponseJson.superseded_saved_account_ids)) {
            c9j5.AAQ(authSsoAccountInfoResponseJson.superseded_saved_account_ids, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || authSsoAccountInfoResponseJson.suppress_tos_clause) {
            c9j5.AA7(c9iZ, 4, authSsoAccountInfoResponseJson.suppress_tos_clause);
        }
        if (zAfR || !C3cH.A1Q(authSsoAccountInfoResponseJson.landing_presentation)) {
            c9j5.AAV(authSsoAccountInfoResponseJson.landing_presentation, c9iZ, 5);
        }
    }

    public final List<AuthSsoMetaAccountJson> component1() {
        return this.meta_accounts;
    }

    public final AuthTosJson component2() {
        return this.tos;
    }

    public final String component3() {
        return this.zari_candidate_ref;
    }

    public final List<String> component4() {
        return this.superseded_saved_account_ids;
    }

    public final boolean component5() {
        return this.suppress_tos_clause;
    }

    public final String component6() {
        return this.landing_presentation;
    }

    public final String getLanding_presentation() {
        return this.landing_presentation;
    }

    public final List<AuthSsoMetaAccountJson> getMeta_accounts() {
        return this.meta_accounts;
    }

    public final List<String> getSuperseded_saved_account_ids() {
        return this.superseded_saved_account_ids;
    }

    public final boolean getSuppress_tos_clause() {
        return this.suppress_tos_clause;
    }

    public final AuthTosJson getTos() {
        return this.tos;
    }

    public final String getZari_candidate_ref() {
        return this.zari_candidate_ref;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.landing_presentation, C0KA.A01(AnonymousClass005.A0F(this.superseded_saved_account_ids, ((((AnonymousClass006.A0D(this.meta_accounts) * 31) + AnonymousClass006.A0D(this.tos)) * 31) + AnonymousClass005.A0H(this.zari_candidate_ref)) * 31), this.suppress_tos_clause));
    }

    public String toString() {
        return super.toString();
    }

    public AuthSsoAccountInfoResponseJson(List<AuthSsoMetaAccountJson> list, AuthTosJson authTosJson, String str, List<String> list2, boolean z, String str2) {
        AnonymousClass002.A1D(list2, 3, str2);
        this.meta_accounts = list;
        this.tos = authTosJson;
        this.zari_candidate_ref = str;
        this.superseded_saved_account_ids = list2;
        this.suppress_tos_clause = z;
        this.landing_presentation = str2;
    }

    public /* synthetic */ AuthSsoAccountInfoResponseJson(List list, AuthTosJson authTosJson, String str, List list2, boolean z, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : authTosJson, (i & 4) != 0 ? null : str, (i & 8) != 0 ? C0881AGi.A00 : list2, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? "" : str2);
    }

    public /* synthetic */ AuthSsoAccountInfoResponseJson(int i, List list, AuthTosJson authTosJson, String str, List list2, boolean z, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.meta_accounts = null;
        } else {
            this.meta_accounts = list;
        }
        if ((i & 2) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
        }
        if ((i & 4) == 0) {
            this.zari_candidate_ref = null;
        } else {
            this.zari_candidate_ref = str;
        }
        if ((i & 8) == 0) {
            this.superseded_saved_account_ids = C0881AGi.A00;
        } else {
            this.superseded_saved_account_ids = list2;
        }
        if ((i & 16) == 0) {
            this.suppress_tos_clause = false;
        } else {
            this.suppress_tos_clause = z;
        }
        if ((i & 32) == 0) {
            this.landing_presentation = "";
        } else {
            this.landing_presentation = str2;
        }
    }
}
