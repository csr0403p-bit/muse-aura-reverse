package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class DeliveryCheckoutPayment extends C06G {
    public static final int $stable = 0;
    public final String cardLast4;
    public final String displayName;
    public final boolean savedFromProvider;

    public DeliveryCheckoutPayment(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.displayName = str;
        this.cardLast4 = str2;
        this.savedFromProvider = z;
    }

    public final DeliveryCheckoutPayment copy(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new DeliveryCheckoutPayment(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutPayment) {
                DeliveryCheckoutPayment deliveryCheckoutPayment = (DeliveryCheckoutPayment) obj;
                if (!C7384Etj.areEqual(this.displayName, deliveryCheckoutPayment.displayName) || !C7384Etj.areEqual(this.cardLast4, deliveryCheckoutPayment.cardLast4) || this.savedFromProvider != deliveryCheckoutPayment.savedFromProvider) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutPayment copy$default(DeliveryCheckoutPayment deliveryCheckoutPayment, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutPayment.displayName;
        }
        if ((i & 2) != 0) {
            str2 = deliveryCheckoutPayment.cardLast4;
        }
        if ((i & 4) != 0) {
            z = deliveryCheckoutPayment.savedFromProvider;
        }
        return deliveryCheckoutPayment.copy(str, str2, z);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.cardLast4;
    }

    public final boolean component3() {
        return this.savedFromProvider;
    }

    public final String getCardLast4() {
        return this.cardLast4;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getSavedFromProvider() {
        return this.savedFromProvider;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass001.A0G(this.displayName) + AnonymousClass006.A0G(this.cardLast4)) * 31, this.savedFromProvider);
    }

    public String toString() {
        return super.toString();
    }
}
