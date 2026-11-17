package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.model.GenericListPresentationKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgentPermissionPresentationKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgentPermissionPresentationKind[] $VALUES;
    public static final Companion Companion;
    public static final AgentPermissionPresentationKind GENERIC;
    public static final AgentPermissionPresentationKind RICH;
    public static final AgentPermissionPresentationKind UNKNOWN;
    public final String wireValue;

    static {
        AgentPermissionPresentationKind agentPermissionPresentationKind = new AgentPermissionPresentationKind("GENERIC", 0, GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC);
        GENERIC = agentPermissionPresentationKind;
        AgentPermissionPresentationKind agentPermissionPresentationKind2 = new AgentPermissionPresentationKind("RICH", 1, "rich");
        RICH = agentPermissionPresentationKind2;
        AgentPermissionPresentationKind agentPermissionPresentationKind3 = new AgentPermissionPresentationKind("UNKNOWN", 2, null);
        UNKNOWN = agentPermissionPresentationKind3;
        AgentPermissionPresentationKind[] agentPermissionPresentationKindArr = {agentPermissionPresentationKind, agentPermissionPresentationKind2, agentPermissionPresentationKind3};
        $VALUES = agentPermissionPresentationKindArr;
        $ENTRIES = C3cG.A0w(agentPermissionPresentationKindArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final AgentPermissionPresentationKind fromWire(String str) {
            for (AgentPermissionPresentationKind agentPermissionPresentationKind : AgentPermissionPresentationKind.values()) {
                if (agentPermissionPresentationKind != AgentPermissionPresentationKind.UNKNOWN && C7384Etj.areEqual(agentPermissionPresentationKind.getWireValue(), str)) {
                    return agentPermissionPresentationKind;
                }
            }
            return AgentPermissionPresentationKind.UNKNOWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<AgentPermissionPresentationKind> getEntries() {
        return $ENTRIES;
    }

    public static AgentPermissionPresentationKind valueOf(String str) {
        return (AgentPermissionPresentationKind) Enum.valueOf(AgentPermissionPresentationKind.class, str);
    }

    public static AgentPermissionPresentationKind[] values() {
        return (AgentPermissionPresentationKind[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public AgentPermissionPresentationKind(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
