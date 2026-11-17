package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.DevicePermissionRowId;
import com.facebook.aura.navigation.key.PermissionDestinationKt;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$22 extends AbstractC7559F3s implements G0W<Uri, List<? extends String>, AbstractC3358CGz, AuraDeeplinkRoute> {
    public static final AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$22 INSTANCE = new AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$22();

    public AuraDeeplinkRouteMapper$commonSessionedRouteSpecs$22() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, List<? extends String> list, AbstractC3358CGz abstractC3358CGz) {
        return invoke2(uri, (List<String>) list, abstractC3358CGz);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraDeeplinkRoute invoke2(Uri uri, List<String> list, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(uri, 0);
        return new AuraDeeplinkRoute(PermissionDestinationKt.devicePermissionsDeeplinkKey(DevicePermissionRowId.Companion.fromWire(uri.getQueryParameter(AuraDeeplinkRouteMapper.HIGHLIGHT_PARAM))), LaunchFlag.NAVIGATE, null);
    }
}
