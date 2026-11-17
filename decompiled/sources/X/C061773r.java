package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.aura.accountcenter.AuraAccountsCenterActivity;
import libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity;
import libraries.fxmetalogin.webauth.MetaWebAuthenticationActivity;

/* renamed from: X.73r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C061773r extends C6tA implements C6tB {
    public final /* synthetic */ WebViewAccountsCenterBaseActivity A00;

    @Override // X.C6tB
    public final boolean doAdditionalShouldOverrideUrlLoading(WebView webView, String str) {
        G0U<String, Boolean> g0u;
        if (str != null && (g0u = ((AuraAccountsCenterActivity) this.A00).shouldInterceptURL) != null && AnonymousClass003.A1X(str, g0u)) {
            return true;
        }
        WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity = this.A00;
        if (webViewAccountsCenterBaseActivity.doesMatchAuthUrls(str) && webView != null && str != null) {
            Context context = webView.getContext();
            C7384Etj.A0U(context);
            if (!C7L9.A00(context, str).isEmpty()) {
                String strBuildUrlWithAppId = webViewAccountsCenterBaseActivity.buildUrlWithAppId(str);
                Intent intent = new Intent(context, (Class<?>) MetaWebAuthenticationActivity.class);
                intent.putExtra("BASE_URI", strBuildUrlWithAppId);
                HwU<Intent> hwU = webViewAccountsCenterBaseActivity.authActivityLauncher;
                if (hwU == null) {
                    C7384Etj.A0b("authActivityLauncher");
                    throw F60.createAndThrow();
                }
                hwU.A01(null, intent);
                return true;
            }
        }
        return false;
    }

    public C061773r(WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity) {
        this.A00 = webViewAccountsCenterBaseActivity;
    }

    @Override // X.C6tA
    public final void onPageFinished(WebView webView, String str) {
        WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity = this.A00;
        webViewAccountsCenterBaseActivity.onWebViewPageFinished();
        super.onPageFinished(webView, str);
        ProgressBar progressBar = webViewAccountsCenterBaseActivity.prgInitialoader;
        if (progressBar == null) {
            C7384Etj.A0b("prgInitialoader");
            throw F60.createAndThrow();
        }
        progressBar.setVisibility(8);
        FrameLayout frameLayout = webViewAccountsCenterBaseActivity.loadingOverlay;
        if (frameLayout == null) {
            C7384Etj.A0b("loadingOverlay");
            throw F60.createAndThrow();
        }
        frameLayout.setVisibility(8);
    }

    @Override // X.C6tA
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity = this.A00;
        webViewAccountsCenterBaseActivity.onWebViewPageStarted();
        super.onPageStarted(webView, str, bitmap);
        ProgressBar progressBar = webViewAccountsCenterBaseActivity.prgInitialoader;
        if (progressBar == null) {
            C7384Etj.A0b("prgInitialoader");
            throw F60.createAndThrow();
        }
        progressBar.setVisibility(0);
    }

    @Override // X.C6tB
    public final /* synthetic */ boolean doAdditionalShouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return doAdditionalShouldOverrideUrlLoading(webView, C60Q.A0d(webResourceRequest));
    }
}
