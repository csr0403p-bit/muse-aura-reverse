package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import X.C1bi;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.G0V;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchWebViewKt$WebStateSaver$1$1 extends AbstractC7559F3s implements G0V<C1bi, WebViewState, Map<String, ? extends Object>> {
    public final /* synthetic */ String $lastLoadedUrlKey;
    public final /* synthetic */ String $pageTitleKey;
    public final /* synthetic */ String $stateBundle;

    @Override // X.G0V
    public final Map<String, Object> invoke(C1bi c1bi, WebViewState webViewState) {
        C7384Etj.A0Y(webViewState, 1);
        Bundle bundle = new Bundle();
        WebView webView$fbandroid_express_aura_java_com_facebook_aura_webview_webview = webViewState.getWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview();
        if (webView$fbandroid_express_aura_java_com_facebook_aura_webview_webview != null) {
            webView$fbandroid_express_aura_java_com_facebook_aura_webview_webview.saveState(bundle);
        }
        return C3cH.A0m(this.$stateBundle, bundle, C3cG.A0r(this.$pageTitleKey, MutableState.A05(webViewState.pageTitle$delegate)), C3cG.A0r(this.$lastLoadedUrlKey, MutableState.A05(webViewState.lastLoadedUrl$delegate)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWebViewKt$WebStateSaver$1$1(String str, String str2, String str3) {
        super(2);
        this.$pageTitleKey = str;
        this.$lastLoadedUrlKey = str2;
        this.$stateBundle = str3;
    }
}
