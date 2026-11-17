package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PaymentSelectionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String payment_id;
    public final String payment_method;
    public final String payment_type;

    public final class Companion {
        public final C9hr<PaymentSelectionJson> serializer() {
            return PaymentSelectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PaymentSelectionJson paymentSelectionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || paymentSelectionJson.payment_method != null) {
            c9j5.AAP(paymentSelectionJson.payment_method, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || paymentSelectionJson.payment_type != null) {
            c9j5.AAP(paymentSelectionJson.payment_type, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || paymentSelectionJson.payment_id != null) {
            c9j5.AAP(paymentSelectionJson.payment_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentSelectionJson) {
                PaymentSelectionJson paymentSelectionJson = (PaymentSelectionJson) obj;
                if (!C7384Etj.areEqual(this.payment_method, paymentSelectionJson.payment_method) || !C7384Etj.areEqual(this.payment_type, paymentSelectionJson.payment_type) || !C7384Etj.areEqual(this.payment_id, paymentSelectionJson.payment_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PaymentSelectionJson copy$default(PaymentSelectionJson paymentSelectionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentSelectionJson.payment_method;
        }
        if ((i & 2) != 0) {
            str2 = paymentSelectionJson.payment_type;
        }
        if ((i & 4) != 0) {
            str3 = paymentSelectionJson.payment_id;
        }
        return new PaymentSelectionJson(str, str2, str3);
    }

    public final String component1() {
        return this.payment_method;
    }

    public final String component2() {
        return this.payment_type;
    }

    public final String component3() {
        return this.payment_id;
    }

    public final PaymentSelectionJson copy(String str, String str2, String str3) {
        return new PaymentSelectionJson(str, str2, str3);
    }

    public final String getPayment_id() {
        return this.payment_id;
    }

    public final String getPayment_method() {
        return this.payment_method;
    }

    public final String getPayment_type() {
        return this.payment_type;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.payment_method) * 31) + AnonymousClass006.A0G(this.payment_type)) * 31) + AnonymousClass005.A0H(this.payment_id);
    }

    public final HatchAgentPermissionsRepository.CheckoutPaymentSelection toDomainOrNull() {
        String strA0Z = C3cI.A0Z(this.payment_method);
        String strA0Z2 = C3cI.A0Z(this.payment_type);
        String strA0Z3 = C3cI.A0Z(this.payment_id);
        if (strA0Z == null && strA0Z2 == null && strA0Z3 == null) {
            return null;
        }
        return new HatchAgentPermissionsRepository.CheckoutPaymentSelection(strA0Z, strA0Z2, strA0Z3);
    }

    public PaymentSelectionJson(String str, String str2, String str3) {
        this.payment_method = str;
        this.payment_type = str2;
        this.payment_id = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PaymentSelectionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payment_method = null;
        } else {
            this.payment_method = str;
        }
        if ((i & 2) == 0) {
            this.payment_type = null;
        } else {
            this.payment_type = str2;
        }
        if ((i & 4) == 0) {
            this.payment_id = null;
        } else {
            this.payment_id = str3;
        }
    }

    public /* synthetic */ PaymentSelectionJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public PaymentSelectionJson() {
        this(null, null, null);
    }
}
