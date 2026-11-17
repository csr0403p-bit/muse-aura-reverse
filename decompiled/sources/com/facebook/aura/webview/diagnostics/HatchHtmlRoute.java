package com.facebook.aura.webview.diagnostics;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.file.view.FileViewerContentKt;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.skills.model.ConnectorCatalogKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHtmlRoute {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHtmlRoute[] $VALUES;
    public static final HatchHtmlRoute CHANNEL_CONNECT;
    public static final HatchHtmlRoute CHAT;
    public static final HatchHtmlRoute CONNECTOR_SHEET;
    public static final HatchHtmlRoute DEEPLINK_SELF;
    public static final HatchHtmlRoute DIALER;
    public static final HatchHtmlRoute EMAIL;
    public static final HatchHtmlRoute EXTERNAL_BROWSER;
    public static final HatchHtmlRoute FILE_VIEWER;
    public static final HatchHtmlRoute HANDLED;
    public static final HatchHtmlRoute IN_APP_BROWSER;
    public static final HatchHtmlRoute IN_FRAME;
    public static final HatchHtmlRoute MAPS;
    public static final HatchHtmlRoute NATIVE_APP;
    public static final HatchHtmlRoute SLIDES;
    public static final HatchHtmlRoute SMS;
    public static final HatchHtmlRoute WALLET;
    public final String wireName;

    static {
        HatchHtmlRoute hatchHtmlRoute = new HatchHtmlRoute("HANDLED", 0, "handled");
        HANDLED = hatchHtmlRoute;
        HatchHtmlRoute hatchHtmlRoute2 = new HatchHtmlRoute("IN_FRAME", 1, "in_frame");
        IN_FRAME = hatchHtmlRoute2;
        HatchHtmlRoute hatchHtmlRoute3 = new HatchHtmlRoute("NATIVE_APP", 2, "native_app");
        NATIVE_APP = hatchHtmlRoute3;
        HatchHtmlRoute hatchHtmlRoute4 = new HatchHtmlRoute("IN_APP_BROWSER", 3, "in_app_browser");
        IN_APP_BROWSER = hatchHtmlRoute4;
        HatchHtmlRoute hatchHtmlRoute5 = new HatchHtmlRoute("EXTERNAL_BROWSER", 4, "external_browser");
        EXTERNAL_BROWSER = hatchHtmlRoute5;
        HatchHtmlRoute hatchHtmlRoute6 = new HatchHtmlRoute("FILE_VIEWER", 5, FileViewerContentKt.FILE_VIEWER_CACHE_SUBDIR);
        FILE_VIEWER = hatchHtmlRoute6;
        HatchHtmlRoute hatchHtmlRoute7 = new HatchHtmlRoute("SLIDES", 6, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SLIDES);
        SLIDES = hatchHtmlRoute7;
        HatchHtmlRoute hatchHtmlRoute8 = new HatchHtmlRoute("CONNECTOR_SHEET", 7, "connector_sheet");
        CONNECTOR_SHEET = hatchHtmlRoute8;
        HatchHtmlRoute hatchHtmlRoute9 = new HatchHtmlRoute("CHANNEL_CONNECT", 8, "channel_connect");
        CHANNEL_CONNECT = hatchHtmlRoute9;
        HatchHtmlRoute hatchHtmlRoute10 = new HatchHtmlRoute("WALLET", 9, ConnectorCatalogKt.WALLET_CATEGORY_ID);
        WALLET = hatchHtmlRoute10;
        HatchHtmlRoute hatchHtmlRoute11 = new HatchHtmlRoute("DEEPLINK_SELF", 10, "deeplink_self");
        DEEPLINK_SELF = hatchHtmlRoute11;
        HatchHtmlRoute hatchHtmlRoute12 = new HatchHtmlRoute("DIALER", 11, "dialer");
        DIALER = hatchHtmlRoute12;
        HatchHtmlRoute hatchHtmlRoute13 = new HatchHtmlRoute("SMS", 12, "sms");
        SMS = hatchHtmlRoute13;
        HatchHtmlRoute hatchHtmlRoute14 = new HatchHtmlRoute("MAPS", 13, "maps");
        MAPS = hatchHtmlRoute14;
        HatchHtmlRoute hatchHtmlRoute15 = new HatchHtmlRoute("EMAIL", 14, "email");
        EMAIL = hatchHtmlRoute15;
        HatchHtmlRoute hatchHtmlRoute16 = new HatchHtmlRoute("CHAT", 15, "chat");
        CHAT = hatchHtmlRoute16;
        HatchHtmlRoute[] hatchHtmlRouteArr = {hatchHtmlRoute, hatchHtmlRoute2, hatchHtmlRoute3, hatchHtmlRoute4, hatchHtmlRoute5, hatchHtmlRoute6, hatchHtmlRoute7, hatchHtmlRoute8, hatchHtmlRoute9, hatchHtmlRoute10, hatchHtmlRoute11, hatchHtmlRoute12, hatchHtmlRoute13, hatchHtmlRoute14, hatchHtmlRoute15, hatchHtmlRoute16};
        $VALUES = hatchHtmlRouteArr;
        $ENTRIES = C3cG.A0w(hatchHtmlRouteArr);
    }

    public static Ey9<HatchHtmlRoute> getEntries() {
        return $ENTRIES;
    }

    public static HatchHtmlRoute valueOf(String str) {
        return (HatchHtmlRoute) Enum.valueOf(HatchHtmlRoute.class, str);
    }

    public static HatchHtmlRoute[] values() {
        return (HatchHtmlRoute[]) $VALUES.clone();
    }

    public final String getWireName() {
        return this.wireName;
    }

    public HatchHtmlRoute(String str, int i, String str2) {
        this.wireName = str2;
    }
}
