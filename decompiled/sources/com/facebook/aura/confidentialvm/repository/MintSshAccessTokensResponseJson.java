package com.facebook.aura.confidentialvm.repository;

import X.AGH;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import com.facebook.aura.network.notary.MintedNotaryTokens;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class MintSshAccessTokensResponseJson extends C06G {
    public final Long notary_token_expiration_ts;
    public final Map<String, String> tokens;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, MintSshAccessTokensResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<MintSshAccessTokensResponseJson> serializer() {
            return MintSshAccessTokensResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MintSshAccessTokensResponseJson(Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 0);
        this.tokens = map;
        this.notary_token_expiration_ts = l;
    }

    public final MintSshAccessTokensResponseJson copy(Map<String, String> map, Long l) {
        C7384Etj.A0Y(map, 0);
        return new MintSshAccessTokensResponseJson(map, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MintSshAccessTokensResponseJson) {
                MintSshAccessTokensResponseJson mintSshAccessTokensResponseJson = (MintSshAccessTokensResponseJson) obj;
                if (!C7384Etj.areEqual(this.tokens, mintSshAccessTokensResponseJson.tokens) || !C7384Etj.areEqual(this.notary_token_expiration_ts, mintSshAccessTokensResponseJson.notary_token_expiration_ts)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MintSshAccessTokensResponseJson copy$default(MintSshAccessTokensResponseJson mintSshAccessTokensResponseJson, Map map, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            map = mintSshAccessTokensResponseJson.tokens;
        }
        if ((i & 2) != 0) {
            l = mintSshAccessTokensResponseJson.notary_token_expiration_ts;
        }
        C7384Etj.A0Y(map, 0);
        return new MintSshAccessTokensResponseJson(map, l);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(MintSshAccessTokensResponseJson mintSshAccessTokensResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1M(mintSshAccessTokensResponseJson.tokens)) {
            c9j5.AAQ(mintSshAccessTokensResponseJson.tokens, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || mintSshAccessTokensResponseJson.notary_token_expiration_ts != null) {
            c9j5.AAP(mintSshAccessTokensResponseJson.notary_token_expiration_ts, C9j1.A00, c9iZ, 1);
        }
    }

    public final Map<String, String> component1() {
        return this.tokens;
    }

    public final Long component2() {
        return this.notary_token_expiration_ts;
    }

    public final Long getNotary_token_expiration_ts() {
        return this.notary_token_expiration_ts;
    }

    public final Map<String, String> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.tokens) + AnonymousClass006.A0D(this.notary_token_expiration_ts);
    }

    public final MintedNotaryTokens toDomain() {
        Map<String, String> map = this.tokens;
        Long l = this.notary_token_expiration_ts;
        if (l == null || l.longValue() <= 0) {
            l = null;
        }
        return new MintedNotaryTokens(map, l);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MintSshAccessTokensResponseJson(int i, Map map, Long l, C2hx c2hx) {
        this.tokens = (i & 1) == 0 ? AGH.A0E() : map;
        if ((i & 2) == 0) {
            this.notary_token_expiration_ts = null;
        } else {
            this.notary_token_expiration_ts = l;
        }
    }

    public /* synthetic */ MintSshAccessTokensResponseJson(Map map, Long l, int i, C06H c06h) {
        this(C3cH.A0o(map, i & 1), (i & 2) != 0 ? null : l);
    }

    public MintSshAccessTokensResponseJson() {
        this(AGH.A0E(), null);
    }
}
