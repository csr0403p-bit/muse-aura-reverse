package com.facebook.aura.perf;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.Bs8;
import X.C3cI;
import X.C60Q;
import X.C6tn;
import X.C7384Etj;
import X.C8j2;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class HatchConnectorQplLogger {
    public static final int ERROR_MESSAGE_LIMIT = 200;
    public static final String POINT_ALREADY_CONNECTED_SHOWN = "already_connected_shown";
    public static final String POINT_AUTH_CALLBACK_RECEIVED = "auth_callback_received";
    public static final String POINT_AUTH_METHOD_STARTED = "auth_method_started";
    public static final String POINT_CONFIRMATION_SHOWN = "confirmation_shown";
    public static final String POINT_CONSENT_ACCEPTED = "consent_accepted";
    public static final String POINT_CONSENT_SHEET_LOADED = "consent_sheet_loaded";
    public static final String POINT_CONSENT_SHEET_LOADING = "consent_sheet_loading";
    public static final String POINT_CREDENTIAL_SUBMITTED = "credential_submitted";
    public static final String POINT_CREDENTIAL_VALIDATION_FAILED = "credential_validation_failed";
    public static final String POINT_DISCONNECT_CONFIRMED = "disconnect_confirmed";
    public static final String POINT_MUTATION_RESPONSE = "mutation_response";
    public static final String POINT_MUTATION_SENT = "mutation_sent";
    public static final String POINT_REGISTER_FAILED = "register_failed";
    public static final String POINT_THIRD_PARTY_REDIRECT = "third_party_redirect";
    public static final String POINT_UI_UPDATED = "ui_updated";
    public static final HatchConnectorQplLogger INSTANCE = new HatchConnectorQplLogger();
    public static final AtomicReference<AuthTraceState> activeAuthTrace = new AtomicReference<>();
    public static final AtomicReference<String> activeDisconnectTrace = new AtomicReference<>();

    /* loaded from: classes.dex */
    public final class AuthEntryPoint {
        public static final String CHAT = "chat";
        public static final AuthEntryPoint INSTANCE = new AuthEntryPoint();
        public static final String ONBOARDING = "onboarding";
        public static final String SETTINGS = "settings";
    }

    public final class AuthFailureReason {
        public static final String CONFIG_INVALID = "config_invalid";
        public static final AuthFailureReason INSTANCE = new AuthFailureReason();
        public static final String INVALID_CREDENTIALS = "invalid_credentials";
        public static final String LINKING_FAILURE = "linking_failure";
        public static final String NETWORK_ERROR = "network_error";
        public static final String OAUTH_ERROR = "oauth_error";
        public static final String SERVER_ERROR = "server_error";
    }

    public final class AuthTraceState {
        public final String authType;
        public volatile boolean consentAccepted;
        public final AtomicBoolean firstErrorAnnotated;
        public final boolean isCustom;
        public volatile String oauthFlowType;
        public final String provider;
        public final String skillName;
        public final AtomicBoolean terminated;
        public final HatchConnectorAuthTraceId traceId;

        public AuthTraceState(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str, String str2, String str3, boolean z) {
            AnonymousClass005.A10(hatchConnectorAuthTraceId, str, str2);
            this.traceId = hatchConnectorAuthTraceId;
            this.authType = str;
            this.skillName = str2;
            this.provider = str3;
            this.isCustom = z;
            this.terminated = new AtomicBoolean(false);
            this.firstErrorAnnotated = new AtomicBoolean(false);
        }

        public final String getAuthType() {
            return this.authType;
        }

        public final boolean getConsentAccepted() {
            return this.consentAccepted;
        }

        public final AtomicBoolean getFirstErrorAnnotated() {
            return this.firstErrorAnnotated;
        }

        public final String getOauthFlowType() {
            return this.oauthFlowType;
        }

        public final String getProvider() {
            return this.provider;
        }

        public final String getSkillName() {
            return this.skillName;
        }

        public final AtomicBoolean getTerminated() {
            return this.terminated;
        }

        public final HatchConnectorAuthTraceId getTraceId() {
            return this.traceId;
        }

        public final boolean isCustom() {
            return this.isCustom;
        }

        public final void setConsentAccepted(boolean z) {
            this.consentAccepted = z;
        }

        public final void setOauthFlowType(String str) {
            this.oauthFlowType = str;
        }
    }

    public final class AuthType {
        public static final String API_KEY = "api_key";
        public static final String CONSENT = "consent";
        public static final String FIRST_PARTY_AUTH = "first_party_auth";
        public static final AuthType INSTANCE = new AuthType();
        public static final String OAUTH = "oauth";
        public static final String PASSWORD = "password";
    }

    /* loaded from: classes4.dex */
    public final class CancelPoint {
        public static final String ABANDONED = "abandoned";
        public static final String AUTH_DISMISSED = "auth_dismissed";
        public static final String CONSENT_DENIED = "consent_denied";
        public static final CancelPoint INSTANCE = new CancelPoint();
        public static final String SUPERSEDED = "superseded";
    }

    /* loaded from: classes.dex */
    public final class DisconnectEntryPoint {
        public static final DisconnectEntryPoint INSTANCE = new DisconnectEntryPoint();
        public static final String SETTINGS_CONNECTED_APPS = "settings_connected_apps";
        public static final String SETTINGS_SKILL_DETAIL = "settings_skill_detail";
    }

    public final class DisconnectFailureReason {
        public static final DisconnectFailureReason INSTANCE = new DisconnectFailureReason();
        public static final String NETWORK_ERROR = "network_error";
        public static final String SERVER_ERROR = "server_error";
    }

    public final class OAuthFlowType {
        public static final String DIRECT_OAUTH = "direct_oauth";
        public static final OAuthFlowType INSTANCE = new OAuthFlowType();
    }

    public final void endAuthCancel(String str) {
        C7384Etj.A0Y(str, 0);
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.endAuthCancel(authTraceStateA0O, str);
        }
    }

    public final void endAuthDismissedBeforeConsent(HatchConnectorAuthTraceId hatchConnectorAuthTraceId) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace == null || authTraceStateAuthTrace.consentAccepted) {
            return;
        }
        INSTANCE.endAuthCancel(authTraceStateAuthTrace, C8j2.A00(64));
    }

    public final void endAuthFail(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.endAuthFail(authTraceStateA0O, str, str2, str3);
        }
    }

    public final void endDisconnectFail(String str, String str2, String str3) {
        String strA03;
        C7384Etj.A0Y(str, 0);
        String andSet = activeDisconnectTrace.getAndSet(null);
        if (andSet != null) {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734861647, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str, andSet);
            if (str2 != null) {
                hatchQplLogger.markerAnnotate(734861647, "error_type", str2, andSet);
            }
            if (str3 != null && (strA03 = C6tn.A03(str3)) != null) {
                hatchQplLogger.markerAnnotate(734861647, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, strA03, andSet);
            }
            hatchQplLogger.markerEnd(734861647, (short) 3, andSet);
        }
    }

    public final void markAuthCallbackReceived(HatchConnectorAuthTraceId hatchConnectorAuthTraceId) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.pointAuth(authTraceStateAuthTrace, POINT_AUTH_CALLBACK_RECEIVED);
        }
    }

    public final void markCredentialSubmitted(HatchConnectorAuthTraceId hatchConnectorAuthTraceId) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.pointAuth(authTraceStateAuthTrace, POINT_CREDENTIAL_SUBMITTED);
        }
    }

    public final void markRegistered(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, boolean z) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.annotateAuth(authTraceStateAuthTrace, "replaced_existing", z);
        }
    }

    public final HatchConnectorAuthTraceId startAuth(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        AuthTraceState authTraceState = new AuthTraceState(new HatchConnectorAuthTraceId(AnonymousClass002.A0k()), str, str3, str3, z);
        AuthTraceState andSet = activeAuthTrace.getAndSet(authTraceState);
        if (andSet != null) {
            INSTANCE.endAuthCancel(andSet, "superseded");
        }
        beginAuth(authTraceState, str2);
        return authTraceState.traceId;
    }

    public final void startDisconnect(String str, String str2, String str3, boolean z) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1A(str2, 1, str3);
        String strA0k = AnonymousClass002.A0k();
        String andSet = activeDisconnectTrace.getAndSet(strA0k);
        if (andSet != null) {
            HatchQplLogger.INSTANCE.markerEnd(734861647, (short) 4, andSet);
        }
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734861647, strA0k, true);
        if (!z) {
            hatchQplLogger.markerAnnotate(734861647, "skill_name", str, strA0k);
            hatchQplLogger.markerAnnotate(734861647, "provider", str2, strA0k);
        }
        hatchQplLogger.markerAnnotate(734861647, "entry_point", str3, strA0k);
        hatchQplLogger.markerAnnotate(734861647, "is_custom_connector", z, strA0k);
    }

    private final void annotateAuth(AuthTraceState authTraceState, String str, String str2) {
        HatchQplLogger.INSTANCE.markerAnnotate(734862839, str, str2, authTraceState.traceId.instanceKey);
    }

    private final void annotateAuthProvider(AuthTraceState authTraceState) {
        String str;
        if (authTraceState.isCustom || (str = authTraceState.provider) == null) {
            return;
        }
        INSTANCE.annotateAuth(authTraceState, "provider", str);
    }

    private final void annotateFirstError(AuthTraceState authTraceState, String str) {
        if (C3cI.A1W(authTraceState.firstErrorAnnotated)) {
            annotateAuth(authTraceState, "first_error_type", str);
        }
    }

    private final void beginAuth(AuthTraceState authTraceState, String str) {
        HatchQplLogger.INSTANCE.markerStart(734862839, authTraceState.traceId.instanceKey, false);
        annotateAuth(authTraceState, "auth_type", authTraceState.authType);
        annotateAuth(authTraceState, "entry_point", str);
        annotateAuth(authTraceState, "is_custom_connector", authTraceState.isCustom);
        if (authTraceState.isCustom) {
            return;
        }
        annotateAuth(authTraceState, "skill_name", authTraceState.skillName);
        String str2 = authTraceState.provider;
        if (str2 != null) {
            INSTANCE.annotateAuth(authTraceState, "provider", str2);
        }
    }

    private final void endAuth(AuthTraceState authTraceState, short s) {
        HatchQplLogger.INSTANCE.markerEnd(734862839, s, authTraceState.traceId.instanceKey);
        Bs8.A00(authTraceState, null, activeAuthTrace);
    }

    public static /* synthetic */ void endAuthFail$default(HatchConnectorQplLogger hatchConnectorQplLogger, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        hatchConnectorQplLogger.endAuthFail(str, str2, str3);
    }

    public static /* synthetic */ void endDisconnectFail$default(HatchConnectorQplLogger hatchConnectorQplLogger, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        hatchConnectorQplLogger.endDisconnectFail(str, str2, str3);
    }

    private final void markThirdPartyRedirect(AuthTraceState authTraceState, String str) {
        pointAuth(authTraceState, POINT_THIRD_PARTY_REDIRECT);
        if (str != null) {
            INSTANCE.annotateAuth(authTraceState, "auth_domain", str);
        }
    }

    private final void pointAuth(AuthTraceState authTraceState, String str) {
        HatchQplLogger.INSTANCE.markerPoint(734862839, str, authTraceState.traceId.instanceKey);
    }

    private final void pointDisconnect(String str) {
        String str2 = activeDisconnectTrace.get();
        if (str2 != null) {
            HatchQplLogger.INSTANCE.markerPoint(734861647, str, str2);
        }
    }

    public final void endDisconnectCancel() {
        String andSet = activeDisconnectTrace.getAndSet(null);
        if (andSet != null) {
            HatchQplLogger.INSTANCE.markerEnd(734861647, (short) 4, andSet);
        }
    }

    public final void endDisconnectSuccess() {
        String andSet = activeDisconnectTrace.getAndSet(null);
        if (andSet != null) {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerPoint(734861647, POINT_UI_UPDATED, andSet);
            hatchQplLogger.markerEnd(734861647, (short) 2, andSet);
        }
    }

    public final void markDisconnectConfirmationShown() {
        pointDisconnect(POINT_CONFIRMATION_SHOWN);
    }

    public final void markDisconnectConfirmed() {
        pointDisconnect(POINT_DISCONNECT_CONFIRMED);
    }

    public final void markDisconnectMutationResponse() {
        pointDisconnect(POINT_MUTATION_RESPONSE);
    }

    public final void markDisconnectMutationSent() {
        pointDisconnect(POINT_MUTATION_SENT);
    }

    private final AuthTraceState authTrace(HatchConnectorAuthTraceId hatchConnectorAuthTraceId) {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O == null || authTraceStateA0O.terminated.get() || !C7384Etj.areEqual(authTraceStateA0O.traceId.instanceKey, hatchConnectorAuthTraceId.instanceKey)) {
            return null;
        }
        return authTraceStateA0O;
    }

    public final HatchConnectorAuthTraceId activeAuthTraceId() {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            return authTraceStateA0O.traceId;
        }
        return null;
    }

    public final void endAuthSuccess(boolean z) {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.endAuthSuccess(authTraceStateA0O, z);
        }
    }

    public final void markAuthCallbackReceivedAndEndSuccess() {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            HatchConnectorQplLogger hatchConnectorQplLogger = INSTANCE;
            hatchConnectorQplLogger.pointAuth(authTraceStateA0O, POINT_AUTH_CALLBACK_RECEIVED);
            hatchConnectorQplLogger.endAuthSuccess(authTraceStateA0O, false);
        }
    }

    public final void markAuthMethodStarted(String str) {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.markAuthMethodStarted(authTraceStateA0O, str);
        }
    }

    public final void markConsentAccepted() {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            authTraceStateA0O.consentAccepted = true;
            INSTANCE.pointAuth(authTraceStateA0O, POINT_CONSENT_ACCEPTED);
        }
    }

    public final void markConsentSheetLoaded(boolean z) {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.markConsentSheetLoaded(authTraceStateA0O, z);
        }
    }

    public final void markConsentSheetLoading(boolean z) {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.markConsentSheetLoading(authTraceStateA0O, z);
        }
    }

    public final void markCredentialValidationFailed(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str) {
        AnonymousClass003.A0u(hatchConnectorAuthTraceId, str);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            HatchConnectorQplLogger hatchConnectorQplLogger = INSTANCE;
            hatchConnectorQplLogger.pointAuth(authTraceStateAuthTrace, POINT_CREDENTIAL_VALIDATION_FAILED);
            hatchConnectorQplLogger.annotateFirstError(authTraceStateAuthTrace, str);
        }
    }

    public final void markDirectOAuthRedirectStarted(String str) {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.markDirectOAuthRedirectStarted(authTraceStateA0O, str);
        }
    }

    public final void markDisconnectConfirmedAndMutationSent() {
        markDisconnectConfirmed();
        markDisconnectMutationSent();
    }

    public final void markRegisterFailed(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str) {
        AnonymousClass003.A0u(hatchConnectorAuthTraceId, str);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            HatchConnectorQplLogger hatchConnectorQplLogger = INSTANCE;
            hatchConnectorQplLogger.pointAuth(authTraceStateAuthTrace, POINT_REGISTER_FAILED);
            hatchConnectorQplLogger.annotateFirstError(authTraceStateAuthTrace, str);
        }
    }

    private final void annotateAuth(AuthTraceState authTraceState, String str, boolean z) {
        HatchQplLogger.INSTANCE.markerAnnotate(734862839, str, z, authTraceState.traceId.instanceKey);
    }

    private final void endAuthCancel(AuthTraceState authTraceState, String str) {
        if (C3cI.A1W(authTraceState.terminated)) {
            annotateAuth(authTraceState, "auth_type", authTraceState.authType);
            annotateAuth(authTraceState, "cancel_point", str);
            endAuth(authTraceState, (short) 4);
        }
    }

    private final void endAuthFail(AuthTraceState authTraceState, String str, String str2, String str3) {
        String strA03;
        if (C3cI.A1W(authTraceState.terminated)) {
            annotateAuth(authTraceState, "auth_type", authTraceState.authType);
            annotateAuthProvider(authTraceState);
            annotateAuth(authTraceState, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str);
            if (str2 != null) {
                INSTANCE.annotateAuth(authTraceState, "error_type", str2);
            }
            if (str3 != null && (strA03 = C6tn.A03(str3)) != null) {
                INSTANCE.annotateAuth(authTraceState, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, strA03);
            }
            endAuth(authTraceState, (short) 3);
        }
    }

    public static /* synthetic */ void endAuthFail$default(HatchConnectorQplLogger hatchConnectorQplLogger, HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        hatchConnectorQplLogger.endAuthFail(hatchConnectorAuthTraceId, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAuthSuccess(AuthTraceState authTraceState, boolean z) {
        if (C3cI.A1W(authTraceState.terminated)) {
            pointAuth(authTraceState, POINT_UI_UPDATED);
            annotateAuth(authTraceState, "auth_type", authTraceState.authType);
            annotateAuthProvider(authTraceState);
            String str = authTraceState.oauthFlowType;
            if (str != null) {
                INSTANCE.annotateAuth(authTraceState, "oauth_flow_type", str);
            }
            annotateAuth(authTraceState, "already_connected", z);
            endAuth(authTraceState, (short) 2);
        }
    }

    private final void markAuthMethodStarted(AuthTraceState authTraceState, String str) {
        pointAuth(authTraceState, POINT_AUTH_METHOD_STARTED);
        if ("oauth".equals(authTraceState.authType) && str != null) {
            authTraceState.oauthFlowType = str;
            annotateAuth(authTraceState, "oauth_flow_type", str);
        }
    }

    private final void markConsentSheetLoaded(AuthTraceState authTraceState, boolean z) {
        pointAuth(authTraceState, POINT_CONSENT_SHEET_LOADED);
        if (z) {
            pointAuth(authTraceState, POINT_ALREADY_CONNECTED_SHOWN);
            endAuthSuccess(authTraceState, true);
        }
    }

    public final void markAuthCallbackReceived() {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.pointAuth(authTraceStateA0O, POINT_AUTH_CALLBACK_RECEIVED);
        }
    }

    public final void markConsentSheetLoading(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, boolean z) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.markConsentSheetLoading(authTraceStateAuthTrace, z);
        }
    }

    public final void markCredentialSubmitted() {
        AuthTraceState authTraceStateA0O = C60Q.A0O();
        if (authTraceStateA0O != null) {
            INSTANCE.pointAuth(authTraceStateA0O, POINT_CREDENTIAL_SUBMITTED);
        }
    }

    public final void markDirectOAuthRedirectStarted(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.markDirectOAuthRedirectStarted(authTraceStateAuthTrace, str);
        }
    }

    private final void markConsentSheetLoading(AuthTraceState authTraceState, boolean z) {
        pointAuth(authTraceState, POINT_CONSENT_SHEET_LOADING);
        annotateAuth(authTraceState, "needs_skills_fetch", z);
    }

    private final void markDirectOAuthRedirectStarted(AuthTraceState authTraceState, String str) {
        markAuthMethodStarted(authTraceState, "direct_oauth");
        markThirdPartyRedirect(authTraceState, str);
    }

    public final void endAuthCancel(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str) {
        AnonymousClass003.A0u(hatchConnectorAuthTraceId, str);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.endAuthCancel(authTraceStateAuthTrace, str);
        }
    }

    public final void endAuthFail(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str, String str2, String str3) {
        AnonymousClass003.A0u(hatchConnectorAuthTraceId, str);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.endAuthFail(authTraceStateAuthTrace, str, str2, str3);
        }
    }

    public final void endAuthSuccess(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, boolean z) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.endAuthSuccess(authTraceStateAuthTrace, z);
        }
    }

    public final void markAuthMethodStarted(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, String str) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.markAuthMethodStarted(authTraceStateAuthTrace, str);
        }
    }

    public final void markConsentSheetLoaded(HatchConnectorAuthTraceId hatchConnectorAuthTraceId, boolean z) {
        C7384Etj.A0Y(hatchConnectorAuthTraceId, 0);
        AuthTraceState authTraceStateAuthTrace = authTrace(hatchConnectorAuthTraceId);
        if (authTraceStateAuthTrace != null) {
            INSTANCE.markConsentSheetLoaded(authTraceStateAuthTrace, z);
        }
    }
}
