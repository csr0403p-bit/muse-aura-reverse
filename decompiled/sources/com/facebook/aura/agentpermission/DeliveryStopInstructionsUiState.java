package com.facebook.aura.agentpermission;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.DeliveryCheckoutHandoff;

/* loaded from: classes2.dex */
public final class DeliveryStopInstructionsUiState extends C06G {
    public static final int $stable = 0;
    public final DeliveryCheckoutHandoff handoff;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryStopInstructionsUiState) {
                DeliveryStopInstructionsUiState deliveryStopInstructionsUiState = (DeliveryStopInstructionsUiState) obj;
                if (this.handoff != deliveryStopInstructionsUiState.handoff || !C7384Etj.areEqual(this.text, deliveryStopInstructionsUiState.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryStopInstructionsUiState copy$default(DeliveryStopInstructionsUiState deliveryStopInstructionsUiState, DeliveryCheckoutHandoff deliveryCheckoutHandoff, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            deliveryCheckoutHandoff = deliveryStopInstructionsUiState.handoff;
        }
        if ((i & 2) != 0) {
            str = deliveryStopInstructionsUiState.text;
        }
        return new DeliveryStopInstructionsUiState(deliveryCheckoutHandoff, str);
    }

    public final DeliveryCheckoutHandoff component1() {
        return this.handoff;
    }

    public final String component2() {
        return this.text;
    }

    public final DeliveryStopInstructionsUiState copy(DeliveryCheckoutHandoff deliveryCheckoutHandoff, String str) {
        return new DeliveryStopInstructionsUiState(deliveryCheckoutHandoff, str);
    }

    public final DeliveryCheckoutHandoff getHandoff() {
        return this.handoff;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.handoff) * 31) + AnonymousClass005.A0H(this.text);
    }

    public DeliveryStopInstructionsUiState(DeliveryCheckoutHandoff deliveryCheckoutHandoff, String str) {
        this.handoff = deliveryCheckoutHandoff;
        this.text = str;
    }

    public String toString() {
        return super.toString();
    }
}
