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
/* loaded from: classes3.dex */
public final class ConnectorReconnectRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String session_id;

    public final class Companion {
        public final C9hr<ConnectorReconnectRequestJson> serializer() {
            return ConnectorReconnectRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorReconnectRequestJson connectorReconnectRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || connectorReconnectRequestJson.session_id != null) {
            c9j5.AAP(connectorReconnectRequestJson.session_id, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorReconnectRequestJson) && C7384Etj.areEqual(this.session_id, ((ConnectorReconnectRequestJson) obj).session_id));
    }

    public static /* synthetic */ ConnectorReconnectRequestJson copy$default(ConnectorReconnectRequestJson connectorReconnectRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorReconnectRequestJson.session_id;
        }
        return new ConnectorReconnectRequestJson(str);
    }

    public final String component1() {
        return this.session_id;
    }

    public final ConnectorReconnectRequestJson copy(String str) {
        return new ConnectorReconnectRequestJson(str);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.session_id);
    }

    public /* synthetic */ ConnectorReconnectRequestJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorReconnectRequestJson(String str) {
        this.session_id = str;
    }

    public /* synthetic */ ConnectorReconnectRequestJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ConnectorReconnectRequestJson() {
        this(null);
    }
}
