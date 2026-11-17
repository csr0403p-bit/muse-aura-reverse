package com.facebook.aura.file.view;

import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class SheetWebViewerKt$SheetWebDocument$2$2$1 extends C7438Evz implements G0U<WebView, Unit> {
    public static final SheetWebViewerKt$SheetWebDocument$2$2$1 INSTANCE = new SheetWebViewerKt$SheetWebDocument$2$2$1();

    public SheetWebViewerKt$SheetWebDocument$2$2$1() {
        super(1, SheetWebViewerKt.class, "releaseSheetWebView", "releaseSheetWebView(Landroid/webkit/WebView;)V", 1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        SheetWebViewerKt.releaseSheetWebView(webView);
    }
}
