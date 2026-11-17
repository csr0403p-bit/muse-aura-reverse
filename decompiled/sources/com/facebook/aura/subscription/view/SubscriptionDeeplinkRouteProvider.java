package com.facebook.aura.subscription.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C60Q;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.BuyCreditsEntrySurface;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.utils.HatchUtil;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class SubscriptionDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final String ENTRY_POINT_PARAM = "entry_point";
    public static final String HTTPS_SCHEME = "https";
    public static final SubscriptionDeeplinkRouteProvider INSTANCE = new SubscriptionDeeplinkRouteProvider();
    public static final String NME_ENTRYPOINT_PARAM = "entrypoint";
    public static final String PAGE_PARAM = "page";
    public static final String PAYWALL_PAGE = "paywall";

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isSubscriptionEnabled());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isSubscriptionEnabled());
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionDeeplinkRouteProvider$routeSpecs$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            Uri uri2 = uri;
            C7384Etj.A0Y(uri2, 0);
            return SubscriptionDeeplinkRouteProvider.INSTANCE.routeForUri(uri2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final AuraDeeplinkRoute invoke2(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            return SubscriptionDeeplinkRouteProvider.INSTANCE.routeForUri(uri);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionDeeplinkRouteProvider$routeSpecs$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(Uri uri) {
            String host;
            C7384Etj.A0Y(uri, 0);
            String scheme = uri.getScheme();
            return Boolean.valueOf(scheme != null && scheme.equalsIgnoreCase("https") && (host = uri.getHost()) != null && host.equalsIgnoreCase(HatchUrl.SHARE_DOMAIN) && "/subscriptions".equals(uri.getPath()) && HatchUtil.INSTANCE.isSubscriptionEnabled());
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionDeeplinkRouteProvider$routeSpecs$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            Uri uri2 = uri;
            C7384Etj.A0Y(uri2, 0);
            return SubscriptionDeeplinkRouteProvider.INSTANCE.routeForUri(uri2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final AuraDeeplinkRoute invoke2(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            return SubscriptionDeeplinkRouteProvider.INSTANCE.routeForUri(uri);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionDeeplinkRouteProvider$routeSpecs$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(Uri uri) {
            C7384Etj.A0Y(uri, 0);
            String scheme = uri.getScheme();
            return Boolean.valueOf(scheme != null && scheme.equalsIgnoreCase("hatch") && HatchUtil.INSTANCE.isSubscriptionEnabled());
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionDeeplinkRouteProvider$routeSpecs$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            Uri uri2 = uri;
            C7384Etj.A0Y(uri2, 0);
            return SubscriptionDeeplinkRouteProvider.INSTANCE.buyUsageRouteForUri(uri2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final AuraDeeplinkRoute invoke2(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            return SubscriptionDeeplinkRouteProvider.INSTANCE.buyUsageRouteForUri(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute buyUsageRouteForUri(Uri uri) {
        return routeForUri(uri, new AuraSubscriptionPage.BuyCredits(BuyCreditsEntrySurface.BUY_USAGE.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute routeForUri(Uri uri) {
        return routeForUri(uri, "paywall".equals(uri.getQueryParameter("page")) ? AuraSubscriptionPage.Paywall.INSTANCE : AuraSubscriptionPage.Usage.INSTANCE);
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.ALL_FAMILY;
        return Arrays.asList(new AuraDeeplinkRouteSpec("subscription_hub", "/subscription_hub", null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, anonymousClass1, anonymousClass2), new AuraDeeplinkRouteSpec("subscriptions", "/subscriptions", null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AnonymousClass3.INSTANCE, AnonymousClass4.INSTANCE), new AuraDeeplinkRouteSpec("buy_usage", "/buy_usage", null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AnonymousClass5.INSTANCE, AnonymousClass6.INSTANCE));
    }

    private final AuraDeeplinkRoute routeForUri(Uri uri, AuraSubscriptionPage auraSubscriptionPage) {
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPointFromWire = SubscriptionPaywallEntryPoint.Companion.fromWire(uri.getQueryParameter("entry_point"));
        if (subscriptionPaywallEntryPointFromWire == null) {
            subscriptionPaywallEntryPointFromWire = SubscriptionPaywallEntryPoint.DEEPLINK;
        }
        return C60Q.A0G(new AuraSubscriptionSheetKey(auraSubscriptionPage, subscriptionPaywallEntryPointFromWire, uri.getQueryParameter("entrypoint")));
    }
}
