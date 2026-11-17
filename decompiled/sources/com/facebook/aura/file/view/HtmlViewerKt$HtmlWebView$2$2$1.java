package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.webview.NestableSecureWebView;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import java.util.WeakHashMap;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$2$2$1 extends AbstractC7559F3s implements G0U<NestableSecureWebView, Unit> {
    public final /* synthetic */ WeakHashMap<WebView, HtmlWebViewLoadedContent> $loadedContentByWebView;
    public final /* synthetic */ MutableState<WebView> $sampledWebView$delegate;
    public final /* synthetic */ HtmlSecureWebViewRef $secureWebViewRef;
    public final /* synthetic */ HtmlRenderTraceRef $traceRef;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NestableSecureWebView nestableSecureWebView) {
        C7384Etj.A0Y(nestableSecureWebView, 0);
        if (this.$sampledWebView$delegate.getValue() == nestableSecureWebView) {
            this.$sampledWebView$delegate.Af8(null);
        }
        if (this.$secureWebViewRef.webView == nestableSecureWebView) {
            this.$secureWebViewRef.webView = null;
        }
        HatchHtmlRenderTrace hatchHtmlRenderTrace = this.$traceRef.trace;
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.cancelled();
        }
        this.$traceRef.trace = null;
        this.$loadedContentByWebView.remove(nestableSecureWebView);
        nestableSecureWebView.removeJavascriptInterface(AuraHtmlHostBridgeKt.HATCH_HTML_HOST_NATIVE_BRIDGE_NAME);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlViewerKt$HtmlWebView$2$2$1(HtmlSecureWebViewRef htmlSecureWebViewRef, HtmlRenderTraceRef htmlRenderTraceRef, WeakHashMap<WebView, HtmlWebViewLoadedContent> weakHashMap, MutableState<WebView> mutableState) {
        super(1);
        this.$secureWebViewRef = htmlSecureWebViewRef;
        this.$traceRef = htmlRenderTraceRef;
        this.$loadedContentByWebView = weakHashMap;
        this.$sampledWebView$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NestableSecureWebView nestableSecureWebView) {
        invoke2(nestableSecureWebView);
        return Unit.INSTANCE;
    }
}
