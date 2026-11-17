package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightRowBags extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long carryOn;
    public final Long checked;

    public final class Companion {
        public final C9hr<FlightRowBags> serializer() {
            return FlightRowBags$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowBags flightRowBags, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightRowBags.carryOn != null) {
            c9j5.AAP(flightRowBags.carryOn, C9j1.A00, c9iZ, 0);
        }
        if (zAfR || flightRowBags.checked != null) {
            c9j5.AAP(flightRowBags.checked, C9j1.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowBags) {
                FlightRowBags flightRowBags = (FlightRowBags) obj;
                if (!C7384Etj.areEqual(this.carryOn, flightRowBags.carryOn) || !C7384Etj.areEqual(this.checked, flightRowBags.checked)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightRowBags copy$default(FlightRowBags flightRowBags, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = flightRowBags.carryOn;
        }
        if ((i & 2) != 0) {
            l2 = flightRowBags.checked;
        }
        return new FlightRowBags(l, l2);
    }

    public final Long component1() {
        return this.carryOn;
    }

    public final Long component2() {
        return this.checked;
    }

    public final FlightRowBags copy(Long l, Long l2) {
        return new FlightRowBags(l, l2);
    }

    public final Long getCarryOn() {
        return this.carryOn;
    }

    public final Long getChecked() {
        return this.checked;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.carryOn) * 31) + C3cH.A02(this.checked);
    }

    public FlightRowBags(Long l, Long l2) {
        this.carryOn = l;
        this.checked = l2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowBags(int i, Long l, Long l2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.carryOn = null;
        } else {
            this.carryOn = l;
        }
        if ((i & 2) == 0) {
            this.checked = null;
        } else {
            this.checked = l2;
        }
    }

    public /* synthetic */ FlightRowBags(Long l, Long l2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }

    public FlightRowBags() {
        this(null, null);
    }
}
