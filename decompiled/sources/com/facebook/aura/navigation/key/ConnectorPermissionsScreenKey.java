package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectorPermissionsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String connectorId;

    public final class Companion {
        public final C9hr<ConnectorPermissionsScreenKey> serializer() {
            return ConnectorPermissionsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConnectorPermissionsScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ConnectorPermissionsScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorPermissionsScreenKey) && C7384Etj.areEqual(this.connectorId, ((ConnectorPermissionsScreenKey) obj).connectorId));
    }

    public /* synthetic */ ConnectorPermissionsScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConnectorPermissionsScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.connectorId = str;
    }

    public static /* synthetic */ ConnectorPermissionsScreenKey copy$default(ConnectorPermissionsScreenKey connectorPermissionsScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorPermissionsScreenKey.connectorId;
        }
        C7384Etj.A0Y(str, 0);
        return new ConnectorPermissionsScreenKey(str);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public int hashCode() {
        return this.connectorId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorPermissionsScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.connectorId = str;
    }
}
