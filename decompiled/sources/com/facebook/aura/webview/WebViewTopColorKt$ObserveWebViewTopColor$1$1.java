package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WebViewTopColorKt$ObserveWebViewTopColor$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ int $backgroundColor;
    public final /* synthetic */ C1BO<Function0<Boolean>> $currentIsLoaded;
    public final /* synthetic */ C1BO<G0U<Integer, Unit>> $currentOnColor;
    public final /* synthetic */ WebView $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewTopColorKt$ObserveWebViewTopColor$1$1(WebView webView, int i, C1BO<? extends Function0<Boolean>> c1bo, C1BO<? extends G0U<? super Integer, Unit>> c1bo2) {
        super(1);
        this.$webView = webView;
        this.$backgroundColor = i;
        this.$currentIsLoaded = c1bo;
        this.$currentOnColor = c1bo2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final WebViewTopColorSampler webViewTopColorSampler;
        WebView webView = this.$webView;
        if (webView != null) {
            webViewTopColorSampler = new WebViewTopColorSampler(webView, this.$backgroundColor, new WebViewTopColorKt$ObserveWebViewTopColor$1$1$sampler$1$1(this.$currentIsLoaded), new WebViewTopColorKt$ObserveWebViewTopColor$1$1$sampler$1$2(this.$currentOnColor));
            webViewTopColorSampler.start();
        } else {
            webViewTopColorSampler = null;
        }
        return new C78g() { // from class: com.facebook.aura.webview.WebViewTopColorKt$ObserveWebViewTopColor$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                WebViewTopColorSampler webViewTopColorSampler2 = webViewTopColorSampler;
                if (webViewTopColorSampler2 != null) {
                    webViewTopColorSampler2.close();
                }
            }
        };
    }
}
