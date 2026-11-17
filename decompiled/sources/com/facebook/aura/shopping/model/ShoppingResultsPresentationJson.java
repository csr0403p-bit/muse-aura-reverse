package com.facebook.aura.shopping.model;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.HxE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingResultsPresentationJson extends C06G {
    public static final int $stable = 0;
    public final ShoppingResultsAttributionJson attribution;
    public final ShoppingCollectionJson collection;
    public final String label;
    public final List<ShoppingResultProductJson> products;
    public final String subtitle;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ShoppingResultsPresentationJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<ShoppingResultsPresentationJson> serializer() {
            return ShoppingResultsPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShoppingResultsPresentationJson(List<ShoppingResultProductJson> list, ShoppingResultsAttributionJson shoppingResultsAttributionJson, String str, String str2, ShoppingCollectionJson shoppingCollectionJson) {
        AnonymousClass005.A11(list, str, str2, 0);
        this.products = list;
        this.attribution = shoppingResultsAttributionJson;
        this.label = str;
        this.subtitle = str2;
        this.collection = shoppingCollectionJson;
    }

    public final ShoppingResultsPresentationJson copy(List<ShoppingResultProductJson> list, ShoppingResultsAttributionJson shoppingResultsAttributionJson, String str, String str2, ShoppingCollectionJson shoppingCollectionJson) {
        AnonymousClass005.A11(list, str, str2, 0);
        return new ShoppingResultsPresentationJson(list, shoppingResultsAttributionJson, str, str2, shoppingCollectionJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultsPresentationJson) {
                ShoppingResultsPresentationJson shoppingResultsPresentationJson = (ShoppingResultsPresentationJson) obj;
                if (!C7384Etj.areEqual(this.products, shoppingResultsPresentationJson.products) || !C7384Etj.areEqual(this.attribution, shoppingResultsPresentationJson.attribution) || !C7384Etj.areEqual(this.label, shoppingResultsPresentationJson.label) || !C7384Etj.areEqual(this.subtitle, shoppingResultsPresentationJson.subtitle) || !C7384Etj.areEqual(this.collection, shoppingResultsPresentationJson.collection)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingResultsPresentationJson copy$default(ShoppingResultsPresentationJson shoppingResultsPresentationJson, List list, ShoppingResultsAttributionJson shoppingResultsAttributionJson, String str, String str2, ShoppingCollectionJson shoppingCollectionJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shoppingResultsPresentationJson.products;
        }
        if ((i & 2) != 0) {
            shoppingResultsAttributionJson = shoppingResultsPresentationJson.attribution;
        }
        if ((i & 4) != 0) {
            str = shoppingResultsPresentationJson.label;
        }
        if ((i & 8) != 0) {
            str2 = shoppingResultsPresentationJson.subtitle;
        }
        if ((i & 16) != 0) {
            shoppingCollectionJson = shoppingResultsPresentationJson.collection;
        }
        return shoppingResultsPresentationJson.copy(list, shoppingResultsAttributionJson, str, str2, shoppingCollectionJson);
    }

    @Serializable(with = LenientShoppingResultsAttributionSerializer.class)
    public static /* synthetic */ void getAttribution$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingResultsPresentationJson shoppingResultsPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(shoppingResultsPresentationJson.products)) {
            c9j5.AAQ(shoppingResultsPresentationJson.products, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || shoppingResultsPresentationJson.attribution != null) {
            c9j5.AAP(shoppingResultsPresentationJson.attribution, LenientShoppingResultsAttributionSerializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingResultsPresentationJson.label)) {
            c9j5.AAV(shoppingResultsPresentationJson.label, c9iZ, 2);
        }
        if (zAfR || !"".equals(shoppingResultsPresentationJson.subtitle)) {
            c9j5.AAV(shoppingResultsPresentationJson.subtitle, c9iZ, 3);
        }
        if (zAfR || shoppingResultsPresentationJson.collection != null) {
            c9j5.AAP(shoppingResultsPresentationJson.collection, ShoppingCollectionJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public final List<ShoppingResultProductJson> component1() {
        return this.products;
    }

    public final ShoppingResultsAttributionJson component2() {
        return this.attribution;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final ShoppingCollectionJson component5() {
        return this.collection;
    }

    public final ShoppingResultsAttributionJson getAttribution() {
        return this.attribution;
    }

    public final ShoppingCollectionJson getCollection() {
        return this.collection;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<ShoppingResultProductJson> getProducts() {
        return this.products;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.subtitle, AnonymousClass005.A0I(this.label, (AnonymousClass005.A0E(this.products) + AnonymousClass006.A0D(this.attribution)) * 31)) + C3cH.A02(this.collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.facebook.aura.shopping.model.ShoppingResultsPresentationJson] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.shopping.model.ShoppingResultsPresentation toDomain(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.model.ShoppingResultsPresentationJson.toDomain(java.lang.String):com.facebook.aura.shopping.model.ShoppingResultsPresentation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<ShoppingCouponPriceKey, PdpCouponPrice> couponPrices(List<HxE<ShoppingResultProductJson, ShoppingResultProduct>> list) {
        String str;
        PdpCouponPrice pdpCouponPrice;
        double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HxE<ShoppingResultProductJson, ShoppingResultProduct>> it = list.iterator();
        while (it.hasNext()) {
            HxE hxEA10 = C60Q.A10(it);
            ShoppingResultProductJson shoppingResultProductJson = (ShoppingResultProductJson) hxEA10.first;
            ShoppingCouponPriceKey shoppingCouponPriceKeyCatalogCouponPriceKey = ShoppingProductDisplayKt.catalogCouponPriceKey((ShoppingResultProduct) hxEA10.second);
            if (shoppingCouponPriceKeyCatalogCouponPriceKey != null && (str = shoppingCouponPriceKeyCatalogCouponPriceKey.priceCurrency) != null && (pdpCouponPrice = PdpCouponJsonKt.toPdpCouponPrice(shoppingResultProductJson.pdp_coupon, shoppingCouponPriceKeyCatalogCouponPriceKey.productId, str, dCurrentTimeMillis)) != null) {
                AnonymousClass002.A1J(shoppingCouponPriceKeyCatalogCouponPriceKey, pdpCouponPrice, arrayListA0h);
            }
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            HxE hxEA102 = C60Q.A10(it2);
            ((List) C60R.A0Z(hxEA102.first, linkedHashMapA0j)).add(hxEA102.second);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            Object objA0K = AbstractC0878AGe.A0K(AbstractC0878AGe.A0T((Iterable) entryA0l.getValue()));
            if (objA0K != null) {
                AnonymousClass002.A1J(key, objA0K, arrayListA0h2);
            }
        }
        return AGH.A06(arrayListA0h2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingResultsPresentationJson(List list, ShoppingResultsAttributionJson shoppingResultsAttributionJson, String str, String str2, ShoppingCollectionJson shoppingCollectionJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : shoppingResultsAttributionJson, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : shoppingCollectionJson);
    }

    public /* synthetic */ ShoppingResultsPresentationJson(int i, List list, ShoppingResultsAttributionJson shoppingResultsAttributionJson, String str, String str2, ShoppingCollectionJson shoppingCollectionJson, C2hx c2hx) {
        this.products = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.attribution = null;
        } else {
            this.attribution = shoppingResultsAttributionJson;
        }
        if ((i & 4) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 8) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 16) == 0) {
            this.collection = null;
        } else {
            this.collection = shoppingCollectionJson;
        }
    }

    public ShoppingResultsPresentationJson() {
        this(C0881AGi.A00, null, "", "", null);
    }
}
