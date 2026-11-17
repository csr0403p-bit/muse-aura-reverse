package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRouteSpec {
    public static final int $stable = 0;
    public final String exactPath;
    public final G0U<Uri, Boolean> fallbackMatch;
    public final G0U<Uri, Boolean> hasRoute;
    public final AuraDeeplinkAccessScope hatchAccessScope;
    public final AuraDeeplinkAccessScope httpsAccessScope;
    public final G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> resolveRoute;
    public final boolean resolvesAfterActivation;
    public final String routeName;
    public final String scheme;

    /* renamed from: com.facebook.aura.deeplink.AuraDeeplinkRouteSpec$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public final /* synthetic */ AuraDeeplinkRoute $route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraDeeplinkRoute auraDeeplinkRoute) {
            super(2);
            this.$route = auraDeeplinkRoute;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final AuraDeeplinkRoute invoke2(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            return this.$route;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            return this.$route;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraDeeplinkRouteSpec(String str, String str2, String str3, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2, boolean z, G0U<? super Uri, Boolean> g0u, G0U<? super Uri, Boolean> g0u2, G0V<? super Uri, ? super AbstractC3358CGz, AuraDeeplinkRoute> g0v) {
        AnonymousClass005.A12(str, auraDeeplinkAccessScope, auraDeeplinkAccessScope2, 0);
        C60O.A1N(g0u2, 7, g0v);
        this.routeName = str;
        this.exactPath = str2;
        this.scheme = str3;
        this.hatchAccessScope = auraDeeplinkAccessScope;
        this.httpsAccessScope = auraDeeplinkAccessScope2;
        this.resolvesAfterActivation = z;
        this.fallbackMatch = g0u;
        this.hasRoute = g0u2;
        this.resolveRoute = g0v;
    }

    /* renamed from: com.facebook.aura.deeplink.AuraDeeplinkRouteSpec$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Uri uri) {
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
            return AnonymousClass001.A0i();
        }
    }

    public final String getExactPath() {
        return this.exactPath;
    }

    public final G0U<Uri, Boolean> getFallbackMatch() {
        return this.fallbackMatch;
    }

    public final G0U<Uri, Boolean> getHasRoute() {
        return this.hasRoute;
    }

    public final AuraDeeplinkAccessScope getHatchAccessScope() {
        return this.hatchAccessScope;
    }

    public final AuraDeeplinkAccessScope getHttpsAccessScope() {
        return this.httpsAccessScope;
    }

    public final G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> getResolveRoute() {
        return this.resolveRoute;
    }

    public final boolean getResolvesAfterActivation() {
        return this.resolvesAfterActivation;
    }

    public final String getRouteName() {
        return this.routeName;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public /* synthetic */ AuraDeeplinkRouteSpec(String str, String str2, String str3, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2, boolean z, G0U g0u, G0U g0u2, G0V g0v, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope, (i & 16) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : g0u, (i & 128) != 0 ? AnonymousClass1.INSTANCE : g0u2, g0v);
    }

    public /* synthetic */ AuraDeeplinkRouteSpec(String str, String str2, AuraDeeplinkRoute auraDeeplinkRoute, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2, int i, C06H c06h) {
        this(str, str2, auraDeeplinkRoute, (i & 8) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope, (i & 16) != 0 ? AuraDeeplinkAccessScope.ALL_FAMILY : auraDeeplinkAccessScope2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuraDeeplinkRouteSpec(String str, String str2, AuraDeeplinkRoute auraDeeplinkRoute, AuraDeeplinkAccessScope auraDeeplinkAccessScope, AuraDeeplinkAccessScope auraDeeplinkAccessScope2) {
        this(str, str2, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope2, false, null, AnonymousClass1.INSTANCE, new AnonymousClass2(auraDeeplinkRoute));
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(str2, auraDeeplinkRoute, auraDeeplinkAccessScope, 1);
        C7384Etj.A0Y(auraDeeplinkAccessScope2, 4);
    }
}
