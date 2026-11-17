package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.BO6;
import X.C0Hi;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$HatchProductPillProvider$onProductLongPress$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ BO6<String, ShoppingResultProduct> $productsByPillId;
    public final /* synthetic */ MutableState<ShoppingResultProduct> $selectedProduct$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$focusManager.A6G(false);
        MutableState<ShoppingResultProduct> mutableState = this.$selectedProduct$delegate;
        ShoppingResultProduct shoppingResultProduct = this.$productsByPillId.get(str);
        float f = HatchProductPillProviderKt.IconBorderWidth;
        mutableState.Af8(shoppingResultProduct);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductPillProviderKt$HatchProductPillProvider$onProductLongPress$1$1(C0Hi c0Hi, BO6<String, ShoppingResultProduct> bo6, MutableState<ShoppingResultProduct> mutableState) {
        super(1);
        this.$focusManager = c0Hi;
        this.$productsByPillId = bo6;
        this.$selectedProduct$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
