package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import android.os.Bundle;
import com.facebook.aura.webview.WebContent;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchWebViewKt$WebStateSaver$1$2 extends AbstractC7559F3s implements G0U<Map<String, ? extends Object>, WebViewState> {
    public final /* synthetic */ String $lastLoadedUrlKey;
    public final /* synthetic */ String $pageTitleKey;
    public final /* synthetic */ String $stateBundle;

    @Override // X.G0U
    public final WebViewState invoke(Map<String, ? extends Object> map) {
        C7384Etj.A0Y(map, 0);
        WebViewState webViewState = new WebViewState(WebContent.NavigatorOnly.INSTANCE);
        String str = this.$pageTitleKey;
        String str2 = this.$lastLoadedUrlKey;
        String str3 = this.$stateBundle;
        webViewState.setPageTitle$fbandroid_express_aura_java_com_facebook_aura_webview_webview(C60O.A0p(str, map));
        webViewState.setLastLoadedUrl$fbandroid_express_aura_java_com_facebook_aura_webview_webview(C60O.A0p(str2, map));
        webViewState.viewState = (Bundle) map.get(str3);
        return webViewState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWebViewKt$WebStateSaver$1$2(String str, String str2, String str3) {
        super(1);
        this.$pageTitleKey = str;
        this.$lastLoadedUrlKey = str2;
        this.$stateBundle = str3;
    }
}
