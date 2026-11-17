package com.facebook.aura.network.notary;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MintedNotaryTokens extends C06G {
    public final Long expirationTs;
    public final Map<String, String> tokens;

    public MintedNotaryTokens(Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 0);
        this.tokens = map;
        this.expirationTs = l;
    }

    public final MintedNotaryTokens copy(Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 0);
        return new MintedNotaryTokens(map, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MintedNotaryTokens) {
                MintedNotaryTokens mintedNotaryTokens = (MintedNotaryTokens) obj;
                if (!C7384Etj.areEqual(this.tokens, mintedNotaryTokens.tokens) || !C7384Etj.areEqual(this.expirationTs, mintedNotaryTokens.expirationTs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MintedNotaryTokens copy$default(MintedNotaryTokens mintedNotaryTokens, Map map, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            map = mintedNotaryTokens.tokens;
        }
        if ((i & 2) != 0) {
            l = mintedNotaryTokens.expirationTs;
        }
        C7384Etj.A0Y(map, 0);
        return new MintedNotaryTokens(map, l);
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

    public String toString() {
        return super.toString();
    }
}
