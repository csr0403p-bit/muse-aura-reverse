package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutApproval extends C06G implements HatchAgentPermissionsRepository.AgentPermissionRichPayload {
    public static final int $stable = 8;
    public final List<DeliveryCheckoutLegalLink> legalLinks;
    public final String legalNotice;
    public final DeliveryCheckoutPayment payment;
    public final List<DeliveryCheckoutPriceItem> priceDetails;
    public final String providerName;
    public final List<DeliveryCheckoutStop> stops;
    public final DeliveryCheckoutMoney total;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutApproval) {
                DeliveryCheckoutApproval deliveryCheckoutApproval = (DeliveryCheckoutApproval) obj;
                if (!C7384Etj.areEqual(this.providerName, deliveryCheckoutApproval.providerName) || !C7384Etj.areEqual(this.stops, deliveryCheckoutApproval.stops) || !C7384Etj.areEqual(this.payment, deliveryCheckoutApproval.payment) || !C7384Etj.areEqual(this.total, deliveryCheckoutApproval.total) || !C7384Etj.areEqual(this.priceDetails, deliveryCheckoutApproval.priceDetails) || !C7384Etj.areEqual(this.legalLinks, deliveryCheckoutApproval.legalLinks) || !C7384Etj.areEqual(this.legalNotice, deliveryCheckoutApproval.legalNotice)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryCheckoutApproval copy$default(DeliveryCheckoutApproval deliveryCheckoutApproval, String str, List list, DeliveryCheckoutPayment deliveryCheckoutPayment, DeliveryCheckoutMoney deliveryCheckoutMoney, List list2, List list3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutApproval.providerName;
        }
        if ((i & 2) != 0) {
            list = deliveryCheckoutApproval.stops;
        }
        if ((i & 4) != 0) {
            deliveryCheckoutPayment = deliveryCheckoutApproval.payment;
        }
        if ((i & 8) != 0) {
            deliveryCheckoutMoney = deliveryCheckoutApproval.total;
        }
        if ((i & 16) != 0) {
            list2 = deliveryCheckoutApproval.priceDetails;
        }
        if ((i & 32) != 0) {
            list3 = deliveryCheckoutApproval.legalLinks;
        }
        if ((i & 64) != 0) {
            str2 = deliveryCheckoutApproval.legalNotice;
        }
        return deliveryCheckoutApproval.copy(str, list, deliveryCheckoutPayment, deliveryCheckoutMoney, list2, list3, str2);
    }

    public final String component1() {
        return this.providerName;
    }

    public final List<DeliveryCheckoutStop> component2() {
        return this.stops;
    }

    public final DeliveryCheckoutPayment component3() {
        return this.payment;
    }

    public final DeliveryCheckoutMoney component4() {
        return this.total;
    }

    public final List<DeliveryCheckoutPriceItem> component5() {
        return this.priceDetails;
    }

    public final List<DeliveryCheckoutLegalLink> component6() {
        return this.legalLinks;
    }

    public final String component7() {
        return this.legalNotice;
    }

    public final List<DeliveryCheckoutLegalLink> getLegalLinks() {
        return this.legalLinks;
    }

    public final String getLegalNotice() {
        return this.legalNotice;
    }

    public final DeliveryCheckoutPayment getPayment() {
        return this.payment;
    }

    public final List<DeliveryCheckoutPriceItem> getPriceDetails() {
        return this.priceDetails;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final List<DeliveryCheckoutStop> getStops() {
        return this.stops;
    }

    public final DeliveryCheckoutMoney getTotal() {
        return this.total;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.legalLinks, (AnonymousClass005.A0F(this.total, (AnonymousClass005.A0F(this.stops, AnonymousClass001.A0G(this.providerName)) + AnonymousClass006.A0D(this.payment)) * 31) + AnonymousClass006.A0D(this.priceDetails)) * 31) + AnonymousClass005.A0H(this.legalNotice);
    }

    public DeliveryCheckoutApproval(String str, List<DeliveryCheckoutStop> list, DeliveryCheckoutPayment deliveryCheckoutPayment, DeliveryCheckoutMoney deliveryCheckoutMoney, List<DeliveryCheckoutPriceItem> list2, List<DeliveryCheckoutLegalLink> list3, String str2) {
        AnonymousClass005.A0y(str, list, deliveryCheckoutMoney);
        C7384Etj.A0Y(list3, 5);
        this.providerName = str;
        this.stops = list;
        this.payment = deliveryCheckoutPayment;
        this.total = deliveryCheckoutMoney;
        this.priceDetails = list2;
        this.legalLinks = list3;
        this.legalNotice = str2;
    }

    public final DeliveryCheckoutApproval copy(String str, List<DeliveryCheckoutStop> list, DeliveryCheckoutPayment deliveryCheckoutPayment, DeliveryCheckoutMoney deliveryCheckoutMoney, List<DeliveryCheckoutPriceItem> list2, List<DeliveryCheckoutLegalLink> list3, String str2) {
        AnonymousClass005.A0y(str, list, deliveryCheckoutMoney);
        C7384Etj.A0Y(list3, 5);
        return new DeliveryCheckoutApproval(str, list, deliveryCheckoutPayment, deliveryCheckoutMoney, list2, list3, str2);
    }

    public String toString() {
        return super.toString();
    }
}
