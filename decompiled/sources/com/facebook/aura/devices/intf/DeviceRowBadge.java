package com.facebook.aura.devices.intf;

import X.C06G;

/* loaded from: classes.dex */
public final class DeviceRowBadge extends C06G {
    public static final int $stable = 0;
    public final int iconDescriptionRes;
    public final int iconRes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceRowBadge) {
                DeviceRowBadge deviceRowBadge = (DeviceRowBadge) obj;
                if (this.iconRes != deviceRowBadge.iconRes || this.iconDescriptionRes != deviceRowBadge.iconDescriptionRes) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceRowBadge copy$default(DeviceRowBadge deviceRowBadge, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deviceRowBadge.iconRes;
        }
        if ((i3 & 2) != 0) {
            i2 = deviceRowBadge.iconDescriptionRes;
        }
        return new DeviceRowBadge(i, i2);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final int component2() {
        return this.iconDescriptionRes;
    }

    public final DeviceRowBadge copy(int i, int i2) {
        return new DeviceRowBadge(i, i2);
    }

    public final int getIconDescriptionRes() {
        return this.iconDescriptionRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public int hashCode() {
        return (this.iconRes * 31) + this.iconDescriptionRes;
    }

    public DeviceRowBadge(int i, int i2) {
        this.iconRes = i;
        this.iconDescriptionRes = i2;
    }

    public String toString() {
        return super.toString();
    }
}
