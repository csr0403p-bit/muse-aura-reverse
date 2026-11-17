package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
public final class AuthSsoMetaAccountJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String disclosure_presentation;
    public final String display_label;
    public final boolean has_hatch;
    public final boolean has_meta_ai;
    public final boolean is_f3;
    public final List<AuthSsoLinkedAccountJson> linked_accounts;
    public final List<String> member_refs;
    public final AuthSsoMuseProfileJson muse_profile;
    public final boolean one_tap_login_eligible;
    public final String primary_ref;
    public final boolean show_muse_transparency;
    public final boolean supersedes_saved_account;

    public final class Companion {
        public final C9hr<AuthSsoMetaAccountJson> serializer() {
            return AuthSsoMetaAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, AuthSsoMetaAccountJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, AuthSsoMetaAccountJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSsoMetaAccountJson) {
                AuthSsoMetaAccountJson authSsoMetaAccountJson = (AuthSsoMetaAccountJson) obj;
                if (!C7384Etj.areEqual(this.primary_ref, authSsoMetaAccountJson.primary_ref) || !C7384Etj.areEqual(this.member_refs, authSsoMetaAccountJson.member_refs) || !C7384Etj.areEqual(this.display_label, authSsoMetaAccountJson.display_label) || !C7384Etj.areEqual(this.linked_accounts, authSsoMetaAccountJson.linked_accounts) || this.one_tap_login_eligible != authSsoMetaAccountJson.one_tap_login_eligible || this.has_hatch != authSsoMetaAccountJson.has_hatch || this.has_meta_ai != authSsoMetaAccountJson.has_meta_ai || this.is_f3 != authSsoMetaAccountJson.is_f3 || !C7384Etj.areEqual(this.muse_profile, authSsoMetaAccountJson.muse_profile) || this.show_muse_transparency != authSsoMetaAccountJson.show_muse_transparency || !C7384Etj.areEqual(this.disclosure_presentation, authSsoMetaAccountJson.disclosure_presentation) || this.supersedes_saved_account != authSsoMetaAccountJson.supersedes_saved_account) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthSsoMetaAccountJson copy$default(AuthSsoMetaAccountJson authSsoMetaAccountJson, String str, List list, String str2, List list2, boolean z, boolean z2, boolean z3, boolean z4, AuthSsoMuseProfileJson authSsoMuseProfileJson, boolean z5, String str3, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSsoMetaAccountJson.primary_ref;
        }
        if ((i & 2) != 0) {
            list = authSsoMetaAccountJson.member_refs;
        }
        if ((i & 4) != 0) {
            str2 = authSsoMetaAccountJson.display_label;
        }
        if ((i & 8) != 0) {
            list2 = authSsoMetaAccountJson.linked_accounts;
        }
        if ((i & 16) != 0) {
            z = authSsoMetaAccountJson.one_tap_login_eligible;
        }
        if ((i & 32) != 0) {
            z2 = authSsoMetaAccountJson.has_hatch;
        }
        if ((i & 64) != 0) {
            z3 = authSsoMetaAccountJson.has_meta_ai;
        }
        if ((i & 128) != 0) {
            z4 = authSsoMetaAccountJson.is_f3;
        }
        if ((i & 256) != 0) {
            authSsoMuseProfileJson = authSsoMetaAccountJson.muse_profile;
        }
        if ((i & 512) != 0) {
            z5 = authSsoMetaAccountJson.show_muse_transparency;
        }
        if ((i & 1024) != 0) {
            str3 = authSsoMetaAccountJson.disclosure_presentation;
        }
        if ((i & 2048) != 0) {
            z6 = authSsoMetaAccountJson.supersedes_saved_account;
        }
        return authSsoMetaAccountJson.copy(str, list, str2, list2, z, z2, z3, z4, authSsoMuseProfileJson, z5, str3, z6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSsoMetaAccountJson authSsoMetaAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authSsoMetaAccountJson.primary_ref)) {
            c9j5.AAV(authSsoMetaAccountJson.primary_ref, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(authSsoMetaAccountJson.member_refs)) {
            c9j5.AAQ(authSsoMetaAccountJson.member_refs, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !"".equals(authSsoMetaAccountJson.display_label)) {
            c9j5.AAV(authSsoMetaAccountJson.display_label, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(authSsoMetaAccountJson.linked_accounts)) {
            c9j5.AAQ(authSsoMetaAccountJson.linked_accounts, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || authSsoMetaAccountJson.one_tap_login_eligible) {
            c9j5.AA7(c9iZ, 4, authSsoMetaAccountJson.one_tap_login_eligible);
        }
        if (zAfR || authSsoMetaAccountJson.has_hatch) {
            c9j5.AA7(c9iZ, 5, authSsoMetaAccountJson.has_hatch);
        }
        if (zAfR || authSsoMetaAccountJson.has_meta_ai) {
            c9j5.AA7(c9iZ, 6, authSsoMetaAccountJson.has_meta_ai);
        }
        if (zAfR || authSsoMetaAccountJson.is_f3) {
            c9j5.AA7(c9iZ, 7, authSsoMetaAccountJson.is_f3);
        }
        if (zAfR || authSsoMetaAccountJson.muse_profile != null) {
            c9j5.AAP(authSsoMetaAccountJson.muse_profile, AuthSsoMuseProfileJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || authSsoMetaAccountJson.show_muse_transparency) {
            c9j5.AA7(c9iZ, 9, authSsoMetaAccountJson.show_muse_transparency);
        }
        if (zAfR || !"".equals(authSsoMetaAccountJson.disclosure_presentation)) {
            c9j5.AAV(authSsoMetaAccountJson.disclosure_presentation, c9iZ, 10);
        }
        if (zAfR || authSsoMetaAccountJson.supersedes_saved_account) {
            c9j5.AA7(c9iZ, 11, authSsoMetaAccountJson.supersedes_saved_account);
        }
    }

    public final String component1() {
        return this.primary_ref;
    }

    public final boolean component10() {
        return this.show_muse_transparency;
    }

    public final String component11() {
        return this.disclosure_presentation;
    }

    public final boolean component12() {
        return this.supersedes_saved_account;
    }

    public final List<String> component2() {
        return this.member_refs;
    }

    public final String component3() {
        return this.display_label;
    }

    public final List<AuthSsoLinkedAccountJson> component4() {
        return this.linked_accounts;
    }

    public final boolean component5() {
        return this.one_tap_login_eligible;
    }

    public final boolean component6() {
        return this.has_hatch;
    }

    public final boolean component7() {
        return this.has_meta_ai;
    }

    public final boolean component8() {
        return this.is_f3;
    }

    public final AuthSsoMuseProfileJson component9() {
        return this.muse_profile;
    }

    public final String getDisclosure_presentation() {
        return this.disclosure_presentation;
    }

    public final String getDisplay_label() {
        return this.display_label;
    }

    public final boolean getHas_hatch() {
        return this.has_hatch;
    }

    public final boolean getHas_meta_ai() {
        return this.has_meta_ai;
    }

    public final List<AuthSsoLinkedAccountJson> getLinked_accounts() {
        return this.linked_accounts;
    }

    public final List<String> getMember_refs() {
        return this.member_refs;
    }

    public final AuthSsoMuseProfileJson getMuse_profile() {
        return this.muse_profile;
    }

    public final boolean getOne_tap_login_eligible() {
        return this.one_tap_login_eligible;
    }

    public final String getPrimary_ref() {
        return this.primary_ref;
    }

    public final boolean getShow_muse_transparency() {
        return this.show_muse_transparency;
    }

    public final boolean getSupersedes_saved_account() {
        return this.supersedes_saved_account;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.disclosure_presentation, C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.linked_accounts, AnonymousClass005.A0I(this.display_label, AnonymousClass005.A0F(this.member_refs, AnonymousClass001.A0G(this.primary_ref)))), this.one_tap_login_eligible), this.has_hatch), this.has_meta_ai), this.is_f3) + AnonymousClass006.A0D(this.muse_profile)) * 31, this.show_muse_transparency)), this.supersedes_saved_account);
    }

    public final boolean is_f3() {
        return this.is_f3;
    }

    public AuthSsoMetaAccountJson(String str, List<String> list, String str2, List<AuthSsoLinkedAccountJson> list2, boolean z, boolean z2, boolean z3, boolean z4, AuthSsoMuseProfileJson authSsoMuseProfileJson, boolean z5, String str3, boolean z6) {
        AnonymousClass005.A14(str, list, str2, list2);
        C7384Etj.A0Y(str3, 10);
        this.primary_ref = str;
        this.member_refs = list;
        this.display_label = str2;
        this.linked_accounts = list2;
        this.one_tap_login_eligible = z;
        this.has_hatch = z2;
        this.has_meta_ai = z3;
        this.is_f3 = z4;
        this.muse_profile = authSsoMuseProfileJson;
        this.show_muse_transparency = z5;
        this.disclosure_presentation = str3;
        this.supersedes_saved_account = z6;
    }

    public final AuthSsoMetaAccountJson copy(String str, List<String> list, String str2, List<AuthSsoLinkedAccountJson> list2, boolean z, boolean z2, boolean z3, boolean z4, AuthSsoMuseProfileJson authSsoMuseProfileJson, boolean z5, String str3, boolean z6) {
        AnonymousClass005.A14(str, list, str2, list2);
        C7384Etj.A0Y(str3, 10);
        return new AuthSsoMetaAccountJson(str, list, str2, list2, z, z2, z3, z4, authSsoMuseProfileJson, z5, str3, z6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSsoMetaAccountJson(String str, List list, String str2, List list2, boolean z, boolean z2, boolean z3, boolean z4, AuthSsoMuseProfileJson authSsoMuseProfileJson, boolean z5, String str3, boolean z6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C0881AGi.A00 : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? C0881AGi.A00 : list2, C3cI.A1S(i, z), AnonymousClass002.A1R(i, z2), C3cH.A1M(i, z3), C3cH.A1N(i, z4), (i & 256) != 0 ? null : authSsoMuseProfileJson, C3cG.A1K(i & 512, z5), (i & 1024) == 0 ? str3 : "", C3cG.A1K(i & 2048, z6));
    }

    public /* synthetic */ AuthSsoMetaAccountJson(int i, String str, List list, String str2, List list2, boolean z, boolean z2, boolean z3, boolean z4, AuthSsoMuseProfileJson authSsoMuseProfileJson, boolean z5, String str3, boolean z6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.primary_ref = "";
        } else {
            this.primary_ref = str;
        }
        if ((i & 2) == 0) {
            this.member_refs = C0881AGi.A00;
        } else {
            this.member_refs = list;
        }
        if ((i & 4) == 0) {
            this.display_label = "";
        } else {
            this.display_label = str2;
        }
        if ((i & 8) == 0) {
            this.linked_accounts = C0881AGi.A00;
        } else {
            this.linked_accounts = list2;
        }
        if ((i & 16) == 0) {
            this.one_tap_login_eligible = false;
        } else {
            this.one_tap_login_eligible = z;
        }
        if ((i & 32) == 0) {
            this.has_hatch = false;
        } else {
            this.has_hatch = z2;
        }
        if ((i & 64) == 0) {
            this.has_meta_ai = false;
        } else {
            this.has_meta_ai = z3;
        }
        if ((i & 128) == 0) {
            this.is_f3 = false;
        } else {
            this.is_f3 = z4;
        }
        if ((i & 256) == 0) {
            this.muse_profile = null;
        } else {
            this.muse_profile = authSsoMuseProfileJson;
        }
        if ((i & 512) == 0) {
            this.show_muse_transparency = false;
        } else {
            this.show_muse_transparency = z5;
        }
        if ((i & 1024) == 0) {
            this.disclosure_presentation = "";
        } else {
            this.disclosure_presentation = str3;
        }
        if ((i & 2048) == 0) {
            this.supersedes_saved_account = false;
        } else {
            this.supersedes_saved_account = z6;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthSsoMetaAccountJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", c0881AGi, "", c0881AGi, false, false, false, false, null, false, "", false);
    }
}
