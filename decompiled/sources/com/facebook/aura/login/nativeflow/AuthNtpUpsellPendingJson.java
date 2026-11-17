package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthNtpUpsellPendingJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String contact_point;

    public final class Companion {
        public final C9hr<AuthNtpUpsellPendingJson> serializer() {
            return AuthNtpUpsellPendingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthNtpUpsellPendingJson authNtpUpsellPendingJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(authNtpUpsellPendingJson.contact_point)) {
            c9j5.AAV(authNtpUpsellPendingJson.contact_point, c9iZ, 0);
        }
    }

    public final AuthNtpUpsellPendingJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AuthNtpUpsellPendingJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuthNtpUpsellPendingJson) && C7384Etj.areEqual(this.contact_point, ((AuthNtpUpsellPendingJson) obj).contact_point));
    }

    public static /* synthetic */ AuthNtpUpsellPendingJson copy$default(AuthNtpUpsellPendingJson authNtpUpsellPendingJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authNtpUpsellPendingJson.contact_point;
        }
        C7384Etj.A0Y(str, 0);
        return new AuthNtpUpsellPendingJson(str);
    }

    public final String component1() {
        return this.contact_point;
    }

    public final String getContact_point() {
        return this.contact_point;
    }

    public int hashCode() {
        return this.contact_point.hashCode();
    }

    public /* synthetic */ AuthNtpUpsellPendingJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.contact_point = "";
        } else {
            this.contact_point = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AuthNtpUpsellPendingJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.contact_point = str;
    }

    public /* synthetic */ AuthNtpUpsellPendingJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public AuthNtpUpsellPendingJson() {
        this("");
    }
}
