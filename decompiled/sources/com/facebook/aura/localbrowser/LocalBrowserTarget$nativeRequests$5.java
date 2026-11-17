package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.C7438Evz;
import X.G0W;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final /* synthetic */ class LocalBrowserTarget$nativeRequests$5 extends C7438Evz implements G0W<WebView, ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Boolean> {
    public LocalBrowserTarget$nativeRequests$5(Object obj) {
        super(3, obj, LocalBrowserTarget.class, "showFileChooser", "showFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", 0);
    }

    @Override // X.G0W
    public final Boolean invoke(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AnonymousClass005.A0x(webView, valueCallback, fileChooserParams);
        return Boolean.valueOf(((LocalBrowserTarget) this.receiver).showFileChooser(webView, valueCallback, fileChooserParams));
    }
}
