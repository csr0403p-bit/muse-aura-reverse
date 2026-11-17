package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutPriceItem extends C06G {
    public static final int $stable = 8;
    public final DeliveryCheckoutPriceKind kind;
    public final DeliveryCheckoutMoney money;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutPriceItem) {
                DeliveryCheckoutPriceItem deliveryCheckoutPriceItem = (DeliveryCheckoutPriceItem) obj;
                if (this.kind != deliveryCheckoutPriceItem.kind || !C7384Etj.areEqual(this.money, deliveryCheckoutPriceItem.money)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutPriceItem copy$default(DeliveryCheckoutPriceItem deliveryCheckoutPriceItem, DeliveryCheckoutPriceKind deliveryCheckoutPriceKind, DeliveryCheckoutMoney deliveryCheckoutMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            deliveryCheckoutPriceKind = deliveryCheckoutPriceItem.kind;
        }
        if ((i & 2) != 0) {
            deliveryCheckoutMoney = deliveryCheckoutPriceItem.money;
        }
        AnonymousClass003.A0u(deliveryCheckoutPriceKind, deliveryCheckoutMoney);
        return new DeliveryCheckoutPriceItem(deliveryCheckoutPriceKind, deliveryCheckoutMoney);
    }

    public final DeliveryCheckoutPriceKind component1() {
        return this.kind;
    }

    public final DeliveryCheckoutMoney component2() {
        return this.money;
    }

    public final DeliveryCheckoutPriceKind getKind() {
        return this.kind;
    }

    public final DeliveryCheckoutMoney getMoney() {
        return this.money;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.money, AnonymousClass005.A0E(this.kind));
    }

    public DeliveryCheckoutPriceItem(DeliveryCheckoutPriceKind deliveryCheckoutPriceKind, DeliveryCheckoutMoney deliveryCheckoutMoney) {
        AnonymousClass003.A0u(deliveryCheckoutPriceKind, deliveryCheckoutMoney);
        this.kind = deliveryCheckoutPriceKind;
        this.money = deliveryCheckoutMoney;
    }

    public final DeliveryCheckoutPriceItem copy(DeliveryCheckoutPriceKind deliveryCheckoutPriceKind, DeliveryCheckoutMoney deliveryCheckoutMoney) {
        AnonymousClass003.A0u(deliveryCheckoutPriceKind, deliveryCheckoutMoney);
        return new DeliveryCheckoutPriceItem(deliveryCheckoutPriceKind, deliveryCheckoutMoney);
    }

    public String toString() {
        return super.toString();
    }
}
