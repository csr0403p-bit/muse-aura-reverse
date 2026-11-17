package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutLodgingRoom extends C06G {
    public static final int $stable = 8;
    public final List<String> bedOptions;
    public final Long maxGuests;
    public final String name;

    public CheckoutLodgingRoom(String str, List<String> list, Long l) {
        C7384Etj.A0Y(list, 1);
        this.name = str;
        this.bedOptions = list;
        this.maxGuests = l;
    }

    public final CheckoutLodgingRoom copy(String str, List<String> list, Long l) {
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingRoom(str, list, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingRoom) {
                CheckoutLodgingRoom checkoutLodgingRoom = (CheckoutLodgingRoom) obj;
                if (!C7384Etj.areEqual(this.name, checkoutLodgingRoom.name) || !C7384Etj.areEqual(this.bedOptions, checkoutLodgingRoom.bedOptions) || !C7384Etj.areEqual(this.maxGuests, checkoutLodgingRoom.maxGuests)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutLodgingRoom copy$default(CheckoutLodgingRoom checkoutLodgingRoom, String str, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingRoom.name;
        }
        if ((i & 2) != 0) {
            list = checkoutLodgingRoom.bedOptions;
        }
        if ((i & 4) != 0) {
            l = checkoutLodgingRoom.maxGuests;
        }
        return checkoutLodgingRoom.copy(str, list, l);
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.bedOptions;
    }

    public final Long component3() {
        return this.maxGuests;
    }

    public final List<String> getBedOptions() {
        return this.bedOptions;
    }

    public final Long getMaxGuests() {
        return this.maxGuests;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.bedOptions, AnonymousClass006.A0G(this.name) * 31) + C3cH.A02(this.maxGuests);
    }

    public String toString() {
        return super.toString();
    }
}
