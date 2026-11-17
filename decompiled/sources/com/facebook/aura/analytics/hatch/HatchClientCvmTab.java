package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchClientCvmTab {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchClientCvmTab[] $VALUES;
    public static final HatchClientCvmTab CHAT;
    public static final HatchClientCvmTab CONNECTIONS;
    public static final HatchClientCvmTab FEED;
    public static final HatchClientCvmTab GOALS;
    public static final HatchClientCvmTab IDEAS;
    public static final HatchClientCvmTab LIBRARY;

    static {
        HatchClientCvmTab hatchClientCvmTab = new HatchClientCvmTab("CHAT", 0);
        CHAT = hatchClientCvmTab;
        HatchClientCvmTab hatchClientCvmTab2 = new HatchClientCvmTab("CONNECTIONS", 1);
        CONNECTIONS = hatchClientCvmTab2;
        HatchClientCvmTab hatchClientCvmTab3 = new HatchClientCvmTab("FEED", 2);
        FEED = hatchClientCvmTab3;
        HatchClientCvmTab hatchClientCvmTab4 = new HatchClientCvmTab("GOALS", 3);
        GOALS = hatchClientCvmTab4;
        HatchClientCvmTab hatchClientCvmTab5 = new HatchClientCvmTab("IDEAS", 4);
        IDEAS = hatchClientCvmTab5;
        HatchClientCvmTab hatchClientCvmTab6 = new HatchClientCvmTab("LIBRARY", 5);
        LIBRARY = hatchClientCvmTab6;
        HatchClientCvmTab[] hatchClientCvmTabArr = {hatchClientCvmTab, hatchClientCvmTab2, hatchClientCvmTab3, hatchClientCvmTab4, hatchClientCvmTab5, hatchClientCvmTab6};
        $VALUES = hatchClientCvmTabArr;
        $ENTRIES = new F3w(hatchClientCvmTabArr);
    }

    public static Ey9<HatchClientCvmTab> getEntries() {
        return $ENTRIES;
    }

    public static HatchClientCvmTab valueOf(String str) {
        return (HatchClientCvmTab) Enum.valueOf(HatchClientCvmTab.class, str);
    }

    public static HatchClientCvmTab[] values() {
        return (HatchClientCvmTab[]) $VALUES.clone();
    }

    public HatchClientCvmTab(String str, int i) {
    }
}
