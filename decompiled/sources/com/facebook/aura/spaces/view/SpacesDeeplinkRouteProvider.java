package com.facebook.aura.spaces.view;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProviderKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SharedContentScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class SpacesDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final SpacesDeeplinkRouteProvider INSTANCE = new SpacesDeeplinkRouteProvider();
    public static final String OWN_SPACE_V2_SEGMENT = "v2";
    public static final String TAB_PARAM = "tab";

    /* renamed from: com.facebook.aura.spaces.view.SpacesDeeplinkRouteProvider$routeSpecs$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            String host = uri.getHost();
            String scheme = uri.getScheme();
            if (!(scheme == null ? false : scheme.equalsIgnoreCase("hatch"))) {
                host = null;
            }
            List listA0z = AbstractC0885AGm.A0z(host);
            List<String> pathSegments = uri.getPathSegments();
            C7384Etj.A0U(pathSegments);
            HatchUrl.SharedLink sharedLink = HatchUrl.INSTANCE.sharedLink(AbstractC0878AGe.A0Z(AbstractC0878AGe.A0P(pathSegments, listA0z), 1));
            if (sharedLink != null) {
                return C60Q.A0G(new SharedContentScreenKey(AnonymousClass001.A0u(sharedLink.slug), sharedLink.shareKey));
            }
            return null;
        }
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.PUBLIC;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AuraDeeplinkRouteSpec.AnonymousClass1 anonymousClass12 = AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE;
        AuraDeeplinkRouteSpec auraDeeplinkRouteSpec = new AuraDeeplinkRouteSpec("space", null, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, anonymousClass12, anonymousClass1);
        AuraDeeplinkRouteSpec auraDeeplinkRouteSpec2 = new AuraDeeplinkRouteSpec("peer_space", null, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, anonymousClass12, AnonymousClass2.INSTANCE);
        AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope2 = AuraDeeplinkAccessScope.ALL_FAMILY;
        return Arrays.asList(auraDeeplinkRouteSpec, auraDeeplinkRouteSpec2, new AuraDeeplinkRouteSpec("s", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, false, null, anonymousClass12, anonymousClass3), new AuraDeeplinkRouteSpec("spaces", null, null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope2, false, null, anonymousClass12, AnonymousClass4.INSTANCE));
    }

    /* renamed from: com.facebook.aura.spaces.view.SpacesDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            String str = (String) AbstractC0878AGe.A0A(1, AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri));
            if (str == null || C7BY.A0j(str)) {
                return null;
            }
            return new AuraDeeplinkRoute(new SpacesModalScreenKey(str, uri.getQueryParameter("tab"), false), LaunchFlag.NAVIGATE, null);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.SpacesDeeplinkRouteProvider$routeSpecs$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            Object next;
            String str;
            boolean zA1a = AnonymousClass002.A1a(uri, abstractC3358CGz);
            List<String> listDeeplinkRouteSegments = AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri);
            Object objA0A = AbstractC0878AGe.A0A(zA1a ? 1 : 0, listDeeplinkRouteSegments);
            Object objA0A2 = AbstractC0878AGe.A0A(2, listDeeplinkRouteSegments);
            StringBuilder sb = new StringBuilder();
            sb.append(objA0A);
            ArtifactOpenTarget.PeerSpace peerSpacePeerSpaceTargetFromItemKey = UnifiedArtifactKt.peerSpaceTargetFromItemKey(AnonymousClass006.A0y(objA0A2, ":", sb));
            if (peerSpacePeerSpaceTargetFromItemKey == null) {
                return null;
            }
            Iterator<E> it = ArtifactsDataSource.Companion.getInstance(abstractC3358CGz).items.getValue().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    ArtifactItem artifactItem = (ArtifactItem) next;
                    if (artifactItem.source == ArtifactSource.PEER_SPACE && C7384Etj.areEqual(artifactItem.itemKey, peerSpacePeerSpaceTargetFromItemKey.getItemKey())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ArtifactItem artifactItem2 = (ArtifactItem) next;
            if (artifactItem2 == null || (str = artifactItem2.displayName) == null) {
                str = "";
            }
            return new AuraDeeplinkRoute(new PeerSpaceScreenKey(peerSpacePeerSpaceTargetFromItemKey.hostMuse, peerSpacePeerSpaceTargetFromItemKey.spaceId, str, null, false), LaunchFlag.NAVIGATE, null);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.SpacesDeeplinkRouteProvider$routeSpecs$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            String str;
            C7384Etj.A0Y(uri, 0);
            List<String> listDeeplinkRouteSegments = AuraDeeplinkRouteProviderKt.deeplinkRouteSegments(uri);
            if (!C7384Etj.areEqual(AbstractC0878AGe.A0A(1, listDeeplinkRouteSegments), "v2") || (str = (String) AbstractC0878AGe.A0A(2, listDeeplinkRouteSegments)) == null || C7BY.A0j(str)) {
                return null;
            }
            return new AuraDeeplinkRoute(new SpacesModalScreenKey(str, null, false), LaunchFlag.NAVIGATE, null);
        }
    }
}
