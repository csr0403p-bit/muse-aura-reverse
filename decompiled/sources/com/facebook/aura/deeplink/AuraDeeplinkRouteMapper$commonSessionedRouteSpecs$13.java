package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0W;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$13 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$13 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$13();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$13() {
        super(3);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(uri, 0);
        return AuraDeeplinkRouteMapper.INSTANCE.libraryRoute(uri);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        Uri uri2 = uri;
        C7384Etj.A0Y(uri2, 0);
        return AuraDeeplinkRouteMapper.INSTANCE.libraryRoute(uri2);
    }
}
