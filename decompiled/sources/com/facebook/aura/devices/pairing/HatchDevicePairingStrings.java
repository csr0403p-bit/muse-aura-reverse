package com.facebook.aura.devices.pairing;

import X.C06G;
import X.C06H;
import com.facebook.aura.R;

/* loaded from: classes.dex */
public final class HatchDevicePairingStrings extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final HatchDevicePairingStrings HATCH_LINK = new HatchDevicePairingStrings(R.string._name_removed__res_0x7f120b59, R.string._name_removed__res_0x7f120b38);
    public final int fallbackDeviceNameRes;
    public final int setupTitleRes;

    public final class Companion {
        public final HatchDevicePairingStrings getHATCH_LINK() {
            return HatchDevicePairingStrings.HATCH_LINK;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDevicePairingStrings) {
                HatchDevicePairingStrings hatchDevicePairingStrings = (HatchDevicePairingStrings) obj;
                if (this.setupTitleRes != hatchDevicePairingStrings.setupTitleRes || this.fallbackDeviceNameRes != hatchDevicePairingStrings.fallbackDeviceNameRes) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDevicePairingStrings copy$default(HatchDevicePairingStrings hatchDevicePairingStrings, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hatchDevicePairingStrings.setupTitleRes;
        }
        if ((i3 & 2) != 0) {
            i2 = hatchDevicePairingStrings.fallbackDeviceNameRes;
        }
        return new HatchDevicePairingStrings(i, i2);
    }

    public final int component1() {
        return this.setupTitleRes;
    }

    public final int component2() {
        return this.fallbackDeviceNameRes;
    }

    public final HatchDevicePairingStrings copy(int i, int i2) {
        return new HatchDevicePairingStrings(i, i2);
    }

    public final int getFallbackDeviceNameRes() {
        return this.fallbackDeviceNameRes;
    }

    public final int getSetupTitleRes() {
        return this.setupTitleRes;
    }

    public int hashCode() {
        return (this.setupTitleRes * 31) + this.fallbackDeviceNameRes;
    }

    public HatchDevicePairingStrings(int i, int i2) {
        this.setupTitleRes = i;
        this.fallbackDeviceNameRes = i2;
    }

    public String toString() {
        return super.toString();
    }
}
