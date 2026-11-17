package com.facebook.aura.agentpermission;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.DeliveryCheckoutTime;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutStopUiState extends C06G {
    public static final int $stable = DeliveryCheckoutTime.$stable;
    public final boolean awaitingApproval;
    public final DeliveryStopDetailsUiState details;
    public final boolean dismissed;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutStopUiState) {
                DeliveryCheckoutStopUiState deliveryCheckoutStopUiState = (DeliveryCheckoutStopUiState) obj;
                if (!C7384Etj.areEqual(this.details, deliveryCheckoutStopUiState.details) || this.awaitingApproval != deliveryCheckoutStopUiState.awaitingApproval || this.dismissed != deliveryCheckoutStopUiState.dismissed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutStopUiState copy$default(DeliveryCheckoutStopUiState deliveryCheckoutStopUiState, DeliveryStopDetailsUiState deliveryStopDetailsUiState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            deliveryStopDetailsUiState = deliveryCheckoutStopUiState.details;
        }
        if ((i & 2) != 0) {
            z = deliveryCheckoutStopUiState.awaitingApproval;
        }
        if ((i & 4) != 0) {
            z2 = deliveryCheckoutStopUiState.dismissed;
        }
        return new DeliveryCheckoutStopUiState(deliveryStopDetailsUiState, z, z2);
    }

    public final DeliveryStopDetailsUiState component1() {
        return this.details;
    }

    public final boolean component2() {
        return this.awaitingApproval;
    }

    public final boolean component3() {
        return this.dismissed;
    }

    public final DeliveryCheckoutStopUiState copy(DeliveryStopDetailsUiState deliveryStopDetailsUiState, boolean z, boolean z2) {
        return new DeliveryCheckoutStopUiState(deliveryStopDetailsUiState, z, z2);
    }

    public final boolean getAwaitingApproval() {
        return this.awaitingApproval;
    }

    public final DeliveryStopDetailsUiState getDetails() {
        return this.details;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass006.A0D(this.details) * 31, this.awaitingApproval), this.dismissed);
    }

    public DeliveryCheckoutStopUiState(DeliveryStopDetailsUiState deliveryStopDetailsUiState, boolean z, boolean z2) {
        this.details = deliveryStopDetailsUiState;
        this.awaitingApproval = z;
        this.dismissed = z2;
    }

    public String toString() {
        return super.toString();
    }
}
