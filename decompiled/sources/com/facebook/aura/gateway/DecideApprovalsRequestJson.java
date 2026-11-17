package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DecideApprovalsRequestJson extends C06G {
    public static final int $stable = 8;
    public final List<ApprovalDecisionJson> decisions;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, DecideApprovalsRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<DecideApprovalsRequestJson> serializer() {
            return DecideApprovalsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final DecideApprovalsRequestJson copy(List<ApprovalDecisionJson> list) {
        C7384Etj.A0Y(list, 0);
        return new DecideApprovalsRequestJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DecideApprovalsRequestJson) && C7384Etj.areEqual(this.decisions, ((DecideApprovalsRequestJson) obj).decisions));
    }

    public /* synthetic */ DecideApprovalsRequestJson(int i, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(DecideApprovalsRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.decisions = list;
    }

    public static /* synthetic */ DecideApprovalsRequestJson copy$default(DecideApprovalsRequestJson decideApprovalsRequestJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = decideApprovalsRequestJson.decisions;
        }
        C7384Etj.A0Y(list, 0);
        return new DecideApprovalsRequestJson(list);
    }

    public final List<ApprovalDecisionJson> component1() {
        return this.decisions;
    }

    public final List<ApprovalDecisionJson> getDecisions() {
        return this.decisions;
    }

    public int hashCode() {
        return this.decisions.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public DecideApprovalsRequestJson(List<ApprovalDecisionJson> list) {
        C7384Etj.A0Y(list, 0);
        this.decisions = list;
    }
}
