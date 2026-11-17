package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingOccupancyJson extends C06G {
    public static final int $stable = 8;
    public final int adults;
    public final List<Integer> child_ages;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, CheckoutLodgingOccupancyJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CheckoutLodgingOccupancyJson> serializer() {
            return CheckoutLodgingOccupancyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CheckoutLodgingOccupancyJson(int i, List<Integer> list) {
        C7384Etj.A0Y(list, 1);
        this.adults = i;
        this.child_ages = list;
    }

    public final CheckoutLodgingOccupancyJson copy(int i, List<Integer> list) {
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingOccupancyJson(i, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingOccupancyJson) {
                CheckoutLodgingOccupancyJson checkoutLodgingOccupancyJson = (CheckoutLodgingOccupancyJson) obj;
                if (this.adults != checkoutLodgingOccupancyJson.adults || !C7384Etj.areEqual(this.child_ages, checkoutLodgingOccupancyJson.child_ages)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingOccupancyJson copy$default(CheckoutLodgingOccupancyJson checkoutLodgingOccupancyJson, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkoutLodgingOccupancyJson.adults;
        }
        if ((i2 & 2) != 0) {
            list = checkoutLodgingOccupancyJson.child_ages;
        }
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingOccupancyJson(i, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingOccupancyJson checkoutLodgingOccupancyJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLodgingOccupancyJson.adults != 0) {
            c9j5.AAK(c9iZ, 0, checkoutLodgingOccupancyJson.adults);
        }
        if (zAfR || !C3cG.A1L(checkoutLodgingOccupancyJson.child_ages)) {
            c9j5.AAQ(checkoutLodgingOccupancyJson.child_ages, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final int component1() {
        return this.adults;
    }

    public final List<Integer> component2() {
        return this.child_ages;
    }

    public final int getAdults() {
        return this.adults;
    }

    public final List<Integer> getChild_ages() {
        return this.child_ages;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.child_ages, this.adults * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingOccupancyJson(int i, int i2, List list, C2hx c2hx) {
        this.adults = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.child_ages = C0881AGi.A00;
        } else {
            this.child_ages = list;
        }
    }

    public /* synthetic */ CheckoutLodgingOccupancyJson(int i, List list, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), C3cI.A11(list, i2));
    }

    public CheckoutLodgingOccupancyJson() {
        this(0, C0881AGi.A00);
    }
}
