package com.facebook.aura.webview;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* loaded from: classes3.dex */
public final class WebViewError extends C06G {
    public static final int $stable = 0;
    public final WebResourceError error;
    public final WebResourceRequest request;

    public WebViewError(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C7384Etj.A0Y(webResourceError, 1);
        this.request = webResourceRequest;
        this.error = webResourceError;
    }

    public final WebViewError copy(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C7384Etj.A0Y(webResourceError, 1);
        return new WebViewError(webResourceRequest, webResourceError);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebViewError) {
                WebViewError webViewError = (WebViewError) obj;
                if (!C7384Etj.areEqual(this.request, webViewError.request) || !C7384Etj.areEqual(this.error, webViewError.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WebViewError copy$default(WebViewError webViewError, WebResourceRequest webResourceRequest, WebResourceError webResourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            webResourceRequest = webViewError.request;
        }
        if ((i & 2) != 0) {
            webResourceError = webViewError.error;
        }
        C7384Etj.A0Y(webResourceError, 1);
        return new WebViewError(webResourceRequest, webResourceError);
    }

    public final WebResourceRequest component1() {
        return this.request;
    }

    public final WebResourceError component2() {
        return this.error;
    }

    public final WebResourceError getError() {
        return this.error;
    }

    public final WebResourceRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.error, AnonymousClass006.A0D(this.request) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
