package com.facebook.aura.subscription.view;

import X.C7438Evz;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$10$1$2$1 extends C7438Evz implements Function0<Unit> {
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$10$1$2$1(Object obj) {
        super(0, obj, AuraBuyCreditsViewModel.class, "loadCreditProducts", "loadCreditProducts()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraBuyCreditsViewModel) this.receiver).loadCreditProducts();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
