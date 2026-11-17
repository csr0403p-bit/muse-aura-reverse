package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutStop extends C06G {
    public static final int $stable = 0;
    public final String address;
    public final String compactAddress;
    public final String contactName;
    public final DeliveryCheckoutHandoff handoff;
    public final String id;
    public final String instructions;
    public final DeliveryCheckoutStopRole role;
    public final DeliveryCheckoutTime time;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutStop) {
                DeliveryCheckoutStop deliveryCheckoutStop = (DeliveryCheckoutStop) obj;
                if (!C7384Etj.areEqual(this.id, deliveryCheckoutStop.id) || this.role != deliveryCheckoutStop.role || !C7384Etj.areEqual(this.address, deliveryCheckoutStop.address) || !C7384Etj.areEqual(this.compactAddress, deliveryCheckoutStop.compactAddress) || !C7384Etj.areEqual(this.contactName, deliveryCheckoutStop.contactName) || !C7384Etj.areEqual(this.time, deliveryCheckoutStop.time) || this.handoff != deliveryCheckoutStop.handoff || !C7384Etj.areEqual(this.instructions, deliveryCheckoutStop.instructions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutStop copy$default(DeliveryCheckoutStop deliveryCheckoutStop, String str, DeliveryCheckoutStopRole deliveryCheckoutStopRole, String str2, String str3, String str4, DeliveryCheckoutTime deliveryCheckoutTime, DeliveryCheckoutHandoff deliveryCheckoutHandoff, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutStop.id;
        }
        if ((i & 2) != 0) {
            deliveryCheckoutStopRole = deliveryCheckoutStop.role;
        }
        if ((i & 4) != 0) {
            str2 = deliveryCheckoutStop.address;
        }
        if ((i & 8) != 0) {
            str3 = deliveryCheckoutStop.compactAddress;
        }
        if ((i & 16) != 0) {
            str4 = deliveryCheckoutStop.contactName;
        }
        if ((i & 32) != 0) {
            deliveryCheckoutTime = deliveryCheckoutStop.time;
        }
        if ((i & 64) != 0) {
            deliveryCheckoutHandoff = deliveryCheckoutStop.handoff;
        }
        if ((i & 128) != 0) {
            str5 = deliveryCheckoutStop.instructions;
        }
        return deliveryCheckoutStop.copy(str, deliveryCheckoutStopRole, str2, str3, str4, deliveryCheckoutTime, deliveryCheckoutHandoff, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final DeliveryCheckoutStopRole component2() {
        return this.role;
    }

    public final String component3() {
        return this.address;
    }

    public final String component4() {
        return this.compactAddress;
    }

    public final String component5() {
        return this.contactName;
    }

    public final DeliveryCheckoutTime component6() {
        return this.time;
    }

    public final DeliveryCheckoutHandoff component7() {
        return this.handoff;
    }

    public final String component8() {
        return this.instructions;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCompactAddress() {
        return this.compactAddress;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final DeliveryCheckoutHandoff getHandoff() {
        return this.handoff;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInstructions() {
        return this.instructions;
    }

    public final DeliveryCheckoutStopRole getRole() {
        return this.role;
    }

    public final DeliveryCheckoutTime getTime() {
        return this.time;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.compactAddress, AnonymousClass005.A0I(this.address, AnonymousClass005.A0F(this.role, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0G(this.contactName)) * 31) + AnonymousClass006.A0D(this.time)) * 31) + AnonymousClass006.A0D(this.handoff)) * 31) + AnonymousClass005.A0H(this.instructions);
    }

    public DeliveryCheckoutStop(String str, DeliveryCheckoutStopRole deliveryCheckoutStopRole, String str2, String str3, String str4, DeliveryCheckoutTime deliveryCheckoutTime, DeliveryCheckoutHandoff deliveryCheckoutHandoff, String str5) {
        AnonymousClass005.A14(str, deliveryCheckoutStopRole, str2, str3);
        this.id = str;
        this.role = deliveryCheckoutStopRole;
        this.address = str2;
        this.compactAddress = str3;
        this.contactName = str4;
        this.time = deliveryCheckoutTime;
        this.handoff = deliveryCheckoutHandoff;
        this.instructions = str5;
    }

    public final DeliveryCheckoutStop copy(String str, DeliveryCheckoutStopRole deliveryCheckoutStopRole, String str2, String str3, String str4, DeliveryCheckoutTime deliveryCheckoutTime, DeliveryCheckoutHandoff deliveryCheckoutHandoff, String str5) {
        AnonymousClass005.A14(str, deliveryCheckoutStopRole, str2, str3);
        return new DeliveryCheckoutStop(str, deliveryCheckoutStopRole, str2, str3, str4, deliveryCheckoutTime, deliveryCheckoutHandoff, str5);
    }

    public String toString() {
        return super.toString();
    }
}
