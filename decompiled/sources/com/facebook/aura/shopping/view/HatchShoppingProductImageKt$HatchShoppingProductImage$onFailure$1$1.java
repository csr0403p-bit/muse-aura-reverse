package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchShoppingProductImageKt$HatchShoppingProductImage$onFailure$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ProductImageRecovery $recovery;
    public final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingProductImageKt$HatchShoppingProductImage$onFailure$1$1(ProductImageRecovery productImageRecovery, String str) {
        super(0);
        this.$recovery = productImageRecovery;
        this.$uri = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$recovery.onLoadFailed.invoke(this.$uri);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
