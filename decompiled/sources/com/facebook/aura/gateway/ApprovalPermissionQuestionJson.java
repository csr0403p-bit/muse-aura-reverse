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
public final class ApprovalPermissionQuestionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String text;

    public final class Companion {
        public final C9hr<ApprovalPermissionQuestionJson> serializer() {
            return ApprovalPermissionQuestionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalPermissionQuestionJson approvalPermissionQuestionJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || approvalPermissionQuestionJson.text != null) {
            c9j5.AAP(approvalPermissionQuestionJson.text, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ApprovalPermissionQuestionJson) && C7384Etj.areEqual(this.text, ((ApprovalPermissionQuestionJson) obj).text));
    }

    public static /* synthetic */ ApprovalPermissionQuestionJson copy$default(ApprovalPermissionQuestionJson approvalPermissionQuestionJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalPermissionQuestionJson.text;
        }
        return new ApprovalPermissionQuestionJson(str);
    }

    public final String component1() {
        return this.text;
    }

    public final ApprovalPermissionQuestionJson copy(String str) {
        return new ApprovalPermissionQuestionJson(str);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.text);
    }

    public /* synthetic */ ApprovalPermissionQuestionJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ApprovalPermissionQuestionJson(String str) {
        this.text = str;
    }

    public /* synthetic */ ApprovalPermissionQuestionJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ApprovalPermissionQuestionJson() {
        this(null);
    }
}
