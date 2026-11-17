package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelBookingAction extends C06G {
    public static final int $stable = 0;
    public final String label;
    public final HotelBookingActionType type;
    public final String url;

    public HotelBookingAction(HotelBookingActionType hotelBookingActionType, String str, String str2) {
        C7384Etj.A0Y(hotelBookingActionType, 0);
        this.type = hotelBookingActionType;
        this.label = str;
        this.url = str2;
    }

    public final HotelBookingAction copy(HotelBookingActionType hotelBookingActionType, String str, String str2) {
        C7384Etj.A0Y(hotelBookingActionType, 0);
        return new HotelBookingAction(hotelBookingActionType, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelBookingAction) {
                HotelBookingAction hotelBookingAction = (HotelBookingAction) obj;
                if (this.type != hotelBookingAction.type || !C7384Etj.areEqual(this.label, hotelBookingAction.label) || !C7384Etj.areEqual(this.url, hotelBookingAction.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelBookingAction copy$default(HotelBookingAction hotelBookingAction, HotelBookingActionType hotelBookingActionType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelBookingActionType = hotelBookingAction.type;
        }
        if ((i & 2) != 0) {
            str = hotelBookingAction.label;
        }
        if ((i & 4) != 0) {
            str2 = hotelBookingAction.url;
        }
        return hotelBookingAction.copy(hotelBookingActionType, str, str2);
    }

    public final HotelBookingActionType component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.url;
    }

    public final String getLabel() {
        return this.label;
    }

    public final HotelBookingActionType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.type) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelBookingAction(HotelBookingActionType hotelBookingActionType, String str, String str2, int i, C06H c06h) {
        this(hotelBookingActionType, str, AnonymousClass006.A0t(i, str2));
    }
}
