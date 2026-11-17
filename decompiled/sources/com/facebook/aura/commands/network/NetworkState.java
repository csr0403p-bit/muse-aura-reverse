package com.facebook.aura.commands.network;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2nw;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class NetworkState extends C06G {
    public final CellularDetails cellular;
    public final boolean hasInternet;
    public final boolean isConnected;
    public final boolean isMetered;
    public final String transport;
    public final WifiDetails wifi;

    public NetworkState(String str, boolean z, boolean z2, boolean z3, WifiDetails wifiDetails, CellularDetails cellularDetails) {
        C7384Etj.A0Y(str, 0);
        this.transport = str;
        this.isConnected = z;
        this.hasInternet = z2;
        this.isMetered = z3;
        this.wifi = wifiDetails;
        this.cellular = cellularDetails;
    }

    public final NetworkState copy(String str, boolean z, boolean z2, boolean z3, WifiDetails wifiDetails, CellularDetails cellularDetails) {
        C7384Etj.A0Y(str, 0);
        return new NetworkState(str, z, z2, z3, wifiDetails, cellularDetails);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NetworkState) {
                NetworkState networkState = (NetworkState) obj;
                if (!C7384Etj.areEqual(this.transport, networkState.transport) || this.isConnected != networkState.isConnected || this.hasInternet != networkState.hasInternet || this.isMetered != networkState.isMetered || !C7384Etj.areEqual(this.wifi, networkState.wifi) || !C7384Etj.areEqual(this.cellular, networkState.cellular)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, String str, boolean z, boolean z2, boolean z3, WifiDetails wifiDetails, CellularDetails cellularDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkState.transport;
        }
        if ((i & 2) != 0) {
            z = networkState.isConnected;
        }
        if ((i & 4) != 0) {
            z2 = networkState.hasInternet;
        }
        if ((i & 8) != 0) {
            z3 = networkState.isMetered;
        }
        if ((i & 16) != 0) {
            wifiDetails = networkState.wifi;
        }
        if ((i & 32) != 0) {
            cellularDetails = networkState.cellular;
        }
        return networkState.copy(str, z, z2, z3, wifiDetails, cellularDetails);
    }

    public final String component1() {
        return this.transport;
    }

    public final boolean component2() {
        return this.isConnected;
    }

    public final boolean component3() {
        return this.hasInternet;
    }

    public final boolean component4() {
        return this.isMetered;
    }

    public final WifiDetails component5() {
        return this.wifi;
    }

    public final CellularDetails component6() {
        return this.cellular;
    }

    public final CellularDetails getCellular() {
        return this.cellular;
    }

    public final boolean getHasInternet() {
        return this.hasInternet;
    }

    public final String getTransport() {
        return this.transport;
    }

    public final WifiDetails getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.transport), this.isConnected), this.hasInternet), this.isMetered) + AnonymousClass006.A0D(this.wifi)) * 31) + C3cH.A02(this.cellular);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06(HatchDataExportRepositoryKt.FAILURE_TRANSPORT, this.transport, c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.isConnected), "isConnected", c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.hasInternet), "hasInternet", c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.isMetered), "isMetered", c2nwA1K);
        WifiDetails wifiDetails = this.wifi;
        if (wifiDetails != null) {
            c2nwA1K.A01("wifi", wifiDetails.toJson());
        }
        CellularDetails cellularDetails = this.cellular;
        if (cellularDetails != null) {
            c2nwA1K.A01("cellular", cellularDetails.toJson());
        }
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NetworkState(String str, boolean z, boolean z2, boolean z3, WifiDetails wifiDetails, CellularDetails cellularDetails, int i, C06H c06h) {
        this(str, z, z2, z3, (i & 16) != 0 ? null : wifiDetails, (i & 32) != 0 ? null : cellularDetails);
    }
}
