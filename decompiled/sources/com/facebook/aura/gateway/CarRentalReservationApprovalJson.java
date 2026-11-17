package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
import X.HxE;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CarRentalReservationApprovalJson extends C06G {
    public static final int $stable = 8;
    public final String driver_name;
    public final CarRentalReservationStopJson dropoff;
    public final List<CarRentalReservationLegalLinkJson> legal_links;
    public final String payment_type;
    public final CarRentalReservationStopJson pickup;
    public final CarRentalReservationSupplierJson supplier;
    public final String total_amount;
    public final String total_currency;
    public final CarRentalReservationVehicleJson vehicle;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, CarRentalReservationApprovalJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<CarRentalReservationApprovalJson> serializer() {
            return CarRentalReservationApprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CarRentalReservationApprovalJson) {
                CarRentalReservationApprovalJson carRentalReservationApprovalJson = (CarRentalReservationApprovalJson) obj;
                if (this.version != carRentalReservationApprovalJson.version || !C7384Etj.areEqual(this.supplier, carRentalReservationApprovalJson.supplier) || !C7384Etj.areEqual(this.vehicle, carRentalReservationApprovalJson.vehicle) || !C7384Etj.areEqual(this.pickup, carRentalReservationApprovalJson.pickup) || !C7384Etj.areEqual(this.dropoff, carRentalReservationApprovalJson.dropoff) || !C7384Etj.areEqual(this.total_amount, carRentalReservationApprovalJson.total_amount) || !C7384Etj.areEqual(this.total_currency, carRentalReservationApprovalJson.total_currency) || !C7384Etj.areEqual(this.payment_type, carRentalReservationApprovalJson.payment_type) || !C7384Etj.areEqual(this.driver_name, carRentalReservationApprovalJson.driver_name) || !C7384Etj.areEqual(this.legal_links, carRentalReservationApprovalJson.legal_links)) {
                }
            }
            return false;
        }
        return true;
    }

    public CarRentalReservationApprovalJson(int i, CarRentalReservationSupplierJson carRentalReservationSupplierJson, CarRentalReservationVehicleJson carRentalReservationVehicleJson, CarRentalReservationStopJson carRentalReservationStopJson, CarRentalReservationStopJson carRentalReservationStopJson2, String str, String str2, String str3, String str4, List<CarRentalReservationLegalLinkJson> list) {
        C7384Etj.A0Y(list, 9);
        this.version = i;
        this.supplier = carRentalReservationSupplierJson;
        this.vehicle = carRentalReservationVehicleJson;
        this.pickup = carRentalReservationStopJson;
        this.dropoff = carRentalReservationStopJson2;
        this.total_amount = str;
        this.total_currency = str2;
        this.payment_type = str3;
        this.driver_name = str4;
        this.legal_links = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarRentalReservationApprovalJson copy$default(CarRentalReservationApprovalJson carRentalReservationApprovalJson, int i, CarRentalReservationSupplierJson carRentalReservationSupplierJson, CarRentalReservationVehicleJson carRentalReservationVehicleJson, CarRentalReservationStopJson carRentalReservationStopJson, CarRentalReservationStopJson carRentalReservationStopJson2, String str, String str2, String str3, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = carRentalReservationApprovalJson.version;
        }
        if ((i2 & 2) != 0) {
            carRentalReservationSupplierJson = carRentalReservationApprovalJson.supplier;
        }
        if ((i2 & 4) != 0) {
            carRentalReservationVehicleJson = carRentalReservationApprovalJson.vehicle;
        }
        if ((i2 & 8) != 0) {
            carRentalReservationStopJson = carRentalReservationApprovalJson.pickup;
        }
        if ((i2 & 16) != 0) {
            carRentalReservationStopJson2 = carRentalReservationApprovalJson.dropoff;
        }
        if ((i2 & 32) != 0) {
            str = carRentalReservationApprovalJson.total_amount;
        }
        if ((i2 & 64) != 0) {
            str2 = carRentalReservationApprovalJson.total_currency;
        }
        if ((i2 & 128) != 0) {
            str3 = carRentalReservationApprovalJson.payment_type;
        }
        if ((i2 & 256) != 0) {
            str4 = carRentalReservationApprovalJson.driver_name;
        }
        if ((i2 & 512) != 0) {
            list = carRentalReservationApprovalJson.legal_links;
        }
        return carRentalReservationApprovalJson.copy(i, carRentalReservationSupplierJson, carRentalReservationVehicleJson, carRentalReservationStopJson, carRentalReservationStopJson2, str, str2, str3, str4, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CarRentalReservationApprovalJson carRentalReservationApprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || carRentalReservationApprovalJson.version != 0) {
            c9j5.AAK(c9iZ, 0, carRentalReservationApprovalJson.version);
        }
        if (zAfR || carRentalReservationApprovalJson.supplier != null) {
            c9j5.AAP(carRentalReservationApprovalJson.supplier, CarRentalReservationSupplierJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || carRentalReservationApprovalJson.vehicle != null) {
            c9j5.AAP(carRentalReservationApprovalJson.vehicle, CarRentalReservationVehicleJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || carRentalReservationApprovalJson.pickup != null) {
            c9j5.AAP(carRentalReservationApprovalJson.pickup, CarRentalReservationStopJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || carRentalReservationApprovalJson.dropoff != null) {
            c9j5.AAP(carRentalReservationApprovalJson.dropoff, CarRentalReservationStopJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || carRentalReservationApprovalJson.total_amount != null) {
            c9j5.AAP(carRentalReservationApprovalJson.total_amount, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || carRentalReservationApprovalJson.total_currency != null) {
            c9j5.AAP(carRentalReservationApprovalJson.total_currency, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || carRentalReservationApprovalJson.payment_type != null) {
            c9j5.AAP(carRentalReservationApprovalJson.payment_type, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || carRentalReservationApprovalJson.driver_name != null) {
            c9j5.AAP(carRentalReservationApprovalJson.driver_name, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || !C3cG.A1L(carRentalReservationApprovalJson.legal_links)) {
            c9j5.AAQ(carRentalReservationApprovalJson.legal_links, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final List<CarRentalReservationLegalLinkJson> component10() {
        return this.legal_links;
    }

    public final CarRentalReservationSupplierJson component2() {
        return this.supplier;
    }

    public final CarRentalReservationVehicleJson component3() {
        return this.vehicle;
    }

    public final CarRentalReservationStopJson component4() {
        return this.pickup;
    }

    public final CarRentalReservationStopJson component5() {
        return this.dropoff;
    }

    public final String component6() {
        return this.total_amount;
    }

    public final String component7() {
        return this.total_currency;
    }

    public final String component8() {
        return this.payment_type;
    }

    public final String component9() {
        return this.driver_name;
    }

    public final CarRentalReservationApprovalJson copy(int i, CarRentalReservationSupplierJson carRentalReservationSupplierJson, CarRentalReservationVehicleJson carRentalReservationVehicleJson, CarRentalReservationStopJson carRentalReservationStopJson, CarRentalReservationStopJson carRentalReservationStopJson2, String str, String str2, String str3, String str4, List<CarRentalReservationLegalLinkJson> list) {
        C7384Etj.A0Y(list, 9);
        return new CarRentalReservationApprovalJson(i, carRentalReservationSupplierJson, carRentalReservationVehicleJson, carRentalReservationStopJson, carRentalReservationStopJson2, str, str2, str3, str4, list);
    }

    public final String getDriver_name() {
        return this.driver_name;
    }

    public final CarRentalReservationStopJson getDropoff() {
        return this.dropoff;
    }

    public final List<CarRentalReservationLegalLinkJson> getLegal_links() {
        return this.legal_links;
    }

    public final String getPayment_type() {
        return this.payment_type;
    }

    public final CarRentalReservationStopJson getPickup() {
        return this.pickup;
    }

    public final CarRentalReservationSupplierJson getSupplier() {
        return this.supplier;
    }

    public final String getTotal_amount() {
        return this.total_amount;
    }

    public final String getTotal_currency() {
        return this.total_currency;
    }

    public final CarRentalReservationVehicleJson getVehicle() {
        return this.vehicle;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.legal_links, ((((((((((((((((this.version * 31) + AnonymousClass006.A0D(this.supplier)) * 31) + AnonymousClass006.A0D(this.vehicle)) * 31) + AnonymousClass006.A0D(this.pickup)) * 31) + AnonymousClass006.A0D(this.dropoff)) * 31) + AnonymousClass006.A0G(this.total_amount)) * 31) + AnonymousClass006.A0G(this.total_currency)) * 31) + AnonymousClass006.A0G(this.payment_type)) * 31) + AnonymousClass005.A0H(this.driver_name)) * 31);
    }

    public final HatchAgentPermissionsRepository.CarRentalReservationApproval toDomainOrNull() {
        HxE<BigDecimal, Currency> hxECheckoutMoneyOrNull;
        String str;
        String strTrimToNonEmpty;
        CarRentalReservationVehicleJson carRentalReservationVehicleJson;
        String str2;
        String strTrimToNonEmpty2;
        HatchAgentPermissionsRepository.CarRentalReservationStop domainOrNull;
        CarRentalReservationStopJson carRentalReservationStopJson;
        HatchAgentPermissionsRepository.CarRentalReservationStop domainOrNull2;
        String lowerCase;
        String strA0l;
        if (this.version != 1 || (hxECheckoutMoneyOrNull = CheckoutMoneyKt.checkoutMoneyOrNull(this.total_amount, this.total_currency)) == null) {
            return null;
        }
        BigDecimal bigDecimal = hxECheckoutMoneyOrNull.first;
        Currency currency = hxECheckoutMoneyOrNull.second;
        int i = this.version;
        CarRentalReservationSupplierJson carRentalReservationSupplierJson = this.supplier;
        if (carRentalReservationSupplierJson != null && (str = carRentalReservationSupplierJson.name) != null && (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) != null && (carRentalReservationVehicleJson = this.vehicle) != null && (str2 = carRentalReservationVehicleJson.name) != null && (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) != null) {
            String str3 = this.vehicle.category;
            String strTrimToNonEmpty3 = str3 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3) : null;
            String str4 = this.vehicle.transmission;
            String strTrimToNonEmpty4 = str4 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str4) : null;
            Integer num = this.vehicle.seats;
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            CarRentalReservationStopJson carRentalReservationStopJson2 = this.pickup;
            if (carRentalReservationStopJson2 != null && (domainOrNull = carRentalReservationStopJson2.toDomainOrNull()) != null && (carRentalReservationStopJson = this.dropoff) != null && (domainOrNull2 = carRentalReservationStopJson.toDomainOrNull()) != null) {
                String str5 = this.payment_type;
                if (str5 == null || (strA0l = AnonymousClass002.A0l(str5)) == null) {
                    lowerCase = null;
                } else {
                    Locale locale = Locale.ROOT;
                    C7384Etj.A0V(locale);
                    lowerCase = strA0l.toLowerCase(locale);
                }
                boolean zEquals = "postpaid".equals(lowerCase);
                String str6 = this.driver_name;
                String strTrimToNonEmpty5 = str6 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str6) : null;
                List<CarRentalReservationLegalLinkJson> list = this.legal_links;
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<CarRentalReservationLegalLinkJson> it = list.iterator();
                while (it.hasNext()) {
                    HatchAgentPermissionsRepository.CarRentalReservationLegalLink domainOrNull3 = it.next().toDomainOrNull();
                    if (domainOrNull3 != null) {
                        arrayListA0h.add(domainOrNull3);
                    }
                }
                return new HatchAgentPermissionsRepository.CarRentalReservationApproval(i, strTrimToNonEmpty, strTrimToNonEmpty2, strTrimToNonEmpty3, strTrimToNonEmpty4, num, domainOrNull, domainOrNull2, bigDecimal, currency, zEquals, strTrimToNonEmpty5, arrayListA0h);
            }
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CarRentalReservationApprovalJson(int i, CarRentalReservationSupplierJson carRentalReservationSupplierJson, CarRentalReservationVehicleJson carRentalReservationVehicleJson, CarRentalReservationStopJson carRentalReservationStopJson, CarRentalReservationStopJson carRentalReservationStopJson2, String str, String str2, String str3, String str4, List list, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? null : carRentalReservationSupplierJson, (i2 & 4) != 0 ? null : carRentalReservationVehicleJson, (i2 & 8) != 0 ? null : carRentalReservationStopJson, (i2 & 16) != 0 ? null : carRentalReservationStopJson2, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ CarRentalReservationApprovalJson(int i, int i2, CarRentalReservationSupplierJson carRentalReservationSupplierJson, CarRentalReservationVehicleJson carRentalReservationVehicleJson, CarRentalReservationStopJson carRentalReservationStopJson, CarRentalReservationStopJson carRentalReservationStopJson2, String str, String str2, String str3, String str4, List list, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.supplier = null;
        } else {
            this.supplier = carRentalReservationSupplierJson;
        }
        if ((i & 4) == 0) {
            this.vehicle = null;
        } else {
            this.vehicle = carRentalReservationVehicleJson;
        }
        if ((i & 8) == 0) {
            this.pickup = null;
        } else {
            this.pickup = carRentalReservationStopJson;
        }
        if ((i & 16) == 0) {
            this.dropoff = null;
        } else {
            this.dropoff = carRentalReservationStopJson2;
        }
        if ((i & 32) == 0) {
            this.total_amount = null;
        } else {
            this.total_amount = str;
        }
        if ((i & 64) == 0) {
            this.total_currency = null;
        } else {
            this.total_currency = str2;
        }
        if ((i & 128) == 0) {
            this.payment_type = null;
        } else {
            this.payment_type = str3;
        }
        if ((i & 256) == 0) {
            this.driver_name = null;
        } else {
            this.driver_name = str4;
        }
        if ((i & 512) == 0) {
            this.legal_links = C0881AGi.A00;
        } else {
            this.legal_links = list;
        }
    }

    public CarRentalReservationApprovalJson() {
        this(0, null, null, null, null, null, null, null, null, C0881AGi.A00);
    }
}
