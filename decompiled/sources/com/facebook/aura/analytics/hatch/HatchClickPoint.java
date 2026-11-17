package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchClickPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchClickPoint[] $VALUES;
    public static final HatchClickPoint ASSIST;
    public static final HatchClickPoint BACK_GESTURE;
    public static final HatchClickPoint BUTTON_TAP;
    public static final HatchClickPoint COMPLICATION;
    public static final HatchClickPoint CONVERSATION_STARTER;
    public static final HatchClickPoint DEEP_LINK;
    public static final HatchClickPoint FEED_CARD;
    public static final HatchClickPoint HISTORY_ITEM_TAP;
    public static final HatchClickPoint KEYBOARD_SHORTCUT;
    public static final HatchClickPoint PUSH_NOTIFICATION;
    public static final HatchClickPoint SEARCH_RESULT;
    public static final HatchClickPoint SYSTEM;
    public static final HatchClickPoint TAB_TAP;
    public static final HatchClickPoint WATCH_FACE;
    public final String value;

    static {
        HatchClickPoint hatchClickPoint = new HatchClickPoint("TAB_TAP", 0, "tab_tap");
        TAB_TAP = hatchClickPoint;
        HatchClickPoint hatchClickPoint2 = new HatchClickPoint("BUTTON_TAP", 1, "button_tap");
        BUTTON_TAP = hatchClickPoint2;
        HatchClickPoint hatchClickPoint3 = new HatchClickPoint("HISTORY_ITEM_TAP", 2, "history_item_tap");
        HISTORY_ITEM_TAP = hatchClickPoint3;
        HatchClickPoint hatchClickPoint4 = new HatchClickPoint("DEEP_LINK", 3, "deep_link");
        DEEP_LINK = hatchClickPoint4;
        HatchClickPoint hatchClickPoint5 = new HatchClickPoint("PUSH_NOTIFICATION", 4, "push_notification");
        PUSH_NOTIFICATION = hatchClickPoint5;
        HatchClickPoint hatchClickPoint6 = new HatchClickPoint("CONVERSATION_STARTER", 5, "conversation_starter");
        CONVERSATION_STARTER = hatchClickPoint6;
        HatchClickPoint hatchClickPoint7 = new HatchClickPoint("SEARCH_RESULT", 6, "search_result");
        SEARCH_RESULT = hatchClickPoint7;
        HatchClickPoint hatchClickPoint8 = new HatchClickPoint("FEED_CARD", 7, "feed_card");
        FEED_CARD = hatchClickPoint8;
        HatchClickPoint hatchClickPoint9 = new HatchClickPoint("SYSTEM", 8, PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM);
        SYSTEM = hatchClickPoint9;
        HatchClickPoint hatchClickPoint10 = new HatchClickPoint("BACK_GESTURE", 9, "back_gesture");
        BACK_GESTURE = hatchClickPoint10;
        HatchClickPoint hatchClickPoint11 = new HatchClickPoint("KEYBOARD_SHORTCUT", 10, "keyboard_shortcut");
        KEYBOARD_SHORTCUT = hatchClickPoint11;
        HatchClickPoint hatchClickPoint12 = new HatchClickPoint("COMPLICATION", 11, "complication");
        COMPLICATION = hatchClickPoint12;
        HatchClickPoint hatchClickPoint13 = new HatchClickPoint("WATCH_FACE", 12, "watch_face");
        WATCH_FACE = hatchClickPoint13;
        HatchClickPoint hatchClickPoint14 = new HatchClickPoint("ASSIST", 13, "assist");
        ASSIST = hatchClickPoint14;
        HatchClickPoint[] hatchClickPointArr = {hatchClickPoint, hatchClickPoint2, hatchClickPoint3, hatchClickPoint4, hatchClickPoint5, hatchClickPoint6, hatchClickPoint7, hatchClickPoint8, hatchClickPoint9, hatchClickPoint10, hatchClickPoint11, hatchClickPoint12, hatchClickPoint13, hatchClickPoint14};
        $VALUES = hatchClickPointArr;
        $ENTRIES = new F3w(hatchClickPointArr);
    }

    public static Ey9<HatchClickPoint> getEntries() {
        return $ENTRIES;
    }

    public static HatchClickPoint valueOf(String str) {
        return (HatchClickPoint) Enum.valueOf(HatchClickPoint.class, str);
    }

    public static HatchClickPoint[] values() {
        return (HatchClickPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchClickPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
