package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class WalletSetResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String approval_id;
    public final WalletPaymentDetailsJson payment_details;
    public final PaymentSelectionJson payment_selection;

    public final class Companion {
        public final C9hr<WalletSetResultJson> serializer() {
            return WalletSetResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletSetResultJson walletSetResultJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || walletSetResultJson.approval_id != null) {
            c9j5.AAP(walletSetResultJson.approval_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || walletSetResultJson.payment_selection != null) {
            c9j5.AAP(walletSetResultJson.payment_selection, PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || walletSetResultJson.payment_details != null) {
            c9j5.AAP(walletSetResultJson.payment_details, WalletPaymentDetailsJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletSetResultJson) {
                WalletSetResultJson walletSetResultJson = (WalletSetResultJson) obj;
                if (!C7384Etj.areEqual(this.approval_id, walletSetResultJson.approval_id) || !C7384Etj.areEqual(this.payment_selection, walletSetResultJson.payment_selection) || !C7384Etj.areEqual(this.payment_details, walletSetResultJson.payment_details)) {
                }
            }
            return false;
        }
        return true;
    }

    public final WalletSelectionResult toDomain(String str) {
        String str2;
        String str3;
        String str4;
        C7384Etj.A0Y(str, 0);
        PaymentSelectionJson paymentSelectionJson = this.payment_selection;
        String strTrimToNonEmpty = null;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection domainOrNull = paymentSelectionJson != null ? paymentSelectionJson.toDomainOrNull() : null;
        WalletPaymentDetailsJson walletPaymentDetailsJson = this.payment_details;
        String strTrimToNonEmpty2 = (walletPaymentDetailsJson == null || (str4 = walletPaymentDetailsJson.payment_method_label) == null) ? null : HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str4);
        WalletPaymentDetailsJson walletPaymentDetailsJson2 = this.payment_details;
        String strTrimToNonEmpty3 = (walletPaymentDetailsJson2 == null || (str3 = walletPaymentDetailsJson2.card_brand) == null) ? null : HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3);
        WalletPaymentDetailsJson walletPaymentDetailsJson3 = this.payment_details;
        if (walletPaymentDetailsJson3 != null && (str2 = walletPaymentDetailsJson3.card_last4) != null) {
            strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2);
        }
        return new WalletSelectionResult(str, domainOrNull, strTrimToNonEmpty2, strTrimToNonEmpty3, strTrimToNonEmpty);
    }

    public static /* synthetic */ WalletSetResultJson copy$default(WalletSetResultJson walletSetResultJson, String str, PaymentSelectionJson paymentSelectionJson, WalletPaymentDetailsJson walletPaymentDetailsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSetResultJson.approval_id;
        }
        if ((i & 2) != 0) {
            paymentSelectionJson = walletSetResultJson.payment_selection;
        }
        if ((i & 4) != 0) {
            walletPaymentDetailsJson = walletSetResultJson.payment_details;
        }
        return new WalletSetResultJson(str, paymentSelectionJson, walletPaymentDetailsJson);
    }

    public final String component1() {
        return this.approval_id;
    }

    public final PaymentSelectionJson component2() {
        return this.payment_selection;
    }

    public final WalletPaymentDetailsJson component3() {
        return this.payment_details;
    }

    public final WalletSetResultJson copy(String str, PaymentSelectionJson paymentSelectionJson, WalletPaymentDetailsJson walletPaymentDetailsJson) {
        return new WalletSetResultJson(str, paymentSelectionJson, walletPaymentDetailsJson);
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final WalletPaymentDetailsJson getPayment_details() {
        return this.payment_details;
    }

    public final PaymentSelectionJson getPayment_selection() {
        return this.payment_selection;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.approval_id) * 31) + AnonymousClass006.A0D(this.payment_selection)) * 31) + C3cH.A02(this.payment_details);
    }

    public WalletSetResultJson(String str, PaymentSelectionJson paymentSelectionJson, WalletPaymentDetailsJson walletPaymentDetailsJson) {
        this.approval_id = str;
        this.payment_selection = paymentSelectionJson;
        this.payment_details = walletPaymentDetailsJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletSetResultJson(int i, String str, PaymentSelectionJson paymentSelectionJson, WalletPaymentDetailsJson walletPaymentDetailsJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.approval_id = null;
        } else {
            this.approval_id = str;
        }
        if ((i & 2) == 0) {
            this.payment_selection = null;
        } else {
            this.payment_selection = paymentSelectionJson;
        }
        if ((i & 4) == 0) {
            this.payment_details = null;
        } else {
            this.payment_details = walletPaymentDetailsJson;
        }
    }

    public /* synthetic */ WalletSetResultJson(String str, PaymentSelectionJson paymentSelectionJson, WalletPaymentDetailsJson walletPaymentDetailsJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : paymentSelectionJson, (i & 4) != 0 ? null : walletPaymentDetailsJson);
    }

    public WalletSetResultJson() {
        this(null, null, null);
    }
}
