package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingResultsPresentation extends C06G {
    public static final int $stable = 0;
    public final ShoppingResultsAttribution attribution;
    public final Map<ShoppingCouponPriceKey, PdpCouponPrice> couponPrices;
    public final String kind;
    public final String label;
    public final List<ShoppingResultProduct> products;
    public final Map<Integer, ShoppingResultProduct> productsByWireIndex;
    public final ShoppingCollection shoppingCollection;
    public final List<ShoppingResultProduct> shoppingCollectionPhotos;
    public final String subtitle;
    public final String widgetId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ShoppingResultsPresentation$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null};

    public final class Companion {
        public final C9hr<ShoppingResultsPresentation> serializer() {
            return ShoppingResultsPresentation$$serializer.INSTANCE;
        }

        public final ShoppingResultsPresentation fromJson(JsonElement jsonElement, String str) {
            return ShoppingResultsPresentationJsonKt.parseShoppingResultsPresentation(jsonElement, str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r1 = X.AbstractC0878AGe.A0G(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r1 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShoppingResultsPresentation(java.util.List<com.facebook.aura.shopping.model.ShoppingResultProduct> r7, com.facebook.aura.shopping.model.ShoppingResultsAttribution r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.facebook.aura.shopping.model.ShoppingCollection r13, java.util.Map<com.facebook.aura.shopping.model.ShoppingCouponPriceKey, com.facebook.aura.shopping.model.PdpCouponPrice> r14) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            r2 = 3
            X.C60O.A1M(r10, r2, r14)
            r6.<init>()
            r6.products = r7
            r6.attribution = r8
            r6.widgetId = r9
            r6.kind = r10
            r6.label = r11
            r6.subtitle = r12
            r6.shoppingCollection = r13
            r6.couponPrices = r14
            int r0 = X.AnonymousClass005.A0C(r7)
            java.util.LinkedHashMap r4 = X.C60O.A15(r0)
            java.util.Iterator r3 = r7.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.facebook.aura.shopping.model.ShoppingResultProduct r0 = (com.facebook.aura.shopping.model.ShoppingResultProduct) r0
            java.lang.Integer r0 = r0.wireIndex
            r4.put(r0, r1)
            goto L27
        L3a:
            r6.productsByWireIndex = r4
            com.facebook.aura.shopping.model.ShoppingCollection r0 = r6.shoppingCollection
            if (r0 == 0) goto L44
            java.util.List<com.facebook.aura.shopping.model.ShoppingCollectionList> r0 = r0.lists
            if (r0 != 0) goto L46
        L44:
            X.AGi r0 = X.C0881AGi.A00
        L46:
            java.util.List r0 = X.AbstractC0878AGe.A0a(r0, r2)
            X.AGi r5 = X.C0881AGi.A00
            java.util.Iterator r4 = r0.iterator()
        L50:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r4.next()
            com.facebook.aura.shopping.model.ShoppingCollectionList r0 = (com.facebook.aura.shopping.model.ShoppingCollectionList) r0
            java.util.List r0 = r6.productsOf(r0)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        L68:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L68
            r3.add(r1)
            goto L68
        L7c:
            java.util.Iterator r2 = r3.iterator()
        L80:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.shopping.model.ShoppingResultProduct r0 = (com.facebook.aura.shopping.model.ShoppingResultProduct) r0
            boolean r0 = com.facebook.aura.shopping.model.ShoppingResultsPresentationKt.getCanAttemptImage(r0)
            if (r0 == 0) goto L80
            if (r1 != 0) goto L9c
        L95:
            java.lang.Object r1 = X.AbstractC0878AGe.A0G(r3)
            if (r1 != 0) goto L9c
            goto L50
        L9c:
            java.util.ArrayList r5 = X.AbstractC0878AGe.A0Q(r1, r5)
            goto L50
        La1:
            r6.shoppingCollectionPhotos = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.model.ShoppingResultsPresentation.<init>(java.util.List, com.facebook.aura.shopping.model.ShoppingResultsAttribution, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.shopping.model.ShoppingCollection, java.util.Map):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultsPresentation) {
                ShoppingResultsPresentation shoppingResultsPresentation = (ShoppingResultsPresentation) obj;
                if (!C7384Etj.areEqual(this.products, shoppingResultsPresentation.products) || !C7384Etj.areEqual(this.attribution, shoppingResultsPresentation.attribution) || !C7384Etj.areEqual(this.widgetId, shoppingResultsPresentation.widgetId) || !C7384Etj.areEqual(this.kind, shoppingResultsPresentation.kind) || !C7384Etj.areEqual(this.label, shoppingResultsPresentation.label) || !C7384Etj.areEqual(this.subtitle, shoppingResultsPresentation.subtitle) || !C7384Etj.areEqual(this.shoppingCollection, shoppingResultsPresentation.shoppingCollection) || !C7384Etj.areEqual(this.couponPrices, shoppingResultsPresentation.couponPrices)) {
                }
            }
            return false;
        }
        return true;
    }

    public final List<ShoppingResultProduct> productsOf(ShoppingCollectionList shoppingCollectionList) {
        C7384Etj.A0Y(shoppingCollectionList, 0);
        List<Integer> list = shoppingCollectionList.productWireIndices;
        Map<Integer, ShoppingResultProduct> map = this.productsByWireIndex;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            ShoppingResultProduct shoppingResultProduct = map.get(it.next());
            if (shoppingResultProduct != null) {
                arrayListA0h.add(shoppingResultProduct);
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingResultsPresentation copy$default(ShoppingResultsPresentation shoppingResultsPresentation, List list, ShoppingResultsAttribution shoppingResultsAttribution, String str, String str2, String str3, String str4, ShoppingCollection shoppingCollection, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shoppingResultsPresentation.products;
        }
        if ((i & 2) != 0) {
            shoppingResultsAttribution = shoppingResultsPresentation.attribution;
        }
        if ((i & 4) != 0) {
            str = shoppingResultsPresentation.widgetId;
        }
        if ((i & 8) != 0) {
            str2 = shoppingResultsPresentation.kind;
        }
        if ((i & 16) != 0) {
            str3 = shoppingResultsPresentation.label;
        }
        if ((i & 32) != 0) {
            str4 = shoppingResultsPresentation.subtitle;
        }
        if ((i & 64) != 0) {
            shoppingCollection = shoppingResultsPresentation.shoppingCollection;
        }
        if ((i & 128) != 0) {
            map = shoppingResultsPresentation.couponPrices;
        }
        return shoppingResultsPresentation.copy(list, shoppingResultsAttribution, str, str2, str3, str4, shoppingCollection, map);
    }

    public static /* synthetic */ void getCouponPrices$annotations() {
    }

    public static /* synthetic */ void getProductsByWireIndex$annotations() {
    }

    public static /* synthetic */ void getShoppingCollectionPhotos$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingResultsPresentation shoppingResultsPresentation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(shoppingResultsPresentation.products, C3cH.A15($childSerializers, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingResultsPresentation.attribution != null) {
            c9j5.AAP(shoppingResultsPresentation.attribution, ShoppingResultsAttribution$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || shoppingResultsPresentation.widgetId != null) {
            c9j5.AAP(shoppingResultsPresentation.widgetId, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS.equals(shoppingResultsPresentation.kind)) {
            c9j5.AAV(shoppingResultsPresentation.kind, c9iZ, 3);
        }
        if (zAfR || shoppingResultsPresentation.label != null) {
            c9j5.AAP(shoppingResultsPresentation.label, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || shoppingResultsPresentation.subtitle != null) {
            c9j5.AAP(shoppingResultsPresentation.subtitle, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || shoppingResultsPresentation.shoppingCollection != null) {
            c9j5.AAP(shoppingResultsPresentation.shoppingCollection, ShoppingCollection$$serializer.INSTANCE, c9iZ, 6);
        }
    }

    public final List<ShoppingResultProduct> component1() {
        return this.products;
    }

    public final ShoppingResultsAttribution component2() {
        return this.attribution;
    }

    public final String component3() {
        return this.widgetId;
    }

    public final String component4() {
        return this.kind;
    }

    public final String component5() {
        return this.label;
    }

    public final String component6() {
        return this.subtitle;
    }

    public final ShoppingCollection component7() {
        return this.shoppingCollection;
    }

    public final Map<ShoppingCouponPriceKey, PdpCouponPrice> component8() {
        return this.couponPrices;
    }

    public final ShoppingResultsAttribution getAttribution() {
        return this.attribution;
    }

    public final Map<ShoppingCouponPriceKey, PdpCouponPrice> getCouponPrices() {
        return this.couponPrices;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<ShoppingResultProduct> getProducts() {
        return this.products;
    }

    public final ShoppingCollection getShoppingCollection() {
        return this.shoppingCollection;
    }

    public final List<ShoppingResultProduct> getShoppingCollectionPhotos() {
        return this.shoppingCollectionPhotos;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.couponPrices, (((((AnonymousClass005.A0I(this.kind, (((AnonymousClass005.A0E(this.products) + AnonymousClass006.A0D(this.attribution)) * 31) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + C3cH.A02(this.shoppingCollection)) * 31);
    }

    public final ShoppingResultsPresentation copy(List<ShoppingResultProduct> list, ShoppingResultsAttribution shoppingResultsAttribution, String str, String str2, String str3, String str4, ShoppingCollection shoppingCollection, Map<ShoppingCouponPriceKey, PdpCouponPrice> map) {
        AnonymousClass003.A0w(list, str2);
        C7384Etj.A0Y(map, 7);
        return new ShoppingResultsPresentation(list, shoppingResultsAttribution, str, str2, str3, str4, shoppingCollection, map);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        r1 = X.AbstractC0878AGe.A0G(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
    
        if (r1 != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ShoppingResultsPresentation(int r7, java.util.List r8, com.facebook.aura.shopping.model.ShoppingResultsAttribution r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.facebook.aura.shopping.model.ShoppingCollection r14, X.C2hx r15) {
        /*
            r6 = this;
            r0 = r7 & 1
            r1 = 1
            if (r1 == r0) goto Lf
            X.9iZ r0 = com.facebook.aura.shopping.model.ShoppingResultsPresentation$$serializer.descriptor
            X.C9iI.A00(r0, r7, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Lf:
            r6.<init>()
            r6.products = r8
            r0 = r7 & 2
            r1 = 0
            if (r0 != 0) goto L6f
            r6.attribution = r1
        L1b:
            r0 = r7 & 4
            if (r0 != 0) goto L6c
            r6.widgetId = r1
        L21:
            r0 = r7 & 8
            if (r0 != 0) goto L69
            java.lang.String r0 = "shopping_results"
            r6.kind = r0
        L29:
            r0 = r7 & 16
            if (r0 != 0) goto L66
            r6.label = r1
        L2f:
            r0 = r7 & 32
            if (r0 != 0) goto L63
            r6.subtitle = r1
        L35:
            r0 = r7 & 64
            if (r0 != 0) goto L60
            r6.shoppingCollection = r1
        L3b:
            X.9jH r0 = X.AGH.A0E()
            r6.couponPrices = r0
            int r0 = X.AnonymousClass005.A0C(r8)
            java.util.LinkedHashMap r3 = X.C60O.A15(r0)
            java.util.Iterator r2 = r8.iterator()
        L4d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.shopping.model.ShoppingResultProduct r0 = (com.facebook.aura.shopping.model.ShoppingResultProduct) r0
            java.lang.Integer r0 = r0.wireIndex
            r3.put(r0, r1)
            goto L4d
        L60:
            r6.shoppingCollection = r14
            goto L3b
        L63:
            r6.subtitle = r13
            goto L35
        L66:
            r6.label = r12
            goto L2f
        L69:
            r6.kind = r11
            goto L29
        L6c:
            r6.widgetId = r10
            goto L21
        L6f:
            r6.attribution = r9
            goto L1b
        L72:
            r6.productsByWireIndex = r3
            com.facebook.aura.shopping.model.ShoppingCollection r0 = r6.shoppingCollection
            if (r0 == 0) goto L7c
            java.util.List<com.facebook.aura.shopping.model.ShoppingCollectionList> r1 = r0.lists
            if (r1 != 0) goto L7e
        L7c:
            X.AGi r1 = X.C0881AGi.A00
        L7e:
            r0 = 3
            java.util.List r0 = X.AbstractC0878AGe.A0a(r1, r0)
            X.AGi r5 = X.C0881AGi.A00
            java.util.Iterator r4 = r0.iterator()
        L89:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lda
            java.lang.Object r0 = r4.next()
            com.facebook.aura.shopping.model.ShoppingCollectionList r0 = (com.facebook.aura.shopping.model.ShoppingCollectionList) r0
            java.util.List r0 = r6.productsOf(r0)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        La1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto La1
            r3.add(r1)
            goto La1
        Lb5:
            java.util.Iterator r2 = r3.iterator()
        Lb9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.shopping.model.ShoppingResultProduct r0 = (com.facebook.aura.shopping.model.ShoppingResultProduct) r0
            boolean r0 = com.facebook.aura.shopping.model.ShoppingResultsPresentationKt.getCanAttemptImage(r0)
            if (r0 == 0) goto Lb9
            if (r1 != 0) goto Ld5
        Lce:
            java.lang.Object r1 = X.AbstractC0878AGe.A0G(r3)
            if (r1 != 0) goto Ld5
            goto L89
        Ld5:
            java.util.ArrayList r5 = X.AbstractC0878AGe.A0Q(r1, r5)
            goto L89
        Lda:
            r6.shoppingCollectionPhotos = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.model.ShoppingResultsPresentation.<init>(int, java.util.List, com.facebook.aura.shopping.model.ShoppingResultsAttribution, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.shopping.model.ShoppingCollection, X.2hx):void");
    }

    public /* synthetic */ ShoppingResultsPresentation(List list, ShoppingResultsAttribution shoppingResultsAttribution, String str, String str2, String str3, String str4, ShoppingCollection shoppingCollection, Map map, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? null : shoppingResultsAttribution, (i & 4) != 0 ? null : str, (i & 8) != 0 ? HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : shoppingCollection, C3cH.A0o(map, i & 128));
    }
}
