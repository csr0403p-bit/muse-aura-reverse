package com.facebook.aura.common.ble;

import X.C7384Etj;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class BleConstants {
    public static final UUID CCCD_UUID;
    public static final BleConstants INSTANCE = new BleConstants();

    static {
        UUID uuidFromString = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        C7384Etj.A0U(uuidFromString);
        CCCD_UUID = uuidFromString;
    }

    public final UUID getCCCD_UUID() {
        return CCCD_UUID;
    }
}
