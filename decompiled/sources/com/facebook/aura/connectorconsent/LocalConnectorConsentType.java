package com.facebook.aura.connectorconsent;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LocalConnectorConsentType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalConnectorConsentType[] $VALUES;
    public static final LocalConnectorConsentType CALENDAR;
    public static final LocalConnectorConsentType CALL_LOG;
    public static final LocalConnectorConsentType CONTACTS;
    public static final LocalConnectorConsentType HEALTH;
    public static final LocalConnectorConsentType LOCATION;
    public static final LocalConnectorConsentType MESSAGES;
    public static final LocalConnectorConsentType NOTIFICATIONS;
    public static final LocalConnectorConsentType PHONE;
    public static final LocalConnectorConsentType PHOTOS;

    static {
        LocalConnectorConsentType localConnectorConsentType = new LocalConnectorConsentType("CALENDAR", 0);
        CALENDAR = localConnectorConsentType;
        LocalConnectorConsentType localConnectorConsentType2 = new LocalConnectorConsentType("CONTACTS", 1);
        CONTACTS = localConnectorConsentType2;
        LocalConnectorConsentType localConnectorConsentType3 = new LocalConnectorConsentType("MESSAGES", 2);
        MESSAGES = localConnectorConsentType3;
        LocalConnectorConsentType localConnectorConsentType4 = new LocalConnectorConsentType("PHONE", 3);
        PHONE = localConnectorConsentType4;
        LocalConnectorConsentType localConnectorConsentType5 = new LocalConnectorConsentType("NOTIFICATIONS", 4);
        NOTIFICATIONS = localConnectorConsentType5;
        LocalConnectorConsentType localConnectorConsentType6 = new LocalConnectorConsentType("CALL_LOG", 5);
        CALL_LOG = localConnectorConsentType6;
        LocalConnectorConsentType localConnectorConsentType7 = new LocalConnectorConsentType("LOCATION", 6);
        LOCATION = localConnectorConsentType7;
        LocalConnectorConsentType localConnectorConsentType8 = new LocalConnectorConsentType("HEALTH", 7);
        HEALTH = localConnectorConsentType8;
        LocalConnectorConsentType localConnectorConsentType9 = new LocalConnectorConsentType("PHOTOS", 8);
        PHOTOS = localConnectorConsentType9;
        LocalConnectorConsentType[] localConnectorConsentTypeArr = {localConnectorConsentType, localConnectorConsentType2, localConnectorConsentType3, localConnectorConsentType4, localConnectorConsentType5, localConnectorConsentType6, localConnectorConsentType7, localConnectorConsentType8, localConnectorConsentType9};
        $VALUES = localConnectorConsentTypeArr;
        $ENTRIES = C3cG.A0w(localConnectorConsentTypeArr);
    }

    public static Ey9<LocalConnectorConsentType> getEntries() {
        return $ENTRIES;
    }

    public static LocalConnectorConsentType valueOf(String str) {
        return (LocalConnectorConsentType) Enum.valueOf(LocalConnectorConsentType.class, str);
    }

    public static LocalConnectorConsentType[] values() {
        return (LocalConnectorConsentType[]) $VALUES.clone();
    }

    public LocalConnectorConsentType(String str, int i) {
    }
}
