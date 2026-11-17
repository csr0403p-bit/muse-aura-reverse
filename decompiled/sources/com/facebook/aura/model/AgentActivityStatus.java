package com.facebook.aura.model;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import kotlin.jvm.functions.Function0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AgentActivityStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgentActivityStatus[] $VALUES;
    public static final AgentActivityStatus COMPACTING;
    public static final AgentActivityStatus COMPOSING;
    public static final Companion Companion;
    public static final AgentActivityStatus MAKING_SOMETHING;
    public static final AgentActivityStatus NEEDS_APPROVAL;
    public static final AgentActivityStatus ONLINE;
    public static final AgentActivityStatus OUT_OF_CREDITS;
    public static final AgentActivityStatus RESPONDING;
    public static final AgentActivityStatus WAITING_FOR_SUBAGENTS;
    public static final AgentActivityStatus WORKING;
    public final String value;

    static {
        AgentActivityStatus agentActivityStatus = new AgentActivityStatus("ONLINE", 0, "online");
        ONLINE = agentActivityStatus;
        AgentActivityStatus agentActivityStatus2 = new AgentActivityStatus("RESPONDING", 1, "responding");
        RESPONDING = agentActivityStatus2;
        AgentActivityStatus agentActivityStatus3 = new AgentActivityStatus("MAKING_SOMETHING", 2, "making_something");
        MAKING_SOMETHING = agentActivityStatus3;
        AgentActivityStatus agentActivityStatus4 = new AgentActivityStatus("WORKING", 3, "working");
        WORKING = agentActivityStatus4;
        AgentActivityStatus agentActivityStatus5 = new AgentActivityStatus("COMPOSING", 4, "composing");
        COMPOSING = agentActivityStatus5;
        AgentActivityStatus agentActivityStatus6 = new AgentActivityStatus("WAITING_FOR_SUBAGENTS", 5, "waiting_for_subagents");
        WAITING_FOR_SUBAGENTS = agentActivityStatus6;
        AgentActivityStatus agentActivityStatus7 = new AgentActivityStatus("COMPACTING", 6, "compacting");
        COMPACTING = agentActivityStatus7;
        AgentActivityStatus agentActivityStatus8 = new AgentActivityStatus("NEEDS_APPROVAL", 7, "needs_approval");
        NEEDS_APPROVAL = agentActivityStatus8;
        AgentActivityStatus agentActivityStatus9 = new AgentActivityStatus("OUT_OF_CREDITS", 8, "out_of_credits");
        OUT_OF_CREDITS = agentActivityStatus9;
        AgentActivityStatus[] agentActivityStatusArr = {agentActivityStatus, agentActivityStatus2, agentActivityStatus3, agentActivityStatus4, agentActivityStatus5, agentActivityStatus6, agentActivityStatus7, agentActivityStatus8, agentActivityStatus9};
        $VALUES = agentActivityStatusArr;
        $ENTRIES = C3cG.A0w(agentActivityStatusArr);
        Companion = new Companion();
    }

    public final AgentActivityStatus withSubscriptionGate(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        return (this != OUT_OF_CREDITS || AnonymousClass003.A1Y(function0)) ? this : ONLINE;
    }

    public final class Companion {
        public final AgentActivityStatus fromActivityCode(String str) {
            C7384Etj.A0Y(str, 0);
            AgentActivityStatus agentActivityStatus = AgentActivityStatus.RESPONDING;
            if (str.equals(agentActivityStatus.getValue())) {
                return agentActivityStatus;
            }
            AgentActivityStatus agentActivityStatus2 = AgentActivityStatus.MAKING_SOMETHING;
            if (str.equals(agentActivityStatus2.getValue())) {
                return agentActivityStatus2;
            }
            AgentActivityStatus agentActivityStatus3 = AgentActivityStatus.WORKING;
            if (str.equals(agentActivityStatus3.getValue())) {
                return agentActivityStatus3;
            }
            AgentActivityStatus agentActivityStatus4 = AgentActivityStatus.COMPOSING;
            if (str.equals(agentActivityStatus4.getValue())) {
                return agentActivityStatus4;
            }
            AgentActivityStatus agentActivityStatus5 = AgentActivityStatus.WAITING_FOR_SUBAGENTS;
            if (str.equals(agentActivityStatus5.getValue())) {
                return agentActivityStatus5;
            }
            AgentActivityStatus agentActivityStatus6 = AgentActivityStatus.COMPACTING;
            if (str.equals(agentActivityStatus6.getValue())) {
                return agentActivityStatus6;
            }
            AgentActivityStatus agentActivityStatus7 = AgentActivityStatus.NEEDS_APPROVAL;
            if (str.equals(agentActivityStatus7.getValue())) {
                return agentActivityStatus7;
            }
            AgentActivityStatus agentActivityStatus8 = AgentActivityStatus.OUT_OF_CREDITS;
            return !str.equals(agentActivityStatus8.getValue()) ? AgentActivityStatus.ONLINE : agentActivityStatus8;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static Ey9<AgentActivityStatus> getEntries() {
        return $ENTRIES;
    }

    public static AgentActivityStatus valueOf(String str) {
        return (AgentActivityStatus) Enum.valueOf(AgentActivityStatus.class, str);
    }

    public static AgentActivityStatus[] values() {
        return (AgentActivityStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public AgentActivityStatus(String str, int i, String str2) {
        this.value = str2;
    }
}
