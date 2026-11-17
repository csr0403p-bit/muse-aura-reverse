package com.facebook.aura.rentalcars;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarSupplierJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String logo_url;
    public final String name;

    public final class Companion {
        public final C9hr<RentalCarSupplierJson> serializer() {
            return RentalCarSupplierJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarSupplierJson rentalCarSupplierJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || rentalCarSupplierJson.name != null) {
            c9j5.AAP(rentalCarSupplierJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || rentalCarSupplierJson.logo_url != null) {
            c9j5.AAP(rentalCarSupplierJson.logo_url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarSupplierJson) {
                RentalCarSupplierJson rentalCarSupplierJson = (RentalCarSupplierJson) obj;
                if (!C7384Etj.areEqual(this.name, rentalCarSupplierJson.name) || !C7384Etj.areEqual(this.logo_url, rentalCarSupplierJson.logo_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarSupplierJson copy$default(RentalCarSupplierJson rentalCarSupplierJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarSupplierJson.name;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarSupplierJson.logo_url;
        }
        return new RentalCarSupplierJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.logo_url;
    }

    public final RentalCarSupplierJson copy(String str, String str2) {
        return new RentalCarSupplierJson(str, str2);
    }

    public final String getLogo_url() {
        return this.logo_url;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.logo_url);
    }

    public RentalCarSupplierJson(String str, String str2) {
        this.name = str;
        this.logo_url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarSupplierJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.logo_url = null;
        } else {
            this.logo_url = str2;
        }
    }

    public /* synthetic */ RentalCarSupplierJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public RentalCarSupplierJson() {
        this(null, null);
    }
}
