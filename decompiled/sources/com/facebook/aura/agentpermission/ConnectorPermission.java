package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ConnectorPermission extends C06G {
    public static final int $stable = 0;
    public final Map<String, ConnectorPermissionMode> actions;
    public final String connectorId;
    public final String displayName;
    public final List<ConnectorPermissionGroup> groups;
    public final String iconUrl;
    public final ConnectorManagementKind managementKind;
    public final boolean visibleInSettings;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorPermission) {
                ConnectorPermission connectorPermission = (ConnectorPermission) obj;
                if (!C7384Etj.areEqual(this.connectorId, connectorPermission.connectorId) || !C7384Etj.areEqual(this.displayName, connectorPermission.displayName) || !C7384Etj.areEqual(this.iconUrl, connectorPermission.iconUrl) || this.visibleInSettings != connectorPermission.visibleInSettings || this.managementKind != connectorPermission.managementKind || !C7384Etj.areEqual(this.actions, connectorPermission.actions) || !C7384Etj.areEqual(this.groups, connectorPermission.groups)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectorPermission copy$default(ConnectorPermission connectorPermission, String str, String str2, String str3, boolean z, ConnectorManagementKind connectorManagementKind, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectorPermission.connectorId;
        }
        if ((i & 2) != 0) {
            str2 = connectorPermission.displayName;
        }
        if ((i & 4) != 0) {
            str3 = connectorPermission.iconUrl;
        }
        if ((i & 8) != 0) {
            z = connectorPermission.visibleInSettings;
        }
        if ((i & 16) != 0) {
            connectorManagementKind = connectorPermission.managementKind;
        }
        if ((i & 32) != 0) {
            map = connectorPermission.actions;
        }
        if ((i & 64) != 0) {
            list = connectorPermission.groups;
        }
        return connectorPermission.copy(str, str2, str3, z, connectorManagementKind, map, list);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final boolean component4() {
        return this.visibleInSettings;
    }

    public final ConnectorManagementKind component5() {
        return this.managementKind;
    }

    public final Map<String, ConnectorPermissionMode> component6() {
        return this.actions;
    }

    public final List<ConnectorPermissionGroup> component7() {
        return this.groups;
    }

    public final Map<String, ConnectorPermissionMode> getActions() {
        return this.actions;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<ConnectorPermissionGroup> getGroups() {
        return this.groups;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final ConnectorManagementKind getManagementKind() {
        return this.managementKind;
    }

    public final boolean getVisibleInSettings() {
        return this.visibleInSettings;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.groups, AnonymousClass005.A0F(this.actions, (C0KA.A01((AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.connectorId)) + AnonymousClass006.A0G(this.iconUrl)) * 31, this.visibleInSettings) + C3cH.A02(this.managementKind)) * 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermission(String str, String str2, String str3, boolean z, ConnectorManagementKind connectorManagementKind, Map<String, ? extends ConnectorPermissionMode> map, List<ConnectorPermissionGroup> list) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0z(map, list);
        this.connectorId = str;
        this.displayName = str2;
        this.iconUrl = str3;
        this.visibleInSettings = z;
        this.managementKind = connectorManagementKind;
        this.actions = map;
        this.groups = list;
    }

    public final ConnectorPermission copy(String str, String str2, String str3, boolean z, ConnectorManagementKind connectorManagementKind, Map<String, ? extends ConnectorPermissionMode> map, List<ConnectorPermissionGroup> list) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0z(map, list);
        return new ConnectorPermission(str, str2, str3, z, connectorManagementKind, map, list);
    }

    public String toString() {
        return super.toString();
    }
}
