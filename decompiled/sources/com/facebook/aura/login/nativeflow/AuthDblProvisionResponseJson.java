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
/* loaded from: classes2.dex */
public final class AuthDblProvisionResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String nonce;
    public final String saved_account_id;

    public final class Companion {
        public final C9hr<AuthDblProvisionResponseJson> serializer() {
            return AuthDblProvisionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthDblProvisionResponseJson authDblProvisionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authDblProvisionResponseJson.nonce)) {
            c9j5.AAV(authDblProvisionResponseJson.nonce, c9iZ, 0);
        }
        if (zAfR || !"".equals(authDblProvisionResponseJson.saved_account_id)) {
            c9j5.AAV(authDblProvisionResponseJson.saved_account_id, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthDblProvisionResponseJson) {
                AuthDblProvisionResponseJson authDblProvisionResponseJson = (AuthDblProvisionResponseJson) obj;
                if (!C7384Etj.areEqual(this.nonce, authDblProvisionResponseJson.nonce) || !C7384Etj.areEqual(this.saved_account_id, authDblProvisionResponseJson.saved_account_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthDblProvisionResponseJson copy$default(AuthDblProvisionResponseJson authDblProvisionResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authDblProvisionResponseJson.nonce;
        }
        if ((i & 2) != 0) {
            str2 = authDblProvisionResponseJson.saved_account_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuthDblProvisionResponseJson(str, str2);
    }

    public final String component1() {
        return this.nonce;
    }

    public final String component2() {
        return this.saved_account_id;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getSaved_account_id() {
        return this.saved_account_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.saved_account_id, AnonymousClass001.A0G(this.nonce));
    }

    public AuthDblProvisionResponseJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.nonce = str;
        this.saved_account_id = str2;
    }

    public final AuthDblProvisionResponseJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AuthDblProvisionResponseJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthDblProvisionResponseJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.nonce = "";
        } else {
            this.nonce = str;
        }
        if ((i & 2) == 0) {
            this.saved_account_id = "";
        } else {
            this.saved_account_id = str2;
        }
    }

    public /* synthetic */ AuthDblProvisionResponseJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public AuthDblProvisionResponseJson() {
        this("", "");
    }
}
