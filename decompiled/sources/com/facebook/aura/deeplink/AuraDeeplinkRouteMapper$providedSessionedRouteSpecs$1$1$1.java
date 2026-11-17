package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0W;
import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$providedSessionedRouteSpecs$1$1$1 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public final /* synthetic */ AuraDeeplinkRouteSpec $spec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDeeplinkRouteMapper$providedSessionedRouteSpecs$1$1$1(AuraDeeplinkRouteSpec auraDeeplinkRouteSpec) {
        super(3);
        this.$spec = auraDeeplinkRouteSpec;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0v(uri, abstractC3358CGz);
        return this.$spec.resolveRoute.invoke(uri, abstractC3358CGz);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }
}
