package com.facebook.aura.commands.network;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class CellularDetails extends C06G {
    public final String carrierName;
    public final boolean roaming;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CellularDetails) {
                CellularDetails cellularDetails = (CellularDetails) obj;
                if (!C7384Etj.areEqual(this.carrierName, cellularDetails.carrierName) || this.roaming != cellularDetails.roaming) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CellularDetails copy$default(CellularDetails cellularDetails, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cellularDetails.carrierName;
        }
        if ((i & 2) != 0) {
            z = cellularDetails.roaming;
        }
        return new CellularDetails(str, z);
    }

    public final String component1() {
        return this.carrierName;
    }

    public final boolean component2() {
        return this.roaming;
    }

    public final CellularDetails copy(String str, boolean z) {
        return new CellularDetails(str, z);
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final boolean getRoaming() {
        return this.roaming;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.carrierName) * 31, this.roaming);
    }

    public CellularDetails(String str, boolean z) {
        this.carrierName = str;
        this.roaming = z;
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        String str = this.carrierName;
        if (str != null) {
            C7qW.A06("carrierName", str, c2nwA1K);
        }
        C7qW.A04(Boolean.valueOf(this.roaming), "roaming", c2nwA1K);
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }
}
