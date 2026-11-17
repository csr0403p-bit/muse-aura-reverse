package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalIntentContextJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ApprovalIntentToolJson tool;

    public final class Companion {
        public final C9hr<ApprovalIntentContextJson> serializer() {
            return ApprovalIntentContextJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ApprovalIntentContextJson copy(ApprovalIntentToolJson approvalIntentToolJson) {
        C7384Etj.A0Y(approvalIntentToolJson, 0);
        return new ApprovalIntentContextJson(approvalIntentToolJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ApprovalIntentContextJson) && C7384Etj.areEqual(this.tool, ((ApprovalIntentContextJson) obj).tool));
    }

    public /* synthetic */ ApprovalIntentContextJson(int i, ApprovalIntentToolJson approvalIntentToolJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ApprovalIntentContextJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.tool = approvalIntentToolJson;
    }

    public static /* synthetic */ ApprovalIntentContextJson copy$default(ApprovalIntentContextJson approvalIntentContextJson, ApprovalIntentToolJson approvalIntentToolJson, int i, Object obj) {
        if ((i & 1) != 0) {
            approvalIntentToolJson = approvalIntentContextJson.tool;
        }
        C7384Etj.A0Y(approvalIntentToolJson, 0);
        return new ApprovalIntentContextJson(approvalIntentToolJson);
    }

    public final ApprovalIntentToolJson component1() {
        return this.tool;
    }

    public final ApprovalIntentToolJson getTool() {
        return this.tool;
    }

    public int hashCode() {
        return this.tool.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ApprovalIntentContextJson(ApprovalIntentToolJson approvalIntentToolJson) {
        C7384Etj.A0Y(approvalIntentToolJson, 0);
        this.tool = approvalIntentToolJson;
    }
}
