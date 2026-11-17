package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgentPermissionRequestPresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgentPermissionRequestPresentation[] $VALUES;
    public static final Companion Companion;
    public static final AgentPermissionRequestPresentation DETAILS;
    public static final AgentPermissionRequestPresentation INLINE;
    public final String wireValue;

    static {
        AgentPermissionRequestPresentation agentPermissionRequestPresentation = new AgentPermissionRequestPresentation("INLINE", 0, "inline");
        INLINE = agentPermissionRequestPresentation;
        AgentPermissionRequestPresentation agentPermissionRequestPresentation2 = new AgentPermissionRequestPresentation("DETAILS", 1, "details");
        DETAILS = agentPermissionRequestPresentation2;
        AgentPermissionRequestPresentation[] agentPermissionRequestPresentationArr = {agentPermissionRequestPresentation, agentPermissionRequestPresentation2};
        $VALUES = agentPermissionRequestPresentationArr;
        $ENTRIES = C3cG.A0w(agentPermissionRequestPresentationArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final AgentPermissionRequestPresentation fromWire(String str) {
            AgentPermissionRequestPresentation next;
            Iterator<AgentPermissionRequestPresentation> it = AgentPermissionRequestPresentation.getEntries().iterator();
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
            AgentPermissionRequestPresentation agentPermissionRequestPresentation = next;
            return agentPermissionRequestPresentation == null ? AgentPermissionRequestPresentation.DETAILS : agentPermissionRequestPresentation;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<AgentPermissionRequestPresentation> getEntries() {
        return $ENTRIES;
    }

    public static AgentPermissionRequestPresentation valueOf(String str) {
        return (AgentPermissionRequestPresentation) Enum.valueOf(AgentPermissionRequestPresentation.class, str);
    }

    public static AgentPermissionRequestPresentation[] values() {
        return (AgentPermissionRequestPresentation[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public AgentPermissionRequestPresentation(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
