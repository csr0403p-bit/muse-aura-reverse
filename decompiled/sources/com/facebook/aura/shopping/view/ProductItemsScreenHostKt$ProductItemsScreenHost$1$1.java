package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.viewmodel.ProductItemsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ProductItemsScreenHostKt$ProductItemsScreenHost$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ProductItemsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductItemsScreenHostKt$ProductItemsScreenHost$1$1(ProductItemsViewModel productItemsViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = productItemsViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onCloseTapped();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
