package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final class FlightRowSlice extends C06G {
    public static final int $stable = 0;
    public final FlightTimestamp arrive;
    public final String cabin;
    public final boolean cabinVaries;
    public final FlightTimestamp depart;
    public final String duration;
    public final String fareBrand;
    public final String from;
    public final List<FlightRowSegment> segments;
    public final int stops;
    public final String to;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, FlightRowSlice$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<FlightRowSlice> serializer() {
            return FlightRowSlice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowSlice) {
                FlightRowSlice flightRowSlice = (FlightRowSlice) obj;
                if (!C7384Etj.areEqual(this.from, flightRowSlice.from) || !C7384Etj.areEqual(this.to, flightRowSlice.to) || !C7384Etj.areEqual(this.depart, flightRowSlice.depart) || !C7384Etj.areEqual(this.arrive, flightRowSlice.arrive) || !C7384Etj.areEqual(this.duration, flightRowSlice.duration) || this.stops != flightRowSlice.stops || !C7384Etj.areEqual(this.cabin, flightRowSlice.cabin) || this.cabinVaries != flightRowSlice.cabinVaries || !C7384Etj.areEqual(this.fareBrand, flightRowSlice.fareBrand) || !C7384Etj.areEqual(this.segments, flightRowSlice.segments)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightRowSlice copy$default(FlightRowSlice flightRowSlice, String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, int i, String str4, boolean z, String str5, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flightRowSlice.from;
        }
        if ((i2 & 2) != 0) {
            str2 = flightRowSlice.to;
        }
        if ((i2 & 4) != 0) {
            flightTimestamp = flightRowSlice.depart;
        }
        if ((i2 & 8) != 0) {
            flightTimestamp2 = flightRowSlice.arrive;
        }
        if ((i2 & 16) != 0) {
            str3 = flightRowSlice.duration;
        }
        if ((i2 & 32) != 0) {
            i = flightRowSlice.stops;
        }
        if ((i2 & 64) != 0) {
            str4 = flightRowSlice.cabin;
        }
        if ((i2 & 128) != 0) {
            z = flightRowSlice.cabinVaries;
        }
        if ((i2 & 256) != 0) {
            str5 = flightRowSlice.fareBrand;
        }
        if ((i2 & 512) != 0) {
            list = flightRowSlice.segments;
        }
        return flightRowSlice.copy(str, str2, flightTimestamp, flightTimestamp2, str3, i, str4, z, str5, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowSlice flightRowSlice, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(flightRowSlice.from)) {
            c9j5.AAV(flightRowSlice.from, c9iZ, 0);
        }
        if (zAfR || !"".equals(flightRowSlice.to)) {
            c9j5.AAV(flightRowSlice.to, c9iZ, 1);
        }
        if (zAfR || flightRowSlice.depart != null) {
            c9j5.AAP(flightRowSlice.depart, FlightTimestamp$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || flightRowSlice.arrive != null) {
            c9j5.AAP(flightRowSlice.arrive, FlightTimestamp$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || flightRowSlice.duration != null) {
            c9j5.AAP(flightRowSlice.duration, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || flightRowSlice.stops != 0) {
            c9j5.AAK(c9iZ, 5, flightRowSlice.stops);
        }
        if (zAfR || flightRowSlice.cabin != null) {
            c9j5.AAP(flightRowSlice.cabin, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || flightRowSlice.cabinVaries) {
            c9j5.AA7(c9iZ, 7, flightRowSlice.cabinVaries);
        }
        if (zAfR || flightRowSlice.fareBrand != null) {
            c9j5.AAP(flightRowSlice.fareBrand, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(flightRowSlice.segments)) {
            c9j5.AAQ(flightRowSlice.segments, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
    }

    public final String component1() {
        return this.from;
    }

    public final List<FlightRowSegment> component10() {
        return this.segments;
    }

    public final String component2() {
        return this.to;
    }

    public final FlightTimestamp component3() {
        return this.depart;
    }

    public final FlightTimestamp component4() {
        return this.arrive;
    }

    public final String component5() {
        return this.duration;
    }

    public final int component6() {
        return this.stops;
    }

    public final String component7() {
        return this.cabin;
    }

    public final boolean component8() {
        return this.cabinVaries;
    }

    public final String component9() {
        return this.fareBrand;
    }

    public final FlightTimestamp getArrive() {
        return this.arrive;
    }

    public final String getCabin() {
        return this.cabin;
    }

    public final boolean getCabinVaries() {
        return this.cabinVaries;
    }

    public final FlightTimestamp getDepart() {
        return this.depart;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFareBrand() {
        return this.fareBrand;
    }

    public final String getFrom() {
        return this.from;
    }

    public final List<FlightRowSegment> getSegments() {
        return this.segments;
    }

    public final int getStops() {
        return this.stops;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.segments, (C0KA.A01((((((((((AnonymousClass005.A0I(this.to, AnonymousClass001.A0G(this.from)) + AnonymousClass006.A0D(this.depart)) * 31) + AnonymousClass006.A0D(this.arrive)) * 31) + AnonymousClass006.A0G(this.duration)) * 31) + this.stops) * 31) + AnonymousClass006.A0G(this.cabin)) * 31, this.cabinVaries) + AnonymousClass005.A0H(this.fareBrand)) * 31);
    }

    public FlightRowSlice(String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, int i, String str4, boolean z, String str5, List<FlightRowSegment> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 9);
        this.from = str;
        this.to = str2;
        this.depart = flightTimestamp;
        this.arrive = flightTimestamp2;
        this.duration = str3;
        this.stops = i;
        this.cabin = str4;
        this.cabinVaries = z;
        this.fareBrand = str5;
        this.segments = list;
    }

    public final FlightRowSlice copy(String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, int i, String str4, boolean z, String str5, List<FlightRowSegment> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 9);
        return new FlightRowSlice(str, str2, flightTimestamp, flightTimestamp2, str3, i, str4, z, str5, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowSlice(String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, int i, String str4, boolean z, String str5, List list, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : flightTimestamp, (i2 & 8) != 0 ? null : flightTimestamp2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ FlightRowSlice(int i, String str, String str2, FlightTimestamp flightTimestamp, FlightTimestamp flightTimestamp2, String str3, int i2, String str4, boolean z, String str5, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.from = "";
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = "";
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.depart = null;
        } else {
            this.depart = flightTimestamp;
        }
        if ((i & 8) == 0) {
            this.arrive = null;
        } else {
            this.arrive = flightTimestamp2;
        }
        if ((i & 16) == 0) {
            this.duration = null;
        } else {
            this.duration = str3;
        }
        if ((i & 32) == 0) {
            this.stops = 0;
        } else {
            this.stops = i2;
        }
        if ((i & 64) == 0) {
            this.cabin = null;
        } else {
            this.cabin = str4;
        }
        if ((i & 128) == 0) {
            this.cabinVaries = false;
        } else {
            this.cabinVaries = z;
        }
        if ((i & 256) == 0) {
            this.fareBrand = null;
        } else {
            this.fareBrand = str5;
        }
        if ((i & 512) == 0) {
            this.segments = C0881AGi.A00;
        } else {
            this.segments = list;
        }
    }

    public FlightRowSlice() {
        this("", "", null, null, null, 0, null, false, null, C0881AGi.A00);
    }
}
