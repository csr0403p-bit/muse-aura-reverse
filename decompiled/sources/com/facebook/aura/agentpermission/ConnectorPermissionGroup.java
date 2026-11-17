package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConnectorPermissionGroup extends C06G {
    public static final int $stable = 8;
    public final String key;
    public final String label;
    public final List<ConnectorPermissionMethod> methods;
    public final ConnectorPermissionMode selectedMode;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorPermissionGroup) {
                ConnectorPermissionGroup connectorPermissionGroup = (ConnectorPermissionGroup) obj;
                if (!C7384Etj.areEqual(this.key, connectorPermissionGroup.key) || !C7384Etj.areEqual(this.label, connectorPermissionGroup.label) || !C7384Etj.areEqual(this.methods, connectorPermissionGroup.methods) || this.selectedMode != connectorPermissionGroup.selectedMode) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorPermissionGroup copy$default(ConnectorPermissionGroup connectorPermissionGroup, String str, String str2, List list, ConnectorPermissionMode connectorPermissionMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorPermissionGroup.key;
        }
        if ((i & 2) != 0) {
            str2 = connectorPermissionGroup.label;
        }
        if ((i & 4) != 0) {
            list = connectorPermissionGroup.methods;
        }
        if ((i & 8) != 0) {
            connectorPermissionMode = connectorPermissionGroup.selectedMode;
        }
        AnonymousClass005.A0x(str, str2, list);
        return new ConnectorPermissionGroup(str, str2, list, connectorPermissionMode);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.label;
    }

    public final List<ConnectorPermissionMethod> component3() {
        return this.methods;
    }

    public final ConnectorPermissionMode component4() {
        return this.selectedMode;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<ConnectorPermissionMethod> getMethods() {
        return this.methods;
    }

    public final ConnectorPermissionMode getSelectedMode() {
        return this.selectedMode;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.methods, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.key))) + AnonymousClass006.A0D(this.selectedMode);
    }

    public ConnectorPermissionGroup(String str, String str2, List<ConnectorPermissionMethod> list, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass005.A0x(str, str2, list);
        this.key = str;
        this.label = str2;
        this.methods = list;
        this.selectedMode = connectorPermissionMode;
    }

    public final ConnectorPermissionGroup copy(String str, String str2, List<ConnectorPermissionMethod> list, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass005.A0x(str, str2, list);
        return new ConnectorPermissionGroup(str, str2, list, connectorPermissionMode);
    }

    public String toString() {
        return super.toString();
    }
}
