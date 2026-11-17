package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$requestBack$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isTransitioning;
    public final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$requestBack$1$1(boolean z, Function0<Unit> function0) {
        super(0);
        this.$isTransitioning = z;
        this.$onBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isTransitioning) {
            return;
        }
        this.$onBack.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
