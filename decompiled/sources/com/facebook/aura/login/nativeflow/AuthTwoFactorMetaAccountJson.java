package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
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
public final class AuthTwoFactorMetaAccountJson extends C06G {
    public final String display_label;
    public final List<AuthSsoLinkedAccountJson> linked_accounts;
    public final String source_app;
    public final AuthTosJson tos;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, AuthTwoFactorMetaAccountJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<AuthTwoFactorMetaAccountJson> serializer() {
            return AuthTwoFactorMetaAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthTwoFactorMetaAccountJson(String str, String str2, List<AuthSsoLinkedAccountJson> list, AuthTosJson authTosJson) {
        C7384Etj.A0Y(list, 2);
        this.source_app = str;
        this.display_label = str2;
        this.linked_accounts = list;
        this.tos = authTosJson;
    }

    public final AuthTwoFactorMetaAccountJson copy(String str, String str2, List<AuthSsoLinkedAccountJson> list, AuthTosJson authTosJson) {
        C7384Etj.A0Y(list, 2);
        return new AuthTwoFactorMetaAccountJson(str, str2, list, authTosJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTwoFactorMetaAccountJson) {
                AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson = (AuthTwoFactorMetaAccountJson) obj;
                if (!C7384Etj.areEqual(this.source_app, authTwoFactorMetaAccountJson.source_app) || !C7384Etj.areEqual(this.display_label, authTwoFactorMetaAccountJson.display_label) || !C7384Etj.areEqual(this.linked_accounts, authTwoFactorMetaAccountJson.linked_accounts) || !C7384Etj.areEqual(this.tos, authTwoFactorMetaAccountJson.tos)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthTwoFactorMetaAccountJson copy$default(AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson, String str, String str2, List list, AuthTosJson authTosJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTwoFactorMetaAccountJson.source_app;
        }
        if ((i & 2) != 0) {
            str2 = authTwoFactorMetaAccountJson.display_label;
        }
        if ((i & 4) != 0) {
            list = authTwoFactorMetaAccountJson.linked_accounts;
        }
        if ((i & 8) != 0) {
            authTosJson = authTwoFactorMetaAccountJson.tos;
        }
        C7384Etj.A0Y(list, 2);
        return new AuthTwoFactorMetaAccountJson(str, str2, list, authTosJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || authTwoFactorMetaAccountJson.source_app != null) {
            c9j5.AAP(authTwoFactorMetaAccountJson.source_app, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || authTwoFactorMetaAccountJson.display_label != null) {
            c9j5.AAP(authTwoFactorMetaAccountJson.display_label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(authTwoFactorMetaAccountJson.linked_accounts)) {
            c9j5.AAQ(authTwoFactorMetaAccountJson.linked_accounts, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || authTwoFactorMetaAccountJson.tos != null) {
            c9j5.AAP(authTwoFactorMetaAccountJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.source_app;
    }

    public final String component2() {
        return this.display_label;
    }

    public final List<AuthSsoLinkedAccountJson> component3() {
        return this.linked_accounts;
    }

    public final AuthTosJson component4() {
        return this.tos;
    }

    public final String getDisplay_label() {
        return this.display_label;
    }

    public final List<AuthSsoLinkedAccountJson> getLinked_accounts() {
        return this.linked_accounts;
    }

    public final String getSource_app() {
        return this.source_app;
    }

    public final AuthTosJson getTos() {
        return this.tos;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.linked_accounts, ((AnonymousClass006.A0G(this.source_app) * 31) + AnonymousClass006.A0G(this.display_label)) * 31) + C3cH.A02(this.tos);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTwoFactorMetaAccountJson(int i, String str, String str2, List list, AuthTosJson authTosJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source_app = null;
        } else {
            this.source_app = str;
        }
        if ((i & 2) == 0) {
            this.display_label = null;
        } else {
            this.display_label = str2;
        }
        if ((i & 4) == 0) {
            this.linked_accounts = C0881AGi.A00;
        } else {
            this.linked_accounts = list;
        }
        if ((i & 8) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
        }
    }

    public /* synthetic */ AuthTwoFactorMetaAccountJson(String str, String str2, List list, AuthTosJson authTosJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, C3cI.A12(list, i), (i & 8) != 0 ? null : authTosJson);
    }

    public AuthTwoFactorMetaAccountJson() {
        this(null, null, C0881AGi.A00, null);
    }
}
