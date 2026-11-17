package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;

/* loaded from: classes4.dex */
public final class HatchLinkPostPurchaseState extends C06G {
    public static final int $stable = 0;
    public final HatchLinkSubscriptionActivation activation;
    public final boolean continueRequested;
    public final HatchLinkOrderDetailsPreparation detailsPreparation;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkPostPurchaseState) {
                HatchLinkPostPurchaseState hatchLinkPostPurchaseState = (HatchLinkPostPurchaseState) obj;
                if (this.activation != hatchLinkPostPurchaseState.activation || this.continueRequested != hatchLinkPostPurchaseState.continueRequested || this.detailsPreparation != hatchLinkPostPurchaseState.detailsPreparation) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkPostPurchaseState copy$default(HatchLinkPostPurchaseState hatchLinkPostPurchaseState, HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation, boolean z, HatchLinkOrderDetailsPreparation hatchLinkOrderDetailsPreparation, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchLinkSubscriptionActivation = hatchLinkPostPurchaseState.activation;
        }
        if ((i & 2) != 0) {
            z = hatchLinkPostPurchaseState.continueRequested;
        }
        if ((i & 4) != 0) {
            hatchLinkOrderDetailsPreparation = hatchLinkPostPurchaseState.detailsPreparation;
        }
        return hatchLinkPostPurchaseState.copy(hatchLinkSubscriptionActivation, z, hatchLinkOrderDetailsPreparation);
    }

    public final HatchLinkSubscriptionActivation component1() {
        return this.activation;
    }

    public final boolean component2() {
        return this.continueRequested;
    }

    public final HatchLinkOrderDetailsPreparation component3() {
        return this.detailsPreparation;
    }

    public final HatchLinkSubscriptionActivation getActivation() {
        return this.activation;
    }

    public final boolean getContinueRequested() {
        return this.continueRequested;
    }

    public final HatchLinkOrderDetailsPreparation getDetailsPreparation() {
        return this.detailsPreparation;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.detailsPreparation, C0KA.A01(AnonymousClass005.A0E(this.activation), this.continueRequested));
    }

    public HatchLinkPostPurchaseState(HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation, boolean z, HatchLinkOrderDetailsPreparation hatchLinkOrderDetailsPreparation) {
        AnonymousClass003.A0v(hatchLinkSubscriptionActivation, hatchLinkOrderDetailsPreparation);
        this.activation = hatchLinkSubscriptionActivation;
        this.continueRequested = z;
        this.detailsPreparation = hatchLinkOrderDetailsPreparation;
    }

    public final HatchLinkPostPurchaseState copy(HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation, boolean z, HatchLinkOrderDetailsPreparation hatchLinkOrderDetailsPreparation) {
        AnonymousClass003.A0v(hatchLinkSubscriptionActivation, hatchLinkOrderDetailsPreparation);
        return new HatchLinkPostPurchaseState(hatchLinkSubscriptionActivation, z, hatchLinkOrderDetailsPreparation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchLinkPostPurchaseState(HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation, boolean z, HatchLinkOrderDetailsPreparation hatchLinkOrderDetailsPreparation, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchLinkSubscriptionActivation.WAITING : hatchLinkSubscriptionActivation, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? HatchLinkOrderDetailsPreparation.NOT_STARTED : hatchLinkOrderDetailsPreparation);
    }

    public HatchLinkPostPurchaseState() {
        this(HatchLinkSubscriptionActivation.WAITING, false, HatchLinkOrderDetailsPreparation.NOT_STARTED);
    }
}
