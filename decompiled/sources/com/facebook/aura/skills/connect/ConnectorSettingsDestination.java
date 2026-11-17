package com.facebook.aura.skills.connect;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorSettingsDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorSettingsDestination[] $VALUES;
    public static final ConnectorSettingsDestination CONNECTORS;
    public static final ConnectorSettingsDestination WALLET;

    static {
        ConnectorSettingsDestination connectorSettingsDestination = new ConnectorSettingsDestination("WALLET", 0);
        WALLET = connectorSettingsDestination;
        ConnectorSettingsDestination connectorSettingsDestination2 = new ConnectorSettingsDestination("CONNECTORS", 1);
        CONNECTORS = connectorSettingsDestination2;
        ConnectorSettingsDestination[] connectorSettingsDestinationArr = {connectorSettingsDestination, connectorSettingsDestination2};
        $VALUES = connectorSettingsDestinationArr;
        $ENTRIES = new F3w(connectorSettingsDestinationArr);
    }

    public static Ey9<ConnectorSettingsDestination> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorSettingsDestination valueOf(String str) {
        return (ConnectorSettingsDestination) Enum.valueOf(ConnectorSettingsDestination.class, str);
    }

    public static ConnectorSettingsDestination[] values() {
        return (ConnectorSettingsDestination[]) $VALUES.clone();
    }

    public ConnectorSettingsDestination(String str, int i) {
    }
}
