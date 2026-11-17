package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.connection.ConnectionPhase;

/* loaded from: classes5.dex */
public abstract class HatchGatewayConnectionStateKt {
    public static final HatchCvmAuthenticationState afterConnectionPhase(HatchCvmAuthenticationState hatchCvmAuthenticationState, ConnectionPhase connectionPhase) {
        HatchCvmAuthenticationState hatchCvmAuthenticationState2;
        C7384Etj.A0Y(hatchCvmAuthenticationState, 0);
        C7384Etj.A0Y(connectionPhase, 1);
        if (connectionPhase.equals(ConnectionPhase.Connecting.INSTANCE) || (connectionPhase instanceof ConnectionPhase.Reconnecting)) {
            hatchCvmAuthenticationState2 = HatchCvmAuthenticationState.Disabled.INSTANCE;
        } else if (connectionPhase.equals(ConnectionPhase.Connected.INSTANCE)) {
            if (!hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.Verifying.INSTANCE)) {
                return hatchCvmAuthenticationState;
            }
            hatchCvmAuthenticationState2 = HatchCvmAuthenticationState.Ready.INSTANCE;
        } else {
            if (connectionPhase.equals(ConnectionPhase.StorageRecoveryConnected.INSTANCE)) {
                return hatchCvmAuthenticationState;
            }
            if (connectionPhase instanceof ConnectionPhase.Failed) {
                int iOrdinal = ((ConnectionPhase.Failed) connectionPhase).cause.ordinal();
                if (iOrdinal == 3) {
                    hatchCvmAuthenticationState2 = HatchCvmAuthenticationState.RecoveryRequired.INSTANCE;
                } else if (iOrdinal == 4) {
                    hatchCvmAuthenticationState2 = HatchCvmAuthenticationState.EnrollmentRequired.INSTANCE;
                } else if (iOrdinal == 5) {
                    hatchCvmAuthenticationState2 = HatchCvmAuthenticationState.VerificationFailed.INSTANCE;
                } else {
                    if (!hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.Verifying.INSTANCE) && !hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.Ready.INSTANCE)) {
                        if (hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.Disabled.INSTANCE) || hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.RecoveryRequired.INSTANCE) || hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.EnrollmentRequired.INSTANCE) || hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.VerificationFailed.INSTANCE) || hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.Failed.INSTANCE)) {
                            return hatchCvmAuthenticationState;
                        }
                        throw C3cG.A0q();
                    }
                    hatchCvmAuthenticationState2 = HatchCvmAuthenticationState.Failed.INSTANCE;
                }
            } else {
                if (!connectionPhase.equals(ConnectionPhase.Idle.INSTANCE) && !connectionPhase.equals(ConnectionPhase.Offline.INSTANCE) && !connectionPhase.equals(ConnectionPhase.Paused.INSTANCE) && !connectionPhase.equals(ConnectionPhase.Resetting.INSTANCE)) {
                    throw C3cG.A0q();
                }
                hatchCvmAuthenticationState2 = HatchCvmAuthenticationState.Disabled.INSTANCE;
            }
        }
        return hatchCvmAuthenticationState2;
    }

    public static final boolean isConfidentiallyReady(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
        C7384Etj.A0Y(hatchGatewayStateSnapshot, 0);
        if (hatchGatewayStateSnapshot.connection instanceof HatchGatewayConnectionState.Connected) {
            return C8j3.A1W(hatchGatewayStateSnapshot.authentication, HatchCvmAuthenticationState.Ready.INSTANCE, false);
        }
        return false;
    }

    public static final boolean isOffline(HatchGatewayConnectionState hatchGatewayConnectionState) {
        C7384Etj.A0Y(hatchGatewayConnectionState, 0);
        return (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Disconnected) && ((HatchGatewayConnectionState.Disconnected) hatchGatewayConnectionState).reason == HatchGatewayConnectionState.Reason.OFFLINE;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionPhase.FailureCause.values().length];
            try {
                AnonymousClass002.A13(ConnectionPhase.FailureCause.CVM_KEY_REQUIRED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionPhase.FailureCause.CVM_ENROLLMENT_REQUIRED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectionPhase.FailureCause.CVM_VERIFICATION_FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
