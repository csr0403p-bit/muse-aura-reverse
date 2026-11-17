package com.facebook.aura.shopping.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.ProductDetailsFetchResult;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$flight$1", f = "ShoppingProductDetailsViewModel.kt", l = {1128}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsViewModel$variantRecord$flight$1 extends AbstractC07127nr implements G0U<HtJ<? super ProductDetailsFetchResult>, Object> {
    public final /* synthetic */ ProductDetailsPresentation $presentation;
    public final /* synthetic */ String $variantId;
    public int label;
    public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsViewModel$variantRecord$flight$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, String str, ProductDetailsPresentation productDetailsPresentation, HtJ<? super ShoppingProductDetailsViewModel$variantRecord$flight$1> htJ) {
        super(1, htJ);
        this.this$0 = shoppingProductDetailsViewModel;
        this.$variantId = str;
        this.$presentation = productDetailsPresentation;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new ShoppingProductDetailsViewModel$variantRecord$flight$1(this.this$0, this.$variantId, this.$presentation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = this.this$0;
            HatchProductDetailsRepository hatchProductDetailsRepository = shoppingProductDetailsViewModel.repository;
            String str2 = this.$variantId;
            ShoppingProductType shoppingProductType = this.$presentation.productType;
            ProductDetailsHydrationTarget productDetailsHydrationTarget = shoppingProductDetailsViewModel.hydrationTarget;
            String str3 = null;
            if (productDetailsHydrationTarget != null) {
                str = productDetailsHydrationTarget.priceCurrency;
                str3 = productDetailsHydrationTarget.connectorId;
            } else {
                str = null;
            }
            this.label = 1;
            obj = hatchProductDetailsRepository.fetchProductDetails(str2, shoppingProductType, str, null, str3, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super ProductDetailsFetchResult> htJ) {
        return ((ShoppingProductDetailsViewModel$variantRecord$flight$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
