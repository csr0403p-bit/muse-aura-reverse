package com.facebook.aura.subscription.view;

import X.C7438Evz;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$11$1 extends C7438Evz implements Function0<Unit> {
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$11$1(Object obj) {
        super(0, obj, AuraSubscriptionUsageViewModel.class, "refresh", "refresh()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraSubscriptionUsageViewModel) this.receiver).refresh();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
