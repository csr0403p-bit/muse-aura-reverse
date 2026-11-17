package com.facebook.aura.handoff.impl.entries;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.handoff.impl.HandoffLinkHandler;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class HandoffDeeplinkRoutes implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final HandoffDeeplinkRoutes INSTANCE = new HandoffDeeplinkRoutes();

    public static final AuraDeeplinkRoute routeSpecs$lambda$0(Uri uri, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(uri, 0);
        return HandoffLinkHandler.INSTANCE.resolve(uri, System.currentTimeMillis());
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.PUBLIC;
        return Collections.singletonList(new AuraDeeplinkRouteSpec("handoff", "/handoff", null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, new G0V() { // from class: com.facebook.aura.handoff.impl.entries.HandoffDeeplinkRoutes$$ExternalSyntheticLambda0
            @Override // X.G0V
            public final Object invoke(Object obj, Object obj2) {
                return HandoffDeeplinkRoutes.routeSpecs$lambda$0((Uri) obj, (AbstractC3358CGz) obj2);
            }
        }));
    }
}
