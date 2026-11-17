package com.facebook.aura.spaces.preload;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AbstractC9245GAx;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BV3;
import X.C06827l3;
import X.C06847l8;
import X.C0924AIa;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60N;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C60S;
import X.C6t6;
import X.C6tA;
import X.C6tB;
import X.C6tn;
import X.C6ys;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.C9jH;
import X.C9oY;
import X.C9tI;
import X.C9tJ;
import X.CFK;
import X.DCl;
import X.EnumC06837l4;
import X.FGI;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import com.facebook.aura.network.transport.HatchHttpClientKt;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchRequestCategory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.HatchResponseBodyPolicy;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import com.facebook.aura.spaces.cache.SpacesDiskCache;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import com.facebook.aura.webview.HtmlWebViewPool;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionType;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import com.facebook.aura.widgets.SpaceSnapshotRendererKt;
import com.facebook.tigon.iface.TigonRequest;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SpacesWebViewFactoryKt {
    public static final float BOTTOM_INSET_ADJUSTMENT = 5.0f;
    public static final String CACHEABLE_ASSET_EXTENSIONS = "m?js|css|woff2?|ttf|otf|png|jpe?g|gif|webp|avif|svg|ico";
    public static final C06827l3 FINGERPRINTED_ASSET_REGEX;
    public static final long MAX_OFFLINE_HTML_REWRITE_BYTES = 2097152;
    public static final int MAX_SUBRESOURCE_5XX_RETRIES = 2;
    public static final String ROOT_OVERSCROLL_BEHAVIOR_DISABLES_PULL_JS = "[document.documentElement, document.body].some(function(el) { return el && /^(none|contain)$/.test(getComputedStyle(el).overscrollBehaviorY); })";
    public static final String SPACES_MEDIA_CONTROL_JS;
    public static final String SPACES_SPEECH_SYNTHESIS_JS;
    public static final C06827l3 STATIC_ASSET_REGEX;
    public static final long SUBRESOURCE_5XX_BASE_DELAY_MS = 800;
    public static final String TAG = "SpacesWebViewFactory";

    /* renamed from: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$buildSpacesSecureWebViewClient$1, reason: invalid class name */
    public final class AnonymousClass1 extends C6tA implements C6tB {
        public final /* synthetic */ HtmlSpacesWebViewSession $session;
        public int subresource5xxRetries;
        public boolean subresource5xxRetryPending;
        public String subresource5xxRetryUrl;

        @Override // X.C6tB
        public boolean doAdditionalShouldOverrideUrlLoading(WebView webView, String str) {
            boolean zA1a = AnonymousClass002.A1a(webView, str);
            if (str.startsWith("blob:")) {
                CFK.A06(SpacesWebViewFactoryKt.TAG, "Dropping blob: navigation \u2014 not resolvable outside the creating document");
                HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.SPACE, HatchHtmlActionType.LINK_TAP, str).failed(HatchHtmlErrorCode.UNSUPPORTED_SCHEME, "blob:", null);
                return zA1a;
            }
            HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            if (htmlSpacesWebViewSession.isSavedSpace) {
                String strSavedSpaceNavigationRoute = SpacesWebViewFactoryKt.savedSpaceNavigationRoute(htmlSpacesWebViewSession, str);
                HtmlSpacesWebViewSession htmlSpacesWebViewSession2 = this.$session;
                SpacesWebViewFactoryKt.logSavedSpaceEvent(htmlSpacesWebViewSession2, webView, "navigation", str, AnonymousClass006.A0y(htmlSpacesWebViewSession2.isLoading.getValue(), " loading=", C3cI.A0x("route=", strSavedSpaceNavigationRoute)));
                if ("same_host".equals(strSavedSpaceNavigationRoute)) {
                    return false;
                }
                if (!"external_tap".equals(strSavedSpaceNavigationRoute)) {
                    return zA1a;
                }
            }
            String canonicalSpaceDocumentUrl = SpacesWebViewSessionKt.toCanonicalSpaceDocumentUrl(str);
            if (!str.equals(canonicalSpaceDocumentUrl) && SpacesWebViewSessionKt.isSameOrigin(str, this.$session.sourceUrl)) {
                webView.loadUrl(canonicalSpaceDocumentUrl);
                return zA1a;
            }
            String str2 = this.$session.sourceUrl;
            if (str2 != null) {
                Uri uri = Uri.parse(str);
                C7384Etj.A0U(uri);
                if (SpacesWebViewFactoryKt.shouldProxyAuthenticatedSpaceRequest(uri, str2)) {
                    return false;
                }
            }
            G0U<? super String, Unit> g0u = this.$session.onOpenUrl;
            HatchHtmlActionTrace hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.SPACE, HatchHtmlActionType.LINK_TAP, str);
            if (g0u == null) {
                hatchHtmlActionTraceStartAction.failed(HatchHtmlErrorCode.NO_HANDLER, str, null);
                return false;
            }
            g0u.invoke(str);
            hatchHtmlActionTraceStartAction.routed(HatchHtmlRoute.EXTERNAL_BROWSER);
            return zA1a;
        }

        @Override // X.C6tA
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            C7384Etj.A0Y(webView, 0);
            super.doUpdateVisitedHistory(webView, str, z);
            AnonymousClass004.A1D(webView.canGoBack(), this.$session.canGoBack);
        }

        @Override // X.C6tA
        public void onPageCommitVisible(WebView webView, String str) {
            SpacesSecureWebView spacesSecureWebView;
            C7384Etj.A0Y(webView, 0);
            super.onPageCommitVisible(webView, str);
            if ((webView instanceof SpacesSecureWebView) && (spacesSecureWebView = (SpacesSecureWebView) webView) != null) {
                spacesSecureWebView.readRootOverscrollBehavior$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload();
            }
            SpacesWebViewFactoryKt.logSavedSpaceEvent(this.$session, webView, "page_visible", str, "");
            HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            if (htmlSpacesWebViewSession.isSavedSpace) {
                return;
            }
            AnonymousClass004.A1D(false, htmlSpacesWebViewSession.isLoading);
        }

        @Override // X.C6tA
        public void onPageFinished(WebView webView, String str) {
            SpacesSecureWebView spacesSecureWebView;
            HatchHtmlRenderTrace hatchHtmlRenderTrace;
            C7384Etj.A0Y(webView, 0);
            HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            if (htmlSpacesWebViewSession.isSavedSpace && !SavedSpaceWebSessionKt.SAVED_SPACE_DOCUMENT_URL.equals(str)) {
                String str2 = htmlSpacesWebViewSession.sourceUrl;
                Uri uri = str2 != null ? Uri.parse(str2) : null;
                Uri uri2 = str != null ? Uri.parse(str) : null;
                if (uri == null || uri2 == null || !C7384Etj.areEqual(str, webView.getUrl()) || !C60Q.A1R(uri2) || !C60R.A1S(uri2, uri) || uri2.getUserInfo() != null || !C60R.A1T(uri2, new Integer[]{-1, 443})) {
                    SpacesWebViewFactoryKt.logSavedSpaceEvent(this.$session, webView, "page_finished_ignored", str, "");
                    return;
                }
            }
            HtmlSpacesWebViewSession htmlSpacesWebViewSession2 = this.$session;
            SpacesWebViewFactoryKt.logSavedSpaceEvent(htmlSpacesWebViewSession2, webView, "page_finished", str, AnonymousClass007.A0a("showError=", htmlSpacesWebViewSession2.showError.getValue()));
            this.$session.showError.getValue();
            if (!AnonymousClass003.A1Z(this.$session.showError) && (hatchHtmlRenderTrace = this.$session.renderTrace) != null) {
                hatchHtmlRenderTrace.finished();
            }
            this.subresource5xxRetryPending = false;
            AnonymousClass003.A14(this.$session.isLoading, false);
            HtmlSpacesWebViewSession htmlSpacesWebViewSession3 = this.$session;
            if (htmlSpacesWebViewSession3.savedSpaceAdmissionPending) {
                webView.clearHistory();
                htmlSpacesWebViewSession3 = this.$session;
                htmlSpacesWebViewSession3.savedSpaceAdmissionPending = false;
            }
            AnonymousClass003.A14(htmlSpacesWebViewSession3.canGoBack, webView.canGoBack());
            SpacesWebViewFactoryKt.injectSpacesBootstrap(webView, SpacesWebViewSessionKt.spacesRoutePrefixFor(this.$session.sourceUrl));
            SpacesWebViewFactoryKt.injectSafeAreaInsets(webView, this.$session);
            webView.evaluateJavascript(SpacesWebViewFactoryKt.SPACES_MEDIA_CONTROL_JS, null);
            webView.evaluateJavascript(SpacesWebViewFactoryKt.SPACES_SPEECH_SYNTHESIS_JS, null);
            if (this.$session.authToken != null && SpacesWebViewSessionKt.isSameOrigin(webView.getUrl(), this.$session.sourceUrl)) {
                webView.evaluateJavascript(SpacesShareBridge.script, null);
            }
            if ((webView instanceof SpacesSecureWebView) && (spacesSecureWebView = (SpacesSecureWebView) webView) != null) {
                spacesSecureWebView.readRootOverscrollBehavior$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload();
            }
            webView.evaluateJavascript("\n            (function() {\n              function reportMetrics(el) {\n                var rect = el.getBoundingClientRect();\n                var bridgeToken = typeof __fbAndroidBridgeAuthToken !== 'undefined' ? __fbAndroidBridgeAuthToken : '';\n                _fwaSpacesTouchBridge.onScrollMetrics(\n                  bridgeToken, el.scrollLeft, el.scrollWidth, el.clientWidth,\n                  rect.top, rect.bottom);\n              }\n              function attachScrollListeners() {\n                var els = document.querySelectorAll('*');\n                var found = false;\n                for (var i = 0; i < els.length; i++) {\n                  if (els[i].__fwaScrollAttached) continue;\n                  var s = getComputedStyle(els[i]);\n                  if (s.overflowX === 'auto' || s.overflowX === 'scroll') {\n                    els[i].__fwaScrollAttached = true;\n                    if (els[i].scrollWidth > els[i].clientWidth) {\n                      found = true;\n                      reportMetrics(els[i]);\n                      els[i].addEventListener('scroll', function() {\n                        reportMetrics(this);\n                      });\n                    }\n                  }\n                }\n                return found;\n              }\n              if (!attachScrollListeners()) {\n                var observer = new MutationObserver(function() {\n                  if (attachScrollListeners()) {\n                    observer.disconnect();\n                  }\n                });\n                observer.observe(document.body || document.documentElement,\n                  {childList: true, subtree: true});\n              }\n            })();\n            ", null);
            if (!AnonymousClass003.A1Z(this.$session.showError)) {
                this.$session.lastLoadCompletedAtMs = System.currentTimeMillis();
                HtmlSpacesWebViewSession htmlSpacesWebViewSession4 = this.$session;
                htmlSpacesWebViewSession4.loadCompletedContent = htmlSpacesWebViewSession4.loadedContent;
            }
            HtmlSpacesWebViewSession htmlSpacesWebViewSession5 = this.$session;
            Function0<Unit> function0 = htmlSpacesWebViewSession5.trackedNavWebViewLoadCallback;
            String str3 = htmlSpacesWebViewSession5.trackedNavWebViewLoadRequestKey;
            HtmlSpacesWebViewSession htmlSpacesWebViewSession6 = this.$session;
            htmlSpacesWebViewSession6.trackedNavWebViewLoadCallback = null;
            if (AnonymousClass003.A1Z(htmlSpacesWebViewSession6.showError) || !this.$session.trackNavWebViewLoad || str3 == null) {
                return;
            }
            this.$session.satisfiedTrackedNavWebViewLoadRequestKey = str3;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // X.C6tA
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SpacesSecureWebView spacesSecureWebView;
            C7384Etj.A0Y(webView, 0);
            super.onPageStarted(webView, str, bitmap);
            if ((webView instanceof SpacesSecureWebView) && (spacesSecureWebView = (SpacesSecureWebView) webView) != null) {
                spacesSecureWebView.onDocumentStarted$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload();
            }
            SpacesWebViewFactoryKt.logSavedSpaceEvent(this.$session, webView, "page_started", str, "");
            HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$session.renderTrace;
            if (hatchHtmlRenderTrace != null) {
                hatchHtmlRenderTrace.committed();
            }
        }

        @Override // X.C6tA
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String description;
            boolean zA1Z = AnonymousClass005.A1Z(webView, webResourceRequest, webResourceError);
            SpacesWebViewFactoryKt.logSavedSpaceEvent(this.$session, webView, "network_error", C60Q.A0d(webResourceRequest), C60P.A1P(" mainFrame=", C60O.A0y("code=", webResourceError.getErrorCode()), webResourceRequest.isForMainFrame()));
            int errorCode = webResourceError.getErrorCode();
            CharSequence description2 = this.$session.isSavedSpace ? "shared-space" : webResourceError.getDescription();
            HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            Object url = htmlSpacesWebViewSession.isSavedSpace ? htmlSpacesWebViewSession.sourceUrl : webResourceRequest.getUrl();
            boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
            StringBuilder sbA0y = C60O.A0y("WebView error: code=", errorCode);
            sbA0y.append(" desc=");
            sbA0y.append((Object) description2);
            sbA0y.append(" url=");
            sbA0y.append(url);
            CFK.A04(SpacesWebViewFactoryKt.TAG, C60P.A1P(" isMainFrame=", sbA0y, zIsForMainFrame));
            if (!webResourceRequest.isForMainFrame()) {
                HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$session.renderTrace;
                if (hatchHtmlRenderTrace != null) {
                    HatchHtmlErrorCode hatchHtmlErrorCode = HatchHtmlErrorCode.NET_ERROR;
                    int errorCode2 = webResourceError.getErrorCode();
                    description = this.$session.isSavedSpace ? "shared-space" : webResourceError.getDescription();
                    HtmlSpacesWebViewSession htmlSpacesWebViewSession2 = this.$session;
                    Object url2 = htmlSpacesWebViewSession2.isSavedSpace ? htmlSpacesWebViewSession2.sourceUrl : webResourceRequest.getUrl();
                    StringBuilder sbA0y2 = C60O.A0y("code=", errorCode2);
                    sbA0y2.append(" desc=");
                    sbA0y2.append((Object) description);
                    hatchHtmlRenderTrace.resourceError(hatchHtmlErrorCode, AnonymousClass006.A0y(url2, " url=", sbA0y2), null, null);
                    return;
                }
                return;
            }
            HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
            HatchHtmlSurface hatchHtmlSurface = HatchHtmlSurface.SPACE;
            HatchHtmlRenderTrace hatchHtmlRenderTrace2 = this.$session.renderTrace;
            HatchHtmlErrorCode hatchHtmlErrorCode2 = HatchHtmlErrorCode.NET_ERROR;
            int errorCode3 = webResourceError.getErrorCode();
            description = this.$session.isSavedSpace ? "shared-space" : webResourceError.getDescription();
            HtmlSpacesWebViewSession htmlSpacesWebViewSession3 = this.$session;
            Object url3 = htmlSpacesWebViewSession3.isSavedSpace ? htmlSpacesWebViewSession3.sourceUrl : webResourceRequest.getUrl();
            StringBuilder sbA0y3 = C60O.A0y("code=", errorCode3);
            sbA0y3.append(" desc=");
            sbA0y3.append((Object) description);
            hatchHtmlDiagnostics.reportRenderFailure(hatchHtmlSurface, hatchHtmlRenderTrace2, hatchHtmlErrorCode2, AnonymousClass006.A0y(url3, " url=", sbA0y3), null);
            AnonymousClass003.A14(this.$session.showError, zA1Z);
            AnonymousClass003.A14(this.$session.isLoading, false);
        }

        @Override // X.C6tA
        public void onReceivedHttpError(final WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String strA0h;
            int i;
            boolean zA1a = AnonymousClass002.A1a(webView, webResourceRequest);
            C7384Etj.A0Y(webResourceResponse, 2);
            SpacesWebViewFactoryKt.logSavedSpaceEvent(this.$session, webView, "http_error", C60Q.A0d(webResourceRequest), C60P.A1P(" mainFrame=", C60O.A0y("status=", webResourceResponse.getStatusCode()), webResourceRequest.isForMainFrame()));
            int statusCode = webResourceResponse.getStatusCode();
            HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            Object url = htmlSpacesWebViewSession.isSavedSpace ? htmlSpacesWebViewSession.sourceUrl : webResourceRequest.getUrl();
            boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
            StringBuilder sbA0y = C60O.A0y("HTTP error: ", statusCode);
            sbA0y.append(" url=");
            sbA0y.append(url);
            CFK.A06(SpacesWebViewFactoryKt.TAG, C60P.A1P(" isMainFrame=", sbA0y, zIsForMainFrame));
            int statusCode2 = webResourceResponse.getStatusCode();
            if (500 <= statusCode2 && statusCode2 < 600 && !webResourceRequest.isForMainFrame()) {
                String url2 = webView.getUrl();
                if (url2 == null || (strA0h = C60Q.A0h(url2)) == null || !strA0h.equals(webResourceRequest.getUrl().getHost())) {
                    return;
                }
                if (!url2.equals(this.subresource5xxRetryUrl)) {
                    this.subresource5xxRetryUrl = url2;
                    this.subresource5xxRetries = 0;
                    this.subresource5xxRetryPending = false;
                }
                if (this.subresource5xxRetryPending || (i = this.subresource5xxRetries) >= 2) {
                    return;
                }
                this.subresource5xxRetries = i + 1;
                this.subresource5xxRetryPending = zA1a;
                webResourceResponse.getStatusCode();
                webView.postDelayed(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$buildSpacesSecureWebViewClient$1$onReceivedHttpError$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        webView.reload();
                    }
                }, 800 << i);
                return;
            }
            if (!webResourceRequest.isForMainFrame()) {
                HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$session.renderTrace;
                if (hatchHtmlRenderTrace != null) {
                    HatchHtmlErrorCode hatchHtmlErrorCode = HatchHtmlErrorCode.HTTP_ERROR;
                    int statusCode3 = webResourceResponse.getStatusCode();
                    HtmlSpacesWebViewSession htmlSpacesWebViewSession2 = this.$session;
                    hatchHtmlRenderTrace.resourceError(hatchHtmlErrorCode, AnonymousClass006.A0y(htmlSpacesWebViewSession2.isSavedSpace ? htmlSpacesWebViewSession2.sourceUrl : webResourceRequest.getUrl(), " url=", C60O.A0y("status=", statusCode3)), null, Integer.valueOf(webResourceResponse.getStatusCode()));
                    return;
                }
                return;
            }
            int statusCode4 = webResourceResponse.getStatusCode();
            HtmlSpacesWebViewSession htmlSpacesWebViewSession3 = this.$session;
            CFK.A04(SpacesWebViewFactoryKt.TAG, AnonymousClass006.A0y(htmlSpacesWebViewSession3.isSavedSpace ? htmlSpacesWebViewSession3.sourceUrl : webResourceRequest.getUrl(), " url=", C60O.A0y("Main frame HTTP error: ", statusCode4)));
            HatchHtmlDiagnostics hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
            HatchHtmlSurface hatchHtmlSurface = HatchHtmlSurface.SPACE;
            HatchHtmlRenderTrace hatchHtmlRenderTrace2 = this.$session.renderTrace;
            HatchHtmlErrorCode hatchHtmlErrorCode2 = HatchHtmlErrorCode.HTTP_ERROR;
            int statusCode5 = webResourceResponse.getStatusCode();
            HtmlSpacesWebViewSession htmlSpacesWebViewSession4 = this.$session;
            hatchHtmlDiagnostics.reportRenderFailure(hatchHtmlSurface, hatchHtmlRenderTrace2, hatchHtmlErrorCode2, AnonymousClass006.A0y(htmlSpacesWebViewSession4.isSavedSpace ? htmlSpacesWebViewSession4.sourceUrl : webResourceRequest.getUrl(), " url=", C60O.A0y("status=", statusCode5)), null);
            AnonymousClass003.A14(this.$session.showError, zA1a);
            AnonymousClass003.A14(this.$session.isLoading, false);
        }

        public AnonymousClass1(HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
            this.$session = htmlSpacesWebViewSession;
        }

        @Override // X.C6tA
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean zA1Y = C60P.A1Y(webView, renderProcessGoneDetail);
            boolean zDidCrash = renderProcessGoneDetail.didCrash();
            HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            CFK.A04(SpacesWebViewFactoryKt.TAG, C60P.A1M(" url=", htmlSpacesWebViewSession.isSavedSpace ? htmlSpacesWebViewSession.sourceUrl : webView.getUrl(), C60O.A10("Render process gone: didCrash=", zDidCrash)));
            HatchHtmlDiagnostics.INSTANCE.reportRenderFailure(HatchHtmlSurface.SPACE, this.$session.renderTrace, renderProcessGoneDetail.didCrash() ? HatchHtmlErrorCode.RENDERER_CRASHED : HatchHtmlErrorCode.RENDERER_GONE, null, null);
            AnonymousClass003.A14(this.$session.rendererGone, zA1Y);
            return zA1Y;
        }

        @Override // X.C6tA
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String gatewaySpaceUrl;
            SpacesDiskCache.CachedAssetStream cachedAssetStreamOpenStreamBlocking;
            Function0<Unit> function0;
            SpacesDiskCache.CachedAssetStream cachedAssetStreamOpenStreamBlocking2;
            AnonymousClass003.A0u(webView, webResourceRequest);
            String str = this.$session.sourceUrl;
            String str2 = this.$session.authToken;
            WebResourceResponse webResourceResponseCachedWebResourceResponse = null;
            if (str != null && !C7BY.A0j(str) && str2 != null && !C7BY.A0j(str2) && SpacesWebViewFactoryKt.shouldProxyAuthenticatedSpaceRequest(C60Q.A0A(webResourceRequest), str) && (gatewaySpaceUrl = SpacesWebViewSessionKt.toGatewaySpaceUrl(C60R.A0c(webResourceRequest), this.$session.gatewayBaseUrl)) != null) {
                SpacesDiskCache spacesDiskCache = this.$session.diskCache;
                String strA0c = C60R.A0c(webResourceRequest);
                if (spacesDiskCache == null || this.$session.isSavedSpace || !SpacesWebViewFactoryKt.isCacheFirstRequest(webResourceRequest) || this.$session.networkFirstUrls.contains(strA0c) || (cachedAssetStreamOpenStreamBlocking2 = spacesDiskCache.openStreamBlocking(strA0c)) == null || (webResourceResponseCachedWebResourceResponse = SpacesWebViewFactoryKt.cachedWebResourceResponse(cachedAssetStreamOpenStreamBlocking2, this.$session)) == null) {
                    WebResourceResponse webResourceResponseFetchAuthenticatedWebResource = SpacesWebViewFactoryKt.fetchAuthenticatedWebResource(webResourceRequest, gatewaySpaceUrl, this.$session.envCss, spacesDiskCache);
                    if (webResourceResponseFetchAuthenticatedWebResource != null) {
                        if (SpacesWebViewSessionKt.isPeerSpaceOrigin(webResourceRequest.getUrl().getHost()) && SpacesWebViewSessionKt.isPeerSpaceAccessEnded(webResourceResponseFetchAuthenticatedWebResource.getStatusCode(), webResourceRequest.isForMainFrame()) && (function0 = this.$session.onPeerAccessEnded) != null) {
                            function0.invoke();
                        }
                        int statusCode = webResourceResponseFetchAuthenticatedWebResource.getStatusCode();
                        if (200 > statusCode || statusCode >= 300) {
                        }
                        return webResourceResponseFetchAuthenticatedWebResource;
                    }
                    if (spacesDiskCache == null || (cachedAssetStreamOpenStreamBlocking = spacesDiskCache.openStreamBlocking(strA0c)) == null || (webResourceResponseCachedWebResourceResponse = SpacesWebViewFactoryKt.cachedWebResourceResponse(cachedAssetStreamOpenStreamBlocking, this.$session)) == null) {
                        return webResourceResponseFetchAuthenticatedWebResource;
                    }
                } else if (!SpacesWebViewFactoryKt.isFingerprintedAsset(C60Q.A0A(webResourceRequest))) {
                    SpacesWebViewFactoryKt.refreshCachedResourceInBackground(webView, this.$session, webResourceRequest, spacesDiskCache);
                }
            }
            return webResourceResponseCachedWebResourceResponse;
        }

        @Override // X.C6tB
        public /* synthetic */ boolean doAdditionalShouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return doAdditionalShouldOverrideUrlLoading(webView, C60Q.A0d(webResourceRequest));
        }
    }

    /* renamed from: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$createPooledSpacesWebView$1, reason: invalid class name and case insensitive filesystem */
    public final class C139111 extends AbstractC7559F3s implements G0U<C6t6, Unit> {
        public static final C139111 INSTANCE = new C139111();

        public C139111() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6t6 c6t6) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6t6 c6t6) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$refreshCachedResourceInBackground$1", f = "SpacesWebViewFactory.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$refreshCachedResourceInBackground$1, reason: invalid class name and case insensitive filesystem */
    public final class C139121 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $content;
        public final /* synthetic */ SpacesDiskCache $diskCache;
        public final /* synthetic */ WebResourceRequest $request;
        public final /* synthetic */ HtmlSpacesWebViewSession $session;
        public final /* synthetic */ String $url;
        public final /* synthetic */ WebView $view;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139121(WebView webView, HtmlSpacesWebViewSession htmlSpacesWebViewSession, WebResourceRequest webResourceRequest, SpacesDiskCache spacesDiskCache, String str, String str2, HtJ<? super C139121> htJ) {
            super(1, htJ);
            this.$view = webView;
            this.$session = htmlSpacesWebViewSession;
            this.$request = webResourceRequest;
            this.$diskCache = spacesDiskCache;
            this.$url = str;
            this.$content = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C139121(this.$view, this.$session, this.$request, this.$diskCache, this.$url, this.$content, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            int statusCode;
            byte[] bArr;
            InputStream data;
            SpacesDiskCache.CachedAsset blocking;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A06(SpacesWebViewFactoryKt.TAG, C60P.A1L("Background refresh failed for ", this.$session.sourceUrl, e2.getMessage()));
            }
            if (this.$view.getTag() != this.$session) {
                return Unit.INSTANCE;
            }
            byte[] bArr2 = null;
            if (this.$request.isForMainFrame() && (blocking = this.$diskCache.getBlocking(this.$url)) != null) {
                bArr2 = blocking.bytes;
            }
            String gatewaySpaceUrl = SpacesWebViewSessionKt.toGatewaySpaceUrl(this.$url, this.$session.gatewayBaseUrl);
            if (gatewaySpaceUrl == null) {
                return Unit.INSTANCE;
            }
            WebResourceResponse webResourceResponseFetchAuthenticatedWebResource = SpacesWebViewFactoryKt.fetchAuthenticatedWebResource(this.$request, gatewaySpaceUrl, this.$session.envCss, this.$diskCache);
            if (webResourceResponseFetchAuthenticatedWebResource != null && (data = webResourceResponseFetchAuthenticatedWebResource.getData()) != null) {
                try {
                    do {
                    } while (data.read(new byte[8192]) >= 0);
                    data.close();
                } finally {
                }
            }
            if (bArr2 == null || webResourceResponseFetchAuthenticatedWebResource == null || 200 > (statusCode = webResourceResponseFetchAuthenticatedWebResource.getStatusCode()) || statusCode >= 300) {
                return Unit.INSTANCE;
            }
            SpacesDiskCache.CachedAsset blocking2 = this.$diskCache.getBlocking(this.$url);
            if (blocking2 == null || (bArr = blocking2.bytes) == null) {
                return Unit.INSTANCE;
            }
            if (Arrays.equals(bArr2, bArr)) {
                return Unit.INSTANCE;
            }
            this.$session.networkFirstUrls.add(this.$url);
            final WebView webView = this.$view;
            final HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            final String str = this.$content;
            webView.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt.refreshCachedResourceInBackground.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    Object tag = webView.getTag();
                    HtmlSpacesWebViewSession htmlSpacesWebViewSession2 = htmlSpacesWebViewSession;
                    if (tag == htmlSpacesWebViewSession2 && C7384Etj.areEqual(htmlSpacesWebViewSession2.loadedContent, str)) {
                        webView.reload();
                    }
                }
            });
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C139121) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$selfClosingStream$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C139131 extends FilterInputStream {
        public final /* synthetic */ SpacesDiskCache.CachedAssetStream $owner;
        public boolean closed;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            C7384Etj.A0Y(bArr, 0);
            if (this.closed) {
                return -1;
            }
            int i3 = super.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            closeOwner();
            return i3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139131(SpacesDiskCache.CachedAssetStream cachedAssetStream, InputStream inputStream) {
            super(inputStream);
            this.$owner = cachedAssetStream;
        }

        private final void closeOwner() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                this.$owner.close();
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            closeOwner();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.closed) {
                return -1;
            }
            int i = super.read();
            if (i >= 0) {
                return i;
            }
            closeOwner();
            return i;
        }
    }

    public static final C6t6 createPooledSpacesWebView(Context context, G0U<? super C6t6, Unit> g0u) {
        boolean zA1a = AnonymousClass002.A1a(context, g0u);
        final HtmlSpacesWebViewSession htmlSpacesWebViewSession = new HtmlSpacesWebViewSession();
        SpacesSecureWebView spacesSecureWebView = new SpacesSecureWebView(new MutableContextWrapper(context));
        spacesSecureWebView.setTag(htmlSpacesWebViewSession);
        g0u.invoke(spacesSecureWebView);
        if (htmlSpacesWebViewSession.isSavedSpace) {
            C60S.A04(spacesSecureWebView);
            spacesSecureWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$createPooledSpacesWebView$webView$1$1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() != 1) {
                        return false;
                    }
                    htmlSpacesWebViewSession.savedSpaceLastTapUptimeMs = SystemClock.uptimeMillis();
                    return false;
                }
            });
        }
        spacesSecureWebView.getSettings().setJavaScriptEnabled(zA1a);
        spacesSecureWebView.getSettings().setDomStorageEnabled(zA1a);
        spacesSecureWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        spacesSecureWebView.getSettings().setSupportMultipleWindows(zA1a);
        spacesSecureWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(zA1a);
        spacesSecureWebView.setVerticalScrollBarEnabled(false);
        spacesSecureWebView.setHorizontalScrollBarEnabled(false);
        spacesSecureWebView.setBackgroundColor(0);
        spacesSecureWebView.enableSecureJsBridge(zA1a);
        spacesSecureWebView.setWebChromeClient(new SpacesWebChromeClient(htmlSpacesWebViewSession));
        spacesSecureWebView.setWebViewClient(new AnonymousClass1(htmlSpacesWebViewSession));
        installSpacesPreloadBridgeStubs(spacesSecureWebView);
        return spacesSecureWebView;
    }

    public static final HtmlWebViewPool getSpacesWebViewPool(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HtmlWebViewPool companion = HtmlWebViewPool.Companion.getInstance(abstractC3358CGz);
        companion.setFactory(new SpacesWebViewFactoryKt$getSpacesWebViewPool$1$1(abstractC3358CGz));
        return companion;
    }

    public static final void installSpacesPreloadBridgeStubs(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        c6t6.removeJavascriptInterface("_fwaSpacesTouchBridge");
        c6t6.addJavascriptInterface(new SpacesTouchBridgeStub(), "_fwaSpacesTouchBridge");
        c6t6.removeJavascriptInterface(SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
        c6t6.addJavascriptInterface(new SpacesInitialDataBridgeStub(), SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
        c6t6.removeJavascriptInterface(SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
        c6t6.addJavascriptInterface(new SpacesActionResponseBridgeStub(c6t6), SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
        c6t6.removeJavascriptInterface("_fwaSpacesTts");
        c6t6.addJavascriptInterface(new SpacesTtsBridgeStub(), "_fwaSpacesTts");
        c6t6.removeJavascriptInterface("_fwaSpacesBlobViewer");
        c6t6.addJavascriptInterface(new SpacesBlobViewerBridgeStub(), "_fwaSpacesBlobViewer");
        c6t6.removeJavascriptInterface(SpacesShareBridge.BRIDGE_NAME);
        Object tag = c6t6.getTag();
        C7384Etj.A0Z(tag, "null cannot be cast to non-null type com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession");
        c6t6.addJavascriptInterface(new SpacesShareBridgeStub((HtmlSpacesWebViewSession) tag), SpacesShareBridge.BRIDGE_NAME);
    }

    public static final Integer parseWebViewColor(String str) {
        Integer numA0r;
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        Integer numValueOf = null;
        if (AnonymousClass005.A1a(strA0l, "#")) {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strA0l));
                return numValueOf;
            } catch (Exception unused) {
                return numValueOf;
            }
        }
        C06847l8 c06847l8A06 = C06827l3.A02("rgba?\\(\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,\\s*(\\d+)\\s*(?:,\\s*([\\d.]+))?\\s*\\)").A06(strA0l);
        if (c06847l8A06 == null || (numA0r = C9tI.A0r(C60Q.A0n(c06847l8A06.AG1(), 1))) == null) {
            return null;
        }
        int iIntValue = numA0r.intValue();
        Integer numA0r2 = C9tI.A0r(C60Q.A0n(c06847l8A06.AG1(), 2));
        if (numA0r2 == null) {
            return null;
        }
        int iIntValue2 = numA0r2.intValue();
        Integer numA0r3 = C9tI.A0r(C60Q.A0n(c06847l8A06.AG1(), 3));
        if (numA0r3 == null) {
            return null;
        }
        int iIntValue3 = numA0r3.intValue();
        Float fA0w = C9tJ.A0w(C60Q.A0n(c06847l8A06.AG1(), 4));
        int iFloatValue = (int) ((fA0w != null ? fA0w.floatValue() : 1.0f) * 255.0f);
        if (iFloatValue < 0) {
            iFloatValue = 0;
        } else if (iFloatValue > 255) {
            iFloatValue = 255;
        }
        return Integer.valueOf(Color.argb(iFloatValue, iIntValue, iIntValue2, iIntValue3));
    }

    public static final void refreshCachedResourceInBackground(WebView webView, HtmlSpacesWebViewSession htmlSpacesWebViewSession, WebResourceRequest webResourceRequest, SpacesDiskCache spacesDiskCache) {
        String strA0c = C60R.A0c(webResourceRequest);
        spacesDiskCache.refreshInBackground(strA0c, new C139121(webView, htmlSpacesWebViewSession, webResourceRequest, spacesDiskCache, strA0c, htmlSpacesWebViewSession.loadedContent, null));
    }

    public static final String toJsStringLiteral(String str) {
        C7384Etj.A0Y(str, 0);
        return AbstractC2159Azp.A0z(C9oY.A07(str).toString(), "</", "<\\/");
    }

    static {
        EnumC06837l4 enumC06837l4 = EnumC06837l4.A03;
        STATIC_ASSET_REGEX = new C06827l3("\\.(m?js|css|woff2?|ttf|otf|png|jpe?g|gif|webp|avif|svg|ico)$", enumC06837l4);
        FINGERPRINTED_ASSET_REGEX = new C06827l3("[.-]([A-Za-z0-9_-]{8,})\\.(m?js|css|woff2?|ttf|otf|png|jpe?g|gif|webp|avif|svg|ico)$", enumC06837l4);
        SPACES_MEDIA_CONTROL_JS = "(function(){\n  try {\n    if (window.__fwaSpacesAudioControlInstalled) return;\n    window.__fwaSpacesAudioControlInstalled = true;\n    window.__fwaSpacesAudioCtxs = window.__fwaSpacesAudioCtxs || [];\n    ['AudioContext','webkitAudioContext'].forEach(function(name){\n      var AC = window[name];\n      if (typeof AC !== 'function' || AC.__fwaPatched) return;\n      AC.__fwaPatched = true;\n      window[name] = new Proxy(AC, {\n        construct: function(target, args, newTarget){\n          var ctx = Reflect.construct(target, args, newTarget);\n          try { window.__fwaSpacesAudioCtxs.push(ctx); } catch(e){}\n          return ctx;\n        }\n      });\n    });\n    window.__fwaSpacesSetAudioPaused = function(paused){\n      if (paused){ try{ if (window.speechSynthesis) window.speechSynthesis.cancel(); }catch(e){} }\n      try {\n        var media = document.querySelectorAll('video,audio');\n        if (paused){\n          var autoPaused = [];\n          for (var i=0;i<media.length;i++){\n            if (!media[i].paused){ try{ media[i].pause(); autoPaused.push(media[i]); }catch(e){} }\n          }\n          window.__fwaSpacesAutoPausedMedia = autoPaused;\n        } else {\n          var prev = window.__fwaSpacesAutoPausedMedia || [];\n          for (var k=0;k<prev.length;k++){\n            try{ var pr = prev[k].play(); if (pr && pr.catch) pr.catch(function(){}); }catch(e){}\n          }\n          window.__fwaSpacesAutoPausedMedia = [];\n        }\n      } catch(e){}\n      try {\n        var ctxs = window.__fwaSpacesAudioCtxs || [];\n        for (var j=0;j<ctxs.length;j++){\n          try {\n            if (paused){ if (ctxs[j].state === 'running') ctxs[j].suspend(); }\n            else { if (ctxs[j].state === 'suspended') ctxs[j].resume(); }\n          } catch(e){}\n        }\n      } catch(e){}\n    };\n  } catch(e){}\n})();";
        SPACES_SPEECH_SYNTHESIS_JS = "(function(){\n  try {\n    if (window.__fwaSpacesTtsInstalled) return;\n    if (window.speechSynthesis && window.SpeechSynthesisUtterance) return;\n    window.__fwaSpacesTtsInstalled = true;\n\n    function bridge(){ return window._fwaSpacesTts; }\n    function token(){ return typeof __fbAndroidBridgeAuthToken !== 'undefined' ? __fbAndroidBridgeAuthToken : ''; }\n\n    var utterances = {};\n    var seq = 0;\n    var voices = [];\n\n    function Utterance(text){\n      this.text = text || '';\n      this.lang = '';\n      this.voice = null;\n      this.volume = 1;\n      this.rate = 1;\n      this.pitch = 1;\n      this.onstart = null; this.onend = null; this.onerror = null;\n      this.onpause = null; this.onresume = null; this.onboundary = null; this.onmark = null;\n      this._listeners = {};\n    }\n    Utterance.prototype.addEventListener = function(type, cb){\n      (this._listeners[type] = this._listeners[type] || []).push(cb);\n    };\n    Utterance.prototype.removeEventListener = function(type, cb){\n      var a = this._listeners[type]; if(!a) return;\n      var i = a.indexOf(cb); if(i>=0) a.splice(i,1);\n    };\n    Utterance.prototype._emit = function(type){\n      var ev; try { ev = new Event(type); } catch(e){ ev = {type:type}; }\n      var h = this['on'+type]; if (typeof h === 'function'){ try{ h.call(this, ev); }catch(e){} }\n      var a = this._listeners[type];\n      if (a){ for (var i=0;i<a.length;i++){ try{ a[i].call(this, ev); }catch(e){} } }\n    };\n\n    function Voice(o){\n      this.voiceURI = o.voiceURI; this.name = o.name; this.lang = o.lang;\n      this.localService = !!o.localService; this['default'] = !!o['default'];\n    }\n\n    var synth = {\n      pending: false,\n      speaking: false,\n      paused: false,\n      onvoiceschanged: null,\n      speak: function(u){\n        if (!u) return;\n        var id = 'u' + (++seq);\n        u._id = id;\n        utterances[id] = u;\n        synth.pending = true;\n        var voiceName = (u.voice && u.voice.name) ? u.voice.name : '';\n        var br = bridge();\n        try {\n          if (br && br.speak) {\n            br.speak(token(), id, String(u.text||''), String(u.lang||''), voiceName,\n              Number(u.rate)||1, Number(u.pitch)||1, (u.volume==null?1:Number(u.volume)));\n          }\n        } catch(e){ synth.pending = false; }\n      },\n      cancel: function(){\n        synth.pending = false; synth.speaking = false; synth.paused = false;\n        utterances = {};\n        var br = bridge(); try { if (br && br.cancel) br.cancel(token()); } catch(e){}\n      },\n      pause: function(){\n        synth.paused = true;\n        var br = bridge(); try { if (br && br.cancel) br.cancel(token()); } catch(e){}\n      },\n      resume: function(){ synth.paused = false; },\n      getVoices: function(){\n        if (!voices.length){ var br = bridge(); try { if (br && br.requestVoices) br.requestVoices(token()); } catch(e){} }\n        return voices.slice();\n      }\n    };\n\n    window.__fwaSpacesTtsEvent = function(id, type){\n      var u = utterances[id];\n      if (type === 'start'){ synth.pending = false; synth.speaking = true; }\n      else if (type === 'end' || type === 'error'){ synth.pending = false; synth.speaking = false; delete utterances[id]; }\n      if (u) u._emit(type);\n    };\n    window.__fwaSpacesTtsSetVoices = function(jsonStr){\n      try {\n        var arr = JSON.parse(jsonStr) || [];\n        voices = arr.map(function(o){ return new Voice(o); });\n        if (typeof synth.onvoiceschanged === 'function'){ try{ synth.onvoiceschanged(); }catch(e){} }\n        try { window.dispatchEvent(new Event('voiceschanged')); } catch(e){}\n      } catch(e){}\n    };\n\n    window.SpeechSynthesisUtterance = Utterance;\n    window.speechSynthesis = synth;\n\n    var br = bridge(); try { if (br && br.requestVoices) br.requestVoices(token()); } catch(e){}\n  } catch(e){}\n})();";
    }

    public static final C6tA buildSpacesSecureWebViewClient(HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
        return new AnonymousClass1(htmlSpacesWebViewSession);
    }

    public static final WebResourceResponse cachedWebResourceResponse(SpacesDiskCache.CachedAssetStream cachedAssetStream, HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
        C9jH c9jHA0E;
        InputStream byteArrayInputStream;
        String str = cachedAssetStream.mime;
        if (str == null) {
            str = "application/octet-stream";
        }
        if (str.equalsIgnoreCase("text/html")) {
            try {
                try {
                    byte[] bytes = cachedAssetStream.readBytes(2097152L);
                    cachedAssetStream.close();
                    if (bytes == null) {
                        C3cG.A1G("Cached HTML is too large to rewrite for ", htmlSpacesWebViewSession.sourceUrl, TAG);
                        return null;
                    }
                    Charset charset = DCl.A05;
                    String strInjectEnvCss = injectEnvCss(injectSpacesBootstrapIntoHtml(new String(bytes, charset), SpacesWebViewSessionKt.spacesRoutePrefixFor(htmlSpacesWebViewSession.sourceUrl)), htmlSpacesWebViewSession.envCss);
                    c9jHA0E = AGH.A0E();
                    byteArrayInputStream = new ByteArrayInputStream(strInjectEnvCss.getBytes(charset));
                } finally {
                }
            } catch (IOException e) {
                C60Q.A1K("Failed to read cached HTML for ", htmlSpacesWebViewSession.sourceUrl, ": ", e.getMessage(), TAG);
                return null;
            }
        } else {
            c9jHA0E = AGH.A0E();
            byteArrayInputStream = new C139131(cachedAssetStream, cachedAssetStream.stream);
        }
        return new WebResourceResponse(str, "utf-8", 200, "OK", c9jHA0E, byteArrayInputStream);
    }

    public static /* synthetic */ C6t6 createPooledSpacesWebView$default(Context context, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C139111.INSTANCE;
        }
        return createPooledSpacesWebView(context, g0u);
    }

    public static final WebResourceResponse fetchAuthenticatedWebResource(WebResourceRequest webResourceRequest, String str, String str2, SpacesDiskCache spacesDiskCache) {
        Object next;
        Object objA0s;
        String method = webResourceRequest.getMethod();
        C7384Etj.A0U(method);
        Locale locale = Locale.US;
        C7384Etj.A0V(locale);
        if (!method.toUpperCase(locale).equals(TigonRequest.GET)) {
            return null;
        }
        try {
            HatchHttpRequest.Companion companion = HatchHttpRequest.Companion;
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put("Accept", "text/html,application/json,*/*");
            c0924AIaA0u.put(BV3.A00(23), "identity");
            Iterator itA0n = AnonymousClass002.A0n(webResourceRequest.getRequestHeaders());
            while (true) {
                if (!itA0n.hasNext()) {
                    next = null;
                    break;
                }
                next = itA0n.next();
                String strA0t = C60O.A0t((Map.Entry) next);
                if (strA0t == null ? false : strA0t.equalsIgnoreCase(CachingHatchHttpClientKt.RANGE_HEADER)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                Object value = entry.getValue();
                C7384Etj.A0U(value);
                c0924AIaA0u.put(CachingHatchHttpClientKt.RANGE_HEADER, value);
            }
            HatchHttpResponseStream hatchHttpResponseStream = (HatchHttpResponseStream) AbstractC9245GAx.A00(C6ys.A00, new SpacesWebViewFactoryKt$fetchAuthenticatedWebResource$stream$1(companion.get(str, AIW.A0K(c0924AIaA0u), null, null, null, HatchRequestCategory.API, HatchRequestPurpose.FETCH, null, false, false, HatchResponseBodyPolicy.DEFAULT), null));
            int i = hatchHttpResponseStream.statusCode;
            boolean z = hatchHttpResponseStream.isSuccessful;
            String strA0p = C60O.A0p("Content-Type", hatchHttpResponseStream.headers);
            if (strA0p == null) {
                strA0p = "";
            }
            String strA0W = C7BY.A0W(strA0p, ";", strA0p);
            if (C7BY.A0j(strA0W)) {
                strA0W = "application/octet-stream";
            }
            String strA0U = C7BY.A0U(strA0p, "charset=", "");
            if (C7BY.A0j(strA0U)) {
                strA0U = "utf-8";
            }
            Map<String, String> map = hatchHttpResponseStream.headers;
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n2 = AnonymousClass002.A0n(map);
            while (itA0n2.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n2);
                String strA0t2 = C60O.A0t(entryA0l);
                if (!(strA0t2 == null ? false : strA0t2.equalsIgnoreCase("Content-Length"))) {
                    if (i == 200) {
                        if (!(strA0t2 == null ? false : strA0t2.equalsIgnoreCase("Accept-Ranges"))) {
                        }
                    }
                    AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                }
            }
            String str3 = z ? "OK" : "Error";
            boolean zEqualsIgnoreCase = strA0W == null ? false : strA0W.equalsIgnoreCase("text/html");
            if (i >= 400) {
                CFK.A06(TAG, FGI.A0V("Stage request failed for ", SpacesWebViewSessionKt.loggableSpaceUrl(C60Q.A0d(webResourceRequest)), AnonymousClass000.A00(8), i));
            }
            if ((!zEqualsIgnoreCase || i == 206) && z) {
                return new WebResourceResponse(strA0W, strA0U, i, str3, linkedHashMapA0j, webViewBody(hatchHttpResponseStream, C60R.A0c(webResourceRequest), strA0W, spacesDiskCache));
            }
            try {
                byte[] bodyBytes = HatchHttpClientKt.readBodyBytes(hatchHttpResponseStream, 2097152L);
                hatchHttpResponseStream.close();
                if (z && spacesDiskCache != null) {
                    if (!(bodyBytes.length == 0)) {
                        spacesDiskCache.putBlocking(C60R.A0c(webResourceRequest), bodyBytes, strA0W);
                    }
                }
                if (!zEqualsIgnoreCase) {
                    return new WebResourceResponse(strA0W, strA0U, i, str3, linkedHashMapA0j, new ByteArrayInputStream(bodyBytes));
                }
                try {
                    objA0s = Charset.forName(strA0U);
                    C7384Etj.A0U(objA0s);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Object obj = DCl.A05;
                if (objA0s instanceof C10571Hud) {
                    objA0s = obj;
                }
                Charset charset = (Charset) objA0s;
                return new WebResourceResponse(strA0W, charset.name(), i, str3, linkedHashMapA0j, new ByteArrayInputStream(injectEnvCss(injectSpacesBootstrapIntoHtml(new String(bodyBytes, charset), SpacesWebViewSessionKt.spacesRoutePrefixFor(C60Q.A0d(webResourceRequest))), str2).getBytes(charset)));
            } finally {
            }
        } catch (Exception e) {
            CFK.A0A(TAG, C60P.A1L("Failed to load authenticated stage resource ", SpacesWebViewSessionKt.loggableSpaceUrl(C60Q.A0d(webResourceRequest)), e.getMessage()), e);
            return null;
        }
    }

    public static final long identityContentLength(HatchHttpResponseStream hatchHttpResponseStream) {
        String strA0p;
        Long lA0s;
        String strA0p2 = C60O.A0p("Content-Encoding", hatchHttpResponseStream.headers);
        String strA0l = strA0p2 != null ? AnonymousClass002.A0l(strA0p2) : null;
        if ((strA0l != null && strA0l.length() != 0 && !strA0l.equalsIgnoreCase("identity")) || (strA0p = C60O.A0p("Content-Length", hatchHttpResponseStream.headers)) == null || (lA0s = C9tI.A0s(strA0p)) == null) {
            return -1L;
        }
        return lA0s.longValue();
    }

    public static final String injectSpacesBootstrapIntoHtml(String str, String str2) {
        StringBuilder sbA0w;
        String strA0m = FGI.A0m("<script>", SPACES_MEDIA_CONTROL_JS, "</script><script>", SPACES_SPEECH_SYNTHESIS_JS, "</script><script>", SpacesShareBridge.script, "</script><script>", buildSpacesBootstrapScript(str2), "</script>");
        int iA0B = C7BY.A0B(str, "</head>", 0, true);
        if (iA0B >= 0) {
            String strSubstring = str.substring(0, iA0B);
            str = str.substring(iA0B);
            sbA0w = C3cG.A0g(strSubstring);
        } else {
            sbA0w = C60O.A0w();
        }
        return C60P.A1M(strA0m, str, sbA0w);
    }

    public static /* synthetic */ void logSavedSpaceEvent$default(HtmlSpacesWebViewSession htmlSpacesWebViewSession, WebView webView, String str, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = "";
        }
        logSavedSpaceEvent(htmlSpacesWebViewSession, webView, str, str2, str3);
    }

    public static final String savedSpaceNavigationRoute(HtmlSpacesWebViewSession htmlSpacesWebViewSession, String str) {
        Uri uri;
        String str2 = htmlSpacesWebViewSession.sourceUrl;
        if (str2 == null || (uri = Uri.parse(str2)) == null) {
            return "blocked_no_source";
        }
        Uri uri2 = Uri.parse(str);
        return (C60Q.A1R(uri2) && C60R.A1S(uri2, uri) && uri2.getUserInfo() == null && C60R.A1T(uri2, new Integer[]{-1, 443})) ? "same_host" : (!uri2.isHierarchical() || uri2.getQueryParameter("viewer_assertion") == null) ? (htmlSpacesWebViewSession.savedSpaceAdmissionPending || AnonymousClass003.A1Z(htmlSpacesWebViewSession.isLoading)) ? "blocked_loading" : SystemClock.uptimeMillis() - htmlSpacesWebViewSession.savedSpaceLastTapUptimeMs > 1500 ? "blocked_automatic" : "external_tap" : "blocked_assertion";
    }

    public static final InputStream selfClosingStream(SpacesDiskCache.CachedAssetStream cachedAssetStream) {
        return new C139131(cachedAssetStream, cachedAssetStream.stream);
    }

    public static final int toDefaultPort(String str) {
        if (C60O.A1X(str, "https://")) {
            return 443;
        }
        return str.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) ? 80 : -1;
    }

    public static final InputStream webViewBody(HatchHttpResponseStream hatchHttpResponseStream, String str, String str2, SpacesDiskCache spacesDiskCache) {
        final boolean z;
        final long jIdentityContentLength;
        String strA0M;
        Long lA0s;
        if (hatchHttpResponseStream.statusCode == 206) {
            z = true;
            String strA0p = C60O.A0p(BV3.A00(29), hatchHttpResponseStream.headers);
            jIdentityContentLength = (strA0p == null || (strA0M = C7BY.A0M(strA0p)) == null || (lA0s = C9tI.A0s(strA0M)) == null) ? -1L : lA0s.longValue();
        } else {
            z = false;
            jIdentityContentLength = HatchHttpClientKt.identityContentLength(hatchHttpResponseStream);
        }
        return new FilterInputStream(cachingBody(hatchHttpResponseStream, str, str2, spacesDiskCache)) { // from class: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt.webViewBody.1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                long j = jIdentityContentLength;
                if (j < 0) {
                    return super.available();
                }
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (int) j;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                int i;
                if (j <= 0) {
                    return 0L;
                }
                if (z) {
                    return j;
                }
                int iMin = (int) Math.min(j, 8192L);
                byte[] bArr = new byte[iMin];
                long j2 = j;
                while (j2 > 0 && (i = read(bArr, 0, (int) Math.min(j2, iMin))) >= 0) {
                    j2 -= i;
                }
                return j - j2;
            }
        };
    }

    public static final String buildSpacesBootstrapScript(String str) {
        return C6tn.A05(FGI.A0U("\n      (function() {\n        try {\n          if (window.__fwaSpacesAuthPatched) {\n            return true;\n          }\n          window.__fwaSpacesAuthPatched = true;\n\n          var spacesRoutePrefix = ", toJsStringLiteral(str), ";\n          var nestedSpaceEndpoints = {\n            \"action\": true,\n            \"actions\": true,\n            \"activities\": true,\n            \"activities_stream\": true,\n            \"action_stream\": true\n          };\n\n          function resolveCurrentSpacePathPrefix() {\n            var currentPath = window.location.pathname || \"\";\n            if (currentPath.indexOf(spacesRoutePrefix) !== 0) {\n              return null;\n            }\n\n            var relativePath = currentPath.slice(spacesRoutePrefix.length);\n            var slashIndex = relativePath.indexOf(\"/\");\n            if (slashIndex <= 0) {\n              return null;\n            }\n\n            return spacesRoutePrefix + relativePath.slice(0, slashIndex + 1);\n          }\n\n          function rewriteSpacesUrl(urlLike) {\n            if (!urlLike) {\n              return urlLike;\n            }\n\n            var url;\n            try {\n              url = new URL(String(urlLike), window.location.href);\n            } catch (e) {\n              return urlLike;\n            }\n\n            if (url.origin !== window.location.origin) {\n              return urlLike;\n            }\n\n            if (!url.pathname || url.pathname.indexOf(spacesRoutePrefix) !== 0) {\n              return urlLike;\n            }\n\n            var currentSpacePathPrefix = resolveCurrentSpacePathPrefix();\n            var relativePath = url.pathname.slice(spacesRoutePrefix.length);\n            if (\n              currentSpacePathPrefix &&\n              url.pathname.indexOf(currentSpacePathPrefix) !== 0 &&\n              relativePath &&\n              relativePath.indexOf(\"/\") === -1 &&\n              nestedSpaceEndpoints[relativePath]\n            ) {\n              url.pathname = currentSpacePathPrefix + relativePath;\n            }\n\n            return url.toString();\n          }\n\n          function isSpacesOriginUrl(urlLike) {\n            try {\n              var u = new URL(String(urlLike), window.location.href);\n              return u.origin === window.location.origin &&\n                     u.pathname &&\n                     u.pathname.indexOf(spacesRoutePrefix) === 0;\n            } catch (e) { return false; }\n          }\n\n          // Non-GET Spaces-origin requests (POST/PUT/PATCH/DELETE \u2014 e.g. /actions,\n          // /actions_stream) can't ride the native GET-only shouldInterceptRequest proxy, so they\n          // are forwarded to the SpacesActionResponseBridge, which runs them over the VM_JWT\n          // transport (Noise). Sending them from the WebView directly would reach the VM through\n          // nginx/authd. GET/HEAD stay on the native proxy.\n          window.__fwaSpacesActionResolvers = window.__fwaSpacesActionResolvers || {};\n          window.__fwaSpacesReqSeq = window.__fwaSpacesReqSeq || 0;\n\n          function __fwaB64ToBytes(b64) {\n            var bin = atob(b64 || \"\");\n            var len = bin.length;\n            var bytes = new Uint8Array(len);\n            for (var i = 0; i < len; i++) bytes[i] = bin.charCodeAt(i);\n            return bytes;\n          }\n\n          function __fwaBytesToB64(bytes) {\n            var bin = \"\";\n            var CHUNK = 0x8000;\n            for (var i = 0; i < bytes.length; i += CHUNK) {\n              bin += String.fromCharCode.apply(null, bytes.subarray(i, i + CHUNK));\n            }\n            return btoa(bin);\n          }\n\n          window.__fwaSpacesResolveAction = function(id, status, statusText, headersJson, bodyB64, ok, isError) {\n            var pending = window.__fwaSpacesActionResolvers[id];\n            if (!pending) return;\n            delete window.__fwaSpacesActionResolvers[id];\n            if (isError) {\n              pending.reject(new TypeError(\"Spaces bridge request failed\"));\n              return;\n            }\n            try {\n              var headers = {};\n              try {\n                var parsed = JSON.parse(headersJson || \"{}\");\n                for (var k in parsed) {\n                  if (Object.prototype.hasOwnProperty.call(parsed, k)) headers[k] = parsed[k];\n                }\n              } catch (e) {}\n              var resp = new Response(__fwaB64ToBytes(bodyB64), {\n                status: status,\n                statusText: statusText || \"\",\n                headers: headers,\n              });\n              pending.resolve(resp);\n            } catch (e) {\n              pending.reject(e);\n            }\n          };\n\n          function __fwaBridgeAvailable() {\n            return typeof _fwaSpacesActionResponse !== \"undefined\" &&\n              _fwaSpacesActionResponse &&\n              typeof _fwaSpacesActionResponse.sendRequest === \"function\";\n          }\n\n          function __fwaBlobViewerAvailable() {\n            return typeof _fwaSpacesBlobViewer !== \"undefined\" &&\n              _fwaSpacesBlobViewer &&\n              typeof _fwaSpacesBlobViewer.beginBlob === \"function\";\n          }\n\n          // A blob: URL is only resolvable in this document's context; a same-origin VM URL needs\n          // this WebView's auth (it 401s in an external browser). Both are resolved here \u2014 reading\n          // the bytes in-context \u2014 and handed to native, rather than forwarding the URL to a\n          // separate browser. Truly external URLs are left for the caller to open in WowBrowser.\n          function __fwaShouldViewNatively(urlLike) {\n            try {\n              if (String(urlLike).indexOf(\"blob:\") === 0) return true;\n              var u = new URL(String(urlLike), window.location.href);\n              return (u.protocol === \"http:\" || u.protocol === \"https:\") &&\n                u.origin === window.location.origin;\n            } catch (e) { return false; }\n          }\n\n          var __FWA_BLOB_CHUNK_BYTES = 1048576;\n\n          function __fwaStreamBlobToNative(blob, suggestedName) {\n            var bridgeToken = typeof __fbAndroidBridgeAuthToken !== \"undefined\" ? __fbAndroidBridgeAuthToken : \"\";\n            var mime = (blob && blob.type) ? blob.type : \"\";\n            var total = blob.size;\n            var transferId = _fwaSpacesBlobViewer.beginBlob(\n              bridgeToken, mime, suggestedName || \"\", total);\n            if (!transferId) return Promise.resolve();\n            var offset = 0;\n            function pump() {\n              if (offset >= total) {\n                _fwaSpacesBlobViewer.endBlob(bridgeToken, transferId);\n                return Promise.resolve();\n              }\n              var end = Math.min(offset + __FWA_BLOB_CHUNK_BYTES, total);\n              return blob.slice(offset, end).arrayBuffer().then(function(buf) {\n                if (!_fwaSpacesBlobViewer.writeBlobChunk(\n                      transferId, __fwaBytesToB64(new Uint8Array(buf)))) {\n                  return;\n                }\n                offset = end;\n                return pump();\n              });\n            }\n            return pump().catch(function(e) {\n              try { _fwaSpacesBlobViewer.abortBlob(transferId); } catch (e2) {}\n            });\n          }\n\n          function __fwaResolveAndViewNatively(url, suggestedName) {\n            try {\n              if (!__fwaBlobViewerAvailable()) return false;\n              fetch(url)\n                .then(function(r) { return r.blob(); })\n                .then(function(blob) { return __fwaStreamBlobToNative(blob, suggestedName); })\n                .catch(function(e) {});\n              return true;\n            } catch (e) { return false; }\n          }\n\n          function __fwaReadBody(rawBody) {\n            return new Promise(function(resolve) {\n              try {\n                if (rawBody == null) { resolve({payload: \"\", isB64: false}); return; }\n                if (typeof rawBody === \"string\") { resolve({payload: rawBody, isB64: false}); return; }\n                if (typeof URLSearchParams !== \"undefined\" && rawBody instanceof URLSearchParams) {\n                  resolve({payload: rawBody.toString(), isB64: false}); return;\n                }\n                if (typeof Blob !== \"undefined\" && rawBody instanceof Blob) {\n                  rawBody.arrayBuffer().then(function(buf) {\n                    resolve({payload: __fwaBytesToB64(new Uint8Array(buf)), isB64: true});\n                  }, function() { resolve({payload: \"\", isB64: false}); });\n                  return;\n                }\n                if (rawBody instanceof ArrayBuffer) {\n                  resolve({payload: __fwaBytesToB64(new Uint8Array(rawBody)), isB64: true}); return;\n                }\n                if (rawBody && rawBody.buffer instanceof ArrayBuffer) {\n                  resolve({payload: __fwaBytesToB64(new Uint8Array(rawBody.buffer)), isB64: true}); return;\n                }\n                resolve({payload: String(rawBody), isB64: false});\n              } catch (e) { resolve({payload: \"\", isB64: false}); }\n            });\n          }\n\n          function __fwaHeadersToObject(h) {\n            var obj = {};\n            try {\n              if (!h) return obj;\n              var hd = (typeof Headers !== \"undefined\" && h instanceof Headers) ? h : new Headers(h);\n              hd.forEach(function(v, k) { obj[k] = v; });\n            } catch (e) {}\n            return obj;\n          }\n\n          function __fwaBridgeSend(targetUrl, method, headersObj, rawBody) {\n            return __fwaReadBody(rawBody).then(function(bodyInfo) {\n              return new Promise(function(resolve, reject) {\n                if (!__fwaBridgeAvailable()) { reject(new TypeError(\"Spaces bridge unavailable\")); return; }\n                var requestId = \"\" + (++window.__fwaSpacesReqSeq);\n                window.__fwaSpacesActionResolvers[requestId] = {resolve: resolve, reject: reject};\n                var bridgeToken = typeof __fbAndroidBridgeAuthToken !== \"undefined\" ? __fbAndroidBridgeAuthToken : \"\";\n                try {\n                  _fwaSpacesActionResponse.sendRequest(\n                    bridgeToken, requestId, targetUrl, method,\n                    JSON.stringify(headersObj || {}), bodyInfo.payload, !!bodyInfo.isB64);\n                } catch (e) {\n                  delete window.__fwaSpacesActionResolvers[requestId];\n                  reject(e);\n                }\n              });\n            });\n          }\n\n          var originalFetch = window.fetch;\n          if (typeof originalFetch === \"function\") {\n            window.fetch = function(input, init) {\n              try {\n                var isReq = typeof Request !== \"undefined\" && input instanceof Request;\n                var method = ((init && init.method) || (isReq && input.method) || \"GET\").toUpperCase();\n                var targetUrl;\n                if (isReq) {\n                  var rewrittenRequestUrl = rewriteSpacesUrl(input.url);\n                  if (rewrittenRequestUrl !== input.url) {\n                    input = new Request(rewrittenRequestUrl, input);\n                  }\n                  targetUrl = input.url;\n                } else {\n                  input = rewriteSpacesUrl(input);\n                  targetUrl = input;\n                }\n                if (isSpacesOriginUrl(targetUrl) && method !== \"GET\" && method !== \"HEAD\" &&\n                    __fwaBridgeAvailable()) {\n                  var headersObj = {};\n                  if (isReq) headersObj = __fwaHeadersToObject(input.headers);\n                  if (init && init.headers) {\n                    var overlay = __fwaHeadersToObject(init.headers);\n                    for (var hk in overlay) headersObj[hk] = overlay[hk];\n                  }\n                  var rawBody = (init && \"body\" in init) ? init.body : null;\n                  if (rawBody == null && isReq) {\n                    return input.clone().arrayBuffer().then(function(buf) {\n                      var hasBody = buf && buf.byteLength > 0;\n                      return __fwaBridgeSend(targetUrl, method, headersObj, hasBody ? buf : null);\n                    });\n                  }\n                  return __fwaBridgeSend(targetUrl, method, headersObj, rawBody);\n                }\n              } catch (e) {}\n              return originalFetch.call(this, input, init);\n            };\n          }\n\n          function __fwaApplyXhrResponse(xhr, resp, buf) {\n            try {\n              var bytes = new Uint8Array(buf);\n              var text = new TextDecoder().decode(bytes);\n              var headerStr = \"\";\n              try { resp.headers.forEach(function(v, k) { headerStr += k + \": \" + v + \"\\r\\n\"; }); } catch (e) {}\n              Object.defineProperty(xhr, \"readyState\", {configurable: true, get: function() { return 4; }});\n              Object.defineProperty(xhr, \"status\", {configurable: true, get: function() { return resp.status; }});\n              Object.defineProperty(xhr, \"statusText\", {configurable: true, get: function() { return resp.statusText || \"\"; }});\n              Object.defineProperty(xhr, \"responseText\", {configurable: true, get: function() { return text; }});\n              Object.defineProperty(xhr, \"responseURL\", {configurable: true, get: function() { return resp.url || \"\"; }});\n              Object.defineProperty(xhr, \"response\", {configurable: true, get: function() {\n                var t = xhr.responseType;\n                if (t === \"arraybuffer\") return buf;\n                if (t === \"json\") { try { return JSON.parse(text); } catch (e) { return null; } }\n                return text;\n              }});\n              xhr.getAllResponseHeaders = function() { return headerStr; };\n              xhr.getResponseHeader = function(name) { try { return resp.headers.get(name); } catch (e) { return null; } };\n              __fwaFireXhr(xhr, false);\n            } catch (e) { __fwaApplyXhrError(xhr); }\n          }\n\n          function __fwaApplyXhrError(xhr) {\n            try {\n              Object.defineProperty(xhr, \"readyState\", {configurable: true, get: function() { return 4; }});\n              Object.defineProperty(xhr, \"status\", {configurable: true, get: function() { return 0; }});\n              __fwaFireXhr(xhr, true);\n            } catch (e) {}\n          }\n\n          function __fwaFireXhr(xhr, isError) {\n            try { if (typeof xhr.onreadystatechange === \"function\") xhr.onreadystatechange(); } catch (e) {}\n            try { xhr.dispatchEvent(new Event(\"readystatechange\")); } catch (e) {}\n            if (isError) {\n              try { if (typeof xhr.onerror === \"function\") xhr.onerror(new Event(\"error\")); } catch (e) {}\n              try { xhr.dispatchEvent(new Event(\"error\")); } catch (e) {}\n            } else {\n              try { if (typeof xhr.onload === \"function\") xhr.onload(new Event(\"load\")); } catch (e) {}\n              try { xhr.dispatchEvent(new Event(\"load\")); } catch (e) {}\n            }\n            try { if (typeof xhr.onloadend === \"function\") xhr.onloadend(new Event(\"loadend\")); } catch (e) {}\n            try { xhr.dispatchEvent(new Event(\"loadend\")); } catch (e) {}\n          }\n\n          if (typeof XMLHttpRequest !== \"undefined\" && XMLHttpRequest.prototype) {\n            var originalXhrOpen = XMLHttpRequest.prototype.open;\n            var originalXhrSend = XMLHttpRequest.prototype.send;\n            var originalXhrSetHeader = XMLHttpRequest.prototype.setRequestHeader;\n            XMLHttpRequest.prototype.open = function(method, url) {\n              var rewrittenUrl = rewriteSpacesUrl(url);\n              arguments[1] = rewrittenUrl;\n              var m = (method || \"GET\").toUpperCase();\n              this.__fwaSpacesMethod = m;\n              this.__fwaSpacesUrl = rewrittenUrl;\n              this.__fwaSpacesIsSpaces = isSpacesOriginUrl(rewrittenUrl);\n              this.__fwaSpacesReqHeaders = {};\n              this.__fwaSpacesBridge = this.__fwaSpacesIsSpaces && m !== \"GET\" && m !== \"HEAD\" &&\n                __fwaBridgeAvailable();\n              return originalXhrOpen.apply(this, arguments);\n            };\n            XMLHttpRequest.prototype.setRequestHeader = function(name, value) {\n              try { if (this.__fwaSpacesReqHeaders) this.__fwaSpacesReqHeaders[name] = value; } catch (e) {}\n              if (this.__fwaSpacesBridge) return;\n              return originalXhrSetHeader.apply(this, arguments);\n            };\n            XMLHttpRequest.prototype.send = function(body) {\n              var xhr = this;\n              if (xhr.__fwaSpacesBridge) {\n                __fwaBridgeSend(xhr.__fwaSpacesUrl, xhr.__fwaSpacesMethod, xhr.__fwaSpacesReqHeaders || {},\n                    body != null ? body : null)\n                  .then(function(resp) {\n                    return resp.arrayBuffer().then(function(buf) { __fwaApplyXhrResponse(xhr, resp, buf); });\n                  })\n                  .catch(function() { __fwaApplyXhrError(xhr); });\n                return;\n              }\n              return originalXhrSend.apply(this, arguments);\n            };\n            // Restore original `open` reference for callers that introspected it.\n            XMLHttpRequest.prototype.open.__fwaOriginal = originalXhrOpen;\n          }\n\n          function patchFormAction(form) {\n            if (!form || typeof form.action !== \"string\") {\n              return;\n            }\n            form.action = rewriteSpacesUrl(form.action);\n          }\n\n          if (typeof HTMLFormElement !== \"undefined\" && HTMLFormElement.prototype) {\n            var originalFormSubmit = HTMLFormElement.prototype.submit;\n            HTMLFormElement.prototype.submit = function() {\n              patchFormAction(this);\n              return originalFormSubmit.apply(this, arguments);\n            };\n\n            if (typeof HTMLFormElement.prototype.requestSubmit === \"function\") {\n              var originalRequestSubmit = HTMLFormElement.prototype.requestSubmit;\n              HTMLFormElement.prototype.requestSubmit = function() {\n                patchFormAction(this);\n                return originalRequestSubmit.apply(this, arguments);\n              };\n            }\n          }\n\n          document.addEventListener(\n            \"submit\",\n            function(event) {\n              patchFormAction(event.target);\n            },\n            true\n          );\n\n          document.addEventListener(\n            \"click\",\n            function(event) {\n              if (!event.target || typeof event.target.closest !== \"function\") {\n                return;\n              }\n              var anchor = event.target.closest(\"a[href]\");\n              if (!anchor || typeof anchor.href !== \"string\") {\n                try {\n                  var clickedText =\n                    event.target && typeof event.target.innerText === \"string\"\n                      ? String(event.target.innerText).trim()\n                      : \"\";\n                  if (/^(https?:\\/\\/|www\\.)\\S+$/i.test(clickedText)) {\n                    var bridgeToken = typeof __fbAndroidBridgeAuthToken !== 'undefined' ? __fbAndroidBridgeAuthToken : '';\n                    _fwaSpacesTouchBridge.onPlainTextUrlClick(bridgeToken, clickedText);\n                  }\n                } catch (e) {}\n                return;\n              }\n              var href = anchor.href;\n              var opensNewWindow = anchor.target === \"_blank\" ||\n                (typeof anchor.hasAttribute === \"function\" && anchor.hasAttribute(\"download\"));\n              if (__fwaBlobViewerAvailable() &&\n                  (href.indexOf(\"blob:\") === 0 ||\n                    (opensNewWindow && __fwaShouldViewNatively(href)))) {\n                event.preventDefault();\n                event.stopPropagation();\n                var dl = (typeof anchor.getAttribute === \"function\") ?\n                  (anchor.getAttribute(\"download\") || \"\") : \"\";\n                __fwaResolveAndViewNatively(href, dl);\n                return;\n              }\n              anchor.href = rewriteSpacesUrl(anchor.href);\n            },\n            true\n          );\n\n          if (typeof window.open === \"function\") {\n            var originalWindowOpen = window.open;\n            window.open = function(url) {\n              try {\n                if (typeof url === \"string\" && __fwaBlobViewerAvailable() &&\n                    __fwaShouldViewNatively(url)) {\n                  __fwaResolveAndViewNatively(url, \"\");\n                  return { closed: false, close: function(){}, focus: function(){},\n                    blur: function(){}, postMessage: function(){} };\n                }\n              } catch (e) {}\n              arguments[0] = rewriteSpacesUrl(url);\n              return originalWindowOpen.apply(window, arguments);\n            };\n          }\n\n          if (navigator && typeof navigator.sendBeacon === \"function\") {\n            var originalSendBeacon = navigator.sendBeacon.bind(navigator);\n            navigator.sendBeacon = function(url, data) {\n              return originalSendBeacon(rewriteSpacesUrl(url), data);\n            };\n          }\n\n          return true;\n        } catch (e) {\n          return false;\n        }\n      })();\n      "));
    }

    public static final InputStream cachingBody(HatchHttpResponseStream hatchHttpResponseStream, String str, String str2, SpacesDiskCache spacesDiskCache) {
        InputStream inputStreamSelfClosingBody = HatchHttpClientKt.selfClosingBody(hatchHttpResponseStream);
        return (spacesDiskCache == null || hatchHttpResponseStream.statusCode == 206) ? inputStreamSelfClosingBody : new FilterInputStream(inputStreamSelfClosingBody, spacesDiskCache, str, str2, HatchHttpClientKt.identityContentLength(hatchHttpResponseStream)) { // from class: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt.cachingBody.1
            public final /* synthetic */ long $expectedBytes;
            public final /* synthetic */ String $url;
            public long bytesWritten;
            public SpacesDiskCache.AssetWriter writer;

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    super.close();
                } finally {
                    abandon(null);
                }
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                SpacesDiskCache.AssetWriter assetWriter;
                C7384Etj.A0Y(bArr, 0);
                int i3 = super.read(bArr, i, i2);
                if (i3 < 0) {
                    commit();
                } else if (i3 > 0 && (assetWriter = this.writer) != null) {
                    try {
                        assetWriter.write(bArr, i, i3);
                        this.bytesWritten += i3;
                        return i3;
                    } catch (IOException e) {
                        abandon(e);
                        return i3;
                    }
                }
                return i3;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                abandon(null);
                return super.skip(j);
            }

            {
                Object objA0s;
                this.$url = str;
                this.$expectedBytes = j;
                try {
                    objA0s = spacesDiskCache.openWriter(str, str2);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 != null) {
                    CFK.A06(C60N.A00(17), FGI.A0d("Spaces cache open failed for ", str, ": ", thA00.getMessage()));
                }
                this.writer = (SpacesDiskCache.AssetWriter) (objA0s instanceof C10571Hud ? null : objA0s);
            }

            private final void abandon(IOException iOException) {
                SpacesDiskCache.AssetWriter assetWriter = this.writer;
                if (assetWriter != null) {
                    this.writer = null;
                    assetWriter.close();
                    if (iOException != null) {
                        CFK.A06(C60N.A00(17), FGI.A0d("Spaces cache write failed for ", this.$url, ": ", iOException.getMessage()));
                    }
                }
            }

            private final void commit() {
                SpacesDiskCache.AssetWriter assetWriter = this.writer;
                if (assetWriter != null) {
                    this.writer = null;
                    long j = this.$expectedBytes;
                    long j2 = this.bytesWritten;
                    if (j < 0 ? j2 <= 0 : j2 != j) {
                        assetWriter.close();
                    } else {
                        assetWriter.commit();
                    }
                }
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public boolean markSupported() {
                return false;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                int i = super.read();
                if (i < 0) {
                    commit();
                } else {
                    SpacesDiskCache.AssetWriter assetWriter = this.writer;
                    if (assetWriter != null) {
                        try {
                            assetWriter.write(i);
                            this.bytesWritten = 1 + this.bytesWritten;
                            return i;
                        } catch (IOException e) {
                            abandon(e);
                            return i;
                        }
                    }
                }
                return i;
            }
        };
    }

    public static final String injectEnvCss(String str, String str2) {
        StringBuilder sbA0w;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        int iA0B = C7BY.A0B(str, "<head>", zA1b ? 1 : 0, zA1b);
        if (iA0B >= 0) {
            int i = iA0B + 6;
            String strSubstring = str.substring(zA1b ? 1 : 0, i);
            str = str.substring(i);
            sbA0w = C3cG.A0g(strSubstring);
        } else {
            sbA0w = C60O.A0w();
        }
        return C60P.A1M(str2, str, sbA0w);
    }

    public static final void injectSafeAreaInsets(WebView webView, HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
        AnonymousClass003.A0u(webView, htmlSpacesWebViewSession);
        float f = htmlSpacesWebViewSession.safeAreaInsetTopDp;
        float f2 = htmlSpacesWebViewSession.safeAreaInsetBottomDp;
        float f3 = htmlSpacesWebViewSession.safeAreaInsetAppBottomDp;
        StringBuilder sbA0x = C60O.A0x("\n      (function(){\n        var s = document.documentElement.style;\n        s.setProperty('--safe-area-inset-top', '");
        sbA0x.append(f);
        sbA0x.append("px');\n        s.setProperty('--safe-area-inset-bottom', '");
        sbA0x.append(f2);
        sbA0x.append("px');\n        s.setProperty('--safe-area-inset-left', '0px');\n        s.setProperty('--safe-area-inset-right', '0px');\n        s.setProperty('--app-safe-area-inset-bottom', '");
        sbA0x.append(f3);
        sbA0x.append("px');\n        s.setProperty('--twsa-safe-area-inset-top', '");
        sbA0x.append(f);
        sbA0x.append("px');\n        s.setProperty('--twsa-safe-area-inset-bottom', '");
        sbA0x.append(f3);
        webView.evaluateJavascript(C6tn.A05(AnonymousClass001.A0v("px');\n        s.setProperty('--twsa-safe-area-inset-left', '0px');\n        s.setProperty('--twsa-safe-area-inset-right', '0px');\n      })();\n      ", sbA0x)), null);
    }

    public static final void injectSpacesBootstrap(WebView webView, String str) {
        webView.evaluateJavascript(buildSpacesBootstrapScript(str), null);
    }

    public static final boolean isCacheFirstRequest(WebResourceRequest webResourceRequest) {
        String method = webResourceRequest.getMethod();
        C7384Etj.A0U(method);
        Locale locale = Locale.US;
        C7384Etj.A0V(locale);
        if (!method.toUpperCase(locale).equals(TigonRequest.GET)) {
            return false;
        }
        Set<String> setKeySet = webResourceRequest.getRequestHeaders().keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (strA0j != null && strA0j.equalsIgnoreCase(CachingHatchHttpClientKt.RANGE_HEADER)) {
                    return false;
                }
            }
        }
        if (webResourceRequest.isForMainFrame()) {
            return true;
        }
        String lastPathSegment = webResourceRequest.getUrl().getLastPathSegment();
        if (lastPathSegment != null) {
            return STATIC_ASSET_REGEX.A07(lastPathSegment);
        }
        return false;
    }

    public static final boolean isFingerprintedAsset(Uri uri) {
        C06847l8 c06847l8A01;
        List<String> listAG1;
        String strA0n;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && (c06847l8A01 = C06827l3.A01(lastPathSegment, FINGERPRINTED_ASSET_REGEX)) != null && (listAG1 = c06847l8A01.AG1()) != null && (strA0n = C60Q.A0n(listAG1, 1)) != null) {
            for (int i = 0; i < strA0n.length(); i++) {
                if (Character.isDigit(strA0n.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
    
        if (r8.equals("") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0163, code lost:
    
        if (r8.equals(com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt.ROOT_PATH) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0165, code lost:
    
        r2 = "root";
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060 A[PHI: r2
  0x0060: PHI (r2v6 java.lang.String) = 
  (r2v1 java.lang.String)
  (r2v7 java.lang.String)
  (r2v8 java.lang.String)
  (r2v9 java.lang.String)
  (r2v10 java.lang.String)
  (r2v11 java.lang.String)
  (r2v12 java.lang.String)
 binds: [B:74:0x0159, B:65:0x013e, B:62:0x0132, B:78:0x0165, B:59:0x0126, B:56:0x011a, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079 A[PHI: r2
  0x0079: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String), (r2v6 java.lang.String) binds: [B:74:0x0159, B:35:0x0064, B:40:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c A[PHI: r0 r2
  0x007c: PHI (r0v20 boolean) = (r0v10 boolean), (r0v25 boolean) binds: [B:42:0x007a, B:40:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r2v5 java.lang.String) = (r2v3 java.lang.String), (r2v6 java.lang.String) binds: [B:42:0x007a, B:40:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f A[PHI: r4
  0x014f: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v0 java.lang.String), (r4v9 java.lang.String) binds: [B:15:0x002b, B:69:0x014c, B:70:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void logSavedSpaceEvent(com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r11, android.webkit.WebView r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt.logSavedSpaceEvent(com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession, android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final boolean shouldProxyAuthenticatedSpaceRequest(Uri uri, String str) {
        Object objA0s;
        String path;
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equals(AuraDeeplinkHandlerActivity.HTTP) || scheme.equals("https"))) {
            try {
                objA0s = C7Je.A01(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            Uri uri2 = (Uri) objA0s;
            if (uri2 != null && C7384Etj.areEqual(uri.getScheme(), uri2.getScheme()) && C60R.A1S(uri, uri2)) {
                if ((uri.getPort() == -1 ? toDefaultPort(C60O.A0o(uri)) : uri.getPort()) == (uri2.getPort() == -1 ? toDefaultPort(str) : uri2.getPort()) && (path = uri.getPath()) != null) {
                    String strSpacesRoutePrefixFor = SpacesWebViewSessionKt.spacesRoutePrefixFor(str);
                    C7384Etj.A0Y(strSpacesRoutePrefixFor, 1);
                    if (path.startsWith(strSpacesRoutePrefixFor)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
