package com.facebook.aura.nodes.core;

import X.C3cG;
import X.Ey9;
import com.facebook.acra.constants.ReportField;
import com.facebook.aura.commands.alarm.HatchReminderNotifierKt;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeHitlGroup {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeHitlGroup[] $VALUES;
    public static final NodeHitlGroup ALARMS;
    public static final NodeHitlGroup APPS;
    public static final NodeHitlGroup BATTERY;
    public static final NodeHitlGroup BROWSER;
    public static final NodeHitlGroup BUG_REPORT;
    public static final NodeHitlGroup CALENDAR;
    public static final NodeHitlGroup CALL_LOG;
    public static final NodeHitlGroup CONTACTS;
    public static final NodeHitlGroup DISPLAY;
    public static final NodeHitlGroup DO_NOT_DISTURB;
    public static final NodeHitlGroup HEALTH;
    public static final NodeHitlGroup LOCATION;
    public static final NodeHitlGroup NAVIGATION;
    public static final NodeHitlGroup NETWORK;
    public static final NodeHitlGroup NOTIFICATIONS;
    public static final NodeHitlGroup OTHER;
    public static final NodeHitlGroup PHONE_CALL;
    public static final NodeHitlGroup PHOTOS;
    public static final NodeHitlGroup REMINDERS;
    public static final NodeHitlGroup SMS;
    public static final NodeHitlGroup SMS_SEND;
    public static final NodeHitlGroup SUBSCRIPTIONS;
    public final String displayLabel;
    public final String wireValue;

    static {
        NodeHitlGroup nodeHitlGroup = new NodeHitlGroup("ALARMS", 0, "alarms", "Alarms");
        ALARMS = nodeHitlGroup;
        NodeHitlGroup nodeHitlGroup2 = new NodeHitlGroup("APPS", 1, "apps", "Apps");
        APPS = nodeHitlGroup2;
        NodeHitlGroup nodeHitlGroup3 = new NodeHitlGroup("BATTERY", 2, "battery", "Battery");
        BATTERY = nodeHitlGroup3;
        NodeHitlGroup nodeHitlGroup4 = new NodeHitlGroup("BROWSER", 3, "browser", "Browser");
        BROWSER = nodeHitlGroup4;
        NodeHitlGroup nodeHitlGroup5 = new NodeHitlGroup("BUG_REPORT", 4, "bug_report", "Bug reports");
        BUG_REPORT = nodeHitlGroup5;
        NodeHitlGroup nodeHitlGroup6 = new NodeHitlGroup("CALENDAR", 5, "calendar", "Calendar");
        CALENDAR = nodeHitlGroup6;
        NodeHitlGroup nodeHitlGroup7 = new NodeHitlGroup("CALL_LOG", 6, "call_log", "Call Log");
        CALL_LOG = nodeHitlGroup7;
        NodeHitlGroup nodeHitlGroup8 = new NodeHitlGroup("CONTACTS", 7, HatchNodeCardJsonKt.TYPE_CONTACTS, "Contacts");
        CONTACTS = nodeHitlGroup8;
        NodeHitlGroup nodeHitlGroup9 = new NodeHitlGroup(ReportField.DISPLAY, 8, "display", "Display");
        DISPLAY = nodeHitlGroup9;
        NodeHitlGroup nodeHitlGroup10 = new NodeHitlGroup("DO_NOT_DISTURB", 9, "do_not_disturb", "Do Not Disturb");
        DO_NOT_DISTURB = nodeHitlGroup10;
        NodeHitlGroup nodeHitlGroup11 = new NodeHitlGroup("HEALTH", 10, "health", "Health");
        HEALTH = nodeHitlGroup11;
        NodeHitlGroup nodeHitlGroup12 = new NodeHitlGroup("LOCATION", 11, MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, "Location");
        LOCATION = nodeHitlGroup12;
        NodeHitlGroup nodeHitlGroup13 = new NodeHitlGroup("NAVIGATION", 12, "navigation", "Navigation");
        NAVIGATION = nodeHitlGroup13;
        NodeHitlGroup nodeHitlGroup14 = new NodeHitlGroup("NETWORK", 13, "network", "Network");
        NETWORK = nodeHitlGroup14;
        NodeHitlGroup nodeHitlGroup15 = new NodeHitlGroup("NOTIFICATIONS", 14, "notifications", "Notifications");
        NOTIFICATIONS = nodeHitlGroup15;
        NodeHitlGroup nodeHitlGroup16 = new NodeHitlGroup("PHONE_CALL", 15, "phone_call", "Calls");
        PHONE_CALL = nodeHitlGroup16;
        NodeHitlGroup nodeHitlGroup17 = new NodeHitlGroup("PHOTOS", 16, "photos", "Photos");
        PHOTOS = nodeHitlGroup17;
        NodeHitlGroup nodeHitlGroup18 = new NodeHitlGroup("REMINDERS", 17, "reminders", HatchReminderNotifierKt.CHANNEL_NAME);
        REMINDERS = nodeHitlGroup18;
        NodeHitlGroup nodeHitlGroup19 = new NodeHitlGroup("SMS", 18, "sms", "Messages");
        SMS = nodeHitlGroup19;
        NodeHitlGroup nodeHitlGroup20 = new NodeHitlGroup("SMS_SEND", 19, "sms_send", "Send messages");
        SMS_SEND = nodeHitlGroup20;
        NodeHitlGroup nodeHitlGroup21 = new NodeHitlGroup("SUBSCRIPTIONS", 20, "subscriptions", "Subscriptions");
        SUBSCRIPTIONS = nodeHitlGroup21;
        NodeHitlGroup nodeHitlGroup22 = new NodeHitlGroup("OTHER", 21, DeviceSmsReaderKt.ATTACHMENT_OTHER, "Device Commands");
        OTHER = nodeHitlGroup22;
        NodeHitlGroup[] nodeHitlGroupArr = {nodeHitlGroup, nodeHitlGroup2, nodeHitlGroup3, nodeHitlGroup4, nodeHitlGroup5, nodeHitlGroup6, nodeHitlGroup7, nodeHitlGroup8, nodeHitlGroup9, nodeHitlGroup10, nodeHitlGroup11, nodeHitlGroup12, nodeHitlGroup13, nodeHitlGroup14, nodeHitlGroup15, nodeHitlGroup16, nodeHitlGroup17, nodeHitlGroup18, nodeHitlGroup19, nodeHitlGroup20, nodeHitlGroup21, nodeHitlGroup22};
        $VALUES = nodeHitlGroupArr;
        $ENTRIES = C3cG.A0w(nodeHitlGroupArr);
    }

    public static Ey9<NodeHitlGroup> getEntries() {
        return $ENTRIES;
    }

    public static NodeHitlGroup valueOf(String str) {
        return (NodeHitlGroup) Enum.valueOf(NodeHitlGroup.class, str);
    }

    public static NodeHitlGroup[] values() {
        return (NodeHitlGroup[]) $VALUES.clone();
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public NodeHitlGroup(String str, int i, String str2, String str3) {
        this.wireValue = str2;
        this.displayLabel = str3;
    }
}
