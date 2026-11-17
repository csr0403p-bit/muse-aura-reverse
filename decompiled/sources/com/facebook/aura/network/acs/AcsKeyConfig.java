package com.facebook.aura.network.acs;

import X.A7u;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C8j4;
import android.util.Base64;

/* loaded from: classes4.dex */
public final class AcsKeyConfig extends C06G {
    public static final Companion Companion = new Companion();
    public static final long UNLIMITED_TOKEN_TTL_MILLIS = 4611686018427387903L;
    public final int cipherSuite;
    public final String configId;
    public final long expireTimeSeconds;
    public final int maxEval;
    public final String publicKeyBase64;
    public final int redemptionLimit;
    public final long tokenTtlSeconds;

    public static /* synthetic */ AcsKeyConfig copy$default(AcsKeyConfig acsKeyConfig, String str, String str2, int i, int i2, int i3, long j, long j2, int i4, Object obj) {
        String str3 = str;
        String str4 = str2;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        long j3 = j;
        long j4 = j2;
        if ((i4 & 1) != 0) {
            str3 = acsKeyConfig.configId;
        }
        if ((i4 & 2) != 0) {
            str4 = acsKeyConfig.publicKeyBase64;
        }
        if ((i4 & 4) != 0) {
            i5 = acsKeyConfig.cipherSuite;
        }
        if ((i4 & 8) != 0) {
            i6 = acsKeyConfig.maxEval;
        }
        if ((i4 & 16) != 0) {
            i7 = acsKeyConfig.redemptionLimit;
        }
        if ((i4 & 32) != 0) {
            j3 = acsKeyConfig.expireTimeSeconds;
        }
        if ((i4 & 64) != 0) {
            j4 = acsKeyConfig.tokenTtlSeconds;
        }
        AnonymousClass003.A0u(str3, str4);
        return new AcsKeyConfig(str3, str4, i5, i6, i7, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AcsKeyConfig) {
                AcsKeyConfig acsKeyConfig = (AcsKeyConfig) obj;
                if (!C7384Etj.areEqual(this.configId, acsKeyConfig.configId) || !C7384Etj.areEqual(this.publicKeyBase64, acsKeyConfig.publicKeyBase64) || this.cipherSuite != acsKeyConfig.cipherSuite || this.maxEval != acsKeyConfig.maxEval || this.redemptionLimit != acsKeyConfig.redemptionLimit || this.expireTimeSeconds != acsKeyConfig.expireTimeSeconds || this.tokenTtlSeconds != acsKeyConfig.tokenTtlSeconds) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.configId;
    }

    public final String component2() {
        return this.publicKeyBase64;
    }

    public final int component3() {
        return this.cipherSuite;
    }

    public final int component4() {
        return this.maxEval;
    }

    public final int component5() {
        return this.redemptionLimit;
    }

    public final long component6() {
        return this.expireTimeSeconds;
    }

    public final long component7() {
        return this.tokenTtlSeconds;
    }

    public final int getCipherSuite() {
        return this.cipherSuite;
    }

    public final String getConfigId() {
        return this.configId;
    }

    public final long getExpireTimeMillis() {
        return this.expireTimeSeconds * 1000;
    }

    public final long getExpireTimeSeconds() {
        return this.expireTimeSeconds;
    }

    public final int getMaxEval() {
        return this.maxEval;
    }

    public final String getPublicKeyBase64() {
        return this.publicKeyBase64;
    }

    public final int getRedemptionLimit() {
        return this.redemptionLimit;
    }

    public final long getTokenTtlMillis() {
        long j = this.tokenTtlSeconds;
        return j > 0 ? j * 1000 : UNLIMITED_TOKEN_TTL_MILLIS;
    }

    public final long getTokenTtlSeconds() {
        return this.tokenTtlSeconds;
    }

    public int hashCode() {
        return C8j4.A0B(this.tokenTtlSeconds, AnonymousClass006.A06(this.expireTimeSeconds, (((((AnonymousClass005.A0I(this.publicKeyBase64, AnonymousClass001.A0G(this.configId)) + this.cipherSuite) * 31) + this.maxEval) * 31) + this.redemptionLimit) * 31));
    }

    public final A7u toServerConfig() {
        String str = this.configId;
        int i = this.cipherSuite;
        byte[] bArrDecode = Base64.decode(this.publicKeyBase64, 8);
        int i2 = this.maxEval;
        int i3 = this.redemptionLimit;
        long j = this.expireTimeSeconds * 1000;
        long tokenTtlMillis = getTokenTtlMillis();
        A7u a7u = new A7u();
        a7u.A05 = str;
        a7u.A00 = i;
        a7u.A06 = bArrDecode;
        a7u.A01 = i2;
        a7u.A02 = i3;
        a7u.A03 = j;
        a7u.A04 = tokenTtlMillis;
        return a7u;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AcsKeyConfig(String str, String str2, int i, int i2, int i3, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        this.configId = str;
        this.publicKeyBase64 = str2;
        this.cipherSuite = i;
        this.maxEval = i2;
        this.redemptionLimit = i3;
        this.expireTimeSeconds = j;
        this.tokenTtlSeconds = j2;
    }

    public final AcsKeyConfig copy(String str, String str2, int i, int i2, int i3, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        return new AcsKeyConfig(str, str2, i, i2, i3, j, j2);
    }

    public String toString() {
        return super.toString();
    }
}
