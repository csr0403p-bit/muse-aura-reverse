package com.facebook.aura.navigation.key;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchStatusTab {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchStatusTab[] $VALUES;
    public static final HatchStatusTab ACTIVITY;
    public static final HatchStatusTab APPROVALS;
    public static final Companion Companion;
    public static final HatchStatusTab DESKTOP;
    public static final HatchStatusTab IDENTITY;
    public static final HatchStatusTab TASKS;
    public final String wireValue;

    static {
        HatchStatusTab hatchStatusTab = new HatchStatusTab("ACTIVITY", 0, "activity");
        ACTIVITY = hatchStatusTab;
        HatchStatusTab hatchStatusTab2 = new HatchStatusTab("APPROVALS", 1, "approvals");
        APPROVALS = hatchStatusTab2;
        HatchStatusTab hatchStatusTab3 = new HatchStatusTab("DESKTOP", 2, "desktop");
        DESKTOP = hatchStatusTab3;
        HatchStatusTab hatchStatusTab4 = new HatchStatusTab("TASKS", 3, "tasks");
        TASKS = hatchStatusTab4;
        HatchStatusTab hatchStatusTab5 = new HatchStatusTab("IDENTITY", 4, "identity");
        IDENTITY = hatchStatusTab5;
        HatchStatusTab[] hatchStatusTabArr = {hatchStatusTab, hatchStatusTab2, hatchStatusTab3, hatchStatusTab4, hatchStatusTab5};
        $VALUES = hatchStatusTabArr;
        $ENTRIES = C3cG.A0w(hatchStatusTabArr);
        Companion = new Companion();
    }

    public static Ey9<HatchStatusTab> getEntries() {
        return $ENTRIES;
    }

    public static HatchStatusTab valueOf(String str) {
        return (HatchStatusTab) Enum.valueOf(HatchStatusTab.class, str);
    }

    public static HatchStatusTab[] values() {
        return (HatchStatusTab[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final HatchStatusTab fromWire(String str) {
            HatchStatusTab hatchStatusTab = null;
            if (str == null) {
                return null;
            }
            Iterator<HatchStatusTab> it = HatchStatusTab.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HatchStatusTab next = it.next();
                if (str.equals(next.getWireValue())) {
                    hatchStatusTab = next;
                    break;
                }
            }
            return hatchStatusTab;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchStatusTab(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
