package com.facebook.aura.connectorconsent;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectorConsentSyncCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorConsentSyncCategory[] $VALUES;
    public static final ConnectorConsentSyncCategory HISTORICAL_SYNC;
    public static final ConnectorConsentSyncCategory NO_SYNC;
    public static final ConnectorConsentSyncCategory PROACTIVE_PERSISTED;
    public static final ConnectorConsentSyncCategory PROACTIVE_TRANSIENT;

    static {
        ConnectorConsentSyncCategory connectorConsentSyncCategory = new ConnectorConsentSyncCategory("HISTORICAL_SYNC", 0);
        HISTORICAL_SYNC = connectorConsentSyncCategory;
        ConnectorConsentSyncCategory connectorConsentSyncCategory2 = new ConnectorConsentSyncCategory("PROACTIVE_PERSISTED", 1);
        PROACTIVE_PERSISTED = connectorConsentSyncCategory2;
        ConnectorConsentSyncCategory connectorConsentSyncCategory3 = new ConnectorConsentSyncCategory("PROACTIVE_TRANSIENT", 2);
        PROACTIVE_TRANSIENT = connectorConsentSyncCategory3;
        ConnectorConsentSyncCategory connectorConsentSyncCategory4 = new ConnectorConsentSyncCategory("NO_SYNC", 3);
        NO_SYNC = connectorConsentSyncCategory4;
        ConnectorConsentSyncCategory[] connectorConsentSyncCategoryArr = {connectorConsentSyncCategory, connectorConsentSyncCategory2, connectorConsentSyncCategory3, connectorConsentSyncCategory4};
        $VALUES = connectorConsentSyncCategoryArr;
        $ENTRIES = C3cG.A0w(connectorConsentSyncCategoryArr);
    }

    public static Ey9<ConnectorConsentSyncCategory> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorConsentSyncCategory valueOf(String str) {
        return (ConnectorConsentSyncCategory) Enum.valueOf(ConnectorConsentSyncCategory.class, str);
    }

    public static ConnectorConsentSyncCategory[] values() {
        return (ConnectorConsentSyncCategory[]) $VALUES.clone();
    }

    public ConnectorConsentSyncCategory(String str, int i) {
    }
}
