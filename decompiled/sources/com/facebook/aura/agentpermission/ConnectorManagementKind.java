package com.facebook.aura.agentpermission;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectorManagementKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectorManagementKind[] $VALUES;
    public static final ConnectorManagementKind AUTH;
    public static final Companion Companion;
    public static final ConnectorManagementKind INTERNAL;
    public static final ConnectorManagementKind POLICY_ONLY;
    public final String wireValue;

    static {
        ConnectorManagementKind connectorManagementKind = new ConnectorManagementKind("AUTH", 0, "auth");
        AUTH = connectorManagementKind;
        ConnectorManagementKind connectorManagementKind2 = new ConnectorManagementKind("INTERNAL", 1, "internal");
        INTERNAL = connectorManagementKind2;
        ConnectorManagementKind connectorManagementKind3 = new ConnectorManagementKind("POLICY_ONLY", 2, "policy_only");
        POLICY_ONLY = connectorManagementKind3;
        ConnectorManagementKind[] connectorManagementKindArr = {connectorManagementKind, connectorManagementKind2, connectorManagementKind3};
        $VALUES = connectorManagementKindArr;
        $ENTRIES = C3cG.A0w(connectorManagementKindArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ConnectorManagementKind fromWireModel(String str) {
            ConnectorManagementKind next;
            Iterator<ConnectorManagementKind> it = ConnectorManagementKind.getEntries().iterator();
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
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<ConnectorManagementKind> getEntries() {
        return $ENTRIES;
    }

    public static ConnectorManagementKind valueOf(String str) {
        return (ConnectorManagementKind) Enum.valueOf(ConnectorManagementKind.class, str);
    }

    public static ConnectorManagementKind[] values() {
        return (ConnectorManagementKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ConnectorManagementKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
