package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0W;
import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$24 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$24 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$24();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$24() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        Uri uri2 = uri;
        C7384Etj.A0Y(uri2, 0);
        return BrowserCredentialsDeeplink.INSTANCE.routeForUri(uri2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(uri, 0);
        return BrowserCredentialsDeeplink.INSTANCE.routeForUri(uri);
    }
}
