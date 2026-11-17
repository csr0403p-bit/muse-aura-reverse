package com.facebook.aura.shopping.view;

import X.AbstractC1061ATk;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.C03X;
import X.C10G;
import X.C1Cj;
import X.C1V6;
import X.C1VA;
import X.C1VW;
import X.C3U4;
import X.C3cG;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.view.ProductItemsGridItem;
import com.facebook.aura.shopping.viewmodel.ProductItemsSection;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ProductItemsScreenKt$ProductItemsGrid$2$1 extends AbstractC7559F3s implements G0U<C1Cj, Unit> {
    public final /* synthetic */ long $gridInstanceKey;
    public final /* synthetic */ List<ProductItemsGridItem> $gridItems;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ String $sessionId;

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ProductItemsGridItem, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(ProductItemsGridItem productItemsGridItem) {
            ProductItemsGridItem productItemsGridItem2 = productItemsGridItem;
            C7384Etj.A0Y(productItemsGridItem2, 0);
            return productItemsGridItem2.getKey();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ProductItemsGridItem productItemsGridItem) {
            C7384Etj.A0Y(productItemsGridItem, 0);
            return productItemsGridItem.getKey();
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<C1V6, ProductItemsGridItem, C1VW> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1VW invoke(C1V6 c1v6, ProductItemsGridItem productItemsGridItem) {
            return new C1VW(m2058invoke_orMbw(c1v6, productItemsGridItem));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m2058invoke_orMbw(C1V6 c1v6, ProductItemsGridItem productItemsGridItem) {
            AnonymousClass003.A0u(c1v6, productItemsGridItem);
            if (!(productItemsGridItem instanceof ProductItemsGridItem.Header)) {
                if (productItemsGridItem instanceof ProductItemsGridItem.Tile) {
                    return 1L;
                }
                throw new NoWhenBranchMatchedException();
            }
            int i = C1VA.A00;
            if (i > 0) {
                return i;
            }
            AbstractC1061ATk.A00("The span value should be higher than 0");
            throw F60.createAndThrow();
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<ProductItemsGridItem, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(ProductItemsGridItem productItemsGridItem) {
            C7384Etj.A0Y(productItemsGridItem, 0);
            if (productItemsGridItem instanceof ProductItemsGridItem.Header) {
                return "section_header";
            }
            if (productItemsGridItem instanceof ProductItemsGridItem.Tile) {
                return "product_tile";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1Cj c1Cj) {
        C7384Etj.A0Y(c1Cj, 0);
        final List<ProductItemsGridItem> list = this.$gridItems;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        final String str = this.$sessionId;
        final String str2 = this.$messageId;
        final long j = this.$gridInstanceKey;
        c1Cj.APM(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$2$1$invoke$$inlined$items$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(list, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$2$1$invoke$$inlined$items$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(list, anonymousClass3, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, anonymousClass2 != null ? new G0V<C1V6, Integer, C1VW>() { // from class: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$2$1$invoke$$inlined$items$2
            @Override // X.G0V
            public /* bridge */ /* synthetic */ C1VW invoke(C1V6 c1v6, Integer num) {
                return new C1VW(m2057invoke_orMbw(c1v6, AnonymousClass001.A0F(num)));
            }

            /* renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m2057invoke_orMbw(C1V6 c1v6, int i) {
                return ((C1VW) AnonymousClass006.A0n(c1v6, list, anonymousClass2, i)).A00;
            }
        } : null, AnonymousClass001.A0M(new G2j<C03X, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$2$1$invoke$$inlined$items$4
            public final void invoke(C03X c03x, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, c03x) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ProductItemsGridItem productItemsGridItem = (ProductItemsGridItem) list.get(i);
                bfm.AgE(-319618624);
                if (productItemsGridItem instanceof ProductItemsGridItem.Header) {
                    bfm.AgE(1375164644);
                    ProductItemsGridItem.Header header = (ProductItemsGridItem.Header) productItemsGridItem;
                    ProductItemsScreenKt.ProductItemsSectionHeader(header.label, header.subtitle, C3U4.A0C(BRg.A00, 0.0f, header.isFirstSection ? 0.0f : ProductItemsScreenKt.ProductItemsGridRowSpacing, 0.0f, AuraDimensKt.SpacingMedium - ProductItemsScreenKt.ProductItemsGridRowSpacing), bfm, 0, 0);
                } else {
                    if (!(productItemsGridItem instanceof ProductItemsGridItem.Tile)) {
                        AnonymousClass004.A1A(bfm, 1375163043);
                        throw C3cG.A0q();
                    }
                    bfm.AgE(1375178442);
                    ProductItemsGridItem.Tile tile = (ProductItemsGridItem.Tile) productItemsGridItem;
                    ProductItemsScreenKt.ProductItemsTile(tile.section, tile.rawProducts, tile.merchantRanking, tile.displayProduct, tile.index, str, str2, j, C10G.A02, bfm, 113246208 | ProductItemsSection.$stable | (ShoppingResultProduct.$stable << 3), 0);
                }
                AnonymousClass006.A1M(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C03X c03x, Integer num, BFM bfm, Integer num2) {
                invoke(c03x, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, -1117249557), list.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductItemsScreenKt$ProductItemsGrid$2$1(List<? extends ProductItemsGridItem> list, String str, String str2, long j) {
        super(1);
        this.$gridItems = list;
        this.$sessionId = str;
        this.$messageId = str2;
        this.$gridInstanceKey = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1Cj c1Cj) {
        invoke2(c1Cj);
        return Unit.INSTANCE;
    }
}
