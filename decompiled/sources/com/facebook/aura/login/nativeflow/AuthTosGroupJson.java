package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class AuthTosGroupJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String body;
    public final List<AuthTosBodyRunJson> body_runs;
    public final String confirm_label;
    public final String decline_label;
    public final List<AuthTosDocumentJson> documents;
    public final String kind;
    public final String page_title;
    public final String subtitle;
    public final String title;
    public final String token;
    public final String url;
    public final List<AuthTosVariantJson> variants;

    public final class Companion {
        public final C9hr<AuthTosGroupJson> serializer() {
            return AuthTosGroupJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, AbstractC5321DgF.A02(num, AuthTosGroupJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, AuthTosGroupJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, AuthTosGroupJson$Companion$$childSerializers$3.INSTANCE), null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthTosGroupJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", "", null, null, null, c0881AGi, null, c0881AGi, c0881AGi, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTosGroupJson) {
                AuthTosGroupJson authTosGroupJson = (AuthTosGroupJson) obj;
                if (!C7384Etj.areEqual(this.token, authTosGroupJson.token) || !C7384Etj.areEqual(this.kind, authTosGroupJson.kind) || !C7384Etj.areEqual(this.title, authTosGroupJson.title) || !C7384Etj.areEqual(this.subtitle, authTosGroupJson.subtitle) || !C7384Etj.areEqual(this.body, authTosGroupJson.body) || !C7384Etj.areEqual(this.documents, authTosGroupJson.documents) || !C7384Etj.areEqual(this.url, authTosGroupJson.url) || !C7384Etj.areEqual(this.variants, authTosGroupJson.variants) || !C7384Etj.areEqual(this.body_runs, authTosGroupJson.body_runs) || !C7384Etj.areEqual(this.page_title, authTosGroupJson.page_title) || !C7384Etj.areEqual(this.confirm_label, authTosGroupJson.confirm_label) || !C7384Etj.areEqual(this.decline_label, authTosGroupJson.decline_label)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthTosGroupJson copy$default(AuthTosGroupJson authTosGroupJson, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTosGroupJson.token;
        }
        if ((i & 2) != 0) {
            str2 = authTosGroupJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = authTosGroupJson.title;
        }
        if ((i & 8) != 0) {
            str4 = authTosGroupJson.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = authTosGroupJson.body;
        }
        if ((i & 32) != 0) {
            list = authTosGroupJson.documents;
        }
        if ((i & 64) != 0) {
            str6 = authTosGroupJson.url;
        }
        if ((i & 128) != 0) {
            list2 = authTosGroupJson.variants;
        }
        if ((i & 256) != 0) {
            list3 = authTosGroupJson.body_runs;
        }
        if ((i & 512) != 0) {
            str7 = authTosGroupJson.page_title;
        }
        if ((i & 1024) != 0) {
            str8 = authTosGroupJson.confirm_label;
        }
        if ((i & 2048) != 0) {
            str9 = authTosGroupJson.decline_label;
        }
        return authTosGroupJson.copy(str, str2, str3, str4, str5, list, str6, list2, list3, str7, str8, str9);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTosGroupJson authTosGroupJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authTosGroupJson.token)) {
            c9j5.AAV(authTosGroupJson.token, c9iZ, 0);
        }
        if (zAfR || !"".equals(authTosGroupJson.kind)) {
            c9j5.AAV(authTosGroupJson.kind, c9iZ, 1);
        }
        if (zAfR || authTosGroupJson.title != null) {
            c9j5.AAP(authTosGroupJson.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || authTosGroupJson.subtitle != null) {
            c9j5.AAP(authTosGroupJson.subtitle, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || authTosGroupJson.body != null) {
            c9j5.AAP(authTosGroupJson.body, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !C7384Etj.areEqual(authTosGroupJson.documents, C0881AGi.A00)) {
            c9j5.AAQ(authTosGroupJson.documents, C06G.A0e(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || authTosGroupJson.url != null) {
            c9j5.AAP(authTosGroupJson.url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || !C7384Etj.areEqual(authTosGroupJson.variants, C0881AGi.A00)) {
            c9j5.AAQ(authTosGroupJson.variants, C06G.A0e(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || !C7384Etj.areEqual(authTosGroupJson.body_runs, C0881AGi.A00)) {
            c9j5.AAQ(authTosGroupJson.body_runs, C06G.A0e(f0cArr, 8), c9iZ, 8);
        }
        if (zAfR || authTosGroupJson.page_title != null) {
            c9j5.AAP(authTosGroupJson.page_title, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || authTosGroupJson.confirm_label != null) {
            c9j5.AAP(authTosGroupJson.confirm_label, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || authTosGroupJson.decline_label != null) {
            c9j5.AAP(authTosGroupJson.decline_label, C07779iq.A01, c9iZ, 11);
        }
    }

    public final String component1() {
        return this.token;
    }

    public final String component10() {
        return this.page_title;
    }

    public final String component11() {
        return this.confirm_label;
    }

    public final String component12() {
        return this.decline_label;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.body;
    }

    public final List<AuthTosDocumentJson> component6() {
        return this.documents;
    }

    public final String component7() {
        return this.url;
    }

    public final List<AuthTosVariantJson> component8() {
        return this.variants;
    }

    public final List<AuthTosBodyRunJson> component9() {
        return this.body_runs;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<AuthTosBodyRunJson> getBody_runs() {
        return this.body_runs;
    }

    public final String getConfirm_label() {
        return this.confirm_label;
    }

    public final String getDecline_label() {
        return this.decline_label;
    }

    public final List<AuthTosDocumentJson> getDocuments() {
        return this.documents;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPage_title() {
        return this.page_title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List<AuthTosVariantJson> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.body_runs, AnonymousClass005.A0F(this.variants, (AnonymousClass005.A0F(this.documents, (((((AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.token)) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.body)) * 31) + AnonymousClass006.A0G(this.url)) * 31)) + AnonymousClass006.A0G(this.page_title)) * 31) + AnonymousClass006.A0G(this.confirm_label)) * 31) + AnonymousClass005.A0H(this.decline_label);
    }

    public final AuthTosGroupJson copy(String str, String str2, String str3, String str4, String str5, List<AuthTosDocumentJson> list, String str6, List<AuthTosVariantJson> list2, List<AuthTosBodyRunJson> list3, String str7, String str8, String str9) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass005.A13(list, list2, list3, 5);
        return new AuthTosGroupJson(str, str2, str3, str4, str5, list, str6, list2, list3, str7, str8, str9);
    }

    public String toString() {
        return super.toString();
    }

    public AuthTosGroupJson(String str, String str2, String str3, String str4, String str5, List<AuthTosDocumentJson> list, String str6, List<AuthTosVariantJson> list2, List<AuthTosBodyRunJson> list3, String str7, String str8, String str9) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass005.A13(list, list2, list3, 5);
        this.token = str;
        this.kind = str2;
        this.title = str3;
        this.subtitle = str4;
        this.body = str5;
        this.documents = list;
        this.url = str6;
        this.variants = list2;
        this.body_runs = list3;
        this.page_title = str7;
        this.confirm_label = str8;
        this.decline_label = str9;
    }

    public /* synthetic */ AuthTosGroupJson(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, String str8, String str9, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.token = "";
        } else {
            this.token = str;
        }
        if ((i & 2) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        if ((i & 16) == 0) {
            this.body = null;
        } else {
            this.body = str5;
        }
        if ((i & 32) == 0) {
            this.documents = C0881AGi.A00;
        } else {
            this.documents = list;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str6;
        }
        if ((i & 128) == 0) {
            this.variants = C0881AGi.A00;
        } else {
            this.variants = list2;
        }
        if ((i & 256) == 0) {
            this.body_runs = C0881AGi.A00;
        } else {
            this.body_runs = list3;
        }
        if ((i & 512) == 0) {
            this.page_title = null;
        } else {
            this.page_title = str7;
        }
        if ((i & 1024) == 0) {
            this.confirm_label = null;
        } else {
            this.confirm_label = str8;
        }
        if ((i & 2048) == 0) {
            this.decline_label = null;
        } else {
            this.decline_label = str9;
        }
    }

    public /* synthetic */ AuthTosGroupJson(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, List list3, String str7, String str8, String str9, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? C0881AGi.A00 : list, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? C0881AGi.A00 : list2, (i & 256) != 0 ? C0881AGi.A00 : list3, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9);
    }
}
