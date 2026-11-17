package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C8j3;
import com.facebook.aura.checkout.ui.HatchAddressSuggestion;

/* loaded from: classes4.dex */
public final class HatchLinkOrderTransition extends C06G {
    public static final int $stable;
    public final HatchLinkOrderEffect effect;
    public final HatchLinkOrderFormState state;

    public HatchLinkOrderTransition(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderEffect hatchLinkOrderEffect) {
        C7384Etj.A0Y(hatchLinkOrderFormState, 0);
        this.state = hatchLinkOrderFormState;
        this.effect = hatchLinkOrderEffect;
    }

    public final HatchLinkOrderTransition copy(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderEffect hatchLinkOrderEffect) {
        C7384Etj.A0Y(hatchLinkOrderFormState, 0);
        return C8j3.A0p(hatchLinkOrderFormState, hatchLinkOrderEffect);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkOrderTransition) {
                HatchLinkOrderTransition hatchLinkOrderTransition = (HatchLinkOrderTransition) obj;
                if (!C7384Etj.areEqual(this.state, hatchLinkOrderTransition.state) || !C7384Etj.areEqual(this.effect, hatchLinkOrderTransition.effect)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = HatchAddressSuggestion.$stable | HatchLinkOrder.$stable;
        int i2 = HatchLinkOrderInput.$stable;
        $stable = i | i2 | HatchLinkSavedAddress.$stable | HatchLinkSavedDetails.$stable | i2;
    }

    public static /* synthetic */ HatchLinkOrderTransition copy$default(HatchLinkOrderTransition hatchLinkOrderTransition, HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderEffect hatchLinkOrderEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchLinkOrderFormState = hatchLinkOrderTransition.state;
        }
        if ((i & 2) != 0) {
            hatchLinkOrderEffect = hatchLinkOrderTransition.effect;
        }
        C7384Etj.A0Y(hatchLinkOrderFormState, 0);
        return C8j3.A0p(hatchLinkOrderFormState, hatchLinkOrderEffect);
    }

    public final HatchLinkOrderFormState component1() {
        return this.state;
    }

    public final HatchLinkOrderEffect component2() {
        return this.effect;
    }

    public final HatchLinkOrderEffect getEffect() {
        return this.effect;
    }

    public final HatchLinkOrderFormState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.state) + AnonymousClass006.A0D(this.effect);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchLinkOrderTransition(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderEffect hatchLinkOrderEffect, int i, C06H c06h) {
        this(hatchLinkOrderFormState, (i & 2) != 0 ? null : hatchLinkOrderEffect);
    }
}
