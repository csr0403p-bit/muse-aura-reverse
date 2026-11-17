package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class CachedTokens extends C06G {
    public final Long expirationTs;
    public final Map<String, String> tokens;

    public CachedTokens(Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 0);
        this.tokens = map;
        this.expirationTs = l;
    }

    public final CachedTokens copy(Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 0);
        return new CachedTokens(map, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CachedTokens) {
                CachedTokens cachedTokens = (CachedTokens) obj;
                if (!C7384Etj.areEqual(this.tokens, cachedTokens.tokens) || !C7384Etj.areEqual(this.expirationTs, cachedTokens.expirationTs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CachedTokens copy$default(CachedTokens cachedTokens, Map map, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cachedTokens.tokens;
        }
        if ((i & 2) != 0) {
            l = cachedTokens.expirationTs;
        }
        C7384Etj.A0Y(map, 0);
        return new CachedTokens(map, l);
    }

    public final Map<String, String> component1() {
        return this.tokens;
    }

    public final Long component2() {
        return this.expirationTs;
    }

    public final Long getExpirationTs() {
        return this.expirationTs;
    }

    public final Map<String, String> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.tokens) + AnonymousClass006.A0D(this.expirationTs);
    }

    public final boolean isExpired(long j) {
        Long l = this.expirationTs;
        return l != null && j + 60 >= l.longValue();
    }

    public String toString() {
        return super.toString();
    }
}
