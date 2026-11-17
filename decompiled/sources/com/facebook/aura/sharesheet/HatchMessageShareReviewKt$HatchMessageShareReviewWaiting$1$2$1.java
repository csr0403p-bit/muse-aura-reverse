package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageShareReviewKt$HatchMessageShareReviewWaiting$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onCancel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareReviewKt$HatchMessageShareReviewWaiting$1$2$1(Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(0);
        this.$onCancel = function0;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCancel.invoke();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
