package com.facebook.aura.network.notary;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CacheKey extends C06G {
    public final String mintEndpoint;
    public final String vmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CacheKey) {
                CacheKey cacheKey = (CacheKey) obj;
                if (!C7384Etj.areEqual(this.mintEndpoint, cacheKey.mintEndpoint) || !C7384Etj.areEqual(this.vmId, cacheKey.vmId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cacheKey.mintEndpoint;
        }
        if ((i & 2) != 0) {
            str2 = cacheKey.vmId;
        }
        AnonymousClass003.A0u(str, str2);
        return new CacheKey(str, str2);
    }

    public final String component1() {
        return this.mintEndpoint;
    }

    public final String component2() {
        return this.vmId;
    }

    public final String getMintEndpoint() {
        return this.mintEndpoint;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.vmId, AnonymousClass001.A0G(this.mintEndpoint));
    }

    public CacheKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.mintEndpoint = str;
        this.vmId = str2;
    }

    public final CacheKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new CacheKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
