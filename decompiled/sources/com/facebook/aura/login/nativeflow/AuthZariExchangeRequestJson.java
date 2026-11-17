package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthZariExchangeRequestJson extends C06G {
    public final List<AuthSsoAccountInfoEntryJson> accounts;
    public final String device_id;
    public final String waterfall_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, AuthZariExchangeRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AuthZariExchangeRequestJson> serializer() {
            return AuthZariExchangeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthZariExchangeRequestJson(List<AuthSsoAccountInfoEntryJson> list, String str, String str2) {
        C7384Etj.A0Y(list, 0);
        this.accounts = list;
        this.device_id = str;
        this.waterfall_id = str2;
    }

    public final AuthZariExchangeRequestJson copy(List<AuthSsoAccountInfoEntryJson> list, String str, String str2) {
        C7384Etj.A0Y(list, 0);
        return new AuthZariExchangeRequestJson(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthZariExchangeRequestJson) {
                AuthZariExchangeRequestJson authZariExchangeRequestJson = (AuthZariExchangeRequestJson) obj;
                if (!C7384Etj.areEqual(this.accounts, authZariExchangeRequestJson.accounts) || !C7384Etj.areEqual(this.device_id, authZariExchangeRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authZariExchangeRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthZariExchangeRequestJson copy$default(AuthZariExchangeRequestJson authZariExchangeRequestJson, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = authZariExchangeRequestJson.accounts;
        }
        if ((i & 2) != 0) {
            str = authZariExchangeRequestJson.device_id;
        }
        if ((i & 4) != 0) {
            str2 = authZariExchangeRequestJson.waterfall_id;
        }
        return authZariExchangeRequestJson.copy(list, str, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthZariExchangeRequestJson authZariExchangeRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(authZariExchangeRequestJson.accounts, C3cH.A15($childSerializers, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || authZariExchangeRequestJson.device_id != null) {
            c9j5.AAP(authZariExchangeRequestJson.device_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || authZariExchangeRequestJson.waterfall_id != null) {
            c9j5.AAP(authZariExchangeRequestJson.waterfall_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public final List<AuthSsoAccountInfoEntryJson> component1() {
        return this.accounts;
    }

    public final String component2() {
        return this.device_id;
    }

    public final String component3() {
        return this.waterfall_id;
    }

    public final List<AuthSsoAccountInfoEntryJson> getAccounts() {
        return this.accounts;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.accounts) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthZariExchangeRequestJson(int i, List list, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AuthZariExchangeRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.accounts = list;
        if ((i & 2) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str;
        }
        if ((i & 4) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str2;
        }
    }

    public /* synthetic */ AuthZariExchangeRequestJson(List list, String str, String str2, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
