package com.facebook.aura.startup;

import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class GatewayRequirementTerminal {
    public static final Companion Companion = new Companion();
    public static final GatewayRequirementTerminal NONE = new GatewayRequirementTerminal(GatewayRequirementTerminalAction.NONE, null);
    public final GatewayRequirementTerminalAction action;
    public final String reason;

    public final class Companion {
        public final GatewayRequirementTerminal failure(String str) {
            C7384Etj.A0Y(str, 0);
            return new GatewayRequirementTerminal(GatewayRequirementTerminalAction.FAILURE, str);
        }

        public final GatewayRequirementTerminal success(String str) {
            C7384Etj.A0Y(str, 0);
            return new GatewayRequirementTerminal(GatewayRequirementTerminalAction.SUCCESS, str);
        }

        public final GatewayRequirementTerminal getNONE() {
            return GatewayRequirementTerminal.NONE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GatewayRequirementTerminal(GatewayRequirementTerminalAction gatewayRequirementTerminalAction, String str) {
        C7384Etj.A0Y(gatewayRequirementTerminalAction, 0);
        this.action = gatewayRequirementTerminalAction;
        this.reason = str;
    }

    public final GatewayRequirementTerminalAction getAction() {
        return this.action;
    }

    public final String getReason() {
        return this.reason;
    }

    public /* synthetic */ GatewayRequirementTerminal(GatewayRequirementTerminalAction gatewayRequirementTerminalAction, String str, int i, C06H c06h) {
        this(gatewayRequirementTerminalAction, AnonymousClass006.A0s(i, str));
    }
}
