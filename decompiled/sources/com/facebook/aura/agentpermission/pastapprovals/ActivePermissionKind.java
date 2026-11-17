package com.facebook.aura.agentpermission.pastapprovals;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ActivePermissionKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ActivePermissionKind[] $VALUES;
    public static final ActivePermissionKind CONNECTOR_OVERRIDE;
    public static final Companion Companion;
    public static final ActivePermissionKind NETWORK_RULE;
    public static final ActivePermissionKind TRANSIENT_CONNECTOR_GRANT;
    public static final ActivePermissionKind TRANSIENT_NETWORK_GRANT;
    public final String wireValue;

    static {
        ActivePermissionKind activePermissionKind = new ActivePermissionKind("CONNECTOR_OVERRIDE", 0, "connector_override");
        CONNECTOR_OVERRIDE = activePermissionKind;
        ActivePermissionKind activePermissionKind2 = new ActivePermissionKind("NETWORK_RULE", 1, "network_rule");
        NETWORK_RULE = activePermissionKind2;
        ActivePermissionKind activePermissionKind3 = new ActivePermissionKind("TRANSIENT_CONNECTOR_GRANT", 2, "transient_connector_grant");
        TRANSIENT_CONNECTOR_GRANT = activePermissionKind3;
        ActivePermissionKind activePermissionKind4 = new ActivePermissionKind("TRANSIENT_NETWORK_GRANT", 3, "transient_network_grant");
        TRANSIENT_NETWORK_GRANT = activePermissionKind4;
        ActivePermissionKind[] activePermissionKindArr = {activePermissionKind, activePermissionKind2, activePermissionKind3, activePermissionKind4};
        $VALUES = activePermissionKindArr;
        $ENTRIES = C3cG.A0w(activePermissionKindArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ActivePermissionKind fromWire(String str) {
            ActivePermissionKind next;
            Iterator<ActivePermissionKind> it = ActivePermissionKind.getEntries().iterator();
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

    public static Ey9<ActivePermissionKind> getEntries() {
        return $ENTRIES;
    }

    public static ActivePermissionKind valueOf(String str) {
        return (ActivePermissionKind) Enum.valueOf(ActivePermissionKind.class, str);
    }

    public static ActivePermissionKind[] values() {
        return (ActivePermissionKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ActivePermissionKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
