package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutTime extends C06G {
    public static final int $stable = 0;
    public final Long endMs;
    public final boolean estimated;
    public final long startMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutTime) {
                DeliveryCheckoutTime deliveryCheckoutTime = (DeliveryCheckoutTime) obj;
                if (this.estimated != deliveryCheckoutTime.estimated || this.startMs != deliveryCheckoutTime.startMs || !C7384Etj.areEqual(this.endMs, deliveryCheckoutTime.endMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutTime copy$default(DeliveryCheckoutTime deliveryCheckoutTime, boolean z, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deliveryCheckoutTime.estimated;
        }
        if ((i & 2) != 0) {
            j = deliveryCheckoutTime.startMs;
        }
        if ((i & 4) != 0) {
            l = deliveryCheckoutTime.endMs;
        }
        return new DeliveryCheckoutTime(z, j, l);
    }

    public final boolean component1() {
        return this.estimated;
    }

    public final long component2() {
        return this.startMs;
    }

    public final Long component3() {
        return this.endMs;
    }

    public final DeliveryCheckoutTime copy(boolean z, long j, Long l) {
        return new DeliveryCheckoutTime(z, j, l);
    }

    public final Long getEndMs() {
        return this.endMs;
    }

    public final boolean getEstimated() {
        return this.estimated;
    }

    public final long getStartMs() {
        return this.startMs;
    }

    public int hashCode() {
        return (AnonymousClass006.A05(this.startMs, C0KA.A02(this.estimated)) * 31) + AnonymousClass006.A0D(this.endMs);
    }

    public DeliveryCheckoutTime(boolean z, long j, Long l) {
        this.estimated = z;
        this.startMs = j;
        this.endMs = l;
    }

    public String toString() {
        return super.toString();
    }
}
