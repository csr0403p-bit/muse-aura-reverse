package com.facebook.aura.explore.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7BY;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ExploreIdeaCardDetailSheetKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ExploreDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final String ID_PARAM = "id";
    public static final ExploreDeeplinkRouteProvider INSTANCE = new ExploreDeeplinkRouteProvider();

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.PUBLIC;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope2 = AuraDeeplinkAccessScope.ALL_FAMILY;
        AuraDeeplinkRouteSpec.AnonymousClass1 anonymousClass12 = AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE;
        return Arrays.asList(new AuraDeeplinkRouteSpec("explore", "/explore", null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, false, null, anonymousClass12, anonymousClass1), new AuraDeeplinkRouteSpec("ideas", "/ideas", null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, false, null, anonymousClass12, AnonymousClass2.INSTANCE));
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            return new AuraDeeplinkRoute(ExploreScreenKey.INSTANCE, LaunchFlag.BRING_TO_FRONT, null);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.ExploreDeeplinkRouteProvider$routeSpecs$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter != null && !C7BY.A0j(queryParameter)) {
                return new AuraDeeplinkRoute(new ExploreIdeaCardDetailSheetKey(queryParameter), LaunchFlag.NAVIGATE, ExploreScreenKey.INSTANCE);
            }
            return new AuraDeeplinkRoute(ExploreScreenKey.INSTANCE, LaunchFlag.BRING_TO_FRONT, null);
        }
    }
}
