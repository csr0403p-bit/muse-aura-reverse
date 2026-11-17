package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalDecisionOptionLabelJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String scope;

    public final class Companion {
        public final C9hr<ApprovalDecisionOptionLabelJson> serializer() {
            return ApprovalDecisionOptionLabelJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || approvalDecisionOptionLabelJson.scope != null) {
            c9j5.AAP(approvalDecisionOptionLabelJson.scope, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ApprovalDecisionOptionLabelJson) && C7384Etj.areEqual(this.scope, ((ApprovalDecisionOptionLabelJson) obj).scope));
    }

    public static /* synthetic */ ApprovalDecisionOptionLabelJson copy$default(ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalDecisionOptionLabelJson.scope;
        }
        return new ApprovalDecisionOptionLabelJson(str);
    }

    public final String component1() {
        return this.scope;
    }

    public final ApprovalDecisionOptionLabelJson copy(String str) {
        return new ApprovalDecisionOptionLabelJson(str);
    }

    public final String getScope() {
        return this.scope;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.scope);
    }

    public /* synthetic */ ApprovalDecisionOptionLabelJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.scope = null;
        } else {
            this.scope = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ApprovalDecisionOptionLabelJson(String str) {
        this.scope = str;
    }

    public /* synthetic */ ApprovalDecisionOptionLabelJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ApprovalDecisionOptionLabelJson() {
        this(null);
    }
}
