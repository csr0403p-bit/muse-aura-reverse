package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C60Q;
import X.C7384Etj;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import com.facebook.aura.navigation.key.HatchSettingsSubdestination;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$15 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$15 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$15();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$15() {
        super(3);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(uri, 0);
        return C60Q.A0G(new HatchSettingsPushScreenKey(HatchSettingsSubdestination.Companion.fromWire(uri.getQueryParameter(AuraDeeplinkRouteMapper.SECTION_PARAM))));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }
}
