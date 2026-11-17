package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchWebViewKt$WebView$13$1 extends AbstractC7559F3s implements G0U<Context, ViewGroup> {
    public final /* synthetic */ boolean $applyFrameLayoutWorkaround;
    public final /* synthetic */ AccompanistWebChromeClient $chromeClient;
    public final /* synthetic */ AccompanistWebViewClient $client;
    public final /* synthetic */ G0U<Context, WebView> $factory;
    public final /* synthetic */ boolean $javaScriptEnabled;
    public final /* synthetic */ FrameLayout.LayoutParams $layoutParams;
    public final /* synthetic */ G0U<WebView, Unit> $onCreated;
    public final /* synthetic */ WebViewState $state;

    @Override // X.G0U
    public final ViewGroup invoke(Context context) {
        WebView webView;
        C7384Etj.A0Y(context, 0);
        G0U<Context, WebView> g0u = this.$factory;
        if (g0u == null || (webView = g0u.invoke(context)) == null) {
            webView = new WebView(context);
            FrameLayout.LayoutParams layoutParams = this.$layoutParams;
            AccompanistWebChromeClient accompanistWebChromeClient = this.$chromeClient;
            AccompanistWebViewClient accompanistWebViewClient = this.$client;
            boolean z = this.$javaScriptEnabled;
            webView.setLayoutParams(layoutParams);
            webView.setWebChromeClient(accompanistWebChromeClient);
            webView.setWebViewClient(accompanistWebViewClient);
            webView.getSettings().setJavaScriptEnabled(z);
        }
        G0U<WebView, Unit> g0u2 = this.$onCreated;
        WebViewState webViewState = this.$state;
        webView.setTag(HatchWebViewKt.WEBVIEW_TAG);
        g0u2.invoke(webView);
        Bundle bundle = webViewState.viewState;
        if (bundle != null) {
            webView.restoreState(bundle);
        }
        this.$state.setWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview(webView);
        if (!this.$applyFrameLayoutWorkaround) {
            return webView;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(webView);
        return frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchWebViewKt$WebView$13$1(G0U<? super Context, ? extends WebView> g0u, boolean z, FrameLayout.LayoutParams layoutParams, AccompanistWebChromeClient accompanistWebChromeClient, AccompanistWebViewClient accompanistWebViewClient, boolean z2, G0U<? super WebView, Unit> g0u2, WebViewState webViewState) {
        super(1);
        this.$factory = g0u;
        this.$applyFrameLayoutWorkaround = z;
        this.$layoutParams = layoutParams;
        this.$chromeClient = accompanistWebChromeClient;
        this.$client = accompanistWebViewClient;
        this.$javaScriptEnabled = z2;
        this.$onCreated = g0u2;
        this.$state = webViewState;
    }
}
