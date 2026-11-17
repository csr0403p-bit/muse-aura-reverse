package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpProductInfo extends C06G {
    public static final int $stable = 8;
    public final PdpPrice currentPrice;
    public final String description;
    public final List<PdpImage> images;
    public final String name;
    public final PdpPrice originalPrice;
    public final Integer pricePercentOff;
    public final String stockStatus;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, PdpProductInfo$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<PdpProductInfo> serializer() {
            return PdpProductInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PdpProductInfo(String str, String str2, String str3, String str4, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, List<PdpImage> list) {
        C60O.A1M(str, 0, list);
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.stockStatus = str4;
        this.currentPrice = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.pricePercentOff = num;
        this.images = list;
    }

    public final PdpProductInfo copy(String str, String str2, String str3, String str4, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, List<PdpImage> list) {
        C60O.A1M(str, 0, list);
        return new PdpProductInfo(str, str2, str3, str4, pdpPrice, pdpPrice2, num, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpProductInfo) {
                PdpProductInfo pdpProductInfo = (PdpProductInfo) obj;
                if (!C7384Etj.areEqual(this.name, pdpProductInfo.name) || !C7384Etj.areEqual(this.description, pdpProductInfo.description) || !C7384Etj.areEqual(this.url, pdpProductInfo.url) || !C7384Etj.areEqual(this.stockStatus, pdpProductInfo.stockStatus) || !C7384Etj.areEqual(this.currentPrice, pdpProductInfo.currentPrice) || !C7384Etj.areEqual(this.originalPrice, pdpProductInfo.originalPrice) || !C7384Etj.areEqual(this.pricePercentOff, pdpProductInfo.pricePercentOff) || !C7384Etj.areEqual(this.images, pdpProductInfo.images)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdpProductInfo copy$default(PdpProductInfo pdpProductInfo, String str, String str2, String str3, String str4, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpProductInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = pdpProductInfo.description;
        }
        if ((i & 4) != 0) {
            str3 = pdpProductInfo.url;
        }
        if ((i & 8) != 0) {
            str4 = pdpProductInfo.stockStatus;
        }
        if ((i & 16) != 0) {
            pdpPrice = pdpProductInfo.currentPrice;
        }
        if ((i & 32) != 0) {
            pdpPrice2 = pdpProductInfo.originalPrice;
        }
        if ((i & 64) != 0) {
            num = pdpProductInfo.pricePercentOff;
        }
        if ((i & 128) != 0) {
            list = pdpProductInfo.images;
        }
        return pdpProductInfo.copy(str, str2, str3, str4, pdpPrice, pdpPrice2, num, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpProductInfo pdpProductInfo, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(pdpProductInfo.name, c9iZ, 0);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(pdpProductInfo.description, c07779iq, c9iZ, 1);
        c9j5.AAP(pdpProductInfo.url, c07779iq, c9iZ, 2);
        c9j5.AAP(pdpProductInfo.stockStatus, c07779iq, c9iZ, 3);
        PdpPrice$$serializer pdpPrice$$serializer = PdpPrice$$serializer.INSTANCE;
        c9j5.AAP(pdpProductInfo.currentPrice, pdpPrice$$serializer, c9iZ, 4);
        c9j5.AAP(pdpProductInfo.originalPrice, pdpPrice$$serializer, c9iZ, 5);
        c9j5.AAP(pdpProductInfo.pricePercentOff, C07729ii.A00, c9iZ, 6);
        c9j5.AAQ(pdpProductInfo.images, C3cH.A15(f0cArr, 7), c9iZ, 7);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.stockStatus;
    }

    public final PdpPrice component5() {
        return this.currentPrice;
    }

    public final PdpPrice component6() {
        return this.originalPrice;
    }

    public final Integer component7() {
        return this.pricePercentOff;
    }

    public final List<PdpImage> component8() {
        return this.images;
    }

    public final PdpPrice getCurrentPrice() {
        return this.currentPrice;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<PdpImage> getImages() {
        return this.images;
    }

    public final String getName() {
        return this.name;
    }

    public final PdpPrice getOriginalPrice() {
        return this.originalPrice;
    }

    public final Integer getPricePercentOff() {
        return this.pricePercentOff;
    }

    public final String getStockStatus() {
        return this.stockStatus;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.images, (((((((((((AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.stockStatus)) * 31) + AnonymousClass006.A0D(this.currentPrice)) * 31) + AnonymousClass006.A0D(this.originalPrice)) * 31) + C3cH.A02(this.pricePercentOff)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpProductInfo(int i, String str, String str2, String str3, String str4, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, List list, C2hx c2hx) {
        if (255 != (i & 255)) {
            C9iI.A00(PdpProductInfo$$serializer.descriptor, i, 255);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.stockStatus = str4;
        this.currentPrice = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.pricePercentOff = num;
        this.images = list;
    }
}
