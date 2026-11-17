package com.facebook.aura.spaces.preload;

import X.AnonymousClass005;
import X.C7384Etj;
import X.G0W;
import android.webkit.JavascriptInterface;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;

/* loaded from: classes3.dex */
public final class SpacesShareBridgeStub {
    public final HtmlSpacesWebViewSession session;

    public SpacesShareBridgeStub(HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
        C7384Etj.A0Y(htmlSpacesWebViewSession, 0);
        this.session = htmlSpacesWebViewSession;
    }

    @JavascriptInterface
    public final String share(String str, String str2, String str3) {
        String strInvoke;
        AnonymousClass005.A0x(str, str2, str3);
        G0W<? super String, ? super String, ? super String, String> g0w = this.session.shareHost;
        return (g0w == null || (strInvoke = g0w.invoke(str, str2, str3)) == null) ? "NotAllowedError" : strInvoke;
    }
}
