package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.CheckoutLodgingCancellation;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutApprovalPresentation extends C06G {
    public static final int $stable = CheckoutLodgingCancellation.$stable;
    public final CheckoutLodgingCancellation cancellation;
    public final String faviconUri;
    public final CheckoutPresentationKind kind;
    public final CheckoutLegalPresentation legal;
    public final List<List<CheckoutReceiptRow>> receiptGroups;
    public final boolean showReviewText;

    public static /* synthetic */ CheckoutApprovalPresentation copy$default(CheckoutApprovalPresentation checkoutApprovalPresentation, CheckoutPresentationKind checkoutPresentationKind, String str, boolean z, List list, CheckoutLegalPresentation checkoutLegalPresentation, CheckoutLodgingCancellation checkoutLodgingCancellation, int i, Object obj) {
        CheckoutPresentationKind checkoutPresentationKind2 = checkoutPresentationKind;
        String str2 = str;
        boolean z2 = z;
        List list2 = list;
        CheckoutLegalPresentation checkoutLegalPresentation2 = checkoutLegalPresentation;
        CheckoutLodgingCancellation checkoutLodgingCancellation2 = checkoutLodgingCancellation;
        if ((i & 1) != 0) {
            checkoutPresentationKind2 = checkoutApprovalPresentation.kind;
        }
        if ((i & 2) != 0) {
            str2 = checkoutApprovalPresentation.faviconUri;
        }
        if ((i & 4) != 0) {
            z2 = checkoutApprovalPresentation.showReviewText;
        }
        if ((i & 8) != 0) {
            list2 = checkoutApprovalPresentation.receiptGroups;
        }
        if ((i & 16) != 0) {
            checkoutLegalPresentation2 = checkoutApprovalPresentation.legal;
        }
        if ((i & 32) != 0) {
            checkoutLodgingCancellation2 = checkoutApprovalPresentation.cancellation;
        }
        AnonymousClass003.A0w(checkoutPresentationKind2, list2);
        return new CheckoutApprovalPresentation(checkoutPresentationKind2, str2, z2, list2, checkoutLegalPresentation2, checkoutLodgingCancellation2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutApprovalPresentation) {
                CheckoutApprovalPresentation checkoutApprovalPresentation = (CheckoutApprovalPresentation) obj;
                if (this.kind != checkoutApprovalPresentation.kind || !C7384Etj.areEqual(this.faviconUri, checkoutApprovalPresentation.faviconUri) || this.showReviewText != checkoutApprovalPresentation.showReviewText || !C7384Etj.areEqual(this.receiptGroups, checkoutApprovalPresentation.receiptGroups) || !C7384Etj.areEqual(this.legal, checkoutApprovalPresentation.legal) || !C7384Etj.areEqual(this.cancellation, checkoutApprovalPresentation.cancellation)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CheckoutApprovalPresentation(CheckoutPresentationKind checkoutPresentationKind, String str, boolean z, List list, CheckoutLegalPresentation checkoutLegalPresentation, CheckoutLodgingCancellation checkoutLodgingCancellation, int i, C06H c06h) {
        this(checkoutPresentationKind, str, z, list, checkoutLegalPresentation, (i & 32) != 0 ? null : checkoutLodgingCancellation);
    }

    public final CheckoutPresentationKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.faviconUri;
    }

    public final boolean component3() {
        return this.showReviewText;
    }

    public final List<List<CheckoutReceiptRow>> component4() {
        return this.receiptGroups;
    }

    public final CheckoutLegalPresentation component5() {
        return this.legal;
    }

    public final CheckoutLodgingCancellation component6() {
        return this.cancellation;
    }

    public final CheckoutLodgingCancellation getCancellation() {
        return this.cancellation;
    }

    public final String getFaviconUri() {
        return this.faviconUri;
    }

    public final CheckoutPresentationKind getKind() {
        return this.kind;
    }

    public final CheckoutLegalPresentation getLegal() {
        return this.legal;
    }

    public final List<List<CheckoutReceiptRow>> getReceiptGroups() {
        return this.receiptGroups;
    }

    public final boolean getShowReviewText() {
        return this.showReviewText;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.receiptGroups, C0KA.A01((AnonymousClass005.A0E(this.kind) + AnonymousClass006.A0G(this.faviconUri)) * 31, this.showReviewText)) + AnonymousClass006.A0D(this.legal)) * 31) + C3cH.A02(this.cancellation);
    }

    public final CheckoutApprovalPresentation copy(CheckoutPresentationKind checkoutPresentationKind, String str, boolean z, List<? extends List<? extends CheckoutReceiptRow>> list, CheckoutLegalPresentation checkoutLegalPresentation, CheckoutLodgingCancellation checkoutLodgingCancellation) {
        AnonymousClass003.A0w(checkoutPresentationKind, list);
        return new CheckoutApprovalPresentation(checkoutPresentationKind, str, z, list, checkoutLegalPresentation, checkoutLodgingCancellation);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutApprovalPresentation(CheckoutPresentationKind checkoutPresentationKind, String str, boolean z, List<? extends List<? extends CheckoutReceiptRow>> list, CheckoutLegalPresentation checkoutLegalPresentation, CheckoutLodgingCancellation checkoutLodgingCancellation) {
        AnonymousClass003.A0w(checkoutPresentationKind, list);
        this.kind = checkoutPresentationKind;
        this.faviconUri = str;
        this.showReviewText = z;
        this.receiptGroups = list;
        this.legal = checkoutLegalPresentation;
        this.cancellation = checkoutLodgingCancellation;
    }
}
