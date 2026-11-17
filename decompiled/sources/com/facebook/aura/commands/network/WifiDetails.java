package com.facebook.aura.commands.network;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class WifiDetails extends C06G {
    public final String bssid;
    public final int frequencyMhz;
    public final int linkSpeedMbps;
    public final int rssi;
    public final String ssid;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WifiDetails) {
                WifiDetails wifiDetails = (WifiDetails) obj;
                if (!C7384Etj.areEqual(this.ssid, wifiDetails.ssid) || !C7384Etj.areEqual(this.bssid, wifiDetails.bssid) || this.rssi != wifiDetails.rssi || this.frequencyMhz != wifiDetails.frequencyMhz || this.linkSpeedMbps != wifiDetails.linkSpeedMbps) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WifiDetails copy$default(WifiDetails wifiDetails, String str, String str2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = wifiDetails.ssid;
        }
        if ((i4 & 2) != 0) {
            str2 = wifiDetails.bssid;
        }
        if ((i4 & 4) != 0) {
            i = wifiDetails.rssi;
        }
        if ((i4 & 8) != 0) {
            i2 = wifiDetails.frequencyMhz;
        }
        if ((i4 & 16) != 0) {
            i3 = wifiDetails.linkSpeedMbps;
        }
        return wifiDetails.copy(str, str2, i, i2, i3);
    }

    public final String component1() {
        return this.ssid;
    }

    public final String component2() {
        return this.bssid;
    }

    public final int component3() {
        return this.rssi;
    }

    public final int component4() {
        return this.frequencyMhz;
    }

    public final int component5() {
        return this.linkSpeedMbps;
    }

    public final WifiDetails copy(String str, String str2, int i, int i2, int i3) {
        return new WifiDetails(str, str2, i, i2, i3);
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final int getFrequencyMhz() {
        return this.frequencyMhz;
    }

    public final int getLinkSpeedMbps() {
        return this.linkSpeedMbps;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.ssid) * 31) + AnonymousClass005.A0H(this.bssid)) * 31) + this.rssi) * 31) + this.frequencyMhz) * 31) + this.linkSpeedMbps;
    }

    public WifiDetails(String str, String str2, int i, int i2, int i3) {
        this.ssid = str;
        this.bssid = str2;
        this.rssi = i;
        this.frequencyMhz = i2;
        this.linkSpeedMbps = i3;
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        String str = this.ssid;
        if (str != null) {
            C7qW.A06("ssid", str, c2nwA1K);
        }
        String str2 = this.bssid;
        if (str2 != null) {
            C7qW.A06("bssid", str2, c2nwA1K);
        }
        C7qW.A05(Integer.valueOf(this.rssi), "rssi", c2nwA1K);
        C7qW.A05(Integer.valueOf(this.rssi), "rssiDbm", c2nwA1K);
        C7qW.A05(Integer.valueOf(this.frequencyMhz), "frequencyMhz", c2nwA1K);
        C7qW.A05(Integer.valueOf(this.linkSpeedMbps), "linkSpeedMbps", c2nwA1K);
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }
}
