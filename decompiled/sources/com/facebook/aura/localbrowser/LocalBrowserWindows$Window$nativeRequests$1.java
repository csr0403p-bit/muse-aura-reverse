package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7438Evz;
import X.G2j;
import android.os.Message;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public final /* synthetic */ class LocalBrowserWindows$Window$nativeRequests$1 extends C7438Evz implements G2j<WebView, Boolean, Boolean, Message, Boolean> {
    public LocalBrowserWindows$Window$nativeRequests$1(Object obj) {
        super(4, obj, LocalBrowserWindows.class, "open", "open(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z", 0);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Boolean invoke(WebView webView, Boolean bool, Boolean bool2, Message message) {
        return invoke(webView, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), message);
    }

    public final Boolean invoke(WebView webView, boolean z, boolean z2, Message message) {
        AnonymousClass003.A0w(webView, message);
        return Boolean.valueOf(((LocalBrowserWindows) this.receiver).open(webView, z, z2, message));
    }
}
