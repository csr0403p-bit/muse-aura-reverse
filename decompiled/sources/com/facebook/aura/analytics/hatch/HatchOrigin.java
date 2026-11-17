package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.settings.HatchDeviceDetailsScreenKt;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class HatchOrigin {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchOrigin[] $VALUES;
    public static final HatchOrigin ARTIFACT_VIEWER;
    public static final HatchOrigin CHAT;
    public static final HatchOrigin CONNECTIONS;
    public static final HatchOrigin CVM_DOWNGRADE;
    public static final HatchOrigin CVM_PIN_RECOVERY;
    public static final HatchOrigin CVM_SWITCH;
    public static final HatchOrigin FEED;
    public static final HatchOrigin GOALS;
    public static final HatchOrigin HATCH;
    public static final HatchOrigin IDEAS;
    public static final HatchOrigin LIBRARY;
    public static final HatchOrigin MEDIA_VIEWER;
    public static final HatchOrigin MONETIZATION;
    public static final HatchOrigin NOTIFICATION;
    public static final HatchOrigin ONBOARDING;
    public static final HatchOrigin SEARCH;
    public static final HatchOrigin SETTINGS;
    public static final HatchOrigin SHARE_SHEET;
    public static final HatchOrigin SHOPPING;
    public static final HatchOrigin SPACES;
    public static final HatchOrigin STATUS;
    public static final HatchOrigin SURVEY;
    public static final HatchOrigin UPSELL;
    public static final HatchOrigin WEARABLES;
    public final String value;

    static {
        HatchOrigin hatchOrigin = new HatchOrigin("HATCH", 0, "hatch");
        HATCH = hatchOrigin;
        HatchOrigin hatchOrigin2 = new HatchOrigin("CHAT", 1, "chat");
        CHAT = hatchOrigin2;
        HatchOrigin hatchOrigin3 = new HatchOrigin("FEED", 2, "feed");
        FEED = hatchOrigin3;
        HatchOrigin hatchOrigin4 = new HatchOrigin("IDEAS", 3, "ideas");
        IDEAS = hatchOrigin4;
        HatchOrigin hatchOrigin5 = new HatchOrigin("LIBRARY", 4, "library");
        LIBRARY = hatchOrigin5;
        HatchOrigin hatchOrigin6 = new HatchOrigin("GOALS", 5, "goals");
        GOALS = hatchOrigin6;
        HatchOrigin hatchOrigin7 = new HatchOrigin("SEARCH", 6, AuraDeeplinkRouteMapper.SEARCH_ROUTE);
        SEARCH = hatchOrigin7;
        HatchOrigin hatchOrigin8 = new HatchOrigin("MEDIA_VIEWER", 7, "media_viewer");
        MEDIA_VIEWER = hatchOrigin8;
        HatchOrigin hatchOrigin9 = new HatchOrigin("ARTIFACT_VIEWER", 8, "artifact_viewer");
        ARTIFACT_VIEWER = hatchOrigin9;
        HatchOrigin hatchOrigin10 = new HatchOrigin("ONBOARDING", 9, "onboarding");
        ONBOARDING = hatchOrigin10;
        HatchOrigin hatchOrigin11 = new HatchOrigin("STATUS", 10, AuraDeeplinkRouteMapper.STATUS_ROUTE);
        STATUS = hatchOrigin11;
        HatchOrigin hatchOrigin12 = new HatchOrigin("NOTIFICATION", 11, "notification");
        NOTIFICATION = hatchOrigin12;
        HatchOrigin hatchOrigin13 = new HatchOrigin("SPACES", 12, "spaces");
        SPACES = hatchOrigin13;
        HatchOrigin hatchOrigin14 = new HatchOrigin("SETTINGS", 13, "settings");
        SETTINGS = hatchOrigin14;
        HatchOrigin hatchOrigin15 = new HatchOrigin("UPSELL", 14, "upsell");
        UPSELL = hatchOrigin15;
        HatchOrigin hatchOrigin16 = new HatchOrigin("SURVEY", 15, "survey");
        SURVEY = hatchOrigin16;
        HatchOrigin hatchOrigin17 = new HatchOrigin("WEARABLES", 16, HatchDeviceDetailsScreenKt.WEARABLES_CONNECTOR_ID);
        WEARABLES = hatchOrigin17;
        HatchOrigin hatchOrigin18 = new HatchOrigin("MONETIZATION", 17, "monetization");
        MONETIZATION = hatchOrigin18;
        HatchOrigin hatchOrigin19 = new HatchOrigin("SHARE_SHEET", 18, "share_sheet");
        SHARE_SHEET = hatchOrigin19;
        HatchOrigin hatchOrigin20 = new HatchOrigin("SHOPPING", 19, "shopping");
        SHOPPING = hatchOrigin20;
        HatchOrigin hatchOrigin21 = new HatchOrigin("CVM_SWITCH", 20, ConfidentialVmAnalytics.SWITCH_EVENT_NAME);
        CVM_SWITCH = hatchOrigin21;
        HatchOrigin hatchOrigin22 = new HatchOrigin("CVM_PIN_RECOVERY", 21, "cvm_pin_recovery");
        CVM_PIN_RECOVERY = hatchOrigin22;
        HatchOrigin hatchOrigin23 = new HatchOrigin("CVM_DOWNGRADE", 22, "cvm_downgrade");
        CVM_DOWNGRADE = hatchOrigin23;
        HatchOrigin hatchOrigin24 = new HatchOrigin("CONNECTIONS", 23, "connections");
        CONNECTIONS = hatchOrigin24;
        HatchOrigin[] hatchOriginArr = {hatchOrigin, hatchOrigin2, hatchOrigin3, hatchOrigin4, hatchOrigin5, hatchOrigin6, hatchOrigin7, hatchOrigin8, hatchOrigin9, hatchOrigin10, hatchOrigin11, hatchOrigin12, hatchOrigin13, hatchOrigin14, hatchOrigin15, hatchOrigin16, hatchOrigin17, hatchOrigin18, hatchOrigin19, hatchOrigin20, hatchOrigin21, hatchOrigin22, hatchOrigin23, hatchOrigin24};
        $VALUES = hatchOriginArr;
        $ENTRIES = new F3w(hatchOriginArr);
    }

    public static Ey9<HatchOrigin> getEntries() {
        return $ENTRIES;
    }

    public static HatchOrigin valueOf(String str) {
        return (HatchOrigin) Enum.valueOf(HatchOrigin.class, str);
    }

    public static HatchOrigin[] values() {
        return (HatchOrigin[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchOrigin(String str, int i, String str2) {
        this.value = str2;
    }
}
