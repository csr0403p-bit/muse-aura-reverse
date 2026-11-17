package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSourceEditorKt$HtmlSourceEditor$1$2$1 extends AbstractC7559F3s implements G0U<WebView, Unit> {
    public static final HtmlSourceEditorKt$HtmlSourceEditor$1$2$1 INSTANCE = new HtmlSourceEditorKt$HtmlSourceEditor$1$2$1();

    public HtmlSourceEditorKt$HtmlSourceEditor$1$2$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        webView.removeJavascriptInterface(HtmlSourceEditorKt.JS_INTERFACE_NAME);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }
}
