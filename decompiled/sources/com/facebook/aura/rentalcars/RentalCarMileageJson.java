package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import com.facebook.aura.rentalcars.RentalCarMileage;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarMileageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long limit;
    public final String type;
    public final String unit;

    public final class Companion {
        public final C9hr<RentalCarMileageJson> serializer() {
            return RentalCarMileageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public RentalCarMileageJson(String str, Long l, String str2) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.limit = l;
        this.unit = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarMileageJson rentalCarMileageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(rentalCarMileageJson.type)) {
            c9j5.AAV(rentalCarMileageJson.type, c9iZ, 0);
        }
        if (zAfR || rentalCarMileageJson.limit != null) {
            c9j5.AAP(rentalCarMileageJson.limit, C9j1.A00, c9iZ, 1);
        }
        if (zAfR || rentalCarMileageJson.unit != null) {
            c9j5.AAP(rentalCarMileageJson.unit, C07779iq.A01, c9iZ, 2);
        }
    }

    public final RentalCarMileageJson copy(String str, Long l, String str2) {
        C7384Etj.A0Y(str, 0);
        return new RentalCarMileageJson(str, l, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarMileageJson) {
                RentalCarMileageJson rentalCarMileageJson = (RentalCarMileageJson) obj;
                if (!C7384Etj.areEqual(this.type, rentalCarMileageJson.type) || !C7384Etj.areEqual(this.limit, rentalCarMileageJson.limit) || !C7384Etj.areEqual(this.unit, rentalCarMileageJson.unit)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarMileageJson copy$default(RentalCarMileageJson rentalCarMileageJson, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarMileageJson.type;
        }
        if ((i & 2) != 0) {
            l = rentalCarMileageJson.limit;
        }
        if ((i & 4) != 0) {
            str2 = rentalCarMileageJson.unit;
        }
        return rentalCarMileageJson.copy(str, l, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final Long component2() {
        return this.limit;
    }

    public final String component3() {
        return this.unit;
    }

    public final Long getLimit() {
        return this.limit;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0D(this.limit)) * 31) + AnonymousClass005.A0H(this.unit);
    }

    public final RentalCarMileage toDomain() {
        Long l;
        String strA0J = C3cJ.A0J(this.type);
        if (strA0J.equals("unlimited")) {
            return RentalCarMileage.Unlimited.INSTANCE;
        }
        if (!strA0J.equals("limited") || (l = this.limit) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        String str = this.unit;
        return new RentalCarMileage.Limited(jLongValue, str != null ? C60O.A0q(AnonymousClass002.A0l(str)) : null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarMileageJson(int i, String str, Long l, String str2, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.limit = null;
        } else {
            this.limit = l;
        }
        if ((i & 4) == 0) {
            this.unit = null;
        } else {
            this.unit = str2;
        }
    }

    public /* synthetic */ RentalCarMileageJson(String str, Long l, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2);
    }

    public RentalCarMileageJson() {
        this("", null, null);
    }
}
