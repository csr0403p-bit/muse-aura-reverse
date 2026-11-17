package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C6tF;
import X.C7384Etj;
import X.CFK;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionType;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$HtmlWebView$chromeClient$1$1 extends C6tF {
    public final /* synthetic */ HatchHtmlSurface $surface;

    @Override // X.C6tF
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C7384Etj.A0Y(consoleMessage, 0);
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        StringBuilder sbA0g = C3cG.A0g(strMessage);
        sbA0g.append(" (");
        sbA0g.append(strSourceId);
        sbA0g.append(":");
        sbA0g.append(iLineNumber);
        String strA0v = AnonymousClass001.A0v(")", sbA0g);
        CFK.A04(HtmlViewerKt.CONSOLE_TAG, strA0v);
        HatchHtmlDiagnostics.INSTANCE.logError(this.$surface, HatchHtmlErrorCode.INTERNAL_ERROR, strA0v, null, null, null);
        return true;
    }

    @Override // X.C6tF
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AnonymousClass002.A1B(webView, 0, message);
        if (!z2) {
            HatchHtmlDiagnostics.INSTANCE.startAction(this.$surface, HatchHtmlActionType.NEW_WINDOW, null).failed(HatchHtmlErrorCode.NOT_USER_GESTURE, null, null);
            return false;
        }
        final WebView webView2 = new WebView(webView.getContext());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final HatchHtmlSurface hatchHtmlSurface = this.$surface;
        webView2.setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.file.view.HtmlViewerKt$HtmlWebView$chromeClient$1$1$onCreateWindow$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                boolean zA1Y = C60P.A1Y(webView3, webResourceRequest);
                String strA0c = C60R.A0c(webResourceRequest);
                C60R.A0z(webView3, HatchHtmlDiagnostics.INSTANCE.startAction(hatchHtmlSurface, HatchHtmlActionType.NEW_WINDOW, strA0c), strA0c);
                HtmlViewerKt$HtmlWebView$chromeClient$1$1.onCreateWindow$release(atomicBoolean, webView2);
                return zA1Y;
            }
        });
        C60O.A02().postDelayed(new Runnable() { // from class: com.facebook.aura.file.view.HtmlViewerKt$HtmlWebView$chromeClient$1$1$onCreateWindow$2
            @Override // java.lang.Runnable
            public final void run() {
                HtmlViewerKt$HtmlWebView$chromeClient$1$1.onCreateWindow$release(atomicBoolean, webView2);
            }
        }, 10000L);
        Object obj = message.obj;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public HtmlViewerKt$HtmlWebView$chromeClient$1$1(HatchHtmlSurface hatchHtmlSurface) {
        this.$surface = hatchHtmlSurface;
    }

    public static final void onCreateWindow$release(AtomicBoolean atomicBoolean, WebView webView) {
        if (C3cI.A1W(atomicBoolean)) {
            webView.destroy();
        }
    }
}
