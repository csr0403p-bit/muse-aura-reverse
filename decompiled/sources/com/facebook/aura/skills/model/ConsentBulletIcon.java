package com.facebook.aura.skills.model;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConsentBulletIcon {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConsentBulletIcon[] $VALUES;
    public static final ConsentBulletIcon CAUTION;
    public static final ConsentBulletIcon CONNECTOR;
    public static final ConsentBulletIcon DATA_TYPES;
    public static final ConsentBulletIcon INFO;
    public static final ConsentBulletIcon SETTINGS;
    public static final ConsentBulletIcon SMART_GLASSES;
    public static final ConsentBulletIcon STORAGE;
    public static final ConsentBulletIcon UNSPECIFIED;
    public static final ConsentBulletIcon WARNING;

    static {
        ConsentBulletIcon consentBulletIcon = new ConsentBulletIcon("UNSPECIFIED", 0);
        UNSPECIFIED = consentBulletIcon;
        ConsentBulletIcon consentBulletIcon2 = new ConsentBulletIcon("STORAGE", 1);
        STORAGE = consentBulletIcon2;
        ConsentBulletIcon consentBulletIcon3 = new ConsentBulletIcon("DATA_TYPES", 2);
        DATA_TYPES = consentBulletIcon3;
        ConsentBulletIcon consentBulletIcon4 = new ConsentBulletIcon("CAUTION", 3);
        CAUTION = consentBulletIcon4;
        ConsentBulletIcon consentBulletIcon5 = new ConsentBulletIcon("INFO", 4);
        INFO = consentBulletIcon5;
        ConsentBulletIcon consentBulletIcon6 = new ConsentBulletIcon("SETTINGS", 5);
        SETTINGS = consentBulletIcon6;
        ConsentBulletIcon consentBulletIcon7 = new ConsentBulletIcon("WARNING", 6);
        WARNING = consentBulletIcon7;
        ConsentBulletIcon consentBulletIcon8 = new ConsentBulletIcon("CONNECTOR", 7);
        CONNECTOR = consentBulletIcon8;
        ConsentBulletIcon consentBulletIcon9 = new ConsentBulletIcon("SMART_GLASSES", 8);
        SMART_GLASSES = consentBulletIcon9;
        ConsentBulletIcon[] consentBulletIconArr = {consentBulletIcon, consentBulletIcon2, consentBulletIcon3, consentBulletIcon4, consentBulletIcon5, consentBulletIcon6, consentBulletIcon7, consentBulletIcon8, consentBulletIcon9};
        $VALUES = consentBulletIconArr;
        $ENTRIES = C3cG.A0w(consentBulletIconArr);
    }

    public static Ey9<ConsentBulletIcon> getEntries() {
        return $ENTRIES;
    }

    public static ConsentBulletIcon valueOf(String str) {
        return (ConsentBulletIcon) Enum.valueOf(ConsentBulletIcon.class, str);
    }

    public static ConsentBulletIcon[] values() {
        return (ConsentBulletIcon[]) $VALUES.clone();
    }

    public ConsentBulletIcon(String str, int i) {
    }
}
