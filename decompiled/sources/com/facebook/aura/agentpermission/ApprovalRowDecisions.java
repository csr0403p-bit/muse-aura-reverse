package com.facebook.aura.agentpermission;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C2273BRq;
import X.C7384Etj;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;

/* loaded from: classes.dex */
public final class ApprovalRowDecisions extends C06G {
    public static final int $stable = 8;
    public final AHD<C2273BRq<AgentPermissionDecisionOption>> options;
    public final boolean reviewsOnCard;

    public ApprovalRowDecisions(boolean z, AHD<C2273BRq<AgentPermissionDecisionOption>> ahd) {
        C7384Etj.A0Y(ahd, 1);
        this.reviewsOnCard = z;
        this.options = ahd;
    }

    public final ApprovalRowDecisions copy(boolean z, AHD<C2273BRq<AgentPermissionDecisionOption>> ahd) {
        C7384Etj.A0Y(ahd, 1);
        return new ApprovalRowDecisions(z, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRowDecisions) {
                ApprovalRowDecisions approvalRowDecisions = (ApprovalRowDecisions) obj;
                if (this.reviewsOnCard != approvalRowDecisions.reviewsOnCard || !C7384Etj.areEqual(this.options, approvalRowDecisions.options)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRowDecisions copy$default(ApprovalRowDecisions approvalRowDecisions, boolean z, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            z = approvalRowDecisions.reviewsOnCard;
        }
        if ((i & 2) != 0) {
            ahd = approvalRowDecisions.options;
        }
        C7384Etj.A0Y(ahd, 1);
        return new ApprovalRowDecisions(z, ahd);
    }

    public final boolean component1() {
        return this.reviewsOnCard;
    }

    public final AHD<C2273BRq<AgentPermissionDecisionOption>> component2() {
        return this.options;
    }

    public final AHD<C2273BRq<AgentPermissionDecisionOption>> getOptions() {
        return this.options;
    }

    public final boolean getReviewsOnCard() {
        return this.reviewsOnCard;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.options, C0KA.A02(this.reviewsOnCard));
    }

    public String toString() {
        return super.toString();
    }
}
