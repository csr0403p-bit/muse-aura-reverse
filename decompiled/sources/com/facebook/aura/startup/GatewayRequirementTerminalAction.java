package com.facebook.aura.startup;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GatewayRequirementTerminalAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GatewayRequirementTerminalAction[] $VALUES;
    public static final GatewayRequirementTerminalAction FAILURE;
    public static final GatewayRequirementTerminalAction NONE;
    public static final GatewayRequirementTerminalAction SUCCESS;

    static {
        GatewayRequirementTerminalAction gatewayRequirementTerminalAction = new GatewayRequirementTerminalAction(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = gatewayRequirementTerminalAction;
        GatewayRequirementTerminalAction gatewayRequirementTerminalAction2 = new GatewayRequirementTerminalAction("SUCCESS", 1);
        SUCCESS = gatewayRequirementTerminalAction2;
        GatewayRequirementTerminalAction gatewayRequirementTerminalAction3 = new GatewayRequirementTerminalAction("FAILURE", 2);
        FAILURE = gatewayRequirementTerminalAction3;
        GatewayRequirementTerminalAction[] gatewayRequirementTerminalActionArr = {gatewayRequirementTerminalAction, gatewayRequirementTerminalAction2, gatewayRequirementTerminalAction3};
        $VALUES = gatewayRequirementTerminalActionArr;
        $ENTRIES = C3cG.A0w(gatewayRequirementTerminalActionArr);
    }

    public static Ey9<GatewayRequirementTerminalAction> getEntries() {
        return $ENTRIES;
    }

    public static GatewayRequirementTerminalAction valueOf(String str) {
        return (GatewayRequirementTerminalAction) Enum.valueOf(GatewayRequirementTerminalAction.class, str);
    }

    public static GatewayRequirementTerminalAction[] values() {
        return (GatewayRequirementTerminalAction[]) $VALUES.clone();
    }

    public GatewayRequirementTerminalAction(String str, int i) {
    }
}
