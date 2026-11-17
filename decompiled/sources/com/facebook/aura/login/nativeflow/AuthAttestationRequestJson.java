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
public final class AuthAttestationRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String challenge;
    public final String key_alias;

    public final class Companion {
        public final C9hr<AuthAttestationRequestJson> serializer() {
            return AuthAttestationRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthAttestationRequestJson authAttestationRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authAttestationRequestJson.key_alias)) {
            c9j5.AAV(authAttestationRequestJson.key_alias, c9iZ, 0);
        }
        if (zAfR || !"".equals(authAttestationRequestJson.challenge)) {
            c9j5.AAV(authAttestationRequestJson.challenge, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthAttestationRequestJson) {
                AuthAttestationRequestJson authAttestationRequestJson = (AuthAttestationRequestJson) obj;
                if (!C7384Etj.areEqual(this.key_alias, authAttestationRequestJson.key_alias) || !C7384Etj.areEqual(this.challenge, authAttestationRequestJson.challenge)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthAttestationRequestJson copy$default(AuthAttestationRequestJson authAttestationRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authAttestationRequestJson.key_alias;
        }
        if ((i & 2) != 0) {
            str2 = authAttestationRequestJson.challenge;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuthAttestationRequestJson(str, str2);
    }

    public final String component1() {
        return this.key_alias;
    }

    public final String component2() {
        return this.challenge;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getKey_alias() {
        return this.key_alias;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.challenge, AnonymousClass001.A0G(this.key_alias));
    }

    public AuthAttestationRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.key_alias = str;
        this.challenge = str2;
    }

    public final AuthAttestationRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AuthAttestationRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthAttestationRequestJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key_alias = "";
        } else {
            this.key_alias = str;
        }
        if ((i & 2) == 0) {
            this.challenge = "";
        } else {
            this.challenge = str2;
        }
    }

    public /* synthetic */ AuthAttestationRequestJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public AuthAttestationRequestJson() {
        this("", "");
    }
}
