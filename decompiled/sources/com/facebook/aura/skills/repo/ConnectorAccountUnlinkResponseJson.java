package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectorAccountUnlinkResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean unlinked;

    public final class Companion {
        public final C9hr<ConnectorAccountUnlinkResponseJson> serializer() {
            return ConnectorAccountUnlinkResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorAccountUnlinkResponseJson connectorAccountUnlinkResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || connectorAccountUnlinkResponseJson.unlinked) {
            c9j5.AA7(c9iZ, 0, connectorAccountUnlinkResponseJson.unlinked);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorAccountUnlinkResponseJson) && this.unlinked == ((ConnectorAccountUnlinkResponseJson) obj).unlinked);
    }

    public static /* synthetic */ ConnectorAccountUnlinkResponseJson copy$default(ConnectorAccountUnlinkResponseJson connectorAccountUnlinkResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectorAccountUnlinkResponseJson.unlinked;
        }
        return new ConnectorAccountUnlinkResponseJson(z);
    }

    public final boolean component1() {
        return this.unlinked;
    }

    public final ConnectorAccountUnlinkResponseJson copy(boolean z) {
        return new ConnectorAccountUnlinkResponseJson(z);
    }

    public final boolean getUnlinked() {
        return this.unlinked;
    }

    public int hashCode() {
        return this.unlinked ? 1231 : 1237;
    }

    public /* synthetic */ ConnectorAccountUnlinkResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.unlinked = false;
        } else {
            this.unlinked = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorAccountUnlinkResponseJson(boolean z) {
        this.unlinked = z;
    }

    public /* synthetic */ ConnectorAccountUnlinkResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public ConnectorAccountUnlinkResponseJson() {
        this(false);
    }
}
