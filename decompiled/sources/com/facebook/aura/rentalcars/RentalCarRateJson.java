package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9tJ;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarRateJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final RentalCarVehicleJson car;
    public final String dropoff_date;
    public final RentalCarLocationJson dropoff_location;
    public final String dropoff_time;
    public final RentalCarMileageJson mileage;
    public final String payment_type;
    public final String pickup_date;
    public final RentalCarLocationJson pickup_location;
    public final String pickup_time;
    public final String rate_id;
    public final RentalCarSupplierJson supplier;
    public final String total_amount;
    public final String total_currency;

    public final class Companion {
        public final C9hr<RentalCarRateJson> serializer() {
            return RentalCarRateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public RentalCarRateJson() {
        this("", "", "", null, null, null, null, null, null, "", null, "", null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarRateJson rentalCarRateJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(rentalCarRateJson.rate_id)) {
            c9j5.AAV(rentalCarRateJson.rate_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(rentalCarRateJson.total_amount)) {
            c9j5.AAV(rentalCarRateJson.total_amount, c9iZ, 1);
        }
        if (zAfR || !"".equals(rentalCarRateJson.total_currency)) {
            c9j5.AAV(rentalCarRateJson.total_currency, c9iZ, 2);
        }
        if (zAfR || rentalCarRateJson.payment_type != null) {
            c9j5.AAP(rentalCarRateJson.payment_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || rentalCarRateJson.mileage != null) {
            c9j5.AAP(rentalCarRateJson.mileage, RentalCarMileageJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || rentalCarRateJson.supplier != null) {
            c9j5.AAP(rentalCarRateJson.supplier, RentalCarSupplierJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || rentalCarRateJson.car != null) {
            c9j5.AAP(rentalCarRateJson.car, RentalCarVehicleJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || rentalCarRateJson.pickup_location != null) {
            c9j5.AAP(rentalCarRateJson.pickup_location, RentalCarLocationJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || rentalCarRateJson.dropoff_location != null) {
            c9j5.AAP(rentalCarRateJson.dropoff_location, RentalCarLocationJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || !"".equals(rentalCarRateJson.pickup_date)) {
            c9j5.AAV(rentalCarRateJson.pickup_date, c9iZ, 9);
        }
        if (zAfR || rentalCarRateJson.pickup_time != null) {
            c9j5.AAP(rentalCarRateJson.pickup_time, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || !"".equals(rentalCarRateJson.dropoff_date)) {
            c9j5.AAV(rentalCarRateJson.dropoff_date, c9iZ, 11);
        }
        if (zAfR || rentalCarRateJson.dropoff_time != null) {
            c9j5.AAP(rentalCarRateJson.dropoff_time, C07779iq.A01, c9iZ, 12);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarRateJson) {
                RentalCarRateJson rentalCarRateJson = (RentalCarRateJson) obj;
                if (!C7384Etj.areEqual(this.rate_id, rentalCarRateJson.rate_id) || !C7384Etj.areEqual(this.total_amount, rentalCarRateJson.total_amount) || !C7384Etj.areEqual(this.total_currency, rentalCarRateJson.total_currency) || !C7384Etj.areEqual(this.payment_type, rentalCarRateJson.payment_type) || !C7384Etj.areEqual(this.mileage, rentalCarRateJson.mileage) || !C7384Etj.areEqual(this.supplier, rentalCarRateJson.supplier) || !C7384Etj.areEqual(this.car, rentalCarRateJson.car) || !C7384Etj.areEqual(this.pickup_location, rentalCarRateJson.pickup_location) || !C7384Etj.areEqual(this.dropoff_location, rentalCarRateJson.dropoff_location) || !C7384Etj.areEqual(this.pickup_date, rentalCarRateJson.pickup_date) || !C7384Etj.areEqual(this.pickup_time, rentalCarRateJson.pickup_time) || !C7384Etj.areEqual(this.dropoff_date, rentalCarRateJson.dropoff_date) || !C7384Etj.areEqual(this.dropoff_time, rentalCarRateJson.dropoff_time)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarRateJson copy$default(RentalCarRateJson rentalCarRateJson, String str, String str2, String str3, String str4, RentalCarMileageJson rentalCarMileageJson, RentalCarSupplierJson rentalCarSupplierJson, RentalCarVehicleJson rentalCarVehicleJson, RentalCarLocationJson rentalCarLocationJson, RentalCarLocationJson rentalCarLocationJson2, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarRateJson.rate_id;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarRateJson.total_amount;
        }
        if ((i & 4) != 0) {
            str3 = rentalCarRateJson.total_currency;
        }
        if ((i & 8) != 0) {
            str4 = rentalCarRateJson.payment_type;
        }
        if ((i & 16) != 0) {
            rentalCarMileageJson = rentalCarRateJson.mileage;
        }
        if ((i & 32) != 0) {
            rentalCarSupplierJson = rentalCarRateJson.supplier;
        }
        if ((i & 64) != 0) {
            rentalCarVehicleJson = rentalCarRateJson.car;
        }
        if ((i & 128) != 0) {
            rentalCarLocationJson = rentalCarRateJson.pickup_location;
        }
        if ((i & 256) != 0) {
            rentalCarLocationJson2 = rentalCarRateJson.dropoff_location;
        }
        if ((i & 512) != 0) {
            str5 = rentalCarRateJson.pickup_date;
        }
        if ((i & 1024) != 0) {
            str6 = rentalCarRateJson.pickup_time;
        }
        if ((i & 2048) != 0) {
            str7 = rentalCarRateJson.dropoff_date;
        }
        if ((i & 4096) != 0) {
            str8 = rentalCarRateJson.dropoff_time;
        }
        return rentalCarRateJson.copy(str, str2, str3, str4, rentalCarMileageJson, rentalCarSupplierJson, rentalCarVehicleJson, rentalCarLocationJson, rentalCarLocationJson2, str5, str6, str7, str8);
    }

    public final String component1() {
        return this.rate_id;
    }

    public final String component10() {
        return this.pickup_date;
    }

    public final String component11() {
        return this.pickup_time;
    }

    public final String component12() {
        return this.dropoff_date;
    }

    public final String component13() {
        return this.dropoff_time;
    }

    public final String component2() {
        return this.total_amount;
    }

    public final String component3() {
        return this.total_currency;
    }

    public final String component4() {
        return this.payment_type;
    }

    public final RentalCarMileageJson component5() {
        return this.mileage;
    }

    public final RentalCarSupplierJson component6() {
        return this.supplier;
    }

    public final RentalCarVehicleJson component7() {
        return this.car;
    }

    public final RentalCarLocationJson component8() {
        return this.pickup_location;
    }

    public final RentalCarLocationJson component9() {
        return this.dropoff_location;
    }

    public final RentalCarVehicleJson getCar() {
        return this.car;
    }

    public final String getDropoff_date() {
        return this.dropoff_date;
    }

    public final RentalCarLocationJson getDropoff_location() {
        return this.dropoff_location;
    }

    public final String getDropoff_time() {
        return this.dropoff_time;
    }

    public final RentalCarMileageJson getMileage() {
        return this.mileage;
    }

    public final String getPayment_type() {
        return this.payment_type;
    }

    public final String getPickup_date() {
        return this.pickup_date;
    }

    public final RentalCarLocationJson getPickup_location() {
        return this.pickup_location;
    }

    public final String getPickup_time() {
        return this.pickup_time;
    }

    public final String getRate_id() {
        return this.rate_id;
    }

    public final RentalCarSupplierJson getSupplier() {
        return this.supplier;
    }

    public final String getTotal_amount() {
        return this.total_amount;
    }

    public final String getTotal_currency() {
        return this.total_currency;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.dropoff_date, (AnonymousClass005.A0I(this.pickup_date, (((((((((((AnonymousClass005.A0I(this.total_currency, AnonymousClass005.A0I(this.total_amount, AnonymousClass001.A0G(this.rate_id))) + AnonymousClass006.A0G(this.payment_type)) * 31) + AnonymousClass006.A0D(this.mileage)) * 31) + AnonymousClass006.A0D(this.supplier)) * 31) + AnonymousClass006.A0D(this.car)) * 31) + AnonymousClass006.A0D(this.pickup_location)) * 31) + AnonymousClass006.A0D(this.dropoff_location)) * 31) + AnonymousClass006.A0G(this.pickup_time)) * 31) + AnonymousClass005.A0H(this.dropoff_time);
    }

    public final RentalCarRate toDomain() {
        BigDecimal bigDecimalA0x;
        RentalCarSupplierJson rentalCarSupplierJson;
        String str;
        String strA0q;
        RentalCarVehicleJson rentalCarVehicleJson;
        RentalCarVehicle domain;
        LocalDate localDateOrNull;
        LocalDate localDateOrNull2;
        RentalCarLocation domain2;
        RentalCarLocation domain3;
        String strA0q2 = C60O.A0q(AnonymousClass002.A0l(this.rate_id));
        if (strA0q2 != null && (bigDecimalA0x = C9tJ.A0x(AnonymousClass002.A0l(this.total_amount))) != null && bigDecimalA0x.signum() >= 0) {
            String upperCase = AnonymousClass002.A0l(this.total_currency).toUpperCase(Locale.ROOT);
            if (RentalCarRateJsonKt.isIsoCurrency(upperCase) && (rentalCarSupplierJson = this.supplier) != null && (str = rentalCarSupplierJson.name) != null && (strA0q = C60O.A0q(AnonymousClass002.A0l(str))) != null && (rentalCarVehicleJson = this.car) != null && (domain = rentalCarVehicleJson.toDomain()) != null && (localDateOrNull = RentalCarRateJsonKt.toLocalDateOrNull(this.pickup_date)) != null && (localDateOrNull2 = RentalCarRateJsonKt.toLocalDateOrNull(this.dropoff_date)) != null) {
                RentalCarMoney rentalCarMoney = new RentalCarMoney(bigDecimalA0x, upperCase);
                RentalCarPaymentType rentalCarPaymentTypePaymentTypeFromWire = RentalCarRateJsonKt.paymentTypeFromWire(this.payment_type);
                RentalCarMileageJson rentalCarMileageJson = this.mileage;
                RentalCarMileage domain4 = rentalCarMileageJson != null ? rentalCarMileageJson.toDomain() : null;
                String str2 = this.supplier.logo_url;
                RentalCarSupplier rentalCarSupplier = new RentalCarSupplier(strA0q, str2 != null ? RentalCarRateJsonKt.httpsUrlOrNull(str2) : null);
                String str3 = this.pickup_time;
                LocalTime localTimeOrNull = str3 != null ? RentalCarRateJsonKt.toLocalTimeOrNull(str3) : null;
                RentalCarLocationJson rentalCarLocationJson = this.pickup_location;
                if (rentalCarLocationJson == null || (domain2 = rentalCarLocationJson.toDomain()) == null) {
                    domain2 = RentalCarRateJsonKt.EMPTY_LOCATION;
                }
                RentalCarStop rentalCarStop = new RentalCarStop(localDateOrNull, localTimeOrNull, domain2);
                String str4 = this.dropoff_time;
                LocalTime localTimeOrNull2 = str4 != null ? RentalCarRateJsonKt.toLocalTimeOrNull(str4) : null;
                RentalCarLocationJson rentalCarLocationJson2 = this.dropoff_location;
                if (rentalCarLocationJson2 == null || (domain3 = rentalCarLocationJson2.toDomain()) == null) {
                    domain3 = RentalCarRateJsonKt.EMPTY_LOCATION;
                }
                return new RentalCarRate(strA0q2, rentalCarMoney, rentalCarPaymentTypePaymentTypeFromWire, domain4, rentalCarSupplier, domain, rentalCarStop, new RentalCarStop(localDateOrNull2, localTimeOrNull2, domain3));
            }
        }
        return null;
    }

    public final RentalCarRateJson copy(String str, String str2, String str3, String str4, RentalCarMileageJson rentalCarMileageJson, RentalCarSupplierJson rentalCarSupplierJson, RentalCarVehicleJson rentalCarVehicleJson, RentalCarLocationJson rentalCarLocationJson, RentalCarLocationJson rentalCarLocationJson2, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass002.A1G(str5, 9, str7);
        return new RentalCarRateJson(str, str2, str3, str4, rentalCarMileageJson, rentalCarSupplierJson, rentalCarVehicleJson, rentalCarLocationJson, rentalCarLocationJson2, str5, str6, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarRateJson(String str, String str2, String str3, String str4, RentalCarMileageJson rentalCarMileageJson, RentalCarSupplierJson rentalCarSupplierJson, RentalCarVehicleJson rentalCarVehicleJson, RentalCarLocationJson rentalCarLocationJson, RentalCarLocationJson rentalCarLocationJson2, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : rentalCarMileageJson, (i & 32) != 0 ? null : rentalCarSupplierJson, (i & 64) != 0 ? null : rentalCarVehicleJson, (i & 128) != 0 ? null : rentalCarLocationJson, (i & 256) != 0 ? null : rentalCarLocationJson2, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? null : str6, (i & 2048) == 0 ? str7 : "", (i & 4096) != 0 ? null : str8);
    }

    public RentalCarRateJson(String str, String str2, String str3, String str4, RentalCarMileageJson rentalCarMileageJson, RentalCarSupplierJson rentalCarSupplierJson, RentalCarVehicleJson rentalCarVehicleJson, RentalCarLocationJson rentalCarLocationJson, RentalCarLocationJson rentalCarLocationJson2, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass002.A1G(str5, 9, str7);
        this.rate_id = str;
        this.total_amount = str2;
        this.total_currency = str3;
        this.payment_type = str4;
        this.mileage = rentalCarMileageJson;
        this.supplier = rentalCarSupplierJson;
        this.car = rentalCarVehicleJson;
        this.pickup_location = rentalCarLocationJson;
        this.dropoff_location = rentalCarLocationJson2;
        this.pickup_date = str5;
        this.pickup_time = str6;
        this.dropoff_date = str7;
        this.dropoff_time = str8;
    }

    public /* synthetic */ RentalCarRateJson(int i, String str, String str2, String str3, String str4, RentalCarMileageJson rentalCarMileageJson, RentalCarSupplierJson rentalCarSupplierJson, RentalCarVehicleJson rentalCarVehicleJson, RentalCarLocationJson rentalCarLocationJson, RentalCarLocationJson rentalCarLocationJson2, String str5, String str6, String str7, String str8, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.rate_id = "";
        } else {
            this.rate_id = str;
        }
        if ((i & 2) == 0) {
            this.total_amount = "";
        } else {
            this.total_amount = str2;
        }
        if ((i & 4) == 0) {
            this.total_currency = "";
        } else {
            this.total_currency = str3;
        }
        if ((i & 8) == 0) {
            this.payment_type = null;
        } else {
            this.payment_type = str4;
        }
        if ((i & 16) == 0) {
            this.mileage = null;
        } else {
            this.mileage = rentalCarMileageJson;
        }
        if ((i & 32) == 0) {
            this.supplier = null;
        } else {
            this.supplier = rentalCarSupplierJson;
        }
        if ((i & 64) == 0) {
            this.car = null;
        } else {
            this.car = rentalCarVehicleJson;
        }
        if ((i & 128) == 0) {
            this.pickup_location = null;
        } else {
            this.pickup_location = rentalCarLocationJson;
        }
        if ((i & 256) == 0) {
            this.dropoff_location = null;
        } else {
            this.dropoff_location = rentalCarLocationJson2;
        }
        if ((i & 512) == 0) {
            this.pickup_date = "";
        } else {
            this.pickup_date = str5;
        }
        if ((i & 1024) == 0) {
            this.pickup_time = null;
        } else {
            this.pickup_time = str6;
        }
        if ((i & 2048) == 0) {
            this.dropoff_date = "";
        } else {
            this.dropoff_date = str7;
        }
        if ((i & 4096) == 0) {
            this.dropoff_time = null;
        } else {
            this.dropoff_time = str8;
        }
    }
}
