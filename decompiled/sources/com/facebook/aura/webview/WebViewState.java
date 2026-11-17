package com.facebook.aura.webview;

import X.AGE;
import X.AGF;
import X.C3cG;
import X.C7384Etj;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.webview.LoadingState;

/* loaded from: classes3.dex */
public final class WebViewState {
    public static final int $stable = 0;
    public final MutableState content$delegate;
    public final SnapshotStateList<WebViewError> errorsForCurrentRequest;
    public final MutableState lastLoadedUrl$delegate;
    public final MutableState loadingState$delegate;
    public final MutableState pageIcon$delegate;
    public final MutableState pageTitle$delegate;
    public Bundle viewState;
    public final MutableState webView$delegate;

    public WebViewState(WebContent webContent) {
        C7384Etj.A0Y(webContent, 0);
        AGE ageA01 = AGF.A01();
        this.lastLoadedUrl$delegate = C3cG.A08(ageA01, null);
        this.content$delegate = C3cG.A08(ageA01, webContent);
        this.loadingState$delegate = C3cG.A08(ageA01, LoadingState.Initializing.INSTANCE);
        this.pageTitle$delegate = C3cG.A08(ageA01, null);
        this.pageIcon$delegate = C3cG.A08(ageA01, null);
        this.errorsForCurrentRequest = new SnapshotStateList();
        this.webView$delegate = C3cG.A08(ageA01, null);
    }

    public final void releaseWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        if (getWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview() == webView) {
            setWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview(null);
            setPageIcon$fbandroid_express_aura_java_com_facebook_aura_webview_webview(null);
            this.errorsForCurrentRequest.clear();
        }
    }

    public final void setContent(WebContent webContent) {
        C7384Etj.A0Y(webContent, 0);
        this.content$delegate.Af8(webContent);
    }

    public final void setLoadingState$fbandroid_express_aura_java_com_facebook_aura_webview_webview(LoadingState loadingState) {
        C7384Etj.A0Y(loadingState, 0);
        this.loadingState$delegate.Af8(loadingState);
    }

    public final WebContent getContent() {
        return (WebContent) this.content$delegate.getValue();
    }

    public final SnapshotStateList<WebViewError> getErrorsForCurrentRequest() {
        return this.errorsForCurrentRequest;
    }

    public final String getLastLoadedUrl() {
        return MutableState.A05(this.lastLoadedUrl$delegate);
    }

    public final LoadingState getLoadingState() {
        return (LoadingState) this.loadingState$delegate.getValue();
    }

    public final Bitmap getPageIcon() {
        return (Bitmap) this.pageIcon$delegate.getValue();
    }

    public final String getPageTitle() {
        return MutableState.A05(this.pageTitle$delegate);
    }

    public final Bundle getViewState() {
        return this.viewState;
    }

    public final WebView getWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview() {
        return (WebView) this.webView$delegate.getValue();
    }

    public final void setLastLoadedUrl$fbandroid_express_aura_java_com_facebook_aura_webview_webview(String str) {
        this.lastLoadedUrl$delegate.Af8(str);
    }

    public final void setPageIcon$fbandroid_express_aura_java_com_facebook_aura_webview_webview(Bitmap bitmap) {
        this.pageIcon$delegate.Af8(bitmap);
    }

    public final void setPageTitle$fbandroid_express_aura_java_com_facebook_aura_webview_webview(String str) {
        this.pageTitle$delegate.Af8(str);
    }

    public final void setViewState$fbandroid_express_aura_java_com_facebook_aura_webview_webview(Bundle bundle) {
        this.viewState = bundle;
    }

    public final void setWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview(WebView webView) {
        this.webView$delegate.Af8(webView);
    }

    public final boolean isLoading() {
        return !(getLoadingState() instanceof LoadingState.Finished);
    }
}
