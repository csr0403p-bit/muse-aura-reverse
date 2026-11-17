package com.facebook.aura.network.acs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class KeyConfigDetailsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int cipherSuite;
    public final int curve;
    public final long expireTime;
    public final int kdf;
    public final int maxEval;
    public final String publicKeyBase64;
    public final int redemptionLimit;
    public final long tokenTtl;
    public final int version;

    public final class Companion {
        public final C9hr<KeyConfigDetailsJson> serializer() {
            return KeyConfigDetailsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(KeyConfigDetailsJson keyConfigDetailsJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(keyConfigDetailsJson.publicKeyBase64, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, keyConfigDetailsJson.cipherSuite);
        c9j5.AAK(c9iZ, 2, keyConfigDetailsJson.maxEval);
        c9j5.AAK(c9iZ, 3, keyConfigDetailsJson.redemptionLimit);
        c9j5.AAN(c9iZ, 4, keyConfigDetailsJson.expireTime);
        c9j5.AAN(c9iZ, 5, keyConfigDetailsJson.tokenTtl);
        boolean zAfR = c9j5.AfR();
        if (zAfR || keyConfigDetailsJson.curve != 0) {
            c9j5.AAK(c9iZ, 6, keyConfigDetailsJson.curve);
        }
        if (zAfR || keyConfigDetailsJson.kdf != 0) {
            c9j5.AAK(c9iZ, 7, keyConfigDetailsJson.kdf);
        }
        if (zAfR || keyConfigDetailsJson.version != 0) {
            c9j5.AAK(c9iZ, 8, keyConfigDetailsJson.version);
        }
    }

    public final KeyConfigDetailsJson copy(String str, int i, int i2, int i3, long j, long j2, int i4, int i5, int i6) {
        C7384Etj.A0Y(str, 0);
        return new KeyConfigDetailsJson(str, i, i2, i3, j, j2, i4, i5, i6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyConfigDetailsJson) {
                KeyConfigDetailsJson keyConfigDetailsJson = (KeyConfigDetailsJson) obj;
                if (!C7384Etj.areEqual(this.publicKeyBase64, keyConfigDetailsJson.publicKeyBase64) || this.cipherSuite != keyConfigDetailsJson.cipherSuite || this.maxEval != keyConfigDetailsJson.maxEval || this.redemptionLimit != keyConfigDetailsJson.redemptionLimit || this.expireTime != keyConfigDetailsJson.expireTime || this.tokenTtl != keyConfigDetailsJson.tokenTtl || this.curve != keyConfigDetailsJson.curve || this.kdf != keyConfigDetailsJson.kdf || this.version != keyConfigDetailsJson.version) {
                }
            }
            return false;
        }
        return true;
    }

    public final AcsKeyConfig toDomain(String str) {
        C7384Etj.A0Y(str, 0);
        return new AcsKeyConfig(str, this.publicKeyBase64, this.cipherSuite, this.maxEval, this.redemptionLimit, this.expireTime, this.tokenTtl);
    }

    public /* synthetic */ KeyConfigDetailsJson(int i, String str, int i2, int i3, int i4, long j, long j2, int i5, int i6, int i7, C2hx c2hx) {
        if (63 != (i & 63)) {
            C9iI.A00(KeyConfigDetailsJson$$serializer.descriptor, i, 63);
            throw F60.createAndThrow();
        }
        this.publicKeyBase64 = str;
        this.cipherSuite = i2;
        this.maxEval = i3;
        this.redemptionLimit = i4;
        this.expireTime = j;
        this.tokenTtl = j2;
        if ((i & 64) == 0) {
            this.curve = 0;
        } else {
            this.curve = i5;
        }
        if ((i & 128) == 0) {
            this.kdf = 0;
        } else {
            this.kdf = i6;
        }
        if ((i & 256) == 0) {
            this.version = 0;
        } else {
            this.version = i7;
        }
    }

    public static /* synthetic */ KeyConfigDetailsJson copy$default(KeyConfigDetailsJson keyConfigDetailsJson, String str, int i, int i2, int i3, long j, long j2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = keyConfigDetailsJson.publicKeyBase64;
        }
        if ((i7 & 2) != 0) {
            i = keyConfigDetailsJson.cipherSuite;
        }
        if ((i7 & 4) != 0) {
            i2 = keyConfigDetailsJson.maxEval;
        }
        if ((i7 & 8) != 0) {
            i3 = keyConfigDetailsJson.redemptionLimit;
        }
        if ((i7 & 16) != 0) {
            j = keyConfigDetailsJson.expireTime;
        }
        if ((i7 & 32) != 0) {
            j2 = keyConfigDetailsJson.tokenTtl;
        }
        if ((i7 & 64) != 0) {
            i4 = keyConfigDetailsJson.curve;
        }
        if ((i7 & 128) != 0) {
            i5 = keyConfigDetailsJson.kdf;
        }
        if ((i7 & 256) != 0) {
            i6 = keyConfigDetailsJson.version;
        }
        return keyConfigDetailsJson.copy(str, i, i2, i3, j, j2, i4, i5, i6);
    }

    public final String component1() {
        return this.publicKeyBase64;
    }

    public final int component2() {
        return this.cipherSuite;
    }

    public final int component3() {
        return this.maxEval;
    }

    public final int component4() {
        return this.redemptionLimit;
    }

    public final long component5() {
        return this.expireTime;
    }

    public final long component6() {
        return this.tokenTtl;
    }

    public final int component7() {
        return this.curve;
    }

    public final int component8() {
        return this.kdf;
    }

    public final int component9() {
        return this.version;
    }

    public final int getCipherSuite() {
        return this.cipherSuite;
    }

    public final int getCurve() {
        return this.curve;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final int getKdf() {
        return this.kdf;
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

    public final long getTokenTtl() {
        return this.tokenTtl;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((AnonymousClass006.A06(this.tokenTtl, AnonymousClass006.A06(this.expireTime, (((((AnonymousClass001.A0G(this.publicKeyBase64) + this.cipherSuite) * 31) + this.maxEval) * 31) + this.redemptionLimit) * 31)) + this.curve) * 31) + this.kdf) * 31) + this.version;
    }

    public String toString() {
        return super.toString();
    }

    public KeyConfigDetailsJson(String str, int i, int i2, int i3, long j, long j2, int i4, int i5, int i6) {
        C7384Etj.A0Y(str, 0);
        this.publicKeyBase64 = str;
        this.cipherSuite = i;
        this.maxEval = i2;
        this.redemptionLimit = i3;
        this.expireTime = j;
        this.tokenTtl = j2;
        this.curve = i4;
        this.kdf = i5;
        this.version = i6;
    }

    public /* synthetic */ KeyConfigDetailsJson(String str, int i, int i2, int i3, long j, long j2, int i4, int i5, int i6, int i7, C06H c06h) {
        this(str, i, i2, i3, j, j2, (i7 & 64) != 0 ? 0 : i4, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) != 0 ? 0 : i6);
    }
}
