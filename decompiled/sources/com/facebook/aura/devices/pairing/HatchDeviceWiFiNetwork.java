package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchDeviceWiFiNetwork extends C06G {
    public static final int $stable = 0;
    public final int frequency;
    public final int rssi;
    public final String security;
    public final String ssid;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDeviceWiFiNetwork) {
                HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork = (HatchDeviceWiFiNetwork) obj;
                if (!C7384Etj.areEqual(this.ssid, hatchDeviceWiFiNetwork.ssid) || this.rssi != hatchDeviceWiFiNetwork.rssi || !C7384Etj.areEqual(this.security, hatchDeviceWiFiNetwork.security) || this.frequency != hatchDeviceWiFiNetwork.frequency) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDeviceWiFiNetwork copy$default(HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hatchDeviceWiFiNetwork.ssid;
        }
        if ((i3 & 2) != 0) {
            i = hatchDeviceWiFiNetwork.rssi;
        }
        if ((i3 & 4) != 0) {
            str2 = hatchDeviceWiFiNetwork.security;
        }
        if ((i3 & 8) != 0) {
            i2 = hatchDeviceWiFiNetwork.frequency;
        }
        AnonymousClass003.A0v(str, str2);
        return new HatchDeviceWiFiNetwork(str, i, str2, i2);
    }

    public final String component1() {
        return this.ssid;
    }

    public final int component2() {
        return this.rssi;
    }

    public final String component3() {
        return this.security;
    }

    public final int component4() {
        return this.frequency;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final String getSecurity() {
        return this.security;
    }

    public final String getSignalStrengthLabel() {
        int i = this.rssi;
        return i >= -50 ? "Excellent" : i >= -60 ? "Good" : i >= -70 ? "Fair" : "Weak";
    }

    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.security, (AnonymousClass001.A0G(this.ssid) + this.rssi) * 31) + this.frequency;
    }

    public final boolean isOpen() {
        return "OPEN".equals(this.security);
    }

    public HatchDeviceWiFiNetwork(String str, int i, String str2, int i2) {
        AnonymousClass003.A0v(str, str2);
        this.ssid = str;
        this.rssi = i;
        this.security = str2;
        this.frequency = i2;
    }

    public final HatchDeviceWiFiNetwork copy(String str, int i, String str2, int i2) {
        AnonymousClass003.A0v(str, str2);
        return new HatchDeviceWiFiNetwork(str, i, str2, i2);
    }

    public String toString() {
        return super.toString();
    }
}
