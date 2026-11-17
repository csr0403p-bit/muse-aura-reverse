package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchSpaceEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSpaceEntryPoint[] $VALUES;
    public static final HatchSpaceEntryPoint CHAT;
    public static final HatchSpaceEntryPoint LIBRARY;
    public static final HatchSpaceEntryPoint OTHER;
    public static final HatchSpaceEntryPoint PEER_SPACE;
    public static final HatchSpaceEntryPoint SIDEBAR;
    public static final HatchSpaceEntryPoint TAB;
    public final String value;

    static {
        HatchSpaceEntryPoint hatchSpaceEntryPoint = new HatchSpaceEntryPoint("SIDEBAR", 0, "sidebar");
        SIDEBAR = hatchSpaceEntryPoint;
        HatchSpaceEntryPoint hatchSpaceEntryPoint2 = new HatchSpaceEntryPoint("TAB", 1, "tab");
        TAB = hatchSpaceEntryPoint2;
        HatchSpaceEntryPoint hatchSpaceEntryPoint3 = new HatchSpaceEntryPoint("LIBRARY", 2, "library");
        LIBRARY = hatchSpaceEntryPoint3;
        HatchSpaceEntryPoint hatchSpaceEntryPoint4 = new HatchSpaceEntryPoint("CHAT", 3, "chat");
        CHAT = hatchSpaceEntryPoint4;
        HatchSpaceEntryPoint hatchSpaceEntryPoint5 = new HatchSpaceEntryPoint("PEER_SPACE", 4, "peer_space");
        PEER_SPACE = hatchSpaceEntryPoint5;
        HatchSpaceEntryPoint hatchSpaceEntryPoint6 = new HatchSpaceEntryPoint("OTHER", 5, DeviceSmsReaderKt.ATTACHMENT_OTHER);
        OTHER = hatchSpaceEntryPoint6;
        HatchSpaceEntryPoint[] hatchSpaceEntryPointArr = {hatchSpaceEntryPoint, hatchSpaceEntryPoint2, hatchSpaceEntryPoint3, hatchSpaceEntryPoint4, hatchSpaceEntryPoint5, hatchSpaceEntryPoint6};
        $VALUES = hatchSpaceEntryPointArr;
        $ENTRIES = new F3w(hatchSpaceEntryPointArr);
    }

    public static Ey9<HatchSpaceEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static HatchSpaceEntryPoint valueOf(String str) {
        return (HatchSpaceEntryPoint) Enum.valueOf(HatchSpaceEntryPoint.class, str);
    }

    public static HatchSpaceEntryPoint[] values() {
        return (HatchSpaceEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchSpaceEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
