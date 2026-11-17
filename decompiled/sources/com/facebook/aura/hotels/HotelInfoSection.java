package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelInfoSection extends C06G {
    public static final int $stable = 0;
    public final AHD<String> items;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelInfoSection) {
                HotelInfoSection hotelInfoSection = (HotelInfoSection) obj;
                if (!C7384Etj.areEqual(this.title, hotelInfoSection.title) || !C7384Etj.areEqual(this.items, hotelInfoSection.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelInfoSection copy$default(HotelInfoSection hotelInfoSection, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelInfoSection.title;
        }
        if ((i & 2) != 0) {
            ahd = hotelInfoSection.items;
        }
        AnonymousClass003.A0u(str, ahd);
        return new HotelInfoSection(str, ahd);
    }

    public final String component1() {
        return this.title;
    }

    public final AHD<String> component2() {
        return this.items;
    }

    public final AHD<String> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, AnonymousClass001.A0G(this.title));
    }

    public HotelInfoSection(String str, AHD<String> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.title = str;
        this.items = ahd;
    }

    public final HotelInfoSection copy(String str, AHD<String> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new HotelInfoSection(str, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
