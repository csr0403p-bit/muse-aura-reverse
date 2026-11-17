package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutSeatAssignmentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String cabin_label;
    public final String designator;
    public final Integer passenger_index;
    public final String passenger_name;

    public final class Companion {
        public final C9hr<FlightCheckoutSeatAssignmentJson> serializer() {
            return FlightCheckoutSeatAssignmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutSeatAssignmentJson flightCheckoutSeatAssignmentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutSeatAssignmentJson.passenger_name != null) {
            c9j5.AAP(flightCheckoutSeatAssignmentJson.passenger_name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightCheckoutSeatAssignmentJson.passenger_index != null) {
            c9j5.AAP(flightCheckoutSeatAssignmentJson.passenger_index, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || flightCheckoutSeatAssignmentJson.designator != null) {
            c9j5.AAP(flightCheckoutSeatAssignmentJson.designator, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightCheckoutSeatAssignmentJson.cabin_label != null) {
            c9j5.AAP(flightCheckoutSeatAssignmentJson.cabin_label, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutSeatAssignmentJson) {
                FlightCheckoutSeatAssignmentJson flightCheckoutSeatAssignmentJson = (FlightCheckoutSeatAssignmentJson) obj;
                if (!C7384Etj.areEqual(this.passenger_name, flightCheckoutSeatAssignmentJson.passenger_name) || !C7384Etj.areEqual(this.passenger_index, flightCheckoutSeatAssignmentJson.passenger_index) || !C7384Etj.areEqual(this.designator, flightCheckoutSeatAssignmentJson.designator) || !C7384Etj.areEqual(this.cabin_label, flightCheckoutSeatAssignmentJson.cabin_label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutSeatAssignmentJson copy$default(FlightCheckoutSeatAssignmentJson flightCheckoutSeatAssignmentJson, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutSeatAssignmentJson.passenger_name;
        }
        if ((i & 2) != 0) {
            num = flightCheckoutSeatAssignmentJson.passenger_index;
        }
        if ((i & 4) != 0) {
            str2 = flightCheckoutSeatAssignmentJson.designator;
        }
        if ((i & 8) != 0) {
            str3 = flightCheckoutSeatAssignmentJson.cabin_label;
        }
        return new FlightCheckoutSeatAssignmentJson(str, num, str2, str3);
    }

    public final String component1() {
        return this.passenger_name;
    }

    public final Integer component2() {
        return this.passenger_index;
    }

    public final String component3() {
        return this.designator;
    }

    public final String component4() {
        return this.cabin_label;
    }

    public final FlightCheckoutSeatAssignmentJson copy(String str, Integer num, String str2, String str3) {
        return new FlightCheckoutSeatAssignmentJson(str, num, str2, str3);
    }

    public final String getCabin_label() {
        return this.cabin_label;
    }

    public final String getDesignator() {
        return this.designator;
    }

    public final Integer getPassenger_index() {
        return this.passenger_index;
    }

    public final String getPassenger_name() {
        return this.passenger_name;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.passenger_name) * 31) + AnonymousClass006.A0D(this.passenger_index)) * 31) + AnonymousClass006.A0G(this.designator)) * 31) + AnonymousClass005.A0H(this.cabin_label);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutSeatAssignment toDomainOrNull() {
        String strTrimToNonEmpty;
        String str;
        String strTrimToNonEmpty2;
        String str2 = this.passenger_name;
        if (str2 == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) == null || (str = this.designator) == null || (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) == null) {
            return null;
        }
        Integer num = this.passenger_index;
        String str3 = this.cabin_label;
        return new HatchAgentPermissionsRepository.FlightCheckoutSeatAssignment(strTrimToNonEmpty, num, strTrimToNonEmpty2, str3 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3) : null);
    }

    public FlightCheckoutSeatAssignmentJson(String str, Integer num, String str2, String str3) {
        this.passenger_name = str;
        this.passenger_index = num;
        this.designator = str2;
        this.cabin_label = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutSeatAssignmentJson(int i, String str, Integer num, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.passenger_name = null;
        } else {
            this.passenger_name = str;
        }
        if ((i & 2) == 0) {
            this.passenger_index = null;
        } else {
            this.passenger_index = num;
        }
        if ((i & 4) == 0) {
            this.designator = null;
        } else {
            this.designator = str2;
        }
        if ((i & 8) == 0) {
            this.cabin_label = null;
        } else {
            this.cabin_label = str3;
        }
    }

    public /* synthetic */ FlightCheckoutSeatAssignmentJson(String str, Integer num, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public FlightCheckoutSeatAssignmentJson() {
        this(null, null, null, null);
    }
}
