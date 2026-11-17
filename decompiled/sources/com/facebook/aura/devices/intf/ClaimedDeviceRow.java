package com.facebook.aura.devices.intf;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class ClaimedDeviceRow extends C06G {
    public static final int $stable = 8;
    public final int iconDescriptionRes;
    public final int iconRes;
    public final Integer statusRes;
    public final AuraNavKey target;

    public ClaimedDeviceRow(int i, int i2, Integer num, AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 3);
        this.iconRes = i;
        this.iconDescriptionRes = i2;
        this.statusRes = num;
        this.target = auraNavKey;
    }

    public final ClaimedDeviceRow copy(int i, int i2, Integer num, AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 3);
        return new ClaimedDeviceRow(i, i2, num, auraNavKey);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClaimedDeviceRow) {
                ClaimedDeviceRow claimedDeviceRow = (ClaimedDeviceRow) obj;
                if (this.iconRes != claimedDeviceRow.iconRes || this.iconDescriptionRes != claimedDeviceRow.iconDescriptionRes || !C7384Etj.areEqual(this.statusRes, claimedDeviceRow.statusRes) || !C7384Etj.areEqual(this.target, claimedDeviceRow.target)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ClaimedDeviceRow copy$default(ClaimedDeviceRow claimedDeviceRow, int i, int i2, Integer num, AuraNavKey auraNavKey, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = claimedDeviceRow.iconRes;
        }
        if ((i3 & 2) != 0) {
            i2 = claimedDeviceRow.iconDescriptionRes;
        }
        if ((i3 & 4) != 0) {
            num = claimedDeviceRow.statusRes;
        }
        if ((i3 & 8) != 0) {
            auraNavKey = claimedDeviceRow.target;
        }
        C7384Etj.A0Y(auraNavKey, 3);
        return new ClaimedDeviceRow(i, i2, num, auraNavKey);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final int component2() {
        return this.iconDescriptionRes;
    }

    public final Integer component3() {
        return this.statusRes;
    }

    public final AuraNavKey component4() {
        return this.target;
    }

    public final int getIconDescriptionRes() {
        return this.iconDescriptionRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final Integer getStatusRes() {
        return this.statusRes;
    }

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.target, ((((this.iconRes * 31) + this.iconDescriptionRes) * 31) + AnonymousClass006.A0D(this.statusRes)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
