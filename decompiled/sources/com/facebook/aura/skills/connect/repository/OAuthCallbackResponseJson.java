package com.facebook.aura.skills.connect.repository;

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
/* loaded from: classes3.dex */
public final class OAuthCallbackResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String status;

    public final class Companion {
        public final C9hr<OAuthCallbackResponseJson> serializer() {
            return OAuthCallbackResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(OAuthCallbackResponseJson oAuthCallbackResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || oAuthCallbackResponseJson.status != null) {
            c9j5.AAP(oAuthCallbackResponseJson.status, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OAuthCallbackResponseJson) && C7384Etj.areEqual(this.status, ((OAuthCallbackResponseJson) obj).status));
    }

    public static /* synthetic */ OAuthCallbackResponseJson copy$default(OAuthCallbackResponseJson oAuthCallbackResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuthCallbackResponseJson.status;
        }
        return new OAuthCallbackResponseJson(str);
    }

    public final String component1() {
        return this.status;
    }

    public final OAuthCallbackResponseJson copy(String str) {
        return new OAuthCallbackResponseJson(str);
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.status);
    }

    public /* synthetic */ OAuthCallbackResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public OAuthCallbackResponseJson(String str) {
        this.status = str;
    }

    public /* synthetic */ OAuthCallbackResponseJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public OAuthCallbackResponseJson() {
        this(null);
    }
}
