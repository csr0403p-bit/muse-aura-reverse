package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C10571Hud;
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingTripJson extends C06G {
    public static final int $stable = 8;
    public final String check_in;
    public final String check_out;
    public final List<CheckoutLodgingOccupancyJson> rooms;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, CheckoutLodgingTripJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CheckoutLodgingTripJson> serializer() {
            return CheckoutLodgingTripJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingTripJson) {
                CheckoutLodgingTripJson checkoutLodgingTripJson = (CheckoutLodgingTripJson) obj;
                if (!C7384Etj.areEqual(this.check_in, checkoutLodgingTripJson.check_in) || !C7384Etj.areEqual(this.check_out, checkoutLodgingTripJson.check_out) || !C7384Etj.areEqual(this.rooms, checkoutLodgingTripJson.rooms)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutLodgingTripJson copy$default(CheckoutLodgingTripJson checkoutLodgingTripJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingTripJson.check_in;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingTripJson.check_out;
        }
        if ((i & 4) != 0) {
            list = checkoutLodgingTripJson.rooms;
        }
        return checkoutLodgingTripJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingTripJson checkoutLodgingTripJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(checkoutLodgingTripJson.check_in)) {
            c9j5.AAV(checkoutLodgingTripJson.check_in, c9iZ, 0);
        }
        if (zAfR || !"".equals(checkoutLodgingTripJson.check_out)) {
            c9j5.AAV(checkoutLodgingTripJson.check_out, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(checkoutLodgingTripJson.rooms)) {
            c9j5.AAQ(checkoutLodgingTripJson.rooms, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.check_in;
    }

    public final String component2() {
        return this.check_out;
    }

    public final List<CheckoutLodgingOccupancyJson> component3() {
        return this.rooms;
    }

    public final String getCheck_in() {
        return this.check_in;
    }

    public final String getCheck_out() {
        return this.check_out;
    }

    public final List<CheckoutLodgingOccupancyJson> getRooms() {
        return this.rooms;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rooms, AnonymousClass005.A0I(this.check_out, AnonymousClass001.A0G(this.check_in)));
    }

    public final CheckoutLodgingTrip toDomain() {
        Object objA0s;
        Object objA0s2;
        try {
            objA0s = LocalDate.parse(this.check_in);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        LocalDate localDate = (LocalDate) objA0s;
        if (localDate == null) {
            return null;
        }
        try {
            objA0s2 = LocalDate.parse(this.check_out);
        } catch (Throwable th2) {
            objA0s2 = C3cG.A0s(th2);
        }
        if (objA0s2 instanceof C10571Hud) {
            objA0s2 = null;
        }
        LocalDate localDate2 = (LocalDate) objA0s2;
        if (localDate2 == null || !localDate2.isAfter(localDate) || this.rooms.isEmpty()) {
            return null;
        }
        List<CheckoutLodgingOccupancyJson> list = this.rooms;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (CheckoutLodgingOccupancyJson checkoutLodgingOccupancyJson : list) {
                int i = checkoutLodgingOccupancyJson.adults;
                if (1 > i || i >= 256) {
                    return null;
                }
                List<Integer> list2 = checkoutLodgingOccupancyJson.child_ages;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<Integer> it = list2.iterator();
                    while (it.hasNext()) {
                        int iA0F = AnonymousClass001.A0F(it.next());
                        if (iA0F < 0 || iA0F >= 18) {
                            return null;
                        }
                    }
                }
            }
        }
        List<CheckoutLodgingOccupancyJson> list3 = this.rooms;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list3);
        for (CheckoutLodgingOccupancyJson checkoutLodgingOccupancyJson2 : list3) {
            arrayListA0i.add(new CheckoutLodgingOccupancy(checkoutLodgingOccupancyJson2.adults, checkoutLodgingOccupancyJson2.child_ages));
        }
        return new CheckoutLodgingTrip(localDate, localDate2, arrayListA0i);
    }

    public CheckoutLodgingTripJson(String str, String str2, List<CheckoutLodgingOccupancyJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.check_in = str;
        this.check_out = str2;
        this.rooms = list;
    }

    public final CheckoutLodgingTripJson copy(String str, String str2, List<CheckoutLodgingOccupancyJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new CheckoutLodgingTripJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingTripJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.check_in = "";
        } else {
            this.check_in = str;
        }
        if ((i & 2) == 0) {
            this.check_out = "";
        } else {
            this.check_out = str2;
        }
        if ((i & 4) == 0) {
            this.rooms = C0881AGi.A00;
        } else {
            this.rooms = list;
        }
    }

    public /* synthetic */ CheckoutLodgingTripJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, C3cI.A12(list, i));
    }

    public CheckoutLodgingTripJson() {
        this("", "", C0881AGi.A00);
    }
}
