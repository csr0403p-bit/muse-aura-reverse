package com.facebook.aura.skills.repo;

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
/* loaded from: classes.dex */
public final class DisconnectConnectorRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String session_id;

    public final class Companion {
        public final C9hr<DisconnectConnectorRequestJson> serializer() {
            return DisconnectConnectorRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(DisconnectConnectorRequestJson disconnectConnectorRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || disconnectConnectorRequestJson.session_id != null) {
            c9j5.AAP(disconnectConnectorRequestJson.session_id, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DisconnectConnectorRequestJson) && C7384Etj.areEqual(this.session_id, ((DisconnectConnectorRequestJson) obj).session_id));
    }

    public static /* synthetic */ DisconnectConnectorRequestJson copy$default(DisconnectConnectorRequestJson disconnectConnectorRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disconnectConnectorRequestJson.session_id;
        }
        return new DisconnectConnectorRequestJson(str);
    }

    public final String component1() {
        return this.session_id;
    }

    public final DisconnectConnectorRequestJson copy(String str) {
        return new DisconnectConnectorRequestJson(str);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.session_id);
    }

    public /* synthetic */ DisconnectConnectorRequestJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public String toString() {
        return super.toString();
    }

    public DisconnectConnectorRequestJson(String str) {
        this.session_id = str;
    }

    public /* synthetic */ DisconnectConnectorRequestJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str;
        }
    }

    public DisconnectConnectorRequestJson() {
        this(null);
    }
}
