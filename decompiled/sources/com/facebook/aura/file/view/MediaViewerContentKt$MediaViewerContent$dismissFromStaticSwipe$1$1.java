package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$dismissFromStaticSwipe$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss;
    public final /* synthetic */ Function0<Unit> $logSwipeDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$dismissFromStaticSwipe$1$1(Function0<Unit> function0, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$logSwipeDismiss = function0;
        this.$currentOnDismiss = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logSwipeDismiss.invoke();
        C1BO.A0D(this.$currentOnDismiss);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
