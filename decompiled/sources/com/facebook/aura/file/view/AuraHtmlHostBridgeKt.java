package com.facebook.aura.file.view;

import X.AnonymousClass002;
import X.C60O;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.Collections;
import java.util.Set;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class AuraHtmlHostBridgeKt {
    public static final Set<String> ALLOWED_HTML_HOST_CALL_ACTIONS = C60O.A19("goal_briefing.open", "goal_suggestion.accept");
    public static final Set<String> ALLOWED_HTML_HOST_NAVIGATE_TARGETS = Collections.singleton("chat.main");
    public static final int HATCH_HTML_HOST_BRIDGE_PENDING_EVENT_LIMIT = 32;
    public static final String HATCH_HTML_HOST_NATIVE_BRIDGE_NAME = "NativeBridge";
    public static final String TAG = "AuraHtmlHostBridge";

    public static final String hatchHtmlHostBridgeScript() {
        return "(function() {\n  if (window.__hatchHostBridgeInstalled) return;\n  window.__hatchHostBridgeInstalled = true;\n\n  var pendingEvents = [];\n  var maxPendingEvents = 32;\n\n  function rootNativeBridge() {\n    return window.NativeBridge;\n  }\n\n  function bridgeToken() {\n    return typeof window.__fbAndroidBridgeAuthToken === 'string'\n      ? window.__fbAndroidBridgeAuthToken\n      : '';\n  }\n\n  function plainObject(value) {\n    if (value == null) return {};\n    if (!value || typeof value !== 'object' || Array.isArray(value)) return {};\n    try {\n      var copy = JSON.parse(JSON.stringify(value));\n      return copy && typeof copy === 'object' && !Array.isArray(copy) ? copy : {};\n    } catch (e) {\n      return {};\n    }\n  }\n\n  function postNow(event) {\n    var bridge = rootNativeBridge();\n    var token = bridgeToken();\n    if (!bridge || !bridge.postHatchUrlEvent || !token) return false;\n    try {\n      bridge.postHatchUrlEvent(token, JSON.stringify(event));\n      return true;\n    } catch (e) {\n      return false;\n    }\n  }\n\n  function flushPendingEvents() {\n    if (!pendingEvents.length) return;\n    var events = pendingEvents;\n    pendingEvents = [];\n    for (var i = 0; i < events.length; i++) {\n      if (!postNow(events[i])) {\n        enqueuePendingEvent(events[i]);\n      }\n    }\n  }\n\n  function enqueuePendingEvent(event) {\n    if (pendingEvents.length >= maxPendingEvents) {\n      pendingEvents.shift();\n    }\n    pendingEvents.push(event);\n  }\n\n  function post(event) {\n    if (postNow(event)) return;\n    enqueuePendingEvent(event);\n  }\n\n  function emitCall(action, payload) {\n    var trimmed = typeof action === 'string' ? action.trim() : '';\n    if (!trimmed) return;\n    post({ type: 'hatch:call', action: trimmed, payload: plainObject(payload) });\n  }\n\n  function emitNavigate(target, params) {\n    var trimmed = typeof target === 'string' ? target.trim() : '';\n    if (!trimmed) return;\n    post({ type: 'hatch:navigate', target: trimmed, params: plainObject(params) });\n  }\n\n  function readCallRequest(callEl) {\n    if (!callEl) return null;\n    var action = callEl.getAttribute('data-hatch-call-action');\n    var trimmed = typeof action === 'string' ? action.trim() : '';\n    if (!trimmed) return null;\n    var payload = {};\n    var rawPayload =\n        callEl.getAttribute('data-hatch-call-payload') || callEl.getAttribute('data-payload');\n    if (rawPayload && rawPayload.trim()) {\n      try {\n        payload = plainObject(JSON.parse(rawPayload));\n      } catch (e) {\n        return null;\n      }\n    }\n    return { action: trimmed, payload: payload };\n  }\n\n  function readNavigateRequest(navigateEl) {\n    if (!navigateEl) return null;\n    var target = navigateEl.getAttribute('data-hatch-navigate-target');\n    var trimmed = typeof target === 'string' ? target.trim() : '';\n    if (!trimmed) return null;\n    var params = {};\n    var rawParams = navigateEl.getAttribute('data-hatch-navigate-params');\n    if (rawParams && rawParams.trim()) {\n      try {\n        params = plainObject(JSON.parse(rawParams));\n      } catch (e) {\n        return null;\n      }\n    }\n    return { target: trimmed, params: params };\n  }\n\n  window.hatch = window.hatch || {};\n  window.hatch.call = emitCall;\n  window.hatch.navigate = emitNavigate;\n\n  document.addEventListener('click', function(event) {\n    var target = event.target;\n    if (!target || typeof target.closest !== 'function') return;\n\n    var callEl = target.closest('[data-hatch-call-action]');\n    var navigateEl = target.closest('[data-hatch-navigate-target]');\n    if (!callEl && !navigateEl) return;\n\n    if ((callEl && (callEl.getAttribute('aria-disabled') === 'true' || callEl.hasAttribute('disabled')))\n      || (navigateEl && (navigateEl.getAttribute('aria-disabled') === 'true' || navigateEl.hasAttribute('disabled')))) {\n      event.preventDefault();\n      event.stopPropagation();\n      return;\n    }\n\n    var callRequest = readCallRequest(callEl);\n    var navigateRequest = readNavigateRequest(navigateEl);\n    if (callRequest || navigateRequest) {\n      event.preventDefault();\n      event.stopPropagation();\n    }\n\n    if (callRequest) {\n      emitCall(callRequest.action, callRequest.payload);\n    }\n\n    if (navigateRequest) {\n      emitNavigate(navigateRequest.target, navigateRequest.params);\n    }\n  }, true);\n\n  window.addEventListener('__fbAndroidBridgeAuthTokenInjected', flushPendingEvents);\n  flushPendingEvents();\n})();";
    }

    public static final AuraHtmlHostCallRequest toCallRequest(AuraHtmlHostEvent auraHtmlHostEvent) {
        String strA0l;
        String str = auraHtmlHostEvent.action;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
            strA0l = "";
        }
        if (strA0l.length() == 0 || !ALLOWED_HTML_HOST_CALL_ACTIONS.contains(strA0l)) {
            return null;
        }
        JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(auraHtmlHostEvent.payload);
        if (jsonObjectAsJsonObjectOrNull == null) {
            jsonObjectAsJsonObjectOrNull = C60O.A1G();
        }
        return new AuraHtmlHostCallRequest(strA0l, jsonObjectAsJsonObjectOrNull);
    }

    public static final AuraHtmlHostNavigateRequest toNavigateRequest(AuraHtmlHostEvent auraHtmlHostEvent) {
        String strA0l;
        String str = auraHtmlHostEvent.target;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
            strA0l = "";
        }
        if (strA0l.length() == 0 || !ALLOWED_HTML_HOST_NAVIGATE_TARGETS.contains(strA0l)) {
            return null;
        }
        JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(auraHtmlHostEvent.params);
        if (jsonObjectAsJsonObjectOrNull == null) {
            jsonObjectAsJsonObjectOrNull = C60O.A1G();
        }
        return new AuraHtmlHostNavigateRequest(strA0l, jsonObjectAsJsonObjectOrNull);
    }
}
