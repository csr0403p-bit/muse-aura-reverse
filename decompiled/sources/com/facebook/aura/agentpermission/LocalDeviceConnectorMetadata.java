package com.facebook.aura.agentpermission;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorMetadata extends C06G {
    public static final int $stable = 0;
    public final String connectorId;
    public final int displayTitleRes;
    public final int iconRes;
    public final boolean isManageable;
    public final LocalDeviceConnectorPermissionRequirement permissionRequirement;
    public final AHD<LocalDeviceConnectorActionMetadata> readActions;
    public final int subtitleRes;
    public final AHD<LocalDeviceConnectorActionMetadata> writeActions;

    public LocalDeviceConnectorMetadata(String str, int i, int i2, int i3, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, AHD<LocalDeviceConnectorActionMetadata> ahd, AHD<LocalDeviceConnectorActionMetadata> ahd2, boolean z) {
        AnonymousClass002.A1C(str, 0, localDeviceConnectorPermissionRequirement);
        AnonymousClass003.A0z(ahd, ahd2);
        this.connectorId = str;
        this.displayTitleRes = i;
        this.subtitleRes = i2;
        this.iconRes = i3;
        this.permissionRequirement = localDeviceConnectorPermissionRequirement;
        this.readActions = ahd;
        this.writeActions = ahd2;
        this.isManageable = z;
    }

    public final LocalDeviceConnectorMetadata copy(String str, int i, int i2, int i3, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, AHD<LocalDeviceConnectorActionMetadata> ahd, AHD<LocalDeviceConnectorActionMetadata> ahd2, boolean z) {
        AnonymousClass002.A1C(str, 0, localDeviceConnectorPermissionRequirement);
        AnonymousClass003.A0z(ahd, ahd2);
        return new LocalDeviceConnectorMetadata(str, i, i2, i3, localDeviceConnectorPermissionRequirement, ahd, ahd2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalDeviceConnectorMetadata) {
                LocalDeviceConnectorMetadata localDeviceConnectorMetadata = (LocalDeviceConnectorMetadata) obj;
                if (!C7384Etj.areEqual(this.connectorId, localDeviceConnectorMetadata.connectorId) || this.displayTitleRes != localDeviceConnectorMetadata.displayTitleRes || this.subtitleRes != localDeviceConnectorMetadata.subtitleRes || this.iconRes != localDeviceConnectorMetadata.iconRes || this.permissionRequirement != localDeviceConnectorMetadata.permissionRequirement || !C7384Etj.areEqual(this.readActions, localDeviceConnectorMetadata.readActions) || !C7384Etj.areEqual(this.writeActions, localDeviceConnectorMetadata.writeActions) || this.isManageable != localDeviceConnectorMetadata.isManageable) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalDeviceConnectorMetadata copy$default(LocalDeviceConnectorMetadata localDeviceConnectorMetadata, String str, int i, int i2, int i3, LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement, AHD ahd, AHD ahd2, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = localDeviceConnectorMetadata.connectorId;
        }
        if ((i4 & 2) != 0) {
            i = localDeviceConnectorMetadata.displayTitleRes;
        }
        if ((i4 & 4) != 0) {
            i2 = localDeviceConnectorMetadata.subtitleRes;
        }
        if ((i4 & 8) != 0) {
            i3 = localDeviceConnectorMetadata.iconRes;
        }
        if ((i4 & 16) != 0) {
            localDeviceConnectorPermissionRequirement = localDeviceConnectorMetadata.permissionRequirement;
        }
        if ((i4 & 32) != 0) {
            ahd = localDeviceConnectorMetadata.readActions;
        }
        if ((i4 & 64) != 0) {
            ahd2 = localDeviceConnectorMetadata.writeActions;
        }
        if ((i4 & 128) != 0) {
            z = localDeviceConnectorMetadata.isManageable;
        }
        return localDeviceConnectorMetadata.copy(str, i, i2, i3, localDeviceConnectorPermissionRequirement, ahd, ahd2, z);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final int component2() {
        return this.displayTitleRes;
    }

    public final int component3() {
        return this.subtitleRes;
    }

    public final int component4() {
        return this.iconRes;
    }

    public final LocalDeviceConnectorPermissionRequirement component5() {
        return this.permissionRequirement;
    }

    public final AHD<LocalDeviceConnectorActionMetadata> component6() {
        return this.readActions;
    }

    public final AHD<LocalDeviceConnectorActionMetadata> component7() {
        return this.writeActions;
    }

    public final boolean component8() {
        return this.isManageable;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final int getDisplayTitleRes() {
        return this.displayTitleRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final LocalDeviceConnectorPermissionRequirement getPermissionRequirement() {
        return this.permissionRequirement;
    }

    public final AHD<LocalDeviceConnectorActionMetadata> getReadActions() {
        return this.readActions;
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final AHD<LocalDeviceConnectorActionMetadata> getWriteActions() {
        return this.writeActions;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.writeActions, AnonymousClass005.A0F(this.readActions, AnonymousClass005.A0F(this.permissionRequirement, (((((AnonymousClass001.A0G(this.connectorId) + this.displayTitleRes) * 31) + this.subtitleRes) * 31) + this.iconRes) * 31))), this.isManageable);
    }

    public final boolean isManageable() {
        return this.isManageable;
    }

    public String toString() {
        return super.toString();
    }
}
