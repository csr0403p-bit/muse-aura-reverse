package com.facebook.aura.deeplink;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import android.net.Uri;

/* loaded from: classes3.dex */
public final /* synthetic */ class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$23 extends C7438Evz implements G0U<Uri, Boolean> {
    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$23(Object obj) {
        super(1, obj, BrowserCredentialsDeeplink.class, "hasRoute", "hasRoute(Landroid/net/Uri;)Z", 0);
    }

    @Override // X.G0U
    public final Boolean invoke(Uri uri) {
        return Boolean.valueOf(((BrowserCredentialsDeeplink) AnonymousClass006.A0o(uri, this)).hasRoute(uri));
    }
}
