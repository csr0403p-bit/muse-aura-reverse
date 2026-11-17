package com.facebook.aura.file.view;

import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class DocxWebViewerKt$DocxWebDocument$2$2$1 extends C7438Evz implements G0U<WebView, Unit> {
    public static final DocxWebViewerKt$DocxWebDocument$2$2$1 INSTANCE = new DocxWebViewerKt$DocxWebDocument$2$2$1();

    public DocxWebViewerKt$DocxWebDocument$2$2$1() {
        super(1, DocxWebViewerKt.class, "releaseDocxWebView", "releaseDocxWebView(Landroid/webkit/WebView;)V", 1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        DocxWebViewerKt.releaseDocxWebView(webView);
    }
}
