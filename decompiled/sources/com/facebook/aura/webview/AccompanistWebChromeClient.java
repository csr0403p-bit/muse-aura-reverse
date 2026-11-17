package com.facebook.aura.webview;

import X.C7384Etj;
import X.F60;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.facebook.aura.webview.LoadingState;

/* loaded from: classes3.dex */
public class AccompanistWebChromeClient extends WebChromeClient {
    public static final int $stable = 8;
    public WebViewState state;

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        C7384Etj.A0Y(webView, 0);
        super.onProgressChanged(webView, i);
        if (getState().getLoadingState() instanceof LoadingState.Finished) {
            return;
        }
        getState().setLoadingState$fbandroid_express_aura_java_com_facebook_aura_webview_webview(new LoadingState.Loading(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        C7384Etj.A0Y(webView, 0);
        super.onReceivedIcon(webView, bitmap);
        getState().setPageIcon$fbandroid_express_aura_java_com_facebook_aura_webview_webview(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        C7384Etj.A0Y(webView, 0);
        super.onReceivedTitle(webView, str);
        getState().setPageTitle$fbandroid_express_aura_java_com_facebook_aura_webview_webview(str);
    }

    public void setState$fbandroid_express_aura_java_com_facebook_aura_webview_webview(WebViewState webViewState) {
        C7384Etj.A0Y(webViewState, 0);
        this.state = webViewState;
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
