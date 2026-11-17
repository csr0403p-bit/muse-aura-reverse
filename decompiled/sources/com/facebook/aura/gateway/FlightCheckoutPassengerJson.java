package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
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
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutPassengerJson extends C06G {
    public static final int $stable = 8;
    public final String born_on_display;
    public final String display_name;
    public final String email;
    public final String gender_display;
    public final String known_traveler_number_display;
    public final List<FlightCheckoutLoyaltyAccountJson> loyalty_accounts;
    public final String phone_number;
    public final String redress_number_display;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, FlightCheckoutPassengerJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<FlightCheckoutPassengerJson> serializer() {
            return FlightCheckoutPassengerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutPassengerJson) {
                FlightCheckoutPassengerJson flightCheckoutPassengerJson = (FlightCheckoutPassengerJson) obj;
                if (!C7384Etj.areEqual(this.display_name, flightCheckoutPassengerJson.display_name) || !C7384Etj.areEqual(this.type, flightCheckoutPassengerJson.type) || !C7384Etj.areEqual(this.email, flightCheckoutPassengerJson.email) || !C7384Etj.areEqual(this.phone_number, flightCheckoutPassengerJson.phone_number) || !C7384Etj.areEqual(this.born_on_display, flightCheckoutPassengerJson.born_on_display) || !C7384Etj.areEqual(this.gender_display, flightCheckoutPassengerJson.gender_display) || !C7384Etj.areEqual(this.known_traveler_number_display, flightCheckoutPassengerJson.known_traveler_number_display) || !C7384Etj.areEqual(this.redress_number_display, flightCheckoutPassengerJson.redress_number_display) || !C7384Etj.areEqual(this.loyalty_accounts, flightCheckoutPassengerJson.loyalty_accounts)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ FlightCheckoutPassengerJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? C0881AGi.A00 : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightCheckoutPassengerJson copy$default(FlightCheckoutPassengerJson flightCheckoutPassengerJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutPassengerJson.display_name;
        }
        if ((i & 2) != 0) {
            str2 = flightCheckoutPassengerJson.type;
        }
        if ((i & 4) != 0) {
            str3 = flightCheckoutPassengerJson.email;
        }
        if ((i & 8) != 0) {
            str4 = flightCheckoutPassengerJson.phone_number;
        }
        if ((i & 16) != 0) {
            str5 = flightCheckoutPassengerJson.born_on_display;
        }
        if ((i & 32) != 0) {
            str6 = flightCheckoutPassengerJson.gender_display;
        }
        if ((i & 64) != 0) {
            str7 = flightCheckoutPassengerJson.known_traveler_number_display;
        }
        if ((i & 128) != 0) {
            str8 = flightCheckoutPassengerJson.redress_number_display;
        }
        if ((i & 256) != 0) {
            list = flightCheckoutPassengerJson.loyalty_accounts;
        }
        return flightCheckoutPassengerJson.copy(str, str2, str3, str4, str5, str6, str7, str8, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutPassengerJson flightCheckoutPassengerJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutPassengerJson.display_name != null) {
            c9j5.AAP(flightCheckoutPassengerJson.display_name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightCheckoutPassengerJson.type != null) {
            c9j5.AAP(flightCheckoutPassengerJson.type, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || flightCheckoutPassengerJson.email != null) {
            c9j5.AAP(flightCheckoutPassengerJson.email, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || flightCheckoutPassengerJson.phone_number != null) {
            c9j5.AAP(flightCheckoutPassengerJson.phone_number, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || flightCheckoutPassengerJson.born_on_display != null) {
            c9j5.AAP(flightCheckoutPassengerJson.born_on_display, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || flightCheckoutPassengerJson.gender_display != null) {
            c9j5.AAP(flightCheckoutPassengerJson.gender_display, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || flightCheckoutPassengerJson.known_traveler_number_display != null) {
            c9j5.AAP(flightCheckoutPassengerJson.known_traveler_number_display, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || flightCheckoutPassengerJson.redress_number_display != null) {
            c9j5.AAP(flightCheckoutPassengerJson.redress_number_display, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(flightCheckoutPassengerJson.loyalty_accounts)) {
            c9j5.AAQ(flightCheckoutPassengerJson.loyalty_accounts, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
    }

    public final String component1() {
        return this.display_name;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.phone_number;
    }

    public final String component5() {
        return this.born_on_display;
    }

    public final String component6() {
        return this.gender_display;
    }

    public final String component7() {
        return this.known_traveler_number_display;
    }

    public final String component8() {
        return this.redress_number_display;
    }

    public final List<FlightCheckoutLoyaltyAccountJson> component9() {
        return this.loyalty_accounts;
    }

    public final FlightCheckoutPassengerJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<FlightCheckoutLoyaltyAccountJson> list) {
        C7384Etj.A0Y(list, 8);
        return new FlightCheckoutPassengerJson(str, str2, str3, str4, str5, str6, str7, str8, list);
    }

    public final String getBorn_on_display() {
        return this.born_on_display;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getGender_display() {
        return this.gender_display;
    }

    public final String getKnown_traveler_number_display() {
        return this.known_traveler_number_display;
    }

    public final List<FlightCheckoutLoyaltyAccountJson> getLoyalty_accounts() {
        return this.loyalty_accounts;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public final String getRedress_number_display() {
        return this.redress_number_display;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.loyalty_accounts, ((((((((((((((AnonymousClass006.A0G(this.display_name) * 31) + AnonymousClass006.A0G(this.type)) * 31) + AnonymousClass006.A0G(this.email)) * 31) + AnonymousClass006.A0G(this.phone_number)) * 31) + AnonymousClass006.A0G(this.born_on_display)) * 31) + AnonymousClass006.A0G(this.gender_display)) * 31) + AnonymousClass006.A0G(this.known_traveler_number_display)) * 31) + AnonymousClass005.A0H(this.redress_number_display)) * 31);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutPassenger toDomain() {
        String strTrimToNonEmpty;
        String str = this.display_name;
        String strA0Z = C3cI.A0Z(this.type);
        String strA0Z2 = C3cI.A0Z(this.email);
        String strA0Z3 = C3cI.A0Z(this.phone_number);
        String strA0Z4 = C3cI.A0Z(this.born_on_display);
        String strA0Z5 = C3cI.A0Z(this.gender_display);
        String strA0Z6 = C3cI.A0Z(this.known_traveler_number_display);
        String strA0Z7 = C3cI.A0Z(this.redress_number_display);
        List<FlightCheckoutLoyaltyAccountJson> list = this.loyalty_accounts;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<FlightCheckoutLoyaltyAccountJson> it = list.iterator();
        while (it.hasNext()) {
            String str2 = it.next().display_text;
            if (str2 != null && (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) != null) {
                arrayListA0h.add(strTrimToNonEmpty);
            }
        }
        return new HatchAgentPermissionsRepository.FlightCheckoutPassenger(str, strA0Z, strA0Z2, strA0Z3, strA0Z4, strA0Z5, strA0Z6, strA0Z7, arrayListA0h);
    }

    public String toString() {
        return super.toString();
    }

    public FlightCheckoutPassengerJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<FlightCheckoutLoyaltyAccountJson> list) {
        C7384Etj.A0Y(list, 8);
        this.display_name = str;
        this.type = str2;
        this.email = str3;
        this.phone_number = str4;
        this.born_on_display = str5;
        this.gender_display = str6;
        this.known_traveler_number_display = str7;
        this.redress_number_display = str8;
        this.loyalty_accounts = list;
    }

    public /* synthetic */ FlightCheckoutPassengerJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.email = null;
        } else {
            this.email = str3;
        }
        if ((i & 8) == 0) {
            this.phone_number = null;
        } else {
            this.phone_number = str4;
        }
        if ((i & 16) == 0) {
            this.born_on_display = null;
        } else {
            this.born_on_display = str5;
        }
        if ((i & 32) == 0) {
            this.gender_display = null;
        } else {
            this.gender_display = str6;
        }
        if ((i & 64) == 0) {
            this.known_traveler_number_display = null;
        } else {
            this.known_traveler_number_display = str7;
        }
        if ((i & 128) == 0) {
            this.redress_number_display = null;
        } else {
            this.redress_number_display = str8;
        }
        if ((i & 256) == 0) {
            this.loyalty_accounts = C0881AGi.A00;
        } else {
            this.loyalty_accounts = list;
        }
    }

    public FlightCheckoutPassengerJson() {
        this(null, null, null, null, null, null, null, null, C0881AGi.A00);
    }
}
