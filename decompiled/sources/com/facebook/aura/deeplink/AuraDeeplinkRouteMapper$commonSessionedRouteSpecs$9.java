package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0W;
import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$9 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$9 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$9();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$9() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        Uri uri2 = uri;
        AbstractC3358CGz abstractC3358CGz2 = abstractC3358CGz;
        AnonymousClass003.A0v(uri2, abstractC3358CGz2);
        return AuraDeeplinkRouteMapper.INSTANCE.chatRoute(uri2, abstractC3358CGz2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0v(uri, abstractC3358CGz);
        return AuraDeeplinkRouteMapper.INSTANCE.chatRoute(uri, abstractC3358CGz);
    }
}
