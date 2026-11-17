package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C6t6;
import X.CFK;
import X.G0U;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$hostBridge$1$1 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public final /* synthetic */ HtmlSecureWebViewRef $secureWebViewRef;
    public final /* synthetic */ HatchHtmlSurface $surface;

    @Override // X.G0U
    public final Boolean invoke(String str) {
        boolean z = false;
        try {
            C6t6 c6t6 = this.$secureWebViewRef.webView;
            if (c6t6 != null) {
                if (c6t6.validateJsInterfaceToken(str)) {
                    z = true;
                }
            }
        } catch (RuntimeException e) {
            CFK.A08(HtmlViewerKt.TAG, "Exception validating hatch host bridge token", e);
            HatchHtmlDiagnostics.INSTANCE.logError(this.$surface, HatchHtmlErrorCode.BRIDGE_TOKEN_INVALID, null, e, null, null);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlViewerKt$HtmlWebView$hostBridge$1$1(HtmlSecureWebViewRef htmlSecureWebViewRef, HatchHtmlSurface hatchHtmlSurface) {
        super(1);
        this.$secureWebViewRef = htmlSecureWebViewRef;
        this.$surface = hatchHtmlSurface;
    }
}
