package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthLoginOptionsRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String device_id;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthLoginOptionsRequestJson> serializer() {
            return AuthLoginOptionsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthLoginOptionsRequestJson authLoginOptionsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || authLoginOptionsRequestJson.device_id != null) {
            c9j5.AAP(authLoginOptionsRequestJson.device_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || authLoginOptionsRequestJson.waterfall_id != null) {
            c9j5.AAP(authLoginOptionsRequestJson.waterfall_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthLoginOptionsRequestJson) {
                AuthLoginOptionsRequestJson authLoginOptionsRequestJson = (AuthLoginOptionsRequestJson) obj;
                if (!C7384Etj.areEqual(this.device_id, authLoginOptionsRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authLoginOptionsRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthLoginOptionsRequestJson copy$default(AuthLoginOptionsRequestJson authLoginOptionsRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authLoginOptionsRequestJson.device_id;
        }
        if ((i & 2) != 0) {
            str2 = authLoginOptionsRequestJson.waterfall_id;
        }
        return new AuthLoginOptionsRequestJson(str, str2);
    }

    public final String component1() {
        return this.device_id;
    }

    public final String component2() {
        return this.waterfall_id;
    }

    public final AuthLoginOptionsRequestJson copy(String str, String str2) {
        return new AuthLoginOptionsRequestJson(str, str2);
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.device_id) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public AuthLoginOptionsRequestJson(String str, String str2) {
        this.device_id = str;
        this.waterfall_id = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthLoginOptionsRequestJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str;
        }
        if ((i & 2) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str2;
        }
    }

    public /* synthetic */ AuthLoginOptionsRequestJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public AuthLoginOptionsRequestJson() {
        this(null, null);
    }
}
