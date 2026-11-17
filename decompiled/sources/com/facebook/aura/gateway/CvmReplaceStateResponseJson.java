package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import com.facebook.aura.gateway.HatchCvmReplacement;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CvmReplaceStateResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String attempt_id;
    public final Long claim_expires_at;
    public final String owner_nonce;
    public final String reason;
    public final String state;

    public final class Companion {
        public final C9hr<CvmReplaceStateResponseJson> serializer() {
            return CvmReplaceStateResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CvmReplaceStateResponseJson(String str, String str2, String str3, Long l, String str4) {
        C7384Etj.A0Y(str, 0);
        this.state = str;
        this.attempt_id = str2;
        this.owner_nonce = str3;
        this.claim_expires_at = l;
        this.reason = str4;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CvmReplaceStateResponseJson cvmReplaceStateResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(cvmReplaceStateResponseJson.state)) {
            c9j5.AAV(cvmReplaceStateResponseJson.state, c9iZ, 0);
        }
        if (zAfR || cvmReplaceStateResponseJson.attempt_id != null) {
            c9j5.AAP(cvmReplaceStateResponseJson.attempt_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || cvmReplaceStateResponseJson.owner_nonce != null) {
            c9j5.AAP(cvmReplaceStateResponseJson.owner_nonce, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || cvmReplaceStateResponseJson.claim_expires_at != null) {
            c9j5.AAP(cvmReplaceStateResponseJson.claim_expires_at, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || cvmReplaceStateResponseJson.reason != null) {
            c9j5.AAP(cvmReplaceStateResponseJson.reason, C07779iq.A01, c9iZ, 4);
        }
    }

    public final CvmReplaceStateResponseJson copy(String str, String str2, String str3, Long l, String str4) {
        C7384Etj.A0Y(str, 0);
        return new CvmReplaceStateResponseJson(str, str2, str3, l, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CvmReplaceStateResponseJson) {
                CvmReplaceStateResponseJson cvmReplaceStateResponseJson = (CvmReplaceStateResponseJson) obj;
                if (!C7384Etj.areEqual(this.state, cvmReplaceStateResponseJson.state) || !C7384Etj.areEqual(this.attempt_id, cvmReplaceStateResponseJson.attempt_id) || !C7384Etj.areEqual(this.owner_nonce, cvmReplaceStateResponseJson.owner_nonce) || !C7384Etj.areEqual(this.claim_expires_at, cvmReplaceStateResponseJson.claim_expires_at) || !C7384Etj.areEqual(this.reason, cvmReplaceStateResponseJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HatchCvmReplacement toDomain(String str) {
        HatchCvmReplacement hatchCvmReplacement;
        HatchVmState hatchVmStateFromWire;
        C7384Etj.A0Y(str, 0);
        String str2 = this.attempt_id;
        if (str2 == null || str2.length() <= 0 || (hatchVmStateFromWire = HatchVmState.Companion.fromWire(this.state)) == HatchVmState.RUNNING) {
            hatchCvmReplacement = HatchCvmReplacement.None.INSTANCE;
        } else {
            if (HatchCvmReplaceStoreKt.isCvmReplacement(hatchVmStateFromWire)) {
                String str3 = this.owner_nonce;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                return new HatchCvmReplacement.Active(str, str2, hatchVmStateFromWire, str3, this.claim_expires_at);
            }
            hatchCvmReplacement = HatchCvmReplacement.Unknown.INSTANCE;
        }
        return hatchCvmReplacement;
    }

    public static /* synthetic */ CvmReplaceStateResponseJson copy$default(CvmReplaceStateResponseJson cvmReplaceStateResponseJson, String str, String str2, String str3, Long l, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvmReplaceStateResponseJson.state;
        }
        if ((i & 2) != 0) {
            str2 = cvmReplaceStateResponseJson.attempt_id;
        }
        if ((i & 4) != 0) {
            str3 = cvmReplaceStateResponseJson.owner_nonce;
        }
        if ((i & 8) != 0) {
            l = cvmReplaceStateResponseJson.claim_expires_at;
        }
        if ((i & 16) != 0) {
            str4 = cvmReplaceStateResponseJson.reason;
        }
        return cvmReplaceStateResponseJson.copy(str, str2, str3, l, str4);
    }

    public final String component1() {
        return this.state;
    }

    public final String component2() {
        return this.attempt_id;
    }

    public final String component3() {
        return this.owner_nonce;
    }

    public final Long component4() {
        return this.claim_expires_at;
    }

    public final String component5() {
        return this.reason;
    }

    public final String getAttempt_id() {
        return this.attempt_id;
    }

    public final Long getClaim_expires_at() {
        return this.claim_expires_at;
    }

    public final String getOwner_nonce() {
        return this.owner_nonce;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.state) + AnonymousClass006.A0G(this.attempt_id)) * 31) + AnonymousClass006.A0G(this.owner_nonce)) * 31) + AnonymousClass006.A0D(this.claim_expires_at)) * 31) + AnonymousClass005.A0H(this.reason);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CvmReplaceStateResponseJson(String str, String str2, String str3, Long l, String str4, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4);
    }

    public /* synthetic */ CvmReplaceStateResponseJson(int i, String str, String str2, String str3, Long l, String str4, C2hx c2hx) {
        this.state = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.attempt_id = null;
        } else {
            this.attempt_id = str2;
        }
        if ((i & 4) == 0) {
            this.owner_nonce = null;
        } else {
            this.owner_nonce = str3;
        }
        if ((i & 8) == 0) {
            this.claim_expires_at = null;
        } else {
            this.claim_expires_at = l;
        }
        if ((i & 16) == 0) {
            this.reason = null;
        } else {
            this.reason = str4;
        }
    }

    public CvmReplaceStateResponseJson() {
        this("", null, null, null, null);
    }
}
