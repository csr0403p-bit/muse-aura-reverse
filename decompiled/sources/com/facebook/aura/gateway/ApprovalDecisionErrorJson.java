package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalDecisionErrorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String code;
    public final Integer status;

    public final class Companion {
        public final C9hr<ApprovalDecisionErrorJson> serializer() {
            return ApprovalDecisionErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalDecisionErrorJson approvalDecisionErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalDecisionErrorJson.status != null) {
            c9j5.AAP(approvalDecisionErrorJson.status, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || approvalDecisionErrorJson.code != null) {
            c9j5.AAP(approvalDecisionErrorJson.code, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalDecisionErrorJson) {
                ApprovalDecisionErrorJson approvalDecisionErrorJson = (ApprovalDecisionErrorJson) obj;
                if (!C7384Etj.areEqual(this.status, approvalDecisionErrorJson.status) || !C7384Etj.areEqual(this.code, approvalDecisionErrorJson.code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalDecisionErrorJson copy$default(ApprovalDecisionErrorJson approvalDecisionErrorJson, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = approvalDecisionErrorJson.status;
        }
        if ((i & 2) != 0) {
            str = approvalDecisionErrorJson.code;
        }
        return new ApprovalDecisionErrorJson(num, str);
    }

    public final Integer component1() {
        return this.status;
    }

    public final String component2() {
        return this.code;
    }

    public final ApprovalDecisionErrorJson copy(Integer num, String str) {
        return new ApprovalDecisionErrorJson(num, str);
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.status) * 31) + AnonymousClass005.A0H(this.code);
    }

    public ApprovalDecisionErrorJson(Integer num, String str) {
        this.status = num;
        this.code = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalDecisionErrorJson(int i, Integer num, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        if ((i & 2) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
    }

    public /* synthetic */ ApprovalDecisionErrorJson(Integer num, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }

    public ApprovalDecisionErrorJson() {
        this(null, null);
    }
}
