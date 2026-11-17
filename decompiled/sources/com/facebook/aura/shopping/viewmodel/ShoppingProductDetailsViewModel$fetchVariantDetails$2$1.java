package com.facebook.aura.shopping.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$fetchVariantDetails$2$1", f = "ShoppingProductDetailsViewModel.kt", l = {1110}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsViewModel$fetchVariantDetails$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ProductDetailsPresentation $presentation;
    public final /* synthetic */ String $variantId;
    public Object L$0;
    public int label;
    public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsViewModel$fetchVariantDetails$2$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, ProductDetailsPresentation productDetailsPresentation, String str, HtJ<? super ShoppingProductDetailsViewModel$fetchVariantDetails$2$1> htJ) {
        super(2, htJ);
        this.this$0 = shoppingProductDetailsViewModel;
        this.$presentation = productDetailsPresentation;
        this.$variantId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsViewModel$fetchVariantDetails$2$1(this.this$0, this.$presentation, this.$variantId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ShoppingProductDetailsViewModel shoppingProductDetailsViewModel;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            shoppingProductDetailsViewModel = this.this$0;
            ProductDetailsPresentation productDetailsPresentation = this.$presentation;
            String str = this.$variantId;
            this.L$0 = shoppingProductDetailsViewModel;
            this.label = 1;
            obj = shoppingProductDetailsViewModel.variantRecord(productDetailsPresentation, str, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            shoppingProductDetailsViewModel = (ShoppingProductDetailsViewModel) this.L$0;
            Hwg.A00(obj);
        }
        shoppingProductDetailsViewModel.applyVariantRecord((G0U) obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsViewModel$fetchVariantDetails$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
