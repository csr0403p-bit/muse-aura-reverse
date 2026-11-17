package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C10G;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchPdpProductRailKt$HatchPdpProductRail$2$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ HatchComponent $cardComponent;
    public final /* synthetic */ ShoppingFormat $format;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
    public final /* synthetic */ AHD<ShoppingResultProductUiModel> $products;
    public final /* synthetic */ String $titleFallback;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final AHD<ShoppingResultProductUiModel> ahd = this.$products;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final G0U<ShoppingResultProduct, Unit> g0u = this.$onProductClick;
        final String str = this.$titleFallback;
        final HatchComponent hatchComponent = this.$cardComponent;
        final String str2 = this.$hostMessageId;
        final ShoppingFormat shoppingFormat = this.$format;
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.shopping.view.HatchPdpProductRailKt$HatchPdpProductRail$2$2$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return anonymousClass1.invoke(Integer.valueOf(i), ahd.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.shopping.view.HatchPdpProductRailKt$HatchPdpProductRail$2$2$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                ahd.get(i);
                return null;
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.shopping.view.HatchPdpProductRailKt$HatchPdpProductRail$2$2$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ShoppingResultProductUiModel shoppingResultProductUiModel = (ShoppingResultProductUiModel) ahd.get(i);
                bfm.AgE(979740148);
                HatchShoppingResultsCardKt.ShoppingResultProductCard(shoppingResultProductUiModel, g0u, C10G.A08(BRg.A00, HatchPdpProductRailKt.RailCardWidth), true, str, 0, false, new ShoppingCardClickLogging(HatchScreen.PRODUCT_DETAIL, hatchComponent, ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProductUiModel.product, str2, shoppingFormat, null, null, AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i)))), null, null, null, bfm, 3456, 0, 1888);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPdpProductRailKt$HatchPdpProductRail$2$2$1(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, HatchComponent hatchComponent, String str2, ShoppingFormat shoppingFormat) {
        super(1);
        this.$products = ahd;
        this.$onProductClick = g0u;
        this.$titleFallback = str;
        this.$cardComponent = hatchComponent;
        this.$hostMessageId = str2;
        this.$format = shoppingFormat;
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchPdpProductRailKt$HatchPdpProductRail$2$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Integer, ShoppingResultProductUiModel, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final Object invoke(int i, ShoppingResultProductUiModel shoppingResultProductUiModel) {
            C7384Etj.A0Y(shoppingResultProductUiModel, 1);
            String resolvedProductId = ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProductUiModel.product);
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(i);
            return C60P.A1M(":", resolvedProductId, sbA0w);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ShoppingResultProductUiModel shoppingResultProductUiModel) {
            return invoke(AnonymousClass001.A0F(num), shoppingResultProductUiModel);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
