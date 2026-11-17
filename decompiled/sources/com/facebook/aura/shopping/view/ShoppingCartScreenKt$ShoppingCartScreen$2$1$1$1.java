package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingCartScreenKt$ShoppingCartScreen$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ShoppingSecondaryAction $link;
    public final /* synthetic */ G0U<String, Unit> $onOpenProviderCart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingCartScreenKt$ShoppingCartScreen$2$1$1$1(G0U<? super String, Unit> g0u, ShoppingSecondaryAction shoppingSecondaryAction) {
        super(0);
        this.$onOpenProviderCart = g0u;
        this.$link = shoppingSecondaryAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpenProviderCart.invoke(this.$link.url);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
