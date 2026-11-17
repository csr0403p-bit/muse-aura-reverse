package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkDeviceKeySetupFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkDeviceKeySetupFailure[] $VALUES;
    public static final LinkDeviceKeySetupFailure CVM_UNSUPPORTED;
    public static final LinkDeviceKeySetupFailure DEVICE_KEY_UNAVAILABLE;
    public static final LinkDeviceKeySetupFailure DEVICE_ROLE_CONFLICT;
    public static final LinkDeviceKeySetupFailure FIRMWARE_UPDATE_REQUIRED;
    public static final LinkDeviceKeySetupFailure NODE_ID_IN_USE;
    public static final LinkDeviceKeySetupFailure OTA_ROUND_TWO_EXPIRED;
    public static final LinkDeviceKeySetupFailure PAIRED_NODES_UNAVAILABLE;
    public static final LinkDeviceKeySetupFailure REPLACEMENT_DECLINED;

    static {
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure = new LinkDeviceKeySetupFailure("FIRMWARE_UPDATE_REQUIRED", 0);
        FIRMWARE_UPDATE_REQUIRED = linkDeviceKeySetupFailure;
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure2 = new LinkDeviceKeySetupFailure("CVM_UNSUPPORTED", 1);
        CVM_UNSUPPORTED = linkDeviceKeySetupFailure2;
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure3 = new LinkDeviceKeySetupFailure("DEVICE_KEY_UNAVAILABLE", 2);
        DEVICE_KEY_UNAVAILABLE = linkDeviceKeySetupFailure3;
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure4 = new LinkDeviceKeySetupFailure("DEVICE_ROLE_CONFLICT", 3);
        DEVICE_ROLE_CONFLICT = linkDeviceKeySetupFailure4;
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure5 = new LinkDeviceKeySetupFailure("REPLACEMENT_DECLINED", 4);
        REPLACEMENT_DECLINED = linkDeviceKeySetupFailure5;
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure6 = new LinkDeviceKeySetupFailure("NODE_ID_IN_USE", 5);
        NODE_ID_IN_USE = linkDeviceKeySetupFailure6;
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure7 = new LinkDeviceKeySetupFailure("PAIRED_NODES_UNAVAILABLE", 6);
        PAIRED_NODES_UNAVAILABLE = linkDeviceKeySetupFailure7;
        LinkDeviceKeySetupFailure linkDeviceKeySetupFailure8 = new LinkDeviceKeySetupFailure("OTA_ROUND_TWO_EXPIRED", 7);
        OTA_ROUND_TWO_EXPIRED = linkDeviceKeySetupFailure8;
        LinkDeviceKeySetupFailure[] linkDeviceKeySetupFailureArr = {linkDeviceKeySetupFailure, linkDeviceKeySetupFailure2, linkDeviceKeySetupFailure3, linkDeviceKeySetupFailure4, linkDeviceKeySetupFailure5, linkDeviceKeySetupFailure6, linkDeviceKeySetupFailure7, linkDeviceKeySetupFailure8};
        $VALUES = linkDeviceKeySetupFailureArr;
        $ENTRIES = C3cG.A0w(linkDeviceKeySetupFailureArr);
    }

    public static Ey9<LinkDeviceKeySetupFailure> getEntries() {
        return $ENTRIES;
    }

    public static LinkDeviceKeySetupFailure valueOf(String str) {
        return (LinkDeviceKeySetupFailure) Enum.valueOf(LinkDeviceKeySetupFailure.class, str);
    }

    public static LinkDeviceKeySetupFailure[] values() {
        return (LinkDeviceKeySetupFailure[]) $VALUES.clone();
    }

    public LinkDeviceKeySetupFailure(String str, int i) {
    }
}
