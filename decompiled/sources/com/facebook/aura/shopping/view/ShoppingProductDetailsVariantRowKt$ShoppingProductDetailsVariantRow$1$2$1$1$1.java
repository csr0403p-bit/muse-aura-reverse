package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantOptionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantRow$1$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ShoppingProductDetailsVariantGroupState $group;
    public final /* synthetic */ G0V<String, String, Unit> $onSelect;
    public final /* synthetic */ ShoppingProductDetailsVariantOptionState $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantRow$1$2$1$1$1(G0V<? super String, ? super String, Unit> g0v, ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState, ShoppingProductDetailsVariantOptionState shoppingProductDetailsVariantOptionState) {
        super(0);
        this.$onSelect = g0v;
        this.$group = shoppingProductDetailsVariantGroupState;
        this.$option = shoppingProductDetailsVariantOptionState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelect.invoke(this.$group.dimension, this.$option.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
