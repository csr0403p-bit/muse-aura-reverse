package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.status.viewmodel.CreditProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ G0U<CreditProduct, Unit> $onProductSelected;
    public final /* synthetic */ CreditProduct $product;
    public final /* synthetic */ String $selectedProductId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1$1$1(CreditProduct creditProduct, String str, G0U<? super CreditProduct, Unit> g0u) {
        super(3);
        this.$product = creditProduct;
        this.$selectedProductId = str;
        this.$onProductSelected = g0u;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        CreditProduct creditProduct = this.$product;
        boolean zAreEqual = C7384Etj.areEqual(creditProduct.id, this.$selectedProductId);
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$product, bfm.A65(this.$onProductSelected));
        G0U<CreditProduct, Unit> g0u = this.$onProductSelected;
        CreditProduct creditProduct2 = this.$product;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1$1$1$1$1(g0u, creditProduct2);
            bfm.Ai0(objAaT);
        }
        AuraBuyCreditsBottomSheetKt.CreditProductRow(creditProduct, zAreEqual, (Function0) objAaT, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
