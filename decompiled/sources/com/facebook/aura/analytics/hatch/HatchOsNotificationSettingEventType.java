package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchOsNotificationSettingEventType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchOsNotificationSettingEventType[] $VALUES;
    public static final HatchOsNotificationSettingEventType PERMISSION_CHANGE;
    public static final HatchOsNotificationSettingEventType PUSH_RECEIVED_SNAPSHOT;
    public static final HatchOsNotificationSettingEventType SNAPSHOT;
    public final String value;

    static {
        HatchOsNotificationSettingEventType hatchOsNotificationSettingEventType = new HatchOsNotificationSettingEventType("SNAPSHOT", 0, "snapshot");
        SNAPSHOT = hatchOsNotificationSettingEventType;
        HatchOsNotificationSettingEventType hatchOsNotificationSettingEventType2 = new HatchOsNotificationSettingEventType("PUSH_RECEIVED_SNAPSHOT", 1, "push_received_snapshot");
        PUSH_RECEIVED_SNAPSHOT = hatchOsNotificationSettingEventType2;
        HatchOsNotificationSettingEventType hatchOsNotificationSettingEventType3 = new HatchOsNotificationSettingEventType("PERMISSION_CHANGE", 2, "permission_change");
        PERMISSION_CHANGE = hatchOsNotificationSettingEventType3;
        HatchOsNotificationSettingEventType[] hatchOsNotificationSettingEventTypeArr = {hatchOsNotificationSettingEventType, hatchOsNotificationSettingEventType2, hatchOsNotificationSettingEventType3};
        $VALUES = hatchOsNotificationSettingEventTypeArr;
        $ENTRIES = C3cG.A0w(hatchOsNotificationSettingEventTypeArr);
    }

    public static Ey9<HatchOsNotificationSettingEventType> getEntries() {
        return $ENTRIES;
    }

    public static HatchOsNotificationSettingEventType valueOf(String str) {
        return (HatchOsNotificationSettingEventType) Enum.valueOf(HatchOsNotificationSettingEventType.class, str);
    }

    public static HatchOsNotificationSettingEventType[] values() {
        return (HatchOsNotificationSettingEventType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchOsNotificationSettingEventType(String str, int i, String str2) {
        this.value = str2;
    }
}
