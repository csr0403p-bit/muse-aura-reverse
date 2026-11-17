package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
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
public final class AuthTosVariantJson extends C06G {
    public final String body;
    public final List<AuthTosBodyRunJson> body_runs;
    public final boolean is_f3;
    public final String source_app;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, AuthTosVariantJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<AuthTosVariantJson> serializer() {
            return AuthTosVariantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthTosVariantJson(boolean z, String str, String str2, String str3, List<AuthTosBodyRunJson> list) {
        AnonymousClass005.A12(str2, str3, list, 2);
        this.is_f3 = z;
        this.source_app = str;
        this.title = str2;
        this.body = str3;
        this.body_runs = list;
    }

    public final AuthTosVariantJson copy(boolean z, String str, String str2, String str3, List<AuthTosBodyRunJson> list) {
        AnonymousClass005.A12(str2, str3, list, 2);
        return new AuthTosVariantJson(z, str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTosVariantJson) {
                AuthTosVariantJson authTosVariantJson = (AuthTosVariantJson) obj;
                if (this.is_f3 != authTosVariantJson.is_f3 || !C7384Etj.areEqual(this.source_app, authTosVariantJson.source_app) || !C7384Etj.areEqual(this.title, authTosVariantJson.title) || !C7384Etj.areEqual(this.body, authTosVariantJson.body) || !C7384Etj.areEqual(this.body_runs, authTosVariantJson.body_runs)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthTosVariantJson copy$default(AuthTosVariantJson authTosVariantJson, boolean z, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authTosVariantJson.is_f3;
        }
        if ((i & 2) != 0) {
            str = authTosVariantJson.source_app;
        }
        if ((i & 4) != 0) {
            str2 = authTosVariantJson.title;
        }
        if ((i & 8) != 0) {
            str3 = authTosVariantJson.body;
        }
        if ((i & 16) != 0) {
            list = authTosVariantJson.body_runs;
        }
        return authTosVariantJson.copy(z, str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTosVariantJson authTosVariantJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || authTosVariantJson.is_f3) {
            c9j5.AA7(c9iZ, 0, authTosVariantJson.is_f3);
        }
        if (zAfR || authTosVariantJson.source_app != null) {
            c9j5.AAP(authTosVariantJson.source_app, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(authTosVariantJson.title)) {
            c9j5.AAV(authTosVariantJson.title, c9iZ, 2);
        }
        if (zAfR || !"".equals(authTosVariantJson.body)) {
            c9j5.AAV(authTosVariantJson.body, c9iZ, 3);
        }
        if (zAfR || !C7384Etj.areEqual(authTosVariantJson.body_runs, C0881AGi.A00)) {
            c9j5.AAQ(authTosVariantJson.body_runs, C06G.A0e(f0cArr, 4), c9iZ, 4);
        }
    }

    public final boolean component1() {
        return this.is_f3;
    }

    public final String component2() {
        return this.source_app;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.body;
    }

    public final List<AuthTosBodyRunJson> component5() {
        return this.body_runs;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<AuthTosBodyRunJson> getBody_runs() {
        return this.body_runs;
    }

    public final String getSource_app() {
        return this.source_app;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.body_runs, AnonymousClass005.A0I(this.body, AnonymousClass005.A0I(this.title, (C0KA.A02(this.is_f3) + AnonymousClass006.A0G(this.source_app)) * 31)));
    }

    public final boolean is_f3() {
        return this.is_f3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTosVariantJson(boolean z, String str, String str2, String str3, List list, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass006.A0s(i, str), (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ AuthTosVariantJson(int i, boolean z, String str, String str2, String str3, List list, C2hx c2hx) {
        this.is_f3 = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.source_app = null;
        } else {
            this.source_app = str;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.body = "";
        } else {
            this.body = str3;
        }
        if ((i & 16) == 0) {
            this.body_runs = C0881AGi.A00;
        } else {
            this.body_runs = list;
        }
    }

    public AuthTosVariantJson() {
        this(false, null, "", "", C0881AGi.A00);
    }
}
