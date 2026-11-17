package com.facebook.aura.rentalcars;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarVehicleJson extends C06G {
    public static final int $stable = 8;
    public final Boolean air_conditioning;
    public final RentalCarBaggageJson baggage;
    public final String category;
    public final String fuel;
    public final List<RentalCarImageJson> images;
    public final Integer max_passengers;
    public final String name;
    public final String transmission;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, RentalCarVehicleJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<RentalCarVehicleJson> serializer() {
            return RentalCarVehicleJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarVehicleJson) {
                RentalCarVehicleJson rentalCarVehicleJson = (RentalCarVehicleJson) obj;
                if (!C7384Etj.areEqual(this.name, rentalCarVehicleJson.name) || !C7384Etj.areEqual(this.category, rentalCarVehicleJson.category) || !C7384Etj.areEqual(this.type, rentalCarVehicleJson.type) || !C7384Etj.areEqual(this.transmission, rentalCarVehicleJson.transmission) || !C7384Etj.areEqual(this.max_passengers, rentalCarVehicleJson.max_passengers) || !C7384Etj.areEqual(this.baggage, rentalCarVehicleJson.baggage) || !C7384Etj.areEqual(this.air_conditioning, rentalCarVehicleJson.air_conditioning) || !C7384Etj.areEqual(this.fuel, rentalCarVehicleJson.fuel) || !C7384Etj.areEqual(this.images, rentalCarVehicleJson.images)) {
                }
            }
            return false;
        }
        return true;
    }

    public RentalCarVehicleJson(String str, String str2, String str3, String str4, Integer num, RentalCarBaggageJson rentalCarBaggageJson, Boolean bool, String str5, List<RentalCarImageJson> list) {
        C7384Etj.A0Y(list, 8);
        this.name = str;
        this.category = str2;
        this.type = str3;
        this.transmission = str4;
        this.max_passengers = num;
        this.baggage = rentalCarBaggageJson;
        this.air_conditioning = bool;
        this.fuel = str5;
        this.images = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RentalCarVehicleJson copy$default(RentalCarVehicleJson rentalCarVehicleJson, String str, String str2, String str3, String str4, Integer num, RentalCarBaggageJson rentalCarBaggageJson, Boolean bool, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarVehicleJson.name;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarVehicleJson.category;
        }
        if ((i & 4) != 0) {
            str3 = rentalCarVehicleJson.type;
        }
        if ((i & 8) != 0) {
            str4 = rentalCarVehicleJson.transmission;
        }
        if ((i & 16) != 0) {
            num = rentalCarVehicleJson.max_passengers;
        }
        if ((i & 32) != 0) {
            rentalCarBaggageJson = rentalCarVehicleJson.baggage;
        }
        if ((i & 64) != 0) {
            bool = rentalCarVehicleJson.air_conditioning;
        }
        if ((i & 128) != 0) {
            str5 = rentalCarVehicleJson.fuel;
        }
        if ((i & 256) != 0) {
            list = rentalCarVehicleJson.images;
        }
        return rentalCarVehicleJson.copy(str, str2, str3, str4, num, rentalCarBaggageJson, bool, str5, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarVehicleJson rentalCarVehicleJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || rentalCarVehicleJson.name != null) {
            c9j5.AAP(rentalCarVehicleJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || rentalCarVehicleJson.category != null) {
            c9j5.AAP(rentalCarVehicleJson.category, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || rentalCarVehicleJson.type != null) {
            c9j5.AAP(rentalCarVehicleJson.type, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || rentalCarVehicleJson.transmission != null) {
            c9j5.AAP(rentalCarVehicleJson.transmission, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || rentalCarVehicleJson.max_passengers != null) {
            c9j5.AAP(rentalCarVehicleJson.max_passengers, C07729ii.A00, c9iZ, 4);
        }
        if (zAfR || rentalCarVehicleJson.baggage != null) {
            c9j5.AAP(rentalCarVehicleJson.baggage, RentalCarBaggageJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || rentalCarVehicleJson.air_conditioning != null) {
            c9j5.AAP(rentalCarVehicleJson.air_conditioning, C07839ix.A00, c9iZ, 6);
        }
        if (zAfR || rentalCarVehicleJson.fuel != null) {
            c9j5.AAP(rentalCarVehicleJson.fuel, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(rentalCarVehicleJson.images)) {
            c9j5.AAQ(rentalCarVehicleJson.images, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.transmission;
    }

    public final Integer component5() {
        return this.max_passengers;
    }

    public final RentalCarBaggageJson component6() {
        return this.baggage;
    }

    public final Boolean component7() {
        return this.air_conditioning;
    }

    public final String component8() {
        return this.fuel;
    }

    public final List<RentalCarImageJson> component9() {
        return this.images;
    }

    public final RentalCarVehicleJson copy(String str, String str2, String str3, String str4, Integer num, RentalCarBaggageJson rentalCarBaggageJson, Boolean bool, String str5, List<RentalCarImageJson> list) {
        C7384Etj.A0Y(list, 8);
        return new RentalCarVehicleJson(str, str2, str3, str4, num, rentalCarBaggageJson, bool, str5, list);
    }

    public final Boolean getAir_conditioning() {
        return this.air_conditioning;
    }

    public final RentalCarBaggageJson getBaggage() {
        return this.baggage;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getFuel() {
        return this.fuel;
    }

    public final List<RentalCarImageJson> getImages() {
        return this.images;
    }

    public final Integer getMax_passengers() {
        return this.max_passengers;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTransmission() {
        return this.transmission;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.images, ((((((((((((((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.category)) * 31) + AnonymousClass006.A0G(this.type)) * 31) + AnonymousClass006.A0G(this.transmission)) * 31) + AnonymousClass006.A0D(this.max_passengers)) * 31) + AnonymousClass006.A0D(this.baggage)) * 31) + AnonymousClass006.A0D(this.air_conditioning)) * 31) + AnonymousClass005.A0H(this.fuel)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[PHI: r8
  0x004f: PHI (r8v3 java.lang.Integer) = (r8v0 java.lang.Integer), (r8v4 java.lang.Integer) binds: [B:27:0x004d, B:25:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[PHI: r8
  0x0059: PHI (r8v1 java.lang.Integer) = (r8v0 java.lang.Integer), (r8v3 java.lang.Integer), (r8v3 java.lang.Integer) binds: [B:27:0x004d, B:29:0x0051, B:31:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.rentalcars.RentalCarVehicle toDomain() {
        /*
            r12 = this;
            java.lang.String r0 = r12.name
            r2 = 0
            if (r0 == 0) goto L89
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            java.lang.String r3 = X.C60O.A0q(r0)
            if (r3 == 0) goto L89
            java.lang.String r0 = r12.category
            if (r0 == 0) goto L92
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            java.lang.String r4 = X.C60O.A0q(r0)
        L1b:
            java.lang.String r0 = r12.type
            if (r0 == 0) goto L90
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            java.lang.String r5 = X.C60O.A0q(r0)
        L27:
            java.lang.String r0 = r12.transmission
            if (r0 == 0) goto L8e
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            java.lang.String r6 = X.C60O.A0q(r0)
        L33:
            java.lang.Integer r7 = r12.max_passengers
            if (r7 == 0) goto L3d
            int r0 = r7.intValue()
            if (r0 > 0) goto L3e
        L3d:
            r7 = r2
        L3e:
            com.facebook.aura.rentalcars.RentalCarBaggageJson r1 = r12.baggage
            if (r1 == 0) goto L4c
            java.lang.Integer r8 = r1.large
            if (r8 == 0) goto L4c
            int r0 = r8.intValue()
            if (r0 >= 0) goto L4f
        L4c:
            r8 = r2
            if (r1 == 0) goto L59
        L4f:
            java.lang.Integer r9 = r1.small
            if (r9 == 0) goto L59
            int r0 = r9.intValue()
            if (r0 >= 0) goto L5a
        L59:
            r9 = r2
        L5a:
            java.lang.Boolean r10 = r12.air_conditioning
            java.lang.String r0 = r12.fuel
            if (r0 == 0) goto L8c
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            java.lang.String r11 = X.C60O.A0q(r0)
        L68:
            java.util.List<com.facebook.aura.rentalcars.RentalCarImageJson> r0 = r12.images
            java.util.Iterator r1 = r0.iterator()
        L6e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r1.next()
            com.facebook.aura.rentalcars.RentalCarImageJson r0 = (com.facebook.aura.rentalcars.RentalCarImageJson) r0
            java.lang.String r0 = r0.url
            if (r0 == 0) goto L6e
            java.lang.String r12 = com.facebook.aura.rentalcars.RentalCarRateJsonKt.httpsUrlOrNull(r0)
            if (r12 == 0) goto L6e
        L84:
            com.facebook.aura.rentalcars.RentalCarVehicle r2 = new com.facebook.aura.rentalcars.RentalCarVehicle
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L89:
            return r2
        L8a:
            r12 = r2
            goto L84
        L8c:
            r11 = r2
            goto L68
        L8e:
            r6 = r2
            goto L33
        L90:
            r5 = r2
            goto L27
        L92:
            r4 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.rentalcars.RentalCarVehicleJson.toDomain():com.facebook.aura.rentalcars.RentalCarVehicle");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarVehicleJson(String str, String str2, String str3, String str4, Integer num, RentalCarBaggageJson rentalCarBaggageJson, Boolean bool, String str5, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : rentalCarBaggageJson, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ RentalCarVehicleJson(int i, String str, String str2, String str3, String str4, Integer num, RentalCarBaggageJson rentalCarBaggageJson, Boolean bool, String str5, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.category = null;
        } else {
            this.category = str2;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.transmission = null;
        } else {
            this.transmission = str4;
        }
        if ((i & 16) == 0) {
            this.max_passengers = null;
        } else {
            this.max_passengers = num;
        }
        if ((i & 32) == 0) {
            this.baggage = null;
        } else {
            this.baggage = rentalCarBaggageJson;
        }
        if ((i & 64) == 0) {
            this.air_conditioning = null;
        } else {
            this.air_conditioning = bool;
        }
        if ((i & 128) == 0) {
            this.fuel = null;
        } else {
            this.fuel = str5;
        }
        if ((i & 256) == 0) {
            this.images = C0881AGi.A00;
        } else {
            this.images = list;
        }
    }

    public RentalCarVehicleJson() {
        this(null, null, null, null, null, null, null, null, C0881AGi.A00);
    }
}
