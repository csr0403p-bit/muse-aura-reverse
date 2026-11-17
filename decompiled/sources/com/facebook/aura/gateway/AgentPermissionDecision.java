package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgentPermissionDecision {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgentPermissionDecision[] $VALUES;
    public static final AgentPermissionDecision ALLOW_ALWAYS;
    public static final AgentPermissionDecision ALLOW_ONCE;
    public static final Companion Companion;
    public static final AgentPermissionDecision DENY;
    public final String wireValue;

    static {
        AgentPermissionDecision agentPermissionDecision = new AgentPermissionDecision("ALLOW_ONCE", 0, "allow_once");
        ALLOW_ONCE = agentPermissionDecision;
        AgentPermissionDecision agentPermissionDecision2 = new AgentPermissionDecision("ALLOW_ALWAYS", 1, "allow_always");
        ALLOW_ALWAYS = agentPermissionDecision2;
        AgentPermissionDecision agentPermissionDecision3 = new AgentPermissionDecision("DENY", 2, ConfidentialVmSettingsJsonKt.MODE_DENY);
        DENY = agentPermissionDecision3;
        AgentPermissionDecision[] agentPermissionDecisionArr = {agentPermissionDecision, agentPermissionDecision2, agentPermissionDecision3};
        $VALUES = agentPermissionDecisionArr;
        $ENTRIES = C3cG.A0w(agentPermissionDecisionArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final AgentPermissionDecision fromWire(String str) {
            for (AgentPermissionDecision agentPermissionDecision : AgentPermissionDecision.values()) {
                if (C7384Etj.areEqual(agentPermissionDecision.getWireValue(), str)) {
                    return agentPermissionDecision;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<AgentPermissionDecision> getEntries() {
        return $ENTRIES;
    }

    public static AgentPermissionDecision valueOf(String str) {
        return (AgentPermissionDecision) Enum.valueOf(AgentPermissionDecision.class, str);
    }

    public static AgentPermissionDecision[] values() {
        return (AgentPermissionDecision[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public AgentPermissionDecision(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
