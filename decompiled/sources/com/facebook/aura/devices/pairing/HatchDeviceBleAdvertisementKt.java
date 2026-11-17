package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.C3cG;
import android.bluetooth.le.ScanRecord;

/* loaded from: classes4.dex */
public abstract class HatchDeviceBleAdvertisementKt {
    public static final int HATCH_PAIRING_FLAG_COMPANY_ID = 65535;
    public static final int LINK_FLAG_BLUETOOTH_GADGET = 2;

    public static final boolean isBluetoothGadgetFlag(int i) {
        return AnonymousClass002.A1L(i & 2);
    }

    public static final Integer linkAdvertisedFlags(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return Integer.valueOf(bArr[0] & 255);
    }

    public static final boolean advertisesBluetoothGadget(ScanRecord scanRecord) {
        Integer numLinkAdvertisedFlags = linkAdvertisedFlags(scanRecord);
        if (numLinkAdvertisedFlags != null) {
            return C3cG.A1J(numLinkAdvertisedFlags.intValue(), false);
        }
        return false;
    }

    public static final Boolean hatchAdvertisedPairingFlag(ScanRecord scanRecord) {
        Integer numLinkAdvertisedFlags = linkAdvertisedFlags(scanRecord);
        if (numLinkAdvertisedFlags != null) {
            return Boolean.valueOf(AnonymousClass002.A1L(numLinkAdvertisedFlags.intValue()));
        }
        return null;
    }

    public static final Integer linkAdvertisedFlags(ScanRecord scanRecord) {
        byte[] manufacturerSpecificData;
        if (scanRecord != null) {
            manufacturerSpecificData = scanRecord.getManufacturerSpecificData(65535);
        } else {
            manufacturerSpecificData = null;
        }
        return linkAdvertisedFlags(manufacturerSpecificData);
    }
}
