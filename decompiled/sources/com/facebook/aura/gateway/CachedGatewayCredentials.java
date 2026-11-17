package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class CachedGatewayCredentials extends C06G {
    public static final int $stable = 0;
    public final String authToken;
    public final boolean missingCachedVmAuthToken;
    public final boolean shouldFetchCredentials;
    public final String wsUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CachedGatewayCredentials) {
                CachedGatewayCredentials cachedGatewayCredentials = (CachedGatewayCredentials) obj;
                if (!C7384Etj.areEqual(this.wsUrl, cachedGatewayCredentials.wsUrl) || !C7384Etj.areEqual(this.authToken, cachedGatewayCredentials.authToken) || this.shouldFetchCredentials != cachedGatewayCredentials.shouldFetchCredentials || this.missingCachedVmAuthToken != cachedGatewayCredentials.missingCachedVmAuthToken) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CachedGatewayCredentials copy$default(CachedGatewayCredentials cachedGatewayCredentials, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cachedGatewayCredentials.wsUrl;
        }
        if ((i & 2) != 0) {
            str2 = cachedGatewayCredentials.authToken;
        }
        if ((i & 4) != 0) {
            z = cachedGatewayCredentials.shouldFetchCredentials;
        }
        if ((i & 8) != 0) {
            z2 = cachedGatewayCredentials.missingCachedVmAuthToken;
        }
        AnonymousClass003.A0u(str, str2);
        return new CachedGatewayCredentials(str, str2, z, z2);
    }

    public final String component1() {
        return this.wsUrl;
    }

    public final String component2() {
        return this.authToken;
    }

    public final boolean component3() {
        return this.shouldFetchCredentials;
    }

    public final boolean component4() {
        return this.missingCachedVmAuthToken;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final boolean getMissingCachedVmAuthToken() {
        return this.missingCachedVmAuthToken;
    }

    public final boolean getShouldFetchCredentials() {
        return this.shouldFetchCredentials;
    }

    public final String getWsUrl() {
        return this.wsUrl;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0I(this.authToken, AnonymousClass001.A0G(this.wsUrl)), this.shouldFetchCredentials), this.missingCachedVmAuthToken);
    }

    public CachedGatewayCredentials(String str, String str2, boolean z, boolean z2) {
        AnonymousClass003.A0u(str, str2);
        this.wsUrl = str;
        this.authToken = str2;
        this.shouldFetchCredentials = z;
        this.missingCachedVmAuthToken = z2;
    }

    public final CachedGatewayCredentials copy(String str, String str2, boolean z, boolean z2) {
        AnonymousClass003.A0u(str, str2);
        return new CachedGatewayCredentials(str, str2, z, z2);
    }

    public String toString() {
        return super.toString();
    }
}
