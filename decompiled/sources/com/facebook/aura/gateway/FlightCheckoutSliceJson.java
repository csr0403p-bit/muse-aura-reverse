package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutSliceJson extends C06G {
    public static final int $stable = 8;
    public final String departure_display;
    public final FlightCheckoutPlaceJson destination;
    public final FlightCheckoutPlaceJson origin;
    public final List<FlightCheckoutSegmentJson> segments;
    public final FlightCheckoutStopsJson stops;
    public final String subtitle;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, FlightCheckoutSliceJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<FlightCheckoutSliceJson> serializer() {
            return FlightCheckoutSliceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FlightCheckoutSliceJson() {
        this(null, null, null, null, null, null, C0881AGi.A00);
    }

    public final FlightCheckoutSliceJson copy(FlightCheckoutPlaceJson flightCheckoutPlaceJson, FlightCheckoutPlaceJson flightCheckoutPlaceJson2, String str, FlightCheckoutStopsJson flightCheckoutStopsJson, String str2, String str3, List<FlightCheckoutSegmentJson> list) {
        C7384Etj.A0Y(list, 6);
        return new FlightCheckoutSliceJson(flightCheckoutPlaceJson, flightCheckoutPlaceJson2, str, flightCheckoutStopsJson, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutSliceJson) {
                FlightCheckoutSliceJson flightCheckoutSliceJson = (FlightCheckoutSliceJson) obj;
                if (!C7384Etj.areEqual(this.origin, flightCheckoutSliceJson.origin) || !C7384Etj.areEqual(this.destination, flightCheckoutSliceJson.destination) || !C7384Etj.areEqual(this.departure_display, flightCheckoutSliceJson.departure_display) || !C7384Etj.areEqual(this.stops, flightCheckoutSliceJson.stops) || !C7384Etj.areEqual(this.title, flightCheckoutSliceJson.title) || !C7384Etj.areEqual(this.subtitle, flightCheckoutSliceJson.subtitle) || !C7384Etj.areEqual(this.segments, flightCheckoutSliceJson.segments)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightCheckoutSliceJson copy$default(FlightCheckoutSliceJson flightCheckoutSliceJson, FlightCheckoutPlaceJson flightCheckoutPlaceJson, FlightCheckoutPlaceJson flightCheckoutPlaceJson2, String str, FlightCheckoutStopsJson flightCheckoutStopsJson, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            flightCheckoutPlaceJson = flightCheckoutSliceJson.origin;
        }
        if ((i & 2) != 0) {
            flightCheckoutPlaceJson2 = flightCheckoutSliceJson.destination;
        }
        if ((i & 4) != 0) {
            str = flightCheckoutSliceJson.departure_display;
        }
        if ((i & 8) != 0) {
            flightCheckoutStopsJson = flightCheckoutSliceJson.stops;
        }
        if ((i & 16) != 0) {
            str2 = flightCheckoutSliceJson.title;
        }
        if ((i & 32) != 0) {
            str3 = flightCheckoutSliceJson.subtitle;
        }
        if ((i & 64) != 0) {
            list = flightCheckoutSliceJson.segments;
        }
        return flightCheckoutSliceJson.copy(flightCheckoutPlaceJson, flightCheckoutPlaceJson2, str, flightCheckoutStopsJson, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutSliceJson flightCheckoutSliceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutSliceJson.origin != null) {
            c9j5.AAP(flightCheckoutSliceJson.origin, FlightCheckoutPlaceJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || flightCheckoutSliceJson.destination != null) {
            c9j5.AAP(flightCheckoutSliceJson.destination, FlightCheckoutPlaceJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || flightCheckoutSliceJson.departure_display != null) {
            c9j5.AAP(flightCheckoutSliceJson.departure_display, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightCheckoutSliceJson.stops != null) {
            c9j5.AAP(flightCheckoutSliceJson.stops, FlightCheckoutStopsJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || flightCheckoutSliceJson.title != null) {
            c9j5.AAP(flightCheckoutSliceJson.title, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || flightCheckoutSliceJson.subtitle != null) {
            c9j5.AAP(flightCheckoutSliceJson.subtitle, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutSliceJson.segments)) {
            c9j5.AAQ(flightCheckoutSliceJson.segments, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
    }

    public final FlightCheckoutPlaceJson component1() {
        return this.origin;
    }

    public final FlightCheckoutPlaceJson component2() {
        return this.destination;
    }

    public final String component3() {
        return this.departure_display;
    }

    public final FlightCheckoutStopsJson component4() {
        return this.stops;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.subtitle;
    }

    public final List<FlightCheckoutSegmentJson> component7() {
        return this.segments;
    }

    public final String getDeparture_display() {
        return this.departure_display;
    }

    public final FlightCheckoutPlaceJson getDestination() {
        return this.destination;
    }

    public final FlightCheckoutPlaceJson getOrigin() {
        return this.origin;
    }

    public final List<FlightCheckoutSegmentJson> getSegments() {
        return this.segments;
    }

    public final FlightCheckoutStopsJson getStops() {
        return this.stops;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.segments, ((((((((((AnonymousClass006.A0D(this.origin) * 31) + AnonymousClass006.A0D(this.destination)) * 31) + AnonymousClass006.A0G(this.departure_display)) * 31) + AnonymousClass006.A0D(this.stops)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass005.A0H(this.subtitle)) * 31);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutSlice toDomain() {
        FlightCheckoutPlaceJson flightCheckoutPlaceJson = this.origin;
        String str = flightCheckoutPlaceJson != null ? flightCheckoutPlaceJson.display_name : null;
        FlightCheckoutPlaceJson flightCheckoutPlaceJson2 = this.destination;
        String str2 = flightCheckoutPlaceJson2 != null ? flightCheckoutPlaceJson2.display_name : null;
        String str3 = this.departure_display;
        FlightCheckoutStopsJson flightCheckoutStopsJson = this.stops;
        String str4 = flightCheckoutStopsJson != null ? flightCheckoutStopsJson.display : null;
        String str5 = this.title;
        String str6 = this.subtitle;
        List<FlightCheckoutSegmentJson> list = this.segments;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<FlightCheckoutSegmentJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new HatchAgentPermissionsRepository.FlightCheckoutSlice(str, str2, str3, str4, str5, str6, arrayListA0i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutSliceJson(int i, FlightCheckoutPlaceJson flightCheckoutPlaceJson, FlightCheckoutPlaceJson flightCheckoutPlaceJson2, String str, FlightCheckoutStopsJson flightCheckoutStopsJson, String str2, String str3, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.origin = null;
        } else {
            this.origin = flightCheckoutPlaceJson;
        }
        if ((i & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = flightCheckoutPlaceJson2;
        }
        if ((i & 4) == 0) {
            this.departure_display = null;
        } else {
            this.departure_display = str;
        }
        if ((i & 8) == 0) {
            this.stops = null;
        } else {
            this.stops = flightCheckoutStopsJson;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 32) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 64) == 0) {
            this.segments = C0881AGi.A00;
        } else {
            this.segments = list;
        }
    }

    public FlightCheckoutSliceJson(FlightCheckoutPlaceJson flightCheckoutPlaceJson, FlightCheckoutPlaceJson flightCheckoutPlaceJson2, String str, FlightCheckoutStopsJson flightCheckoutStopsJson, String str2, String str3, List<FlightCheckoutSegmentJson> list) {
        C7384Etj.A0Y(list, 6);
        this.origin = flightCheckoutPlaceJson;
        this.destination = flightCheckoutPlaceJson2;
        this.departure_display = str;
        this.stops = flightCheckoutStopsJson;
        this.title = str2;
        this.subtitle = str3;
        this.segments = list;
    }

    public /* synthetic */ FlightCheckoutSliceJson(FlightCheckoutPlaceJson flightCheckoutPlaceJson, FlightCheckoutPlaceJson flightCheckoutPlaceJson2, String str, FlightCheckoutStopsJson flightCheckoutStopsJson, String str2, String str3, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : flightCheckoutPlaceJson, (i & 2) != 0 ? null : flightCheckoutPlaceJson2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : flightCheckoutStopsJson, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? C0881AGi.A00 : list);
    }
}
