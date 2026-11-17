package com.facebook.aura.qpl.startup.points;

import X.C3cG;
import X.C3cH;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchStartupPoints {
    public static final String ACTIVITY_ONCREATE_END = "activity_oncreate_end";
    public static final String ACTIVITY_ONCREATE_START = "activity_oncreate_start";
    public static final String ANNOTATION_CANCEL_REASON = "cancel_reason";
    public static final String ANNOTATION_FROM_LOGIN = "from_login";
    public static final String ANNOTATION_IS_BACKGROUND_START = "is_background_start";
    public static final String ANNOTATION_ONBOARDING_GATE = "onboarding_gate";
    public static final String ANNOTATION_ONBOARDING_GATE_RETRY_COUNT = "onboarding_gate_retry_count";
    public static final String ANNOTATION_ONBOARDING_GATE_STATE = "onboarding_gate_state";
    public static final String ANNOTATION_PREFETCH_AGE_MS = "prefetch_age_ms";
    public static final String ANNOTATION_PREFETCH_WRITER = "prefetch_writer";
    public static final String ANNOTATION_SERVED_FROM_CACHE = "served_from_cache";
    public static final String ANNOTATION_SURFACE = "surface";
    public static final String ANNOTATION_WAS_LOGGED_IN = "was_logged_in";
    public static final String APP_ON_CREATE_END = "app_on_create_end";
    public static final String APP_ON_CREATE_START = "app_on_create_start";
    public static final String BLOCKING_FETCH_END = "blocking_fetch_end";
    public static final String BLOCKING_FETCH_START = "blocking_fetch_start";
    public static final String CACHED_HISTORY_LOADED = "cached_history_loaded";
    public static final String CANCEL_REASON_ACTIVATION_FLOW_LOGOUT = "activation_flow_logout";
    public static final String CANCEL_REASON_BACKGROUNDED_DURING_STARTUP = "backgrounded_during_startup";
    public static final String CANCEL_REASON_BLOCKING_FETCH_ERROR = "blocking_fetch_error";
    public static final String COMPOSER = "composer";
    public static final String CONVERSATION = "conversation";
    public static final String CONVERSATION_FETCH_END = "conversation_fetch_end";
    public static final String CONVERSATION_FETCH_FAIL = "conversation_fetch_fail";
    public static final String CONVERSATION_FETCH_START = "conversation_fetch_start";
    public static final String CONVERSATION_REFRESH_END = "conversation_refresh_end";
    public static final String CONVERSATION_REFRESH_START = "conversation_refresh_start";
    public static final String GATEWAY_CONNECT_END = "gateway_connect_end";
    public static final String GATEWAY_CONNECT_FAIL = "gateway_connect_fail";
    public static final String GATEWAY_CONNECT_START = "gateway_connect_start";
    public static final String GATEWAY_REQUIREMENT_END = "gateway_requirement_end";
    public static final String GATEWAY_REQUIREMENT_START = "gateway_requirement_start";
    public static final String GRAPHQL_INIT_END = "graphql_init_end";
    public static final String GRAPHQL_INIT_START = "graphql_init_start";
    public static final String INITIAL_CONTENT_RENDERED = "initial_content_rendered";
    public static final HatchStartupPoints INSTANCE = new HatchStartupPoints();
    public static final String LACRIMA_INIT_END = "lacrima_init_end";
    public static final String LACRIMA_INIT_START = "lacrima_init_start";
    public static final String MC_INIT_END = "mc_init_end";
    public static final String MC_INIT_START = "mc_init_start";
    public static final String PREFETCH_WRITER_PUSH = "push";
    public static final String QPL_INIT_END = "qpl_init_end";
    public static final String QPL_INIT_START = "qpl_init_start";
    public static final String SESSIONLESS_BLOCKING_END = "sessionless_blocking_end";
    public static final String SESSIONLESS_BLOCKING_START = "sessionless_blocking_start";
    public static final String SESSIONLESS_MC_READY = "sessionless_mc_ready";
    public static final String SESSION_INIT_END = "session_init_end";
    public static final String SESSION_INIT_START = "session_init_start";
    public static final String SET_CONTENT = "set_content";
    public static final String SOLOADER_INIT_END = "soloader_init_end";
    public static final String SOLOADER_INIT_START = "soloader_init_start";
    public static final String SPLASH_INSTALL_END = "splash_install_end";
    public static final String SPLASH_INSTALL_START = "splash_install_start";
    public static final String SURFACE_ACTIVATION = "activation";
    public static final String SURFACE_CHAT = "chat";
    public static final String SURFACE_LOGIN = "login";
    public static final String SURFACE_UNKNOWN = "unknown";

    public final class Pairs {
        public static final Pairs INSTANCE = new Pairs();
        public static final Map<String, String> pointsPairs = C3cH.A0n(HatchStartupPoints.CONVERSATION_FETCH_START, HatchStartupPoints.CONVERSATION_FETCH_END, C3cG.A0r(HatchStartupPoints.SET_CONTENT, HatchStartupPoints.INITIAL_CONTENT_RENDERED), C3cG.A0r("conversation_render_start", "conversation_render_end"), C3cG.A0r("composer_render_start", "composer_render_end"));

        public final Map<String, String> getPointsPairs() {
            return pointsPairs;
        }
    }
}
