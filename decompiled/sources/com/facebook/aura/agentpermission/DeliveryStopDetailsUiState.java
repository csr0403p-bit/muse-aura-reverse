package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.DeliveryCheckoutStopRole;
import com.facebook.aura.gateway.DeliveryCheckoutTime;

/* loaded from: classes2.dex */
public final class DeliveryStopDetailsUiState extends C06G {
    public static final int $stable = DeliveryCheckoutTime.$stable;
    public final String address;
    public final String contactName;
    public final DeliveryStopInstructionsUiState instructions;
    public final DeliveryCheckoutStopRole role;
    public final DeliveryCheckoutTime time;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryStopDetailsUiState) {
                DeliveryStopDetailsUiState deliveryStopDetailsUiState = (DeliveryStopDetailsUiState) obj;
                if (this.role != deliveryStopDetailsUiState.role || !C7384Etj.areEqual(this.address, deliveryStopDetailsUiState.address) || !C7384Etj.areEqual(this.contactName, deliveryStopDetailsUiState.contactName) || !C7384Etj.areEqual(this.time, deliveryStopDetailsUiState.time) || !C7384Etj.areEqual(this.instructions, deliveryStopDetailsUiState.instructions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryStopDetailsUiState copy$default(DeliveryStopDetailsUiState deliveryStopDetailsUiState, DeliveryCheckoutStopRole deliveryCheckoutStopRole, String str, String str2, DeliveryCheckoutTime deliveryCheckoutTime, DeliveryStopInstructionsUiState deliveryStopInstructionsUiState, int i, Object obj) {
        if ((i & 1) != 0) {
            deliveryCheckoutStopRole = deliveryStopDetailsUiState.role;
        }
        if ((i & 2) != 0) {
            str = deliveryStopDetailsUiState.address;
        }
        if ((i & 4) != 0) {
            str2 = deliveryStopDetailsUiState.contactName;
        }
        if ((i & 8) != 0) {
            deliveryCheckoutTime = deliveryStopDetailsUiState.time;
        }
        if ((i & 16) != 0) {
            deliveryStopInstructionsUiState = deliveryStopDetailsUiState.instructions;
        }
        return deliveryStopDetailsUiState.copy(deliveryCheckoutStopRole, str, str2, deliveryCheckoutTime, deliveryStopInstructionsUiState);
    }

    public final DeliveryCheckoutStopRole component1() {
        return this.role;
    }

    public final String component2() {
        return this.address;
    }

    public final String component3() {
        return this.contactName;
    }

    public final DeliveryCheckoutTime component4() {
        return this.time;
    }

    public final DeliveryStopInstructionsUiState component5() {
        return this.instructions;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final DeliveryStopInstructionsUiState getInstructions() {
        return this.instructions;
    }

    public final DeliveryCheckoutStopRole getRole() {
        return this.role;
    }

    public final DeliveryCheckoutTime getTime() {
        return this.time;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.address, AnonymousClass005.A0E(this.role)) + AnonymousClass006.A0G(this.contactName)) * 31) + AnonymousClass006.A0D(this.time)) * 31) + C3cH.A02(this.instructions);
    }

    public DeliveryStopDetailsUiState(DeliveryCheckoutStopRole deliveryCheckoutStopRole, String str, String str2, DeliveryCheckoutTime deliveryCheckoutTime, DeliveryStopInstructionsUiState deliveryStopInstructionsUiState) {
        AnonymousClass003.A0u(deliveryCheckoutStopRole, str);
        this.role = deliveryCheckoutStopRole;
        this.address = str;
        this.contactName = str2;
        this.time = deliveryCheckoutTime;
        this.instructions = deliveryStopInstructionsUiState;
    }

    public final DeliveryStopDetailsUiState copy(DeliveryCheckoutStopRole deliveryCheckoutStopRole, String str, String str2, DeliveryCheckoutTime deliveryCheckoutTime, DeliveryStopInstructionsUiState deliveryStopInstructionsUiState) {
        AnonymousClass003.A0u(deliveryCheckoutStopRole, str);
        return new DeliveryStopDetailsUiState(deliveryCheckoutStopRole, str, str2, deliveryCheckoutTime, deliveryStopInstructionsUiState);
    }

    public String toString() {
        return super.toString();
    }
}
