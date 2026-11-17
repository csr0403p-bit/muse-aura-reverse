package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchNotificationEventName {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchNotificationEventName[] $VALUES;
    public static final HatchNotificationEventName CLICK;
    public static final HatchNotificationEventName DISMISS;
    public static final HatchNotificationEventName DROP;
    public static final HatchNotificationEventName IMPRESSION;
    public static final HatchNotificationEventName RECEIVED;
    public static final HatchNotificationEventName RELAY_DROP;
    public static final HatchNotificationEventName RELAY_SENT;
    public final String value;

    static {
        HatchNotificationEventName hatchNotificationEventName = new HatchNotificationEventName("RECEIVED", 0, "hatch_notification_received");
        RECEIVED = hatchNotificationEventName;
        HatchNotificationEventName hatchNotificationEventName2 = new HatchNotificationEventName("IMPRESSION", 1, "hatch_notification_impression");
        IMPRESSION = hatchNotificationEventName2;
        HatchNotificationEventName hatchNotificationEventName3 = new HatchNotificationEventName("CLICK", 2, "hatch_notification_click");
        CLICK = hatchNotificationEventName3;
        HatchNotificationEventName hatchNotificationEventName4 = new HatchNotificationEventName("DISMISS", 3, "hatch_notification_dismiss");
        DISMISS = hatchNotificationEventName4;
        HatchNotificationEventName hatchNotificationEventName5 = new HatchNotificationEventName("DROP", 4, "hatch_notification_drop");
        DROP = hatchNotificationEventName5;
        HatchNotificationEventName hatchNotificationEventName6 = new HatchNotificationEventName("RELAY_SENT", 5, "hatch_notification_relay_sent");
        RELAY_SENT = hatchNotificationEventName6;
        HatchNotificationEventName hatchNotificationEventName7 = new HatchNotificationEventName("RELAY_DROP", 6, "hatch_notification_relay_drop");
        RELAY_DROP = hatchNotificationEventName7;
        HatchNotificationEventName[] hatchNotificationEventNameArr = {hatchNotificationEventName, hatchNotificationEventName2, hatchNotificationEventName3, hatchNotificationEventName4, hatchNotificationEventName5, hatchNotificationEventName6, hatchNotificationEventName7};
        $VALUES = hatchNotificationEventNameArr;
        $ENTRIES = C3cG.A0w(hatchNotificationEventNameArr);
    }

    public static Ey9<HatchNotificationEventName> getEntries() {
        return $ENTRIES;
    }

    public static HatchNotificationEventName valueOf(String str) {
        return (HatchNotificationEventName) Enum.valueOf(HatchNotificationEventName.class, str);
    }

    public static HatchNotificationEventName[] values() {
        return (HatchNotificationEventName[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchNotificationEventName(String str, int i, String str2) {
        this.value = str2;
    }
}
