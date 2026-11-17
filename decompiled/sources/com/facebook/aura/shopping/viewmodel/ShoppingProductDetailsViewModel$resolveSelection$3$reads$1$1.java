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

@DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$resolveSelection$3$reads$1$1", f = "ShoppingProductDetailsViewModel.kt", l = {1082}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsViewModel$resolveSelection$3$reads$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super G0U<? super ProductDetailsPresentation, ? extends ProductDetailsPresentation>>, Object> {
    public final /* synthetic */ ProductDetailsPresentation $basePresentation;
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsViewModel$resolveSelection$3$reads$1$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, ProductDetailsPresentation productDetailsPresentation, String str, HtJ<? super ShoppingProductDetailsViewModel$resolveSelection$3$reads$1$1> htJ) {
        super(2, htJ);
        this.this$0 = shoppingProductDetailsViewModel;
        this.$basePresentation = productDetailsPresentation;
        this.$id = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsViewModel$resolveSelection$3$reads$1$1(this.this$0, this.$basePresentation, this.$id, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = this.this$0;
            ProductDetailsPresentation productDetailsPresentation = this.$basePresentation;
            String str = this.$id;
            this.label = 1;
            obj = shoppingProductDetailsViewModel.variantRecord(productDetailsPresentation, str, this);
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super G0U<? super ProductDetailsPresentation, ProductDetailsPresentation>> htJ) {
        return ((ShoppingProductDetailsViewModel$resolveSelection$3$reads$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super G0U<? super ProductDetailsPresentation, ? extends ProductDetailsPresentation>> htJ) {
        return invoke2(c3ux, (HtJ<? super G0U<? super ProductDetailsPresentation, ProductDetailsPresentation>>) htJ);
    }
}
