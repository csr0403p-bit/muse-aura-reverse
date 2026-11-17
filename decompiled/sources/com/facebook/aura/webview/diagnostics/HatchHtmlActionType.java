package com.facebook.aura.webview.diagnostics;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.settings.HatchDataExportLoggingKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHtmlActionType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHtmlActionType[] $VALUES;
    public static final HatchHtmlActionType BRIDGE_CALL;
    public static final HatchHtmlActionType BRIDGE_NAVIGATE;
    public static final HatchHtmlActionType DOWNLOAD;
    public static final HatchHtmlActionType INBOUND_DEEPLINK;
    public static final HatchHtmlActionType LINK_TAP;
    public static final HatchHtmlActionType NEW_WINDOW;
    public final String wireName;

    static {
        HatchHtmlActionType hatchHtmlActionType = new HatchHtmlActionType("LINK_TAP", 0, "link_tap");
        LINK_TAP = hatchHtmlActionType;
        HatchHtmlActionType hatchHtmlActionType2 = new HatchHtmlActionType("NEW_WINDOW", 1, "new_window");
        NEW_WINDOW = hatchHtmlActionType2;
        HatchHtmlActionType hatchHtmlActionType3 = new HatchHtmlActionType("BRIDGE_CALL", 2, "bridge_call");
        BRIDGE_CALL = hatchHtmlActionType3;
        HatchHtmlActionType hatchHtmlActionType4 = new HatchHtmlActionType("BRIDGE_NAVIGATE", 3, "bridge_navigate");
        BRIDGE_NAVIGATE = hatchHtmlActionType4;
        HatchHtmlActionType hatchHtmlActionType5 = new HatchHtmlActionType("DOWNLOAD", 4, HatchDataExportLoggingKt.PHASE_DOWNLOAD);
        DOWNLOAD = hatchHtmlActionType5;
        HatchHtmlActionType hatchHtmlActionType6 = new HatchHtmlActionType("INBOUND_DEEPLINK", 5, "inbound_deeplink");
        INBOUND_DEEPLINK = hatchHtmlActionType6;
        HatchHtmlActionType[] hatchHtmlActionTypeArr = {hatchHtmlActionType, hatchHtmlActionType2, hatchHtmlActionType3, hatchHtmlActionType4, hatchHtmlActionType5, hatchHtmlActionType6};
        $VALUES = hatchHtmlActionTypeArr;
        $ENTRIES = C3cG.A0w(hatchHtmlActionTypeArr);
    }

    public static Ey9<HatchHtmlActionType> getEntries() {
        return $ENTRIES;
    }

    public static HatchHtmlActionType valueOf(String str) {
        return (HatchHtmlActionType) Enum.valueOf(HatchHtmlActionType.class, str);
    }

    public static HatchHtmlActionType[] values() {
        return (HatchHtmlActionType[]) $VALUES.clone();
    }

    public final String getWireName() {
        return this.wireName;
    }

    public HatchHtmlActionType(String str, int i, String str2) {
        this.wireName = str2;
    }
}
