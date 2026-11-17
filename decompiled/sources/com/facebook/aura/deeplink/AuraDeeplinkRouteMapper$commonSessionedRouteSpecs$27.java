package com.facebook.aura.deeplink;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import android.net.Uri;

/* loaded from: classes3.dex */
public final /* synthetic */ class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$27 extends C7438Evz implements G0U<Uri, Boolean> {
    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$27(Object obj) {
        super(1, obj, AuraDeeplinkRouteMapper.class, "hasConnectorRoute", "hasConnectorRoute(Landroid/net/Uri;)Z", 0);
    }

    @Override // X.G0U
    public final Boolean invoke(Uri uri) {
        return Boolean.valueOf(((AuraDeeplinkRouteMapper) AnonymousClass006.A0o(uri, this)).hasConnectorRoute(uri));
    }
}
