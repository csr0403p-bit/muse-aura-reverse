package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class AuthTosDocumentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String label;
    public final String url;

    public final class Companion {
        public final C9hr<AuthTosDocumentJson> serializer() {
            return AuthTosDocumentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTosDocumentJson authTosDocumentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authTosDocumentJson.label)) {
            c9j5.AAV(authTosDocumentJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(authTosDocumentJson.url)) {
            c9j5.AAV(authTosDocumentJson.url, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTosDocumentJson) {
                AuthTosDocumentJson authTosDocumentJson = (AuthTosDocumentJson) obj;
                if (!C7384Etj.areEqual(this.label, authTosDocumentJson.label) || !C7384Etj.areEqual(this.url, authTosDocumentJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthTosDocumentJson copy$default(AuthTosDocumentJson authTosDocumentJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTosDocumentJson.label;
        }
        if ((i & 2) != 0) {
            str2 = authTosDocumentJson.url;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuthTosDocumentJson(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.label));
    }

    public AuthTosDocumentJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.url = str2;
    }

    public final AuthTosDocumentJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AuthTosDocumentJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTosDocumentJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public /* synthetic */ AuthTosDocumentJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
    }

    public AuthTosDocumentJson() {
        this("", "");
    }
}
