package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C60R;
import X.C6tA;
import X.C6tB;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$checkpointWebView$client$1 extends C6tA implements C6tB {
    public final /* synthetic */ G0U<String, Unit> $onCallback;
    public final /* synthetic */ Function0<Unit> $onFailure;
    public final /* synthetic */ G0U<Boolean, Unit> $onLoadingChanged;
    public final /* synthetic */ G0U<WebView, Unit> $onRenderProcessGone;

    @Override // X.C6tB
    public boolean doAdditionalShouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C7384Etj.A0Y(webResourceRequest, 1);
        return webResourceRequest.isForMainFrame() && shouldBlockMainFrame(C60R.A0c(webResourceRequest));
    }

    @Override // X.C6tA
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        G0U<Boolean, Unit> g0u;
        boolean z = false;
        C7384Etj.A0Y(webView, 0);
        if (str != null) {
            if (NativeLoginCheckpointContinuationKt.isAuraCheckpointCallback(str)) {
                this.$onCallback.invoke(str);
                webView.stopLoading();
                g0u = this.$onLoadingChanged;
            } else if (HatchCheckpointUrlPolicy.INSTANCE.isTrustedWebNavigation(str)) {
                g0u = this.$onLoadingChanged;
                z = true;
            } else {
                webView.stopLoading();
            }
            AnonymousClass001.A1K(z, g0u);
            return;
        }
        this.$onFailure.invoke();
    }

    @Override // X.C6tA
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C7384Etj.A0Y(webResourceRequest, 1);
        if (webResourceRequest.isForMainFrame()) {
            AnonymousClass001.A1K(false, this.$onLoadingChanged);
            this.$onFailure.invoke();
        }
    }

    @Override // X.C6tA
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C7384Etj.A0Y(webResourceRequest, 1);
        if (webResourceRequest.isForMainFrame()) {
            AnonymousClass001.A1K(false, this.$onLoadingChanged);
            this.$onFailure.invoke();
        }
    }

    @Override // X.C6tA
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C7384Etj.A0Y(webView, 0);
        AnonymousClass001.A1K(false, this.$onLoadingChanged);
        this.$onRenderProcessGone.invoke(webView);
        this.$onFailure.invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCheckpointWebScreenKt$checkpointWebView$client$1(G0U<? super String, Unit> g0u, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u2, G0U<? super WebView, Unit> g0u3) {
        this.$onCallback = g0u;
        this.$onFailure = function0;
        this.$onLoadingChanged = g0u2;
        this.$onRenderProcessGone = g0u3;
    }

    @Override // X.C6tA
    public void onPageFinished(WebView webView, String str) {
        AnonymousClass001.A1K(false, this.$onLoadingChanged);
    }

    private final boolean shouldBlockMainFrame(String str) {
        if (NativeLoginCheckpointContinuationKt.isAuraCheckpointCallback(str)) {
            this.$onCallback.invoke(str);
            return true;
        }
        if (HatchCheckpointUrlPolicy.INSTANCE.isTrustedWebNavigation(str)) {
            return false;
        }
        this.$onFailure.invoke();
        return true;
    }

    @Override // X.C6tB
    public boolean doAdditionalShouldOverrideUrlLoading(WebView webView, String str) {
        C7384Etj.A0Y(str, 1);
        return shouldBlockMainFrame(str);
    }
}
