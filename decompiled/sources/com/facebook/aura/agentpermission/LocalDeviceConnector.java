package com.facebook.aura.agentpermission;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class LocalDeviceConnector extends C06G {
    public static final int $stable = 0;
    public final String connectorId;
    public final ConnectorPermission connectorPermission;
    public final String displayTitle;
    public final int iconRes;
    public final boolean isConnected;
    public final boolean isManageable;
    public final LocalDeviceConnectorPermissionRequirement permissionRequirement;
    public final AHD<LocalDeviceConnectorAction> readActions;
    public final String subtitle;
    public final AHD<LocalDeviceConnectorAction> writeActions;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalDeviceConnector) {
                LocalDeviceConnector localDeviceConnector = (LocalDeviceConnector) obj;
                if (!C7384Etj.areEqual(this.connectorId, localDeviceConnector.connectorId) || !C7384Etj.areEqual(this.displayTitle, localDeviceConnector.displayTitle) || !C7384Etj.areEqual(this.subtitle, localDeviceConnector.subtitle) || this.iconRes != localDeviceConnector.iconRes || this.permissionRequirement != localDeviceConnector.permissionRequirement || !C7384Etj.areEqual(this.readActions, localDeviceConnector.readActions) || !C7384Etj.areEqual(this.writeActions, localDeviceConnector.writeActions) || this.isManageable != localDeviceConnector.isManageable || this.isConnected != localDeviceConnector.isConnected || !C7384Etj.areEqual(this.connectorPermission, localDeviceConnector.connectorPermission)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalDeviceConnector copy$default(LocalDeviceConnector localDeviceConnector, String str, String str2, String str3, int i, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, AHD ahd, AHD ahd2, boolean z, boolean z2, ConnectorPermission connectorPermission, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = localDeviceConnector.connectorId;
        }
        if ((i2 & 2) != 0) {
            str2 = localDeviceConnector.displayTitle;
        }
        if ((i2 & 4) != 0) {
            str3 = localDeviceConnector.subtitle;
        }
        if ((i2 & 8) != 0) {
            i = localDeviceConnector.iconRes;
        }
        if ((i2 & 16) != 0) {
            localDeviceConnectorPermissionRequirement = localDeviceConnector.permissionRequirement;
        }
        if ((i2 & 32) != 0) {
            ahd = localDeviceConnector.readActions;
        }
        if ((i2 & 64) != 0) {
            ahd2 = localDeviceConnector.writeActions;
        }
        if ((i2 & 128) != 0) {
            z = localDeviceConnector.isManageable;
        }
        if ((i2 & 256) != 0) {
            z2 = localDeviceConnector.isConnected;
        }
        if ((i2 & 512) != 0) {
            connectorPermission = localDeviceConnector.connectorPermission;
        }
        return localDeviceConnector.copy(str, str2, str3, i, localDeviceConnectorPermissionRequirement, ahd, ahd2, z, z2, connectorPermission);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final ConnectorPermission component10() {
        return this.connectorPermission;
    }

    public final String component2() {
        return this.displayTitle;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final int component4() {
        return this.iconRes;
    }

    public final LocalDeviceConnectorPermissionRequirement component5() {
        return this.permissionRequirement;
    }

    public final AHD<LocalDeviceConnectorAction> component6() {
        return this.readActions;
    }

    public final AHD<LocalDeviceConnectorAction> component7() {
        return this.writeActions;
    }

    public final boolean component8() {
        return this.isManageable;
    }

    public final boolean component9() {
        return this.isConnected;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final ConnectorPermission getConnectorPermission() {
        return this.connectorPermission;
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final LocalDeviceConnectorPermissionRequirement getPermissionRequirement() {
        return this.permissionRequirement;
    }

    public final AHD<LocalDeviceConnectorAction> getReadActions() {
        return this.readActions;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final AHD<LocalDeviceConnectorAction> getWriteActions() {
        return this.writeActions;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connectorPermission, C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.writeActions, AnonymousClass005.A0F(this.readActions, AnonymousClass005.A0F(this.permissionRequirement, (AnonymousClass005.A0I(this.subtitle, AnonymousClass005.A0I(this.displayTitle, AnonymousClass001.A0G(this.connectorId))) + this.iconRes) * 31))), this.isManageable), this.isConnected));
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isManageable() {
        return this.isManageable;
    }

    public LocalDeviceConnector(String str, String str2, String str3, int i, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, AHD<LocalDeviceConnectorAction> ahd, AHD<LocalDeviceConnectorAction> ahd2, boolean z, boolean z2, ConnectorPermission connectorPermission) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(localDeviceConnectorPermissionRequirement, 4);
        AnonymousClass003.A0z(ahd, ahd2);
        C7384Etj.A0Y(connectorPermission, 9);
        this.connectorId = str;
        this.displayTitle = str2;
        this.subtitle = str3;
        this.iconRes = i;
        this.permissionRequirement = localDeviceConnectorPermissionRequirement;
        this.readActions = ahd;
        this.writeActions = ahd2;
        this.isManageable = z;
        this.isConnected = z2;
        this.connectorPermission = connectorPermission;
    }

    public final LocalDeviceConnector copy(String str, String str2, String str3, int i, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, AHD<LocalDeviceConnectorAction> ahd, AHD<LocalDeviceConnectorAction> ahd2, boolean z, boolean z2, ConnectorPermission connectorPermission) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(localDeviceConnectorPermissionRequirement, 4);
        AnonymousClass003.A0z(ahd, ahd2);
        C7384Etj.A0Y(connectorPermission, 9);
        return new LocalDeviceConnector(str, str2, str3, i, localDeviceConnectorPermissionRequirement, ahd, ahd2, z, z2, connectorPermission);
    }

    public String toString() {
        return super.toString();
    }
}
