package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C06H;
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
public final class AuthSavedAccountsResponseJson extends C06G {
    public final List<AuthSavedAccountJson> saved_accounts;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, AuthSavedAccountsResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AuthSavedAccountsResponseJson> serializer() {
            return AuthSavedAccountsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AuthSavedAccountsResponseJson copy(List<AuthSavedAccountJson> list) {
        C7384Etj.A0Y(list, 0);
        return new AuthSavedAccountsResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuthSavedAccountsResponseJson) && C7384Etj.areEqual(this.saved_accounts, ((AuthSavedAccountsResponseJson) obj).saved_accounts));
    }

    public static /* synthetic */ AuthSavedAccountsResponseJson copy$default(AuthSavedAccountsResponseJson authSavedAccountsResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = authSavedAccountsResponseJson.saved_accounts;
        }
        C7384Etj.A0Y(list, 0);
        return new AuthSavedAccountsResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSavedAccountsResponseJson authSavedAccountsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(authSavedAccountsResponseJson.saved_accounts)) {
            c9j5.AAQ(authSavedAccountsResponseJson.saved_accounts, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<AuthSavedAccountJson> component1() {
        return this.saved_accounts;
    }

    public final List<AuthSavedAccountJson> getSaved_accounts() {
        return this.saved_accounts;
    }

    public int hashCode() {
        return this.saved_accounts.hashCode();
    }

    public /* synthetic */ AuthSavedAccountsResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.saved_accounts = C0881AGi.A00;
        } else {
            this.saved_accounts = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AuthSavedAccountsResponseJson(List<AuthSavedAccountJson> list) {
        C7384Etj.A0Y(list, 0);
        this.saved_accounts = list;
    }

    public /* synthetic */ AuthSavedAccountsResponseJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public AuthSavedAccountsResponseJson() {
        this(C0881AGi.A00);
    }
}
