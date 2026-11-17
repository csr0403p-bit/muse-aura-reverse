package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightTimestampJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String date_string;
    public final Integer day_offset;
    public final String long_timestamp_string;
    public final String short_timestamp_string;

    public final class Companion {
        public final C9hr<FlightTimestampJson> serializer() {
            return FlightTimestampJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightTimestampJson flightTimestampJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(flightTimestampJson.short_timestamp_string)) {
            c9j5.AAV(flightTimestampJson.short_timestamp_string, c9iZ, 0);
        }
        if (zAfR || !"".equals(flightTimestampJson.long_timestamp_string)) {
            c9j5.AAV(flightTimestampJson.long_timestamp_string, c9iZ, 1);
        }
        if (zAfR || flightTimestampJson.date_string != null) {
            c9j5.AAP(flightTimestampJson.date_string, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightTimestampJson.day_offset != null) {
            c9j5.AAP(flightTimestampJson.day_offset, C07729ii.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightTimestampJson) {
                FlightTimestampJson flightTimestampJson = (FlightTimestampJson) obj;
                if (!C7384Etj.areEqual(this.short_timestamp_string, flightTimestampJson.short_timestamp_string) || !C7384Etj.areEqual(this.long_timestamp_string, flightTimestampJson.long_timestamp_string) || !C7384Etj.areEqual(this.date_string, flightTimestampJson.date_string) || !C7384Etj.areEqual(this.day_offset, flightTimestampJson.day_offset)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightTimestampJson copy$default(FlightTimestampJson flightTimestampJson, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightTimestampJson.short_timestamp_string;
        }
        if ((i & 2) != 0) {
            str2 = flightTimestampJson.long_timestamp_string;
        }
        if ((i & 4) != 0) {
            str3 = flightTimestampJson.date_string;
        }
        if ((i & 8) != 0) {
            num = flightTimestampJson.day_offset;
        }
        AnonymousClass003.A0u(str, str2);
        return new FlightTimestampJson(str, str2, str3, num);
    }

    public final String component1() {
        return this.short_timestamp_string;
    }

    public final String component2() {
        return this.long_timestamp_string;
    }

    public final String component3() {
        return this.date_string;
    }

    public final Integer component4() {
        return this.day_offset;
    }

    public final String getDate_string() {
        return this.date_string;
    }

    public final Integer getDay_offset() {
        return this.day_offset;
    }

    public final String getLong_timestamp_string() {
        return this.long_timestamp_string;
    }

    public final String getShort_timestamp_string() {
        return this.short_timestamp_string;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.long_timestamp_string, AnonymousClass001.A0G(this.short_timestamp_string)) + AnonymousClass006.A0G(this.date_string)) * 31) + C3cH.A02(this.day_offset);
    }

    public final FlightTimestamp toDomain() {
        String strA0l;
        String strA0l2 = AnonymousClass002.A0l(this.short_timestamp_string);
        String str = null;
        if (strA0l2.length() <= 0) {
            return null;
        }
        String strA0l3 = AnonymousClass002.A0l(this.long_timestamp_string);
        if (strA0l3.length() <= 0) {
            strA0l3 = strA0l2;
        }
        String str2 = this.date_string;
        if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
            str = strA0l;
        }
        Integer num = this.day_offset;
        return new FlightTimestamp(strA0l2, strA0l3, str, num != null ? num.intValue() : 0);
    }

    public FlightTimestampJson(String str, String str2, String str3, Integer num) {
        AnonymousClass003.A0u(str, str2);
        this.short_timestamp_string = str;
        this.long_timestamp_string = str2;
        this.date_string = str3;
        this.day_offset = num;
    }

    public final FlightTimestampJson copy(String str, String str2, String str3, Integer num) {
        AnonymousClass003.A0u(str, str2);
        return new FlightTimestampJson(str, str2, str3, num);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightTimestampJson(int i, String str, String str2, String str3, Integer num, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.short_timestamp_string = "";
        } else {
            this.short_timestamp_string = str;
        }
        if ((i & 2) == 0) {
            this.long_timestamp_string = "";
        } else {
            this.long_timestamp_string = str2;
        }
        if ((i & 4) == 0) {
            this.date_string = null;
        } else {
            this.date_string = str3;
        }
        if ((i & 8) == 0) {
            this.day_offset = null;
        } else {
            this.day_offset = num;
        }
    }

    public /* synthetic */ FlightTimestampJson(String str, String str2, String str3, Integer num, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }

    public FlightTimestampJson() {
        this("", "", null, null);
    }
}
