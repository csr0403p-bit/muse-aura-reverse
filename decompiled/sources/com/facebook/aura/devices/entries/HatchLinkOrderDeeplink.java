package com.facebook.aura.devices.entries;

import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes3.dex */
public final class HatchLinkOrderDeeplink {
    public static final int $stable = 0;
    public static final String ENTRY_POINT_PARAM = "entry_point";
    public static final String GENERAL_SETTINGS_TAB = "general";
    public static final String HOME_LINK_PANE = "home-link";
    public static final String HTTPS_SCHEME = "https";
    public static final HatchLinkOrderDeeplink INSTANCE = new HatchLinkOrderDeeplink();
    public static final String PANE_PARAM = "pane";
    public static final String ROUTE_NAME = "home_link_order";
    public static final String ROUTE_PATH = "/home_link_order";
    public static final String SETTINGS_TAB_PARAM = "settings_tab";

    public final HatchLinkOrderEntryPoint entryPoint(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        String scheme = uri.getScheme();
        return (scheme == null || !scheme.equalsIgnoreCase("https")) ? (uri.isHierarchical() && C7384Etj.areEqual(uri.getQueryParameter("entry_point"), HatchLinkOrderEntryPoint.AGENT.getLogValue())) ? HatchLinkOrderEntryPoint.AGENT : HatchLinkOrderEntryPoint.DEEPLINK : HatchLinkOrderEntryPoint.UNIVERSAL_LINK;
    }

    public final boolean isWebSettingsPane(Uri uri) {
        String path;
        C7384Etj.A0Y(uri, 0);
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("https") && uri.isHierarchical() && ((path = uri.getPath()) == null || path.length() == 0 || CustomConnectorRegisterRepositoryKt.ROOT_PATH.equals(path)) && GENERAL_SETTINGS_TAB.equals(uri.getQueryParameter(SETTINGS_TAB_PARAM)) && HOME_LINK_PANE.equals(uri.getQueryParameter(PANE_PARAM));
    }
}
