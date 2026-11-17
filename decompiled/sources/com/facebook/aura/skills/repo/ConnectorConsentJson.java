package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.skills.model.Consent;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConnectorConsentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ConnectorHatchConsentJson hatch;

    public final class Companion {
        public final C9hr<ConnectorConsentJson> serializer() {
            return ConnectorConsentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorConsentJson connectorConsentJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || connectorConsentJson.hatch != null) {
            c9j5.AAP(connectorConsentJson.hatch, ConnectorHatchConsentJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorConsentJson) && C7384Etj.areEqual(this.hatch, ((ConnectorConsentJson) obj).hatch));
    }

    public /* synthetic */ ConnectorConsentJson(ConnectorHatchConsentJson connectorHatchConsentJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : connectorHatchConsentJson);
    }

    public static /* synthetic */ ConnectorConsentJson copy$default(ConnectorConsentJson connectorConsentJson, ConnectorHatchConsentJson connectorHatchConsentJson, int i, Object obj) {
        if ((i & 1) != 0) {
            connectorHatchConsentJson = connectorConsentJson.hatch;
        }
        return new ConnectorConsentJson(connectorHatchConsentJson);
    }

    public final ConnectorHatchConsentJson component1() {
        return this.hatch;
    }

    public final ConnectorConsentJson copy(ConnectorHatchConsentJson connectorHatchConsentJson) {
        return new ConnectorConsentJson(connectorHatchConsentJson);
    }

    public final ConnectorHatchConsentJson getHatch() {
        return this.hatch;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.hatch);
    }

    public final Consent toDomain() {
        ConnectorHatchConsentJson connectorHatchConsentJson = this.hatch;
        if (connectorHatchConsentJson != null) {
            return connectorHatchConsentJson.toDomain();
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorConsentJson(ConnectorHatchConsentJson connectorHatchConsentJson) {
        this.hatch = connectorHatchConsentJson;
    }

    public /* synthetic */ ConnectorConsentJson(int i, ConnectorHatchConsentJson connectorHatchConsentJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.hatch = null;
        } else {
            this.hatch = connectorHatchConsentJson;
        }
    }

    public ConnectorConsentJson() {
        this(null);
    }
}
