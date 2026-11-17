package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.B6A;
import X.C60S;
import X.C7384Etj;
import X.G0U;
import X.HxS;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSourceEditorKt$HtmlSourceEditor$1$1$1 extends AbstractC7559F3s implements G0U<WebView, Unit> {
    public final /* synthetic */ HtmlSourceBridge $bridge;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        webView.addJavascriptInterface(this.$bridge, HtmlSourceEditorKt.JS_INTERFACE_NAME);
        C60S.A04(webView);
        webView.getSettings().setDomStorageEnabled(false);
        webView.getSettings().setCacheMode(2);
        webView.setVerticalScrollBarEnabled(true);
        webView.setHorizontalScrollBarEnabled(true);
        webView.setBackgroundColor(HxS.A01(B6A.A06));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSourceEditorKt$HtmlSourceEditor$1$1$1(HtmlSourceBridge htmlSourceBridge) {
        super(1);
        this.$bridge = htmlSourceBridge;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }
}
