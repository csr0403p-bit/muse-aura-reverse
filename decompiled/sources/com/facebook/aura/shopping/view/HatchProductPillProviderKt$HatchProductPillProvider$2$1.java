package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$HatchProductPillProvider$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<ShoppingResultProduct> $selectedProduct$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductPillProviderKt$HatchProductPillProvider$2$1(MutableState<ShoppingResultProduct> mutableState) {
        super(0);
        this.$selectedProduct$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<ShoppingResultProduct> mutableState = this.$selectedProduct$delegate;
        float f = HatchProductPillProviderKt.IconBorderWidth;
        mutableState.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
