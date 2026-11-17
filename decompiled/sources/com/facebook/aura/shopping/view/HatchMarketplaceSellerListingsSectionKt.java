package com.facebook.aura.shopping.view;

import X.AHD;
import X.AIW;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0924AIa;
import X.C3cG;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class HatchMarketplaceSellerListingsSectionKt {

    /* renamed from: com.facebook.aura.shopping.view.HatchMarketplaceSellerListingsSectionKt$HatchMarketplaceSellerListingsSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ AHD<ShoppingResultProductUiModel> $listings;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onListingClick;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ String $sellerId;
        public final /* synthetic */ Integer $sellerListingCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, String str2, Integer num, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$listings = ahd;
            this.$onListingClick = g0u;
            this.$productId = str;
            this.$sellerId = str2;
            this.$sellerListingCount = num;
            this.$hostMessageId = str3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceSellerListingsSectionKt.HatchMarketplaceSellerListingsSection(this.$listings, this.$onListingClick, this.$productId, this.$sellerId, this.$sellerListingCount, this.$hostMessageId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchMarketplaceSellerListingsSectionKt$HatchMarketplaceSellerListingsSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ AHD<ShoppingResultProductUiModel> $listings;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onListingClick;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ String $sellerId;
        public final /* synthetic */ Integer $sellerListingCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, String str2, Integer num, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$listings = ahd;
            this.$onListingClick = g0u;
            this.$productId = str;
            this.$sellerId = str2;
            this.$sellerListingCount = num;
            this.$hostMessageId = str3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarketplaceSellerListingsSectionKt.HatchMarketplaceSellerListingsSection(this.$listings, this.$onListingClick, this.$productId, this.$sellerId, this.$sellerListingCount, this.$hostMessageId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchMarketplaceSellerListingsSection(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, String str2, Integer num, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(ahd, g0u);
        bfm.AgG(-2117190951);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, num);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str3);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0d, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(ahd, g0u, str, str2, num, str3, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            int i4 = 458752 & iA0d;
            boolean zA63 = bfm.A63(ahd.size()) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1F(57344, iA0d, 16384) | (i4 == 131072);
            Object objAaT = bfm.AaT();
            if (zA63 || objAaT == C78N.A00) {
                C0924AIa c0924AIaA0u = C3cG.A0u();
                if (str2 != null) {
                    AnonymousClass001.A1C(HatchMetadataKey.SELLER_ID, str2, c0924AIaA0u);
                }
                if (num != null) {
                    AnonymousClass006.A1B(HatchMetadataKey.LISTING_COUNT, c0924AIaA0u, num.intValue());
                }
                c0924AIaA0u.put(HatchMetadataKey.VISIBLE_LISTING_COUNT.getValue(), String.valueOf(ahd.size()));
                objAaT = HatchShoppingEventMetadataKt.shoppingEventMetadata(str3, AIW.A0K(c0924AIaA0u));
                bfm.Ai0(objAaT);
            }
            HatchPdpProductRailKt.HatchPdpProductRail(ahd, g0u, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dda), HatchComponent.SELLER_LISTING_CARD, ShoppingFormat.SELLER_RAIL, str3, bRg2.then(HatchPdpSectionImpressionKt.rememberPdpSectionImpression(HatchComponent.SELLER_LISTINGS_SECTION, str, "pdp_seller_listings", (Map) objAaT, 0.0f, bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 16)), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dd9), bfm, i4 | (iA0d & 14) | 27648 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(ahd, g0u, str, str2, num, str3, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }
}
