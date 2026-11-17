package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraNdaScreenKt$NdaAgreementWebView$1$1 extends AbstractC7559F3s implements G0U<WebView, Unit> {
    public static final AuraNdaScreenKt$NdaAgreementWebView$1$1 INSTANCE = new AuraNdaScreenKt$NdaAgreementWebView$1$1();

    public AuraNdaScreenKt$NdaAgreementWebView$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        webView.setBackgroundColor(0);
        WebSettings settings = webView.getSettings();
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }
}
