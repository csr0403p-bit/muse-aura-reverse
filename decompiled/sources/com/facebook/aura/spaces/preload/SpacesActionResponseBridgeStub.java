package com.facebook.aura.spaces.preload;

import X.C3cG;
import X.C6t6;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public final class SpacesActionResponseBridgeStub {
    public final C6t6 webView;

    public SpacesActionResponseBridgeStub(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        this.webView = c6t6;
    }

    @JavascriptInterface
    public final void sendRequest(String str, final String str2, String str3, String str4, String str5, String str6, boolean z) {
        C7384Etj.A0Y(str2, 1);
        if (C7BY.A0j(str2)) {
            return;
        }
        this.webView.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesActionResponseBridgeStub.sendRequest.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    SpacesActionResponseBridgeStub.this.webView.evaluateJavascript(FGI.A0U("window.__fwaSpacesResolveAction(", SpacesWebViewFactoryKt.toJsStringLiteral(str2), ",0,\"\",\"{}\",\"\",false,true)"), null);
                } catch (Throwable th) {
                    C3cG.A0s(th);
                }
            }
        });
    }
}
