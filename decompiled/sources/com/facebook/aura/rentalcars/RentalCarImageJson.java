package com.facebook.aura.rentalcars;

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
public final class RentalCarImageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String url;

    public final class Companion {
        public final C9hr<RentalCarImageJson> serializer() {
            return RentalCarImageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(RentalCarImageJson rentalCarImageJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || rentalCarImageJson.url != null) {
            c9j5.AAP(rentalCarImageJson.url, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RentalCarImageJson) && C7384Etj.areEqual(this.url, ((RentalCarImageJson) obj).url));
    }

    public static /* synthetic */ RentalCarImageJson copy$default(RentalCarImageJson rentalCarImageJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarImageJson.url;
        }
        return new RentalCarImageJson(str);
    }

    public final String component1() {
        return this.url;
    }

    public final RentalCarImageJson copy(String str) {
        return new RentalCarImageJson(str);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.url);
    }

    public /* synthetic */ RentalCarImageJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public RentalCarImageJson(String str) {
        this.url = str;
    }

    public /* synthetic */ RentalCarImageJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public RentalCarImageJson() {
        this(null);
    }
}
