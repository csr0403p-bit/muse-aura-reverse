package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.commands.core.NodePermissionActivityKt;
import com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.nodes.HatchNodeClientKt;
import com.facebook.aura.settings.HatchDeviceDetailsScreenKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchSurface {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSurface[] $VALUES;
    public static final HatchSurface AGE_CONFIRMATION;
    public static final HatchSurface ARTIFACT_VIEWER;
    public static final HatchSurface CHAT;
    public static final HatchSurface CONNECTIONS;
    public static final HatchSurface CVM_DOWNGRADE;
    public static final HatchSurface CVM_PIN_RECOVERY;
    public static final HatchSurface CVM_REPLACEMENT;
    public static final HatchSurface CVM_SWITCH;
    public static final HatchSurface FEED;
    public static final HatchSurface GOALS;
    public static final HatchSurface IDEAS;
    public static final HatchSurface LIBRARY;
    public static final HatchSurface MEDIA_VIEWER;
    public static final HatchSurface MODEL_SELECTOR;
    public static final HatchSurface MONETIZATION;
    public static final HatchSurface NAV_BAR;
    public static final HatchSurface NODES;
    public static final HatchSurface NOTIFICATION;
    public static final HatchSurface ONBOARDING;
    public static final HatchSurface PERMISSIONS;
    public static final HatchSurface PROFILE;
    public static final HatchSurface SEARCH;
    public static final HatchSurface SETTINGS;
    public static final HatchSurface SHARE_SHEET;
    public static final HatchSurface SHOPPING;
    public static final HatchSurface SPACES;
    public static final HatchSurface STATUS;
    public static final HatchSurface SURVEY;
    public static final HatchSurface UPSELL;
    public static final HatchSurface VM_DISCONNECTED;
    public static final HatchSurface VOICE_MODE;
    public static final HatchSurface WEARABLES;
    public final String value;

    static {
        HatchSurface hatchSurface = new HatchSurface("CHAT", 0, "chat");
        CHAT = hatchSurface;
        HatchSurface hatchSurface2 = new HatchSurface("FEED", 1, "feed");
        FEED = hatchSurface2;
        HatchSurface hatchSurface3 = new HatchSurface("IDEAS", 2, "ideas");
        IDEAS = hatchSurface3;
        HatchSurface hatchSurface4 = new HatchSurface("LIBRARY", 3, "library");
        LIBRARY = hatchSurface4;
        HatchSurface hatchSurface5 = new HatchSurface("GOALS", 4, "goals");
        GOALS = hatchSurface5;
        HatchSurface hatchSurface6 = new HatchSurface("CONNECTIONS", 5, "connections");
        CONNECTIONS = hatchSurface6;
        HatchSurface hatchSurface7 = new HatchSurface("SETTINGS", 6, "settings");
        SETTINGS = hatchSurface7;
        HatchSurface hatchSurface8 = new HatchSurface("PROFILE", 7, "profile");
        PROFILE = hatchSurface8;
        HatchSurface hatchSurface9 = new HatchSurface("SEARCH", 8, AuraDeeplinkRouteMapper.SEARCH_ROUTE);
        SEARCH = hatchSurface9;
        HatchSurface hatchSurface10 = new HatchSurface("ONBOARDING", 9, "onboarding");
        ONBOARDING = hatchSurface10;
        HatchSurface hatchSurface11 = new HatchSurface("AGE_CONFIRMATION", 10, "age_confirmation");
        AGE_CONFIRMATION = hatchSurface11;
        HatchSurface hatchSurface12 = new HatchSurface("VOICE_MODE", 11, "voice_mode");
        VOICE_MODE = hatchSurface12;
        HatchSurface hatchSurface13 = new HatchSurface("NOTIFICATION", 12, "notification");
        NOTIFICATION = hatchSurface13;
        HatchSurface hatchSurface14 = new HatchSurface("MEDIA_VIEWER", 13, "media_viewer");
        MEDIA_VIEWER = hatchSurface14;
        HatchSurface hatchSurface15 = new HatchSurface("ARTIFACT_VIEWER", 14, "artifact_viewer");
        ARTIFACT_VIEWER = hatchSurface15;
        HatchSurface hatchSurface16 = new HatchSurface("MODEL_SELECTOR", 15, "model_selector");
        MODEL_SELECTOR = hatchSurface16;
        HatchSurface hatchSurface17 = new HatchSurface("STATUS", 16, AuraDeeplinkRouteMapper.STATUS_ROUTE);
        STATUS = hatchSurface17;
        HatchSurface hatchSurface18 = new HatchSurface("MONETIZATION", 17, "monetization");
        MONETIZATION = hatchSurface18;
        HatchSurface hatchSurface19 = new HatchSurface("SURVEY", 18, "survey");
        SURVEY = hatchSurface19;
        HatchSurface hatchSurface20 = new HatchSurface("SPACES", 19, "spaces");
        SPACES = hatchSurface20;
        HatchSurface hatchSurface21 = new HatchSurface("NODES", 20, HatchNodeClientKt.REGISTER_SURFACE);
        NODES = hatchSurface21;
        HatchSurface hatchSurface22 = new HatchSurface("PERMISSIONS", 21, NodePermissionActivityKt.EXTRA_PERMISSIONS);
        PERMISSIONS = hatchSurface22;
        HatchSurface hatchSurface23 = new HatchSurface("UPSELL", 22, "upsell");
        UPSELL = hatchSurface23;
        HatchSurface hatchSurface24 = new HatchSurface("NAV_BAR", 23, "nav_bar");
        NAV_BAR = hatchSurface24;
        HatchSurface hatchSurface25 = new HatchSurface("SHOPPING", 24, "shopping");
        SHOPPING = hatchSurface25;
        HatchSurface hatchSurface26 = new HatchSurface("WEARABLES", 25, HatchDeviceDetailsScreenKt.WEARABLES_CONNECTOR_ID);
        WEARABLES = hatchSurface26;
        HatchSurface hatchSurface27 = new HatchSurface("SHARE_SHEET", 26, "share_sheet");
        SHARE_SHEET = hatchSurface27;
        HatchSurface hatchSurface28 = new HatchSurface("CVM_REPLACEMENT", 27, "cvm_replacement");
        CVM_REPLACEMENT = hatchSurface28;
        HatchSurface hatchSurface29 = new HatchSurface("CVM_PIN_RECOVERY", 28, "cvm_pin_recovery");
        CVM_PIN_RECOVERY = hatchSurface29;
        HatchSurface hatchSurface30 = new HatchSurface("CVM_SWITCH", 29, ConfidentialVmAnalytics.SWITCH_EVENT_NAME);
        CVM_SWITCH = hatchSurface30;
        HatchSurface hatchSurface31 = new HatchSurface("CVM_DOWNGRADE", 30, "cvm_downgrade");
        CVM_DOWNGRADE = hatchSurface31;
        HatchSurface hatchSurface32 = new HatchSurface("VM_DISCONNECTED", 31, "vm_disconnected");
        VM_DISCONNECTED = hatchSurface32;
        HatchSurface[] hatchSurfaceArr = new HatchSurface[32];
        System.arraycopy(new HatchSurface[]{hatchSurface, hatchSurface2, hatchSurface3, hatchSurface4, hatchSurface5, hatchSurface6, hatchSurface7, hatchSurface8, hatchSurface9, hatchSurface10, hatchSurface11, hatchSurface12, hatchSurface13, hatchSurface14, hatchSurface15, hatchSurface16, hatchSurface17, hatchSurface18, hatchSurface19, hatchSurface20, hatchSurface21, hatchSurface22, hatchSurface23, hatchSurface24, hatchSurface25, hatchSurface26, hatchSurface27}, 0, hatchSurfaceArr, 0, 27);
        System.arraycopy(new HatchSurface[]{hatchSurface28, hatchSurface29, hatchSurface30, hatchSurface31, hatchSurface32}, 0, hatchSurfaceArr, 27, 5);
        $VALUES = hatchSurfaceArr;
        $ENTRIES = new F3w(hatchSurfaceArr);
    }

    public static Ey9<HatchSurface> getEntries() {
        return $ENTRIES;
    }

    public static HatchSurface valueOf(String str) {
        return (HatchSurface) Enum.valueOf(HatchSurface.class, str);
    }

    public static HatchSurface[] values() {
        return (HatchSurface[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchSurface(String str, int i, String str2) {
        this.value = str2;
    }
}
