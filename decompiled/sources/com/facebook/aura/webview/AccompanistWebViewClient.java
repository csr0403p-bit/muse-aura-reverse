package com.facebook.aura.webview;

import X.C7384Etj;
import X.F60;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.webview.LoadingState;

/* loaded from: classes3.dex */
public class AccompanistWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    public WebViewNavigator navigator;
    public WebViewState state;

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C7384Etj.A0Y(webView, 0);
        super.doUpdateVisitedHistory(webView, str, z);
        getNavigator().setCanGoBack$fbandroid_express_aura_java_com_facebook_aura_webview_webview(webView.canGoBack());
        getNavigator().setCanGoForward$fbandroid_express_aura_java_com_facebook_aura_webview_webview(webView.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        C7384Etj.A0Y(webView, 0);
        super.onPageFinished(webView, str);
        getState().setLoadingState$fbandroid_express_aura_java_com_facebook_aura_webview_webview(LoadingState.Finished.INSTANCE);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C7384Etj.A0Y(webView, 0);
        super.onPageStarted(webView, str, bitmap);
        getState().setLoadingState$fbandroid_express_aura_java_com_facebook_aura_webview_webview(new LoadingState.Loading(0.0f));
        getState().errorsForCurrentRequest.clear();
        getState().setPageTitle$fbandroid_express_aura_java_com_facebook_aura_webview_webview(null);
        getState().setPageIcon$fbandroid_express_aura_java_com_facebook_aura_webview_webview(null);
        getState().setLastLoadedUrl$fbandroid_express_aura_java_com_facebook_aura_webview_webview(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C7384Etj.A0Y(webView, 0);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            if (getState().errorsForCurrentRequest.size() >= 20) {
                getState().errorsForCurrentRequest.remove(0);
            }
            getState().errorsForCurrentRequest.add(new WebViewError(webResourceRequest, webResourceError));
        }
    }

    public void setNavigator$fbandroid_express_aura_java_com_facebook_aura_webview_webview(WebViewNavigator webViewNavigator) {
        C7384Etj.A0Y(webViewNavigator, 0);
        this.navigator = webViewNavigator;
    }

    public void setState$fbandroid_express_aura_java_com_facebook_aura_webview_webview(WebViewState webViewState) {
        C7384Etj.A0Y(webViewState, 0);
        this.state = webViewState;
    }

    public WebViewNavigator getNavigator() {
        WebViewNavigator webViewNavigator = this.navigator;
        if (webViewNavigator != null) {
            return webViewNavigator;
        }
        C7384Etj.A0b("navigator");
        throw F60.createAndThrow();
    }

    public WebViewState getState() {
        WebViewState webViewState = this.state;
        if (webViewState != null) {
            return webViewState;
        }
        C7384Etj.A0b("state");
        throw F60.createAndThrow();
    }
}
