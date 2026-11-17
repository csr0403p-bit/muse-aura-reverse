package com.facebook.aura.skills.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorCatalogActionLabel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorCatalogActionLabel[] $VALUES;
    public static final ConnectorCatalogActionLabel COMING_SOON;
    public static final ConnectorCatalogActionLabel CONNECT;
    public static final ConnectorCatalogActionLabel VIEW;

    static {
        ConnectorCatalogActionLabel connectorCatalogActionLabel = new ConnectorCatalogActionLabel("CONNECT", 0);
        CONNECT = connectorCatalogActionLabel;
        ConnectorCatalogActionLabel connectorCatalogActionLabel2 = new ConnectorCatalogActionLabel("VIEW", 1);
        VIEW = connectorCatalogActionLabel2;
        ConnectorCatalogActionLabel connectorCatalogActionLabel3 = new ConnectorCatalogActionLabel("COMING_SOON", 2);
        COMING_SOON = connectorCatalogActionLabel3;
        ConnectorCatalogActionLabel[] connectorCatalogActionLabelArr = {connectorCatalogActionLabel, connectorCatalogActionLabel2, connectorCatalogActionLabel3};
        $VALUES = connectorCatalogActionLabelArr;
        $ENTRIES = new F3w(connectorCatalogActionLabelArr);
    }

    public static Ey9<ConnectorCatalogActionLabel> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorCatalogActionLabel valueOf(String str) {
        return (ConnectorCatalogActionLabel) Enum.valueOf(ConnectorCatalogActionLabel.class, str);
    }

    public static ConnectorCatalogActionLabel[] values() {
        return (ConnectorCatalogActionLabel[]) $VALUES.clone();
    }

    public ConnectorCatalogActionLabel(String str, int i) {
    }
}
