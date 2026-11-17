package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$state$1$6 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDragStarted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListKt$rememberReorderableLazyListState$state$1$6(C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$currentOnDragStarted$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0 function0A0A = C1BO.A0A(this.$currentOnDragStarted$delegate);
        if (function0A0A != null) {
            function0A0A.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
