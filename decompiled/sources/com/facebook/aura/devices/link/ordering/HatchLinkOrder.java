package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchLinkOrder extends C06G {
    public static final int $stable = 0;
    public final String orderId;
    public final HatchLinkOrderStatus status;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkOrder) {
                HatchLinkOrder hatchLinkOrder = (HatchLinkOrder) obj;
                if (!C7384Etj.areEqual(this.orderId, hatchLinkOrder.orderId) || this.status != hatchLinkOrder.status) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkOrder copy$default(HatchLinkOrder hatchLinkOrder, String str, HatchLinkOrderStatus hatchLinkOrderStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchLinkOrder.orderId;
        }
        if ((i & 2) != 0) {
            hatchLinkOrderStatus = hatchLinkOrder.status;
        }
        AnonymousClass003.A0u(str, hatchLinkOrderStatus);
        return new HatchLinkOrder(str, hatchLinkOrderStatus);
    }

    public final String component1() {
        return this.orderId;
    }

    public final HatchLinkOrderStatus component2() {
        return this.status;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final HatchLinkOrderStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.status, AnonymousClass001.A0G(this.orderId));
    }

    public HatchLinkOrder(String str, HatchLinkOrderStatus hatchLinkOrderStatus) {
        AnonymousClass003.A0u(str, hatchLinkOrderStatus);
        this.orderId = str;
        this.status = hatchLinkOrderStatus;
    }

    public final HatchLinkOrder copy(String str, HatchLinkOrderStatus hatchLinkOrderStatus) {
        AnonymousClass003.A0u(str, hatchLinkOrderStatus);
        return new HatchLinkOrder(str, hatchLinkOrderStatus);
    }

    public String toString() {
        return super.toString();
    }
}
