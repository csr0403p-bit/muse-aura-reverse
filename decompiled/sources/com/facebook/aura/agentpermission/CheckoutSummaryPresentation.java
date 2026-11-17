package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.CheckoutLodgingCancellation;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutSummaryPresentation extends C06G {
    public static final int $stable = CheckoutLodgingCancellation.$stable;
    public final CheckoutLodgingCancellation cancellation;
    public final List<List<CheckoutAmountPresentation>> groups;
    public final CheckoutPresentationKind kind;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutSummaryPresentation) {
                CheckoutSummaryPresentation checkoutSummaryPresentation = (CheckoutSummaryPresentation) obj;
                if (this.kind != checkoutSummaryPresentation.kind || !C7384Etj.areEqual(this.groups, checkoutSummaryPresentation.groups) || !C7384Etj.areEqual(this.cancellation, checkoutSummaryPresentation.cancellation)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutSummaryPresentation copy$default(CheckoutSummaryPresentation checkoutSummaryPresentation, CheckoutPresentationKind checkoutPresentationKind, List list, CheckoutLodgingCancellation checkoutLodgingCancellation, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutPresentationKind = checkoutSummaryPresentation.kind;
        }
        if ((i & 2) != 0) {
            list = checkoutSummaryPresentation.groups;
        }
        if ((i & 4) != 0) {
            checkoutLodgingCancellation = checkoutSummaryPresentation.cancellation;
        }
        return checkoutSummaryPresentation.copy(checkoutPresentationKind, list, checkoutLodgingCancellation);
    }

    public final CheckoutPresentationKind component1() {
        return this.kind;
    }

    public final List<List<CheckoutAmountPresentation>> component2() {
        return this.groups;
    }

    public final CheckoutLodgingCancellation component3() {
        return this.cancellation;
    }

    public final CheckoutLodgingCancellation getCancellation() {
        return this.cancellation;
    }

    public final List<List<CheckoutAmountPresentation>> getGroups() {
        return this.groups;
    }

    public final CheckoutPresentationKind getKind() {
        return this.kind;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.groups, AnonymousClass005.A0E(this.kind)) + AnonymousClass006.A0D(this.cancellation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutSummaryPresentation(CheckoutPresentationKind checkoutPresentationKind, List<? extends List<CheckoutAmountPresentation>> list, CheckoutLodgingCancellation checkoutLodgingCancellation) {
        AnonymousClass003.A0u(checkoutPresentationKind, list);
        this.kind = checkoutPresentationKind;
        this.groups = list;
        this.cancellation = checkoutLodgingCancellation;
    }

    public final CheckoutSummaryPresentation copy(CheckoutPresentationKind checkoutPresentationKind, List<? extends List<CheckoutAmountPresentation>> list, CheckoutLodgingCancellation checkoutLodgingCancellation) {
        AnonymousClass003.A0u(checkoutPresentationKind, list);
        return new CheckoutSummaryPresentation(checkoutPresentationKind, list, checkoutLodgingCancellation);
    }

    public String toString() {
        return super.toString();
    }
}
