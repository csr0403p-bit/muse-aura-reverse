package com.facebook.aura.network.notary;

import X.C3cG;
import X.CFK;
import X.FGI;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes4.dex */
public abstract class HatchNotaryTokenCacheKt {
    public static final long EXPIRATION_SKEW_SECONDS = 60;
    public static final String MINT_SKIPPED = "notary_mint_skipped";
    public static final String NOTARY_AUTHORIZATION_HEADER = "X-Hatch-Notary-Authorization";
    public static final String NO_TOKEN_FOR_ROUTE = "notary_no_token_for_route";
    public static final String NO_VM_ID = "notary_no_vm_id";
    public static final String STALE_USER = "notary_stale_user";
    public static final String TAG = "HatchNotaryTokenCache";

    public static final boolean isExpired(MintedNotaryTokens mintedNotaryTokens, long j) {
        Long l = mintedNotaryTokens.expirationTs;
        return l != null && j + 60 >= l.longValue();
    }

    public static final NetworkException notaryException(String str, String str2) {
        CFK.A06(TAG, FGI.A0U(str2, ": ", str));
        return new NetworkException(str, -1, str2, null, null, null, null);
    }

    public static final <T> Object notaryFailure(String str, String str2) {
        return C3cG.A0s(notaryException(str, str2));
    }
}
