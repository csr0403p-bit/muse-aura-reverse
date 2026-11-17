package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$HatchShoppingResultsCard$1$1$1$1 extends AbstractC7559F3s implements G0U<ShoppingResultProduct, Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0W<Integer, ShoppingResultProduct, List<ShoppingResultProduct>, Unit> $onProductClick;
    public final /* synthetic */ AHD<ShoppingResultProduct> $snapshotProducts;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        this.$onProductClick.invoke(Integer.valueOf(this.$index), shoppingResultProduct, this.$snapshotProducts);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShoppingResultsCardKt$HatchShoppingResultsCard$1$1$1$1(G0W<? super Integer, ? super ShoppingResultProduct, ? super List<ShoppingResultProduct>, Unit> g0w, int i, AHD<ShoppingResultProduct> ahd) {
        super(1);
        this.$onProductClick = g0w;
        this.$index = i;
        this.$snapshotProducts = ahd;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ShoppingResultProduct shoppingResultProduct) {
        invoke2(shoppingResultProduct);
        return Unit.INSTANCE;
    }
}
