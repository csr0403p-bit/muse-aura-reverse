package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchWidgetKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchWidgetKind[] $VALUES;
    public static final HatchWidgetKind ASK_BAR;
    public static final HatchWidgetKind AVATAR;
    public static final HatchWidgetKind FEED;
    public static final HatchWidgetKind GOALS;
    public static final HatchWidgetKind IDEAS;
    public static final HatchWidgetKind SPACE;
    public final String value;

    static {
        HatchWidgetKind hatchWidgetKind = new HatchWidgetKind("AVATAR", 0, "HatchWidget");
        AVATAR = hatchWidgetKind;
        HatchWidgetKind hatchWidgetKind2 = new HatchWidgetKind("FEED", 1, "HatchFeedWidget");
        FEED = hatchWidgetKind2;
        HatchWidgetKind hatchWidgetKind3 = new HatchWidgetKind("SPACE", 2, "HatchSpaceWidget");
        SPACE = hatchWidgetKind3;
        HatchWidgetKind hatchWidgetKind4 = new HatchWidgetKind("IDEAS", 3, "HatchIdeasWidget");
        IDEAS = hatchWidgetKind4;
        HatchWidgetKind hatchWidgetKind5 = new HatchWidgetKind("GOALS", 4, "HatchGoalsWidget");
        GOALS = hatchWidgetKind5;
        HatchWidgetKind hatchWidgetKind6 = new HatchWidgetKind("ASK_BAR", 5, "HatchAskBarWidget");
        ASK_BAR = hatchWidgetKind6;
        HatchWidgetKind[] hatchWidgetKindArr = {hatchWidgetKind, hatchWidgetKind2, hatchWidgetKind3, hatchWidgetKind4, hatchWidgetKind5, hatchWidgetKind6};
        $VALUES = hatchWidgetKindArr;
        $ENTRIES = C3cG.A0w(hatchWidgetKindArr);
    }

    public static Ey9<HatchWidgetKind> getEntries() {
        return $ENTRIES;
    }

    public static HatchWidgetKind valueOf(String str) {
        return (HatchWidgetKind) Enum.valueOf(HatchWidgetKind.class, str);
    }

    public static HatchWidgetKind[] values() {
        return (HatchWidgetKind[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchWidgetKind(String str, int i, String str2) {
        this.value = str2;
    }
}
