package com.facebook.aura.webview;

import X.AbstractC7559F3s;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchWebViewKt$WebView$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WebView $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWebViewKt$WebView$11$1(WebView webView) {
        super(0);
        this.$webView = webView;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WebView webView = this.$webView;
        if (webView != null) {
            webView.goBack();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
