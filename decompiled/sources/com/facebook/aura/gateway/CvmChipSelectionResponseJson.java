package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CvmChipSelectionResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer allow_retry_after_secs;
    public final String owner_nonce;
    public final String reason;
    public final String response_class;

    public final class Companion {
        public final C9hr<CvmChipSelectionResponseJson> serializer() {
            return CvmChipSelectionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CvmChipSelectionResponseJson(String str, String str2, Integer num, String str3) {
        C7384Etj.A0Y(str, 0);
        this.response_class = str;
        this.reason = str2;
        this.allow_retry_after_secs = num;
        this.owner_nonce = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CvmChipSelectionResponseJson cvmChipSelectionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(cvmChipSelectionResponseJson.response_class)) {
            c9j5.AAV(cvmChipSelectionResponseJson.response_class, c9iZ, 0);
        }
        if (zAfR || cvmChipSelectionResponseJson.reason != null) {
            c9j5.AAP(cvmChipSelectionResponseJson.reason, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || cvmChipSelectionResponseJson.allow_retry_after_secs != null) {
            c9j5.AAP(cvmChipSelectionResponseJson.allow_retry_after_secs, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || cvmChipSelectionResponseJson.owner_nonce != null) {
            c9j5.AAP(cvmChipSelectionResponseJson.owner_nonce, C07779iq.A01, c9iZ, 3);
        }
    }

    public final CvmChipSelectionResponseJson copy(String str, String str2, Integer num, String str3) {
        C7384Etj.A0Y(str, 0);
        return new CvmChipSelectionResponseJson(str, str2, num, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CvmChipSelectionResponseJson) {
                CvmChipSelectionResponseJson cvmChipSelectionResponseJson = (CvmChipSelectionResponseJson) obj;
                if (!C7384Etj.areEqual(this.response_class, cvmChipSelectionResponseJson.response_class) || !C7384Etj.areEqual(this.reason, cvmChipSelectionResponseJson.reason) || !C7384Etj.areEqual(this.allow_retry_after_secs, cvmChipSelectionResponseJson.allow_retry_after_secs) || !C7384Etj.areEqual(this.owner_nonce, cvmChipSelectionResponseJson.owner_nonce)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CvmChipSelectionResponseJson copy$default(CvmChipSelectionResponseJson cvmChipSelectionResponseJson, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvmChipSelectionResponseJson.response_class;
        }
        if ((i & 2) != 0) {
            str2 = cvmChipSelectionResponseJson.reason;
        }
        if ((i & 4) != 0) {
            num = cvmChipSelectionResponseJson.allow_retry_after_secs;
        }
        if ((i & 8) != 0) {
            str3 = cvmChipSelectionResponseJson.owner_nonce;
        }
        C7384Etj.A0Y(str, 0);
        return new CvmChipSelectionResponseJson(str, str2, num, str3);
    }

    public final String component1() {
        return this.response_class;
    }

    public final String component2() {
        return this.reason;
    }

    public final Integer component3() {
        return this.allow_retry_after_secs;
    }

    public final String component4() {
        return this.owner_nonce;
    }

    public final Integer getAllow_retry_after_secs() {
        return this.allow_retry_after_secs;
    }

    public final String getOwner_nonce() {
        return this.owner_nonce;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getResponse_class() {
        return this.response_class;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.response_class) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass006.A0D(this.allow_retry_after_secs)) * 31) + AnonymousClass005.A0H(this.owner_nonce);
    }

    public final HatchCvmChipSelectionOutcome toDomain() {
        return new HatchCvmChipSelectionOutcome(HatchCvmChipSelectionResponseClass.Companion.fromWire(this.response_class), this.allow_retry_after_secs, this.owner_nonce);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CvmChipSelectionResponseJson(int i, String str, String str2, Integer num, String str3, C2hx c2hx) {
        this.response_class = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.reason = null;
        } else {
            this.reason = str2;
        }
        if ((i & 4) == 0) {
            this.allow_retry_after_secs = null;
        } else {
            this.allow_retry_after_secs = num;
        }
        if ((i & 8) == 0) {
            this.owner_nonce = null;
        } else {
            this.owner_nonce = str3;
        }
    }

    public /* synthetic */ CvmChipSelectionResponseJson(String str, String str2, Integer num, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }

    public CvmChipSelectionResponseJson() {
        this("", null, null, null);
    }
}
