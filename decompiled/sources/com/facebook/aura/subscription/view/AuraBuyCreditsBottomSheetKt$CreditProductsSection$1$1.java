package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.status.viewmodel.CreditProduct;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ G0U<CreditProduct, Unit> $onProductSelected;
    public final /* synthetic */ List<CreditProduct> $products;
    public final /* synthetic */ String $selectedProductId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        List<CreditProduct> list = this.$products;
        String str = this.$selectedProductId;
        G0U<CreditProduct, Unit> g0u = this.$onProductSelected;
        Iterator<CreditProduct> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1$1$1(it.next(), str, g0u), -1356006516);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1(List<CreditProduct> list, String str, G0U<? super CreditProduct, Unit> g0u) {
        super(1);
        this.$products = list;
        this.$selectedProductId = str;
        this.$onProductSelected = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
