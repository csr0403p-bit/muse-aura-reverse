package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.view.ViewGroup;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchWebViewKt$WebView$14$1 extends AbstractC7559F3s implements G0U<ViewGroup, Unit> {
    public final /* synthetic */ boolean $applyFrameLayoutWorkaround;
    public final /* synthetic */ boolean $destroyOnRelease;
    public final /* synthetic */ G0U<WebView, Unit> $onDispose;
    public final /* synthetic */ WebViewState $state;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewGroup viewGroup) {
        WebView webView;
        C7384Etj.A0Y(viewGroup, 0);
        if (this.$applyFrameLayoutWorkaround) {
            viewGroup = (ViewGroup) viewGroup.findViewWithTag(HatchWebViewKt.WEBVIEW_TAG);
        }
        if (!(viewGroup instanceof WebView) || (webView = (WebView) viewGroup) == null) {
            return;
        }
        try {
            this.$onDispose.invoke(webView);
        } finally {
            this.$state.releaseWebView$fbandroid_express_aura_java_com_facebook_aura_webview_webview(webView);
            if (this.$destroyOnRelease) {
                HatchWebViewKt.destroyOwnedWebView(webView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchWebViewKt$WebView$14$1(boolean z, G0U<? super WebView, Unit> g0u, WebViewState webViewState, boolean z2) {
        super(1);
        this.$applyFrameLayoutWorkaround = z;
        this.$onDispose = g0u;
        this.$state = webViewState;
        this.$destroyOnRelease = z2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup) {
        invoke2(viewGroup);
        return Unit.INSTANCE;
    }
}
