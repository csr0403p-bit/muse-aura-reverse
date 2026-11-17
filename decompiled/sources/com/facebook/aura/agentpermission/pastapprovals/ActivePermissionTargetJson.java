package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivePermissionTargetJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ActivePermissionConnectorTargetJson connector;
    public final String type;

    public final class Companion {
        public final C9hr<ActivePermissionTargetJson> serializer() {
            return ActivePermissionTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionTargetJson activePermissionTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activePermissionTargetJson.type != null) {
            c9j5.AAP(activePermissionTargetJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activePermissionTargetJson.connector != null) {
            c9j5.AAP(activePermissionTargetJson.connector, ActivePermissionConnectorTargetJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionTargetJson) {
                ActivePermissionTargetJson activePermissionTargetJson = (ActivePermissionTargetJson) obj;
                if (!C7384Etj.areEqual(this.type, activePermissionTargetJson.type) || !C7384Etj.areEqual(this.connector, activePermissionTargetJson.connector)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionTargetJson copy$default(ActivePermissionTargetJson activePermissionTargetJson, String str, ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activePermissionTargetJson.type;
        }
        if ((i & 2) != 0) {
            activePermissionConnectorTargetJson = activePermissionTargetJson.connector;
        }
        return new ActivePermissionTargetJson(str, activePermissionConnectorTargetJson);
    }

    public final String component1() {
        return this.type;
    }

    public final ActivePermissionConnectorTargetJson component2() {
        return this.connector;
    }

    public final String connectorKey() {
        ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson;
        String str;
        if (!InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR.equals(this.type) || (activePermissionConnectorTargetJson = this.connector) == null || (str = activePermissionConnectorTargetJson.key) == null || C7BY.A0j(str)) {
            return null;
        }
        return str;
    }

    public final ActivePermissionTargetJson copy(String str, ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson) {
        return new ActivePermissionTargetJson(str, activePermissionConnectorTargetJson);
    }

    public final ActivePermissionConnectorTargetJson getConnector() {
        return this.connector;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.type) * 31) + C3cH.A02(this.connector);
    }

    public ActivePermissionTargetJson(String str, ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson) {
        this.type = str;
        this.connector = activePermissionConnectorTargetJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionTargetJson(int i, String str, ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.connector = null;
        } else {
            this.connector = activePermissionConnectorTargetJson;
        }
    }

    public /* synthetic */ ActivePermissionTargetJson(String str, ActivePermissionConnectorTargetJson activePermissionConnectorTargetJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : activePermissionConnectorTargetJson);
    }

    public ActivePermissionTargetJson() {
        this(null, null);
    }
}
