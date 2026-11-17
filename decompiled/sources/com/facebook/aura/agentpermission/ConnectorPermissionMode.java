package com.facebook.aura.agentpermission;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConnectorPermissionMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorPermissionMode[] $VALUES;
    public static final ConnectorPermissionMode ALLOW;
    public static final ConnectorPermissionMode ASK;
    public static final Companion Companion;
    public static final ConnectorPermissionMode DENY;
    public final String wireValue;

    static {
        ConnectorPermissionMode connectorPermissionMode = new ConnectorPermissionMode("ALLOW", 0, ConfidentialVmSettingsJsonKt.MODE_ALLOW);
        ALLOW = connectorPermissionMode;
        ConnectorPermissionMode connectorPermissionMode2 = new ConnectorPermissionMode("ASK", 1, "ask");
        ASK = connectorPermissionMode2;
        ConnectorPermissionMode connectorPermissionMode3 = new ConnectorPermissionMode("DENY", 2, ConfidentialVmSettingsJsonKt.MODE_DENY);
        DENY = connectorPermissionMode3;
        ConnectorPermissionMode[] connectorPermissionModeArr = {connectorPermissionMode, connectorPermissionMode2, connectorPermissionMode3};
        $VALUES = connectorPermissionModeArr;
        $ENTRIES = new F3w(connectorPermissionModeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ConnectorPermissionMode fromWire(String str) {
            ConnectorPermissionMode next;
            Iterator<ConnectorPermissionMode> it = ConnectorPermissionMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            ConnectorPermissionMode connectorPermissionMode = next;
            return connectorPermissionMode == null ? ConnectorPermissionMode.ASK : connectorPermissionMode;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<ConnectorPermissionMode> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorPermissionMode valueOf(String str) {
        return (ConnectorPermissionMode) Enum.valueOf(ConnectorPermissionMode.class, str);
    }

    public static ConnectorPermissionMode[] values() {
        return (ConnectorPermissionMode[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ConnectorPermissionMode(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
