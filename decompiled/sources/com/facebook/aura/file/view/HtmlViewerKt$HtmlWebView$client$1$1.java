package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C1BO;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C6tA;
import X.C6tB;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.facebook.aura.file.utils.HtmlPreviewIsolation;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionType;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.io.ByteArrayInputStream;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$client$1$1 extends C6tA implements C6tB {
    public final /* synthetic */ C1BO<HtmlWebViewLoadedContent> $currentLoadedContent;
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentSetPageLoaded;
    public final /* synthetic */ C1BO<AbstractC3358CGz> $currentUserSession;
    public final /* synthetic */ HatchHtmlSurface $surface;
    public final /* synthetic */ HtmlRenderTraceRef $traceRef;

    @Override // X.C6tB
    public boolean doAdditionalShouldOverrideUrlLoading(WebView webView, String str) {
        boolean zA1a = AnonymousClass002.A1a(webView, str);
        if (HtmlViewerKt.isSameOrigin(str, this.$currentLoadedContent.getValue().baseUrl)) {
            return false;
        }
        C60R.A0z(webView, HatchHtmlDiagnostics.INSTANCE.startAction(this.$surface, HatchHtmlActionType.LINK_TAP, str), str);
        return zA1a;
    }

    @Override // X.C6tA
    public void onPageFinished(WebView webView, String str) {
        C7384Etj.A0Y(webView, 0);
        super.onPageFinished(webView, str);
        AnonymousClass001.A1K(true, C1BO.A0B(this.$currentSetPageLoaded));
        HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$traceRef.trace;
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.finished();
        }
    }

    @Override // X.C6tA
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C7384Etj.A0Y(webView, 0);
        super.onPageStarted(webView, str, bitmap);
        AnonymousClass001.A1K(false, C1BO.A0B(this.$currentSetPageLoaded));
        HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$traceRef.trace;
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.committed();
        }
    }

    @Override // X.C6tA
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C7384Etj.A0Y(renderProcessGoneDetail, 1);
        HatchHtmlDiagnostics.INSTANCE.reportRenderFailure(this.$surface, this.$traceRef.trace, renderProcessGoneDetail.didCrash() ? HatchHtmlErrorCode.RENDERER_CRASHED : HatchHtmlErrorCode.RENDERER_GONE, null, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HtmlViewerKt$HtmlWebView$client$1$1(C1BO<HtmlWebViewLoadedContent> c1bo, C1BO<? extends AbstractC3358CGz> c1bo2, HtmlRenderTraceRef htmlRenderTraceRef, C1BO<? extends G0U<? super Boolean, Unit>> c1bo3, HatchHtmlSurface hatchHtmlSurface) {
        this.$currentLoadedContent = c1bo;
        this.$currentUserSession = c1bo2;
        this.$traceRef = htmlRenderTraceRef;
        this.$currentSetPageLoaded = c1bo3;
        this.$surface = hatchHtmlSurface;
    }

    @Override // X.C6tA
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
            HatchHtmlDiagnostics.INSTANCE.reportRenderFailure(this.$surface, this.$traceRef.trace, HatchHtmlErrorCode.NET_ERROR, strA0y, null);
            return;
        }
        HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$traceRef.trace;
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.resourceError(HatchHtmlErrorCode.NET_ERROR, strA0y, null, null);
        }
    }

    @Override // X.C6tA
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AnonymousClass005.A0x(webView, webResourceRequest, webResourceResponse);
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strA0y = AnonymousClass006.A0y(webResourceRequest.getUrl(), " url=", C60O.A0y("status=", webResourceResponse.getStatusCode()));
        if (webResourceRequest.isForMainFrame()) {
            HatchHtmlDiagnostics.INSTANCE.reportRenderFailure(this.$surface, this.$traceRef.trace, HatchHtmlErrorCode.HTTP_ERROR, strA0y, null);
            return;
        }
        HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$traceRef.trace;
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.resourceError(HatchHtmlErrorCode.HTTP_ERROR, strA0y, null, Integer.valueOf(webResourceResponse.getStatusCode()));
        }
    }

    @Override // X.C6tA
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String strSourceTreeMediaPath;
        AnonymousClass003.A0u(webView, webResourceRequest);
        HtmlWebViewLoadedContent value = this.$currentLoadedContent.getValue();
        if (webResourceRequest.isForMainFrame() && C7384Etj.areEqual(C60Q.A0d(webResourceRequest), value.baseUrl)) {
            return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(C3cG.A1S(value.html)));
        }
        HtmlPreviewIsolation htmlPreviewIsolation = HtmlPreviewIsolation.INSTANCE;
        boolean zIsEnabled = htmlPreviewIsolation.isEnabled();
        if (!zIsEnabled || !webResourceRequest.isForMainFrame() || htmlPreviewIsolation.isLocalScheme(C60Q.A0A(webResourceRequest))) {
            String strHatchHtmlAssetPath = HtmlViewerKt.hatchHtmlAssetPath(C60Q.A0A(webResourceRequest));
            if (strHatchHtmlAssetPath == null) {
                return this.mWebViewClientFallback.shouldInterceptRequest(webView, webResourceRequest);
            }
            if (!zIsEnabled) {
                return HtmlViewerKt.fetchHtmlAsset(strHatchHtmlAssetPath, this.$currentUserSession.getValue(), this.$traceRef.trace);
            }
            String str = value.sourcePath;
            if (str != null && (strSourceTreeMediaPath = htmlPreviewIsolation.sourceTreeMediaPath(strHatchHtmlAssetPath, str)) != null) {
                WebResourceResponse webResourceResponseFetchHtmlAsset = HtmlViewerKt.fetchHtmlAsset(strSourceTreeMediaPath, this.$currentUserSession.getValue(), this.$traceRef.trace);
                if (webResourceResponseFetchHtmlAsset != null) {
                    return webResourceResponseFetchHtmlAsset;
                }
            }
        }
        return htmlPreviewIsolation.forbiddenResponse();
    }

    @Override // X.C6tB
    public /* synthetic */ boolean doAdditionalShouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return doAdditionalShouldOverrideUrlLoading(webView, C60Q.A0d(webResourceRequest));
    }
}
