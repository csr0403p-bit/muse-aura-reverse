package com.facebook.aura.shopping.view;

import X.AHD;
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
public abstract class HatchMoreLikeThisSectionKt {

    /* renamed from: com.facebook.aura.shopping.view.HatchMoreLikeThisSectionKt$HatchMoreLikeThisSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ AHD<ShoppingResultProductUiModel> $products;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$products = ahd;
            this.$onProductClick = g0u;
            this.$productId = str;
            this.$hostMessageId = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMoreLikeThisSectionKt.HatchMoreLikeThisSection(this.$products, this.$onProductClick, this.$productId, this.$hostMessageId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchMoreLikeThisSectionKt$HatchMoreLikeThisSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ AHD<ShoppingResultProductUiModel> $products;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$products = ahd;
            this.$onProductClick = g0u;
            this.$productId = str;
            this.$hostMessageId = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMoreLikeThisSectionKt.HatchMoreLikeThisSection(this.$products, this.$onProductClick, this.$productId, this.$hostMessageId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchMoreLikeThisSection(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        BRg bRg2 = bRg;
        AnonymousClass003.A0u(ahd, g0u);
        bfm.AgG(-1909014345);
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
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(ahd, g0u, str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            boolean zA63 = bfm.A63(ahd.size()) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA63 || objAaT == C78N.A00) {
                objAaT = HatchShoppingEventMetadataKt.shoppingEventMetadata(str2, AnonymousClass006.A10(HatchMetadataKey.TOTAL_COUNT.getValue(), String.valueOf(ahd.size())));
                bfm.Ai0(objAaT);
            }
            HatchPdpProductRailKt.HatchPdpProductRail(ahd, g0u, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120485), HatchComponent.RELATED_PRODUCT_CARD, ShoppingFormat.RELATED_RAIL, str2, bRg2.then(HatchPdpSectionImpressionKt.rememberPdpSectionImpression(HatchComponent.RELATED_PRODUCTS_SECTION, str, "pdp_related_products", (Map) objAaT, 0.0f, bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 16)), null, bfm, (iA0d & 14) | 27648 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (458752 & (iA0d << 6)), 128);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(ahd, g0u, str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }
}
