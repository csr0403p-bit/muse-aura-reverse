package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HotelImage extends C06G {
    public static final int $stable = 0;
    public final String caption;
    public final String url;

    public HotelImage(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.caption = str2;
    }

    public final HotelImage copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HotelImage(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelImage) {
                HotelImage hotelImage = (HotelImage) obj;
                if (!C7384Etj.areEqual(this.url, hotelImage.url) || !C7384Etj.areEqual(this.caption, hotelImage.caption)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelImage copy$default(HotelImage hotelImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelImage.url;
        }
        if ((i & 2) != 0) {
            str2 = hotelImage.caption;
        }
        C7384Etj.A0Y(str, 0);
        return new HotelImage(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.caption;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.caption);
    }

    public String toString() {
        return super.toString();
    }
}
