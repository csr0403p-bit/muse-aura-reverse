package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LocalDeviceConnectorPermissionRequirement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalDeviceConnectorPermissionRequirement[] $VALUES;
    public static final LocalDeviceConnectorPermissionRequirement CALENDAR;
    public static final LocalDeviceConnectorPermissionRequirement CALL_LOG;
    public static final LocalDeviceConnectorPermissionRequirement CONTACTS;
    public static final LocalDeviceConnectorPermissionRequirement HEALTH;
    public static final LocalDeviceConnectorPermissionRequirement NOTIFICATIONS;
    public static final LocalDeviceConnectorPermissionRequirement PHONE_CALL;
    public static final LocalDeviceConnectorPermissionRequirement PHOTOS;
    public static final LocalDeviceConnectorPermissionRequirement SMS;

    static {
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement = new LocalDeviceConnectorPermissionRequirement("CALENDAR", 0);
        CALENDAR = localDeviceConnectorPermissionRequirement;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement2 = new LocalDeviceConnectorPermissionRequirement("CONTACTS", 1);
        CONTACTS = localDeviceConnectorPermissionRequirement2;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement3 = new LocalDeviceConnectorPermissionRequirement("SMS", 2);
        SMS = localDeviceConnectorPermissionRequirement3;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement4 = new LocalDeviceConnectorPermissionRequirement("PHONE_CALL", 3);
        PHONE_CALL = localDeviceConnectorPermissionRequirement4;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement5 = new LocalDeviceConnectorPermissionRequirement("NOTIFICATIONS", 4);
        NOTIFICATIONS = localDeviceConnectorPermissionRequirement5;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement6 = new LocalDeviceConnectorPermissionRequirement("CALL_LOG", 5);
        CALL_LOG = localDeviceConnectorPermissionRequirement6;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement7 = new LocalDeviceConnectorPermissionRequirement("HEALTH", 6);
        HEALTH = localDeviceConnectorPermissionRequirement7;
        LocalDeviceConnectorPermissionRequirement localDeviceConnectorPermissionRequirement8 = new LocalDeviceConnectorPermissionRequirement("PHOTOS", 7);
        PHOTOS = localDeviceConnectorPermissionRequirement8;
        LocalDeviceConnectorPermissionRequirement[] localDeviceConnectorPermissionRequirementArr = {localDeviceConnectorPermissionRequirement, localDeviceConnectorPermissionRequirement2, localDeviceConnectorPermissionRequirement3, localDeviceConnectorPermissionRequirement4, localDeviceConnectorPermissionRequirement5, localDeviceConnectorPermissionRequirement6, localDeviceConnectorPermissionRequirement7, localDeviceConnectorPermissionRequirement8};
        $VALUES = localDeviceConnectorPermissionRequirementArr;
        $ENTRIES = C3cG.A0w(localDeviceConnectorPermissionRequirementArr);
    }

    public static Ey9<LocalDeviceConnectorPermissionRequirement> getEntries() {
        return $ENTRIES;
    }

    public static LocalDeviceConnectorPermissionRequirement valueOf(String str) {
        return (LocalDeviceConnectorPermissionRequirement) Enum.valueOf(LocalDeviceConnectorPermissionRequirement.class, str);
    }

    public static LocalDeviceConnectorPermissionRequirement[] values() {
        return (LocalDeviceConnectorPermissionRequirement[]) $VALUES.clone();
    }

    public LocalDeviceConnectorPermissionRequirement(String str, int i) {
    }
}
