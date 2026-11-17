package com.facebook.aura.shopping.repo;

import X.A3W;
import X.A3b;
import X.A6B;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.B3i;
import X.C3cG;
import X.C7384Etj;
import X.C7AG;
import X.C9iZ;
import X.C9oY;
import X.C9tJ;
import X.FGI;
import X.G0U;
import X.HxE;
import android.net.Uri;
import com.facebook.aura.shopping.model.PdpSeller;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public abstract class MarketplaceDetailsNormalizationKt {
    public static final String LOCATION_VARIANT_LABEL = "location";
    public static final String MARKETPLACE_ITEM_URL_PREFIX = "https://www.facebook.com/marketplace/item/";
    public static final int MAX_OTHER_LISTINGS = 24;
    public static final double MAX_SELLER_RATING = 5.0d;

    /* renamed from: com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt$toOtherListings$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<MarketplaceOtherListingJson, HxE<? extends String, ? extends MarketplaceOtherListingJson>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final HxE<String, MarketplaceOtherListingJson> invoke(MarketplaceOtherListingJson marketplaceOtherListingJson) {
            String strTrimToNonEmpty;
            C7384Etj.A0Y(marketplaceOtherListingJson, 0);
            JsonPrimitive jsonPrimitive = marketplaceOtherListingJson.listing_id;
            if (jsonPrimitive == null || (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(C9oY.A04(jsonPrimitive))) == null) {
                return null;
            }
            return C3cG.A0r(strTrimToNonEmpty, marketplaceOtherListingJson);
        }
    }

    /* renamed from: com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt$toOtherListings$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HxE<? extends String, ? extends MarketplaceOtherListingJson>, Boolean> {
        public final /* synthetic */ String $currentListingId;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(HxE<String, MarketplaceOtherListingJson> hxE) {
            C7384Etj.A0Y(hxE, 0);
            return C3cG.A0P(C7384Etj.areEqual(hxE.first, this.$currentListingId));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(1);
            this.$currentListingId = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(HxE<? extends String, ? extends MarketplaceOtherListingJson> hxE) {
            return invoke2((HxE<String, MarketplaceOtherListingJson>) hxE);
        }
    }

    /* renamed from: com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt$toOtherListings$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HxE<? extends String, ? extends MarketplaceOtherListingJson>, String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [A, java.lang.String] */
        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(HxE<? extends String, ? extends MarketplaceOtherListingJson> hxE) {
            HxE<? extends String, ? extends MarketplaceOtherListingJson> hxE2 = hxE;
            C7384Etj.A0Y(hxE2, 0);
            return hxE2.first;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(HxE<String, MarketplaceOtherListingJson> hxE) {
            C7384Etj.A0Y(hxE, 0);
            return hxE.first;
        }
    }

    public static final String locationVariantText(List<AttributeJson> list) {
        AttributeJson next;
        C7384Etj.A0Y(list, 0);
        Iterator<AttributeJson> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String strA0l = AnonymousClass002.A0l(next.label);
            if (strA0l != null && strA0l.equalsIgnoreCase(LOCATION_VARIANT_LABEL)) {
                break;
            }
        }
        AttributeJson attributeJson = next;
        return ProductDetailsPresentationKt.trimToNonEmpty(attributeJson != null ? attributeJson.value : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails normalized(com.facebook.aura.shopping.repo.MarketplaceDetailsJson r19, java.lang.String r20, java.lang.String r21) {
        /*
            r0 = 0
            r2 = r19
            X.C7384Etj.A0Y(r2, r0)
            java.lang.String r0 = r2.location_text
            java.lang.String r1 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r0)
            if (r1 != 0) goto L12
            java.lang.String r1 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r21)
        L12:
            com.facebook.aura.shopping.repo.MarketplaceSellerInfoJson r0 = r2.seller_info
            r14 = 0
            if (r0 == 0) goto L50
            com.facebook.aura.shopping.model.PdpSeller r10 = toPdpSeller(r0)
        L1b:
            java.lang.String r0 = r2.category_name
            java.lang.String r6 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r0)
            java.util.List<com.facebook.aura.shopping.repo.MarketplaceAttributeJson> r0 = r2.attributes
            java.util.ArrayList r7 = X.C3cG.A0h()
            java.util.Iterator r5 = r0.iterator()
        L2b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r3 = r5.next()
            com.facebook.aura.shopping.repo.MarketplaceAttributeJson r3 = (com.facebook.aura.shopping.repo.MarketplaceAttributeJson) r3
            java.lang.String r0 = r3.name
            java.lang.String r4 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r0)
            if (r4 == 0) goto L2b
            java.lang.String r0 = r3.value
            java.lang.String r3 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r0)
            if (r3 == 0) goto L2b
            com.facebook.aura.shopping.model.PdpAttribute r0 = new com.facebook.aura.shopping.model.PdpAttribute
            r0.<init>(r4, r3)
            r7.add(r0)
            goto L2b
        L50:
            r10 = r14
            goto L1b
        L52:
            java.lang.String r0 = r2.listing_duration_text
            java.lang.String r8 = com.facebook.aura.shopping.model.ProductDetailsPresentationKt.trimToNonEmpty(r0)
            java.util.List<java.lang.String> r0 = r2.additional_image_urls
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r3 = r0.iterator()
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L76
            java.lang.String r0 = X.AnonymousClass005.A0j(r3)
            java.lang.String r0 = asHttpUrl(r0)
            if (r0 == 0) goto L62
            r4.add(r0)
            goto L62
        L76:
            java.util.List r9 = X.C3cG.A0m(r4)
            if (r10 == 0) goto Lb9
            com.facebook.aura.shopping.repo.MarketplaceSellerInfoJson r0 = r2.seller_info
            kotlinx.serialization.json.JsonPrimitive r0 = r0.listing_count
            if (r0 == 0) goto Lb7
            java.lang.Integer r11 = asNonNegativeInt(r0)
        L86:
            com.facebook.aura.shopping.repo.MarketplaceSellerInfoJson r0 = r2.seller_info
            r3 = r20
            java.util.List r12 = toOtherListings(r0, r3)
            if (r12 != 0) goto L92
        L90:
            X.AGi r12 = X.C0881AGi.A00
        L92:
            com.facebook.aura.shopping.repo.MarketplaceApproxLocationJson r0 = r2.approximate_location
            com.facebook.aura.shopping.model.PdpLocation r13 = toPdpLocation(r0, r1)
            com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails r5 = new com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.AGi r15 = X.C0881AGi.A00
            com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails r13 = new com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails
            r16 = r14
            r17 = r15
            r18 = r14
            r19 = r14
            r20 = r15
            r21 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = r5.equals(r13)
            if (r0 != 0) goto Lbb
            return r5
        Lb7:
            r11 = r14
            goto L86
        Lb9:
            r11 = r14
            goto L90
        Lbb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt.normalized(com.facebook.aura.shopping.repo.MarketplaceDetailsJson, java.lang.String, java.lang.String):com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.model.PdpLocation toPdpLocation(com.facebook.aura.shopping.repo.MarketplaceApproxLocationJson r10, java.lang.String r11) {
        /*
            r9 = 0
            r8 = r11
            if (r10 == 0) goto L64
            kotlinx.serialization.json.JsonPrimitive r0 = r10.latitude
            if (r0 == 0) goto L62
            java.lang.Double r5 = asFiniteDouble(r0)
        Lc:
            kotlinx.serialization.json.JsonPrimitive r0 = r10.longitude
            if (r0 == 0) goto L60
            java.lang.Double r6 = asFiniteDouble(r0)
        L14:
            kotlinx.serialization.json.JsonPrimitive r0 = r10.radius_km
            if (r0 == 0) goto L5e
            java.lang.Double r7 = asFiniteDouble(r0)
        L1c:
            if (r5 == 0) goto L64
            if (r6 == 0) goto L64
            if (r7 == 0) goto L64
            double r3 = r5.doubleValue()
            r1 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L64
            r1 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L64
            double r3 = r6.doubleValue()
            r1 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L64
            r1 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L64
            double r3 = r7.doubleValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L64
        L58:
            com.facebook.aura.shopping.model.PdpLocation r4 = new com.facebook.aura.shopping.model.PdpLocation
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L5e:
            r7 = r9
            goto L1c
        L60:
            r6 = r9
            goto L14
        L62:
            r5 = r9
            goto Lc
        L64:
            if (r11 != 0) goto L67
            return r9
        L67:
            r5 = r9
            r6 = r9
            r7 = r9
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt.toPdpLocation(com.facebook.aura.shopping.repo.MarketplaceApproxLocationJson, java.lang.String):com.facebook.aura.shopping.model.PdpLocation");
    }

    public static final Double asFiniteDouble(JsonPrimitive jsonPrimitive) {
        C9iZ c9iZ = C9oY.A00;
        C7384Etj.A0Y(jsonPrimitive, 0);
        Double dA0v = C9tJ.A0v(jsonPrimitive.A00());
        if (dA0v == null || Math.abs(dA0v.doubleValue()) > Double.MAX_VALUE) {
            return null;
        }
        return dA0v;
    }

    public static final List<ShoppingResultProduct> toOtherListings(MarketplaceSellerInfoJson marketplaceSellerInfoJson, String str) {
        B3i b3iA03 = A6B.A03(new AnonymousClass2(str), A6B.A04(AnonymousClass1.INSTANCE, AbstractC0878AGe.A06(marketplaceSellerInfoJson.other_listings)));
        AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        C7384Etj.A0Y(anonymousClass3, 1);
        A3b a3b = new A3b(new A3W(anonymousClass3, b3iA03), 24);
        AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
        AnonymousClass003.A0u(a3b, anonymousClass4);
        return A6B.A02(new C7AG(anonymousClass4, a3b));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 int, still in use, count: 2, list:
          (r0v8 int) from 0x0029: IF  (r0v8 int) == (0 int)  -> B:16:0x002b A[HIDDEN] (LINE:41)
          (r0v8 int) from 0x002d: PHI (r0v6 int) = (r0v8 int) binds: [B:15:0x0029] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final com.facebook.aura.shopping.model.PdpRating toPdpRating(com.facebook.aura.shopping.repo.MarketplaceSellerInfoJson r6) {
        /*
            kotlinx.serialization.json.JsonPrimitive r0 = r6.average_rating
            r5 = 0
            if (r0 == 0) goto L2b
            java.lang.Double r0 = asFiniteDouble(r0)
            if (r0 == 0) goto L2b
            double r1 = r0.doubleValue()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2b
            r3 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L2b
            kotlinx.serialization.json.JsonPrimitive r0 = r6.rating_count
            if (r0 == 0) goto L2c
            java.lang.Integer r0 = asNonNegativeInt(r0)
            if (r0 == 0) goto L2c
            int r0 = r0.intValue()
            if (r0 != 0) goto L2d
        L2b:
            return r5
        L2c:
            r0 = 0
        L2d:
            com.facebook.aura.shopping.model.PdpRating r5 = new com.facebook.aura.shopping.model.PdpRating
            r5.<init>(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt.toPdpRating(com.facebook.aura.shopping.repo.MarketplaceSellerInfoJson):com.facebook.aura.shopping.model.PdpRating");
    }

    public static final PdpSeller toPdpSeller(MarketplaceSellerInfoJson marketplaceSellerInfoJson) {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(marketplaceSellerInfoJson.seller_id);
        if (strTrimToNonEmpty == null) {
            return null;
        }
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(marketplaceSellerInfoJson.name);
        String strAsHttpUrl = asHttpUrl(marketplaceSellerInfoJson.profile_pic_uri);
        String strAsHttpUrl2 = asHttpUrl(marketplaceSellerInfoJson.profile_url);
        JsonPrimitive jsonPrimitive = marketplaceSellerInfoJson.join_year;
        PdpSeller pdpSeller = new PdpSeller(strTrimToNonEmpty, strTrimToNonEmpty2, strAsHttpUrl, strAsHttpUrl2, jsonPrimitive != null ? asNonNegativeInt(jsonPrimitive) : null, toPdpRating(marketplaceSellerInfoJson));
        if (ProductDetailsPresentationKt.getHasDisplayableField(pdpSeller)) {
            return pdpSeller;
        }
        return null;
    }

    public static final String asHttpUrl(String str) {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty == null || !(AnonymousClass006.A1b("https://", strTrimToNonEmpty) || AnonymousClass006.A1b(AnonymousClass000.A00(29), strTrimToNonEmpty))) {
            return null;
        }
        return strTrimToNonEmpty;
    }

    public static final Integer asNonNegativeInt(JsonPrimitive jsonPrimitive) {
        Integer numA02 = C9oY.A02(jsonPrimitive);
        if (numA02 == null || numA02.intValue() < 0) {
            return null;
        }
        return numA02;
    }

    public static final String contentOrNullIfBlank(JsonPrimitive jsonPrimitive) {
        return ProductDetailsPresentationKt.trimToNonEmpty(C9oY.A04(jsonPrimitive));
    }

    /* renamed from: com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt$toOtherListings$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<HxE<? extends String, ? extends MarketplaceOtherListingJson>, ShoppingResultProduct> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ShoppingResultProduct invoke2(HxE<String, MarketplaceOtherListingJson> hxE) {
            C7384Etj.A0Y(hxE, 0);
            String str = hxE.first;
            MarketplaceOtherListingJson marketplaceOtherListingJson = hxE.second;
            String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(marketplaceOtherListingJson.price);
            String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(marketplaceOtherListingJson.title);
            if (strTrimToNonEmpty2 == null) {
                strTrimToNonEmpty2 = "";
            }
            String strAsHttpUrl = MarketplaceDetailsNormalizationKt.asHttpUrl(marketplaceOtherListingJson.image_url);
            String strTrimToNonEmpty3 = ProductDetailsPresentationKt.trimToNonEmpty(marketplaceOtherListingJson.sale_price);
            if (strTrimToNonEmpty3 == null || strTrimToNonEmpty3.equals(strTrimToNonEmpty)) {
                strTrimToNonEmpty3 = null;
            }
            return new ShoppingResultProduct(str, strTrimToNonEmpty2, null, strAsHttpUrl, strTrimToNonEmpty, strTrimToNonEmpty3, null, FGI.A0U(MarketplaceDetailsNormalizationKt.MARKETPLACE_ITEM_URL_PREFIX, Uri.encode(str), CustomConnectorRegisterRepositoryKt.ROOT_PATH), ShoppingProductType.MARKETPLACE, false, false, false, null, null, true, null, null, null, null, null, null);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ ShoppingResultProduct invoke(HxE<? extends String, ? extends MarketplaceOtherListingJson> hxE) {
            return invoke2((HxE<String, MarketplaceOtherListingJson>) hxE);
        }
    }
}
