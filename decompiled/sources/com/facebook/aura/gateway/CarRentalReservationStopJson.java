package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CarRentalReservationStopJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String address;
    public final String date;
    public final String location_name;
    public final String time;

    public final class Companion {
        public final C9hr<CarRentalReservationStopJson> serializer() {
            return CarRentalReservationStopJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CarRentalReservationStopJson carRentalReservationStopJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || carRentalReservationStopJson.date != null) {
            c9j5.AAP(carRentalReservationStopJson.date, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || carRentalReservationStopJson.time != null) {
            c9j5.AAP(carRentalReservationStopJson.time, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || carRentalReservationStopJson.location_name != null) {
            c9j5.AAP(carRentalReservationStopJson.location_name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || carRentalReservationStopJson.address != null) {
            c9j5.AAP(carRentalReservationStopJson.address, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CarRentalReservationStopJson) {
                CarRentalReservationStopJson carRentalReservationStopJson = (CarRentalReservationStopJson) obj;
                if (!C7384Etj.areEqual(this.date, carRentalReservationStopJson.date) || !C7384Etj.areEqual(this.time, carRentalReservationStopJson.time) || !C7384Etj.areEqual(this.location_name, carRentalReservationStopJson.location_name) || !C7384Etj.areEqual(this.address, carRentalReservationStopJson.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CarRentalReservationStopJson copy$default(CarRentalReservationStopJson carRentalReservationStopJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carRentalReservationStopJson.date;
        }
        if ((i & 2) != 0) {
            str2 = carRentalReservationStopJson.time;
        }
        if ((i & 4) != 0) {
            str3 = carRentalReservationStopJson.location_name;
        }
        if ((i & 8) != 0) {
            str4 = carRentalReservationStopJson.address;
        }
        return new CarRentalReservationStopJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.time;
    }

    public final String component3() {
        return this.location_name;
    }

    public final String component4() {
        return this.address;
    }

    public final CarRentalReservationStopJson copy(String str, String str2, String str3, String str4) {
        return new CarRentalReservationStopJson(str, str2, str3, str4);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getLocation_name() {
        return this.location_name;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.date) * 31) + AnonymousClass006.A0G(this.time)) * 31) + AnonymousClass006.A0G(this.location_name)) * 31) + AnonymousClass005.A0H(this.address);
    }

    public final HatchAgentPermissionsRepository.CarRentalReservationStop toDomainOrNull() {
        String strA0l;
        Object objA0s;
        LocalTime localTime;
        String strA0l2;
        Object objA0s2;
        String str = this.date;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            try {
                objA0s = LocalDate.parse(strA0l);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            LocalDate localDate = (LocalDate) objA0s;
            if (localDate != null) {
                String str2 = this.time;
                if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null) {
                    localTime = null;
                } else {
                    try {
                        objA0s2 = LocalTime.parse(strA0l2);
                    } catch (Throwable th2) {
                        objA0s2 = C3cG.A0s(th2);
                    }
                    if (objA0s2 instanceof C10571Hud) {
                        objA0s2 = null;
                    }
                    localTime = (LocalTime) objA0s2;
                }
                String strA0Z = C3cI.A0Z(this.location_name);
                String str3 = this.address;
                return new HatchAgentPermissionsRepository.CarRentalReservationStop(localDate, localTime, strA0Z, str3 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3) : null);
            }
        }
        return null;
    }

    public CarRentalReservationStopJson(String str, String str2, String str3, String str4) {
        this.date = str;
        this.time = str2;
        this.location_name = str3;
        this.address = str4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CarRentalReservationStopJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.date = null;
        } else {
            this.date = str;
        }
        if ((i & 2) == 0) {
            this.time = null;
        } else {
            this.time = str2;
        }
        if ((i & 4) == 0) {
            this.location_name = null;
        } else {
            this.location_name = str3;
        }
        if ((i & 8) == 0) {
            this.address = null;
        } else {
            this.address = str4;
        }
    }

    public /* synthetic */ CarRentalReservationStopJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public CarRentalReservationStopJson() {
        this(null, null, null, null);
    }
}
