package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectorPermissionMethod extends C06G {
    public static final int $stable = 0;
    public final String key;
    public final String label;
    public final ConnectorPermissionMode mode;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorPermissionMethod) {
                ConnectorPermissionMethod connectorPermissionMethod = (ConnectorPermissionMethod) obj;
                if (!C7384Etj.areEqual(this.key, connectorPermissionMethod.key) || !C7384Etj.areEqual(this.label, connectorPermissionMethod.label) || this.mode != connectorPermissionMethod.mode) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorPermissionMethod copy$default(ConnectorPermissionMethod connectorPermissionMethod, String str, String str2, ConnectorPermissionMode connectorPermissionMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorPermissionMethod.key;
        }
        if ((i & 2) != 0) {
            str2 = connectorPermissionMethod.label;
        }
        if ((i & 4) != 0) {
            connectorPermissionMode = connectorPermissionMethod.mode;
        }
        return connectorPermissionMethod.copy(str, str2, connectorPermissionMode);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.label;
    }

    public final ConnectorPermissionMode component3() {
        return this.mode;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ConnectorPermissionMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.mode, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.key)));
    }

    public ConnectorPermissionMethod(String str, String str2, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass005.A0x(str, str2, connectorPermissionMode);
        this.key = str;
        this.label = str2;
        this.mode = connectorPermissionMode;
    }

    public final ConnectorPermissionMethod copy(String str, String str2, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass005.A0x(str, str2, connectorPermissionMode);
        return new ConnectorPermissionMethod(str, str2, connectorPermissionMode);
    }

    public String toString() {
        return super.toString();
    }
}
