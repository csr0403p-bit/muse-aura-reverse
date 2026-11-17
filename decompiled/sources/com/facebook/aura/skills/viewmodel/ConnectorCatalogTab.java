package com.facebook.aura.skills.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorCatalogTab {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorCatalogTab[] $VALUES;
    public static final ConnectorCatalogTab AVAILABLE;
    public static final ConnectorCatalogTab CONNECTED;

    static {
        ConnectorCatalogTab connectorCatalogTab = new ConnectorCatalogTab("AVAILABLE", 0);
        AVAILABLE = connectorCatalogTab;
        ConnectorCatalogTab connectorCatalogTab2 = new ConnectorCatalogTab("CONNECTED", 1);
        CONNECTED = connectorCatalogTab2;
        ConnectorCatalogTab[] connectorCatalogTabArr = {connectorCatalogTab, connectorCatalogTab2};
        $VALUES = connectorCatalogTabArr;
        $ENTRIES = new F3w(connectorCatalogTabArr);
    }

    public static Ey9<ConnectorCatalogTab> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorCatalogTab valueOf(String str) {
        return (ConnectorCatalogTab) Enum.valueOf(ConnectorCatalogTab.class, str);
    }

    public static ConnectorCatalogTab[] values() {
        return (ConnectorCatalogTab[]) $VALUES.clone();
    }

    public ConnectorCatalogTab(String str, int i) {
    }
}
