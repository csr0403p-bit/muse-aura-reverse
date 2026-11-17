package com.facebook.aura.conversation.view.richcontent;

import X.AGH;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC9245GAx;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.B6A;
import X.C05716xA;
import X.C06827l3;
import X.C07739il;
import X.C1Lu;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C60S;
import X.C6tn;
import X.C6x7;
import X.C6xD;
import X.C6xU;
import X.C6xj;
import X.C6ys;
import X.C7384Etj;
import X.C7BY;
import X.C8iC;
import X.CFK;
import X.DCl;
import X.FGI;
import X.HDi;
import X.HtJ;
import X.HxS;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.json.HatchInlineScriptKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.network.transport.HatchHttpClientKt;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionType;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchWidgetWebViewKt {
    public static final String BRIDGE_NAME = "HatchBridge";
    public static final int ESTIMATED_MIN_HEIGHT_PX = 560;
    public static final String FOCUSED_FIELD_BOUNDS_SCRIPT = "typeof window.__hatchFocusedFieldBounds==='function'?window.__hatchFocusedFieldBounds():null";
    public static final float HORIZONTAL_SCROLL_DOMINANCE_RATIO = 2.0f;
    public static final int HTTP_BAD_GATEWAY = 502;
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_NOT_FOUND = 404;
    public static final int HTTP_NO_CONTENT = 204;
    public static final int MAX_RENDERER_RECOVERIES = 1;
    public static final int MAX_WIDGET_HEIGHT_PX = 100000;
    public static final String META_CDN_HOST_SUFFIX = ".fbcdn.net";
    public static final String RESET_FOCUS_INTENT_SCRIPT = "if(typeof window.__hatchResetFocusIntent==='function')window.__hatchResetFocusIntent()";
    public static final String SELF_PAINTED_SURFACE_CLASS = "genui-v2-surface";
    public static final String SUSPEND_AUTOMATIC_FOCUS_SCRIPT = "if(typeof window.__hatchSuspendAutomaticFocus==='function')window.__hatchSuspendAutomaticFocus()";
    public static final String TAG = "HatchWidgetWebView";
    public static final String WIDGET_BASE_URL = "https://hatch-chat-widget.local/";
    public static final String WIDGET_CONTENT_SECURITY_POLICY = "default-src 'none'; script-src 'unsafe-inline' 'unsafe-eval' data: blob: https://*.fbcdn.net; style-src 'unsafe-inline' https://*.fbcdn.net; img-src 'self' data: blob: https://*.fbcdn.net; media-src 'self' data: blob:; font-src data: blob:; connect-src 'none'; frame-src 'none'; child-src 'none'; worker-src 'none'; object-src 'none'; form-action 'none'";
    public static final String WIDGET_FAVICON_PATH = "/favicon.ico";
    public static final String WIDGET_HOST = "hatch-chat-widget.local";
    public static final String WIDGET_ORIGIN = "https://hatch-chat-widget.local";
    public static final long WIDGET_RESIZE_BURST_MS = 500;
    public static final C06827l3 CLASS_ATTRIBUTE = C06827l3.A02("(?:^|[\\s<])class\\s*=\\s*([\"'])([^\"']*)\\1");
    public static final Set<String> WIDGET_ASSET_ROOTS = C60O.A1A("skills", "templates", "workspace");
    public static final Set<String> WIDGET_ASSET_EXTENSIONS = C60S.A02();
    public static final List<C07739il> FETCH_ASSET_RETRY_BACKOFF_RANGES_MS = Arrays.asList(new C07739il(150, 500), new C07739il(400, 1200));

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt", f = "HatchWidgetWebView.kt", l = {1689, 1701, 1703}, m = "openStreamWithTransportRetry", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$openStreamWithTransportRetry$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWidgetWebViewKt.openStreamWithTransportRetry(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    public static final int clampWidgetHeightPx(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 100000) {
            return 100000;
        }
        return i;
    }

    public static final String documentTreeAssetPath(String str, String str2) {
        List<String> listWidgetPathSegments;
        List<String> listWidgetPathSegments2;
        if (str2 != null && (listWidgetPathSegments = widgetPathSegments(str2)) != null) {
            List listA0d = AbstractC0878AGe.A0d(listWidgetPathSegments, 1);
            if (listA0d == null || (listWidgetPathSegments2 = widgetPathSegments(str)) == null) {
                return null;
            }
            boolean z = listA0d.size() >= 2 && listWidgetPathSegments2.size() > listA0d.size() && C7384Etj.areEqual(listWidgetPathSegments2.subList(0, listA0d.size()), listA0d);
            String strA0u = AnonymousClass001.A0u(C7BY.A0R((String) AbstractC0878AGe.A0H(listWidgetPathSegments2), "", '.'));
            String strA0L = AbstractC0878AGe.A0L(CustomConnectorRegisterRepositoryKt.ROOT_PATH, "", "", listWidgetPathSegments2, null);
            if (z && WIDGET_ASSET_EXTENSIONS.contains(strA0u)) {
                return strA0L;
            }
        }
        return null;
    }

    public static final HatchHttpResponseStream openWidgetAssetStream(String str, String str2, String str3) {
        String strA0M = str2;
        if (str.length() == 0 || str2 == null || C7BY.A0j(str2) || str3 == null || C7BY.A0j(str3)) {
            C60Q.A1J("fetchAsset: missing credentials or path (path=", str, ")", "HatchWidgetWebView");
            HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.CHAT_WIDGET, HatchHtmlErrorCode.ASSET_FETCH_FAILED, FGI.A0U("missing credentials or path (path=", str, ")"), null, false, null);
            return null;
        }
        if (!str2.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
            strA0M = FGI.A0M(str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        }
        try {
            HatchHttpResponseStream hatchHttpResponseStream = (HatchHttpResponseStream) AbstractC9245GAx.A00(C6ys.A00, new HatchWidgetWebViewKt$openWidgetAssetStream$stream$1(FGI.A0U(strA0M, "fs/raw/", AbstractC06907md.A01(CustomConnectorRegisterRepositoryKt.ROOT_PATH, C7BY.A0e(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH), HatchWidgetWebViewKt$openWidgetAssetStream$encodedPath$1.INSTANCE)), null));
            if (hatchHttpResponseStream.isSuccessful && hatchHttpResponseStream.body != null) {
                return hatchHttpResponseStream;
            }
            CFK.A06("HatchWidgetWebView", FGI.A0W("fetchAsset: HTTP ", " for path=", str, hatchHttpResponseStream.statusCode));
            try {
                HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.CHAT_WIDGET, HatchHtmlErrorCode.ASSET_FETCH_FAILED, str, null, false, Integer.valueOf(hatchHttpResponseStream.statusCode));
                hatchHttpResponseStream.close();
                return null;
            } catch (Exception e) {
                e = e;
                C60Q.A1K("fetchAsset: failed for path=", str, ": ", e.getMessage(), "HatchWidgetWebView");
                HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.CHAT_WIDGET, HatchHtmlErrorCode.ASSET_FETCH_FAILED, str, e, false, null);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static final List<String> widgetPathSegments(String str) {
        List listA0g = C7BY.A0g(str, new char[]{'/'});
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0g.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        if (AbstractC0878AGe.A0k(WIDGET_ASSET_ROOTS, AbstractC0878AGe.A0G(arrayListA0h))) {
            if (!(arrayListA0h instanceof Collection) || !arrayListA0h.isEmpty()) {
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    String strDecode = Uri.decode(AnonymousClass005.A0j(it2));
                    if (!".".equals(strDecode) && !"..".equals(strDecode)) {
                        C7384Etj.A0X(strDecode);
                        if (C7BY.A0k(strDecode, '/') || C7BY.A0k(strDecode, '\\')) {
                        }
                    }
                }
            }
            return arrayListA0h;
        }
        return null;
    }

    public static final WidgetWebView widgetWebViewOrNull(FrameLayout frameLayout) {
        View childAt = frameLayout.getChildAt(0);
        if (childAt instanceof WidgetWebView) {
            return (WidgetWebView) childAt;
        }
        return null;
    }

    /* renamed from: buildWidgetHostTheme-_-zseUA, reason: not valid java name */
    public static final WidgetHostTheme m690buildWidgetHostTheme_zseUA(AuraColors auraColors, long j, long j2, long j3, float f) {
        boolean z = auraColors.isLight;
        return new WidgetHostTheme(!z ? "dark" : AvatarMediaMapperKt.LIGHT, FGI.A0M(AbstractC06907md.A01("; ", Arrays.asList("--hatch-widget-bg: transparent", FGI.A0M("--hatch-widget-surface: ", m691cssColor8_81llA(j3)), FGI.A0I("--hatch-widget-radius: ", (int) f, "px"), FGI.A0M("--hatch-widget-surface-muted: ", m691cssColor8_81llA(auraColors.background)), FGI.A0M("--hatch-widget-text: ", m691cssColor8_81llA(auraColors.primaryText)), FGI.A0M("--hatch-widget-muted: ", m691cssColor8_81llA(auraColors.secondaryText)), FGI.A0M("--hatch-widget-border: ", m691cssColor8_81llA(auraColors.border)), FGI.A0M("--hatch-widget-accent: ", m691cssColor8_81llA(j)), FGI.A0M("--hatch-widget-on-accent: ", m691cssColor8_81llA(j2)), FGI.A0M("--hatch-widget-focus: ", m691cssColor8_81llA(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), z ? 0.35f : 0.45f))), FGI.A0M("--hatch-widget-shadow: ", FGI.A0M("0 8px 24px ", m691cssColor8_81llA(auraColors.shadow)))), null), ";"));
    }

    public static final String buildWidgetShellPrefix(WidgetHostTheme widgetHostTheme, String str, int i, boolean z, boolean z2, boolean z3) {
        String strA0U;
        String strA0U2;
        String str2 = widgetHostTheme.name;
        String str3 = z3 ? "\n<meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; script-src 'unsafe-inline' 'unsafe-eval' data: blob: https://*.fbcdn.net; style-src 'unsafe-inline' https://*.fbcdn.net; img-src 'self' data: blob: https://*.fbcdn.net; media-src 'self' data: blob:; font-src data: blob:; connect-src 'none'; frame-src 'none'; child-src 'none'; worker-src 'none'; object-src 'none'; form-action 'none'\">\n<meta http-equiv=\"x-dns-prefetch-control\" content=\"off\">" : "";
        String inlineScriptStringLiteral = HatchInlineScriptKt.toInlineScriptStringLiteral(widgetHostTheme.cssVariables);
        String inlineScriptStringLiteral2 = HatchInlineScriptKt.toInlineScriptStringLiteral(str);
        if (z) {
            strA0U = FGI.A0U("\n<meta name=\"color-scheme\" content=\"", str2, "\">");
            strA0U2 = FGI.A0U("\n  color-scheme: ", str2, ";");
        } else {
            strA0U = "";
            strA0U2 = "";
        }
        String str4 = z2 ? "\nhtml, body, .genui-v2-surface {\n  border-radius: 0 !important;\n}" : "";
        String str5 = widgetHostTheme.cssVariables;
        StringBuilder sbA0x = C3cI.A0x("\n<!DOCTYPE html>\n<html>\n<head>", str3);
        sbA0x.append("\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">");
        sbA0x.append(strA0U);
        sbA0x.append("\n<style>\n:root {\n  ");
        sbA0x.append(str5);
        sbA0x.append(strA0U2);
        sbA0x.append("\n}\nhtml, body {\n  margin: 0;\n  box-sizing: border-box;\n  height: auto !important;\n  overflow: hidden;\n  padding: 0;\n  -webkit-text-size-adjust: 100%;\n  width: 100%;\n}\n  body {\n  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;\n  color: var(--hatch-widget-text);\n}\n#scroll-wrapper, #root {\n  box-sizing: border-box;\n  margin: 0;\n  padding: 0;\n  width: 100%;\n}\n#scroll-wrapper {\n  overflow: hidden;\n}\n#root {\n  padding-right: 2px;\n}\n.customize-hatch,\n.customize-hatch .card-strip {\n  background: transparent !important;\n}\n.customize-hatch .action-card {\n  box-shadow: none !important;\n}");
        sbA0x.append(str4);
        sbA0x.append("\nvideo[autoplay] {\n  opacity: 0;\n}\nvideo[autoplay].playing {\n  opacity: 1;\n}\n</style>\n</head>\n<body data-theme=\"");
        sbA0x.append(str2);
        sbA0x.append("\">\n<script>\nvar _theme = '");
        sbA0x.append(str2);
        sbA0x.append("';\nvar _declareColorScheme = ");
        sbA0x.append(z);
        sbA0x.append(";\nvar _hostCssVariables = ");
        sbA0x.append(inlineScriptStringLiteral);
        sbA0x.append(";\nvar _disabledMediaRules = [];\nvar _promotedThemeStyle = null;\nvar _lastReportedHeight = 0;\nvar _widgetHeightObserver = null;\nvar _heightReportScheduled = false;\nvar _widgetState = parseInitialWidgetState(");
        sbA0x.append(inlineScriptStringLiteral2);
        sbA0x.append(");\nvar _widgetStateVersion = ");
        sbA0x.append(i);
        return AnonymousClass001.A0v(";\nvar _widgetStateInitialized = _widgetStateVersion > 0;\nvar _widgetStatePostScheduled = false;\nvar _widgetFocusUserInitiated = false;\n\nwindow.__hatchFocusedFieldBounds = function() {\n  var active = document.activeElement;\n  if (!active || active === document.body) return null;\n  var rect = active.getBoundingClientRect();\n  return [rect.top, rect.bottom];\n};\n\nwindow.__hatchResetFocusIntent = function() {\n  _widgetFocusUserInitiated = false;\n};\n\nwindow.__hatchSuspendAutomaticFocus = function() {\n  _widgetFocusUserInitiated = false;\n  var active = document.activeElement;\n  if (active && active !== document.body && typeof active.blur === 'function') {\n    active.blur();\n  }\n};\n\n['pointerdown', 'touchstart', 'keydown', 'click'].forEach(function(type) {\n  document.addEventListener(type, function(event) {\n    if (event.isTrusted) _widgetFocusUserInitiated = true;\n  }, true);\n});\n\ndocument.addEventListener('focusin', function(event) {\n  if (!_widgetFocusUserInitiated && event.target && typeof event.target.blur === 'function') {\n    event.target.blur();\n  }\n}, true);\n\nwindow.open = function(url) {\n  try {\n    var target = url ? new URL(url, location.href) : null;\n    if (target && /^(https?|mailto|tel|sms|geo):$/.test(target.protocol)) {\n      location.assign(target.href);\n    }\n  } catch (e) {}\n  return null;\n};\n\n// domStorageEnabled is false on this WebView, so unguarded localStorage access\n// throws and kills the widget script mid-render. Mirror the Hatch web shell's\n// in-memory polyfill so such widgets degrade to per-load state instead of dying.\n(function() {\n  var needsPolyfill = false;\n  try {\n    var probe = window.localStorage;\n    if (!probe) {\n      needsPolyfill = true;\n    } else {\n      probe.setItem('__hatch_storage_probe__', '1');\n      probe.removeItem('__hatch_storage_probe__');\n    }\n  } catch (e) {\n    needsPolyfill = true;\n  }\n  if (!needsPolyfill) return;\n  var memoryStorage = function(s) {\n    return {\n      getItem: function(k) { return Object.prototype.hasOwnProperty.call(s, k) ? s[k] : null; },\n      setItem: function(k, v) { s[k] = String(v); },\n      removeItem: function(k) { delete s[k]; },\n      clear: function() { for (var k in s) delete s[k]; },\n      key: function(i) { return Object.keys(s)[i] || null; },\n      get length() { return Object.keys(s).length; }\n    };\n  };\n  try {\n    Object.defineProperty(window, 'localStorage', { value: memoryStorage({}), configurable: true });\n    Object.defineProperty(window, 'sessionStorage', { value: memoryStorage({}), configurable: true });\n  } catch (e) {}\n})();\n\nfunction postToHost(message) {\n  var bridge = window.HatchBridge;\n  if (!bridge || !bridge.postMessage) return;\n  bridge.postMessage(JSON.stringify(message));\n}\n\nfunction postWidgetState() {\n  postToHost({\n    type: 'chat-widget-state',\n    action: 'set_state',\n    state: copyWidgetState()\n  });\n}\n\nfunction scheduleWidgetStatePost() {\n  if (_widgetStatePostScheduled) return;\n  _widgetStatePostScheduled = true;\n  setTimeout(function() {\n    _widgetStatePostScheduled = false;\n    postWidgetState();\n  }, 0);\n}\n\nfunction plainWidgetState(value) {\n  if (!value || typeof value !== 'object' || Array.isArray(value)) {\n    return {};\n  }\n  try {\n    var copy = JSON.parse(JSON.stringify(value));\n    return copy && typeof copy === 'object' && !Array.isArray(copy) ? copy : {};\n  } catch(e) {\n    return {};\n  }\n}\n\nfunction copyWidgetState() {\n  return plainWidgetState(_widgetState);\n}\n\nfunction parseInitialWidgetState(stateJson) {\n  try {\n    return plainWidgetState(JSON.parse(stateJson));\n  } catch(e) {\n    return {};\n  }\n}\n\nfunction writeWidgetState(state) {\n  var nextState = plainWidgetState(state);\n  _widgetState = nextState;\n  _widgetStateInitialized = true;\n  emitWidgetState();\n  scheduleWidgetStatePost();\n}\n\nfunction emitWidgetState() {\n  try {\n    window.dispatchEvent(new CustomEvent('hatch-widget-state', {\n      detail: { state: copyWidgetState() }\n    }));\n  } catch(e) {}\n}\n\n// Public widget API. Mirrors the Hatch web shell so widget HTML can call\n// window.hatchWidget.getState() and setState(...).\nwindow.hatchWidget = {\n  getState: function(defaults) {\n    if (\n      arguments.length > 0 &&\n      _widgetStateVersion === 0 &&\n      !_widgetStateInitialized &&\n      defaults &&\n      typeof defaults === 'object' &&\n      !Array.isArray(defaults)\n    ) {\n      writeWidgetState(defaults);\n    }\n    return copyWidgetState();\n  },\n  setState: function(state) { writeWidgetState(state); }\n};\n</script>\n<div id=\"scroll-wrapper\"><div id=\"root\">\n", sbA0x);
    }

    public static final String buildWidgetShellSuffix(WidgetHostTheme widgetHostTheme) {
        return C6tn.A05(FGI.A0h("\n</div></div>\n<script>\n\n(function() {\n  emitWidgetState();\n\n  // Force autoplay on video elements \u2014 the HTML autoplay attribute is unreliable\n  // across Android WebView versions. Wait for the source to load, then play.\n  // Videos start hidden (opacity:0) to avoid flashing the default play button.\n  document.querySelectorAll('video[autoplay]').forEach(function(v) {\n    v.addEventListener('playing', function() { v.classList.add('playing'); }, {once: true});\n    function tryPlay() {\n      v.play().catch(function() {});\n    }\n    if (v.readyState >= 2) {\n      tryPlay();\n    } else {\n      v.addEventListener('loadeddata', tryPlay, {once: true});\n      v.addEventListener('canplay', tryPlay, {once: true});\n      v.load();\n    }\n  });\n\n  applyTheme('", widgetHostTheme.name, "', ", HatchInlineScriptKt.toInlineScriptStringLiteral(widgetHostTheme.cssVariables), ");\n  installWidgetHeightObserver();\n  window.addEventListener('resize', scheduleWidgetHeightReports);\n  scheduleWidgetHeightReports();\n})();\n\nfunction widgetContentHeight() {\n  var wrapper = document.getElementById('scroll-wrapper');\n  var root = document.getElementById('root');\n  return Math.ceil(Math.max(\n    elementHeight(root),\n    elementHeight(wrapper)\n  ));\n}\n\nfunction elementHeight(el) {\n  if (!el) return 0;\n  var rectHeight = 0;\n  if (typeof el.getBoundingClientRect === 'function') {\n    try {\n      var rect = el.getBoundingClientRect();\n      if (rect && typeof rect.height === 'number') {\n        rectHeight = Math.ceil(rect.height);\n      }\n    } catch(e) {}\n  }\n  return Math.max(\n    rectHeight,\n    typeof el.scrollHeight === 'number' ? el.scrollHeight : 0,\n    typeof el.offsetHeight === 'number' ? el.offsetHeight : 0,\n    typeof el.clientHeight === 'number' ? el.clientHeight : 0\n  );\n}\n\nfunction reportWidgetHeight() {\n  var height = widgetContentHeight();\n  if (height > 0 && Math.abs(height - _lastReportedHeight) > 1) {\n    _lastReportedHeight = height;\n    postToHost({ type: 'chat-widget-height', height: height });\n  }\n}\n\nfunction scheduleWidgetHeightReports() {\n  if (_heightReportScheduled) return;\n  _heightReportScheduled = true;\n  var run = function() {\n    _heightReportScheduled = false;\n    reportWidgetHeight();\n  };\n  if (window.requestAnimationFrame) {\n    window.requestAnimationFrame(run);\n  } else {\n    setTimeout(run, 16);\n  }\n}\n\nfunction installWidgetHeightObserver() {\n  if (!window.ResizeObserver) return;\n  try {\n    _widgetHeightObserver = new ResizeObserver(function() { scheduleWidgetHeightReports(); });\n    var wrapper = document.getElementById('scroll-wrapper');\n    var root = document.getElementById('root');\n    if (wrapper) _widgetHeightObserver.observe(wrapper);\n    if (root) _widgetHeightObserver.observe(root);\n  } catch(e) {}\n}\n\nfunction osPrefersDark() {\n  try {\n    return window.matchMedia('(prefers-color-scheme: dark)').matches;\n  } catch(e) {\n    return false;\n  }\n}\n\nfunction syncMediaOverrides() {\n  for (var d = 0; d < _disabledMediaRules.length; d++) {\n    try {\n      _disabledMediaRules[d].rule.media.mediaText = _disabledMediaRules[d].orig;\n    } catch(e) {}\n  }\n  _disabledMediaRules = [];\n\n  if (_promotedThemeStyle) {\n    _promotedThemeStyle.remove();\n    _promotedThemeStyle = null;\n  }\n\n  var isDark = _theme === 'dark';\n  var osIsDark = osPrefersDark();\n  if (isDark === osIsDark) return;\n\n  var unwanted = osIsDark ? 'dark' : 'light';\n  var wanted = isDark ? 'dark' : 'light';\n  var promoted = [];\n\n  try {\n    for (var s = 0; s < document.styleSheets.length; s++) {\n      try {\n        var rules = document.styleSheets[s].cssRules;\n        for (var r = 0; r < rules.length; r++) {\n          var rule = rules[r];\n          if (rule.type === 4) {\n            var mediaText = rule.media.mediaText || '';\n            if (mediaText.indexOf('prefers-color-scheme') !== -1) {\n              if (mediaText.indexOf(unwanted) !== -1) {\n                var original = mediaText;\n                rule.media.mediaText = mediaText.replace(/prefers-color-scheme/g, 'prefers-color-scheme-disabled');\n                _disabledMediaRules.push({rule: rule, orig: original});\n              }\n              if (mediaText.indexOf(wanted) !== -1) {\n                for (var i = 0; i < rule.cssRules.length; i++) {\n                  promoted.push(rule.cssRules[i].cssText);\n                }\n              }\n            }\n          }\n        }\n      } catch(e) {}\n    }\n  } catch(e) {}\n\n  if (promoted.length) {\n    _promotedThemeStyle = document.createElement('style');\n    _promotedThemeStyle.id = 'theme-promoted';\n    _promotedThemeStyle.textContent = promoted.join('');\n    document.body.appendChild(_promotedThemeStyle);\n  }\n}\n\nfunction applyHostCssVariables(cssVariables) {\n  if (typeof cssVariables !== 'string' || !cssVariables) return;\n  _hostCssVariables = cssVariables;\n  cssVariables.split(';').forEach(function(part) {\n    var index = part.indexOf(':');\n    if (index <= 0) return;\n    var name = part.slice(0, index).trim();\n    var value = part.slice(index + 1).trim();\n    if (name.indexOf('--') !== 0 || !value) return;\n    document.documentElement.style.setProperty(name, value);\n  });\n}\n\nfunction applyTheme(theme, cssVariables) {\n  _theme = theme === 'dark' ? 'dark' : 'light';\n  var isDark = _theme === 'dark';\n  var colorScheme = isDark ? 'dark' : 'light';\n  document.documentElement.setAttribute('data-theme', colorScheme);\n  document.body.setAttribute('data-theme', colorScheme);\n  if (_declareColorScheme) {\n    document.documentElement.style.colorScheme = colorScheme;\n    document.body.style.colorScheme = colorScheme;\n    var colorSchemeMeta = document.querySelector('meta[name=\"color-scheme\"]');\n    if (colorSchemeMeta) {\n      colorSchemeMeta.setAttribute('content', colorScheme);\n    }\n  }\n  applyHostCssVariables(cssVariables || _hostCssVariables);\n  syncMediaOverrides();\n}\n\n// State sync handler (called from native)\nfunction updateWidgetState(stateJson, stateVersion) {\n  try {\n    if (typeof stateVersion === 'number' && stateVersion >= 0) {\n      _widgetStateVersion = Math.floor(stateVersion);\n      if (_widgetStateVersion > 0) _widgetStateInitialized = true;\n    }\n    _widgetState = plainWidgetState(JSON.parse(stateJson));\n    emitWidgetState();\n    scheduleWidgetHeightReports();\n  } catch(e) {}\n}\n\n// Theme sync handler (called from native)\nfunction updateTheme(theme) {\n  applyTheme(theme, arguments.length > 1 ? arguments[1] : _hostCssVariables);\n  scheduleWidgetHeightReports();\n}\n</script>\n</body>\n</html>\n"));
    }

    public static final FrameLayout createWidgetContainer(Context context, Function0<Unit> function0) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipChildren(true);
        frameLayout.setClipToPadding(true);
        final WidgetWebViewState widgetWebViewState = new WidgetWebViewState(new HatchWidgetWebViewKt$createWidgetContainer$1$widgetViewState$1(frameLayout));
        frameLayout.setTag(widgetWebViewState);
        WidgetWebView widgetWebViewCreateWidgetWebViewOrNull = createWidgetWebViewOrNull(context);
        if (widgetWebViewCreateWidgetWebViewOrNull == null) {
            function0.invoke();
            return frameLayout;
        }
        widgetWebViewCreateWidgetWebViewOrNull.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        widgetWebViewCreateWidgetWebViewOrNull.getSettings().setJavaScriptEnabled(true);
        widgetWebViewCreateWidgetWebViewOrNull.getSettings().setDomStorageEnabled(false);
        widgetWebViewCreateWidgetWebViewOrNull.getSettings().setMediaPlaybackRequiresUserGesture(false);
        widgetWebViewCreateWidgetWebViewOrNull.getSettings().setMixedContentMode(1);
        C60S.A04(widgetWebViewCreateWidgetWebViewOrNull);
        widgetWebViewCreateWidgetWebViewOrNull.getSettings().setLoadWithOverviewMode(false);
        widgetWebViewCreateWidgetWebViewOrNull.getSettings().setUseWideViewPort(true);
        widgetWebViewCreateWidgetWebViewOrNull.getSettings().setSupportMultipleWindows(true);
        widgetWebViewCreateWidgetWebViewOrNull.setVerticalScrollBarEnabled(false);
        widgetWebViewCreateWidgetWebViewOrNull.setHorizontalScrollBarEnabled(false);
        widgetWebViewCreateWidgetWebViewOrNull.setNestedScrollingEnabled(false);
        widgetWebViewCreateWidgetWebViewOrNull.setOverScrollMode(2);
        widgetWebViewCreateWidgetWebViewOrNull.setBackgroundColor(HxS.A01(B6A.A06));
        if (C6xU.A00("ALGORITHMIC_DARKENING")) {
            WebSettings settings = widgetWebViewCreateWidgetWebViewOrNull.getSettings();
            if (!C6xU.A1b.A01()) {
                throw C60Q.A0q();
            }
            C6x7 c6x7A00 = C6xD.A00(settings);
            if (!(c6x7A00 instanceof C05716xA)) {
                c6x7A00.A00.setAlgorithmicDarkeningAllowed(true);
            }
        }
        widgetWebViewState.installBridge(widgetWebViewCreateWidgetWebViewOrNull);
        widgetWebViewCreateWidgetWebViewOrNull.setWebChromeClient(new WebChromeClient() { // from class: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$createWidgetContainer$1$webView$1$1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                C7384Etj.A0Y(consoleMessage, 0);
                if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
                    return true;
                }
                HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
                HatchHtmlSurface hatchHtmlSurface = HatchHtmlSurface.CHAT_WIDGET;
                HatchHtmlErrorCode hatchHtmlErrorCode = HatchHtmlErrorCode.INTERNAL_ERROR;
                String strMessage = consoleMessage.message();
                String strSourceId = consoleMessage.sourceId();
                int iLineNumber = consoleMessage.lineNumber();
                StringBuilder sbA0g = C3cG.A0g(strMessage);
                sbA0g.append(" (");
                sbA0g.append(strSourceId);
                sbA0g.append(":");
                sbA0g.append(iLineNumber);
                hatchHtmlDiagnostics.logError(hatchHtmlSurface, hatchHtmlErrorCode, AnonymousClass001.A0v(")", sbA0g), null, null, null);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                HatchHtmlErrorCode hatchHtmlErrorCode;
                C7384Etj.A0Y(webView, 0);
                String extra = webView.getHitTestResult().getExtra();
                HatchHtmlActionTrace hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.CHAT_WIDGET, HatchHtmlActionType.NEW_WINDOW, extra);
                if (!z2) {
                    hatchHtmlErrorCode = HatchHtmlErrorCode.NOT_USER_GESTURE;
                } else if (extra == null || C7BY.A0j(extra)) {
                    hatchHtmlErrorCode = HatchHtmlErrorCode.BLANK_URL;
                } else {
                    if (!HatchWidgetWebViewKt.WIDGET_HOST.equals(C60Q.A0h(extra))) {
                        C60R.A0z(webView, hatchHtmlActionTraceStartAction, extra);
                        return false;
                    }
                    hatchHtmlErrorCode = HatchHtmlErrorCode.WIDGET_ORIGIN_LINK;
                }
                hatchHtmlActionTraceStartAction.failed(hatchHtmlErrorCode, null, null);
                return false;
            }
        });
        widgetWebViewCreateWidgetWebViewOrNull.setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$createWidgetContainer$1$webView$1$2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                C7384Etj.A0Y(webView, 0);
                super.onPageFinished(webView, str);
                HatchHtmlRenderTrace hatchHtmlRenderTrace = widgetWebViewState.renderTrace;
                if (hatchHtmlRenderTrace != null) {
                    hatchHtmlRenderTrace.finished();
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                C7384Etj.A0Y(webView, 0);
                super.onPageStarted(webView, str, bitmap);
                HatchHtmlRenderTrace hatchHtmlRenderTrace = widgetWebViewState.renderTrace;
                if (hatchHtmlRenderTrace != null) {
                    hatchHtmlRenderTrace.committed();
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                C7384Etj.A0Y(renderProcessGoneDetail, 1);
                HatchHtmlDiagnostics.INSTANCE.reportRenderFailure(HatchHtmlSurface.CHAT_WIDGET, widgetWebViewState.renderTrace, renderProcessGoneDetail.didCrash() ? HatchHtmlErrorCode.RENDERER_CRASHED : HatchHtmlErrorCode.RENDERER_GONE, null, null);
                widgetWebViewState.notifyRendererGone();
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                AnonymousClass005.A0x(webView, webResourceRequest, webResourceError);
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                int errorCode = webResourceError.getErrorCode();
                CharSequence description = webResourceError.getDescription();
                Uri url = webResourceRequest.getUrl();
                StringBuilder sbA0y = C60O.A0y("code=", errorCode);
                sbA0y.append(" desc=");
                sbA0y.append((Object) description);
                String strA0y = AnonymousClass006.A0y(url, " url=", sbA0y);
                if (webResourceRequest.isForMainFrame()) {
                    HatchHtmlDiagnostics.INSTANCE.reportRenderFailure(HatchHtmlSurface.CHAT_WIDGET, widgetWebViewState.renderTrace, HatchHtmlErrorCode.NET_ERROR, strA0y, null);
                    return;
                }
                HatchHtmlRenderTrace hatchHtmlRenderTrace = widgetWebViewState.renderTrace;
                if (hatchHtmlRenderTrace != null) {
                    hatchHtmlRenderTrace.resourceError(HatchHtmlErrorCode.NET_ERROR, strA0y, null, null);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                AnonymousClass005.A0x(webView, webResourceRequest, webResourceResponse);
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                String strA0y = AnonymousClass006.A0y(webResourceRequest.getUrl(), " url=", C60O.A0y("status=", webResourceResponse.getStatusCode()));
                if (webResourceRequest.isForMainFrame()) {
                    HatchHtmlDiagnostics.INSTANCE.reportRenderFailure(HatchHtmlSurface.CHAT_WIDGET, widgetWebViewState.renderTrace, HatchHtmlErrorCode.HTTP_ERROR, strA0y, null);
                    return;
                }
                HatchHtmlRenderTrace hatchHtmlRenderTrace = widgetWebViewState.renderTrace;
                if (hatchHtmlRenderTrace != null) {
                    hatchHtmlRenderTrace.resourceError(HatchHtmlErrorCode.HTTP_ERROR, strA0y, null, Integer.valueOf(webResourceResponse.getStatusCode()));
                }
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                AnonymousClass003.A0u(webView, webResourceRequest);
                Uri url = webResourceRequest.getUrl();
                if (!HatchWidgetWebViewKt.WIDGET_HOST.equals(url.getHost())) {
                    return (HatchWidgetWebViewKt.isHttp(url) && !HatchWidgetWebViewKt.isMetaCdn(url) && HatchUtil.INSTANCE.isWidgetWebViewIsolationEnabled()) ? HatchWidgetWebViewKt.widgetHostForbidden() : super.shouldInterceptRequest(webView, webResourceRequest);
                }
                WidgetWebViewState widgetWebViewState2 = widgetWebViewState;
                String path = url.getPath();
                if (path == null) {
                    return null;
                }
                return widgetWebViewState2.fetchFromWidgetHost(path);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                HatchHtmlErrorCode hatchHtmlErrorCode;
                boolean zA1Y = C60P.A1Y(webView, webResourceRequest);
                String strA0c = C60R.A0c(webResourceRequest);
                HatchHtmlActionTrace hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.CHAT_WIDGET, HatchHtmlActionType.LINK_TAP, strA0c);
                if (!webResourceRequest.hasGesture()) {
                    hatchHtmlErrorCode = HatchHtmlErrorCode.NOT_USER_GESTURE;
                } else if (!webResourceRequest.isForMainFrame()) {
                    hatchHtmlErrorCode = HatchHtmlErrorCode.NAV_BLOCKED_BY_WIDGET;
                } else {
                    if (!HatchWidgetWebViewKt.WIDGET_HOST.equals(webResourceRequest.getUrl().getHost())) {
                        C60R.A0z(webView, hatchHtmlActionTraceStartAction, strA0c);
                        return zA1Y;
                    }
                    hatchHtmlErrorCode = HatchHtmlErrorCode.WIDGET_ORIGIN_LINK;
                }
                hatchHtmlActionTraceStartAction.failed(hatchHtmlErrorCode, null, null);
                return zA1Y;
            }
        });
        frameLayout.addView(widgetWebViewCreateWidgetWebViewOrNull);
        return frameLayout;
    }

    public static final WidgetWebView createWidgetWebViewOrNull(Context context) {
        try {
            if (WebView.getCurrentWebViewPackage() != null) {
                return new WidgetWebView(context);
            }
            CFK.A06("HatchWidgetWebView", "No WebView provider");
            return null;
        } catch (AndroidRuntimeException e) {
            CFK.A0A("HatchWidgetWebView", "WebView provider unavailable", e);
            return null;
        }
    }

    public static final boolean declaresSelfPaintedSurface(String str) {
        C8iC c8iC = new C8iC(C06827l3.A00(str, CLASS_ATTRIBUTE));
        while (c8iC.hasNext()) {
            List listA0g = C7BY.A0g(((C1Lu) c8iC.next()).AG1().get(2), new char[]{' ', '\t', '\n', '\f', '\r'});
            if (!(listA0g instanceof Collection) || !listA0g.isEmpty()) {
                Iterator it = listA0g.iterator();
                while (it.hasNext()) {
                    if (SELF_PAINTED_SURFACE_CLASS.equals(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final WebResourceResponse fetchWidgetAsset(String str, String str2, String str3) {
        String strMimeForName;
        String strA0K = C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str);
        HatchHttpResponseStream hatchHttpResponseStreamOpenWidgetAssetStream = openWidgetAssetStream(strA0K, str2, str3);
        if (hatchHttpResponseStreamOpenWidgetAssetStream == null) {
            return null;
        }
        String strA0p = C60O.A0p("Content-Type", hatchHttpResponseStreamOpenWidgetAssetStream.headers);
        if (strA0p == null || (strMimeForName = C7BY.A0W(strA0p, ";", strA0p)) == null) {
            strMimeForName = HatchMimeResolver.INSTANCE.mimeForName(strA0K);
        }
        return new WebResourceResponse(strMimeForName, null, HatchHttpClientKt.selfClosingBody(hatchHttpResponseStreamOpenWidgetAssetStream));
    }

    public static final WebResourceResponse fetchWidgetDocument(String str, String str2, String str3, String str4, String str5) {
        HatchHttpResponseStream hatchHttpResponseStreamOpenWidgetAssetStream = openWidgetAssetStream(C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str), str4, str5);
        if (hatchHttpResponseStreamOpenWidgetAssetStream != null) {
            Charset charset = DCl.A05;
            return new WebResourceResponse("text/html", "utf-8", new SequenceInputStream(new SequenceInputStream(new ByteArrayInputStream(str2.getBytes(charset)), HatchHttpClientKt.selfClosingBody(hatchHttpResponseStreamOpenWidgetAssetStream)), new ByteArrayInputStream(str3.getBytes(charset))));
        }
        CFK.A06("HatchWidgetWebView", FGI.A0M("fetchWidgetDocument: could not open document for path=", str));
        HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.CHAT_WIDGET, HatchHtmlErrorCode.DOCUMENT_FETCH_FAILED, str, null, AnonymousClass001.A0i(), null);
        return new WebResourceResponse("text/html", "utf-8", 502, "Widget document unavailable", AGH.A0E(), C60Q.A0T());
    }

    public static final String guessMimeType(String str) {
        return HatchMimeResolver.INSTANCE.mimeForName(str);
    }

    public static final boolean htmlHandlesDarkMode(String str) {
        return C7BY.A0q(str, "color-scheme", false) || C7BY.A0q(str, "data-theme", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009b -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object openStreamWithTransportRetry(com.facebook.aura.network.transport.HatchHttpRequest r12, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponseStream> r13) {
        /*
            boolean r0 = r13 instanceof com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt.AnonymousClass1
            if (r0 == 0) goto Lc2
            r9 = r13
            com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$openStreamWithTransportRetry$1 r9 = (com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt.AnonymousClass1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc2
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r11 = r9.result
            X.Hji r10 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r8 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L9e
            if (r0 == r1) goto Lb2
            if (r0 == r7) goto L79
            if (r0 != r8) goto Lca
            int r6 = r9.I$0
            java.lang.Object r0 = r9.L$1
            com.facebook.aura.network.transport.HatchHttpClient r0 = (com.facebook.aura.network.transport.HatchHttpClient) r0
            java.lang.Object r12 = r9.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r12 = (com.facebook.aura.network.transport.HatchHttpRequest) r12
            X.Hwg.A00(r11)
        L30:
            com.facebook.aura.network.transport.HatchHttpResponseStream r11 = (com.facebook.aura.network.transport.HatchHttpResponseStream) r11
        L32:
            int r2 = r11.statusCode
            r1 = -1
            if (r2 != r1) goto Lc9
            java.util.List<X.9il> r2 = com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt.FETCH_ASSET_RETRY_BACKOFF_RANGES_MS
            int r1 = r2.size()
            if (r6 >= r1) goto Lc9
            java.lang.Object r2 = r2.get(r6)
            X.9il r2 = (X.C07739il) r2
            X.CUC r1 = X.CUB.A00
            long r2 = X.ATD.A08(r1, r2)
            int r1 = r6 + 1
            java.lang.Integer r5 = X.C3cG.A0R(r1)
            java.lang.String r4 = r11.errorMessage
            java.lang.Long r1 = X.C3cG.A0S(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r4, r1}
            java.lang.String r4 = "HatchWidgetWebView"
            java.lang.String r1 = "fetchAsset: transport failure on attempt %d (%s), retrying in %d ms"
            X.CFK.A0H(r4, r1, r5)
            r11.close()
            r9.L$0 = r12
            r9.L$1 = r0
            r1 = 0
            r9.L$2 = r1
            r9.I$0 = r6
            r9.J$0 = r2
            r9.label = r7
            java.lang.Object r1 = X.C7Bq.A01(r2, r9)
            if (r1 != r10) goto L88
            return r10
        L79:
            long r2 = r9.J$0
            int r6 = r9.I$0
            java.lang.Object r0 = r9.L$1
            com.facebook.aura.network.transport.HatchHttpClient r0 = (com.facebook.aura.network.transport.HatchHttpClient) r0
            java.lang.Object r12 = r9.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r12 = (com.facebook.aura.network.transport.HatchHttpRequest) r12
            X.Hwg.A00(r11)
        L88:
            int r6 = r6 + 1
            r9.L$0 = r12
            r9.L$1 = r0
            r1 = 0
            r9.L$2 = r1
            r9.I$0 = r6
            r9.J$0 = r2
            r9.label = r8
            java.lang.Object r11 = r0.openResponseStream(r12, r9)
            if (r11 != r10) goto L30
            return r10
        L9e:
            X.Hwg.A00(r11)
            com.facebook.aura.network.transport.HatchHttpClient r0 = X.C60O.A08()
            r9.L$0 = r12
            r9.L$1 = r0
            r9.label = r1
            java.lang.Object r11 = r0.openResponseStream(r12, r9)
            if (r11 != r10) goto Lbd
            return r10
        Lb2:
            java.lang.Object r0 = r9.L$1
            com.facebook.aura.network.transport.HatchHttpClient r0 = (com.facebook.aura.network.transport.HatchHttpClient) r0
            java.lang.Object r12 = r9.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r12 = (com.facebook.aura.network.transport.HatchHttpRequest) r12
            X.Hwg.A00(r11)
        Lbd:
            com.facebook.aura.network.transport.HatchHttpResponseStream r11 = (com.facebook.aura.network.transport.HatchHttpResponseStream) r11
            r6 = 0
            goto L32
        Lc2:
            com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$openStreamWithTransportRetry$1 r9 = new com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$openStreamWithTransportRetry$1
            r9.<init>(r13)
            goto L12
        Lc9:
            return r11
        Lca:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt.openStreamWithTransportRetry(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    public static final boolean shouldUpdateHeight(int i, int i2) {
        if (i2 > 0) {
            return i <= 0 || Math.abs(i2 - i) > 2;
        }
        return false;
    }

    public static final String widgetDocumentUrl(String str) {
        return FGI.A0M(WIDGET_BASE_URL, AbstractC06907md.A01(CustomConnectorRegisterRepositoryKt.ROOT_PATH, C7BY.A0e(C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str), CustomConnectorRegisterRepositoryKt.ROOT_PATH), HatchWidgetWebViewKt$widgetDocumentUrl$encodedPath$1.INSTANCE));
    }

    /* renamed from: cssColor-8_81llA, reason: not valid java name */
    public static final String m691cssColor8_81llA(long j) {
        int iA01 = HxS.A01(j);
        int i = (iA01 >> 8) & 255;
        int i2 = iA01 & 255;
        double d = ((iA01 >>> 24) & 255) / 255.0d;
        StringBuilder sbA0y = C60O.A0y("rgba(", (iA01 >> 16) & 255);
        sbA0y.append(",");
        sbA0y.append(i);
        sbA0y.append(",");
        sbA0y.append(i2);
        sbA0y.append(",");
        sbA0y.append(d);
        return AnonymousClass001.A0v(")", sbA0y);
    }

    public static final void destroyContainer(FrameLayout frameLayout) {
        WidgetWebViewState widgetWebViewState;
        HatchHtmlRenderTrace hatchHtmlRenderTrace;
        Object tag = frameLayout.getTag();
        if ((tag instanceof WidgetWebViewState) && (widgetWebViewState = (WidgetWebViewState) tag) != null && (hatchHtmlRenderTrace = widgetWebViewState.renderTrace) != null) {
            hatchHtmlRenderTrace.cancelled();
        }
        WidgetWebView widgetWebViewWidgetWebViewOrNull = widgetWebViewOrNull(frameLayout);
        if (widgetWebViewWidgetWebViewOrNull != null) {
            widgetWebViewWidgetWebViewOrNull.stopLoading();
            if (C6xU.A00("WEB_MESSAGE_LISTENER")) {
                C6xj.A04(widgetWebViewWidgetWebViewOrNull, BRIDGE_NAME);
            } else {
                widgetWebViewWidgetWebViewOrNull.removeJavascriptInterface(BRIDGE_NAME);
            }
            frameLayout.removeAllViews();
            widgetWebViewWidgetWebViewOrNull.destroy();
        }
    }

    public static final boolean isHttp(Uri uri) {
        String scheme;
        String scheme2 = uri.getScheme();
        return (scheme2 != null && scheme2.equalsIgnoreCase("https")) || ((scheme = uri.getScheme()) != null && scheme.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP));
    }

    public static final boolean isMetaCdn(Uri uri) {
        String host;
        String scheme = uri.getScheme();
        return (scheme == null ? false : scheme.equalsIgnoreCase("https")) && (host = uri.getHost()) != null && AnonymousClass001.A0u(host).endsWith(META_CDN_HOST_SUFFIX);
    }

    public static final boolean isWidgetOrigin(Uri uri) {
        String host;
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("https") && (host = uri.getHost()) != null && host.equalsIgnoreCase(WIDGET_HOST);
    }

    public static final WebResourceResponse widgetHostForbidden() {
        return new WebResourceResponse("text/plain", "utf-8", 403, "Forbidden", AGH.A0E(), C60Q.A0T());
    }

    public static final WebResourceResponse widgetHostNoContent() {
        return new WebResourceResponse("text/plain", "utf-8", HTTP_NO_CONTENT, "No Content", AGH.A0E(), C60Q.A0T());
    }

    public static final WebResourceResponse widgetHostNotFound() {
        return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", AGH.A0E(), C60Q.A0T());
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* renamed from: HatchWidgetWebView-0jEh-g8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m689HatchWidgetWebView0jEhg8(java.lang.String r51, java.lang.String r52, java.lang.String r53, com.facebook.aura.model.JSONState r54, X.G0U<? super java.lang.String, kotlin.Unit> r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, int r59, X.G0U<? super java.lang.Integer, kotlin.Unit> r60, X.C1D3 r61, X.B6A r62, X.BRg r63, X.BFM r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt.m689HatchWidgetWebView0jEhg8(java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.model.JSONState, X.G0U, java.lang.String, java.lang.String, java.lang.String, int, X.G0U, X.1D3, X.B6A, X.BRg, X.BFM, int, int, int):void");
    }
}
