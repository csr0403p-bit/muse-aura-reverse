package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightRowPriceComponent extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String price;
    public final String pricePerPassenger;
    public final String type;

    public final class Companion {
        public final C9hr<FlightRowPriceComponent> serializer() {
            return FlightRowPriceComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowPriceComponent flightRowPriceComponent, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(flightRowPriceComponent.type, c9iZ, 0);
        c9j5.AAV(flightRowPriceComponent.price, c9iZ, 1);
        if (c9j5.AfR() || flightRowPriceComponent.pricePerPassenger != null) {
            c9j5.AAP(flightRowPriceComponent.pricePerPassenger, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowPriceComponent) {
                FlightRowPriceComponent flightRowPriceComponent = (FlightRowPriceComponent) obj;
                if (!C7384Etj.areEqual(this.type, flightRowPriceComponent.type) || !C7384Etj.areEqual(this.price, flightRowPriceComponent.price) || !C7384Etj.areEqual(this.pricePerPassenger, flightRowPriceComponent.pricePerPassenger)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightRowPriceComponent copy$default(FlightRowPriceComponent flightRowPriceComponent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightRowPriceComponent.type;
        }
        if ((i & 2) != 0) {
            str2 = flightRowPriceComponent.price;
        }
        if ((i & 4) != 0) {
            str3 = flightRowPriceComponent.pricePerPassenger;
        }
        return flightRowPriceComponent.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.price;
    }

    public final String component3() {
        return this.pricePerPassenger;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPricePerPassenger() {
        return this.pricePerPassenger;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.price, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.pricePerPassenger);
    }

    public FlightRowPriceComponent(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.type = str;
        this.price = str2;
        this.pricePerPassenger = str3;
    }

    public final FlightRowPriceComponent copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new FlightRowPriceComponent(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowPriceComponent(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FlightRowPriceComponent$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.price = str2;
        this.pricePerPassenger = C3cI.A0W(i, str3);
    }

    public /* synthetic */ FlightRowPriceComponent(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
