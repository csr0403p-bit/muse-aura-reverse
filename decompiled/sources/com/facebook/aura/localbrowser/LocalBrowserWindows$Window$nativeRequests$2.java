package com.facebook.aura.localbrowser;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import android.webkit.WebView;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final /* synthetic */ class LocalBrowserWindows$Window$nativeRequests$2 extends C7438Evz implements G0U<WebView, Unit> {
    public LocalBrowserWindows$Window$nativeRequests$2(Object obj) {
        super(1, obj, LocalBrowserWindows.class, "close", "close(Landroid/webkit/WebView;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        ((LocalBrowserWindows) AnonymousClass006.A0o(webView, this)).close(webView);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }
}
