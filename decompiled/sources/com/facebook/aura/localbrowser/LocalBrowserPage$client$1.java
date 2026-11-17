package com.facebook.aura.localbrowser;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* loaded from: classes3.dex */
public final class LocalBrowserPage$client$1 extends WebViewClient {
    public final /* synthetic */ LocalBrowserPage this$0;

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        C7384Etj.A0Y(message, 1);
        message.sendToTarget();
        this.this$0.fail(LocalBrowserPageFailure.UNSUPPORTED_NATIVE_INTERACTION, null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String strAcceptedUrl;
        C7384Etj.A0Y(webView, 0);
        if (this.this$0.closed) {
            return;
        }
        this.this$0.onNavigationStarted.invoke();
        if (str != null && (strAcceptedUrl = this.this$0.acceptedUrl(str)) != null) {
            this.this$0.publish(new LocalBrowserPageState(AnonymousClass002.A0k(), strAcceptedUrl, LocalBrowserPagePhase.LOADING, null, null, false, false));
        } else {
            webView.stopLoading();
            this.this$0.fail(LocalBrowserPageFailure.URL_UNSUPPORTED, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        C7384Etj.A0Y(clientCertRequest, 1);
        clientCertRequest.cancel();
        this.this$0.fail(LocalBrowserPageFailure.UNSUPPORTED_NATIVE_INTERACTION, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C7384Etj.A0Y(webResourceRequest, 1);
        if (webResourceRequest.isForMainFrame() && C7384Etj.areEqual(C60Q.A0d(webResourceRequest), this.this$0.state.getValue().url)) {
            this.this$0.fail(LocalBrowserPageFailure.LOAD_FAILED, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C7384Etj.A0Y(httpAuthHandler, 1);
        httpAuthHandler.cancel();
        this.this$0.fail(LocalBrowserPageFailure.UNSUPPORTED_NATIVE_INTERACTION, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C7384Etj.A0Y(sslErrorHandler, 1);
        sslErrorHandler.cancel();
        this.this$0.fail(LocalBrowserPageFailure.TLS_ERROR, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C7384Etj.A0Y(renderProcessGoneDetail, 1);
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        localBrowserTelemetry.event(C3cF.A00(43), "error", C3cH.A0n("app_state", localBrowserTelemetry.appState(), C3cG.A0r("did_crash", String.valueOf(renderProcessGoneDetail.didCrash())), C3cG.A0r("renderer_priority", String.valueOf(renderProcessGoneDetail.rendererPriorityAtExit())), C3cG.A0r(C3cF.A00(58), localBrowserTelemetry.rendererTerminatedBy())), null);
        this.this$0.onRendererGone.invoke();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        G0U<? super String, ? extends WebResourceResponse> g0u;
        C7384Etj.A0Y(webResourceRequest, 1);
        if (this.this$0.closed || (!AbstractC0878AGe.A0k(LocalBrowserPageKt.LOCAL_SCHEMES, C60Q.A0i(webResourceRequest.getUrl().getScheme())) && this.this$0.acceptedUrl(C60R.A0c(webResourceRequest)) == null)) {
            return new WebResourceResponse("text/plain", HatchWebPageParserKt.UTF_8, 403, "Forbidden", AGH.A0E(), C60Q.A0T());
        }
        if (webResourceRequest.isForMainFrame() && AbstractC0878AGe.A0k(LocalBrowserPageKt.SCREENED_SCHEMES, C60Q.A0i(webResourceRequest.getUrl().getScheme())) && (g0u = this.this$0.blocklistScreen) != null) {
            return g0u.invoke(C60R.A0c(webResourceRequest));
        }
        return null;
    }

    public LocalBrowserPage$client$1(LocalBrowserPage localBrowserPage) {
        this.this$0 = localBrowserPage;
    }

    public static final void shouldOverrideUrlLoading$lambda$1(LocalBrowserPage localBrowserPage, WebView webView, String str) {
        if (localBrowserPage.closed) {
            return;
        }
        webView.loadUrl(str);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        LocalBrowserPage localBrowserPage;
        String strAcceptedUrl;
        LocalBrowserPageState value = this.this$0.state.getValue();
        if (this.this$0.closed) {
            return;
        }
        LocalBrowserPagePhase localBrowserPagePhase = value.phase;
        LocalBrowserPagePhase localBrowserPagePhase2 = LocalBrowserPagePhase.READY;
        if (localBrowserPagePhase != localBrowserPagePhase2 || C7384Etj.areEqual(str, value.url)) {
            localBrowserPage = this.this$0;
        } else {
            if (str == null || (strAcceptedUrl = this.this$0.acceptedUrl(str)) == null) {
                return;
            }
            localBrowserPage = this.this$0;
            value = new LocalBrowserPageState(value.document, strAcceptedUrl, localBrowserPagePhase2, null, null, false, false);
        }
        localBrowserPage.publish(value);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        this.this$0.commitLoading(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.this$0.commitLoading(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AnonymousClass003.A0x(webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            LocalBrowserBlockSignal localBrowserBlockSignalDetect = LocalBrowserBlockSignals.INSTANCE.detect(C60Q.A0A(webResourceRequest), webResourceResponse);
            if (localBrowserBlockSignalDetect != null) {
                this.this$0.reportBlockSignal(localBrowserBlockSignalDetect);
            }
            if (C7384Etj.areEqual(C60Q.A0d(webResourceRequest), this.this$0.state.getValue().url)) {
                this.this$0.fail(LocalBrowserPageFailure.HTTP_ERROR, Integer.valueOf(webResourceResponse.getStatusCode()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldOverrideUrlLoading(final android.webkit.WebView r7, android.webkit.WebResourceRequest r8) {
        /*
            r6 = this;
            boolean r5 = X.C60P.A1Y(r7, r8)
            com.facebook.aura.localbrowser.LocalBrowserUrlPolicy r1 = com.facebook.aura.localbrowser.LocalBrowserUrlPolicy.INSTANCE
            java.lang.String r0 = X.C60R.A0c(r8)
            java.lang.String r4 = r1.httpsUpgrade(r0)
            r2 = 0
            if (r4 == 0) goto L44
            com.facebook.aura.localbrowser.LocalBrowserPage r1 = r6.this$0
            boolean r0 = r1.closed
            if (r0 != 0) goto L44
            boolean r0 = r8.isForMainFrame()
            if (r0 == 0) goto L44
            java.util.Set<java.lang.String> r0 = r1.httpsUpgrades
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L44
        L25:
            r3 = 1
            if (r4 == 0) goto L46
            com.facebook.aura.localbrowser.LocalBrowserPage r0 = r6.this$0
            java.lang.String r0 = com.facebook.aura.localbrowser.LocalBrowserPage.access$acceptedUrl(r0, r4)
            if (r0 == 0) goto L46
            com.facebook.aura.localbrowser.LocalBrowserPage r0 = r6.this$0
            java.util.Set<java.lang.String> r0 = r0.httpsUpgrades
            r0.add(r4)
            com.facebook.aura.localbrowser.LocalBrowserPage r2 = r6.this$0
            android.os.Handler r1 = r2.mainHandler
            com.facebook.aura.localbrowser.LocalBrowserPage$client$1$$ExternalSyntheticLambda0 r0 = new com.facebook.aura.localbrowser.LocalBrowserPage$client$1$$ExternalSyntheticLambda0
            r0.<init>()
            r1.post(r0)
            return r5
        L44:
            r4 = r2
            goto L25
        L46:
            com.facebook.aura.localbrowser.LocalBrowserPage r0 = r6.this$0
            boolean r0 = r0.closed
            if (r0 != 0) goto L5a
            com.facebook.aura.localbrowser.LocalBrowserPage r1 = r6.this$0
            java.lang.String r0 = X.C60R.A0c(r8)
            java.lang.String r0 = com.facebook.aura.localbrowser.LocalBrowserPage.access$acceptedUrl(r1, r0)
            if (r0 == 0) goto L5a
            r3 = 0
        L59:
            return r3
        L5a:
            boolean r0 = r8.isForMainFrame()
            if (r0 == 0) goto L59
            java.util.Set<java.lang.String> r1 = com.facebook.aura.localbrowser.LocalBrowserPageKt.SCREENED_SCHEMES
            android.net.Uri r0 = r8.getUrl()
            java.lang.String r0 = r0.getScheme()
            java.lang.String r0 = X.C60Q.A0i(r0)
            boolean r0 = X.AbstractC0878AGe.A0k(r1, r0)
            if (r0 == 0) goto L59
            com.facebook.aura.localbrowser.LocalBrowserPage r1 = r6.this$0
            com.facebook.aura.localbrowser.LocalBrowserPageFailure r0 = com.facebook.aura.localbrowser.LocalBrowserPageFailure.URL_UNSUPPORTED
            r1.fail(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserPage$client$1.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }
}
