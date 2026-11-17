package com.facebook.aura.skills.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorCatalogRefreshReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorCatalogRefreshReason[] $VALUES;
    public static final ConnectorCatalogRefreshReason CONNECTION_CHANGED;
    public static final ConnectorCatalogRefreshReason RESUME;

    static {
        ConnectorCatalogRefreshReason connectorCatalogRefreshReason = new ConnectorCatalogRefreshReason("RESUME", 0);
        RESUME = connectorCatalogRefreshReason;
        ConnectorCatalogRefreshReason connectorCatalogRefreshReason2 = new ConnectorCatalogRefreshReason("CONNECTION_CHANGED", 1);
        CONNECTION_CHANGED = connectorCatalogRefreshReason2;
        ConnectorCatalogRefreshReason[] connectorCatalogRefreshReasonArr = {connectorCatalogRefreshReason, connectorCatalogRefreshReason2};
        $VALUES = connectorCatalogRefreshReasonArr;
        $ENTRIES = new F3w(connectorCatalogRefreshReasonArr);
    }

    public static Ey9<ConnectorCatalogRefreshReason> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorCatalogRefreshReason valueOf(String str) {
        return (ConnectorCatalogRefreshReason) Enum.valueOf(ConnectorCatalogRefreshReason.class, str);
    }

    public static ConnectorCatalogRefreshReason[] values() {
        return (ConnectorCatalogRefreshReason[]) $VALUES.clone();
    }

    public ConnectorCatalogRefreshReason(String str, int i) {
    }
}
