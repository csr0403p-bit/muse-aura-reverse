package com.facebook.aura.skills.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorGroup {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorGroup[] $VALUES;
    public static final ConnectorGroup OPTIMIZED_SITES;

    static {
        ConnectorGroup connectorGroup = new ConnectorGroup("OPTIMIZED_SITES", 0);
        OPTIMIZED_SITES = connectorGroup;
        ConnectorGroup[] connectorGroupArr = {connectorGroup};
        $VALUES = connectorGroupArr;
        $ENTRIES = new F3w(connectorGroupArr);
    }

    public static Ey9<ConnectorGroup> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorGroup valueOf(String str) {
        return (ConnectorGroup) Enum.valueOf(ConnectorGroup.class, str);
    }

    public static ConnectorGroup[] values() {
        return (ConnectorGroup[]) $VALUES.clone();
    }

    public ConnectorGroup(String str, int i) {
    }
}
