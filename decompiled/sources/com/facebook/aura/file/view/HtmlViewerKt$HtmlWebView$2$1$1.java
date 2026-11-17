package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.webview.NestableSecureWebView;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$2$1$1 extends AbstractC7559F3s implements G0U<Context, NestableSecureWebView> {
    public final /* synthetic */ HtmlViewerKt$HtmlWebView$chromeClient$1$1 $chromeClient;
    public final /* synthetic */ HtmlViewerKt$HtmlWebView$client$1$1 $client;
    public final /* synthetic */ AuraHtmlHostBridge $hostBridge;
    public final /* synthetic */ MutableState<WebView> $sampledWebView$delegate;
    public final /* synthetic */ HtmlSecureWebViewRef $secureWebViewRef;

    @Override // X.G0U
    public final NestableSecureWebView invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        NestableSecureWebView nestableSecureWebView = new NestableSecureWebView(context, null, R.attr.webViewStyle);
        HtmlSecureWebViewRef htmlSecureWebViewRef = this.$secureWebViewRef;
        HtmlViewerKt$HtmlWebView$chromeClient$1$1 htmlViewerKt$HtmlWebView$chromeClient$1$1 = this.$chromeClient;
        HtmlViewerKt$HtmlWebView$client$1$1 htmlViewerKt$HtmlWebView$client$1$1 = this.$client;
        AuraHtmlHostBridge auraHtmlHostBridge = this.$hostBridge;
        MutableState<WebView> mutableState = this.$sampledWebView$delegate;
        nestableSecureWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        htmlSecureWebViewRef.webView = nestableSecureWebView;
        mutableState.Af8(nestableSecureWebView);
        nestableSecureWebView.getSettings().setJavaScriptEnabled(true);
        nestableSecureWebView.getSettings().setSupportMultipleWindows(true);
        nestableSecureWebView.enableSecureJsBridge(true);
        nestableSecureWebView.setWebChromeClient(htmlViewerKt$HtmlWebView$chromeClient$1$1);
        nestableSecureWebView.setWebViewClient(htmlViewerKt$HtmlWebView$client$1$1);
        nestableSecureWebView.addJavascriptInterface(auraHtmlHostBridge, AuraHtmlHostBridgeKt.HATCH_HTML_HOST_NATIVE_BRIDGE_NAME);
        return nestableSecureWebView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlViewerKt$HtmlWebView$2$1$1(HtmlSecureWebViewRef htmlSecureWebViewRef, HtmlViewerKt$HtmlWebView$chromeClient$1$1 htmlViewerKt$HtmlWebView$chromeClient$1$1, HtmlViewerKt$HtmlWebView$client$1$1 htmlViewerKt$HtmlWebView$client$1$1, AuraHtmlHostBridge auraHtmlHostBridge, MutableState<WebView> mutableState) {
        super(1);
        this.$secureWebViewRef = htmlSecureWebViewRef;
        this.$chromeClient = htmlViewerKt$HtmlWebView$chromeClient$1$1;
        this.$client = htmlViewerKt$HtmlWebView$client$1$1;
        this.$hostBridge = auraHtmlHostBridge;
        this.$sampledWebView$delegate = mutableState;
    }
}
