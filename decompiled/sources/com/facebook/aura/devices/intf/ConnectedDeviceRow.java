package com.facebook.aura.devices.intf;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class ConnectedDeviceRow extends C06G {
    public static final int $stable = 8;
    public final int iconRes;
    public final String id;
    public final boolean isCommunityDevice;
    public final Integer subtitleRes;
    public final AuraNavKey target;
    public final String title;
    public final int titleFallbackRes;

    public ConnectedDeviceRow(String str, String str2, int i, Integer num, int i2, AuraNavKey auraNavKey, boolean z) {
        AnonymousClass002.A1D(str, 0, auraNavKey);
        this.id = str;
        this.title = str2;
        this.titleFallbackRes = i;
        this.subtitleRes = num;
        this.iconRes = i2;
        this.target = auraNavKey;
        this.isCommunityDevice = z;
    }

    public final ConnectedDeviceRow copy(String str, String str2, int i, Integer num, int i2, AuraNavKey auraNavKey, boolean z) {
        AnonymousClass002.A1D(str, 0, auraNavKey);
        return new ConnectedDeviceRow(str, str2, i, num, i2, auraNavKey, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectedDeviceRow) {
                ConnectedDeviceRow connectedDeviceRow = (ConnectedDeviceRow) obj;
                if (!C7384Etj.areEqual(this.id, connectedDeviceRow.id) || !C7384Etj.areEqual(this.title, connectedDeviceRow.title) || this.titleFallbackRes != connectedDeviceRow.titleFallbackRes || !C7384Etj.areEqual(this.subtitleRes, connectedDeviceRow.subtitleRes) || this.iconRes != connectedDeviceRow.iconRes || !C7384Etj.areEqual(this.target, connectedDeviceRow.target) || this.isCommunityDevice != connectedDeviceRow.isCommunityDevice) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectedDeviceRow copy$default(ConnectedDeviceRow connectedDeviceRow, String str, String str2, int i, Integer num, int i2, AuraNavKey auraNavKey, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = connectedDeviceRow.id;
        }
        if ((i3 & 2) != 0) {
            str2 = connectedDeviceRow.title;
        }
        if ((i3 & 4) != 0) {
            i = connectedDeviceRow.titleFallbackRes;
        }
        if ((i3 & 8) != 0) {
            num = connectedDeviceRow.subtitleRes;
        }
        if ((i3 & 16) != 0) {
            i2 = connectedDeviceRow.iconRes;
        }
        if ((i3 & 32) != 0) {
            auraNavKey = connectedDeviceRow.target;
        }
        if ((i3 & 64) != 0) {
            z = connectedDeviceRow.isCommunityDevice;
        }
        return connectedDeviceRow.copy(str, str2, i, num, i2, auraNavKey, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.titleFallbackRes;
    }

    public final Integer component4() {
        return this.subtitleRes;
    }

    public final int component5() {
        return this.iconRes;
    }

    public final AuraNavKey component6() {
        return this.target;
    }

    public final boolean component7() {
        return this.isCommunityDevice;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleFallbackRes() {
        return this.titleFallbackRes;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.target, (((((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.title)) * 31) + this.titleFallbackRes) * 31) + C06G.A04(this.subtitleRes)) * 31) + this.iconRes) * 31), this.isCommunityDevice);
    }

    public final boolean isCommunityDevice() {
        return this.isCommunityDevice;
    }

    public String toString() {
        return super.toString();
    }
}
