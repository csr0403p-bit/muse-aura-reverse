package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C60Q;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConnectionsModalScreenKey;
import com.facebook.aura.navigation.key.ConnectionsScreenKey;
import com.facebook.aura.navigation.key.PairsAcceptLinkSheetKey;
import com.facebook.aura.pairs.PairsAcceptLinks;
import com.facebook.aura.pairs.PairsAnalytics;
import com.facebook.aura.pairs.PairsRepositoryKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.tabs.AuraTabLayoutKt;
import com.facebook.aura.tabs.FixedTab;
import com.facebook.aura.utils.HatchUtil;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class PairsDeeplinkRoutes implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final PairsDeeplinkRoutes INSTANCE = new PairsDeeplinkRoutes();

    /* renamed from: com.facebook.aura.navigation.entries.PairsDeeplinkRoutes$acceptRouteSpec$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            String scheme;
            boolean zA1a = AnonymousClass002.A1a(uri, abstractC3358CGz);
            if (!HatchUtil.INSTANCE.isConnectionsTabEnabled() || (scheme = uri.getScheme()) == null) {
                return null;
            }
            int iHashCode = scheme.hashCode();
            if (iHashCode == 99050560) {
                if (!scheme.equals("hatch")) {
                    return null;
                }
                PairsAnalytics.INSTANCE.logConnectionsLinkRouted();
                return PairsDeeplinkRoutes.INSTANCE.connectionsRoute(abstractC3358CGz);
            }
            if (iHashCode != 99617003 || !scheme.equals("https") || !HatchUrl.INSTANCE.isAcceptedWebHost(uri.getHost())) {
                return null;
            }
            PairsAnalytics.INSTANCE.logInviteLinkRouted();
            return new AuraDeeplinkRoute(new PairsAcceptLinkSheetKey(PairsAcceptLinks.INSTANCE.stage(abstractC3358CGz, uri.getEncodedFragment()), false, zA1a), LaunchFlag.NAVIGATE, null);
        }
    }

    private final AuraDeeplinkRouteSpec acceptRouteSpec(String str, String str2) {
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.PUBLIC;
        return new AuraDeeplinkRouteSpec(str, str2, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute connectionsRoute(AbstractC3358CGz abstractC3358CGz) {
        return AuraTabLayoutKt.auraTabBarIds(abstractC3358CGz, PinnedItemsRepository.Companion.getInstance(abstractC3358CGz).navigationOrder.getValue()).contains(FixedTab.CONNECTIONS.getNavigationId()) ? new AuraDeeplinkRoute(ConnectionsScreenKey.INSTANCE, LaunchFlag.BRING_TO_FRONT, null) : C60Q.A0G(ConnectionsModalScreenKey.INSTANCE);
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        return Arrays.asList(acceptRouteSpec("peer_accept", "/hatch/peer/accept"), acceptRouteSpec("peer_accept_short", PairsRepositoryKt.ACCEPT_PATH));
    }
}
