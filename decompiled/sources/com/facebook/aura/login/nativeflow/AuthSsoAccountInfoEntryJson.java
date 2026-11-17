package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthSsoAccountInfoEntryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final String ref;
    public final String source_app;

    public final class Companion {
        public final C9hr<AuthSsoAccountInfoEntryJson> serializer() {
            return AuthSsoAccountInfoEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSsoAccountInfoEntryJson authSsoAccountInfoEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authSsoAccountInfoEntryJson.source_app, c9iZ, 0);
        c9j5.AAV(authSsoAccountInfoEntryJson.access_token, c9iZ, 1);
        if (c9j5.AfR() || authSsoAccountInfoEntryJson.ref != null) {
            c9j5.AAP(authSsoAccountInfoEntryJson.ref, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSsoAccountInfoEntryJson) {
                AuthSsoAccountInfoEntryJson authSsoAccountInfoEntryJson = (AuthSsoAccountInfoEntryJson) obj;
                if (!C7384Etj.areEqual(this.source_app, authSsoAccountInfoEntryJson.source_app) || !C7384Etj.areEqual(this.access_token, authSsoAccountInfoEntryJson.access_token) || !C7384Etj.areEqual(this.ref, authSsoAccountInfoEntryJson.ref)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthSsoAccountInfoEntryJson copy$default(AuthSsoAccountInfoEntryJson authSsoAccountInfoEntryJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSsoAccountInfoEntryJson.source_app;
        }
        if ((i & 2) != 0) {
            str2 = authSsoAccountInfoEntryJson.access_token;
        }
        if ((i & 4) != 0) {
            str3 = authSsoAccountInfoEntryJson.ref;
        }
        return authSsoAccountInfoEntryJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.source_app;
    }

    public final String component2() {
        return this.access_token;
    }

    public final String component3() {
        return this.ref;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getRef() {
        return this.ref;
    }

    public final String getSource_app() {
        return this.source_app;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.access_token, AnonymousClass001.A0G(this.source_app)) + AnonymousClass006.A0G(this.ref);
    }

    public AuthSsoAccountInfoEntryJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.source_app = str;
        this.access_token = str2;
        this.ref = str3;
    }

    public final AuthSsoAccountInfoEntryJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new AuthSsoAccountInfoEntryJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSsoAccountInfoEntryJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthSsoAccountInfoEntryJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.source_app = str;
        this.access_token = str2;
        this.ref = C3cI.A0W(i, str3);
    }

    public /* synthetic */ AuthSsoAccountInfoEntryJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
