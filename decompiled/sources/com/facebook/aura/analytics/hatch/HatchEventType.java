package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.activation.model.HatchInviteLogging;
import com.facebook.aura.json.ClockCardWireActionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchEventType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchEventType[] $VALUES;
    public static final HatchEventType CLICK;
    public static final HatchEventType DEEP_LINK;
    public static final HatchEventType DISMISS;
    public static final HatchEventType DOUBLE_TAP;
    public static final HatchEventType LONG_PRESS;
    public static final HatchEventType PERMISSION_ACCEPTED;
    public static final HatchEventType PERMISSION_DENIED;
    public static final HatchEventType PERMISSION_PROMPTED;
    public static final HatchEventType PLAY_END;
    public static final HatchEventType PULL_TO_REFRESH;
    public static final HatchEventType SCROLL;
    public static final HatchEventType STATUS_CHECK;
    public static final HatchEventType SWIPE;
    public static final HatchEventType TOGGLE_OFF;
    public static final HatchEventType TOGGLE_ON;
    public static final HatchEventType TYPE;
    public final String value;

    static {
        HatchEventType hatchEventType = new HatchEventType("CLICK", 0, "click");
        CLICK = hatchEventType;
        HatchEventType hatchEventType2 = new HatchEventType("LONG_PRESS", 1, "long_press");
        LONG_PRESS = hatchEventType2;
        HatchEventType hatchEventType3 = new HatchEventType("DOUBLE_TAP", 2, "double_tap");
        DOUBLE_TAP = hatchEventType3;
        HatchEventType hatchEventType4 = new HatchEventType("SWIPE", 3, "swipe");
        SWIPE = hatchEventType4;
        HatchEventType hatchEventType5 = new HatchEventType("SCROLL", 4, "scroll");
        SCROLL = hatchEventType5;
        HatchEventType hatchEventType6 = new HatchEventType("TOGGLE_ON", 5, "toggle_on");
        TOGGLE_ON = hatchEventType6;
        HatchEventType hatchEventType7 = new HatchEventType("TOGGLE_OFF", 6, "toggle_off");
        TOGGLE_OFF = hatchEventType7;
        HatchEventType hatchEventType8 = new HatchEventType("DISMISS", 7, ClockCardWireActionsKt.CLOCK_ACTION_DISMISS);
        DISMISS = hatchEventType8;
        HatchEventType hatchEventType9 = new HatchEventType("TYPE", 8, "type");
        TYPE = hatchEventType9;
        HatchEventType hatchEventType10 = new HatchEventType("PULL_TO_REFRESH", 9, "pull_to_refresh");
        PULL_TO_REFRESH = hatchEventType10;
        HatchEventType hatchEventType11 = new HatchEventType("DEEP_LINK", 10, "deep_link");
        DEEP_LINK = hatchEventType11;
        HatchEventType hatchEventType12 = new HatchEventType("STATUS_CHECK", 11, HatchInviteLogging.EVENT_TYPE_STATUS_CHECK);
        STATUS_CHECK = hatchEventType12;
        HatchEventType hatchEventType13 = new HatchEventType("PERMISSION_PROMPTED", 12, "permission_prompted");
        PERMISSION_PROMPTED = hatchEventType13;
        HatchEventType hatchEventType14 = new HatchEventType("PERMISSION_ACCEPTED", 13, "permission_accepted");
        PERMISSION_ACCEPTED = hatchEventType14;
        HatchEventType hatchEventType15 = new HatchEventType("PERMISSION_DENIED", 14, "permission_denied");
        PERMISSION_DENIED = hatchEventType15;
        HatchEventType hatchEventType16 = new HatchEventType("PLAY_END", 15, "play_end");
        PLAY_END = hatchEventType16;
        HatchEventType[] hatchEventTypeArr = {hatchEventType, hatchEventType2, hatchEventType3, hatchEventType4, hatchEventType5, hatchEventType6, hatchEventType7, hatchEventType8, hatchEventType9, hatchEventType10, hatchEventType11, hatchEventType12, hatchEventType13, hatchEventType14, hatchEventType15, hatchEventType16};
        $VALUES = hatchEventTypeArr;
        $ENTRIES = C3cG.A0w(hatchEventTypeArr);
    }

    public static Ey9<HatchEventType> getEntries() {
        return $ENTRIES;
    }

    public static HatchEventType valueOf(String str) {
        return (HatchEventType) Enum.valueOf(HatchEventType.class, str);
    }

    public static HatchEventType[] values() {
        return (HatchEventType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchEventType(String str, int i, String str2) {
        this.value = str2;
    }
}
