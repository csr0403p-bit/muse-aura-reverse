package com.facebook.aura.shopping.view;

import X.C7438Evz;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$3$1 extends C7438Evz implements Function0<Unit> {
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$3$1(Object obj) {
        super(0, obj, ShoppingProductDetailsViewModel.class, "onAddToCartDismissHandled", "onAddToCartDismissHandled()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ShoppingProductDetailsViewModel) this.receiver).onAddToCartDismissHandled();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
