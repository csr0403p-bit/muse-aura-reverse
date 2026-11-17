package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.library.view.GoalCreationKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchComposerEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchComposerEntryPoint[] $VALUES;
    public static final HatchComposerEntryPoint ASSIST;
    public static final HatchComposerEntryPoint CARD_AUTO_SEND;
    public static final HatchComposerEntryPoint CONNECTED_APPS;
    public static final HatchComposerEntryPoint CREATE_SPACE;
    public static final HatchComposerEntryPoint DEEP_LINK;
    public static final HatchComposerEntryPoint FEED_CARD;
    public static final HatchComposerEntryPoint FLOCK_FEED_CARD;
    public static final HatchComposerEntryPoint GOAL_DISCUSS;
    public static final HatchComposerEntryPoint GOAL_SUBGOAL;
    public static final HatchComposerEntryPoint NEW_GOAL;
    public static final HatchComposerEntryPoint NONE;
    public static final HatchComposerEntryPoint PROCESS_TEXT;
    public static final HatchComposerEntryPoint SHARE_INTENT;
    public final String value;

    static {
        HatchComposerEntryPoint hatchComposerEntryPoint = new HatchComposerEntryPoint(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, "none");
        NONE = hatchComposerEntryPoint;
        HatchComposerEntryPoint hatchComposerEntryPoint2 = new HatchComposerEntryPoint(GoalCreationKt.NEW_GOAL_CATEGORY, 1, "new_goal");
        NEW_GOAL = hatchComposerEntryPoint2;
        HatchComposerEntryPoint hatchComposerEntryPoint3 = new HatchComposerEntryPoint("GOAL_SUBGOAL", 2, "goal_subgoal");
        GOAL_SUBGOAL = hatchComposerEntryPoint3;
        HatchComposerEntryPoint hatchComposerEntryPoint4 = new HatchComposerEntryPoint("GOAL_DISCUSS", 3, "goal_discuss");
        GOAL_DISCUSS = hatchComposerEntryPoint4;
        HatchComposerEntryPoint hatchComposerEntryPoint5 = new HatchComposerEntryPoint("CREATE_SPACE", 4, "create_space");
        CREATE_SPACE = hatchComposerEntryPoint5;
        HatchComposerEntryPoint hatchComposerEntryPoint6 = new HatchComposerEntryPoint("CONNECTED_APPS", 5, "connected_apps");
        CONNECTED_APPS = hatchComposerEntryPoint6;
        HatchComposerEntryPoint hatchComposerEntryPoint7 = new HatchComposerEntryPoint("SHARE_INTENT", 6, "share_intent");
        SHARE_INTENT = hatchComposerEntryPoint7;
        HatchComposerEntryPoint hatchComposerEntryPoint8 = new HatchComposerEntryPoint("PROCESS_TEXT", 7, "process_text");
        PROCESS_TEXT = hatchComposerEntryPoint8;
        HatchComposerEntryPoint hatchComposerEntryPoint9 = new HatchComposerEntryPoint("ASSIST", 8, "assist");
        ASSIST = hatchComposerEntryPoint9;
        HatchComposerEntryPoint hatchComposerEntryPoint10 = new HatchComposerEntryPoint("FLOCK_FEED_CARD", 9, "flock_feed_card");
        FLOCK_FEED_CARD = hatchComposerEntryPoint10;
        HatchComposerEntryPoint hatchComposerEntryPoint11 = new HatchComposerEntryPoint("FEED_CARD", 10, "feed_card");
        FEED_CARD = hatchComposerEntryPoint11;
        HatchComposerEntryPoint hatchComposerEntryPoint12 = new HatchComposerEntryPoint("DEEP_LINK", 11, "deep_link");
        DEEP_LINK = hatchComposerEntryPoint12;
        HatchComposerEntryPoint hatchComposerEntryPoint13 = new HatchComposerEntryPoint("CARD_AUTO_SEND", 12, "card_auto_send");
        CARD_AUTO_SEND = hatchComposerEntryPoint13;
        HatchComposerEntryPoint[] hatchComposerEntryPointArr = {hatchComposerEntryPoint, hatchComposerEntryPoint2, hatchComposerEntryPoint3, hatchComposerEntryPoint4, hatchComposerEntryPoint5, hatchComposerEntryPoint6, hatchComposerEntryPoint7, hatchComposerEntryPoint8, hatchComposerEntryPoint9, hatchComposerEntryPoint10, hatchComposerEntryPoint11, hatchComposerEntryPoint12, hatchComposerEntryPoint13};
        $VALUES = hatchComposerEntryPointArr;
        $ENTRIES = new F3w(hatchComposerEntryPointArr);
    }

    public static Ey9<HatchComposerEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static HatchComposerEntryPoint valueOf(String str) {
        return (HatchComposerEntryPoint) Enum.valueOf(HatchComposerEntryPoint.class, str);
    }

    public static HatchComposerEntryPoint[] values() {
        return (HatchComposerEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchComposerEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
