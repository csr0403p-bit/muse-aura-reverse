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
public final class FlightTimestamp extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String dateString;
    public final int dayOffset;
    public final String longTimestampString;
    public final String shortTimestampString;

    public final class Companion {
        public final C9hr<FlightTimestamp> serializer() {
            return FlightTimestamp$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FlightTimestamp flightTimestamp, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(flightTimestamp.shortTimestampString, c9iZ, 0);
        c9j5.AAV(flightTimestamp.longTimestampString, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightTimestamp.dateString != null) {
            c9j5.AAP(flightTimestamp.dateString, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightTimestamp.dayOffset != 0) {
            c9j5.AAK(c9iZ, 3, flightTimestamp.dayOffset);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightTimestamp) {
                FlightTimestamp flightTimestamp = (FlightTimestamp) obj;
                if (!C7384Etj.areEqual(this.shortTimestampString, flightTimestamp.shortTimestampString) || !C7384Etj.areEqual(this.longTimestampString, flightTimestamp.longTimestampString) || !C7384Etj.areEqual(this.dateString, flightTimestamp.dateString) || this.dayOffset != flightTimestamp.dayOffset) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightTimestamp copy$default(FlightTimestamp flightTimestamp, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flightTimestamp.shortTimestampString;
        }
        if ((i2 & 2) != 0) {
            str2 = flightTimestamp.longTimestampString;
        }
        if ((i2 & 4) != 0) {
            str3 = flightTimestamp.dateString;
        }
        if ((i2 & 8) != 0) {
            i = flightTimestamp.dayOffset;
        }
        AnonymousClass003.A0u(str, str2);
        return new FlightTimestamp(str, str2, str3, i);
    }

    public final String component1() {
        return this.shortTimestampString;
    }

    public final String component2() {
        return this.longTimestampString;
    }

    public final String component3() {
        return this.dateString;
    }

    public final int component4() {
        return this.dayOffset;
    }

    public final String getDateString() {
        return this.dateString;
    }

    public final int getDayOffset() {
        return this.dayOffset;
    }

    public final String getLongTimestampString() {
        return this.longTimestampString;
    }

    public final String getShortTimestampString() {
        return this.shortTimestampString;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.longTimestampString, AnonymousClass001.A0G(this.shortTimestampString)) + AnonymousClass006.A0G(this.dateString)) * 31) + this.dayOffset;
    }

    public FlightTimestamp(String str, String str2, String str3, int i) {
        AnonymousClass003.A0u(str, str2);
        this.shortTimestampString = str;
        this.longTimestampString = str2;
        this.dateString = str3;
        this.dayOffset = i;
    }

    public final FlightTimestamp copy(String str, String str2, String str3, int i) {
        AnonymousClass003.A0u(str, str2);
        return new FlightTimestamp(str, str2, str3, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightTimestamp(int i, String str, String str2, String str3, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FlightTimestamp$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.shortTimestampString = str;
        this.longTimestampString = str2;
        this.dateString = C3cI.A0W(i, str3);
        if ((i & 8) == 0) {
            this.dayOffset = 0;
        } else {
            this.dayOffset = i2;
        }
    }

    public /* synthetic */ FlightTimestamp(String str, String str2, String str3, int i, int i2, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i2, str3), (i2 & 8) != 0 ? 0 : i);
    }
}
