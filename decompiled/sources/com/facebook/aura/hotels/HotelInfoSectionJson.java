package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HotelInfoSectionJson extends C06G {
    public static final int $stable = 8;
    public final List<String> items;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, HotelInfoSectionJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HotelInfoSectionJson> serializer() {
            return HotelInfoSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelInfoSectionJson) {
                HotelInfoSectionJson hotelInfoSectionJson = (HotelInfoSectionJson) obj;
                if (!C7384Etj.areEqual(this.title, hotelInfoSectionJson.title) || !C7384Etj.areEqual(this.items, hotelInfoSectionJson.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelInfoSectionJson copy$default(HotelInfoSectionJson hotelInfoSectionJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelInfoSectionJson.title;
        }
        if ((i & 2) != 0) {
            list = hotelInfoSectionJson.items;
        }
        AnonymousClass003.A0u(str, list);
        return new HotelInfoSectionJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelInfoSectionJson hotelInfoSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(hotelInfoSectionJson.title)) {
            c9j5.AAV(hotelInfoSectionJson.title, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(hotelInfoSectionJson.items)) {
            c9j5.AAQ(hotelInfoSectionJson.items, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final List<String> component2() {
        return this.items;
    }

    public final List<String> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, AnonymousClass001.A0G(this.title));
    }

    public HotelInfoSectionJson(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        this.title = str;
        this.items = list;
    }

    public final HotelInfoSectionJson copy(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        return new HotelInfoSectionJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelInfoSectionJson(int i, String str, List list, C2hx c2hx) {
        this.title = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
    }

    public /* synthetic */ HotelInfoSectionJson(String str, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i));
    }

    public HotelInfoSectionJson() {
        this("", C0881AGi.A00);
    }
}
