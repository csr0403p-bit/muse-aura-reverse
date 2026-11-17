package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class WalletSelectionResult extends C06G {
    public static final int $stable = 0;
    public final String approvalId;
    public final String cardBrand;
    public final String cardLast4;
    public final String paymentMethodLabel;
    public final HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection;

    public WalletSelectionResult(String str, HatchAgentPermissionsRepository.CheckoutPaymentSelection checkoutPaymentSelection, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.approvalId = str;
        this.paymentSelection = checkoutPaymentSelection;
        this.paymentMethodLabel = str2;
        this.cardBrand = str3;
        this.cardLast4 = str4;
    }

    public final WalletSelectionResult copy(String str, HatchAgentPermissionsRepository.CheckoutPaymentSelection checkoutPaymentSelection, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new WalletSelectionResult(str, checkoutPaymentSelection, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletSelectionResult) {
                WalletSelectionResult walletSelectionResult = (WalletSelectionResult) obj;
                if (!C7384Etj.areEqual(this.approvalId, walletSelectionResult.approvalId) || !C7384Etj.areEqual(this.paymentSelection, walletSelectionResult.paymentSelection) || !C7384Etj.areEqual(this.paymentMethodLabel, walletSelectionResult.paymentMethodLabel) || !C7384Etj.areEqual(this.cardBrand, walletSelectionResult.cardBrand) || !C7384Etj.areEqual(this.cardLast4, walletSelectionResult.cardLast4)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletSelectionResult copy$default(WalletSelectionResult walletSelectionResult, String str, HatchAgentPermissionsRepository.CheckoutPaymentSelection checkoutPaymentSelection, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSelectionResult.approvalId;
        }
        if ((i & 2) != 0) {
            checkoutPaymentSelection = walletSelectionResult.paymentSelection;
        }
        if ((i & 4) != 0) {
            str2 = walletSelectionResult.paymentMethodLabel;
        }
        if ((i & 8) != 0) {
            str3 = walletSelectionResult.cardBrand;
        }
        if ((i & 16) != 0) {
            str4 = walletSelectionResult.cardLast4;
        }
        return walletSelectionResult.copy(str, checkoutPaymentSelection, str2, str3, str4);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final HatchAgentPermissionsRepository.CheckoutPaymentSelection component2() {
        return this.paymentSelection;
    }

    public final String component3() {
        return this.paymentMethodLabel;
    }

    public final String component4() {
        return this.cardBrand;
    }

    public final String component5() {
        return this.cardLast4;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final String getCardLast4() {
        return this.cardLast4;
    }

    public final String getPaymentMethodLabel() {
        return this.paymentMethodLabel;
    }

    public final HatchAgentPermissionsRepository.CheckoutPaymentSelection getPaymentSelection() {
        return this.paymentSelection;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.approvalId) + AnonymousClass006.A0D(this.paymentSelection)) * 31) + AnonymousClass006.A0G(this.paymentMethodLabel)) * 31) + AnonymousClass006.A0G(this.cardBrand)) * 31) + AnonymousClass005.A0H(this.cardLast4);
    }

    public String toString() {
        return super.toString();
    }
}
