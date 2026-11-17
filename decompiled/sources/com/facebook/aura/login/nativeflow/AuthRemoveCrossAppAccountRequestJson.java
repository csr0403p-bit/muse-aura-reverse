package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthRemoveCrossAppAccountRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final AuthSsoAccountInfoEntryJson account;
    public final String aymh_device_id;

    public final class Companion {
        public final C9hr<AuthRemoveCrossAppAccountRequestJson> serializer() {
            return AuthRemoveCrossAppAccountRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthRemoveCrossAppAccountRequestJson) {
                AuthRemoveCrossAppAccountRequestJson authRemoveCrossAppAccountRequestJson = (AuthRemoveCrossAppAccountRequestJson) obj;
                if (!C7384Etj.areEqual(this.account, authRemoveCrossAppAccountRequestJson.account) || !C7384Etj.areEqual(this.aymh_device_id, authRemoveCrossAppAccountRequestJson.aymh_device_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthRemoveCrossAppAccountRequestJson copy$default(AuthRemoveCrossAppAccountRequestJson authRemoveCrossAppAccountRequestJson, AuthSsoAccountInfoEntryJson authSsoAccountInfoEntryJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            authSsoAccountInfoEntryJson = authRemoveCrossAppAccountRequestJson.account;
        }
        if ((i & 2) != 0) {
            str = authRemoveCrossAppAccountRequestJson.aymh_device_id;
        }
        AnonymousClass003.A0u(authSsoAccountInfoEntryJson, str);
        return new AuthRemoveCrossAppAccountRequestJson(authSsoAccountInfoEntryJson, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthRemoveCrossAppAccountRequestJson authRemoveCrossAppAccountRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(authRemoveCrossAppAccountRequestJson.account, AuthSsoAccountInfoEntryJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAV(authRemoveCrossAppAccountRequestJson.aymh_device_id, c9iZ, 1);
    }

    public final AuthSsoAccountInfoEntryJson component1() {
        return this.account;
    }

    public final String component2() {
        return this.aymh_device_id;
    }

    public final AuthSsoAccountInfoEntryJson getAccount() {
        return this.account;
    }

    public final String getAymh_device_id() {
        return this.aymh_device_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.aymh_device_id, AnonymousClass005.A0E(this.account));
    }

    public AuthRemoveCrossAppAccountRequestJson(AuthSsoAccountInfoEntryJson authSsoAccountInfoEntryJson, String str) {
        AnonymousClass003.A0u(authSsoAccountInfoEntryJson, str);
        this.account = authSsoAccountInfoEntryJson;
        this.aymh_device_id = str;
    }

    public final AuthRemoveCrossAppAccountRequestJson copy(AuthSsoAccountInfoEntryJson authSsoAccountInfoEntryJson, String str) {
        AnonymousClass003.A0u(authSsoAccountInfoEntryJson, str);
        return new AuthRemoveCrossAppAccountRequestJson(authSsoAccountInfoEntryJson, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthRemoveCrossAppAccountRequestJson(int i, AuthSsoAccountInfoEntryJson authSsoAccountInfoEntryJson, String str, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthRemoveCrossAppAccountRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.account = authSsoAccountInfoEntryJson;
        this.aymh_device_id = str;
    }
}
