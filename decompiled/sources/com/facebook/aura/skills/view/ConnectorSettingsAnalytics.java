package com.facebook.aura.skills.view;

import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import java.util.Map;

/* loaded from: classes.dex */
public final class ConnectorSettingsAnalytics {
    public static final int $stable = 0;
    public static final ConnectorSettingsAnalytics INSTANCE = new ConnectorSettingsAnalytics();

    public final void logConnectorRowClick(String str) {
        C7384Etj.A0Y(str, 0);
        logClick(HatchComponent.SKILL_ROW, null, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str));
    }

    public final void logDeviceManageClick(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (z) {
            logClick(HatchComponent.MANAGE_DEVICE_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str));
        } else {
            logEnableDeviceConnectorClick();
        }
    }

    public final void logDeviceMenuClick(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        logClick(HatchComponent.THREE_DOTS_MENU, str2, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str));
    }

    private final void logClick(HatchComponent hatchComponent, String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, hatchComponent, str, map, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logClick$default(ConnectorSettingsAnalytics connectorSettingsAnalytics, HatchComponent hatchComponent, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        connectorSettingsAnalytics.logClick(hatchComponent, str, map);
    }

    public final void logCustomConnectorsClick() {
        logClick(HatchComponent.SKILL_SECTION_EXPAND, ConnectorCatalogKt.CUSTOM_CATEGORY_ID, null);
    }

    public final void logEnableDeviceConnectorClick() {
        logClick(HatchComponent.ENABLE_SKILL_BUTTON, null, null);
    }

    public final void logSearchBarClick() {
        logClick(HatchComponent.SEARCH_BAR, null, null);
    }

    public final void logDeviceModeClick(String str, String str2, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass005.A0x(str, str2, connectorPermissionMode);
        logClick(HatchComponent.PERMISSION_ROW, str2, AnonymousClass007.A0d(HatchMetadataKey.PROVIDER.getValue(), str, new HxE(HatchMetadataKey.PERMISSION_MODE.getValue(), connectorPermissionMode.getWireValue())));
    }
}
