package com.facebook.aura.shopping.view;

import X.C7438Evz;
import com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ShoppingCartScreenHostKt$ShoppingCartScreenHost$4$1 extends C7438Evz implements Function0<Unit> {
    public ShoppingCartScreenHostKt$ShoppingCartScreenHost$4$1(Object obj) {
        super(0, obj, ShoppingCartViewModel.class, "onCheckout", "onCheckout()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ShoppingCartViewModel) this.receiver).onCheckout();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
