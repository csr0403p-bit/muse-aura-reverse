package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import com.facebook.aura.navigation.key.HatchStatusTab;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$19 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$19 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$19();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$19() {
        super(3);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(uri, 0);
        return new AuraDeeplinkRoute(new HatchStatusScreenKey(HatchStatusTab.Companion.fromWire(uri.getQueryParameter("tab")), null, null, null), LaunchFlag.NAVIGATE, null);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }
}
