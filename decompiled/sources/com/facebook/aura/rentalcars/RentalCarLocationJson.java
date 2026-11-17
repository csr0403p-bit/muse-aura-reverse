package com.facebook.aura.rentalcars;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarLocationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String access;
    public final RentalCarAddressJson address;
    public final String name;

    public final class Companion {
        public final C9hr<RentalCarLocationJson> serializer() {
            return RentalCarLocationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarLocationJson rentalCarLocationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || rentalCarLocationJson.name != null) {
            c9j5.AAP(rentalCarLocationJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || rentalCarLocationJson.access != null) {
            c9j5.AAP(rentalCarLocationJson.access, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || rentalCarLocationJson.address != null) {
            c9j5.AAP(rentalCarLocationJson.address, RentalCarAddressJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarLocationJson) {
                RentalCarLocationJson rentalCarLocationJson = (RentalCarLocationJson) obj;
                if (!C7384Etj.areEqual(this.name, rentalCarLocationJson.name) || !C7384Etj.areEqual(this.access, rentalCarLocationJson.access) || !C7384Etj.areEqual(this.address, rentalCarLocationJson.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarLocationJson copy$default(RentalCarLocationJson rentalCarLocationJson, String str, String str2, RentalCarAddressJson rentalCarAddressJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarLocationJson.name;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarLocationJson.access;
        }
        if ((i & 4) != 0) {
            rentalCarAddressJson = rentalCarLocationJson.address;
        }
        return new RentalCarLocationJson(str, str2, rentalCarAddressJson);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.access;
    }

    public final RentalCarAddressJson component3() {
        return this.address;
    }

    public final RentalCarLocationJson copy(String str, String str2, RentalCarAddressJson rentalCarAddressJson) {
        return new RentalCarLocationJson(str, str2, rentalCarAddressJson);
    }

    public final String getAccess() {
        return this.access;
    }

    public final RentalCarAddressJson getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.access)) * 31) + C3cH.A02(this.address);
    }

    public final RentalCarLocation toDomain() {
        String str = this.name;
        String strA0q = str != null ? C60O.A0q(AnonymousClass002.A0l(str)) : null;
        RentalCarAccess rentalCarAccessAccessFromWire = RentalCarRateJsonKt.accessFromWire(this.access);
        RentalCarAddressJson rentalCarAddressJson = this.address;
        return new RentalCarLocation(strA0q, rentalCarAccessAccessFromWire, rentalCarAddressJson != null ? rentalCarAddressJson.formatted() : null);
    }

    public RentalCarLocationJson(String str, String str2, RentalCarAddressJson rentalCarAddressJson) {
        this.name = str;
        this.access = str2;
        this.address = rentalCarAddressJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarLocationJson(int i, String str, String str2, RentalCarAddressJson rentalCarAddressJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.access = null;
        } else {
            this.access = str2;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = rentalCarAddressJson;
        }
    }

    public /* synthetic */ RentalCarLocationJson(String str, String str2, RentalCarAddressJson rentalCarAddressJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : rentalCarAddressJson);
    }

    public RentalCarLocationJson() {
        this(null, null, null);
    }
}
