package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.webkit.WebView;
import com.facebook.aura.webview.NestableSecureWebView;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.util.WeakHashMap;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$2$3$1 extends AbstractC7559F3s implements G0U<NestableSecureWebView, Unit> {
    public final /* synthetic */ boolean $isSlideMode;
    public final /* synthetic */ HtmlWebViewLoadedContent $loadedContent;
    public final /* synthetic */ WeakHashMap<WebView, HtmlWebViewLoadedContent> $loadedContentByWebView;
    public final /* synthetic */ HatchHtmlSurface $surface;
    public final /* synthetic */ HtmlRenderTraceRef $traceRef;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NestableSecureWebView nestableSecureWebView) {
        C7384Etj.A0Y(nestableSecureWebView, 0);
        if (this.$isSlideMode) {
            HtmlViewerKt.configureHtmlSlideWebView(nestableSecureWebView);
        } else {
            HtmlViewerKt.configureHtmlContentWebView(nestableSecureWebView);
        }
        if (C7384Etj.areEqual(this.$loadedContentByWebView.get(nestableSecureWebView), this.$loadedContent)) {
            return;
        }
        this.$loadedContentByWebView.put(nestableSecureWebView, this.$loadedContent);
        HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$traceRef.trace;
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.cancelled();
        }
        this.$traceRef.trace = HatchHtmlDiagnostics.INSTANCE.startRender(this.$surface, null, this.$loadedContent.baseUrl);
        nestableSecureWebView.loadUrl(this.$loadedContent.baseUrl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlViewerKt$HtmlWebView$2$3$1(boolean z, WeakHashMap<WebView, HtmlWebViewLoadedContent> weakHashMap, HtmlWebViewLoadedContent htmlWebViewLoadedContent, HtmlRenderTraceRef htmlRenderTraceRef, HatchHtmlSurface hatchHtmlSurface) {
        super(1);
        this.$isSlideMode = z;
        this.$loadedContentByWebView = weakHashMap;
        this.$loadedContent = htmlWebViewLoadedContent;
        this.$traceRef = htmlRenderTraceRef;
        this.$surface = hatchHtmlSurface;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NestableSecureWebView nestableSecureWebView) {
        invoke2(nestableSecureWebView);
        return Unit.INSTANCE;
    }
}
