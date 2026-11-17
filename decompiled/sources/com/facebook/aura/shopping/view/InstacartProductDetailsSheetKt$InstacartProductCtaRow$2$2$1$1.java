package com.facebook.aura.shopping.view;

import X.C7438Evz;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$2$1$1 extends C7438Evz implements Function0<Unit> {
    public InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$2$1$1(Object obj) {
        super(0, obj, InstacartProductDetailsViewModel.class, "onAddToCartTapped", "onAddToCartTapped()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InstacartProductDetailsViewModel) this.receiver).onAddToCartTapped();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
