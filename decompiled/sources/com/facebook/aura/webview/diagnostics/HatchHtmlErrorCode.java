package com.facebook.aura.webview.diagnostics;

import X.C3cG;
import X.C60P;
import X.Ey9;
import com.facebook.aura.pairs.PairsRepositoryKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHtmlErrorCode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHtmlErrorCode[] $VALUES;
    public static final HatchHtmlErrorCode ASSET_FETCH_FAILED;
    public static final HatchHtmlErrorCode ASSET_FETCH_TIMEOUT;
    public static final HatchHtmlErrorCode BLANK_URL;
    public static final HatchHtmlErrorCode BLOCKED_BY_FRAMEWORK;
    public static final HatchHtmlErrorCode BRIDGE_ACTION_NOT_ALLOWED;
    public static final HatchHtmlErrorCode BRIDGE_MALFORMED_EVENT;
    public static final HatchHtmlErrorCode BRIDGE_TOKEN_INVALID;
    public static final HatchHtmlErrorCode CONTENT_EMPTY;
    public static final HatchHtmlErrorCode CONTENT_TOO_LARGE;
    public static final HatchHtmlErrorCode DOCUMENT_FETCH_FAILED;
    public static final HatchHtmlErrorCode FEATURE_KILLSWITCH_OFF;
    public static final HatchHtmlErrorCode FEATURE_MODULE_ABSENT;
    public static final HatchHtmlErrorCode FEATURE_NOT_CONFIGURED;
    public static final HatchHtmlErrorCode HEIGHT_NEVER_REPORTED;
    public static final HatchHtmlErrorCode HTTP_ERROR;
    public static final HatchHtmlErrorCode INTERNAL_ERROR;
    public static final HatchHtmlErrorCode INVALID_WIDGET_DATA;
    public static final HatchHtmlErrorCode MANIFEST_MISSING;
    public static final HatchHtmlErrorCode MANIFEST_PARSE_FAILED;
    public static final HatchHtmlErrorCode NAV_BLOCKED_BY_WIDGET;
    public static final HatchHtmlErrorCode NET_ERROR;
    public static final HatchHtmlErrorCode NOT_USER_GESTURE;
    public static final HatchHtmlErrorCode NO_ACTIVITY_FOUND;
    public static final HatchHtmlErrorCode NO_BROWSER;
    public static final HatchHtmlErrorCode NO_HANDLER;
    public static final HatchHtmlErrorCode NO_ROUTE;
    public static final HatchHtmlErrorCode PARSE_DROPPED;
    public static final HatchHtmlErrorCode RENDERER_CRASHED;
    public static final HatchHtmlErrorCode RENDERER_GONE;
    public static final HatchHtmlErrorCode SSL_ERROR;
    public static final HatchHtmlErrorCode THUMBNAIL_TIMEOUT;
    public static final HatchHtmlErrorCode UNKNOWN_WIDGET_KIND;
    public static final HatchHtmlErrorCode UNRENDERABLE_ON_RESTORE;
    public static final HatchHtmlErrorCode UNSUPPORTED_SCHEME;
    public static final HatchHtmlErrorCode UNTRUSTED_CALLER;
    public static final HatchHtmlErrorCode VIEWER_NO_DATA;
    public static final HatchHtmlErrorCode WIDGET_ORIGIN_LINK;
    public static final HatchHtmlErrorCode WORKSPACE_UNAVAILABLE;
    public final String wireName;

    static {
        HatchHtmlErrorCode hatchHtmlErrorCodeA07 = C60P.A07("HTTP_ERROR", "http_error", 0);
        HTTP_ERROR = hatchHtmlErrorCodeA07;
        HatchHtmlErrorCode hatchHtmlErrorCodeA072 = C60P.A07("NET_ERROR", "net_error", 1);
        NET_ERROR = hatchHtmlErrorCodeA072;
        HatchHtmlErrorCode hatchHtmlErrorCodeA073 = C60P.A07("RENDERER_GONE", "renderer_gone", 2);
        RENDERER_GONE = hatchHtmlErrorCodeA073;
        HatchHtmlErrorCode hatchHtmlErrorCodeA074 = C60P.A07("RENDERER_CRASHED", "renderer_crashed", 3);
        RENDERER_CRASHED = hatchHtmlErrorCodeA074;
        HatchHtmlErrorCode hatchHtmlErrorCodeA075 = C60P.A07("SSL_ERROR", "ssl_error", 4);
        SSL_ERROR = hatchHtmlErrorCodeA075;
        HatchHtmlErrorCode hatchHtmlErrorCodeA076 = C60P.A07("CONTENT_EMPTY", "content_empty", 5);
        CONTENT_EMPTY = hatchHtmlErrorCodeA076;
        HatchHtmlErrorCode hatchHtmlErrorCodeA077 = C60P.A07("CONTENT_TOO_LARGE", "content_too_large", 6);
        CONTENT_TOO_LARGE = hatchHtmlErrorCodeA077;
        HatchHtmlErrorCode hatchHtmlErrorCodeA078 = C60P.A07("ASSET_FETCH_FAILED", "asset_fetch_failed", 7);
        ASSET_FETCH_FAILED = hatchHtmlErrorCodeA078;
        HatchHtmlErrorCode hatchHtmlErrorCodeA079 = C60P.A07("ASSET_FETCH_TIMEOUT", "asset_fetch_timeout", 8);
        ASSET_FETCH_TIMEOUT = hatchHtmlErrorCodeA079;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0710 = C60P.A07("DOCUMENT_FETCH_FAILED", "document_fetch_failed", 9);
        DOCUMENT_FETCH_FAILED = hatchHtmlErrorCodeA0710;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0711 = C60P.A07("MANIFEST_PARSE_FAILED", "manifest_parse_failed", 10);
        MANIFEST_PARSE_FAILED = hatchHtmlErrorCodeA0711;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0712 = C60P.A07("MANIFEST_MISSING", "manifest_missing", 11);
        MANIFEST_MISSING = hatchHtmlErrorCodeA0712;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0713 = C60P.A07("WORKSPACE_UNAVAILABLE", "workspace_unavailable", 12);
        WORKSPACE_UNAVAILABLE = hatchHtmlErrorCodeA0713;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0714 = C60P.A07("THUMBNAIL_TIMEOUT", "thumbnail_timeout", 13);
        THUMBNAIL_TIMEOUT = hatchHtmlErrorCodeA0714;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0715 = C60P.A07("VIEWER_NO_DATA", "viewer_no_data", 14);
        VIEWER_NO_DATA = hatchHtmlErrorCodeA0715;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0716 = C60P.A07("HEIGHT_NEVER_REPORTED", "height_never_reported", 15);
        HEIGHT_NEVER_REPORTED = hatchHtmlErrorCodeA0716;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0717 = C60P.A07("PARSE_DROPPED", "parse_dropped", 16);
        PARSE_DROPPED = hatchHtmlErrorCodeA0717;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0718 = C60P.A07("UNKNOWN_WIDGET_KIND", "unknown_widget_kind", 17);
        UNKNOWN_WIDGET_KIND = hatchHtmlErrorCodeA0718;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0719 = C60P.A07("INVALID_WIDGET_DATA", "invalid_widget_data", 18);
        INVALID_WIDGET_DATA = hatchHtmlErrorCodeA0719;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0720 = C60P.A07("UNRENDERABLE_ON_RESTORE", "unrenderable_on_restore", 19);
        UNRENDERABLE_ON_RESTORE = hatchHtmlErrorCodeA0720;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0721 = C60P.A07("BLOCKED_BY_FRAMEWORK", "blocked_by_framework", 20);
        BLOCKED_BY_FRAMEWORK = hatchHtmlErrorCodeA0721;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0722 = C60P.A07("NAV_BLOCKED_BY_WIDGET", "nav_blocked_by_widget", 21);
        NAV_BLOCKED_BY_WIDGET = hatchHtmlErrorCodeA0722;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0723 = C60P.A07("NOT_USER_GESTURE", "not_user_gesture", 22);
        NOT_USER_GESTURE = hatchHtmlErrorCodeA0723;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0724 = C60P.A07("UNSUPPORTED_SCHEME", "unsupported_scheme", 23);
        UNSUPPORTED_SCHEME = hatchHtmlErrorCodeA0724;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0725 = C60P.A07("WIDGET_ORIGIN_LINK", "widget_origin_link", 24);
        WIDGET_ORIGIN_LINK = hatchHtmlErrorCodeA0725;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0726 = C60P.A07("BLANK_URL", "blank_url", 25);
        BLANK_URL = hatchHtmlErrorCodeA0726;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0727 = C60P.A07("NO_HANDLER", "no_handler", 26);
        NO_HANDLER = hatchHtmlErrorCodeA0727;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0728 = C60P.A07("NO_ACTIVITY_FOUND", "no_activity_found", 27);
        NO_ACTIVITY_FOUND = hatchHtmlErrorCodeA0728;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0729 = C60P.A07("NO_BROWSER", "no_browser", 28);
        NO_BROWSER = hatchHtmlErrorCodeA0729;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0730 = C60P.A07("UNTRUSTED_CALLER", "untrusted_caller", 29);
        UNTRUSTED_CALLER = hatchHtmlErrorCodeA0730;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0731 = C60P.A07("NO_ROUTE", "no_route", 30);
        NO_ROUTE = hatchHtmlErrorCodeA0731;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0732 = C60P.A07("FEATURE_KILLSWITCH_OFF", "feature_killswitch_off", 31);
        FEATURE_KILLSWITCH_OFF = hatchHtmlErrorCodeA0732;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0733 = C60P.A07("FEATURE_MODULE_ABSENT", "feature_module_absent", 32);
        FEATURE_MODULE_ABSENT = hatchHtmlErrorCodeA0733;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0734 = C60P.A07("FEATURE_NOT_CONFIGURED", "feature_not_configured", 33);
        FEATURE_NOT_CONFIGURED = hatchHtmlErrorCodeA0734;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0735 = C60P.A07("BRIDGE_TOKEN_INVALID", "bridge_token_invalid", 34);
        BRIDGE_TOKEN_INVALID = hatchHtmlErrorCodeA0735;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0736 = C60P.A07("BRIDGE_ACTION_NOT_ALLOWED", "bridge_action_not_allowed", 35);
        BRIDGE_ACTION_NOT_ALLOWED = hatchHtmlErrorCodeA0736;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0737 = C60P.A07("BRIDGE_MALFORMED_EVENT", "bridge_malformed_event", 36);
        BRIDGE_MALFORMED_EVENT = hatchHtmlErrorCodeA0737;
        HatchHtmlErrorCode hatchHtmlErrorCodeA0738 = C60P.A07("INTERNAL_ERROR", PairsRepositoryKt.INTERNAL_ERROR, 37);
        INTERNAL_ERROR = hatchHtmlErrorCodeA0738;
        HatchHtmlErrorCode[] hatchHtmlErrorCodeArr = new HatchHtmlErrorCode[38];
        System.arraycopy(new HatchHtmlErrorCode[]{hatchHtmlErrorCodeA07, hatchHtmlErrorCodeA072, hatchHtmlErrorCodeA073, hatchHtmlErrorCodeA074, hatchHtmlErrorCodeA075, hatchHtmlErrorCodeA076, hatchHtmlErrorCodeA077, hatchHtmlErrorCodeA078, hatchHtmlErrorCodeA079, hatchHtmlErrorCodeA0710, hatchHtmlErrorCodeA0711, hatchHtmlErrorCodeA0712, hatchHtmlErrorCodeA0713, hatchHtmlErrorCodeA0714, hatchHtmlErrorCodeA0715, hatchHtmlErrorCodeA0716, hatchHtmlErrorCodeA0717, hatchHtmlErrorCodeA0718, hatchHtmlErrorCodeA0719, hatchHtmlErrorCodeA0720, hatchHtmlErrorCodeA0721, hatchHtmlErrorCodeA0722, hatchHtmlErrorCodeA0723, hatchHtmlErrorCodeA0724, hatchHtmlErrorCodeA0725, hatchHtmlErrorCodeA0726, hatchHtmlErrorCodeA0727}, 0, hatchHtmlErrorCodeArr, 0, 27);
        System.arraycopy(new HatchHtmlErrorCode[]{hatchHtmlErrorCodeA0728, hatchHtmlErrorCodeA0729, hatchHtmlErrorCodeA0730, hatchHtmlErrorCodeA0731, hatchHtmlErrorCodeA0732, hatchHtmlErrorCodeA0733, hatchHtmlErrorCodeA0734, hatchHtmlErrorCodeA0735, hatchHtmlErrorCodeA0736, hatchHtmlErrorCodeA0737, hatchHtmlErrorCodeA0738}, 0, hatchHtmlErrorCodeArr, 27, 11);
        $VALUES = hatchHtmlErrorCodeArr;
        $ENTRIES = C3cG.A0w(hatchHtmlErrorCodeArr);
    }

    public static Ey9<HatchHtmlErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static HatchHtmlErrorCode valueOf(String str) {
        return (HatchHtmlErrorCode) Enum.valueOf(HatchHtmlErrorCode.class, str);
    }

    public static HatchHtmlErrorCode[] values() {
        return (HatchHtmlErrorCode[]) $VALUES.clone();
    }

    public final String getWireName() {
        return this.wireName;
    }

    public HatchHtmlErrorCode(String str, int i, String str2) {
        this.wireName = str2;
    }
}
