package com.facebook.aura.feed.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.feed.model.HatchPendingFeedUnit;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.utils.HatchUtil;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class FeedDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final FeedDeeplinkRouteProvider INSTANCE = new FeedDeeplinkRouteProvider();
    public static final String UNIT_ID_PARAM = "unit_id";

    /* renamed from: com.facebook.aura.feed.view.FeedDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isFeedEnabled());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isFeedEnabled());
        }
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        return Collections.singletonList(new AuraDeeplinkRouteSpec("feed", "/feed", null, AuraDeeplinkAccessScope.ALL_FAMILY, AuraDeeplinkAccessScope.PUBLIC, false, null, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE));
    }

    /* renamed from: com.facebook.aura.feed.view.FeedDeeplinkRouteProvider$routeSpecs$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            String queryParameter;
            C7384Etj.A0Y(uri, 0);
            if (!HatchDeveloperPrefs.cachedIsInfiniteFeedPaginationEnabled && (queryParameter = uri.getQueryParameter("unit_id")) != null && !C7BY.A0j(queryParameter)) {
                HatchPendingFeedUnit.INSTANCE.publish(queryParameter);
            }
            return new AuraDeeplinkRoute(FeedScreenKey.INSTANCE, LaunchFlag.BRING_TO_FRONT, null);
        }
    }
}
