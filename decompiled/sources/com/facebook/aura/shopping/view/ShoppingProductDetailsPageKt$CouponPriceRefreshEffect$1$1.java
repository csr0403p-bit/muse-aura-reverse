package com.facebook.aura.shopping.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1", f = "ShoppingProductDetailsPage.kt", l = {170}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Boolean> $isSettledPage;
    public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1(Function0<Boolean> function0, ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, HtJ<? super ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1> htJ) {
        super(2, htJ);
        this.$isSettledPage = function0;
        this.$viewModel = shoppingProductDetailsViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1(this.$isSettledPage, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(C6v3.A01(this.$isSettledPage));
            final ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = this.$viewModel;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1.1
                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    ShoppingProductDetailsViewModel shoppingProductDetailsViewModel2 = shoppingProductDetailsViewModel;
                    if (z) {
                        shoppingProductDetailsViewModel2.onPagerSettled();
                    } else {
                        shoppingProductDetailsViewModel2.onPagerUnsettled();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
