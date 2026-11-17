package com.facebook.aura.commands.battery;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class BatteryState extends C06G {
    public final String chargingSource;
    public final String health;
    public final boolean isCharging;
    public final boolean isLow;
    public final int levelPercent;

    public BatteryState(int i, boolean z, String str, boolean z2, String str2) {
        AnonymousClass002.A1C(str, 2, str2);
        this.levelPercent = i;
        this.isCharging = z;
        this.chargingSource = str;
        this.isLow = z2;
        this.health = str2;
    }

    public final BatteryState copy(int i, boolean z, String str, boolean z2, String str2) {
        AnonymousClass002.A1C(str, 2, str2);
        return new BatteryState(i, z, str, z2, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BatteryState) {
                BatteryState batteryState = (BatteryState) obj;
                if (this.levelPercent != batteryState.levelPercent || this.isCharging != batteryState.isCharging || !C7384Etj.areEqual(this.chargingSource, batteryState.chargingSource) || this.isLow != batteryState.isLow || !C7384Etj.areEqual(this.health, batteryState.health)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BatteryState copy$default(BatteryState batteryState, int i, boolean z, String str, boolean z2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = batteryState.levelPercent;
        }
        if ((i2 & 2) != 0) {
            z = batteryState.isCharging;
        }
        if ((i2 & 4) != 0) {
            str = batteryState.chargingSource;
        }
        if ((i2 & 8) != 0) {
            z2 = batteryState.isLow;
        }
        if ((i2 & 16) != 0) {
            str2 = batteryState.health;
        }
        return batteryState.copy(i, z, str, z2, str2);
    }

    public final int component1() {
        return this.levelPercent;
    }

    public final boolean component2() {
        return this.isCharging;
    }

    public final String component3() {
        return this.chargingSource;
    }

    public final boolean component4() {
        return this.isLow;
    }

    public final String component5() {
        return this.health;
    }

    public final String getChargingSource() {
        return this.chargingSource;
    }

    public final String getHealth() {
        return this.health;
    }

    public final int getLevelPercent() {
        return this.levelPercent;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.health, C0KA.A01(AnonymousClass005.A0I(this.chargingSource, C0KA.A01(this.levelPercent * 31, this.isCharging)), this.isLow));
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    public final boolean isLow() {
        return this.isLow;
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A05(Integer.valueOf(this.levelPercent), "level_percent", c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.isCharging), "is_charging", c2nwA1K);
        C7qW.A06("charging_source", this.chargingSource, c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.isLow), "is_low", c2nwA1K);
        return C7qW.A01("health", this.health, c2nwA1K);
    }

    public String toString() {
        return super.toString();
    }
}
