package com.facebook.aura.shopping.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$browserTryOnEligibility$1", f = "ShoppingProductDetailsViewModel.kt", l = {728, 725}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsViewModel$browserTryOnEligibility$1 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsViewModel$browserTryOnEligibility$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, HtJ<? super ShoppingProductDetailsViewModel$browserTryOnEligibility$1> htJ) {
        super(2, htJ);
        this.this$0 = shoppingProductDetailsViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ShoppingProductDetailsViewModel$browserTryOnEligibility$1 shoppingProductDetailsViewModel$browserTryOnEligibility$1 = new ShoppingProductDetailsViewModel$browserTryOnEligibility$1(this.this$0, htJ);
        shoppingProductDetailsViewModel$browserTryOnEligibility$1.L$0 = obj;
        return shoppingProductDetailsViewModel$browserTryOnEligibility$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = this.this$0;
            ProductDetailsHydrationTarget productDetailsHydrationTarget = shoppingProductDetailsViewModel.hydrationTarget;
            if (productDetailsHydrationTarget == null || productDetailsHydrationTarget.connectorId != null || productDetailsHydrationTarget.productType != ShoppingProductType.BROWSER || (str = productDetailsHydrationTarget.productName) == null) {
                obj = null;
            } else {
                HatchProductDetailsRepository hatchProductDetailsRepository = shoppingProductDetailsViewModel.repository;
                String str2 = productDetailsHydrationTarget.productId;
                String str3 = shoppingProductDetailsViewModel.optimistic.header.brand;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = c20z;
                this.label = 1;
                obj = hatchProductDetailsRepository.fetchBrowserTryOnEligibility(str2, str, str3, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            c20z = (C20Z) this.L$3;
            Hwg.A00(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (c20z.emit(obj, this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super Boolean> c20z, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsViewModel$browserTryOnEligibility$1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
