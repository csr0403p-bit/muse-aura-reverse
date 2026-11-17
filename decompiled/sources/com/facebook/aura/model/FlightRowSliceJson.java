package com.facebook.aura.model;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightRowSliceJson extends C06G {
    public static final int $stable = 8;
    public final FlightTimestampJson arrive;
    public final String cabin;
    public final boolean cabin_varies;
    public final FlightTimestampJson depart;
    public final String duration;
    public final String fare_brand;
    public final String from;
    public final List<FlightRowSegmentJson> segments;
    public final int stops;
    public final String to;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, FlightRowSliceJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<FlightRowSliceJson> serializer() {
            return FlightRowSliceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightRowSliceJson) {
                FlightRowSliceJson flightRowSliceJson = (FlightRowSliceJson) obj;
                if (!C7384Etj.areEqual(this.from, flightRowSliceJson.from) || !C7384Etj.areEqual(this.to, flightRowSliceJson.to) || !C7384Etj.areEqual(this.depart, flightRowSliceJson.depart) || !C7384Etj.areEqual(this.arrive, flightRowSliceJson.arrive) || !C7384Etj.areEqual(this.duration, flightRowSliceJson.duration) || this.stops != flightRowSliceJson.stops || !C7384Etj.areEqual(this.cabin, flightRowSliceJson.cabin) || this.cabin_varies != flightRowSliceJson.cabin_varies || !C7384Etj.areEqual(this.fare_brand, flightRowSliceJson.fare_brand) || !C7384Etj.areEqual(this.segments, flightRowSliceJson.segments)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightRowSliceJson copy$default(FlightRowSliceJson flightRowSliceJson, String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, int i, String str4, boolean z, String str5, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flightRowSliceJson.from;
        }
        if ((i2 & 2) != 0) {
            str2 = flightRowSliceJson.to;
        }
        if ((i2 & 4) != 0) {
            flightTimestampJson = flightRowSliceJson.depart;
        }
        if ((i2 & 8) != 0) {
            flightTimestampJson2 = flightRowSliceJson.arrive;
        }
        if ((i2 & 16) != 0) {
            str3 = flightRowSliceJson.duration;
        }
        if ((i2 & 32) != 0) {
            i = flightRowSliceJson.stops;
        }
        if ((i2 & 64) != 0) {
            str4 = flightRowSliceJson.cabin;
        }
        if ((i2 & 128) != 0) {
            z = flightRowSliceJson.cabin_varies;
        }
        if ((i2 & 256) != 0) {
            str5 = flightRowSliceJson.fare_brand;
        }
        if ((i2 & 512) != 0) {
            list = flightRowSliceJson.segments;
        }
        return flightRowSliceJson.copy(str, str2, flightTimestampJson, flightTimestampJson2, str3, i, str4, z, str5, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightRowSliceJson flightRowSliceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(flightRowSliceJson.from)) {
            c9j5.AAV(flightRowSliceJson.from, c9iZ, 0);
        }
        if (zAfR || !"".equals(flightRowSliceJson.to)) {
            c9j5.AAV(flightRowSliceJson.to, c9iZ, 1);
        }
        if (zAfR || flightRowSliceJson.depart != null) {
            c9j5.AAP(flightRowSliceJson.depart, FlightTimestampJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || flightRowSliceJson.arrive != null) {
            c9j5.AAP(flightRowSliceJson.arrive, FlightTimestampJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || flightRowSliceJson.duration != null) {
            c9j5.AAP(flightRowSliceJson.duration, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || flightRowSliceJson.stops != 0) {
            c9j5.AAK(c9iZ, 5, flightRowSliceJson.stops);
        }
        if (zAfR || flightRowSliceJson.cabin != null) {
            c9j5.AAP(flightRowSliceJson.cabin, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || flightRowSliceJson.cabin_varies) {
            c9j5.AA7(c9iZ, 7, flightRowSliceJson.cabin_varies);
        }
        if (zAfR || flightRowSliceJson.fare_brand != null) {
            c9j5.AAP(flightRowSliceJson.fare_brand, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(flightRowSliceJson.segments)) {
            c9j5.AAQ(flightRowSliceJson.segments, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
    }

    public final String component1() {
        return this.from;
    }

    public final List<FlightRowSegmentJson> component10() {
        return this.segments;
    }

    public final String component2() {
        return this.to;
    }

    public final FlightTimestampJson component3() {
        return this.depart;
    }

    public final FlightTimestampJson component4() {
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
        return this.cabin_varies;
    }

    public final String component9() {
        return this.fare_brand;
    }

    public final FlightTimestampJson getArrive() {
        return this.arrive;
    }

    public final String getCabin() {
        return this.cabin;
    }

    public final boolean getCabin_varies() {
        return this.cabin_varies;
    }

    public final FlightTimestampJson getDepart() {
        return this.depart;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFare_brand() {
        return this.fare_brand;
    }

    public final String getFrom() {
        return this.from;
    }

    public final List<FlightRowSegmentJson> getSegments() {
        return this.segments;
    }

    public final int getStops() {
        return this.stops;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.segments, (C0KA.A01((((((((((AnonymousClass005.A0I(this.to, AnonymousClass001.A0G(this.from)) + AnonymousClass006.A0D(this.depart)) * 31) + AnonymousClass006.A0D(this.arrive)) * 31) + AnonymousClass006.A0G(this.duration)) * 31) + this.stops) * 31) + AnonymousClass006.A0G(this.cabin)) * 31, this.cabin_varies) + AnonymousClass005.A0H(this.fare_brand)) * 31);
    }

    public final FlightRowSlice toDomain() {
        FlightTimestamp domain;
        FlightTimestamp domain2;
        String strA0l;
        String strA0l2;
        String strA0l3;
        List<FlightRowSegmentJson> list = this.segments;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<FlightRowSegmentJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        if (arrayListA0i.isEmpty()) {
            return null;
        }
        if (!(arrayListA0i instanceof Collection) || !arrayListA0i.isEmpty()) {
            Iterator it2 = arrayListA0i.iterator();
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    return null;
                }
            }
        }
        List listA0U = AbstractC0878AGe.A0U(arrayListA0i);
        String strA0l4 = AnonymousClass002.A0l(this.from);
        String strA0l5 = AnonymousClass002.A0l(this.to);
        FlightTimestampJson flightTimestampJson = this.depart;
        if (flightTimestampJson == null || (domain = flightTimestampJson.toDomain()) == null) {
            domain = ((FlightRowSegment) AbstractC0878AGe.A0F(listA0U)).depart;
        }
        FlightTimestampJson flightTimestampJson2 = this.arrive;
        if (flightTimestampJson2 == null || (domain2 = flightTimestampJson2.toDomain()) == null) {
            domain2 = ((FlightRowSegment) AbstractC0878AGe.A0H(listA0U)).arrive;
        }
        String str = this.duration;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        int i = this.stops;
        if (i < 0) {
            i = 0;
        }
        String str2 = this.cabin;
        if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        boolean z = this.cabin_varies;
        String str3 = this.fare_brand;
        if (str3 == null || (strA0l3 = AnonymousClass002.A0l(str3)) == null || strA0l3.length() <= 0) {
            strA0l3 = null;
        }
        return new FlightRowSlice(strA0l4, strA0l5, domain, domain2, strA0l, i, strA0l2, z, strA0l3, listA0U);
    }

    public FlightRowSliceJson(String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, int i, String str4, boolean z, String str5, List<FlightRowSegmentJson> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 9);
        this.from = str;
        this.to = str2;
        this.depart = flightTimestampJson;
        this.arrive = flightTimestampJson2;
        this.duration = str3;
        this.stops = i;
        this.cabin = str4;
        this.cabin_varies = z;
        this.fare_brand = str5;
        this.segments = list;
    }

    public final FlightRowSliceJson copy(String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, int i, String str4, boolean z, String str5, List<FlightRowSegmentJson> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 9);
        return new FlightRowSliceJson(str, str2, flightTimestampJson, flightTimestampJson2, str3, i, str4, z, str5, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightRowSliceJson(String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, int i, String str4, boolean z, String str5, List list, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : flightTimestampJson, (i2 & 8) != 0 ? null : flightTimestampJson2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ FlightRowSliceJson(int i, String str, String str2, FlightTimestampJson flightTimestampJson, FlightTimestampJson flightTimestampJson2, String str3, int i2, String str4, boolean z, String str5, List list, C2hx c2hx) {
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
            this.depart = flightTimestampJson;
        }
        if ((i & 8) == 0) {
            this.arrive = null;
        } else {
            this.arrive = flightTimestampJson2;
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
            this.cabin_varies = false;
        } else {
            this.cabin_varies = z;
        }
        if ((i & 256) == 0) {
            this.fare_brand = null;
        } else {
            this.fare_brand = str5;
        }
        if ((i & 512) == 0) {
            this.segments = C0881AGi.A00;
        } else {
            this.segments = list;
        }
    }

    public FlightRowSliceJson() {
        this("", "", null, null, null, 0, null, false, null, C0881AGi.A00);
    }
}
