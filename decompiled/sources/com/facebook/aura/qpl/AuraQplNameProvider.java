package com.facebook.aura.qpl;

import X.AbstractC10411Hbi;
import X.FGI;

/* loaded from: classes5.dex */
public final class AuraQplNameProvider {
    public static final AuraQplNameProvider INSTANCE = new AuraQplNameProvider();

    public String getMarkerName(int i) {
        int i2 = 65535 & i;
        if (((short) (i >> 16)) != 11213) {
            return FGI.A0H("stripped: ", i);
        }
        switch (i2) {
            case 1268:
                return "HATCH_APP_ACTIVATION_STATUS_FETCH";
            case 1467:
                return "HATCH_APP_NODE_PROACTIVE_SYNC";
            case 2168:
                return "HATCH_APP_AGENTIC_INTERACTION";
            case 2186:
                return "HATCH_APP_VOICE_CALL_SESSION";
            case 2342:
                return "HATCH_APP_COLD_START";
            case 2700:
                return "HATCH_APP_AGE_CONFIRMATION";
            case 3007:
                return "HATCH_APP_GATEWAY_DEMAND";
            case 3222:
                return "HATCH_APP_ACTIVATION_STATUS_REFRESH";
            case 3394:
                return "HATCH_APP_VM_WAKE";
            case 3868:
                return "HATCH_APP_MESSAGE_TTFT";
            case 4003:
                return "HATCH_APP_HOT_START";
            case 4530:
                return "HATCH_APP_NODE_REGISTRATION";
            case 4618:
                return "HATCH_APP_GATEWAY_NETWORK_RESTORE";
            case 4730:
                return "HATCH_APP_VOICE_SELECTION_SAVE";
            case 4825:
                return "HATCH_APP_SCROLL_PERF";
            case 5875:
                return "HATCH_APP_TAB_SWITCH";
            case 5890:
                return "HATCH_APP_PREWARM_START";
            case 6183:
                return "HATCH_APP_WARM_START";
            case 6222:
                return "HATCH_APP_UNLOCK";
            case 6479:
                return "HATCH_APP_CONNECTOR_DISCONNECT";
            case 6546:
                return "HATCH_APP_GATEWAY_RPC_TIMEOUT";
            case 6648:
                return "HATCH_APP_STREAM_COMPLETE";
            case 6724:
                return "HATCH_APP_IDENTITY_UPDATE_TO_AVATAR_READY";
            case 7671:
                return "HATCH_APP_CONNECTOR_AUTH";
            case 7933:
                return "HATCH_APP_VOICE_TURN_LATENCY";
            case 8279:
                return "HATCH_APP_ACTIVATION_FLOW";
            case 8403:
                return "HATCH_APP_GATEWAY_READY_STABILITY";
            case 9019:
                return "HATCH_APP_ARTIFACT_HTML_RENDER";
            case 9780:
                return "HATCH_APP_LOCK";
            case 9938:
                return "HATCH_APP_LOCK_STATUS_CHECK";
            case 10667:
                return "HATCH_APP_VOICE_EMBODIMENT_IDLE_FIRST_FRAME";
            case 10875:
                return "HATCH_APP_AGENT_SEND";
            case 11495:
                return "HATCH_APP_NAVIGATION_TTRC";
            case 11564:
                return "HATCH_APP_NODE_HEARTBEAT_FAILURE";
            case 11633:
                return "HATCH_APP_VOICE_EMBODIMENT_STILL_RENDER";
            case 12265:
                return "HATCH_APP_AVATAR_RECIPE_RECONCILE";
            case 12575:
                return "HATCH_APP_GATEWAY_CONNECT";
            case 12658:
                return "HATCH_APP_SURFACE_LOAD";
            case 12664:
                return "HATCH_APP_GATEWAY_DEMAND_START";
            case 12750:
                return "HATCH_APP_NODE_BACKFILL";
            case 13055:
                return "HATCH_APP_VM_WAKE_E2E";
            case 13099:
                return "HATCH_APP_ARTIFACT_HTML_ERROR";
            case 13763:
                return "HATCH_APP_NODE_COMMAND";
            case 14353:
                return "HATCH_APP_VOICE_CALL_BUTTON_READY";
            case 14856:
                return "HATCH_APP_CREDENTIALS_FETCH";
            case 14878:
                return "HATCH_APP_MESSAGE_FULL_RESPONSE";
            case 15222:
                return "HATCH_APP_VOICE_EMBODIMENT_IDLE_LOAD";
            case 15285:
                return "HATCH_APP_LIBRARY_LOAD";
            case 15319:
                return "HATCH_APP_XE_CONSENT_TTI";
            case 15468:
                return "HATCH_APP_FEED_LOAD";
            case 15510:
                return "HATCH_APP_VOICE_PREVIEW";
            case 15739:
                return "HATCH_APP_ARTIFACT_HTML_ACTION";
            case 15773:
                return "HATCH_APP_MESSAGE_SEND";
            case 15908:
                return "HATCH_APP_GATEWAY_RECOVERY_RECEIPT";
            case 16318:
                return "HATCH_APP_DEVICE_PAIRING";
            case 16345:
                return "HATCH_APP_VOICE_CATALOG_LOAD";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }

    public String getActionName(int i) {
        return AbstractC10411Hbi.A00(i);
    }
}
