package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchEventSubtype {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchEventSubtype[] $VALUES;
    public static final HatchEventSubtype BACKGROUND;
    public static final HatchEventSubtype BACK_NAVIGATION;
    public static final HatchEventSubtype CONVERSATION_OPEN;
    public static final HatchEventSubtype DEEP_LINK;
    public static final HatchEventSubtype FOREGROUND;
    public static final HatchEventSubtype HIDE_MODULE;
    public static final HatchEventSubtype PUSH_NOTIFICATION;
    public static final HatchEventSubtype RESIGN;
    public static final HatchEventSubtype STATUS_CLOSE;
    public static final HatchEventSubtype STATUS_OPEN;
    public static final HatchEventSubtype TAB_SWITCH;
    public final String value;

    static {
        HatchEventSubtype hatchEventSubtype = new HatchEventSubtype("FOREGROUND", 0, "foreground");
        FOREGROUND = hatchEventSubtype;
        HatchEventSubtype hatchEventSubtype2 = new HatchEventSubtype("BACKGROUND", 1, "background");
        BACKGROUND = hatchEventSubtype2;
        HatchEventSubtype hatchEventSubtype3 = new HatchEventSubtype("RESIGN", 2, "resign");
        RESIGN = hatchEventSubtype3;
        HatchEventSubtype hatchEventSubtype4 = new HatchEventSubtype("CONVERSATION_OPEN", 3, "conversation_open");
        CONVERSATION_OPEN = hatchEventSubtype4;
        HatchEventSubtype hatchEventSubtype5 = new HatchEventSubtype("HIDE_MODULE", 4, "hide_module");
        HIDE_MODULE = hatchEventSubtype5;
        HatchEventSubtype hatchEventSubtype6 = new HatchEventSubtype("TAB_SWITCH", 5, "tab_switch");
        TAB_SWITCH = hatchEventSubtype6;
        HatchEventSubtype hatchEventSubtype7 = new HatchEventSubtype("DEEP_LINK", 6, "deep_link");
        DEEP_LINK = hatchEventSubtype7;
        HatchEventSubtype hatchEventSubtype8 = new HatchEventSubtype("PUSH_NOTIFICATION", 7, "push_notification");
        PUSH_NOTIFICATION = hatchEventSubtype8;
        HatchEventSubtype hatchEventSubtype9 = new HatchEventSubtype("BACK_NAVIGATION", 8, "back_navigation");
        BACK_NAVIGATION = hatchEventSubtype9;
        HatchEventSubtype hatchEventSubtype10 = new HatchEventSubtype("STATUS_OPEN", 9, "status_open");
        STATUS_OPEN = hatchEventSubtype10;
        HatchEventSubtype hatchEventSubtype11 = new HatchEventSubtype("STATUS_CLOSE", 10, "status_close");
        STATUS_CLOSE = hatchEventSubtype11;
        HatchEventSubtype[] hatchEventSubtypeArr = {hatchEventSubtype, hatchEventSubtype2, hatchEventSubtype3, hatchEventSubtype4, hatchEventSubtype5, hatchEventSubtype6, hatchEventSubtype7, hatchEventSubtype8, hatchEventSubtype9, hatchEventSubtype10, hatchEventSubtype11};
        $VALUES = hatchEventSubtypeArr;
        $ENTRIES = new F3w(hatchEventSubtypeArr);
    }

    public static Ey9<HatchEventSubtype> getEntries() {
        return $ENTRIES;
    }

    public static HatchEventSubtype valueOf(String str) {
        return (HatchEventSubtype) Enum.valueOf(HatchEventSubtype.class, str);
    }

    public static HatchEventSubtype[] values() {
        return (HatchEventSubtype[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchEventSubtype(String str, int i, String str2) {
        this.value = str2;
    }
}
