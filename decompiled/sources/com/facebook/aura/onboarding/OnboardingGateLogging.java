package com.facebook.aura.onboarding;

import X.AGH;
import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C0924AIa;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.HxE;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.onboarding.OnboardingGateDestination;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import java.util.Map;

/* loaded from: classes3.dex */
public final class OnboardingGateLogging {
    public static final String COMPONENT = "onboarding_gate";
    public static final String EVENT_NAME = "onboarding_gate_resolve";
    public static final OnboardingGateLogging INSTANCE = new OnboardingGateLogging();
    public static final String KEY_CONNECTION_STATE = "connection_state";
    public static final String KEY_ERROR_CODE = "error_code";
    public static final String KEY_GATEWAY_LAST_FAILURE = "gateway_last_failure";
    public static final String KEY_HTTP_STATUS = "http_status";
    public static final String KEY_ONBOARDING_GATE = "onboarding_gate";
    public static final String KEY_PHASE = "phase";
    public static final String KEY_REQUEST_ID = "request_id";
    public static final String KEY_RESOLVED_DESTINATION = "resolved_destination";
    public static final String KEY_TRANSPORT_FAILURE = "transport_failure";
    public static final String KEY_TRIGGER = "trigger";
    public static final String KEY_VM_WAIT = "vm_wait";
    public static final String KEY_VM_WAIT_MS = "vm_wait_ms";

    public final void logAbandoned(OnboardingGateAttempt onboardingGateAttempt, OnboardingGateLoadingPhase onboardingGateLoadingPhase, OnboardingGateDecision onboardingGateDecision) {
        String str;
        C7384Etj.A0Y(onboardingGateAttempt, 0);
        C7384Etj.A0Y(onboardingGateLoadingPhase, 1);
        HxE hxEA0r = C3cG.A0r(HatchMetadataKey.RESULT.getValue(), HatchConnectorQplLogger.CancelPoint.ABANDONED);
        int iOrdinal = onboardingGateLoadingPhase.ordinal();
        if (iOrdinal == 0) {
            str = "waiting_vm_connection";
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw C3cG.A0q();
            }
            str = "fetching_onboarding";
        }
        log(onboardingGateAttempt, onboardingGateDecision, AnonymousClass007.A0d("phase", str, hxEA0r));
    }

    public final String wireValue(HatchGatewayConnectionState hatchGatewayConnectionState) {
        C7384Etj.A0Y(hatchGatewayConnectionState, 0);
        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Disconnected) {
            return "disconnected";
        }
        if (hatchGatewayConnectionState.equals(HatchGatewayConnectionState.Connecting.INSTANCE)) {
            return "connecting";
        }
        if (hatchGatewayConnectionState.equals(HatchGatewayConnectionState.Connected.INSTANCE)) {
            return "connected";
        }
        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Reconnecting) {
            return C3cF.A00(50);
        }
        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Error) {
            return "error";
        }
        if (hatchGatewayConnectionState.equals(HatchGatewayConnectionState.Resetting.INSTANCE)) {
            return "resetting";
        }
        if (hatchGatewayConnectionState.equals(HatchGatewayConnectionState.Paused.INSTANCE)) {
            return "paused";
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingGateLoadingPhase.values().length];
            try {
                AnonymousClass002.A13(OnboardingGateLoadingPhase.WAITING_VM_CONNECTION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(OnboardingGateLoadingPhase.VM_CONNECTION_FAILED_FETCHING_ONBOARDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(OnboardingGateLoadingPhase.VM_CONNECTION_SUCCESS_FETCHING_ONBOARDING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void log(OnboardingGateAttempt onboardingGateAttempt, OnboardingGateDecision onboardingGateDecision, Map<String, String> map) {
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.ONBOARDING.getValue();
        String value2 = HatchSubsurface.ONBOARDING_POST_AUTH.getValue();
        String value3 = HatchEventType.STATUS_CHECK.getValue();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("trigger", onboardingGateAttempt.trigger.getWireValue());
        c0924AIaA0u.put(HatchMetadataKey.ATTEMPT_NUMBER.getValue(), String.valueOf(onboardingGateAttempt.number));
        C3cH.A1A(HatchMetadataKey.DURATION_MS.getValue(), c0924AIaA0u, SystemClock.elapsedRealtime() - onboardingGateAttempt.startedAtMs);
        if (onboardingGateDecision != null) {
            c0924AIaA0u.put("onboarding_gate", onboardingGateDecision.getWireValue());
        }
        hatchAppEventLogger.logEvent(EVENT_NAME, value, value2, value3, "onboarding_gate", AGH.A02(map, AIW.A0K(c0924AIaA0u)), null);
    }

    private final void putVmWait(Map<String, String> map, OnboardingGateVmWait onboardingGateVmWait) {
        map.put(KEY_VM_WAIT, onboardingGateVmWait.outcome.getWireValue());
        Long l = onboardingGateVmWait.elapsedMs;
        if (l != null) {
            map.put(KEY_VM_WAIT_MS, String.valueOf(l.longValue()));
        }
        HatchGatewayConnectionState hatchGatewayConnectionState = onboardingGateVmWait.connectionState;
        if (hatchGatewayConnectionState != null) {
            map.put("connection_state", INSTANCE.wireValue(hatchGatewayConnectionState));
        }
        map.put(KEY_GATEWAY_LAST_FAILURE, onboardingGateVmWait.gatewayLastFailure);
    }

    public final void logFailed(OnboardingGateAttempt onboardingGateAttempt, OnboardingGateVmWait onboardingGateVmWait, Throwable th, boolean z, OnboardingGateDecision onboardingGateDecision) {
        AnonymousClass005.A0x(onboardingGateAttempt, onboardingGateVmWait, th);
        C7384Etj.A0Y(onboardingGateDecision, 4);
        NetworkException networkException = th instanceof NetworkException ? (NetworkException) th : null;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), "error");
        c0924AIaA0u.put(HatchMetadataKey.FAILURE_REASON.getValue(), z ? "exception" : networkException == null ? "pages_no_response" : "pages_request_failed");
        if (networkException != null) {
            c0924AIaA0u.put("http_status", String.valueOf(networkException.httpResponseCode));
            String str = networkException.errorCode;
            if (str != null) {
                c0924AIaA0u.put("error_code", str);
            }
            String str2 = networkException.transportFailureKind;
            if (str2 != null) {
                c0924AIaA0u.put("transport_failure", str2);
            }
            c0924AIaA0u.put("request_id", onboardingGateAttempt.requestId);
        }
        INSTANCE.putVmWait(c0924AIaA0u, onboardingGateVmWait);
        log(onboardingGateAttempt, onboardingGateDecision, AIW.A0K(c0924AIaA0u));
    }

    public final void logResolved(OnboardingGateAttempt onboardingGateAttempt, OnboardingGateVmWait onboardingGateVmWait, OnboardingGateDestination onboardingGateDestination, OnboardingGateDecision onboardingGateDecision) {
        String str;
        AnonymousClass005.A14(onboardingGateAttempt, onboardingGateVmWait, onboardingGateDestination, onboardingGateDecision);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), "success");
        if (onboardingGateDestination.equals(OnboardingGateDestination.UiFlow.INSTANCE)) {
            str = OnboardingIntroPageKt.ONBOARDING_VARIANT_UI_DRIVEN;
        } else {
            if (!onboardingGateDestination.equals(OnboardingGateDestination.Conversation.INSTANCE)) {
                throw C3cG.A0q();
            }
            str = HatchStartupPoints.CONVERSATION;
        }
        c0924AIaA0u.put("resolved_destination", str);
        c0924AIaA0u.put("request_id", onboardingGateAttempt.requestId);
        INSTANCE.putVmWait(c0924AIaA0u, onboardingGateVmWait);
        log(onboardingGateAttempt, onboardingGateDecision, AIW.A0K(c0924AIaA0u));
    }
}
