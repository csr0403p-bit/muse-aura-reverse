package com.facebook.aura.webview;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.webview.HatchWebViewKt$WebView$12$1$1", f = "HatchWebView.kt", l = {164}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchWebViewKt$WebView$12$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ WebViewNavigator $navigator;
    public final /* synthetic */ WebView $wv;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWebViewKt$WebView$12$1$1(WebViewNavigator webViewNavigator, WebView webView, HtJ<? super HatchWebViewKt$WebView$12$1$1> htJ) {
        super(2, htJ);
        this.$navigator = webViewNavigator;
        this.$wv = webView;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWebViewKt$WebView$12$1$1(this.$navigator, this.$wv, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            WebViewNavigator webViewNavigator = this.$navigator;
            WebView webView = this.$wv;
            this.L$0 = null;
            this.label = 1;
            if (webViewNavigator.handleNavigationEvents$fbandroid_express_aura_java_com_facebook_aura_webview_webview(webView, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchWebViewKt$WebView$12$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
