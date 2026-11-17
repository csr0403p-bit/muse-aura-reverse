package com.facebook.aura.shopping.viewmodel;

import X.AEs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC0962AJp;
import com.facebook.aura.shopping.model.PdpCouponPrice;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$scheduleDisplayedCouponExpiry$job$1", f = "ShoppingProductDetailsViewModel.kt", l = {560}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsViewModel$scheduleDisplayedCouponExpiry$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $generation;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsViewModel$scheduleDisplayedCouponExpiry$job$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, int i, HtJ<? super ShoppingProductDetailsViewModel$scheduleDisplayedCouponExpiry$job$1> htJ) {
        super(2, htJ);
        this.this$0 = shoppingProductDetailsViewModel;
        this.$generation = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsViewModel$scheduleDisplayedCouponExpiry$job$1(this.this$0, this.$generation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String displayedProductId;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ShoppingProductDetailsUiState shoppingProductDetailsUiStateA01 = AEs.A01(this.this$0);
            displayedProductId = ShoppingProductDetailsViewModelKt.getDisplayedProductId(shoppingProductDetailsUiStateA01);
            if (!shoppingProductDetailsUiStateA01.refreshingPriceIds.contains(displayedProductId)) {
                ProductDetailsPresentation productDetailsPresentation = shoppingProductDetailsUiStateA01.presentation;
                InterfaceC0962AJp<String, String> interfaceC0962AJp = shoppingProductDetailsUiStateA01.selections;
                ShoppingCouponPrices value = this.this$0.repository.couponPrices.getValue();
                ProductDetailsHydrationTarget productDetailsHydrationTarget = this.this$0.hydrationTarget;
                PdpCouponPrice pdpCouponPriceExactCouponPrice = ShoppingProductDetailsViewModelKt.exactCouponPrice(productDetailsPresentation, interfaceC0962AJp, displayedProductId, value, productDetailsHydrationTarget != null ? productDetailsHydrationTarget.priceCurrency : null);
                if (pdpCouponPriceExactCouponPrice == null) {
                    this.this$0.refreshLapsedPageQuote(shoppingProductDetailsUiStateA01, displayedProductId);
                } else {
                    long jCeil = (long) Math.ceil((pdpCouponPriceExactCouponPrice.expiresAt - (System.currentTimeMillis() / 1000.0d)) * 1000.0d);
                    if (jCeil > 0) {
                        this.L$0 = null;
                        this.L$1 = displayedProductId;
                        this.L$2 = null;
                        this.J$0 = jCeil;
                        this.label = 1;
                        if (C7Bq.A01(jCeil, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        displayedProductId = C3cG.A0d(this.L$1, obj);
        if (this.this$0.selectionGeneration.get() == this.$generation && this.this$0.couponPriceRefreshActive.get()) {
            this.this$0.refreshCouponPrice(displayedProductId, C3cG.A1J(2, false));
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsViewModel$scheduleDisplayedCouponExpiry$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
