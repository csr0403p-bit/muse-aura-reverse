package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
public final class AuthTosJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<AuthTosRunJson> clause;
    public final String content_version;
    public final List<AuthTosGroupJson> groups;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C9hr<AuthTosJson> serializer() {
            return AuthTosJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, AuthTosJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, AuthTosJson$Companion$$childSerializers$2.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTosJson) {
                AuthTosJson authTosJson = (AuthTosJson) obj;
                if (!C7384Etj.areEqual(this.clause, authTosJson.clause) || !C7384Etj.areEqual(this.groups, authTosJson.groups) || !C7384Etj.areEqual(this.content_version, authTosJson.content_version)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthTosJson copy$default(AuthTosJson authTosJson, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = authTosJson.clause;
        }
        if ((i & 2) != 0) {
            list2 = authTosJson.groups;
        }
        if ((i & 4) != 0) {
            str = authTosJson.content_version;
        }
        return authTosJson.copy(list, list2, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTosJson authTosJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(authTosJson.clause, C0881AGi.A00)) {
            c9j5.AAQ(authTosJson.clause, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(authTosJson.groups, C0881AGi.A00)) {
            c9j5.AAQ(authTosJson.groups, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !"".equals(authTosJson.content_version)) {
            c9j5.AAV(authTosJson.content_version, c9iZ, 2);
        }
    }

    public final List<AuthTosRunJson> component1() {
        return this.clause;
    }

    public final List<AuthTosGroupJson> component2() {
        return this.groups;
    }

    public final String component3() {
        return this.content_version;
    }

    public final List<AuthTosRunJson> getClause() {
        return this.clause;
    }

    public final String getContent_version() {
        return this.content_version;
    }

    public final List<AuthTosGroupJson> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.content_version, AnonymousClass005.A0F(this.groups, AnonymousClass005.A0E(this.clause)));
    }

    public AuthTosJson(List<AuthTosRunJson> list, List<AuthTosGroupJson> list2, String str) {
        AnonymousClass005.A0x(list, list2, str);
        this.clause = list;
        this.groups = list2;
        this.content_version = str;
    }

    public final AuthTosJson copy(List<AuthTosRunJson> list, List<AuthTosGroupJson> list2, String str) {
        AnonymousClass005.A0x(list, list2, str);
        return new AuthTosJson(list, list2, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTosJson(List list, List list2, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list, (i & 2) != 0 ? C0881AGi.A00 : list2, (i & 4) != 0 ? "" : str);
    }

    public /* synthetic */ AuthTosJson(int i, List list, List list2, String str, C2hx c2hx) {
        this.clause = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.groups = C0881AGi.A00;
        } else {
            this.groups = list2;
        }
        if ((i & 4) == 0) {
            this.content_version = "";
        } else {
            this.content_version = str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthTosJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, "");
    }
}
