package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.ConnectorOrderCheckout;
import com.facebook.aura.gateway.DeliveryCheckoutMoney;
import com.facebook.aura.gateway.DeliveryCheckoutPriceItem;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes2.dex */
public interface CheckoutPriceDetailsUiState {

    public final class ConnectorOrder extends C06G implements CheckoutPriceDetailsUiState {
        public static final int $stable = ConnectorOrderCheckout.$stable;
        public final ConnectorOrderCheckout checkout;

        public ConnectorOrder(ConnectorOrderCheckout connectorOrderCheckout) {
            C7384Etj.A0Y(connectorOrderCheckout, 0);
            this.checkout = connectorOrderCheckout;
        }

        public final ConnectorOrder copy(ConnectorOrderCheckout connectorOrderCheckout) {
            C7384Etj.A0Y(connectorOrderCheckout, 0);
            return new ConnectorOrder(connectorOrderCheckout);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConnectorOrder) && C7384Etj.areEqual(this.checkout, ((ConnectorOrder) obj).checkout));
        }

        public static /* synthetic */ ConnectorOrder copy$default(ConnectorOrder connectorOrder, ConnectorOrderCheckout connectorOrderCheckout, int i, Object obj) {
            if ((i & 1) != 0) {
                connectorOrderCheckout = connectorOrder.checkout;
            }
            C7384Etj.A0Y(connectorOrderCheckout, 0);
            return new ConnectorOrder(connectorOrderCheckout);
        }

        public final ConnectorOrderCheckout component1() {
            return this.checkout;
        }

        public final ConnectorOrderCheckout getCheckout() {
            return this.checkout;
        }

        public int hashCode() {
            return this.checkout.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Delivery extends C06G implements CheckoutPriceDetailsUiState {
        public static final int $stable = DeliveryCheckoutMoney.$stable;
        public final List<DeliveryCheckoutPriceItem> items;
        public final DeliveryCheckoutMoney total;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Delivery) {
                    Delivery delivery = (Delivery) obj;
                    if (!C7384Etj.areEqual(this.items, delivery.items) || !C7384Etj.areEqual(this.total, delivery.total)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Delivery copy$default(Delivery delivery, List list, DeliveryCheckoutMoney deliveryCheckoutMoney, int i, Object obj) {
            if ((i & 1) != 0) {
                list = delivery.items;
            }
            if ((i & 2) != 0) {
                deliveryCheckoutMoney = delivery.total;
            }
            AnonymousClass003.A0u(list, deliveryCheckoutMoney);
            return new Delivery(list, deliveryCheckoutMoney);
        }

        public final List<DeliveryCheckoutPriceItem> component1() {
            return this.items;
        }

        public final DeliveryCheckoutMoney component2() {
            return this.total;
        }

        public final List<DeliveryCheckoutPriceItem> getItems() {
            return this.items;
        }

        public final DeliveryCheckoutMoney getTotal() {
            return this.total;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.total, AnonymousClass005.A0E(this.items));
        }

        public Delivery(List<DeliveryCheckoutPriceItem> list, DeliveryCheckoutMoney deliveryCheckoutMoney) {
            AnonymousClass003.A0u(list, deliveryCheckoutMoney);
            this.items = list;
            this.total = deliveryCheckoutMoney;
        }

        public final Delivery copy(List<DeliveryCheckoutPriceItem> list, DeliveryCheckoutMoney deliveryCheckoutMoney) {
            AnonymousClass003.A0u(list, deliveryCheckoutMoney);
            return new Delivery(list, deliveryCheckoutMoney);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Dismissed implements CheckoutPriceDetailsUiState {
        public static final int $stable = 0;
        public static final Dismissed INSTANCE = new Dismissed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public String toString() {
            return "Dismissed";
        }

        public int hashCode() {
            return -1241684273;
        }
    }

    public final class Flight extends C06G implements CheckoutPriceDetailsUiState {
        public static final int $stable = 8;
        public final List<HatchAgentPermissionsRepository.CheckoutTotal> totals;

        public Flight(List<HatchAgentPermissionsRepository.CheckoutTotal> list) {
            C7384Etj.A0Y(list, 0);
            this.totals = list;
        }

        public final Flight copy(List<HatchAgentPermissionsRepository.CheckoutTotal> list) {
            C7384Etj.A0Y(list, 0);
            return new Flight(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Flight) && C7384Etj.areEqual(this.totals, ((Flight) obj).totals));
        }

        public static /* synthetic */ Flight copy$default(Flight flight, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = flight.totals;
            }
            C7384Etj.A0Y(list, 0);
            return new Flight(list);
        }

        public final List<HatchAgentPermissionsRepository.CheckoutTotal> component1() {
            return this.totals;
        }

        public final List<HatchAgentPermissionsRepository.CheckoutTotal> getTotals() {
            return this.totals;
        }

        public int hashCode() {
            return this.totals.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
