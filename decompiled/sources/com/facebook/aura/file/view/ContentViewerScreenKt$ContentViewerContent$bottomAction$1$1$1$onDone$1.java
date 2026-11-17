package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$bottomAction$1$1$1$onDone$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentRequestBack$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContentViewerScreenKt$ContentViewerContent$bottomAction$1$1$1$onDone$1(C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$currentRequestBack$delegate = c1bo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C1BO.A0D(this.$currentRequestBack$delegate);
    }
}
