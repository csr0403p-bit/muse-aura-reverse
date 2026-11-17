package com.facebook.aura.skills.repo;

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
/* loaded from: classes3.dex */
public final class ConnectorLinkResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String link_url;

    public final class Companion {
        public final C9hr<ConnectorLinkResponseJson> serializer() {
            return ConnectorLinkResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorLinkResponseJson connectorLinkResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(connectorLinkResponseJson.link_url)) {
            c9j5.AAV(connectorLinkResponseJson.link_url, c9iZ, 0);
        }
    }

    public final ConnectorLinkResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ConnectorLinkResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorLinkResponseJson) && C7384Etj.areEqual(this.link_url, ((ConnectorLinkResponseJson) obj).link_url));
    }

    public static /* synthetic */ ConnectorLinkResponseJson copy$default(ConnectorLinkResponseJson connectorLinkResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorLinkResponseJson.link_url;
        }
        C7384Etj.A0Y(str, 0);
        return new ConnectorLinkResponseJson(str);
    }

    public final String component1() {
        return this.link_url;
    }

    public final String getLink_url() {
        return this.link_url;
    }

    public int hashCode() {
        return this.link_url.hashCode();
    }

    public /* synthetic */ ConnectorLinkResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.link_url = "";
        } else {
            this.link_url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorLinkResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.link_url = str;
    }

    public /* synthetic */ ConnectorLinkResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ConnectorLinkResponseJson() {
        this("");
    }
}
