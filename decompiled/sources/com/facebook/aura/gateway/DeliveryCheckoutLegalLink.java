package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutLegalLink extends C06G {
    public static final int $stable = 0;
    public final DeliveryCheckoutLegalRole role;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutLegalLink) {
                DeliveryCheckoutLegalLink deliveryCheckoutLegalLink = (DeliveryCheckoutLegalLink) obj;
                if (this.role != deliveryCheckoutLegalLink.role || !C7384Etj.areEqual(this.url, deliveryCheckoutLegalLink.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutLegalLink copy$default(DeliveryCheckoutLegalLink deliveryCheckoutLegalLink, DeliveryCheckoutLegalRole deliveryCheckoutLegalRole, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            deliveryCheckoutLegalRole = deliveryCheckoutLegalLink.role;
        }
        if ((i & 2) != 0) {
            str = deliveryCheckoutLegalLink.url;
        }
        AnonymousClass003.A0u(deliveryCheckoutLegalRole, str);
        return new DeliveryCheckoutLegalLink(deliveryCheckoutLegalRole, str);
    }

    public final DeliveryCheckoutLegalRole component1() {
        return this.role;
    }

    public final String component2() {
        return this.url;
    }

    public final DeliveryCheckoutLegalRole getRole() {
        return this.role;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass005.A0E(this.role));
    }

    public DeliveryCheckoutLegalLink(DeliveryCheckoutLegalRole deliveryCheckoutLegalRole, String str) {
        AnonymousClass003.A0u(deliveryCheckoutLegalRole, str);
        this.role = deliveryCheckoutLegalRole;
        this.url = str;
    }

    public final DeliveryCheckoutLegalLink copy(DeliveryCheckoutLegalRole deliveryCheckoutLegalRole, String str) {
        AnonymousClass003.A0u(deliveryCheckoutLegalRole, str);
        return new DeliveryCheckoutLegalLink(deliveryCheckoutLegalRole, str);
    }

    public String toString() {
        return super.toString();
    }
}
