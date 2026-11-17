package com.facebook.aura.startup;

import X.AnonymousClass002;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.qpl.startup.signal.PointSignalResult;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;

/* loaded from: classes3.dex */
public final class HatchGatewayStartupRequirement {
    public static boolean active;
    public static String gatewayConnectEndFailureReason;
    public static boolean gatewayConnectEndSucceeded;
    public static boolean terminalEmitted;
    public static final HatchGatewayStartupRequirement INSTANCE = new HatchGatewayStartupRequirement();
    public static final Object lock = C3cG.A0T();
    public static AuraSessionManager.SessionState state = AuraSessionManager.SessionState.Initializing.INSTANCE;

    public final void reportGatewayConnectFailure(String str) {
        C7384Etj.A0Y(str, 0);
        reportGatewayConnectEnd(C60O.A0s("FAILURE", str));
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.GATEWAY_CONNECT_FAIL);
    }

    public final void reportGatewayConnectSuccess() {
        reportGatewayConnectEnd(C60O.A0s("SUCCESS", null));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GatewayRequirementTerminalAction.values().length];
            try {
                AnonymousClass002.A13(GatewayRequirementTerminalAction.NONE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(GatewayRequirementTerminalAction.SUCCESS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(GatewayRequirementTerminalAction.FAILURE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void emitTerminal(GatewayRequirementTerminal gatewayRequirementTerminal) {
        String str;
        HatchStartupQpl.Companion companion;
        String str2;
        int iOrdinal = gatewayRequirementTerminal.action.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                str = gatewayRequirementTerminal.reason;
                companion = HatchStartupQpl.Companion;
                str2 = "SUCCESS";
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                str = gatewayRequirementTerminal.reason;
                companion = HatchStartupQpl.Companion;
                str2 = "FAILURE";
            }
            companion.markerPoint(HatchStartupPoints.GATEWAY_REQUIREMENT_END, C60O.A0s(str2, str));
        }
    }

    private final String getName(AuraSessionManager.SessionState sessionState) {
        if (sessionState instanceof AuraSessionManager.SessionState.Initializing) {
            return "Initializing";
        }
        if (sessionState instanceof AuraSessionManager.SessionState.SignedOut) {
            return "SignedOut";
        }
        if (sessionState instanceof AuraSessionManager.SessionState.Activating) {
            return "Activating";
        }
        if (sessionState instanceof AuraSessionManager.SessionState.Active) {
            return "Active";
        }
        throw C3cG.A0q();
    }

    private final boolean isGatewayRequiredForActiveSession(AuraSessionManager.SessionState.Active active2) {
        AuraUserData auraUserData = (AuraUserData) C60P.A1J(AuraViewerDataProvider.Companion, active2.session);
        if (auraUserData != null) {
            return auraUserData.isChatCapable();
        }
        return false;
    }

    private final void reportGatewayConnectEnd(String str) {
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.GATEWAY_CONNECT_END, str);
        onGatewayConnectEnd(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.startup.GatewayRequirementTerminal updateRequirementLocked(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = com.facebook.aura.startup.HatchGatewayStartupRequirement.active
            if (r0 == 0) goto L52
            boolean r0 = com.facebook.aura.startup.HatchGatewayStartupRequirement.terminalEmitted
            if (r0 != 0) goto L52
            java.lang.String r2 = com.facebook.aura.startup.HatchGatewayStartupRequirement.gatewayConnectEndFailureReason
            com.facebook.aura.auth.AuraSessionManager$SessionState r1 = com.facebook.aura.startup.HatchGatewayStartupRequirement.state
            boolean r0 = r1 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Initializing
            if (r0 != 0) goto L4a
            boolean r0 = r1 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Activating
            if (r0 != 0) goto L4a
            boolean r0 = r1 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.SignedOut
            if (r0 != 0) goto L43
            boolean r0 = r1 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Active
            if (r0 == 0) goto L4d
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.auth.AuraSessionManager.SessionState.Active"
            X.C7384Etj.A0Z(r1, r0)
            com.facebook.aura.auth.AuraSessionManager$SessionState$Active r1 = (com.facebook.aura.auth.AuraSessionManager.SessionState.Active) r1
            boolean r0 = r3.isGatewayRequiredForActiveSession(r1)
            if (r0 == 0) goto L43
            if (r2 == 0) goto L3f
            com.facebook.aura.startup.GatewayRequirementTerminalAction r0 = com.facebook.aura.startup.GatewayRequirementTerminalAction.FAILURE
            com.facebook.aura.startup.GatewayRequirementTerminal r3 = new com.facebook.aura.startup.GatewayRequirementTerminal
            r3.<init>(r0, r2)
        L32:
            com.facebook.aura.startup.GatewayRequirementTerminalAction r1 = r3.action
            com.facebook.aura.startup.GatewayRequirementTerminalAction r0 = com.facebook.aura.startup.GatewayRequirementTerminalAction.NONE
            if (r1 == r0) goto L3e
            r0 = 1
            com.facebook.aura.startup.HatchGatewayStartupRequirement.terminalEmitted = r0
            r0 = 0
            com.facebook.aura.startup.HatchGatewayStartupRequirement.active = r0
        L3e:
            return r3
        L3f:
            boolean r0 = com.facebook.aura.startup.HatchGatewayStartupRequirement.gatewayConnectEndSucceeded
            if (r0 == 0) goto L4a
        L43:
            com.facebook.aura.startup.GatewayRequirementTerminal$Companion r0 = com.facebook.aura.startup.GatewayRequirementTerminal.Companion
            com.facebook.aura.startup.GatewayRequirementTerminal r3 = r0.success(r4)
            goto L32
        L4a:
            com.facebook.aura.startup.GatewayRequirementTerminal r3 = com.facebook.aura.startup.GatewayRequirementTerminal.NONE
            goto L32
        L4d:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L52:
            com.facebook.aura.startup.GatewayRequirementTerminal r3 = com.facebook.aura.startup.GatewayRequirementTerminal.NONE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.HatchGatewayStartupRequirement.updateRequirementLocked(java.lang.String):com.facebook.aura.startup.GatewayRequirementTerminal");
    }

    public final void begin(AuraSessionManager.SessionState sessionState) {
        GatewayRequirementTerminal gatewayRequirementTerminalUpdateRequirementLocked;
        C7384Etj.A0Y(sessionState, 0);
        synchronized (lock) {
            active = true;
            state = sessionState;
            gatewayConnectEndSucceeded = false;
            gatewayConnectEndFailureReason = null;
            terminalEmitted = false;
            HatchGatewayStartupRequirement hatchGatewayStartupRequirement = INSTANCE;
            gatewayRequirementTerminalUpdateRequirementLocked = hatchGatewayStartupRequirement.updateRequirementLocked(FGI.A0M("SessionState:", hatchGatewayStartupRequirement.getName(sessionState)));
        }
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.GATEWAY_REQUIREMENT_START);
        emitTerminal(gatewayRequirementTerminalUpdateRequirementLocked);
    }

    public final void onGatewayConnectEnd(String str) {
        GatewayRequirementTerminal gatewayRequirementTerminalUpdateRequirementLocked;
        synchronized (lock) {
            if (!active || terminalEmitted) {
                return;
            }
            PointSignalResult pointSignalResult = PointSignalResult.Companion.parse(str);
            if (pointSignalResult == null || !pointSignalResult.isFailure()) {
                gatewayConnectEndSucceeded = true;
                gatewayConnectEndFailureReason = null;
                gatewayRequirementTerminalUpdateRequirementLocked = INSTANCE.updateRequirementLocked("GatewayConnectMatched");
            } else {
                gatewayConnectEndSucceeded = false;
                gatewayConnectEndFailureReason = FGI.A0M("gateway_connect_end failed. Reason: ", pointSignalResult.reason);
                HatchGatewayStartupRequirement hatchGatewayStartupRequirement = INSTANCE;
                gatewayRequirementTerminalUpdateRequirementLocked = hatchGatewayStartupRequirement.updateRequirementLocked(FGI.A0M("SessionState:", hatchGatewayStartupRequirement.getName(state)));
            }
            emitTerminal(gatewayRequirementTerminalUpdateRequirementLocked);
        }
    }

    public final void onGatewayConnectStart() {
        synchronized (lock) {
            if (active && !terminalEmitted) {
                gatewayConnectEndSucceeded = false;
                gatewayConnectEndFailureReason = null;
            }
        }
    }

    public final void onSessionState(AuraSessionManager.SessionState sessionState) {
        C7384Etj.A0Y(sessionState, 0);
        synchronized (lock) {
            if (!active || terminalEmitted) {
                return;
            }
            if ((state instanceof AuraSessionManager.SessionState.Active) && !(sessionState instanceof AuraSessionManager.SessionState.Active)) {
                gatewayConnectEndSucceeded = false;
                gatewayConnectEndFailureReason = null;
            }
            state = sessionState;
            HatchGatewayStartupRequirement hatchGatewayStartupRequirement = INSTANCE;
            emitTerminal(hatchGatewayStartupRequirement.updateRequirementLocked(FGI.A0M("SessionState:", hatchGatewayStartupRequirement.getName(sessionState))));
        }
    }

    public final void stopTracking() {
        synchronized (lock) {
            active = false;
        }
    }

    public final void reportGatewayConnectStart() {
        onGatewayConnectStart();
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.GATEWAY_CONNECT_START);
    }
}
